// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/dataplex_spec.proto

package com.google.cloud.datacatalog.v1;

/**
 * <pre>
 * Common Dataplex fields.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.DataplexSpec}
 */
public final class DataplexSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.DataplexSpec)
    DataplexSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DataplexSpec.newBuilder() to construct.
  private DataplexSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DataplexSpec() {
    asset_ = "";
    compressionFormat_ = "";
    projectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DataplexSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DataplexSpec(
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
            java.lang.String s = input.readStringRequireUtf8();

            asset_ = s;
            break;
          }
          case 18: {
            com.google.cloud.datacatalog.v1.PhysicalSchema.Builder subBuilder = null;
            if (dataFormat_ != null) {
              subBuilder = dataFormat_.toBuilder();
            }
            dataFormat_ = input.readMessage(com.google.cloud.datacatalog.v1.PhysicalSchema.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dataFormat_);
              dataFormat_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            compressionFormat_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            projectId_ = s;
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
    return com.google.cloud.datacatalog.v1.DataplexSpecProto.internal_static_google_cloud_datacatalog_v1_DataplexSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.DataplexSpecProto.internal_static_google_cloud_datacatalog_v1_DataplexSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.DataplexSpec.class, com.google.cloud.datacatalog.v1.DataplexSpec.Builder.class);
  }

  public static final int ASSET_FIELD_NUMBER = 1;
  private volatile java.lang.Object asset_;
  /**
   * <pre>
   * Fully qualified resource name of an asset in Dataplex, to which the
   * underlying data source (Cloud Storage bucket or BigQuery dataset) of the
   * entity is attached.
   * </pre>
   *
   * <code>string asset = 1;</code>
   * @return The asset.
   */
  @java.lang.Override
  public java.lang.String getAsset() {
    java.lang.Object ref = asset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      asset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Fully qualified resource name of an asset in Dataplex, to which the
   * underlying data source (Cloud Storage bucket or BigQuery dataset) of the
   * entity is attached.
   * </pre>
   *
   * <code>string asset = 1;</code>
   * @return The bytes for asset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetBytes() {
    java.lang.Object ref = asset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      asset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FORMAT_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1.PhysicalSchema dataFormat_;
  /**
   * <pre>
   * Format of the data.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
   * @return Whether the dataFormat field is set.
   */
  @java.lang.Override
  public boolean hasDataFormat() {
    return dataFormat_ != null;
  }
  /**
   * <pre>
   * Format of the data.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
   * @return The dataFormat.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.PhysicalSchema getDataFormat() {
    return dataFormat_ == null ? com.google.cloud.datacatalog.v1.PhysicalSchema.getDefaultInstance() : dataFormat_;
  }
  /**
   * <pre>
   * Format of the data.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.PhysicalSchemaOrBuilder getDataFormatOrBuilder() {
    return getDataFormat();
  }

  public static final int COMPRESSION_FORMAT_FIELD_NUMBER = 3;
  private volatile java.lang.Object compressionFormat_;
  /**
   * <pre>
   * Compression format of the data, e.g., zip, gzip etc.
   * </pre>
   *
   * <code>string compression_format = 3;</code>
   * @return The compressionFormat.
   */
  @java.lang.Override
  public java.lang.String getCompressionFormat() {
    java.lang.Object ref = compressionFormat_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      compressionFormat_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Compression format of the data, e.g., zip, gzip etc.
   * </pre>
   *
   * <code>string compression_format = 3;</code>
   * @return The bytes for compressionFormat.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCompressionFormatBytes() {
    java.lang.Object ref = compressionFormat_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      compressionFormat_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * Project ID of the underlying Cloud Storage or BigQuery data. Note that
   * this may not be the same project as the correspondingly Dataplex lake /
   * zone / asset.
   * </pre>
   *
   * <code>string project_id = 4;</code>
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Project ID of the underlying Cloud Storage or BigQuery data. Note that
   * this may not be the same project as the correspondingly Dataplex lake /
   * zone / asset.
   * </pre>
   *
   * <code>string project_id = 4;</code>
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(asset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, asset_);
    }
    if (dataFormat_ != null) {
      output.writeMessage(2, getDataFormat());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(compressionFormat_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, compressionFormat_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, projectId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(asset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, asset_);
    }
    if (dataFormat_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDataFormat());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(compressionFormat_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, compressionFormat_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, projectId_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.DataplexSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.DataplexSpec other = (com.google.cloud.datacatalog.v1.DataplexSpec) obj;

    if (!getAsset()
        .equals(other.getAsset())) return false;
    if (hasDataFormat() != other.hasDataFormat()) return false;
    if (hasDataFormat()) {
      if (!getDataFormat()
          .equals(other.getDataFormat())) return false;
    }
    if (!getCompressionFormat()
        .equals(other.getCompressionFormat())) return false;
    if (!getProjectId()
        .equals(other.getProjectId())) return false;
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
    hash = (37 * hash) + ASSET_FIELD_NUMBER;
    hash = (53 * hash) + getAsset().hashCode();
    if (hasDataFormat()) {
      hash = (37 * hash) + DATA_FORMAT_FIELD_NUMBER;
      hash = (53 * hash) + getDataFormat().hashCode();
    }
    hash = (37 * hash) + COMPRESSION_FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + getCompressionFormat().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.DataplexSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.DataplexSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.DataplexSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.DataplexSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.DataplexSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.DataplexSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.DataplexSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.DataplexSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.DataplexSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.DataplexSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.DataplexSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.DataplexSpec parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.v1.DataplexSpec prototype) {
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
   * Common Dataplex fields.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.DataplexSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.DataplexSpec)
      com.google.cloud.datacatalog.v1.DataplexSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.v1.DataplexSpecProto.internal_static_google_cloud_datacatalog_v1_DataplexSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.DataplexSpecProto.internal_static_google_cloud_datacatalog_v1_DataplexSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.DataplexSpec.class, com.google.cloud.datacatalog.v1.DataplexSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.DataplexSpec.newBuilder()
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
      asset_ = "";

      if (dataFormatBuilder_ == null) {
        dataFormat_ = null;
      } else {
        dataFormat_ = null;
        dataFormatBuilder_ = null;
      }
      compressionFormat_ = "";

      projectId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.DataplexSpecProto.internal_static_google_cloud_datacatalog_v1_DataplexSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataplexSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.DataplexSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataplexSpec build() {
      com.google.cloud.datacatalog.v1.DataplexSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataplexSpec buildPartial() {
      com.google.cloud.datacatalog.v1.DataplexSpec result = new com.google.cloud.datacatalog.v1.DataplexSpec(this);
      result.asset_ = asset_;
      if (dataFormatBuilder_ == null) {
        result.dataFormat_ = dataFormat_;
      } else {
        result.dataFormat_ = dataFormatBuilder_.build();
      }
      result.compressionFormat_ = compressionFormat_;
      result.projectId_ = projectId_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.DataplexSpec) {
        return mergeFrom((com.google.cloud.datacatalog.v1.DataplexSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.DataplexSpec other) {
      if (other == com.google.cloud.datacatalog.v1.DataplexSpec.getDefaultInstance()) return this;
      if (!other.getAsset().isEmpty()) {
        asset_ = other.asset_;
        onChanged();
      }
      if (other.hasDataFormat()) {
        mergeDataFormat(other.getDataFormat());
      }
      if (!other.getCompressionFormat().isEmpty()) {
        compressionFormat_ = other.compressionFormat_;
        onChanged();
      }
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
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
      com.google.cloud.datacatalog.v1.DataplexSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datacatalog.v1.DataplexSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object asset_ = "";
    /**
     * <pre>
     * Fully qualified resource name of an asset in Dataplex, to which the
     * underlying data source (Cloud Storage bucket or BigQuery dataset) of the
     * entity is attached.
     * </pre>
     *
     * <code>string asset = 1;</code>
     * @return The asset.
     */
    public java.lang.String getAsset() {
      java.lang.Object ref = asset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        asset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Fully qualified resource name of an asset in Dataplex, to which the
     * underlying data source (Cloud Storage bucket or BigQuery dataset) of the
     * entity is attached.
     * </pre>
     *
     * <code>string asset = 1;</code>
     * @return The bytes for asset.
     */
    public com.google.protobuf.ByteString
        getAssetBytes() {
      java.lang.Object ref = asset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        asset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Fully qualified resource name of an asset in Dataplex, to which the
     * underlying data source (Cloud Storage bucket or BigQuery dataset) of the
     * entity is attached.
     * </pre>
     *
     * <code>string asset = 1;</code>
     * @param value The asset to set.
     * @return This builder for chaining.
     */
    public Builder setAsset(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      asset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fully qualified resource name of an asset in Dataplex, to which the
     * underlying data source (Cloud Storage bucket or BigQuery dataset) of the
     * entity is attached.
     * </pre>
     *
     * <code>string asset = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAsset() {
      
      asset_ = getDefaultInstance().getAsset();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fully qualified resource name of an asset in Dataplex, to which the
     * underlying data source (Cloud Storage bucket or BigQuery dataset) of the
     * entity is attached.
     * </pre>
     *
     * <code>string asset = 1;</code>
     * @param value The bytes for asset to set.
     * @return This builder for chaining.
     */
    public Builder setAssetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      asset_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.v1.PhysicalSchema dataFormat_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.PhysicalSchema, com.google.cloud.datacatalog.v1.PhysicalSchema.Builder, com.google.cloud.datacatalog.v1.PhysicalSchemaOrBuilder> dataFormatBuilder_;
    /**
     * <pre>
     * Format of the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
     * @return Whether the dataFormat field is set.
     */
    public boolean hasDataFormat() {
      return dataFormatBuilder_ != null || dataFormat_ != null;
    }
    /**
     * <pre>
     * Format of the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
     * @return The dataFormat.
     */
    public com.google.cloud.datacatalog.v1.PhysicalSchema getDataFormat() {
      if (dataFormatBuilder_ == null) {
        return dataFormat_ == null ? com.google.cloud.datacatalog.v1.PhysicalSchema.getDefaultInstance() : dataFormat_;
      } else {
        return dataFormatBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Format of the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
     */
    public Builder setDataFormat(com.google.cloud.datacatalog.v1.PhysicalSchema value) {
      if (dataFormatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataFormat_ = value;
        onChanged();
      } else {
        dataFormatBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Format of the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
     */
    public Builder setDataFormat(
        com.google.cloud.datacatalog.v1.PhysicalSchema.Builder builderForValue) {
      if (dataFormatBuilder_ == null) {
        dataFormat_ = builderForValue.build();
        onChanged();
      } else {
        dataFormatBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Format of the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
     */
    public Builder mergeDataFormat(com.google.cloud.datacatalog.v1.PhysicalSchema value) {
      if (dataFormatBuilder_ == null) {
        if (dataFormat_ != null) {
          dataFormat_ =
            com.google.cloud.datacatalog.v1.PhysicalSchema.newBuilder(dataFormat_).mergeFrom(value).buildPartial();
        } else {
          dataFormat_ = value;
        }
        onChanged();
      } else {
        dataFormatBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Format of the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
     */
    public Builder clearDataFormat() {
      if (dataFormatBuilder_ == null) {
        dataFormat_ = null;
        onChanged();
      } else {
        dataFormat_ = null;
        dataFormatBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Format of the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
     */
    public com.google.cloud.datacatalog.v1.PhysicalSchema.Builder getDataFormatBuilder() {
      
      onChanged();
      return getDataFormatFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Format of the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
     */
    public com.google.cloud.datacatalog.v1.PhysicalSchemaOrBuilder getDataFormatOrBuilder() {
      if (dataFormatBuilder_ != null) {
        return dataFormatBuilder_.getMessageOrBuilder();
      } else {
        return dataFormat_ == null ?
            com.google.cloud.datacatalog.v1.PhysicalSchema.getDefaultInstance() : dataFormat_;
      }
    }
    /**
     * <pre>
     * Format of the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.PhysicalSchema, com.google.cloud.datacatalog.v1.PhysicalSchema.Builder, com.google.cloud.datacatalog.v1.PhysicalSchemaOrBuilder> 
        getDataFormatFieldBuilder() {
      if (dataFormatBuilder_ == null) {
        dataFormatBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.PhysicalSchema, com.google.cloud.datacatalog.v1.PhysicalSchema.Builder, com.google.cloud.datacatalog.v1.PhysicalSchemaOrBuilder>(
                getDataFormat(),
                getParentForChildren(),
                isClean());
        dataFormat_ = null;
      }
      return dataFormatBuilder_;
    }

    private java.lang.Object compressionFormat_ = "";
    /**
     * <pre>
     * Compression format of the data, e.g., zip, gzip etc.
     * </pre>
     *
     * <code>string compression_format = 3;</code>
     * @return The compressionFormat.
     */
    public java.lang.String getCompressionFormat() {
      java.lang.Object ref = compressionFormat_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        compressionFormat_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Compression format of the data, e.g., zip, gzip etc.
     * </pre>
     *
     * <code>string compression_format = 3;</code>
     * @return The bytes for compressionFormat.
     */
    public com.google.protobuf.ByteString
        getCompressionFormatBytes() {
      java.lang.Object ref = compressionFormat_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        compressionFormat_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Compression format of the data, e.g., zip, gzip etc.
     * </pre>
     *
     * <code>string compression_format = 3;</code>
     * @param value The compressionFormat to set.
     * @return This builder for chaining.
     */
    public Builder setCompressionFormat(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      compressionFormat_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Compression format of the data, e.g., zip, gzip etc.
     * </pre>
     *
     * <code>string compression_format = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompressionFormat() {
      
      compressionFormat_ = getDefaultInstance().getCompressionFormat();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Compression format of the data, e.g., zip, gzip etc.
     * </pre>
     *
     * <code>string compression_format = 3;</code>
     * @param value The bytes for compressionFormat to set.
     * @return This builder for chaining.
     */
    public Builder setCompressionFormatBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      compressionFormat_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * Project ID of the underlying Cloud Storage or BigQuery data. Note that
     * this may not be the same project as the correspondingly Dataplex lake /
     * zone / asset.
     * </pre>
     *
     * <code>string project_id = 4;</code>
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Project ID of the underlying Cloud Storage or BigQuery data. Note that
     * this may not be the same project as the correspondingly Dataplex lake /
     * zone / asset.
     * </pre>
     *
     * <code>string project_id = 4;</code>
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Project ID of the underlying Cloud Storage or BigQuery data. Note that
     * this may not be the same project as the correspondingly Dataplex lake /
     * zone / asset.
     * </pre>
     *
     * <code>string project_id = 4;</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID of the underlying Cloud Storage or BigQuery data. Note that
     * this may not be the same project as the correspondingly Dataplex lake /
     * zone / asset.
     * </pre>
     *
     * <code>string project_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID of the underlying Cloud Storage or BigQuery data. Note that
     * this may not be the same project as the correspondingly Dataplex lake /
     * zone / asset.
     * </pre>
     *
     * <code>string project_id = 4;</code>
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.DataplexSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.DataplexSpec)
  private static final com.google.cloud.datacatalog.v1.DataplexSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.DataplexSpec();
  }

  public static com.google.cloud.datacatalog.v1.DataplexSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataplexSpec>
      PARSER = new com.google.protobuf.AbstractParser<DataplexSpec>() {
    @java.lang.Override
    public DataplexSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DataplexSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DataplexSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataplexSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DataplexSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

