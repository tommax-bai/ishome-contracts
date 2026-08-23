package com.ishome.channel.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * channel-svc 对内 gRPC（v0 起步：发送 + 能力查询）。
 * 入站消息不走本服务 RPC 返回，channel-svc 翻译后调 design-svc 的 IngestMessage
 * 并发布 CloudEvents channel.message.received（见 events/registry.md）。
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ChannelServiceGrpc {

  private ChannelServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ishome.channel.v1.ChannelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ishome.channel.v1.SendMessageRequest,
      com.ishome.channel.v1.SendMessageResponse> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMessage",
      requestType = com.ishome.channel.v1.SendMessageRequest.class,
      responseType = com.ishome.channel.v1.SendMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ishome.channel.v1.SendMessageRequest,
      com.ishome.channel.v1.SendMessageResponse> getSendMessageMethod() {
    io.grpc.MethodDescriptor<com.ishome.channel.v1.SendMessageRequest, com.ishome.channel.v1.SendMessageResponse> getSendMessageMethod;
    if ((getSendMessageMethod = ChannelServiceGrpc.getSendMessageMethod) == null) {
      synchronized (ChannelServiceGrpc.class) {
        if ((getSendMessageMethod = ChannelServiceGrpc.getSendMessageMethod) == null) {
          ChannelServiceGrpc.getSendMessageMethod = getSendMessageMethod =
              io.grpc.MethodDescriptor.<com.ishome.channel.v1.SendMessageRequest, com.ishome.channel.v1.SendMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.channel.v1.SendMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.channel.v1.SendMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChannelServiceMethodDescriptorSupplier("SendMessage"))
              .build();
        }
      }
    }
    return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ishome.channel.v1.GetCapabilityRequest,
      com.ishome.channel.v1.GetCapabilityResponse> getGetCapabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCapability",
      requestType = com.ishome.channel.v1.GetCapabilityRequest.class,
      responseType = com.ishome.channel.v1.GetCapabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ishome.channel.v1.GetCapabilityRequest,
      com.ishome.channel.v1.GetCapabilityResponse> getGetCapabilityMethod() {
    io.grpc.MethodDescriptor<com.ishome.channel.v1.GetCapabilityRequest, com.ishome.channel.v1.GetCapabilityResponse> getGetCapabilityMethod;
    if ((getGetCapabilityMethod = ChannelServiceGrpc.getGetCapabilityMethod) == null) {
      synchronized (ChannelServiceGrpc.class) {
        if ((getGetCapabilityMethod = ChannelServiceGrpc.getGetCapabilityMethod) == null) {
          ChannelServiceGrpc.getGetCapabilityMethod = getGetCapabilityMethod =
              io.grpc.MethodDescriptor.<com.ishome.channel.v1.GetCapabilityRequest, com.ishome.channel.v1.GetCapabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCapability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.channel.v1.GetCapabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.channel.v1.GetCapabilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChannelServiceMethodDescriptorSupplier("GetCapability"))
              .build();
        }
      }
    }
    return getGetCapabilityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChannelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChannelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChannelServiceStub>() {
        @java.lang.Override
        public ChannelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChannelServiceStub(channel, callOptions);
        }
      };
    return ChannelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ChannelServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChannelServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChannelServiceBlockingV2Stub>() {
        @java.lang.Override
        public ChannelServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChannelServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ChannelServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChannelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChannelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChannelServiceBlockingStub>() {
        @java.lang.Override
        public ChannelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChannelServiceBlockingStub(channel, callOptions);
        }
      };
    return ChannelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChannelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChannelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChannelServiceFutureStub>() {
        @java.lang.Override
        public ChannelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChannelServiceFutureStub(channel, callOptions);
        }
      };
    return ChannelServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * channel-svc 对内 gRPC（v0 起步：发送 + 能力查询）。
   * 入站消息不走本服务 RPC 返回，channel-svc 翻译后调 design-svc 的 IngestMessage
   * 并发布 CloudEvents channel.message.received（见 events/registry.md）。
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 出站发送（design-svc / 其他服务 → channel-svc → 渠道 adapter）。
     * 渠道无主动发送窗口时由触达策略引擎决定排队或降级触达级渠道召回。
     * </pre>
     */
    default void sendMessage(com.ishome.channel.v1.SendMessageRequest request,
        io.grpc.stub.StreamObserver<com.ishome.channel.v1.SendMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查询某接入实例的能力声明
     * </pre>
     */
    default void getCapability(com.ishome.channel.v1.GetCapabilityRequest request,
        io.grpc.stub.StreamObserver<com.ishome.channel.v1.GetCapabilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCapabilityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ChannelService.
   * <pre>
   * channel-svc 对内 gRPC（v0 起步：发送 + 能力查询）。
   * 入站消息不走本服务 RPC 返回，channel-svc 翻译后调 design-svc 的 IngestMessage
   * 并发布 CloudEvents channel.message.received（见 events/registry.md）。
   * </pre>
   */
  public static abstract class ChannelServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ChannelServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ChannelService.
   * <pre>
   * channel-svc 对内 gRPC（v0 起步：发送 + 能力查询）。
   * 入站消息不走本服务 RPC 返回，channel-svc 翻译后调 design-svc 的 IngestMessage
   * 并发布 CloudEvents channel.message.received（见 events/registry.md）。
   * </pre>
   */
  public static final class ChannelServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ChannelServiceStub> {
    private ChannelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChannelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChannelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 出站发送（design-svc / 其他服务 → channel-svc → 渠道 adapter）。
     * 渠道无主动发送窗口时由触达策略引擎决定排队或降级触达级渠道召回。
     * </pre>
     */
    public void sendMessage(com.ishome.channel.v1.SendMessageRequest request,
        io.grpc.stub.StreamObserver<com.ishome.channel.v1.SendMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询某接入实例的能力声明
     * </pre>
     */
    public void getCapability(com.ishome.channel.v1.GetCapabilityRequest request,
        io.grpc.stub.StreamObserver<com.ishome.channel.v1.GetCapabilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCapabilityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ChannelService.
   * <pre>
   * channel-svc 对内 gRPC（v0 起步：发送 + 能力查询）。
   * 入站消息不走本服务 RPC 返回，channel-svc 翻译后调 design-svc 的 IngestMessage
   * 并发布 CloudEvents channel.message.received（见 events/registry.md）。
   * </pre>
   */
  public static final class ChannelServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ChannelServiceBlockingV2Stub> {
    private ChannelServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChannelServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChannelServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 出站发送（design-svc / 其他服务 → channel-svc → 渠道 adapter）。
     * 渠道无主动发送窗口时由触达策略引擎决定排队或降级触达级渠道召回。
     * </pre>
     */
    public com.ishome.channel.v1.SendMessageResponse sendMessage(com.ishome.channel.v1.SendMessageRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询某接入实例的能力声明
     * </pre>
     */
    public com.ishome.channel.v1.GetCapabilityResponse getCapability(com.ishome.channel.v1.GetCapabilityRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetCapabilityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ChannelService.
   * <pre>
   * channel-svc 对内 gRPC（v0 起步：发送 + 能力查询）。
   * 入站消息不走本服务 RPC 返回，channel-svc 翻译后调 design-svc 的 IngestMessage
   * 并发布 CloudEvents channel.message.received（见 events/registry.md）。
   * </pre>
   */
  public static final class ChannelServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ChannelServiceBlockingStub> {
    private ChannelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChannelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChannelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 出站发送（design-svc / 其他服务 → channel-svc → 渠道 adapter）。
     * 渠道无主动发送窗口时由触达策略引擎决定排队或降级触达级渠道召回。
     * </pre>
     */
    public com.ishome.channel.v1.SendMessageResponse sendMessage(com.ishome.channel.v1.SendMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询某接入实例的能力声明
     * </pre>
     */
    public com.ishome.channel.v1.GetCapabilityResponse getCapability(com.ishome.channel.v1.GetCapabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCapabilityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ChannelService.
   * <pre>
   * channel-svc 对内 gRPC（v0 起步：发送 + 能力查询）。
   * 入站消息不走本服务 RPC 返回，channel-svc 翻译后调 design-svc 的 IngestMessage
   * 并发布 CloudEvents channel.message.received（见 events/registry.md）。
   * </pre>
   */
  public static final class ChannelServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ChannelServiceFutureStub> {
    private ChannelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChannelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChannelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 出站发送（design-svc / 其他服务 → channel-svc → 渠道 adapter）。
     * 渠道无主动发送窗口时由触达策略引擎决定排队或降级触达级渠道召回。
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ishome.channel.v1.SendMessageResponse> sendMessage(
        com.ishome.channel.v1.SendMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询某接入实例的能力声明
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ishome.channel.v1.GetCapabilityResponse> getCapability(
        com.ishome.channel.v1.GetCapabilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCapabilityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;
  private static final int METHODID_GET_CAPABILITY = 1;

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
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((com.ishome.channel.v1.SendMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.ishome.channel.v1.SendMessageResponse>) responseObserver);
          break;
        case METHODID_GET_CAPABILITY:
          serviceImpl.getCapability((com.ishome.channel.v1.GetCapabilityRequest) request,
              (io.grpc.stub.StreamObserver<com.ishome.channel.v1.GetCapabilityResponse>) responseObserver);
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
          getSendMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ishome.channel.v1.SendMessageRequest,
              com.ishome.channel.v1.SendMessageResponse>(
                service, METHODID_SEND_MESSAGE)))
        .addMethod(
          getGetCapabilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ishome.channel.v1.GetCapabilityRequest,
              com.ishome.channel.v1.GetCapabilityResponse>(
                service, METHODID_GET_CAPABILITY)))
        .build();
  }

  private static abstract class ChannelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChannelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ishome.channel.v1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChannelService");
    }
  }

  private static final class ChannelServiceFileDescriptorSupplier
      extends ChannelServiceBaseDescriptorSupplier {
    ChannelServiceFileDescriptorSupplier() {}
  }

  private static final class ChannelServiceMethodDescriptorSupplier
      extends ChannelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ChannelServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ChannelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChannelServiceFileDescriptorSupplier())
              .addMethod(getSendMessageMethod())
              .addMethod(getGetCapabilityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
