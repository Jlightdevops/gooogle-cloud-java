// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Statistics regarding a specific InfoType.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.InfoTypeStats}
 */
public final class InfoTypeStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.InfoTypeStats)
    InfoTypeStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InfoTypeStats.newBuilder() to construct.
  private InfoTypeStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InfoTypeStats() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InfoTypeStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InfoTypeStats(
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
            com.google.privacy.dlp.v2.InfoType.Builder subBuilder = null;
            if (infoType_ != null) {
              subBuilder = infoType_.toBuilder();
            }
            infoType_ = input.readMessage(com.google.privacy.dlp.v2.InfoType.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(infoType_);
              infoType_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            count_ = input.readInt64();
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
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InfoTypeStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InfoTypeStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.InfoTypeStats.class, com.google.privacy.dlp.v2.InfoTypeStats.Builder.class);
  }

  public static final int INFO_TYPE_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.InfoType infoType_;
  /**
   * <pre>
   * The type of finding this stat is for.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   * @return Whether the infoType field is set.
   */
  @java.lang.Override
  public boolean hasInfoType() {
    return infoType_ != null;
  }
  /**
   * <pre>
   * The type of finding this stat is for.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   * @return The infoType.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.InfoType getInfoType() {
    return infoType_ == null ? com.google.privacy.dlp.v2.InfoType.getDefaultInstance() : infoType_;
  }
  /**
   * <pre>
   * The type of finding this stat is for.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypeOrBuilder() {
    return getInfoType();
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private long count_;
  /**
   * <pre>
   * Number of findings for this infoType.
   * </pre>
   *
   * <code>int64 count = 2;</code>
   * @return The count.
   */
  @java.lang.Override
  public long getCount() {
    return count_;
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
    if (infoType_ != null) {
      output.writeMessage(1, getInfoType());
    }
    if (count_ != 0L) {
      output.writeInt64(2, count_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (infoType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInfoType());
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, count_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.InfoTypeStats)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.InfoTypeStats other = (com.google.privacy.dlp.v2.InfoTypeStats) obj;

    if (hasInfoType() != other.hasInfoType()) return false;
    if (hasInfoType()) {
      if (!getInfoType()
          .equals(other.getInfoType())) return false;
    }
    if (getCount()
        != other.getCount()) return false;
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
    if (hasInfoType()) {
      hash = (37 * hash) + INFO_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getInfoType().hashCode();
    }
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.InfoTypeStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.InfoTypeStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InfoTypeStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.InfoTypeStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InfoTypeStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.InfoTypeStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InfoTypeStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.InfoTypeStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InfoTypeStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.InfoTypeStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.InfoTypeStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.InfoTypeStats parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.InfoTypeStats prototype) {
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
   * Statistics regarding a specific InfoType.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.InfoTypeStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.InfoTypeStats)
      com.google.privacy.dlp.v2.InfoTypeStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InfoTypeStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InfoTypeStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.InfoTypeStats.class, com.google.privacy.dlp.v2.InfoTypeStats.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.InfoTypeStats.newBuilder()
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
      if (infoTypeBuilder_ == null) {
        infoType_ = null;
      } else {
        infoType_ = null;
        infoTypeBuilder_ = null;
      }
      count_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_InfoTypeStats_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InfoTypeStats getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.InfoTypeStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InfoTypeStats build() {
      com.google.privacy.dlp.v2.InfoTypeStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.InfoTypeStats buildPartial() {
      com.google.privacy.dlp.v2.InfoTypeStats result = new com.google.privacy.dlp.v2.InfoTypeStats(this);
      if (infoTypeBuilder_ == null) {
        result.infoType_ = infoType_;
      } else {
        result.infoType_ = infoTypeBuilder_.build();
      }
      result.count_ = count_;
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
      if (other instanceof com.google.privacy.dlp.v2.InfoTypeStats) {
        return mergeFrom((com.google.privacy.dlp.v2.InfoTypeStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.InfoTypeStats other) {
      if (other == com.google.privacy.dlp.v2.InfoTypeStats.getDefaultInstance()) return this;
      if (other.hasInfoType()) {
        mergeInfoType(other.getInfoType());
      }
      if (other.getCount() != 0L) {
        setCount(other.getCount());
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
      com.google.privacy.dlp.v2.InfoTypeStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.InfoTypeStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2.InfoType infoType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.InfoType, com.google.privacy.dlp.v2.InfoType.Builder, com.google.privacy.dlp.v2.InfoTypeOrBuilder> infoTypeBuilder_;
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     * @return Whether the infoType field is set.
     */
    public boolean hasInfoType() {
      return infoTypeBuilder_ != null || infoType_ != null;
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     * @return The infoType.
     */
    public com.google.privacy.dlp.v2.InfoType getInfoType() {
      if (infoTypeBuilder_ == null) {
        return infoType_ == null ? com.google.privacy.dlp.v2.InfoType.getDefaultInstance() : infoType_;
      } else {
        return infoTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    public Builder setInfoType(com.google.privacy.dlp.v2.InfoType value) {
      if (infoTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        infoType_ = value;
        onChanged();
      } else {
        infoTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    public Builder setInfoType(
        com.google.privacy.dlp.v2.InfoType.Builder builderForValue) {
      if (infoTypeBuilder_ == null) {
        infoType_ = builderForValue.build();
        onChanged();
      } else {
        infoTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    public Builder mergeInfoType(com.google.privacy.dlp.v2.InfoType value) {
      if (infoTypeBuilder_ == null) {
        if (infoType_ != null) {
          infoType_ =
            com.google.privacy.dlp.v2.InfoType.newBuilder(infoType_).mergeFrom(value).buildPartial();
        } else {
          infoType_ = value;
        }
        onChanged();
      } else {
        infoTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    public Builder clearInfoType() {
      if (infoTypeBuilder_ == null) {
        infoType_ = null;
        onChanged();
      } else {
        infoType_ = null;
        infoTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    public com.google.privacy.dlp.v2.InfoType.Builder getInfoTypeBuilder() {
      
      onChanged();
      return getInfoTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    public com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypeOrBuilder() {
      if (infoTypeBuilder_ != null) {
        return infoTypeBuilder_.getMessageOrBuilder();
      } else {
        return infoType_ == null ?
            com.google.privacy.dlp.v2.InfoType.getDefaultInstance() : infoType_;
      }
    }
    /**
     * <pre>
     * The type of finding this stat is for.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.InfoType, com.google.privacy.dlp.v2.InfoType.Builder, com.google.privacy.dlp.v2.InfoTypeOrBuilder> 
        getInfoTypeFieldBuilder() {
      if (infoTypeBuilder_ == null) {
        infoTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.InfoType, com.google.privacy.dlp.v2.InfoType.Builder, com.google.privacy.dlp.v2.InfoTypeOrBuilder>(
                getInfoType(),
                getParentForChildren(),
                isClean());
        infoType_ = null;
      }
      return infoTypeBuilder_;
    }

    private long count_ ;
    /**
     * <pre>
     * Number of findings for this infoType.
     * </pre>
     *
     * <code>int64 count = 2;</code>
     * @return The count.
     */
    @java.lang.Override
    public long getCount() {
      return count_;
    }
    /**
     * <pre>
     * Number of findings for this infoType.
     * </pre>
     *
     * <code>int64 count = 2;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(long value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of findings for this infoType.
     * </pre>
     *
     * <code>int64 count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      
      count_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.InfoTypeStats)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.InfoTypeStats)
  private static final com.google.privacy.dlp.v2.InfoTypeStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.InfoTypeStats();
  }

  public static com.google.privacy.dlp.v2.InfoTypeStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InfoTypeStats>
      PARSER = new com.google.protobuf.AbstractParser<InfoTypeStats>() {
    @java.lang.Override
    public InfoTypeStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InfoTypeStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InfoTypeStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InfoTypeStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.InfoTypeStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

