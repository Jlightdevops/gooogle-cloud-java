// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

/**
 * <pre>
 * JSON file format configuration.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1.JsonFileFormat}
 */
public final class JsonFileFormat extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1.JsonFileFormat)
    JsonFileFormatOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JsonFileFormat.newBuilder() to construct.
  private JsonFileFormat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JsonFileFormat() {
    schemaFileFormat_ = 0;
    compression_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JsonFileFormat();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JsonFileFormat(
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
          case 8: {
            int rawValue = input.readEnum();

            schemaFileFormat_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            compression_ = rawValue;
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
    return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_JsonFileFormat_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_JsonFileFormat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1.JsonFileFormat.class, com.google.cloud.datastream.v1.JsonFileFormat.Builder.class);
  }

  /**
   * <pre>
   * Schema file format.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat}
   */
  public enum SchemaFileFormat
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified schema file format.
     * </pre>
     *
     * <code>SCHEMA_FILE_FORMAT_UNSPECIFIED = 0;</code>
     */
    SCHEMA_FILE_FORMAT_UNSPECIFIED(0),
    /**
     * <pre>
     * Do not attach schema file.
     * </pre>
     *
     * <code>NO_SCHEMA_FILE = 1;</code>
     */
    NO_SCHEMA_FILE(1),
    /**
     * <pre>
     * Avro schema format.
     * </pre>
     *
     * <code>AVRO_SCHEMA_FILE = 2;</code>
     */
    AVRO_SCHEMA_FILE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified schema file format.
     * </pre>
     *
     * <code>SCHEMA_FILE_FORMAT_UNSPECIFIED = 0;</code>
     */
    public static final int SCHEMA_FILE_FORMAT_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Do not attach schema file.
     * </pre>
     *
     * <code>NO_SCHEMA_FILE = 1;</code>
     */
    public static final int NO_SCHEMA_FILE_VALUE = 1;
    /**
     * <pre>
     * Avro schema format.
     * </pre>
     *
     * <code>AVRO_SCHEMA_FILE = 2;</code>
     */
    public static final int AVRO_SCHEMA_FILE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SchemaFileFormat valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SchemaFileFormat forNumber(int value) {
      switch (value) {
        case 0: return SCHEMA_FILE_FORMAT_UNSPECIFIED;
        case 1: return NO_SCHEMA_FILE;
        case 2: return AVRO_SCHEMA_FILE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SchemaFileFormat>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SchemaFileFormat> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SchemaFileFormat>() {
            public SchemaFileFormat findValueByNumber(int number) {
              return SchemaFileFormat.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1.JsonFileFormat.getDescriptor().getEnumTypes().get(0);
    }

    private static final SchemaFileFormat[] VALUES = values();

    public static SchemaFileFormat valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SchemaFileFormat(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat)
  }

  /**
   * <pre>
   * Json file compression.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.datastream.v1.JsonFileFormat.JsonCompression}
   */
  public enum JsonCompression
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified json file compression.
     * </pre>
     *
     * <code>JSON_COMPRESSION_UNSPECIFIED = 0;</code>
     */
    JSON_COMPRESSION_UNSPECIFIED(0),
    /**
     * <pre>
     * Do not compress JSON file.
     * </pre>
     *
     * <code>NO_COMPRESSION = 1;</code>
     */
    NO_COMPRESSION(1),
    /**
     * <pre>
     * Gzip compression.
     * </pre>
     *
     * <code>GZIP = 2;</code>
     */
    GZIP(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified json file compression.
     * </pre>
     *
     * <code>JSON_COMPRESSION_UNSPECIFIED = 0;</code>
     */
    public static final int JSON_COMPRESSION_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Do not compress JSON file.
     * </pre>
     *
     * <code>NO_COMPRESSION = 1;</code>
     */
    public static final int NO_COMPRESSION_VALUE = 1;
    /**
     * <pre>
     * Gzip compression.
     * </pre>
     *
     * <code>GZIP = 2;</code>
     */
    public static final int GZIP_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static JsonCompression valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static JsonCompression forNumber(int value) {
      switch (value) {
        case 0: return JSON_COMPRESSION_UNSPECIFIED;
        case 1: return NO_COMPRESSION;
        case 2: return GZIP;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<JsonCompression>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        JsonCompression> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<JsonCompression>() {
            public JsonCompression findValueByNumber(int number) {
              return JsonCompression.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1.JsonFileFormat.getDescriptor().getEnumTypes().get(1);
    }

    private static final JsonCompression[] VALUES = values();

    public static JsonCompression valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private JsonCompression(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.datastream.v1.JsonFileFormat.JsonCompression)
  }

  public static final int SCHEMA_FILE_FORMAT_FIELD_NUMBER = 1;
  private int schemaFileFormat_;
  /**
   * <pre>
   * The schema file format along JSON data files.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat schema_file_format = 1;</code>
   * @return The enum numeric value on the wire for schemaFileFormat.
   */
  @java.lang.Override public int getSchemaFileFormatValue() {
    return schemaFileFormat_;
  }
  /**
   * <pre>
   * The schema file format along JSON data files.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat schema_file_format = 1;</code>
   * @return The schemaFileFormat.
   */
  @java.lang.Override public com.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat getSchemaFileFormat() {
    @SuppressWarnings("deprecation")
    com.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat result = com.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat.valueOf(schemaFileFormat_);
    return result == null ? com.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat.UNRECOGNIZED : result;
  }

  public static final int COMPRESSION_FIELD_NUMBER = 2;
  private int compression_;
  /**
   * <pre>
   * Compression of the loaded JSON file.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.JsonFileFormat.JsonCompression compression = 2;</code>
   * @return The enum numeric value on the wire for compression.
   */
  @java.lang.Override public int getCompressionValue() {
    return compression_;
  }
  /**
   * <pre>
   * Compression of the loaded JSON file.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.JsonFileFormat.JsonCompression compression = 2;</code>
   * @return The compression.
   */
  @java.lang.Override public com.google.cloud.datastream.v1.JsonFileFormat.JsonCompression getCompression() {
    @SuppressWarnings("deprecation")
    com.google.cloud.datastream.v1.JsonFileFormat.JsonCompression result = com.google.cloud.datastream.v1.JsonFileFormat.JsonCompression.valueOf(compression_);
    return result == null ? com.google.cloud.datastream.v1.JsonFileFormat.JsonCompression.UNRECOGNIZED : result;
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
    if (schemaFileFormat_ != com.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat.SCHEMA_FILE_FORMAT_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, schemaFileFormat_);
    }
    if (compression_ != com.google.cloud.datastream.v1.JsonFileFormat.JsonCompression.JSON_COMPRESSION_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, compression_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (schemaFileFormat_ != com.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat.SCHEMA_FILE_FORMAT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, schemaFileFormat_);
    }
    if (compression_ != com.google.cloud.datastream.v1.JsonFileFormat.JsonCompression.JSON_COMPRESSION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, compression_);
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
    if (!(obj instanceof com.google.cloud.datastream.v1.JsonFileFormat)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1.JsonFileFormat other = (com.google.cloud.datastream.v1.JsonFileFormat) obj;

    if (schemaFileFormat_ != other.schemaFileFormat_) return false;
    if (compression_ != other.compression_) return false;
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
    hash = (37 * hash) + SCHEMA_FILE_FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + schemaFileFormat_;
    hash = (37 * hash) + COMPRESSION_FIELD_NUMBER;
    hash = (53 * hash) + compression_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1.JsonFileFormat parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.JsonFileFormat parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.JsonFileFormat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.JsonFileFormat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.JsonFileFormat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.JsonFileFormat parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.JsonFileFormat parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.JsonFileFormat parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.JsonFileFormat parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.JsonFileFormat parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.JsonFileFormat parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.JsonFileFormat parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datastream.v1.JsonFileFormat prototype) {
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
   * JSON file format configuration.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1.JsonFileFormat}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1.JsonFileFormat)
      com.google.cloud.datastream.v1.JsonFileFormatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_JsonFileFormat_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_JsonFileFormat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1.JsonFileFormat.class, com.google.cloud.datastream.v1.JsonFileFormat.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1.JsonFileFormat.newBuilder()
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
      schemaFileFormat_ = 0;

      compression_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_JsonFileFormat_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.JsonFileFormat getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1.JsonFileFormat.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.JsonFileFormat build() {
      com.google.cloud.datastream.v1.JsonFileFormat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.JsonFileFormat buildPartial() {
      com.google.cloud.datastream.v1.JsonFileFormat result = new com.google.cloud.datastream.v1.JsonFileFormat(this);
      result.schemaFileFormat_ = schemaFileFormat_;
      result.compression_ = compression_;
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
      if (other instanceof com.google.cloud.datastream.v1.JsonFileFormat) {
        return mergeFrom((com.google.cloud.datastream.v1.JsonFileFormat)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1.JsonFileFormat other) {
      if (other == com.google.cloud.datastream.v1.JsonFileFormat.getDefaultInstance()) return this;
      if (other.schemaFileFormat_ != 0) {
        setSchemaFileFormatValue(other.getSchemaFileFormatValue());
      }
      if (other.compression_ != 0) {
        setCompressionValue(other.getCompressionValue());
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
      com.google.cloud.datastream.v1.JsonFileFormat parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datastream.v1.JsonFileFormat) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int schemaFileFormat_ = 0;
    /**
     * <pre>
     * The schema file format along JSON data files.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat schema_file_format = 1;</code>
     * @return The enum numeric value on the wire for schemaFileFormat.
     */
    @java.lang.Override public int getSchemaFileFormatValue() {
      return schemaFileFormat_;
    }
    /**
     * <pre>
     * The schema file format along JSON data files.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat schema_file_format = 1;</code>
     * @param value The enum numeric value on the wire for schemaFileFormat to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaFileFormatValue(int value) {
      
      schemaFileFormat_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The schema file format along JSON data files.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat schema_file_format = 1;</code>
     * @return The schemaFileFormat.
     */
    @java.lang.Override
    public com.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat getSchemaFileFormat() {
      @SuppressWarnings("deprecation")
      com.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat result = com.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat.valueOf(schemaFileFormat_);
      return result == null ? com.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The schema file format along JSON data files.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat schema_file_format = 1;</code>
     * @param value The schemaFileFormat to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaFileFormat(com.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      schemaFileFormat_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The schema file format along JSON data files.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.JsonFileFormat.SchemaFileFormat schema_file_format = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSchemaFileFormat() {
      
      schemaFileFormat_ = 0;
      onChanged();
      return this;
    }

    private int compression_ = 0;
    /**
     * <pre>
     * Compression of the loaded JSON file.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.JsonFileFormat.JsonCompression compression = 2;</code>
     * @return The enum numeric value on the wire for compression.
     */
    @java.lang.Override public int getCompressionValue() {
      return compression_;
    }
    /**
     * <pre>
     * Compression of the loaded JSON file.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.JsonFileFormat.JsonCompression compression = 2;</code>
     * @param value The enum numeric value on the wire for compression to set.
     * @return This builder for chaining.
     */
    public Builder setCompressionValue(int value) {
      
      compression_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Compression of the loaded JSON file.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.JsonFileFormat.JsonCompression compression = 2;</code>
     * @return The compression.
     */
    @java.lang.Override
    public com.google.cloud.datastream.v1.JsonFileFormat.JsonCompression getCompression() {
      @SuppressWarnings("deprecation")
      com.google.cloud.datastream.v1.JsonFileFormat.JsonCompression result = com.google.cloud.datastream.v1.JsonFileFormat.JsonCompression.valueOf(compression_);
      return result == null ? com.google.cloud.datastream.v1.JsonFileFormat.JsonCompression.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Compression of the loaded JSON file.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.JsonFileFormat.JsonCompression compression = 2;</code>
     * @param value The compression to set.
     * @return This builder for chaining.
     */
    public Builder setCompression(com.google.cloud.datastream.v1.JsonFileFormat.JsonCompression value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      compression_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Compression of the loaded JSON file.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.JsonFileFormat.JsonCompression compression = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompression() {
      
      compression_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1.JsonFileFormat)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1.JsonFileFormat)
  private static final com.google.cloud.datastream.v1.JsonFileFormat DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1.JsonFileFormat();
  }

  public static com.google.cloud.datastream.v1.JsonFileFormat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JsonFileFormat>
      PARSER = new com.google.protobuf.AbstractParser<JsonFileFormat>() {
    @java.lang.Override
    public JsonFileFormat parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JsonFileFormat(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JsonFileFormat> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JsonFileFormat> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1.JsonFileFormat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

