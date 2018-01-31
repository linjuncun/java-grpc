// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dependence.proto

package com.proginn.gitinn.protobuf;

/**
 * Protobuf type {@code grpc.JavaFrameworkRequest}
 *
 * <pre>
 * 请求参数：项目地址
 * </pre>
 */
public  final class JavaFrameworkRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpc.JavaFrameworkRequest)
    JavaFrameworkRequestOrBuilder {
  // Use JavaFrameworkRequest.newBuilder() to construct.
  private JavaFrameworkRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private JavaFrameworkRequest() {
    remotePath_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private JavaFrameworkRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            remotePath_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proginn.gitinn.protobuf.DependenceProto.internal_static_grpc_JavaFrameworkRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proginn.gitinn.protobuf.DependenceProto.internal_static_grpc_JavaFrameworkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proginn.gitinn.protobuf.JavaFrameworkRequest.class, com.proginn.gitinn.protobuf.JavaFrameworkRequest.Builder.class);
  }

  public static final int REMOTE_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object remotePath_;
  /**
   * <code>optional string remote_path = 1;</code>
   */
  public java.lang.String getRemotePath() {
    java.lang.Object ref = remotePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      remotePath_ = s;
      return s;
    }
  }
  /**
   * <code>optional string remote_path = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRemotePathBytes() {
    java.lang.Object ref = remotePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      remotePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRemotePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, remotePath_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRemotePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, remotePath_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.proginn.gitinn.protobuf.JavaFrameworkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proginn.gitinn.protobuf.JavaFrameworkRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.JavaFrameworkRequest}
   *
   * <pre>
   * 请求参数：项目地址
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.JavaFrameworkRequest)
      com.proginn.gitinn.protobuf.JavaFrameworkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proginn.gitinn.protobuf.DependenceProto.internal_static_grpc_JavaFrameworkRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proginn.gitinn.protobuf.DependenceProto.internal_static_grpc_JavaFrameworkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proginn.gitinn.protobuf.JavaFrameworkRequest.class, com.proginn.gitinn.protobuf.JavaFrameworkRequest.Builder.class);
    }

    // Construct using com.proginn.gitinn.protobuf.JavaFrameworkRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      remotePath_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proginn.gitinn.protobuf.DependenceProto.internal_static_grpc_JavaFrameworkRequest_descriptor;
    }

    public com.proginn.gitinn.protobuf.JavaFrameworkRequest getDefaultInstanceForType() {
      return com.proginn.gitinn.protobuf.JavaFrameworkRequest.getDefaultInstance();
    }

    public com.proginn.gitinn.protobuf.JavaFrameworkRequest build() {
      com.proginn.gitinn.protobuf.JavaFrameworkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.proginn.gitinn.protobuf.JavaFrameworkRequest buildPartial() {
      com.proginn.gitinn.protobuf.JavaFrameworkRequest result = new com.proginn.gitinn.protobuf.JavaFrameworkRequest(this);
      result.remotePath_ = remotePath_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proginn.gitinn.protobuf.JavaFrameworkRequest) {
        return mergeFrom((com.proginn.gitinn.protobuf.JavaFrameworkRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proginn.gitinn.protobuf.JavaFrameworkRequest other) {
      if (other == com.proginn.gitinn.protobuf.JavaFrameworkRequest.getDefaultInstance()) return this;
      if (!other.getRemotePath().isEmpty()) {
        remotePath_ = other.remotePath_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.proginn.gitinn.protobuf.JavaFrameworkRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proginn.gitinn.protobuf.JavaFrameworkRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object remotePath_ = "";
    /**
     * <code>optional string remote_path = 1;</code>
     */
    public java.lang.String getRemotePath() {
      java.lang.Object ref = remotePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remotePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string remote_path = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRemotePathBytes() {
      java.lang.Object ref = remotePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remotePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string remote_path = 1;</code>
     */
    public Builder setRemotePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      remotePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string remote_path = 1;</code>
     */
    public Builder clearRemotePath() {
      
      remotePath_ = getDefaultInstance().getRemotePath();
      onChanged();
      return this;
    }
    /**
     * <code>optional string remote_path = 1;</code>
     */
    public Builder setRemotePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      remotePath_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.JavaFrameworkRequest)
  }

  // @@protoc_insertion_point(class_scope:grpc.JavaFrameworkRequest)
  private static final com.proginn.gitinn.protobuf.JavaFrameworkRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proginn.gitinn.protobuf.JavaFrameworkRequest();
  }

  public static com.proginn.gitinn.protobuf.JavaFrameworkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JavaFrameworkRequest>
      PARSER = new com.google.protobuf.AbstractParser<JavaFrameworkRequest>() {
    public JavaFrameworkRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new JavaFrameworkRequest(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<JavaFrameworkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JavaFrameworkRequest> getParserForType() {
    return PARSER;
  }

  public com.proginn.gitinn.protobuf.JavaFrameworkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

