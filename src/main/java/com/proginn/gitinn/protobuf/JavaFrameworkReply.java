// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dependence.proto

package com.proginn.gitinn.protobuf;

/**
 * Protobuf type {@code grpc.JavaFrameworkReply}
 *
 * <pre>
 * 响应参数,返回依赖列表
 * </pre>
 */
public  final class JavaFrameworkReply extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpc.JavaFrameworkReply)
    JavaFrameworkReplyOrBuilder {
  // Use JavaFrameworkReply.newBuilder() to construct.
  private JavaFrameworkReply(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private JavaFrameworkReply() {
    dependence_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private JavaFrameworkReply(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              dependence_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            dependence_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        dependence_ = dependence_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proginn.gitinn.protobuf.DependenceProto.internal_static_grpc_JavaFrameworkReply_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proginn.gitinn.protobuf.DependenceProto.internal_static_grpc_JavaFrameworkReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proginn.gitinn.protobuf.JavaFrameworkReply.class, com.proginn.gitinn.protobuf.JavaFrameworkReply.Builder.class);
  }

  public static final int DEPENDENCE_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList dependence_;
  /**
   * <code>repeated string dependence = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getDependenceList() {
    return dependence_;
  }
  /**
   * <code>repeated string dependence = 1;</code>
   */
  public int getDependenceCount() {
    return dependence_.size();
  }
  /**
   * <code>repeated string dependence = 1;</code>
   */
  public java.lang.String getDependence(int index) {
    return dependence_.get(index);
  }
  /**
   * <code>repeated string dependence = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDependenceBytes(int index) {
    return dependence_.getByteString(index);
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
    for (int i = 0; i < dependence_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, dependence_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < dependence_.size(); i++) {
        dataSize += computeStringSizeNoTag(dependence_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDependenceList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.proginn.gitinn.protobuf.JavaFrameworkReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.proginn.gitinn.protobuf.JavaFrameworkReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proginn.gitinn.protobuf.JavaFrameworkReply prototype) {
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
   * Protobuf type {@code grpc.JavaFrameworkReply}
   *
   * <pre>
   * 响应参数,返回依赖列表
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.JavaFrameworkReply)
      com.proginn.gitinn.protobuf.JavaFrameworkReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proginn.gitinn.protobuf.DependenceProto.internal_static_grpc_JavaFrameworkReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proginn.gitinn.protobuf.DependenceProto.internal_static_grpc_JavaFrameworkReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proginn.gitinn.protobuf.JavaFrameworkReply.class, com.proginn.gitinn.protobuf.JavaFrameworkReply.Builder.class);
    }

    // Construct using com.proginn.gitinn.protobuf.JavaFrameworkReply.newBuilder()
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
      dependence_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proginn.gitinn.protobuf.DependenceProto.internal_static_grpc_JavaFrameworkReply_descriptor;
    }

    public com.proginn.gitinn.protobuf.JavaFrameworkReply getDefaultInstanceForType() {
      return com.proginn.gitinn.protobuf.JavaFrameworkReply.getDefaultInstance();
    }

    public com.proginn.gitinn.protobuf.JavaFrameworkReply build() {
      com.proginn.gitinn.protobuf.JavaFrameworkReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.proginn.gitinn.protobuf.JavaFrameworkReply buildPartial() {
      com.proginn.gitinn.protobuf.JavaFrameworkReply result = new com.proginn.gitinn.protobuf.JavaFrameworkReply(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        dependence_ = dependence_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.dependence_ = dependence_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proginn.gitinn.protobuf.JavaFrameworkReply) {
        return mergeFrom((com.proginn.gitinn.protobuf.JavaFrameworkReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proginn.gitinn.protobuf.JavaFrameworkReply other) {
      if (other == com.proginn.gitinn.protobuf.JavaFrameworkReply.getDefaultInstance()) return this;
      if (!other.dependence_.isEmpty()) {
        if (dependence_.isEmpty()) {
          dependence_ = other.dependence_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDependenceIsMutable();
          dependence_.addAll(other.dependence_);
        }
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
      com.proginn.gitinn.protobuf.JavaFrameworkReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proginn.gitinn.protobuf.JavaFrameworkReply) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList dependence_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDependenceIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        dependence_ = new com.google.protobuf.LazyStringArrayList(dependence_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string dependence = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getDependenceList() {
      return dependence_.getUnmodifiableView();
    }
    /**
     * <code>repeated string dependence = 1;</code>
     */
    public int getDependenceCount() {
      return dependence_.size();
    }
    /**
     * <code>repeated string dependence = 1;</code>
     */
    public java.lang.String getDependence(int index) {
      return dependence_.get(index);
    }
    /**
     * <code>repeated string dependence = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDependenceBytes(int index) {
      return dependence_.getByteString(index);
    }
    /**
     * <code>repeated string dependence = 1;</code>
     */
    public Builder setDependence(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDependenceIsMutable();
      dependence_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dependence = 1;</code>
     */
    public Builder addDependence(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDependenceIsMutable();
      dependence_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dependence = 1;</code>
     */
    public Builder addAllDependence(
        java.lang.Iterable<java.lang.String> values) {
      ensureDependenceIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dependence_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dependence = 1;</code>
     */
    public Builder clearDependence() {
      dependence_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dependence = 1;</code>
     */
    public Builder addDependenceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDependenceIsMutable();
      dependence_.add(value);
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


    // @@protoc_insertion_point(builder_scope:grpc.JavaFrameworkReply)
  }

  // @@protoc_insertion_point(class_scope:grpc.JavaFrameworkReply)
  private static final com.proginn.gitinn.protobuf.JavaFrameworkReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proginn.gitinn.protobuf.JavaFrameworkReply();
  }

  public static com.proginn.gitinn.protobuf.JavaFrameworkReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JavaFrameworkReply>
      PARSER = new com.google.protobuf.AbstractParser<JavaFrameworkReply>() {
    public JavaFrameworkReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new JavaFrameworkReply(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<JavaFrameworkReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JavaFrameworkReply> getParserForType() {
    return PARSER;
  }

  public com.proginn.gitinn.protobuf.JavaFrameworkReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

