package com.example.iippr8.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserDataServiceGrpc {

  private UserDataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "UserDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Service.UserData,
      Service.StringResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = Service.UserData.class,
      responseType = Service.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Service.UserData,
      Service.StringResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<Service.UserData, Service.StringResponse> getRegisterMethod;
    if ((getRegisterMethod = UserDataServiceGrpc.getRegisterMethod) == null) {
      synchronized (UserDataServiceGrpc.class) {
        if ((getRegisterMethod = UserDataServiceGrpc.getRegisterMethod) == null) {
          UserDataServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<Service.UserData, Service.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service.UserData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service.StringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserDataServiceMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Service.UserData,
      Service.StringResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = Service.UserData.class,
      responseType = Service.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Service.UserData,
      Service.StringResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<Service.UserData, Service.StringResponse> getLoginMethod;
    if ((getLoginMethod = UserDataServiceGrpc.getLoginMethod) == null) {
      synchronized (UserDataServiceGrpc.class) {
        if ((getLoginMethod = UserDataServiceGrpc.getLoginMethod) == null) {
          UserDataServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<Service.UserData, Service.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service.UserData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Service.StringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserDataServiceMethodDescriptorSupplier("Login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserDataServiceStub>() {
        @java.lang.Override
        public UserDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserDataServiceStub(channel, callOptions);
        }
      };
    return UserDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserDataServiceBlockingStub>() {
        @java.lang.Override
        public UserDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserDataServiceBlockingStub(channel, callOptions);
        }
      };
    return UserDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserDataServiceFutureStub>() {
        @java.lang.Override
        public UserDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserDataServiceFutureStub(channel, callOptions);
        }
      };
    return UserDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void register(Service.UserData request,
        io.grpc.stub.StreamObserver<Service.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    default void login(Service.UserData request,
        io.grpc.stub.StreamObserver<Service.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserDataService.
   */
  public static abstract class UserDataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserDataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserDataService.
   */
  public static final class UserDataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserDataServiceStub> {
    private UserDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserDataServiceStub(channel, callOptions);
    }

    /**
     */
    public void register(Service.UserData request,
        io.grpc.stub.StreamObserver<Service.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(Service.UserData request,
        io.grpc.stub.StreamObserver<Service.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserDataService.
   */
  public static final class UserDataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserDataServiceBlockingStub> {
    private UserDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserDataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public Service.StringResponse register(Service.UserData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public Service.StringResponse login(Service.UserData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserDataService.
   */
  public static final class UserDataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserDataServiceFutureStub> {
    private UserDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserDataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Service.StringResponse> register(
        Service.UserData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Service.StringResponse> login(
        Service.UserData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_LOGIN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((Service.UserData) request,
              (io.grpc.stub.StreamObserver<Service.StringResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((Service.UserData) request,
              (io.grpc.stub.StreamObserver<Service.StringResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Service.UserData,
              Service.StringResponse>(
                service, METHODID_REGISTER)))
        .addMethod(
          getLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Service.UserData,
              Service.StringResponse>(
                service, METHODID_LOGIN)))
        .build();
  }

  private static abstract class UserDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserDataService");
    }
  }

  private static final class UserDataServiceFileDescriptorSupplier
      extends UserDataServiceBaseDescriptorSupplier {
    UserDataServiceFileDescriptorSupplier() {}
  }

  private static final class UserDataServiceMethodDescriptorSupplier
      extends UserDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserDataServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserDataServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}