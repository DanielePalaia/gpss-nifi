# Summary
This software is intended to be a simple (non production ready) processor for apache nifi server, using Greenplum Streaming Service functionalities. </br>
It is written in Java and it uses the following technologies: Apache nifi, java, GRPC, Greenplum GPSS. </br>
At the moment it is just supportin .json. The processor is receiving .json entries from a nifi relashion and ingest a Greenplum table.</br> 

The following reading can help you to better understand the software:

**Apache Nifi:** </br>
https://nifi.apache.org/ </br>
**GRPC:**  </br>
https://grpc.io/ </br>
**Greenplum GPSS:**</br>
https://gpdb.docs.pivotal.io/5160/greenplum-stream/overview.html</br>
https://gpdb.docs.pivotal.io/5160/greenplum-stream/api/dev_client.html</br>

These are the steps to run the software:

## Prerequisites

1. **Activate the gpss extension on the greenplum database you want to use (for example test)**
   
      ```
      test=# CREATE EXTENSION gpss;
      ```
   
2. **Create the Greenplum table to be ingested**

      The table can be generic with any number of coloumns and data types. The important thing is that the input to ingest         will be coherent with the table definition. Let's try this table as example:
   
      ```
      test=# create table test(id varchar (data json);
      ```
   
3. **Run a gpss server with the right configuration (ex):**
  
      gpss ./gpsscfg1.json --log-dir ./gpsslogs
      where gpsscfg1.json 
  
      ```
      {
         "ListenAddress": {
            "Host": "",
            "Port": 8085,
            "SSL": false
         },
         "Gpfdist": {
            "Host": "",
            "Port": 8086
         }
      }
      ```

4. **download, install and start nifi**

![Screenshot](./pics/fourth.png)
  
## Deploy and test the nifi processor

1. **Copy the .nar file** </br>

The nifi processor is written in Java. Maven will automatically create a .nar file to be deployed in nifi.
Copy the .nar file in ./nifi-gpss-nar/target/nifi-gpss-nar-1.0-SNAPSHOT.nar inside your nifi lib directory

![Screenshot](./pics/second.png)
</br> 
![Screenshot](./pics/third.png)

2. **restart nifi** </br>

Once copied restart nifi


3. **insert the processor in the nifi UI** </br>

![Screenshot](./pics/five.png)


4. **Setting property of the processor**  </br>   

![Screenshot](./pics/six.png)
    

5. **Add a GetFile processor as a tester** </br> 

![Screenshot](./pics/seven.png)
</br> 
![Screenshot](./pics/eight.png)

5. **Create a relashionship** </br> 

![Screenshot](./pics/ten.png)

6. **Start the two processors** </br> 

![Screenshot](./pics/twenty.png)


7. **Put a populated json file inside the test directory you specified in the Get file** </br>  

![Screenshot](./pics/eleven.png)
![Screenshot](./pics/twelve.png)


