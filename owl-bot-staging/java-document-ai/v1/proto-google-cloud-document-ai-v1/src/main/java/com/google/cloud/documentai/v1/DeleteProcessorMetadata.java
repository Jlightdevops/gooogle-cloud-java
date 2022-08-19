// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1/document_processor_service.proto

package com.google.cloud.documentai.v1;

/**
 * <pre>
 * The long running operation metadata for delete processor method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1.DeleteProcessorMetadata}
 */
public final class DeleteProcessorMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1.DeleteProcessorMetadata)
    DeleteProcessorMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteProcessorMetadata.newBuilder() to construct.
  private DeleteProcessorMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteProcessorMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteProcessorMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteProcessorMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 42: {
            com.google.cloud.documentai.v1.CommonOperationMetadata.Builder subBuilder = null;
            if (commonMetadata_ != null) {
              subBuilder = commonMetadata_.toBuilder();
            }
            commonMetadata_ = input.readMessage(com.google.cloud.documentai.v1.CommonOperationMetadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(commonMetadata_);
              commonMetadata_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_DeleteProcessorMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_DeleteProcessorMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1.DeleteProcessorMetadata.class, com.google.cloud.documentai.v1.DeleteProcessorMetadata.Builder.class);
  }

  public static final int COMMON_METADATA_FIELD_NUMBER = 5;
  private com.google.cloud.documentai.v1.CommonOperationMetadata commonMetadata_;
  /**
   * <pre>
   * The basic metadata of the long running operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
   * @return Whether the commonMetadata field is set.
   */
  @java.lang.Override
  public boolean hasCommonMetadata() {
    return commonMetadata_ != null;
  }
  /**
   * <pre>
   * The basic metadata of the long running operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
   * @return The commonMetadata.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.CommonOperationMetadata getCommonMetadata() {
    return commonMetadata_ == null ? com.google.cloud.documentai.v1.CommonOperationMetadata.getDefaultInstance() : commonMetadata_;
  }
  /**
   * <pre>
   * The basic metadata of the long running operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.CommonOperationMetadataOrBuilder getCommonMetadataOrBuilder() {
    return getCommonMetadata();
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
    if (commonMetadata_ != null) {
      output.writeMessage(5, getCommonMetadata());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commonMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getCommonMetadata());
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
    if (!(obj instanceof com.google.cloud.documentai.v1.DeleteProcessorMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1.DeleteProcessorMetadata other = (com.google.cloud.documentai.v1.DeleteProcessorMetadata) obj;

    if (hasCommonMetadata() != other.hasCommonMetadata()) return false;
    if (hasCommonMetadata()) {
      if (!getCommonMetadata()
          .equals(other.getCommonMetadata())) return false;
    }
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
    if (hasCommonMetadata()) {
      hash = (37 * hash) + COMMON_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getCommonMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.documentai.v1.DeleteProcessorMetadata prototype) {
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
   * The long running operation metadata for delete processor method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1.DeleteProcessorMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1.DeleteProcessorMetadata)
      com.google.cloud.documentai.v1.DeleteProcessorMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_DeleteProcessorMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_DeleteProcessorMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1.DeleteProcessorMetadata.class, com.google.cloud.documentai.v1.DeleteProcessorMetadata.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1.DeleteProcessorMetadata.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (commonMetadataBuilder_ == null) {
        commonMetadata_ = null;
      } else {
        commonMetadata_ = null;
        commonMetadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_DeleteProcessorMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.DeleteProcessorMetadata getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1.DeleteProcessorMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.DeleteProcessorMetadata build() {
      com.google.cloud.documentai.v1.DeleteProcessorMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.DeleteProcessorMetadata buildPartial() {
      com.google.cloud.documentai.v1.DeleteProcessorMetadata result = new com.google.cloud.documentai.v1.DeleteProcessorMetadata(this);
      if (commonMetadataBuilder_ == null) {
        result.commonMetadata_ = commonMetadata_;
      } else {
        result.commonMetadata_ = commonMetadataBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.documentai.v1.DeleteProcessorMetadata) {
        return mergeFrom((com.google.cloud.documentai.v1.DeleteProcessorMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1.DeleteProcessorMetadata other) {
      if (other == com.google.cloud.documentai.v1.DeleteProcessorMetadata.getDefaultInstance()) return this;
      if (other.hasCommonMetadata()) {
        mergeCommonMetadata(other.getCommonMetadata());
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
      com.google.cloud.documentai.v1.DeleteProcessorMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.documentai.v1.DeleteProcessorMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.documentai.v1.CommonOperationMetadata commonMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.documentai.v1.CommonOperationMetadata, com.google.cloud.documentai.v1.CommonOperationMetadata.Builder, com.google.cloud.documentai.v1.CommonOperationMetadataOrBuilder> commonMetadataBuilder_;
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     * @return Whether the commonMetadata field is set.
     */
    public boolean hasCommonMetadata() {
      return commonMetadataBuilder_ != null || commonMetadata_ != null;
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     * @return The commonMetadata.
     */
    public com.google.cloud.documentai.v1.CommonOperationMetadata getCommonMetadata() {
      if (commonMetadataBuilder_ == null) {
        return commonMetadata_ == null ? com.google.cloud.documentai.v1.CommonOperationMetadata.getDefaultInstance() : commonMetadata_;
      } else {
        return commonMetadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    public Builder setCommonMetadata(com.google.cloud.documentai.v1.CommonOperationMetadata value) {
      if (commonMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commonMetadata_ = value;
        onChanged();
      } else {
        commonMetadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    public Builder setCommonMetadata(
        com.google.cloud.documentai.v1.CommonOperationMetadata.Builder builderForValue) {
      if (commonMetadataBuilder_ == null) {
        commonMetadata_ = builderForValue.build();
        onChanged();
      } else {
        commonMetadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    public Builder mergeCommonMetadata(com.google.cloud.documentai.v1.CommonOperationMetadata value) {
      if (commonMetadataBuilder_ == null) {
        if (commonMetadata_ != null) {
          commonMetadata_ =
            com.google.cloud.documentai.v1.CommonOperationMetadata.newBuilder(commonMetadata_).mergeFrom(value).buildPartial();
        } else {
          commonMetadata_ = value;
        }
        onChanged();
      } else {
        commonMetadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    public Builder clearCommonMetadata() {
      if (commonMetadataBuilder_ == null) {
        commonMetadata_ = null;
        onChanged();
      } else {
        commonMetadata_ = null;
        commonMetadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    public com.google.cloud.documentai.v1.CommonOperationMetadata.Builder getCommonMetadataBuilder() {
      
      onChanged();
      return getCommonMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    public com.google.cloud.documentai.v1.CommonOperationMetadataOrBuilder getCommonMetadataOrBuilder() {
      if (commonMetadataBuilder_ != null) {
        return commonMetadataBuilder_.getMessageOrBuilder();
      } else {
        return commonMetadata_ == null ?
            com.google.cloud.documentai.v1.CommonOperationMetadata.getDefaultInstance() : commonMetadata_;
      }
    }
    /**
     * <pre>
     * The basic metadata of the long running operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.CommonOperationMetadata common_metadata = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.documentai.v1.CommonOperationMetadata, com.google.cloud.documentai.v1.CommonOperationMetadata.Builder, com.google.cloud.documentai.v1.CommonOperationMetadataOrBuilder> 
        getCommonMetadataFieldBuilder() {
      if (commonMetadataBuilder_ == null) {
        commonMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1.CommonOperationMetadata, com.google.cloud.documentai.v1.CommonOperationMetadata.Builder, com.google.cloud.documentai.v1.CommonOperationMetadataOrBuilder>(
                getCommonMetadata(),
                getParentForChildren(),
                isClean());
        commonMetadata_ = null;
      }
      return commonMetadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1.DeleteProcessorMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1.DeleteProcessorMetadata)
  private static final com.google.cloud.documentai.v1.DeleteProcessorMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1.DeleteProcessorMetadata();
  }

  public static com.google.cloud.documentai.v1.DeleteProcessorMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteProcessorMetadata>
      PARSER = new com.google.protobuf.AbstractParser<DeleteProcessorMetadata>() {
    @java.lang.Override
    public DeleteProcessorMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteProcessorMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteProcessorMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteProcessorMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1.DeleteProcessorMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

