package com.ruoyi.platform.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: train.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrainGrpc {

  private TrainGrpc() {}

  public static final String SERVICE_NAME = "proto.Train";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<StepRequest,
      StepResponse> getGetStepMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStep",
      requestType = StepRequest.class,
      responseType = StepResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<StepRequest,
      StepResponse> getGetStepMethod() {
    io.grpc.MethodDescriptor<StepRequest, StepResponse> getGetStepMethod;
    if ((getGetStepMethod = TrainGrpc.getGetStepMethod) == null) {
      synchronized (TrainGrpc.class) {
        if ((getGetStepMethod = TrainGrpc.getGetStepMethod) == null) {
          TrainGrpc.getGetStepMethod = getGetStepMethod =
              io.grpc.MethodDescriptor.<StepRequest, StepResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStep"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StepRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StepResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrainMethodDescriptorSupplier("GetStep"))
              .build();
        }
      }
    }
    return getGetStepMethod;
  }

  private static volatile io.grpc.MethodDescriptor<WlossRequest,
      WlossResponse> getGetWlossMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWloss",
      requestType = WlossRequest.class,
      responseType = WlossResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<WlossRequest,
      WlossResponse> getGetWlossMethod() {
    io.grpc.MethodDescriptor<WlossRequest, WlossResponse> getGetWlossMethod;
    if ((getGetWlossMethod = TrainGrpc.getGetWlossMethod) == null) {
      synchronized (TrainGrpc.class) {
        if ((getGetWlossMethod = TrainGrpc.getGetWlossMethod) == null) {
          TrainGrpc.getGetWlossMethod = getGetWlossMethod =
              io.grpc.MethodDescriptor.<WlossRequest, WlossResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWloss"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WlossRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WlossResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrainMethodDescriptorSupplier("GetWloss"))
              .build();
        }
      }
    }
    return getGetWlossMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TeacheraccRequest,
      TeacheraccResponse> getGetTeacheraccMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTeacheracc",
      requestType = TeacheraccRequest.class,
      responseType = TeacheraccResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TeacheraccRequest,
      TeacheraccResponse> getGetTeacheraccMethod() {
    io.grpc.MethodDescriptor<TeacheraccRequest, TeacheraccResponse> getGetTeacheraccMethod;
    if ((getGetTeacheraccMethod = TrainGrpc.getGetTeacheraccMethod) == null) {
      synchronized (TrainGrpc.class) {
        if ((getGetTeacheraccMethod = TrainGrpc.getGetTeacheraccMethod) == null) {
          TrainGrpc.getGetTeacheraccMethod = getGetTeacheraccMethod =
              io.grpc.MethodDescriptor.<TeacheraccRequest, TeacheraccResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTeacheracc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TeacheraccRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TeacheraccResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrainMethodDescriptorSupplier("GetTeacheracc"))
              .build();
        }
      }
    }
    return getGetTeacheraccMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrainStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrainStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrainStub>() {
        @Override
        public TrainStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrainStub(channel, callOptions);
        }
      };
    return TrainStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrainBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrainBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrainBlockingStub>() {
        @Override
        public TrainBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrainBlockingStub(channel, callOptions);
        }
      };
    return TrainBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrainFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrainFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrainFutureStub>() {
        @Override
        public TrainFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrainFutureStub(channel, callOptions);
        }
      };
    return TrainFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TrainImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStep(StepRequest request,
                        io.grpc.stub.StreamObserver<StepResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStepMethod(), responseObserver);
    }

    /**
     */
    public void getWloss(WlossRequest request,
                         io.grpc.stub.StreamObserver<WlossResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWlossMethod(), responseObserver);
    }

    /**
     */
    public void getTeacheracc(TeacheraccRequest request,
                              io.grpc.stub.StreamObserver<TeacheraccResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeacheraccMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStepMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                StepRequest,
                StepResponse>(
                  this, METHODID_GET_STEP)))
          .addMethod(
            getGetWlossMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                WlossRequest,
                WlossResponse>(
                  this, METHODID_GET_WLOSS)))
          .addMethod(
            getGetTeacheraccMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TeacheraccRequest,
                TeacheraccResponse>(
                  this, METHODID_GET_TEACHERACC)))
          .build();
    }
  }

  /**
   */
  public static final class TrainStub extends io.grpc.stub.AbstractAsyncStub<TrainStub> {
    private TrainStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TrainStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrainStub(channel, callOptions);
    }

    /**
     */
    public void getStep(StepRequest request,
                        io.grpc.stub.StreamObserver<StepResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStepMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWloss(WlossRequest request,
                         io.grpc.stub.StreamObserver<WlossResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWlossMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeacheracc(TeacheraccRequest request,
                              io.grpc.stub.StreamObserver<TeacheraccResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTeacheraccMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrainBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrainBlockingStub> {
    private TrainBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TrainBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrainBlockingStub(channel, callOptions);
    }

    /**
     */
    public StepResponse getStep(StepRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStepMethod(), getCallOptions(), request);
    }

    /**
     */
    public WlossResponse getWloss(WlossRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWlossMethod(), getCallOptions(), request);
    }

    /**
     */
    public TeacheraccResponse getTeacheracc(TeacheraccRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeacheraccMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrainFutureStub extends io.grpc.stub.AbstractFutureStub<TrainFutureStub> {
    private TrainFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TrainFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrainFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StepResponse> getStep(
        StepRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStepMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<WlossResponse> getWloss(
        WlossRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWlossMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TeacheraccResponse> getTeacheracc(
        TeacheraccRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTeacheraccMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STEP = 0;
  private static final int METHODID_GET_WLOSS = 1;
  private static final int METHODID_GET_TEACHERACC = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrainImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrainImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STEP:
          serviceImpl.getStep((StepRequest) request,
              (io.grpc.stub.StreamObserver<StepResponse>) responseObserver);
          break;
        case METHODID_GET_WLOSS:
          serviceImpl.getWloss((WlossRequest) request,
              (io.grpc.stub.StreamObserver<WlossResponse>) responseObserver);
          break;
        case METHODID_GET_TEACHERACC:
          serviceImpl.getTeacheracc((TeacheraccRequest) request,
              (io.grpc.stub.StreamObserver<TeacheraccResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TrainBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrainBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return TrainProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Train");
    }
  }

  private static final class TrainFileDescriptorSupplier
      extends TrainBaseDescriptorSupplier {
    TrainFileDescriptorSupplier() {}
  }

  private static final class TrainMethodDescriptorSupplier
      extends TrainBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrainMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TrainGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrainFileDescriptorSupplier())
              .addMethod(getGetStepMethod())
              .addMethod(getGetWlossMethod())
              .addMethod(getGetTeacheraccMethod())
              .build();
        }
      }
    }
    return result;
  }
}
