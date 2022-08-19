// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v2/trace.proto

package com.google.devtools.cloudtrace.v2;

/**
 * <pre>
 * Represents a string that might be shortened to a specified length.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudtrace.v2.TruncatableString}
 */
public final class TruncatableString extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudtrace.v2.TruncatableString)
    TruncatableStringOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TruncatableString.newBuilder() to construct.
  private TruncatableString(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TruncatableString() {
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TruncatableString();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TruncatableString(
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

            value_ = s;
            break;
          }
          case 16: {

            truncatedByteCount_ = input.readInt32();
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
    return com.google.devtools.cloudtrace.v2.TraceProto.internal_static_google_devtools_cloudtrace_v2_TruncatableString_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.cloudtrace.v2.TraceProto.internal_static_google_devtools_cloudtrace_v2_TruncatableString_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.cloudtrace.v2.TruncatableString.class, com.google.devtools.cloudtrace.v2.TruncatableString.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private volatile java.lang.Object value_;
  /**
   * <pre>
   * The shortened string. For example, if the original string is 500
   * bytes long and the limit of the string is 128 bytes, then
   * `value` contains the first 128 bytes of the 500-byte string.
   * Truncation always happens on a UTF8 character boundary. If there
   * are multi-byte characters in the string, then the length of the
   * shortened string might be less than the size limit.
   * </pre>
   *
   * <code>string value = 1;</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The shortened string. For example, if the original string is 500
   * bytes long and the limit of the string is 128 bytes, then
   * `value` contains the first 128 bytes of the 500-byte string.
   * Truncation always happens on a UTF8 character boundary. If there
   * are multi-byte characters in the string, then the length of the
   * shortened string might be less than the size limit.
   * </pre>
   *
   * <code>string value = 1;</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRUNCATED_BYTE_COUNT_FIELD_NUMBER = 2;
  private int truncatedByteCount_;
  /**
   * <pre>
   * The number of bytes removed from the original string. If this
   * value is 0, then the string was not shortened.
   * </pre>
   *
   * <code>int32 truncated_byte_count = 2;</code>
   * @return The truncatedByteCount.
   */
  @java.lang.Override
  public int getTruncatedByteCount() {
    return truncatedByteCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, value_);
    }
    if (truncatedByteCount_ != 0) {
      output.writeInt32(2, truncatedByteCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, value_);
    }
    if (truncatedByteCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, truncatedByteCount_);
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
    if (!(obj instanceof com.google.devtools.cloudtrace.v2.TruncatableString)) {
      return super.equals(obj);
    }
    com.google.devtools.cloudtrace.v2.TruncatableString other = (com.google.devtools.cloudtrace.v2.TruncatableString) obj;

    if (!getValue()
        .equals(other.getValue())) return false;
    if (getTruncatedByteCount()
        != other.getTruncatedByteCount()) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + TRUNCATED_BYTE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTruncatedByteCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.cloudtrace.v2.TruncatableString parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v2.TruncatableString parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.TruncatableString parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v2.TruncatableString parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.TruncatableString parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v2.TruncatableString parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.TruncatableString parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v2.TruncatableString parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.TruncatableString parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v2.TruncatableString parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.TruncatableString parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v2.TruncatableString parseFrom(
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
  public static Builder newBuilder(com.google.devtools.cloudtrace.v2.TruncatableString prototype) {
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
   * Represents a string that might be shortened to a specified length.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudtrace.v2.TruncatableString}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudtrace.v2.TruncatableString)
      com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.cloudtrace.v2.TraceProto.internal_static_google_devtools_cloudtrace_v2_TruncatableString_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.cloudtrace.v2.TraceProto.internal_static_google_devtools_cloudtrace_v2_TruncatableString_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.cloudtrace.v2.TruncatableString.class, com.google.devtools.cloudtrace.v2.TruncatableString.Builder.class);
    }

    // Construct using com.google.devtools.cloudtrace.v2.TruncatableString.newBuilder()
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
      value_ = "";

      truncatedByteCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.cloudtrace.v2.TraceProto.internal_static_google_devtools_cloudtrace_v2_TruncatableString_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.TruncatableString getDefaultInstanceForType() {
      return com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.TruncatableString build() {
      com.google.devtools.cloudtrace.v2.TruncatableString result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.TruncatableString buildPartial() {
      com.google.devtools.cloudtrace.v2.TruncatableString result = new com.google.devtools.cloudtrace.v2.TruncatableString(this);
      result.value_ = value_;
      result.truncatedByteCount_ = truncatedByteCount_;
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
      if (other instanceof com.google.devtools.cloudtrace.v2.TruncatableString) {
        return mergeFrom((com.google.devtools.cloudtrace.v2.TruncatableString)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.cloudtrace.v2.TruncatableString other) {
      if (other == com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance()) return this;
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        onChanged();
      }
      if (other.getTruncatedByteCount() != 0) {
        setTruncatedByteCount(other.getTruncatedByteCount());
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
      com.google.devtools.cloudtrace.v2.TruncatableString parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.cloudtrace.v2.TruncatableString) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <pre>
     * The shortened string. For example, if the original string is 500
     * bytes long and the limit of the string is 128 bytes, then
     * `value` contains the first 128 bytes of the 500-byte string.
     * Truncation always happens on a UTF8 character boundary. If there
     * are multi-byte characters in the string, then the length of the
     * shortened string might be less than the size limit.
     * </pre>
     *
     * <code>string value = 1;</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The shortened string. For example, if the original string is 500
     * bytes long and the limit of the string is 128 bytes, then
     * `value` contains the first 128 bytes of the 500-byte string.
     * Truncation always happens on a UTF8 character boundary. If there
     * are multi-byte characters in the string, then the length of the
     * shortened string might be less than the size limit.
     * </pre>
     *
     * <code>string value = 1;</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The shortened string. For example, if the original string is 500
     * bytes long and the limit of the string is 128 bytes, then
     * `value` contains the first 128 bytes of the 500-byte string.
     * Truncation always happens on a UTF8 character boundary. If there
     * are multi-byte characters in the string, then the length of the
     * shortened string might be less than the size limit.
     * </pre>
     *
     * <code>string value = 1;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The shortened string. For example, if the original string is 500
     * bytes long and the limit of the string is 128 bytes, then
     * `value` contains the first 128 bytes of the 500-byte string.
     * Truncation always happens on a UTF8 character boundary. If there
     * are multi-byte characters in the string, then the length of the
     * shortened string might be less than the size limit.
     * </pre>
     *
     * <code>string value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The shortened string. For example, if the original string is 500
     * bytes long and the limit of the string is 128 bytes, then
     * `value` contains the first 128 bytes of the 500-byte string.
     * Truncation always happens on a UTF8 character boundary. If there
     * are multi-byte characters in the string, then the length of the
     * shortened string might be less than the size limit.
     * </pre>
     *
     * <code>string value = 1;</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      value_ = value;
      onChanged();
      return this;
    }

    private int truncatedByteCount_ ;
    /**
     * <pre>
     * The number of bytes removed from the original string. If this
     * value is 0, then the string was not shortened.
     * </pre>
     *
     * <code>int32 truncated_byte_count = 2;</code>
     * @return The truncatedByteCount.
     */
    @java.lang.Override
    public int getTruncatedByteCount() {
      return truncatedByteCount_;
    }
    /**
     * <pre>
     * The number of bytes removed from the original string. If this
     * value is 0, then the string was not shortened.
     * </pre>
     *
     * <code>int32 truncated_byte_count = 2;</code>
     * @param value The truncatedByteCount to set.
     * @return This builder for chaining.
     */
    public Builder setTruncatedByteCount(int value) {
      
      truncatedByteCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of bytes removed from the original string. If this
     * value is 0, then the string was not shortened.
     * </pre>
     *
     * <code>int32 truncated_byte_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTruncatedByteCount() {
      
      truncatedByteCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudtrace.v2.TruncatableString)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudtrace.v2.TruncatableString)
  private static final com.google.devtools.cloudtrace.v2.TruncatableString DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.cloudtrace.v2.TruncatableString();
  }

  public static com.google.devtools.cloudtrace.v2.TruncatableString getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TruncatableString>
      PARSER = new com.google.protobuf.AbstractParser<TruncatableString>() {
    @java.lang.Override
    public TruncatableString parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TruncatableString(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TruncatableString> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TruncatableString> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.cloudtrace.v2.TruncatableString getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

