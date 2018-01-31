package com.proginn.gitinn.protobuf;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * 服务端接口类
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: dependence.proto")
public class DependenceServiceGrpc {

  private DependenceServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.DependenceService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.proginn.gitinn.protobuf.JavaFrameworkRequest,
      com.proginn.gitinn.protobuf.JavaFrameworkReply> METHOD_GET_DEPENDENCE_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "grpc.DependenceService", "GetDependenceList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.proginn.gitinn.protobuf.JavaFrameworkRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.proginn.gitinn.protobuf.JavaFrameworkReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DependenceServiceStub newStub(io.grpc.Channel channel) {
    return new DependenceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DependenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DependenceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DependenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DependenceServiceFutureStub(channel);
  }

  /**
   * <pre>
   * 服务端接口类
   * </pre>
   */
  public static interface DependenceService {

    /**
     * <pre>
     * 服务端接口方法
     * </pre>
     */
    public void getDependenceList(com.proginn.gitinn.protobuf.JavaFrameworkRequest request,
        io.grpc.stub.StreamObserver<com.proginn.gitinn.protobuf.JavaFrameworkReply> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractDependenceService implements DependenceService, io.grpc.BindableService {

    @java.lang.Override
    public void getDependenceList(com.proginn.gitinn.protobuf.JavaFrameworkRequest request,
        io.grpc.stub.StreamObserver<com.proginn.gitinn.protobuf.JavaFrameworkReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEPENDENCE_LIST, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return DependenceServiceGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * 服务端接口类
   * </pre>
   */
  public static interface DependenceServiceBlockingClient {

    /**
     * <pre>
     * 服务端接口方法
     * </pre>
     */
    public com.proginn.gitinn.protobuf.JavaFrameworkReply getDependenceList(com.proginn.gitinn.protobuf.JavaFrameworkRequest request);
  }

  /**
   * <pre>
   * 服务端接口类
   * </pre>
   */
  public static interface DependenceServiceFutureClient {

    /**
     * <pre>
     * 服务端接口方法
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proginn.gitinn.protobuf.JavaFrameworkReply> getDependenceList(
        com.proginn.gitinn.protobuf.JavaFrameworkRequest request);
  }

  public static class DependenceServiceStub extends io.grpc.stub.AbstractStub<DependenceServiceStub>
      implements DependenceService {
    private DependenceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DependenceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DependenceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DependenceServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void getDependenceList(com.proginn.gitinn.protobuf.JavaFrameworkRequest request,
        io.grpc.stub.StreamObserver<com.proginn.gitinn.protobuf.JavaFrameworkReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEPENDENCE_LIST, getCallOptions()), request, responseObserver);
    }
  }

  public static class DependenceServiceBlockingStub extends io.grpc.stub.AbstractStub<DependenceServiceBlockingStub>
      implements DependenceServiceBlockingClient {
    private DependenceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DependenceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DependenceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DependenceServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.proginn.gitinn.protobuf.JavaFrameworkReply getDependenceList(com.proginn.gitinn.protobuf.JavaFrameworkRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEPENDENCE_LIST, getCallOptions(), request);
    }
  }

  public static class DependenceServiceFutureStub extends io.grpc.stub.AbstractStub<DependenceServiceFutureStub>
      implements DependenceServiceFutureClient {
    private DependenceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DependenceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DependenceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DependenceServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.proginn.gitinn.protobuf.JavaFrameworkReply> getDependenceList(
        com.proginn.gitinn.protobuf.JavaFrameworkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEPENDENCE_LIST, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEPENDENCE_LIST = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DependenceService serviceImpl;
    private final int methodId;

    public MethodHandlers(DependenceService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DEPENDENCE_LIST:
          serviceImpl.getDependenceList((com.proginn.gitinn.protobuf.JavaFrameworkRequest) request,
              (io.grpc.stub.StreamObserver<com.proginn.gitinn.protobuf.JavaFrameworkReply>) responseObserver);
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

  public static io.grpc.ServerServiceDefinition bindService(
      final DependenceService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_GET_DEPENDENCE_LIST,
          asyncUnaryCall(
            new MethodHandlers<
              com.proginn.gitinn.protobuf.JavaFrameworkRequest,
              com.proginn.gitinn.protobuf.JavaFrameworkReply>(
                serviceImpl, METHODID_GET_DEPENDENCE_LIST)))
        .build();
  }
}
