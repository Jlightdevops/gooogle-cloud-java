// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1/document_processor_service.proto

package com.google.cloud.documentai.v1;

/**
 * <pre>
 * Response message for list processor types.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1.ListProcessorTypesResponse}
 */
public final class ListProcessorTypesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1.ListProcessorTypesResponse)
    ListProcessorTypesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListProcessorTypesResponse.newBuilder() to construct.
  private ListProcessorTypesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListProcessorTypesResponse() {
    processorTypes_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListProcessorTypesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListProcessorTypesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              processorTypes_ = new java.util.ArrayList<com.google.cloud.documentai.v1.ProcessorType>();
              mutable_bitField0_ |= 0x00000001;
            }
            processorTypes_.add(
                input.readMessage(com.google.cloud.documentai.v1.ProcessorType.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        processorTypes_ = java.util.Collections.unmodifiableList(processorTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ListProcessorTypesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ListProcessorTypesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1.ListProcessorTypesResponse.class, com.google.cloud.documentai.v1.ListProcessorTypesResponse.Builder.class);
  }

  public static final int PROCESSOR_TYPES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.documentai.v1.ProcessorType> processorTypes_;
  /**
   * <pre>
   * The processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.documentai.v1.ProcessorType> getProcessorTypesList() {
    return processorTypes_;
  }
  /**
   * <pre>
   * The processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.documentai.v1.ProcessorTypeOrBuilder> 
      getProcessorTypesOrBuilderList() {
    return processorTypes_;
  }
  /**
   * <pre>
   * The processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
   */
  @java.lang.Override
  public int getProcessorTypesCount() {
    return processorTypes_.size();
  }
  /**
   * <pre>
   * The processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.ProcessorType getProcessorTypes(int index) {
    return processorTypes_.get(index);
  }
  /**
   * <pre>
   * The processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.ProcessorTypeOrBuilder getProcessorTypesOrBuilder(
      int index) {
    return processorTypes_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Points to the next page, otherwise empty.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Points to the next page, otherwise empty.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < processorTypes_.size(); i++) {
      output.writeMessage(1, processorTypes_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < processorTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, processorTypes_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.documentai.v1.ListProcessorTypesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1.ListProcessorTypesResponse other = (com.google.cloud.documentai.v1.ListProcessorTypesResponse) obj;

    if (!getProcessorTypesList()
        .equals(other.getProcessorTypesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getProcessorTypesCount() > 0) {
      hash = (37 * hash) + PROCESSOR_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getProcessorTypesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.documentai.v1.ListProcessorTypesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response message for list processor types.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1.ListProcessorTypesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1.ListProcessorTypesResponse)
      com.google.cloud.documentai.v1.ListProcessorTypesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ListProcessorTypesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ListProcessorTypesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1.ListProcessorTypesResponse.class, com.google.cloud.documentai.v1.ListProcessorTypesResponse.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1.ListProcessorTypesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getProcessorTypesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (processorTypesBuilder_ == null) {
        processorTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        processorTypesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ListProcessorTypesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ListProcessorTypesResponse getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1.ListProcessorTypesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ListProcessorTypesResponse build() {
      com.google.cloud.documentai.v1.ListProcessorTypesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ListProcessorTypesResponse buildPartial() {
      com.google.cloud.documentai.v1.ListProcessorTypesResponse result = new com.google.cloud.documentai.v1.ListProcessorTypesResponse(this);
      int from_bitField0_ = bitField0_;
      if (processorTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          processorTypes_ = java.util.Collections.unmodifiableList(processorTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.processorTypes_ = processorTypes_;
      } else {
        result.processorTypes_ = processorTypesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.documentai.v1.ListProcessorTypesResponse) {
        return mergeFrom((com.google.cloud.documentai.v1.ListProcessorTypesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1.ListProcessorTypesResponse other) {
      if (other == com.google.cloud.documentai.v1.ListProcessorTypesResponse.getDefaultInstance()) return this;
      if (processorTypesBuilder_ == null) {
        if (!other.processorTypes_.isEmpty()) {
          if (processorTypes_.isEmpty()) {
            processorTypes_ = other.processorTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProcessorTypesIsMutable();
            processorTypes_.addAll(other.processorTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.processorTypes_.isEmpty()) {
          if (processorTypesBuilder_.isEmpty()) {
            processorTypesBuilder_.dispose();
            processorTypesBuilder_ = null;
            processorTypes_ = other.processorTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            processorTypesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProcessorTypesFieldBuilder() : null;
          } else {
            processorTypesBuilder_.addAllMessages(other.processorTypes_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.documentai.v1.ListProcessorTypesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.documentai.v1.ListProcessorTypesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.documentai.v1.ProcessorType> processorTypes_ =
      java.util.Collections.emptyList();
    private void ensureProcessorTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        processorTypes_ = new java.util.ArrayList<com.google.cloud.documentai.v1.ProcessorType>(processorTypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.documentai.v1.ProcessorType, com.google.cloud.documentai.v1.ProcessorType.Builder, com.google.cloud.documentai.v1.ProcessorTypeOrBuilder> processorTypesBuilder_;

    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public java.util.List<com.google.cloud.documentai.v1.ProcessorType> getProcessorTypesList() {
      if (processorTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(processorTypes_);
      } else {
        return processorTypesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public int getProcessorTypesCount() {
      if (processorTypesBuilder_ == null) {
        return processorTypes_.size();
      } else {
        return processorTypesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public com.google.cloud.documentai.v1.ProcessorType getProcessorTypes(int index) {
      if (processorTypesBuilder_ == null) {
        return processorTypes_.get(index);
      } else {
        return processorTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public Builder setProcessorTypes(
        int index, com.google.cloud.documentai.v1.ProcessorType value) {
      if (processorTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorTypesIsMutable();
        processorTypes_.set(index, value);
        onChanged();
      } else {
        processorTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public Builder setProcessorTypes(
        int index, com.google.cloud.documentai.v1.ProcessorType.Builder builderForValue) {
      if (processorTypesBuilder_ == null) {
        ensureProcessorTypesIsMutable();
        processorTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        processorTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public Builder addProcessorTypes(com.google.cloud.documentai.v1.ProcessorType value) {
      if (processorTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorTypesIsMutable();
        processorTypes_.add(value);
        onChanged();
      } else {
        processorTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public Builder addProcessorTypes(
        int index, com.google.cloud.documentai.v1.ProcessorType value) {
      if (processorTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorTypesIsMutable();
        processorTypes_.add(index, value);
        onChanged();
      } else {
        processorTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public Builder addProcessorTypes(
        com.google.cloud.documentai.v1.ProcessorType.Builder builderForValue) {
      if (processorTypesBuilder_ == null) {
        ensureProcessorTypesIsMutable();
        processorTypes_.add(builderForValue.build());
        onChanged();
      } else {
        processorTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public Builder addProcessorTypes(
        int index, com.google.cloud.documentai.v1.ProcessorType.Builder builderForValue) {
      if (processorTypesBuilder_ == null) {
        ensureProcessorTypesIsMutable();
        processorTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        processorTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public Builder addAllProcessorTypes(
        java.lang.Iterable<? extends com.google.cloud.documentai.v1.ProcessorType> values) {
      if (processorTypesBuilder_ == null) {
        ensureProcessorTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, processorTypes_);
        onChanged();
      } else {
        processorTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public Builder clearProcessorTypes() {
      if (processorTypesBuilder_ == null) {
        processorTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        processorTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public Builder removeProcessorTypes(int index) {
      if (processorTypesBuilder_ == null) {
        ensureProcessorTypesIsMutable();
        processorTypes_.remove(index);
        onChanged();
      } else {
        processorTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public com.google.cloud.documentai.v1.ProcessorType.Builder getProcessorTypesBuilder(
        int index) {
      return getProcessorTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public com.google.cloud.documentai.v1.ProcessorTypeOrBuilder getProcessorTypesOrBuilder(
        int index) {
      if (processorTypesBuilder_ == null) {
        return processorTypes_.get(index);  } else {
        return processorTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.documentai.v1.ProcessorTypeOrBuilder> 
         getProcessorTypesOrBuilderList() {
      if (processorTypesBuilder_ != null) {
        return processorTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(processorTypes_);
      }
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public com.google.cloud.documentai.v1.ProcessorType.Builder addProcessorTypesBuilder() {
      return getProcessorTypesFieldBuilder().addBuilder(
          com.google.cloud.documentai.v1.ProcessorType.getDefaultInstance());
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public com.google.cloud.documentai.v1.ProcessorType.Builder addProcessorTypesBuilder(
        int index) {
      return getProcessorTypesFieldBuilder().addBuilder(
          index, com.google.cloud.documentai.v1.ProcessorType.getDefaultInstance());
    }
    /**
     * <pre>
     * The processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorType processor_types = 1;</code>
     */
    public java.util.List<com.google.cloud.documentai.v1.ProcessorType.Builder> 
         getProcessorTypesBuilderList() {
      return getProcessorTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.documentai.v1.ProcessorType, com.google.cloud.documentai.v1.ProcessorType.Builder, com.google.cloud.documentai.v1.ProcessorTypeOrBuilder> 
        getProcessorTypesFieldBuilder() {
      if (processorTypesBuilder_ == null) {
        processorTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.documentai.v1.ProcessorType, com.google.cloud.documentai.v1.ProcessorType.Builder, com.google.cloud.documentai.v1.ProcessorTypeOrBuilder>(
                processorTypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        processorTypes_ = null;
      }
      return processorTypesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Points to the next page, otherwise empty.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Points to the next page, otherwise empty.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Points to the next page, otherwise empty.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Points to the next page, otherwise empty.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Points to the next page, otherwise empty.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1.ListProcessorTypesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1.ListProcessorTypesResponse)
  private static final com.google.cloud.documentai.v1.ListProcessorTypesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1.ListProcessorTypesResponse();
  }

  public static com.google.cloud.documentai.v1.ListProcessorTypesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListProcessorTypesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListProcessorTypesResponse>() {
    @java.lang.Override
    public ListProcessorTypesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListProcessorTypesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListProcessorTypesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListProcessorTypesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1.ListProcessorTypesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

