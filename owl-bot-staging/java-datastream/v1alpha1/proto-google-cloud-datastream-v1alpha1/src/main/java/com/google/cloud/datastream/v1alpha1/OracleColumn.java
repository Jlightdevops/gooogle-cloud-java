// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

/**
 * <pre>
 * Oracle Column.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1alpha1.OracleColumn}
 */
public final class OracleColumn extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1alpha1.OracleColumn)
    OracleColumnOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OracleColumn.newBuilder() to construct.
  private OracleColumn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OracleColumn() {
    columnName_ = "";
    dataType_ = "";
    encoding_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OracleColumn();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OracleColumn(
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

            columnName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dataType_ = s;
            break;
          }
          case 24: {

            length_ = input.readInt32();
            break;
          }
          case 32: {

            precision_ = input.readInt32();
            break;
          }
          case 40: {

            scale_ = input.readInt32();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            encoding_ = s;
            break;
          }
          case 56: {

            primaryKey_ = input.readBool();
            break;
          }
          case 64: {

            nullable_ = input.readBool();
            break;
          }
          case 72: {

            ordinalPosition_ = input.readInt32();
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
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_OracleColumn_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_OracleColumn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1alpha1.OracleColumn.class, com.google.cloud.datastream.v1alpha1.OracleColumn.Builder.class);
  }

  public static final int COLUMN_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object columnName_;
  /**
   * <pre>
   * Column name.
   * </pre>
   *
   * <code>string column_name = 1;</code>
   * @return The columnName.
   */
  @java.lang.Override
  public java.lang.String getColumnName() {
    java.lang.Object ref = columnName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      columnName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Column name.
   * </pre>
   *
   * <code>string column_name = 1;</code>
   * @return The bytes for columnName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getColumnNameBytes() {
    java.lang.Object ref = columnName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      columnName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object dataType_;
  /**
   * <pre>
   * The Oracle data type.
   * </pre>
   *
   * <code>string data_type = 2;</code>
   * @return The dataType.
   */
  @java.lang.Override
  public java.lang.String getDataType() {
    java.lang.Object ref = dataType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Oracle data type.
   * </pre>
   *
   * <code>string data_type = 2;</code>
   * @return The bytes for dataType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataTypeBytes() {
    java.lang.Object ref = dataType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LENGTH_FIELD_NUMBER = 3;
  private int length_;
  /**
   * <pre>
   * Column length.
   * </pre>
   *
   * <code>int32 length = 3;</code>
   * @return The length.
   */
  @java.lang.Override
  public int getLength() {
    return length_;
  }

  public static final int PRECISION_FIELD_NUMBER = 4;
  private int precision_;
  /**
   * <pre>
   * Column precision.
   * </pre>
   *
   * <code>int32 precision = 4;</code>
   * @return The precision.
   */
  @java.lang.Override
  public int getPrecision() {
    return precision_;
  }

  public static final int SCALE_FIELD_NUMBER = 5;
  private int scale_;
  /**
   * <pre>
   * Column scale.
   * </pre>
   *
   * <code>int32 scale = 5;</code>
   * @return The scale.
   */
  @java.lang.Override
  public int getScale() {
    return scale_;
  }

  public static final int ENCODING_FIELD_NUMBER = 6;
  private volatile java.lang.Object encoding_;
  /**
   * <pre>
   * Column encoding.
   * </pre>
   *
   * <code>string encoding = 6;</code>
   * @return The encoding.
   */
  @java.lang.Override
  public java.lang.String getEncoding() {
    java.lang.Object ref = encoding_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      encoding_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Column encoding.
   * </pre>
   *
   * <code>string encoding = 6;</code>
   * @return The bytes for encoding.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEncodingBytes() {
    java.lang.Object ref = encoding_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      encoding_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIMARY_KEY_FIELD_NUMBER = 7;
  private boolean primaryKey_;
  /**
   * <pre>
   * Whether or not the column represents a primary key.
   * </pre>
   *
   * <code>bool primary_key = 7;</code>
   * @return The primaryKey.
   */
  @java.lang.Override
  public boolean getPrimaryKey() {
    return primaryKey_;
  }

  public static final int NULLABLE_FIELD_NUMBER = 8;
  private boolean nullable_;
  /**
   * <pre>
   * Whether or not the column can accept a null value.
   * </pre>
   *
   * <code>bool nullable = 8;</code>
   * @return The nullable.
   */
  @java.lang.Override
  public boolean getNullable() {
    return nullable_;
  }

  public static final int ORDINAL_POSITION_FIELD_NUMBER = 9;
  private int ordinalPosition_;
  /**
   * <pre>
   * The ordinal position of the column in the table.
   * </pre>
   *
   * <code>int32 ordinal_position = 9;</code>
   * @return The ordinalPosition.
   */
  @java.lang.Override
  public int getOrdinalPosition() {
    return ordinalPosition_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(columnName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, columnName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dataType_);
    }
    if (length_ != 0) {
      output.writeInt32(3, length_);
    }
    if (precision_ != 0) {
      output.writeInt32(4, precision_);
    }
    if (scale_ != 0) {
      output.writeInt32(5, scale_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(encoding_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, encoding_);
    }
    if (primaryKey_ != false) {
      output.writeBool(7, primaryKey_);
    }
    if (nullable_ != false) {
      output.writeBool(8, nullable_);
    }
    if (ordinalPosition_ != 0) {
      output.writeInt32(9, ordinalPosition_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(columnName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, columnName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dataType_);
    }
    if (length_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, length_);
    }
    if (precision_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, precision_);
    }
    if (scale_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, scale_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(encoding_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, encoding_);
    }
    if (primaryKey_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, primaryKey_);
    }
    if (nullable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, nullable_);
    }
    if (ordinalPosition_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, ordinalPosition_);
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
    if (!(obj instanceof com.google.cloud.datastream.v1alpha1.OracleColumn)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1alpha1.OracleColumn other = (com.google.cloud.datastream.v1alpha1.OracleColumn) obj;

    if (!getColumnName()
        .equals(other.getColumnName())) return false;
    if (!getDataType()
        .equals(other.getDataType())) return false;
    if (getLength()
        != other.getLength()) return false;
    if (getPrecision()
        != other.getPrecision()) return false;
    if (getScale()
        != other.getScale()) return false;
    if (!getEncoding()
        .equals(other.getEncoding())) return false;
    if (getPrimaryKey()
        != other.getPrimaryKey()) return false;
    if (getNullable()
        != other.getNullable()) return false;
    if (getOrdinalPosition()
        != other.getOrdinalPosition()) return false;
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
    hash = (37 * hash) + COLUMN_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getColumnName().hashCode();
    hash = (37 * hash) + DATA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDataType().hashCode();
    hash = (37 * hash) + LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getLength();
    hash = (37 * hash) + PRECISION_FIELD_NUMBER;
    hash = (53 * hash) + getPrecision();
    hash = (37 * hash) + SCALE_FIELD_NUMBER;
    hash = (53 * hash) + getScale();
    hash = (37 * hash) + ENCODING_FIELD_NUMBER;
    hash = (53 * hash) + getEncoding().hashCode();
    hash = (37 * hash) + PRIMARY_KEY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPrimaryKey());
    hash = (37 * hash) + NULLABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNullable());
    hash = (37 * hash) + ORDINAL_POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getOrdinalPosition();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1alpha1.OracleColumn parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1alpha1.OracleColumn parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.OracleColumn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1alpha1.OracleColumn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.OracleColumn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1alpha1.OracleColumn parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.OracleColumn parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1alpha1.OracleColumn parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.OracleColumn parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1alpha1.OracleColumn parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.OracleColumn parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1alpha1.OracleColumn parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datastream.v1alpha1.OracleColumn prototype) {
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
   * Oracle Column.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1alpha1.OracleColumn}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1alpha1.OracleColumn)
      com.google.cloud.datastream.v1alpha1.OracleColumnOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_OracleColumn_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_OracleColumn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1alpha1.OracleColumn.class, com.google.cloud.datastream.v1alpha1.OracleColumn.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1alpha1.OracleColumn.newBuilder()
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
      columnName_ = "";

      dataType_ = "";

      length_ = 0;

      precision_ = 0;

      scale_ = 0;

      encoding_ = "";

      primaryKey_ = false;

      nullable_ = false;

      ordinalPosition_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_OracleColumn_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.OracleColumn getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1alpha1.OracleColumn.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.OracleColumn build() {
      com.google.cloud.datastream.v1alpha1.OracleColumn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.OracleColumn buildPartial() {
      com.google.cloud.datastream.v1alpha1.OracleColumn result = new com.google.cloud.datastream.v1alpha1.OracleColumn(this);
      result.columnName_ = columnName_;
      result.dataType_ = dataType_;
      result.length_ = length_;
      result.precision_ = precision_;
      result.scale_ = scale_;
      result.encoding_ = encoding_;
      result.primaryKey_ = primaryKey_;
      result.nullable_ = nullable_;
      result.ordinalPosition_ = ordinalPosition_;
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
      if (other instanceof com.google.cloud.datastream.v1alpha1.OracleColumn) {
        return mergeFrom((com.google.cloud.datastream.v1alpha1.OracleColumn)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1alpha1.OracleColumn other) {
      if (other == com.google.cloud.datastream.v1alpha1.OracleColumn.getDefaultInstance()) return this;
      if (!other.getColumnName().isEmpty()) {
        columnName_ = other.columnName_;
        onChanged();
      }
      if (!other.getDataType().isEmpty()) {
        dataType_ = other.dataType_;
        onChanged();
      }
      if (other.getLength() != 0) {
        setLength(other.getLength());
      }
      if (other.getPrecision() != 0) {
        setPrecision(other.getPrecision());
      }
      if (other.getScale() != 0) {
        setScale(other.getScale());
      }
      if (!other.getEncoding().isEmpty()) {
        encoding_ = other.encoding_;
        onChanged();
      }
      if (other.getPrimaryKey() != false) {
        setPrimaryKey(other.getPrimaryKey());
      }
      if (other.getNullable() != false) {
        setNullable(other.getNullable());
      }
      if (other.getOrdinalPosition() != 0) {
        setOrdinalPosition(other.getOrdinalPosition());
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
      com.google.cloud.datastream.v1alpha1.OracleColumn parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datastream.v1alpha1.OracleColumn) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object columnName_ = "";
    /**
     * <pre>
     * Column name.
     * </pre>
     *
     * <code>string column_name = 1;</code>
     * @return The columnName.
     */
    public java.lang.String getColumnName() {
      java.lang.Object ref = columnName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        columnName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Column name.
     * </pre>
     *
     * <code>string column_name = 1;</code>
     * @return The bytes for columnName.
     */
    public com.google.protobuf.ByteString
        getColumnNameBytes() {
      java.lang.Object ref = columnName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        columnName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Column name.
     * </pre>
     *
     * <code>string column_name = 1;</code>
     * @param value The columnName to set.
     * @return This builder for chaining.
     */
    public Builder setColumnName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      columnName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Column name.
     * </pre>
     *
     * <code>string column_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearColumnName() {
      
      columnName_ = getDefaultInstance().getColumnName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Column name.
     * </pre>
     *
     * <code>string column_name = 1;</code>
     * @param value The bytes for columnName to set.
     * @return This builder for chaining.
     */
    public Builder setColumnNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      columnName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dataType_ = "";
    /**
     * <pre>
     * The Oracle data type.
     * </pre>
     *
     * <code>string data_type = 2;</code>
     * @return The dataType.
     */
    public java.lang.String getDataType() {
      java.lang.Object ref = dataType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Oracle data type.
     * </pre>
     *
     * <code>string data_type = 2;</code>
     * @return The bytes for dataType.
     */
    public com.google.protobuf.ByteString
        getDataTypeBytes() {
      java.lang.Object ref = dataType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Oracle data type.
     * </pre>
     *
     * <code>string data_type = 2;</code>
     * @param value The dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dataType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Oracle data type.
     * </pre>
     *
     * <code>string data_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataType() {
      
      dataType_ = getDefaultInstance().getDataType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Oracle data type.
     * </pre>
     *
     * <code>string data_type = 2;</code>
     * @param value The bytes for dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dataType_ = value;
      onChanged();
      return this;
    }

    private int length_ ;
    /**
     * <pre>
     * Column length.
     * </pre>
     *
     * <code>int32 length = 3;</code>
     * @return The length.
     */
    @java.lang.Override
    public int getLength() {
      return length_;
    }
    /**
     * <pre>
     * Column length.
     * </pre>
     *
     * <code>int32 length = 3;</code>
     * @param value The length to set.
     * @return This builder for chaining.
     */
    public Builder setLength(int value) {
      
      length_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Column length.
     * </pre>
     *
     * <code>int32 length = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLength() {
      
      length_ = 0;
      onChanged();
      return this;
    }

    private int precision_ ;
    /**
     * <pre>
     * Column precision.
     * </pre>
     *
     * <code>int32 precision = 4;</code>
     * @return The precision.
     */
    @java.lang.Override
    public int getPrecision() {
      return precision_;
    }
    /**
     * <pre>
     * Column precision.
     * </pre>
     *
     * <code>int32 precision = 4;</code>
     * @param value The precision to set.
     * @return This builder for chaining.
     */
    public Builder setPrecision(int value) {
      
      precision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Column precision.
     * </pre>
     *
     * <code>int32 precision = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrecision() {
      
      precision_ = 0;
      onChanged();
      return this;
    }

    private int scale_ ;
    /**
     * <pre>
     * Column scale.
     * </pre>
     *
     * <code>int32 scale = 5;</code>
     * @return The scale.
     */
    @java.lang.Override
    public int getScale() {
      return scale_;
    }
    /**
     * <pre>
     * Column scale.
     * </pre>
     *
     * <code>int32 scale = 5;</code>
     * @param value The scale to set.
     * @return This builder for chaining.
     */
    public Builder setScale(int value) {
      
      scale_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Column scale.
     * </pre>
     *
     * <code>int32 scale = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearScale() {
      
      scale_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object encoding_ = "";
    /**
     * <pre>
     * Column encoding.
     * </pre>
     *
     * <code>string encoding = 6;</code>
     * @return The encoding.
     */
    public java.lang.String getEncoding() {
      java.lang.Object ref = encoding_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        encoding_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Column encoding.
     * </pre>
     *
     * <code>string encoding = 6;</code>
     * @return The bytes for encoding.
     */
    public com.google.protobuf.ByteString
        getEncodingBytes() {
      java.lang.Object ref = encoding_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        encoding_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Column encoding.
     * </pre>
     *
     * <code>string encoding = 6;</code>
     * @param value The encoding to set.
     * @return This builder for chaining.
     */
    public Builder setEncoding(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      encoding_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Column encoding.
     * </pre>
     *
     * <code>string encoding = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncoding() {
      
      encoding_ = getDefaultInstance().getEncoding();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Column encoding.
     * </pre>
     *
     * <code>string encoding = 6;</code>
     * @param value The bytes for encoding to set.
     * @return This builder for chaining.
     */
    public Builder setEncodingBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      encoding_ = value;
      onChanged();
      return this;
    }

    private boolean primaryKey_ ;
    /**
     * <pre>
     * Whether or not the column represents a primary key.
     * </pre>
     *
     * <code>bool primary_key = 7;</code>
     * @return The primaryKey.
     */
    @java.lang.Override
    public boolean getPrimaryKey() {
      return primaryKey_;
    }
    /**
     * <pre>
     * Whether or not the column represents a primary key.
     * </pre>
     *
     * <code>bool primary_key = 7;</code>
     * @param value The primaryKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryKey(boolean value) {
      
      primaryKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not the column represents a primary key.
     * </pre>
     *
     * <code>bool primary_key = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrimaryKey() {
      
      primaryKey_ = false;
      onChanged();
      return this;
    }

    private boolean nullable_ ;
    /**
     * <pre>
     * Whether or not the column can accept a null value.
     * </pre>
     *
     * <code>bool nullable = 8;</code>
     * @return The nullable.
     */
    @java.lang.Override
    public boolean getNullable() {
      return nullable_;
    }
    /**
     * <pre>
     * Whether or not the column can accept a null value.
     * </pre>
     *
     * <code>bool nullable = 8;</code>
     * @param value The nullable to set.
     * @return This builder for chaining.
     */
    public Builder setNullable(boolean value) {
      
      nullable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not the column can accept a null value.
     * </pre>
     *
     * <code>bool nullable = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearNullable() {
      
      nullable_ = false;
      onChanged();
      return this;
    }

    private int ordinalPosition_ ;
    /**
     * <pre>
     * The ordinal position of the column in the table.
     * </pre>
     *
     * <code>int32 ordinal_position = 9;</code>
     * @return The ordinalPosition.
     */
    @java.lang.Override
    public int getOrdinalPosition() {
      return ordinalPosition_;
    }
    /**
     * <pre>
     * The ordinal position of the column in the table.
     * </pre>
     *
     * <code>int32 ordinal_position = 9;</code>
     * @param value The ordinalPosition to set.
     * @return This builder for chaining.
     */
    public Builder setOrdinalPosition(int value) {
      
      ordinalPosition_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ordinal position of the column in the table.
     * </pre>
     *
     * <code>int32 ordinal_position = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrdinalPosition() {
      
      ordinalPosition_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1alpha1.OracleColumn)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1alpha1.OracleColumn)
  private static final com.google.cloud.datastream.v1alpha1.OracleColumn DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1alpha1.OracleColumn();
  }

  public static com.google.cloud.datastream.v1alpha1.OracleColumn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OracleColumn>
      PARSER = new com.google.protobuf.AbstractParser<OracleColumn>() {
    @java.lang.Override
    public OracleColumn parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OracleColumn(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OracleColumn> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OracleColumn> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.OracleColumn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

