// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

/**
 * <pre>
 * Oracle data source configuration
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1.OracleSourceConfig}
 */
public final class OracleSourceConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1.OracleSourceConfig)
    OracleSourceConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OracleSourceConfig.newBuilder() to construct.
  private OracleSourceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OracleSourceConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OracleSourceConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OracleSourceConfig(
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
          case 10: {
            com.google.cloud.datastream.v1.OracleRdbms.Builder subBuilder = null;
            if (includeObjects_ != null) {
              subBuilder = includeObjects_.toBuilder();
            }
            includeObjects_ = input.readMessage(com.google.cloud.datastream.v1.OracleRdbms.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(includeObjects_);
              includeObjects_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.cloud.datastream.v1.OracleRdbms.Builder subBuilder = null;
            if (excludeObjects_ != null) {
              subBuilder = excludeObjects_.toBuilder();
            }
            excludeObjects_ = input.readMessage(com.google.cloud.datastream.v1.OracleRdbms.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(excludeObjects_);
              excludeObjects_ = subBuilder.buildPartial();
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
    return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_OracleSourceConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_OracleSourceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1.OracleSourceConfig.class, com.google.cloud.datastream.v1.OracleSourceConfig.Builder.class);
  }

  public static final int INCLUDE_OBJECTS_FIELD_NUMBER = 1;
  private com.google.cloud.datastream.v1.OracleRdbms includeObjects_;
  /**
   * <pre>
   * Oracle objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
   * @return Whether the includeObjects field is set.
   */
  @java.lang.Override
  public boolean hasIncludeObjects() {
    return includeObjects_ != null;
  }
  /**
   * <pre>
   * Oracle objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
   * @return The includeObjects.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.OracleRdbms getIncludeObjects() {
    return includeObjects_ == null ? com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance() : includeObjects_;
  }
  /**
   * <pre>
   * Oracle objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getIncludeObjectsOrBuilder() {
    return getIncludeObjects();
  }

  public static final int EXCLUDE_OBJECTS_FIELD_NUMBER = 2;
  private com.google.cloud.datastream.v1.OracleRdbms excludeObjects_;
  /**
   * <pre>
   * Oracle objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
   * @return Whether the excludeObjects field is set.
   */
  @java.lang.Override
  public boolean hasExcludeObjects() {
    return excludeObjects_ != null;
  }
  /**
   * <pre>
   * Oracle objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
   * @return The excludeObjects.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.OracleRdbms getExcludeObjects() {
    return excludeObjects_ == null ? com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance() : excludeObjects_;
  }
  /**
   * <pre>
   * Oracle objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getExcludeObjectsOrBuilder() {
    return getExcludeObjects();
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
    if (includeObjects_ != null) {
      output.writeMessage(1, getIncludeObjects());
    }
    if (excludeObjects_ != null) {
      output.writeMessage(2, getExcludeObjects());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (includeObjects_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIncludeObjects());
    }
    if (excludeObjects_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExcludeObjects());
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
    if (!(obj instanceof com.google.cloud.datastream.v1.OracleSourceConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1.OracleSourceConfig other = (com.google.cloud.datastream.v1.OracleSourceConfig) obj;

    if (hasIncludeObjects() != other.hasIncludeObjects()) return false;
    if (hasIncludeObjects()) {
      if (!getIncludeObjects()
          .equals(other.getIncludeObjects())) return false;
    }
    if (hasExcludeObjects() != other.hasExcludeObjects()) return false;
    if (hasExcludeObjects()) {
      if (!getExcludeObjects()
          .equals(other.getExcludeObjects())) return false;
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
    if (hasIncludeObjects()) {
      hash = (37 * hash) + INCLUDE_OBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getIncludeObjects().hashCode();
    }
    if (hasExcludeObjects()) {
      hash = (37 * hash) + EXCLUDE_OBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getExcludeObjects().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1.OracleSourceConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.OracleSourceConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.OracleSourceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.OracleSourceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.OracleSourceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.OracleSourceConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.OracleSourceConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.OracleSourceConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.OracleSourceConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.OracleSourceConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.OracleSourceConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.OracleSourceConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datastream.v1.OracleSourceConfig prototype) {
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
   * Oracle data source configuration
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1.OracleSourceConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1.OracleSourceConfig)
      com.google.cloud.datastream.v1.OracleSourceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_OracleSourceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_OracleSourceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1.OracleSourceConfig.class, com.google.cloud.datastream.v1.OracleSourceConfig.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1.OracleSourceConfig.newBuilder()
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
      if (includeObjectsBuilder_ == null) {
        includeObjects_ = null;
      } else {
        includeObjects_ = null;
        includeObjectsBuilder_ = null;
      }
      if (excludeObjectsBuilder_ == null) {
        excludeObjects_ = null;
      } else {
        excludeObjects_ = null;
        excludeObjectsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_OracleSourceConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.OracleSourceConfig getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1.OracleSourceConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.OracleSourceConfig build() {
      com.google.cloud.datastream.v1.OracleSourceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.OracleSourceConfig buildPartial() {
      com.google.cloud.datastream.v1.OracleSourceConfig result = new com.google.cloud.datastream.v1.OracleSourceConfig(this);
      if (includeObjectsBuilder_ == null) {
        result.includeObjects_ = includeObjects_;
      } else {
        result.includeObjects_ = includeObjectsBuilder_.build();
      }
      if (excludeObjectsBuilder_ == null) {
        result.excludeObjects_ = excludeObjects_;
      } else {
        result.excludeObjects_ = excludeObjectsBuilder_.build();
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
      if (other instanceof com.google.cloud.datastream.v1.OracleSourceConfig) {
        return mergeFrom((com.google.cloud.datastream.v1.OracleSourceConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1.OracleSourceConfig other) {
      if (other == com.google.cloud.datastream.v1.OracleSourceConfig.getDefaultInstance()) return this;
      if (other.hasIncludeObjects()) {
        mergeIncludeObjects(other.getIncludeObjects());
      }
      if (other.hasExcludeObjects()) {
        mergeExcludeObjects(other.getExcludeObjects());
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
      com.google.cloud.datastream.v1.OracleSourceConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datastream.v1.OracleSourceConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.datastream.v1.OracleRdbms includeObjects_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1.OracleRdbms, com.google.cloud.datastream.v1.OracleRdbms.Builder, com.google.cloud.datastream.v1.OracleRdbmsOrBuilder> includeObjectsBuilder_;
    /**
     * <pre>
     * Oracle objects to include in the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
     * @return Whether the includeObjects field is set.
     */
    public boolean hasIncludeObjects() {
      return includeObjectsBuilder_ != null || includeObjects_ != null;
    }
    /**
     * <pre>
     * Oracle objects to include in the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
     * @return The includeObjects.
     */
    public com.google.cloud.datastream.v1.OracleRdbms getIncludeObjects() {
      if (includeObjectsBuilder_ == null) {
        return includeObjects_ == null ? com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance() : includeObjects_;
      } else {
        return includeObjectsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Oracle objects to include in the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
     */
    public Builder setIncludeObjects(com.google.cloud.datastream.v1.OracleRdbms value) {
      if (includeObjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        includeObjects_ = value;
        onChanged();
      } else {
        includeObjectsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Oracle objects to include in the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
     */
    public Builder setIncludeObjects(
        com.google.cloud.datastream.v1.OracleRdbms.Builder builderForValue) {
      if (includeObjectsBuilder_ == null) {
        includeObjects_ = builderForValue.build();
        onChanged();
      } else {
        includeObjectsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Oracle objects to include in the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
     */
    public Builder mergeIncludeObjects(com.google.cloud.datastream.v1.OracleRdbms value) {
      if (includeObjectsBuilder_ == null) {
        if (includeObjects_ != null) {
          includeObjects_ =
            com.google.cloud.datastream.v1.OracleRdbms.newBuilder(includeObjects_).mergeFrom(value).buildPartial();
        } else {
          includeObjects_ = value;
        }
        onChanged();
      } else {
        includeObjectsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Oracle objects to include in the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
     */
    public Builder clearIncludeObjects() {
      if (includeObjectsBuilder_ == null) {
        includeObjects_ = null;
        onChanged();
      } else {
        includeObjects_ = null;
        includeObjectsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Oracle objects to include in the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.OracleRdbms.Builder getIncludeObjectsBuilder() {
      
      onChanged();
      return getIncludeObjectsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Oracle objects to include in the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getIncludeObjectsOrBuilder() {
      if (includeObjectsBuilder_ != null) {
        return includeObjectsBuilder_.getMessageOrBuilder();
      } else {
        return includeObjects_ == null ?
            com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance() : includeObjects_;
      }
    }
    /**
     * <pre>
     * Oracle objects to include in the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1.OracleRdbms, com.google.cloud.datastream.v1.OracleRdbms.Builder, com.google.cloud.datastream.v1.OracleRdbmsOrBuilder> 
        getIncludeObjectsFieldBuilder() {
      if (includeObjectsBuilder_ == null) {
        includeObjectsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1.OracleRdbms, com.google.cloud.datastream.v1.OracleRdbms.Builder, com.google.cloud.datastream.v1.OracleRdbmsOrBuilder>(
                getIncludeObjects(),
                getParentForChildren(),
                isClean());
        includeObjects_ = null;
      }
      return includeObjectsBuilder_;
    }

    private com.google.cloud.datastream.v1.OracleRdbms excludeObjects_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1.OracleRdbms, com.google.cloud.datastream.v1.OracleRdbms.Builder, com.google.cloud.datastream.v1.OracleRdbmsOrBuilder> excludeObjectsBuilder_;
    /**
     * <pre>
     * Oracle objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
     * @return Whether the excludeObjects field is set.
     */
    public boolean hasExcludeObjects() {
      return excludeObjectsBuilder_ != null || excludeObjects_ != null;
    }
    /**
     * <pre>
     * Oracle objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
     * @return The excludeObjects.
     */
    public com.google.cloud.datastream.v1.OracleRdbms getExcludeObjects() {
      if (excludeObjectsBuilder_ == null) {
        return excludeObjects_ == null ? com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance() : excludeObjects_;
      } else {
        return excludeObjectsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Oracle objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
     */
    public Builder setExcludeObjects(com.google.cloud.datastream.v1.OracleRdbms value) {
      if (excludeObjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        excludeObjects_ = value;
        onChanged();
      } else {
        excludeObjectsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Oracle objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
     */
    public Builder setExcludeObjects(
        com.google.cloud.datastream.v1.OracleRdbms.Builder builderForValue) {
      if (excludeObjectsBuilder_ == null) {
        excludeObjects_ = builderForValue.build();
        onChanged();
      } else {
        excludeObjectsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Oracle objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
     */
    public Builder mergeExcludeObjects(com.google.cloud.datastream.v1.OracleRdbms value) {
      if (excludeObjectsBuilder_ == null) {
        if (excludeObjects_ != null) {
          excludeObjects_ =
            com.google.cloud.datastream.v1.OracleRdbms.newBuilder(excludeObjects_).mergeFrom(value).buildPartial();
        } else {
          excludeObjects_ = value;
        }
        onChanged();
      } else {
        excludeObjectsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Oracle objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
     */
    public Builder clearExcludeObjects() {
      if (excludeObjectsBuilder_ == null) {
        excludeObjects_ = null;
        onChanged();
      } else {
        excludeObjects_ = null;
        excludeObjectsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Oracle objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
     */
    public com.google.cloud.datastream.v1.OracleRdbms.Builder getExcludeObjectsBuilder() {
      
      onChanged();
      return getExcludeObjectsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Oracle objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
     */
    public com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getExcludeObjectsOrBuilder() {
      if (excludeObjectsBuilder_ != null) {
        return excludeObjectsBuilder_.getMessageOrBuilder();
      } else {
        return excludeObjects_ == null ?
            com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance() : excludeObjects_;
      }
    }
    /**
     * <pre>
     * Oracle objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1.OracleRdbms, com.google.cloud.datastream.v1.OracleRdbms.Builder, com.google.cloud.datastream.v1.OracleRdbmsOrBuilder> 
        getExcludeObjectsFieldBuilder() {
      if (excludeObjectsBuilder_ == null) {
        excludeObjectsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1.OracleRdbms, com.google.cloud.datastream.v1.OracleRdbms.Builder, com.google.cloud.datastream.v1.OracleRdbmsOrBuilder>(
                getExcludeObjects(),
                getParentForChildren(),
                isClean());
        excludeObjects_ = null;
      }
      return excludeObjectsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1.OracleSourceConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1.OracleSourceConfig)
  private static final com.google.cloud.datastream.v1.OracleSourceConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1.OracleSourceConfig();
  }

  public static com.google.cloud.datastream.v1.OracleSourceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OracleSourceConfig>
      PARSER = new com.google.protobuf.AbstractParser<OracleSourceConfig>() {
    @java.lang.Override
    public OracleSourceConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OracleSourceConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OracleSourceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OracleSourceConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1.OracleSourceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

