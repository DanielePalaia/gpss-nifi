package api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: gpss.proto")
public final class GpssGrpc {

  private GpssGrpc() {}

  public static final String SERVICE_NAME = "api.Gpss";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.ConnectRequest,
      api.Session> getConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Connect",
      requestType = api.ConnectRequest.class,
      responseType = api.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.ConnectRequest,
      api.Session> getConnectMethod() {
    io.grpc.MethodDescriptor<api.ConnectRequest, api.Session> getConnectMethod;
    if ((getConnectMethod = GpssGrpc.getConnectMethod) == null) {
      synchronized (GpssGrpc.class) {
        if ((getConnectMethod = GpssGrpc.getConnectMethod) == null) {
          GpssGrpc.getConnectMethod = getConnectMethod =
              io.grpc.MethodDescriptor.<api.ConnectRequest, api.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Connect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.ConnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Session.getDefaultInstance()))
              .setSchemaDescriptor(new GpssMethodDescriptorSupplier("Connect"))
              .build();
        }
      }
    }
    return getConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.Session,
      com.google.protobuf.Empty> getDisconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Disconnect",
      requestType = api.Session.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.Session,
      com.google.protobuf.Empty> getDisconnectMethod() {
    io.grpc.MethodDescriptor<api.Session, com.google.protobuf.Empty> getDisconnectMethod;
    if ((getDisconnectMethod = GpssGrpc.getDisconnectMethod) == null) {
      synchronized (GpssGrpc.class) {
        if ((getDisconnectMethod = GpssGrpc.getDisconnectMethod) == null) {
          GpssGrpc.getDisconnectMethod = getDisconnectMethod =
              io.grpc.MethodDescriptor.<api.Session, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Disconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Session.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GpssMethodDescriptorSupplier("Disconnect"))
              .build();
        }
      }
    }
    return getDisconnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.OpenRequest,
      com.google.protobuf.Empty> getOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Open",
      requestType = api.OpenRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.OpenRequest,
      com.google.protobuf.Empty> getOpenMethod() {
    io.grpc.MethodDescriptor<api.OpenRequest, com.google.protobuf.Empty> getOpenMethod;
    if ((getOpenMethod = GpssGrpc.getOpenMethod) == null) {
      synchronized (GpssGrpc.class) {
        if ((getOpenMethod = GpssGrpc.getOpenMethod) == null) {
          GpssGrpc.getOpenMethod = getOpenMethod =
              io.grpc.MethodDescriptor.<api.OpenRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Open"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.OpenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GpssMethodDescriptorSupplier("Open"))
              .build();
        }
      }
    }
    return getOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.WriteRequest,
      com.google.protobuf.Empty> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = api.WriteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.WriteRequest,
      com.google.protobuf.Empty> getWriteMethod() {
    io.grpc.MethodDescriptor<api.WriteRequest, com.google.protobuf.Empty> getWriteMethod;
    if ((getWriteMethod = GpssGrpc.getWriteMethod) == null) {
      synchronized (GpssGrpc.class) {
        if ((getWriteMethod = GpssGrpc.getWriteMethod) == null) {
          GpssGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<api.WriteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.WriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GpssMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.CloseRequest,
      api.TransferStats> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = api.CloseRequest.class,
      responseType = api.TransferStats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.CloseRequest,
      api.TransferStats> getCloseMethod() {
    io.grpc.MethodDescriptor<api.CloseRequest, api.TransferStats> getCloseMethod;
    if ((getCloseMethod = GpssGrpc.getCloseMethod) == null) {
      synchronized (GpssGrpc.class) {
        if ((getCloseMethod = GpssGrpc.getCloseMethod) == null) {
          GpssGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<api.CloseRequest, api.TransferStats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.TransferStats.getDefaultInstance()))
              .setSchemaDescriptor(new GpssMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.ListSchemaRequest,
      api.Schemas> getListSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSchema",
      requestType = api.ListSchemaRequest.class,
      responseType = api.Schemas.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.ListSchemaRequest,
      api.Schemas> getListSchemaMethod() {
    io.grpc.MethodDescriptor<api.ListSchemaRequest, api.Schemas> getListSchemaMethod;
    if ((getListSchemaMethod = GpssGrpc.getListSchemaMethod) == null) {
      synchronized (GpssGrpc.class) {
        if ((getListSchemaMethod = GpssGrpc.getListSchemaMethod) == null) {
          GpssGrpc.getListSchemaMethod = getListSchemaMethod =
              io.grpc.MethodDescriptor.<api.ListSchemaRequest, api.Schemas>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.ListSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Schemas.getDefaultInstance()))
              .setSchemaDescriptor(new GpssMethodDescriptorSupplier("ListSchema"))
              .build();
        }
      }
    }
    return getListSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.ListTableRequest,
      api.Tables> getListTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTable",
      requestType = api.ListTableRequest.class,
      responseType = api.Tables.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.ListTableRequest,
      api.Tables> getListTableMethod() {
    io.grpc.MethodDescriptor<api.ListTableRequest, api.Tables> getListTableMethod;
    if ((getListTableMethod = GpssGrpc.getListTableMethod) == null) {
      synchronized (GpssGrpc.class) {
        if ((getListTableMethod = GpssGrpc.getListTableMethod) == null) {
          GpssGrpc.getListTableMethod = getListTableMethod =
              io.grpc.MethodDescriptor.<api.ListTableRequest, api.Tables>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.ListTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tables.getDefaultInstance()))
              .setSchemaDescriptor(new GpssMethodDescriptorSupplier("ListTable"))
              .build();
        }
      }
    }
    return getListTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.DescribeTableRequest,
      api.Columns> getDescribeTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeTable",
      requestType = api.DescribeTableRequest.class,
      responseType = api.Columns.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.DescribeTableRequest,
      api.Columns> getDescribeTableMethod() {
    io.grpc.MethodDescriptor<api.DescribeTableRequest, api.Columns> getDescribeTableMethod;
    if ((getDescribeTableMethod = GpssGrpc.getDescribeTableMethod) == null) {
      synchronized (GpssGrpc.class) {
        if ((getDescribeTableMethod = GpssGrpc.getDescribeTableMethod) == null) {
          GpssGrpc.getDescribeTableMethod = getDescribeTableMethod =
              io.grpc.MethodDescriptor.<api.DescribeTableRequest, api.Columns>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.DescribeTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Columns.getDefaultInstance()))
              .setSchemaDescriptor(new GpssMethodDescriptorSupplier("DescribeTable"))
              .build();
        }
      }
    }
    return getDescribeTableMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GpssStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpssStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpssStub>() {
        @java.lang.Override
        public GpssStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpssStub(channel, callOptions);
        }
      };
    return GpssStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GpssBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpssBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpssBlockingStub>() {
        @java.lang.Override
        public GpssBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpssBlockingStub(channel, callOptions);
        }
      };
    return GpssBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GpssFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpssFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpssFutureStub>() {
        @java.lang.Override
        public GpssFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpssFutureStub(channel, callOptions);
        }
      };
    return GpssFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GpssImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Establish a connection to Greenplum Database; returns a Session object
     * </pre>
     */
    public void connect(api.ConnectRequest request,
        io.grpc.stub.StreamObserver<api.Session> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disconnect, freeing all resources allocated for a session
     * </pre>
     */
    public void disconnect(api.Session request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDisconnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Prepare and open a table for write
     * </pre>
     */
    public void open(api.OpenRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Write data to table
     * </pre>
     */
    public void write(api.WriteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close a write operation
     * </pre>
     */
    public void close(api.CloseRequest request,
        io.grpc.stub.StreamObserver<api.TransferStats> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all available schemas in a database
     * </pre>
     */
    public void listSchema(api.ListSchemaRequest request,
        io.grpc.stub.StreamObserver<api.Schemas> responseObserver) {
      asyncUnimplementedUnaryCall(getListSchemaMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all tables and views in a schema
     * </pre>
     */
    public void listTable(api.ListTableRequest request,
        io.grpc.stub.StreamObserver<api.Tables> responseObserver) {
      asyncUnimplementedUnaryCall(getListTableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Decribe table metadata(column name and column type)
     * </pre>
     */
    public void describeTable(api.DescribeTableRequest request,
        io.grpc.stub.StreamObserver<api.Columns> responseObserver) {
      asyncUnimplementedUnaryCall(getDescribeTableMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConnectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.ConnectRequest,
                api.Session>(
                  this, METHODID_CONNECT)))
          .addMethod(
            getDisconnectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.Session,
                com.google.protobuf.Empty>(
                  this, METHODID_DISCONNECT)))
          .addMethod(
            getOpenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.OpenRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_OPEN)))
          .addMethod(
            getWriteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.WriteRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_WRITE)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.CloseRequest,
                api.TransferStats>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getListSchemaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.ListSchemaRequest,
                api.Schemas>(
                  this, METHODID_LIST_SCHEMA)))
          .addMethod(
            getListTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.ListTableRequest,
                api.Tables>(
                  this, METHODID_LIST_TABLE)))
          .addMethod(
            getDescribeTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.DescribeTableRequest,
                api.Columns>(
                  this, METHODID_DESCRIBE_TABLE)))
          .build();
    }
  }

  /**
   */
  public static final class GpssStub extends io.grpc.stub.AbstractAsyncStub<GpssStub> {
    private GpssStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpssStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpssStub(channel, callOptions);
    }

    /**
     * <pre>
     * Establish a connection to Greenplum Database; returns a Session object
     * </pre>
     */
    public void connect(api.ConnectRequest request,
        io.grpc.stub.StreamObserver<api.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disconnect, freeing all resources allocated for a session
     * </pre>
     */
    public void disconnect(api.Session request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Prepare and open a table for write
     * </pre>
     */
    public void open(api.OpenRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Write data to table
     * </pre>
     */
    public void write(api.WriteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close a write operation
     * </pre>
     */
    public void close(api.CloseRequest request,
        io.grpc.stub.StreamObserver<api.TransferStats> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all available schemas in a database
     * </pre>
     */
    public void listSchema(api.ListSchemaRequest request,
        io.grpc.stub.StreamObserver<api.Schemas> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all tables and views in a schema
     * </pre>
     */
    public void listTable(api.ListTableRequest request,
        io.grpc.stub.StreamObserver<api.Tables> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Decribe table metadata(column name and column type)
     * </pre>
     */
    public void describeTable(api.DescribeTableRequest request,
        io.grpc.stub.StreamObserver<api.Columns> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDescribeTableMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GpssBlockingStub extends io.grpc.stub.AbstractBlockingStub<GpssBlockingStub> {
    private GpssBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpssBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpssBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Establish a connection to Greenplum Database; returns a Session object
     * </pre>
     */
    public api.Session connect(api.ConnectRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disconnect, freeing all resources allocated for a session
     * </pre>
     */
    public com.google.protobuf.Empty disconnect(api.Session request) {
      return blockingUnaryCall(
          getChannel(), getDisconnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Prepare and open a table for write
     * </pre>
     */
    public com.google.protobuf.Empty open(api.OpenRequest request) {
      return blockingUnaryCall(
          getChannel(), getOpenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Write data to table
     * </pre>
     */
    public com.google.protobuf.Empty write(api.WriteRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close a write operation
     * </pre>
     */
    public api.TransferStats close(api.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all available schemas in a database
     * </pre>
     */
    public api.Schemas listSchema(api.ListSchemaRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSchemaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all tables and views in a schema
     * </pre>
     */
    public api.Tables listTable(api.ListTableRequest request) {
      return blockingUnaryCall(
          getChannel(), getListTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Decribe table metadata(column name and column type)
     * </pre>
     */
    public api.Columns describeTable(api.DescribeTableRequest request) {
      return blockingUnaryCall(
          getChannel(), getDescribeTableMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GpssFutureStub extends io.grpc.stub.AbstractFutureStub<GpssFutureStub> {
    private GpssFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpssFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpssFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Establish a connection to Greenplum Database; returns a Session object
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.Session> connect(
        api.ConnectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disconnect, freeing all resources allocated for a session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> disconnect(
        api.Session request) {
      return futureUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Prepare and open a table for write
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> open(
        api.OpenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Write data to table
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> write(
        api.WriteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close a write operation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.TransferStats> close(
        api.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all available schemas in a database
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.Schemas> listSchema(
        api.ListSchemaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSchemaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all tables and views in a schema
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.Tables> listTable(
        api.ListTableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Decribe table metadata(column name and column type)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.Columns> describeTable(
        api.DescribeTableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDescribeTableMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONNECT = 0;
  private static final int METHODID_DISCONNECT = 1;
  private static final int METHODID_OPEN = 2;
  private static final int METHODID_WRITE = 3;
  private static final int METHODID_CLOSE = 4;
  private static final int METHODID_LIST_SCHEMA = 5;
  private static final int METHODID_LIST_TABLE = 6;
  private static final int METHODID_DESCRIBE_TABLE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GpssImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GpssImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONNECT:
          serviceImpl.connect((api.ConnectRequest) request,
              (io.grpc.stub.StreamObserver<api.Session>) responseObserver);
          break;
        case METHODID_DISCONNECT:
          serviceImpl.disconnect((api.Session) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_OPEN:
          serviceImpl.open((api.OpenRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_WRITE:
          serviceImpl.write((api.WriteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((api.CloseRequest) request,
              (io.grpc.stub.StreamObserver<api.TransferStats>) responseObserver);
          break;
        case METHODID_LIST_SCHEMA:
          serviceImpl.listSchema((api.ListSchemaRequest) request,
              (io.grpc.stub.StreamObserver<api.Schemas>) responseObserver);
          break;
        case METHODID_LIST_TABLE:
          serviceImpl.listTable((api.ListTableRequest) request,
              (io.grpc.stub.StreamObserver<api.Tables>) responseObserver);
          break;
        case METHODID_DESCRIBE_TABLE:
          serviceImpl.describeTable((api.DescribeTableRequest) request,
              (io.grpc.stub.StreamObserver<api.Columns>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GpssBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GpssBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return api.GpssOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Gpss");
    }
  }

  private static final class GpssFileDescriptorSupplier
      extends GpssBaseDescriptorSupplier {
    GpssFileDescriptorSupplier() {}
  }

  private static final class GpssMethodDescriptorSupplier
      extends GpssBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GpssMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GpssGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GpssFileDescriptorSupplier())
              .addMethod(getConnectMethod())
              .addMethod(getDisconnectMethod())
              .addMethod(getOpenMethod())
              .addMethod(getWriteMethod())
              .addMethod(getCloseMethod())
              .addMethod(getListSchemaMethod())
              .addMethod(getListTableMethod())
              .addMethod(getDescribeTableMethod())
              .build();
        }
      }
    }
    return result;
  }
}
