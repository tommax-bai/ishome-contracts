package com.ishome.design.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * design-svc 对内 gRPC（对齐文档 §5.3：会话、确认、Patch、项目查询）。v0 草案。
 * 编排语义（Temporal signal、workflow 推进）在 design-svc 内部，不出现在本契约。
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class DesignServiceGrpc {

  private DesignServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ishome.design.v1.DesignService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ishome.design.v1.IngestMessageRequest,
      com.ishome.design.v1.IngestMessageResponse> getIngestMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IngestMessage",
      requestType = com.ishome.design.v1.IngestMessageRequest.class,
      responseType = com.ishome.design.v1.IngestMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ishome.design.v1.IngestMessageRequest,
      com.ishome.design.v1.IngestMessageResponse> getIngestMessageMethod() {
    io.grpc.MethodDescriptor<com.ishome.design.v1.IngestMessageRequest, com.ishome.design.v1.IngestMessageResponse> getIngestMessageMethod;
    if ((getIngestMessageMethod = DesignServiceGrpc.getIngestMessageMethod) == null) {
      synchronized (DesignServiceGrpc.class) {
        if ((getIngestMessageMethod = DesignServiceGrpc.getIngestMessageMethod) == null) {
          DesignServiceGrpc.getIngestMessageMethod = getIngestMessageMethod =
              io.grpc.MethodDescriptor.<com.ishome.design.v1.IngestMessageRequest, com.ishome.design.v1.IngestMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IngestMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.design.v1.IngestMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.design.v1.IngestMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesignServiceMethodDescriptorSupplier("IngestMessage"))
              .build();
        }
      }
    }
    return getIngestMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ishome.design.v1.SubmitConfirmationRequest,
      com.ishome.design.v1.SubmitConfirmationResponse> getSubmitConfirmationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitConfirmation",
      requestType = com.ishome.design.v1.SubmitConfirmationRequest.class,
      responseType = com.ishome.design.v1.SubmitConfirmationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ishome.design.v1.SubmitConfirmationRequest,
      com.ishome.design.v1.SubmitConfirmationResponse> getSubmitConfirmationMethod() {
    io.grpc.MethodDescriptor<com.ishome.design.v1.SubmitConfirmationRequest, com.ishome.design.v1.SubmitConfirmationResponse> getSubmitConfirmationMethod;
    if ((getSubmitConfirmationMethod = DesignServiceGrpc.getSubmitConfirmationMethod) == null) {
      synchronized (DesignServiceGrpc.class) {
        if ((getSubmitConfirmationMethod = DesignServiceGrpc.getSubmitConfirmationMethod) == null) {
          DesignServiceGrpc.getSubmitConfirmationMethod = getSubmitConfirmationMethod =
              io.grpc.MethodDescriptor.<com.ishome.design.v1.SubmitConfirmationRequest, com.ishome.design.v1.SubmitConfirmationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitConfirmation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.design.v1.SubmitConfirmationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.design.v1.SubmitConfirmationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesignServiceMethodDescriptorSupplier("SubmitConfirmation"))
              .build();
        }
      }
    }
    return getSubmitConfirmationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ishome.design.v1.SubmitPatchRequest,
      com.ishome.design.v1.SubmitPatchResponse> getSubmitPatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitPatch",
      requestType = com.ishome.design.v1.SubmitPatchRequest.class,
      responseType = com.ishome.design.v1.SubmitPatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ishome.design.v1.SubmitPatchRequest,
      com.ishome.design.v1.SubmitPatchResponse> getSubmitPatchMethod() {
    io.grpc.MethodDescriptor<com.ishome.design.v1.SubmitPatchRequest, com.ishome.design.v1.SubmitPatchResponse> getSubmitPatchMethod;
    if ((getSubmitPatchMethod = DesignServiceGrpc.getSubmitPatchMethod) == null) {
      synchronized (DesignServiceGrpc.class) {
        if ((getSubmitPatchMethod = DesignServiceGrpc.getSubmitPatchMethod) == null) {
          DesignServiceGrpc.getSubmitPatchMethod = getSubmitPatchMethod =
              io.grpc.MethodDescriptor.<com.ishome.design.v1.SubmitPatchRequest, com.ishome.design.v1.SubmitPatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitPatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.design.v1.SubmitPatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.design.v1.SubmitPatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesignServiceMethodDescriptorSupplier("SubmitPatch"))
              .build();
        }
      }
    }
    return getSubmitPatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ishome.design.v1.GetProjectRequest,
      com.ishome.design.v1.GetProjectResponse> getGetProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProject",
      requestType = com.ishome.design.v1.GetProjectRequest.class,
      responseType = com.ishome.design.v1.GetProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ishome.design.v1.GetProjectRequest,
      com.ishome.design.v1.GetProjectResponse> getGetProjectMethod() {
    io.grpc.MethodDescriptor<com.ishome.design.v1.GetProjectRequest, com.ishome.design.v1.GetProjectResponse> getGetProjectMethod;
    if ((getGetProjectMethod = DesignServiceGrpc.getGetProjectMethod) == null) {
      synchronized (DesignServiceGrpc.class) {
        if ((getGetProjectMethod = DesignServiceGrpc.getGetProjectMethod) == null) {
          DesignServiceGrpc.getGetProjectMethod = getGetProjectMethod =
              io.grpc.MethodDescriptor.<com.ishome.design.v1.GetProjectRequest, com.ishome.design.v1.GetProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.design.v1.GetProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.design.v1.GetProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesignServiceMethodDescriptorSupplier("GetProject"))
              .build();
        }
      }
    }
    return getGetProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ishome.design.v1.ListProjectsRequest,
      com.ishome.design.v1.ListProjectsResponse> getListProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProjects",
      requestType = com.ishome.design.v1.ListProjectsRequest.class,
      responseType = com.ishome.design.v1.ListProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ishome.design.v1.ListProjectsRequest,
      com.ishome.design.v1.ListProjectsResponse> getListProjectsMethod() {
    io.grpc.MethodDescriptor<com.ishome.design.v1.ListProjectsRequest, com.ishome.design.v1.ListProjectsResponse> getListProjectsMethod;
    if ((getListProjectsMethod = DesignServiceGrpc.getListProjectsMethod) == null) {
      synchronized (DesignServiceGrpc.class) {
        if ((getListProjectsMethod = DesignServiceGrpc.getListProjectsMethod) == null) {
          DesignServiceGrpc.getListProjectsMethod = getListProjectsMethod =
              io.grpc.MethodDescriptor.<com.ishome.design.v1.ListProjectsRequest, com.ishome.design.v1.ListProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.design.v1.ListProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.design.v1.ListProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesignServiceMethodDescriptorSupplier("ListProjects"))
              .build();
        }
      }
    }
    return getListProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ishome.design.v1.PresentDeliverablesRequest,
      com.ishome.design.v1.PresentDeliverablesResponse> getPresentDeliverablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PresentDeliverables",
      requestType = com.ishome.design.v1.PresentDeliverablesRequest.class,
      responseType = com.ishome.design.v1.PresentDeliverablesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ishome.design.v1.PresentDeliverablesRequest,
      com.ishome.design.v1.PresentDeliverablesResponse> getPresentDeliverablesMethod() {
    io.grpc.MethodDescriptor<com.ishome.design.v1.PresentDeliverablesRequest, com.ishome.design.v1.PresentDeliverablesResponse> getPresentDeliverablesMethod;
    if ((getPresentDeliverablesMethod = DesignServiceGrpc.getPresentDeliverablesMethod) == null) {
      synchronized (DesignServiceGrpc.class) {
        if ((getPresentDeliverablesMethod = DesignServiceGrpc.getPresentDeliverablesMethod) == null) {
          DesignServiceGrpc.getPresentDeliverablesMethod = getPresentDeliverablesMethod =
              io.grpc.MethodDescriptor.<com.ishome.design.v1.PresentDeliverablesRequest, com.ishome.design.v1.PresentDeliverablesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PresentDeliverables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.design.v1.PresentDeliverablesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ishome.design.v1.PresentDeliverablesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DesignServiceMethodDescriptorSupplier("PresentDeliverables"))
              .build();
        }
      }
    }
    return getPresentDeliverablesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DesignServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesignServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesignServiceStub>() {
        @java.lang.Override
        public DesignServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesignServiceStub(channel, callOptions);
        }
      };
    return DesignServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static DesignServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesignServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesignServiceBlockingV2Stub>() {
        @java.lang.Override
        public DesignServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesignServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return DesignServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DesignServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesignServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesignServiceBlockingStub>() {
        @java.lang.Override
        public DesignServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesignServiceBlockingStub(channel, callOptions);
        }
      };
    return DesignServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DesignServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DesignServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DesignServiceFutureStub>() {
        @java.lang.Override
        public DesignServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DesignServiceFutureStub(channel, callOptions);
        }
      };
    return DesignServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * design-svc 对内 gRPC（对齐文档 §5.3：会话、确认、Patch、项目查询）。v0 草案。
   * 编排语义（Temporal signal、workflow 推进）在 design-svc 内部，不出现在本契约。
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 会话入站：channel-svc 将统一模型消息转发至此。
     * 输入归一化（语音转文字、短时间窗多消息聚合）在 design-svc 内完成——渠道层不理解语义（对齐 §6.6）。
     * </pre>
     */
    default void ingestMessage(com.ishome.design.v1.IngestMessageRequest request,
        io.grpc.stub.StreamObserver<com.ishome.design.v1.IngestMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIngestMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * 确认闭环提交：c-bff 看图点错的结果。确认项升级 user_confirmed 并触发 workflow signal；
     * 每次 H5 交互结果回写一条摘要消息到聊天线程（对齐 §6.1 配套纪律，由 design-svc 经 channel-svc 完成）。
     * </pre>
     */
    default void submitConfirmation(com.ishome.design.v1.SubmitConfirmationRequest request,
        io.grpc.stub.StreamObserver<com.ishome.design.v1.SubmitConfirmationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitConfirmationMethod(), responseObserver);
    }

    /**
     * <pre>
     * 结构化 Patch 提交（校验 → 新 revision → outbox 事件 → 受影响产物重算）
     * </pre>
     */
    default void submitPatch(com.ishome.design.v1.SubmitPatchRequest request,
        io.grpc.stub.StreamObserver<com.ishome.design.v1.SubmitPatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitPatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 项目查询
     * </pre>
     */
    default void getProject(com.ishome.design.v1.GetProjectRequest request,
        io.grpc.stub.StreamObserver<com.ishome.design.v1.GetProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectMethod(), responseObserver);
    }

    /**
     */
    default void listProjects(com.ishome.design.v1.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<com.ishome.design.v1.ListProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 产物呈现（2026-09-04 新增，只增不改）：project-svc 登记完一批该送到业主手里的产物后调用；
     * chat-svc 经 channel-svc 把产物发进聊天线程，随后说明按什么假设做的（chat 定投递策略）。
     * 链路单向的最后一跳：project 判定 → 事件（outbox）→ 本 rpc → chat 呈现；chat 不判里程碑。
     * 幂等：delivery_id 由 project-svc 铸，chat 用它派生出站幂等键——重投不会在聊天线程里发两遍。
     * </pre>
     */
    default void presentDeliverables(com.ishome.design.v1.PresentDeliverablesRequest request,
        io.grpc.stub.StreamObserver<com.ishome.design.v1.PresentDeliverablesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPresentDeliverablesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DesignService.
   * <pre>
   * design-svc 对内 gRPC（对齐文档 §5.3：会话、确认、Patch、项目查询）。v0 草案。
   * 编排语义（Temporal signal、workflow 推进）在 design-svc 内部，不出现在本契约。
   * </pre>
   */
  public static abstract class DesignServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DesignServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DesignService.
   * <pre>
   * design-svc 对内 gRPC（对齐文档 §5.3：会话、确认、Patch、项目查询）。v0 草案。
   * 编排语义（Temporal signal、workflow 推进）在 design-svc 内部，不出现在本契约。
   * </pre>
   */
  public static final class DesignServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DesignServiceStub> {
    private DesignServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesignServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesignServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 会话入站：channel-svc 将统一模型消息转发至此。
     * 输入归一化（语音转文字、短时间窗多消息聚合）在 design-svc 内完成——渠道层不理解语义（对齐 §6.6）。
     * </pre>
     */
    public void ingestMessage(com.ishome.design.v1.IngestMessageRequest request,
        io.grpc.stub.StreamObserver<com.ishome.design.v1.IngestMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIngestMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 确认闭环提交：c-bff 看图点错的结果。确认项升级 user_confirmed 并触发 workflow signal；
     * 每次 H5 交互结果回写一条摘要消息到聊天线程（对齐 §6.1 配套纪律，由 design-svc 经 channel-svc 完成）。
     * </pre>
     */
    public void submitConfirmation(com.ishome.design.v1.SubmitConfirmationRequest request,
        io.grpc.stub.StreamObserver<com.ishome.design.v1.SubmitConfirmationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitConfirmationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 结构化 Patch 提交（校验 → 新 revision → outbox 事件 → 受影响产物重算）
     * </pre>
     */
    public void submitPatch(com.ishome.design.v1.SubmitPatchRequest request,
        io.grpc.stub.StreamObserver<com.ishome.design.v1.SubmitPatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitPatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 项目查询
     * </pre>
     */
    public void getProject(com.ishome.design.v1.GetProjectRequest request,
        io.grpc.stub.StreamObserver<com.ishome.design.v1.GetProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProjects(com.ishome.design.v1.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<com.ishome.design.v1.ListProjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 产物呈现（2026-09-04 新增，只增不改）：project-svc 登记完一批该送到业主手里的产物后调用；
     * chat-svc 经 channel-svc 把产物发进聊天线程，随后说明按什么假设做的（chat 定投递策略）。
     * 链路单向的最后一跳：project 判定 → 事件（outbox）→ 本 rpc → chat 呈现；chat 不判里程碑。
     * 幂等：delivery_id 由 project-svc 铸，chat 用它派生出站幂等键——重投不会在聊天线程里发两遍。
     * </pre>
     */
    public void presentDeliverables(com.ishome.design.v1.PresentDeliverablesRequest request,
        io.grpc.stub.StreamObserver<com.ishome.design.v1.PresentDeliverablesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPresentDeliverablesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DesignService.
   * <pre>
   * design-svc 对内 gRPC（对齐文档 §5.3：会话、确认、Patch、项目查询）。v0 草案。
   * 编排语义（Temporal signal、workflow 推进）在 design-svc 内部，不出现在本契约。
   * </pre>
   */
  public static final class DesignServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<DesignServiceBlockingV2Stub> {
    private DesignServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesignServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesignServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 会话入站：channel-svc 将统一模型消息转发至此。
     * 输入归一化（语音转文字、短时间窗多消息聚合）在 design-svc 内完成——渠道层不理解语义（对齐 §6.6）。
     * </pre>
     */
    public com.ishome.design.v1.IngestMessageResponse ingestMessage(com.ishome.design.v1.IngestMessageRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getIngestMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 确认闭环提交：c-bff 看图点错的结果。确认项升级 user_confirmed 并触发 workflow signal；
     * 每次 H5 交互结果回写一条摘要消息到聊天线程（对齐 §6.1 配套纪律，由 design-svc 经 channel-svc 完成）。
     * </pre>
     */
    public com.ishome.design.v1.SubmitConfirmationResponse submitConfirmation(com.ishome.design.v1.SubmitConfirmationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSubmitConfirmationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 结构化 Patch 提交（校验 → 新 revision → outbox 事件 → 受影响产物重算）
     * </pre>
     */
    public com.ishome.design.v1.SubmitPatchResponse submitPatch(com.ishome.design.v1.SubmitPatchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSubmitPatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 项目查询
     * </pre>
     */
    public com.ishome.design.v1.GetProjectResponse getProject(com.ishome.design.v1.GetProjectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ishome.design.v1.ListProjectsResponse listProjects(com.ishome.design.v1.ListProjectsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 产物呈现（2026-09-04 新增，只增不改）：project-svc 登记完一批该送到业主手里的产物后调用；
     * chat-svc 经 channel-svc 把产物发进聊天线程，随后说明按什么假设做的（chat 定投递策略）。
     * 链路单向的最后一跳：project 判定 → 事件（outbox）→ 本 rpc → chat 呈现；chat 不判里程碑。
     * 幂等：delivery_id 由 project-svc 铸，chat 用它派生出站幂等键——重投不会在聊天线程里发两遍。
     * </pre>
     */
    public com.ishome.design.v1.PresentDeliverablesResponse presentDeliverables(com.ishome.design.v1.PresentDeliverablesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPresentDeliverablesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DesignService.
   * <pre>
   * design-svc 对内 gRPC（对齐文档 §5.3：会话、确认、Patch、项目查询）。v0 草案。
   * 编排语义（Temporal signal、workflow 推进）在 design-svc 内部，不出现在本契约。
   * </pre>
   */
  public static final class DesignServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DesignServiceBlockingStub> {
    private DesignServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesignServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesignServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 会话入站：channel-svc 将统一模型消息转发至此。
     * 输入归一化（语音转文字、短时间窗多消息聚合）在 design-svc 内完成——渠道层不理解语义（对齐 §6.6）。
     * </pre>
     */
    public com.ishome.design.v1.IngestMessageResponse ingestMessage(com.ishome.design.v1.IngestMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIngestMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 确认闭环提交：c-bff 看图点错的结果。确认项升级 user_confirmed 并触发 workflow signal；
     * 每次 H5 交互结果回写一条摘要消息到聊天线程（对齐 §6.1 配套纪律，由 design-svc 经 channel-svc 完成）。
     * </pre>
     */
    public com.ishome.design.v1.SubmitConfirmationResponse submitConfirmation(com.ishome.design.v1.SubmitConfirmationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitConfirmationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 结构化 Patch 提交（校验 → 新 revision → outbox 事件 → 受影响产物重算）
     * </pre>
     */
    public com.ishome.design.v1.SubmitPatchResponse submitPatch(com.ishome.design.v1.SubmitPatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitPatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 项目查询
     * </pre>
     */
    public com.ishome.design.v1.GetProjectResponse getProject(com.ishome.design.v1.GetProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ishome.design.v1.ListProjectsResponse listProjects(com.ishome.design.v1.ListProjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 产物呈现（2026-09-04 新增，只增不改）：project-svc 登记完一批该送到业主手里的产物后调用；
     * chat-svc 经 channel-svc 把产物发进聊天线程，随后说明按什么假设做的（chat 定投递策略）。
     * 链路单向的最后一跳：project 判定 → 事件（outbox）→ 本 rpc → chat 呈现；chat 不判里程碑。
     * 幂等：delivery_id 由 project-svc 铸，chat 用它派生出站幂等键——重投不会在聊天线程里发两遍。
     * </pre>
     */
    public com.ishome.design.v1.PresentDeliverablesResponse presentDeliverables(com.ishome.design.v1.PresentDeliverablesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPresentDeliverablesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DesignService.
   * <pre>
   * design-svc 对内 gRPC（对齐文档 §5.3：会话、确认、Patch、项目查询）。v0 草案。
   * 编排语义（Temporal signal、workflow 推进）在 design-svc 内部，不出现在本契约。
   * </pre>
   */
  public static final class DesignServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DesignServiceFutureStub> {
    private DesignServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DesignServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DesignServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 会话入站：channel-svc 将统一模型消息转发至此。
     * 输入归一化（语音转文字、短时间窗多消息聚合）在 design-svc 内完成——渠道层不理解语义（对齐 §6.6）。
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ishome.design.v1.IngestMessageResponse> ingestMessage(
        com.ishome.design.v1.IngestMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIngestMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 确认闭环提交：c-bff 看图点错的结果。确认项升级 user_confirmed 并触发 workflow signal；
     * 每次 H5 交互结果回写一条摘要消息到聊天线程（对齐 §6.1 配套纪律，由 design-svc 经 channel-svc 完成）。
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ishome.design.v1.SubmitConfirmationResponse> submitConfirmation(
        com.ishome.design.v1.SubmitConfirmationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitConfirmationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 结构化 Patch 提交（校验 → 新 revision → outbox 事件 → 受影响产物重算）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ishome.design.v1.SubmitPatchResponse> submitPatch(
        com.ishome.design.v1.SubmitPatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitPatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 项目查询
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ishome.design.v1.GetProjectResponse> getProject(
        com.ishome.design.v1.GetProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ishome.design.v1.ListProjectsResponse> listProjects(
        com.ishome.design.v1.ListProjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 产物呈现（2026-09-04 新增，只增不改）：project-svc 登记完一批该送到业主手里的产物后调用；
     * chat-svc 经 channel-svc 把产物发进聊天线程，随后说明按什么假设做的（chat 定投递策略）。
     * 链路单向的最后一跳：project 判定 → 事件（outbox）→ 本 rpc → chat 呈现；chat 不判里程碑。
     * 幂等：delivery_id 由 project-svc 铸，chat 用它派生出站幂等键——重投不会在聊天线程里发两遍。
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ishome.design.v1.PresentDeliverablesResponse> presentDeliverables(
        com.ishome.design.v1.PresentDeliverablesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPresentDeliverablesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INGEST_MESSAGE = 0;
  private static final int METHODID_SUBMIT_CONFIRMATION = 1;
  private static final int METHODID_SUBMIT_PATCH = 2;
  private static final int METHODID_GET_PROJECT = 3;
  private static final int METHODID_LIST_PROJECTS = 4;
  private static final int METHODID_PRESENT_DELIVERABLES = 5;

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
        case METHODID_INGEST_MESSAGE:
          serviceImpl.ingestMessage((com.ishome.design.v1.IngestMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.ishome.design.v1.IngestMessageResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_CONFIRMATION:
          serviceImpl.submitConfirmation((com.ishome.design.v1.SubmitConfirmationRequest) request,
              (io.grpc.stub.StreamObserver<com.ishome.design.v1.SubmitConfirmationResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_PATCH:
          serviceImpl.submitPatch((com.ishome.design.v1.SubmitPatchRequest) request,
              (io.grpc.stub.StreamObserver<com.ishome.design.v1.SubmitPatchResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECT:
          serviceImpl.getProject((com.ishome.design.v1.GetProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.ishome.design.v1.GetProjectResponse>) responseObserver);
          break;
        case METHODID_LIST_PROJECTS:
          serviceImpl.listProjects((com.ishome.design.v1.ListProjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.ishome.design.v1.ListProjectsResponse>) responseObserver);
          break;
        case METHODID_PRESENT_DELIVERABLES:
          serviceImpl.presentDeliverables((com.ishome.design.v1.PresentDeliverablesRequest) request,
              (io.grpc.stub.StreamObserver<com.ishome.design.v1.PresentDeliverablesResponse>) responseObserver);
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
          getIngestMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ishome.design.v1.IngestMessageRequest,
              com.ishome.design.v1.IngestMessageResponse>(
                service, METHODID_INGEST_MESSAGE)))
        .addMethod(
          getSubmitConfirmationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ishome.design.v1.SubmitConfirmationRequest,
              com.ishome.design.v1.SubmitConfirmationResponse>(
                service, METHODID_SUBMIT_CONFIRMATION)))
        .addMethod(
          getSubmitPatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ishome.design.v1.SubmitPatchRequest,
              com.ishome.design.v1.SubmitPatchResponse>(
                service, METHODID_SUBMIT_PATCH)))
        .addMethod(
          getGetProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ishome.design.v1.GetProjectRequest,
              com.ishome.design.v1.GetProjectResponse>(
                service, METHODID_GET_PROJECT)))
        .addMethod(
          getListProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ishome.design.v1.ListProjectsRequest,
              com.ishome.design.v1.ListProjectsResponse>(
                service, METHODID_LIST_PROJECTS)))
        .addMethod(
          getPresentDeliverablesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ishome.design.v1.PresentDeliverablesRequest,
              com.ishome.design.v1.PresentDeliverablesResponse>(
                service, METHODID_PRESENT_DELIVERABLES)))
        .build();
  }

  private static abstract class DesignServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DesignServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ishome.design.v1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DesignService");
    }
  }

  private static final class DesignServiceFileDescriptorSupplier
      extends DesignServiceBaseDescriptorSupplier {
    DesignServiceFileDescriptorSupplier() {}
  }

  private static final class DesignServiceMethodDescriptorSupplier
      extends DesignServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DesignServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DesignServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DesignServiceFileDescriptorSupplier())
              .addMethod(getIngestMessageMethod())
              .addMethod(getSubmitConfirmationMethod())
              .addMethod(getSubmitPatchMethod())
              .addMethod(getGetProjectMethod())
              .addMethod(getListProjectsMethod())
              .addMethod(getPresentDeliverablesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
