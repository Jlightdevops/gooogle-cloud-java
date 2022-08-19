// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/timestamps.proto

package com.google.cloud.datacatalog.v1beta1;

/**
 * <pre>
 * Timestamps about this resource according to a particular system.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.SystemTimestamps}
 */
public final class SystemTimestamps extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.SystemTimestamps)
    SystemTimestampsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SystemTimestamps.newBuilder() to construct.
  private SystemTimestamps(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SystemTimestamps() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SystemTimestamps();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SystemTimestamps(
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
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (createTime_ != null) {
              subBuilder = createTime_.toBuilder();
            }
            createTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(createTime_);
              createTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (updateTime_ != null) {
              subBuilder = updateTime_.toBuilder();
            }
            updateTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateTime_);
              updateTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (expireTime_ != null) {
              subBuilder = expireTime_.toBuilder();
            }
            expireTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(expireTime_);
              expireTime_ = subBuilder.buildPartial();
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
    return com.google.cloud.datacatalog.v1beta1.Timestamps.internal_static_google_cloud_datacatalog_v1beta1_SystemTimestamps_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.Timestamps.internal_static_google_cloud_datacatalog_v1beta1_SystemTimestamps_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.SystemTimestamps.class, com.google.cloud.datacatalog.v1beta1.SystemTimestamps.Builder.class);
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * The creation time of the resource within the given system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * The creation time of the resource within the given system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * The creation time of the resource within the given system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return getCreateTime();
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   * <pre>
   * The last-modified time of the resource within the given system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   * <pre>
   * The last-modified time of the resource within the given system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   * <pre>
   * The last-modified time of the resource within the given system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
  }

  public static final int EXPIRE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp expireTime_;
  /**
   * <pre>
   * Output only. The expiration time of the resource within the given system.
   * Currently only apllicable to BigQuery resources.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the expireTime field is set.
   */
  @java.lang.Override
  public boolean hasExpireTime() {
    return expireTime_ != null;
  }
  /**
   * <pre>
   * Output only. The expiration time of the resource within the given system.
   * Currently only apllicable to BigQuery resources.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The expireTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getExpireTime() {
    return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
  }
  /**
   * <pre>
   * Output only. The expiration time of the resource within the given system.
   * Currently only apllicable to BigQuery resources.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
    return getExpireTime();
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
    if (createTime_ != null) {
      output.writeMessage(1, getCreateTime());
    }
    if (updateTime_ != null) {
      output.writeMessage(2, getUpdateTime());
    }
    if (expireTime_ != null) {
      output.writeMessage(3, getExpireTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCreateTime());
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateTime());
    }
    if (expireTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getExpireTime());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.SystemTimestamps)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.SystemTimestamps other = (com.google.cloud.datacatalog.v1beta1.SystemTimestamps) obj;

    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
    }
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime()
          .equals(other.getUpdateTime())) return false;
    }
    if (hasExpireTime() != other.hasExpireTime()) return false;
    if (hasExpireTime()) {
      if (!getExpireTime()
          .equals(other.getExpireTime())) return false;
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
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    if (hasExpireTime()) {
      hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpireTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.v1beta1.SystemTimestamps prototype) {
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
   * Timestamps about this resource according to a particular system.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.SystemTimestamps}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.SystemTimestamps)
      com.google.cloud.datacatalog.v1beta1.SystemTimestampsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.Timestamps.internal_static_google_cloud_datacatalog_v1beta1_SystemTimestamps_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.Timestamps.internal_static_google_cloud_datacatalog_v1beta1_SystemTimestamps_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.SystemTimestamps.class, com.google.cloud.datacatalog.v1beta1.SystemTimestamps.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.SystemTimestamps.newBuilder()
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
      if (createTimeBuilder_ == null) {
        createTime_ = null;
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }
      if (expireTimeBuilder_ == null) {
        expireTime_ = null;
      } else {
        expireTime_ = null;
        expireTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.Timestamps.internal_static_google_cloud_datacatalog_v1beta1_SystemTimestamps_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.SystemTimestamps getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.SystemTimestamps.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.SystemTimestamps build() {
      com.google.cloud.datacatalog.v1beta1.SystemTimestamps result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.SystemTimestamps buildPartial() {
      com.google.cloud.datacatalog.v1beta1.SystemTimestamps result = new com.google.cloud.datacatalog.v1beta1.SystemTimestamps(this);
      if (createTimeBuilder_ == null) {
        result.createTime_ = createTime_;
      } else {
        result.createTime_ = createTimeBuilder_.build();
      }
      if (updateTimeBuilder_ == null) {
        result.updateTime_ = updateTime_;
      } else {
        result.updateTime_ = updateTimeBuilder_.build();
      }
      if (expireTimeBuilder_ == null) {
        result.expireTime_ = expireTime_;
      } else {
        result.expireTime_ = expireTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1beta1.SystemTimestamps) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.SystemTimestamps)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.SystemTimestamps other) {
      if (other == com.google.cloud.datacatalog.v1beta1.SystemTimestamps.getDefaultInstance()) return this;
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      if (other.hasExpireTime()) {
        mergeExpireTime(other.getExpireTime());
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
      com.google.cloud.datacatalog.v1beta1.SystemTimestamps parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datacatalog.v1beta1.SystemTimestamps) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * The creation time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return createTimeBuilder_ != null || createTime_ != null;
    }
    /**
     * <pre>
     * The creation time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The creation time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
        onChanged();
      } else {
        createTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The creation time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
        onChanged();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The creation time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (createTime_ != null) {
          createTime_ =
            com.google.protobuf.Timestamp.newBuilder(createTime_).mergeFrom(value).buildPartial();
        } else {
          createTime_ = value;
        }
        onChanged();
      } else {
        createTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The creation time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public Builder clearCreateTime() {
      if (createTimeBuilder_ == null) {
        createTime_ = null;
        onChanged();
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The creation time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The creation time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <pre>
     * The creation time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updateTimeBuilder_;
    /**
     * <pre>
     * The last-modified time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return updateTimeBuilder_ != null || updateTime_ != null;
    }
    /**
     * <pre>
     * The last-modified time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The last-modified time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The last-modified time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public Builder setUpdateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The last-modified time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (updateTime_ != null) {
          updateTime_ =
            com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
        } else {
          updateTime_ = value;
        }
        onChanged();
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The last-modified time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public Builder clearUpdateTime() {
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
        onChanged();
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The last-modified time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
      
      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The last-modified time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
      }
    }
    /**
     * <pre>
     * The last-modified time of the resource within the given system.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(),
                getParentForChildren(),
                isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
    }

    private com.google.protobuf.Timestamp expireTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> expireTimeBuilder_;
    /**
     * <pre>
     * Output only. The expiration time of the resource within the given system.
     * Currently only apllicable to BigQuery resources.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the expireTime field is set.
     */
    public boolean hasExpireTime() {
      return expireTimeBuilder_ != null || expireTime_ != null;
    }
    /**
     * <pre>
     * Output only. The expiration time of the resource within the given system.
     * Currently only apllicable to BigQuery resources.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The expireTime.
     */
    public com.google.protobuf.Timestamp getExpireTime() {
      if (expireTimeBuilder_ == null) {
        return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
      } else {
        return expireTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The expiration time of the resource within the given system.
     * Currently only apllicable to BigQuery resources.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expireTime_ = value;
        onChanged();
      } else {
        expireTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The expiration time of the resource within the given system.
     * Currently only apllicable to BigQuery resources.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setExpireTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expireTimeBuilder_ == null) {
        expireTime_ = builderForValue.build();
        onChanged();
      } else {
        expireTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The expiration time of the resource within the given system.
     * Currently only apllicable to BigQuery resources.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (expireTime_ != null) {
          expireTime_ =
            com.google.protobuf.Timestamp.newBuilder(expireTime_).mergeFrom(value).buildPartial();
        } else {
          expireTime_ = value;
        }
        onChanged();
      } else {
        expireTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The expiration time of the resource within the given system.
     * Currently only apllicable to BigQuery resources.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearExpireTime() {
      if (expireTimeBuilder_ == null) {
        expireTime_ = null;
        onChanged();
      } else {
        expireTime_ = null;
        expireTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The expiration time of the resource within the given system.
     * Currently only apllicable to BigQuery resources.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpireTimeBuilder() {
      
      onChanged();
      return getExpireTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The expiration time of the resource within the given system.
     * Currently only apllicable to BigQuery resources.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
      if (expireTimeBuilder_ != null) {
        return expireTimeBuilder_.getMessageOrBuilder();
      } else {
        return expireTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
      }
    }
    /**
     * <pre>
     * Output only. The expiration time of the resource within the given system.
     * Currently only apllicable to BigQuery resources.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getExpireTimeFieldBuilder() {
      if (expireTimeBuilder_ == null) {
        expireTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getExpireTime(),
                getParentForChildren(),
                isClean());
        expireTime_ = null;
      }
      return expireTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.SystemTimestamps)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.SystemTimestamps)
  private static final com.google.cloud.datacatalog.v1beta1.SystemTimestamps DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.SystemTimestamps();
  }

  public static com.google.cloud.datacatalog.v1beta1.SystemTimestamps getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SystemTimestamps>
      PARSER = new com.google.protobuf.AbstractParser<SystemTimestamps>() {
    @java.lang.Override
    public SystemTimestamps parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SystemTimestamps(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SystemTimestamps> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SystemTimestamps> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.SystemTimestamps getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

