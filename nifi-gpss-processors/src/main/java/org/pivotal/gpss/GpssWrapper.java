package org.pivotal.gpss;

import api.*;
import java.util.concurrent.TimeUnit;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;


public class GpssWrapper {

    private String gpssHost;
    private int gpssPort;
    private GpssGrpc.GpssBlockingStub bStub = null;
    private Session mSession = null;
    private String gpMasterHost;
    private Integer gpMasterPort;
    private String gpRoleName;
    private String gpPasswd;
    private String dbName;
    private String schemaName;
    private String tableName;

    public GpssWrapper(String gpssHost, int gpssPort, String gpMasterHost, Integer gpMasterPort, String gpRoleName, String gpPasswd, String dbName, String tableName, String schemaName)    {

        this.gpssHost = gpssHost;
        this.gpssPort = gpssPort;
        this.gpMasterHost = gpMasterHost;
        this.gpMasterPort = gpMasterPort;
        this.gpRoleName =  gpRoleName;
        this.gpPasswd = gpPasswd;
        this.dbName = dbName;
        this.tableName = tableName;
        this.schemaName = schemaName;

    }


    public void connectToGrpc()      {

        ManagedChannel channel = null;


        try {
            // connect to GPSS gRPC service instance; create a channel and a blocking stub
            channel = ManagedChannelBuilder.forAddress(gpssHost, gpssPort)
                    .usePlaintext()
                    .build();
            bStub = GpssGrpc.newBlockingStub(channel);

            // (placeholder) do stuff here

            // shutdown the channel
            //channel.shutdown().awaitTermination(7, TimeUnit.SECONDS);

        } catch (Exception e) {

        }


    }
    public void connectToGreenplum() {



        // create a connect request builder
        ConnectRequest connReq = ConnectRequest.newBuilder()
                .setHost(gpMasterHost)
                .setPort(gpMasterPort)
                .setUsername(gpRoleName)
                .setPassword(gpPasswd)
                .setDB(dbName)
                .setUseSSL(false)
                .build();

        // use the blocking stub to call the Connect service
        mSession = bStub.connect(connReq);

        // (placeholder) do greenplum stuff here

        // use the blocking stub to call the Disconnect service
        //bStub.disconnect(mSession);

    }

    public void prepareForWriting()    {
        Integer errLimit = 25;
        Integer errPct = 25;
        // create an insert option builder
        InsertOption iOpt = InsertOption.newBuilder()
                .setErrorLimitCount(errLimit)
                .setErrorLimitPercentage(errPct)
                .setTruncateTable(false)
                .addInsertColumns("data")
                .build();

        // create an open request builder
        OpenRequest oReq = OpenRequest.newBuilder()
                .setSession(mSession)
                .setSchemaName(schemaName)
                .setTableName(tableName)
                .setTimeout(5)
                .setInsertOption(iOpt)
                .build();

        // use the blocking stub to call the Open service; it returns nothing
        bStub.open(oReq);

    }

    public void writeIn() {
        // create an array of rows
        ArrayList<RowData> rows = new ArrayList<>();
        for (int row = 0; row < 1; row++) {
            // create a row builder
            api.Row.Builder builder = api.Row.newBuilder();

            // create builders for each column, in order, and set values - text, int, text
            api.DBValue.Builder colbuilder1 = api.DBValue.newBuilder();
            colbuilder1.setStringValue("xxx");
            builder.addColumns(colbuilder1.build());

            // build the row
            RowData.Builder rowbuilder = RowData.newBuilder().setData(builder.build().toByteString());

            // add the row
            rows.add(rowbuilder.build());
        }

        // create a write request builder
        WriteRequest wReq = WriteRequest.newBuilder()
                .setSession(mSession)
                .addAllRows(rows)
                .build();

        // use the blocking stub to call the Write service; it returns nothing
        bStub.write(wReq);

    }

    public void close()   {
        // create a close request builder
        TransferStats tStats = null;
        CloseRequest cReq = CloseRequest.newBuilder()
                .setSession(mSession)
                .build();
    }



    /* Maybe not needed... */
    /*
    public void getTableDefinition()     {
        // the name of the first table returned in the ListTable code excerpt
        String tableName = tblNameList.get(0);

        // create a describe table request builder
        DescribeTableRequest dtReq = DescribeTableRequest.newBuilder()
                .setSession(mSession)
                .setSchemaName(schemaName)
                .setTableName(tableName)
                .build();

        // use the blocking stub to call the DescribeTable service
        List<ColumnInfo> columnList = bStub.describeTable(dtReq).getColumnsList();

        // print the name and type of each column
        for(ColumnInfo ci : columnList) {
            String colname = ci.getName();
            String dbtype = ci.getDatabaseType();
            // display the column name and type to stdout
            System.out.println( "column " + colname + " type: " + dbtype );
        }
    }
    */






}