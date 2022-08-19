// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Response message for ListInspectTemplates.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.ListInspectTemplatesResponse}
 */
public final class ListInspectTemplatesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.ListInspectTemplatesResponse)
    ListInspectTemplatesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListInspectTemplatesResponse.newBuilder() to construct.
  private ListInspectTemplatesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListInspectTemplatesResponse() {
    inspectTemplates_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListInspectTemplatesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListInspectTemplatesResponse(
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
              inspectTemplates_ = new java.util.ArrayList<com.google.privacy.dlp.v2.InspectTemplate>();
              mutable_bitField0_ |= 0x00000001;
            }
            inspectTemplates_.add(
                input.readMessage(com.google.privacy.dlp.v2.InspectTemplate.parser(), extensionRegistry));
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
        inspectTemplates_ = java.util.Collections.unmodifiableList(inspectTemplates_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListInspectTemplatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListInspectTemplatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.ListInspectTemplatesResponse.class, com.google.privacy.dlp.v2.ListInspectTemplatesResponse.Builder.class);
  }

  public static final int INSPECT_TEMPLATES_FIELD_NUMBER = 1;
  private java.util.List<com.google.privacy.dlp.v2.InspectTemplate> inspectTemplates_;
  /**
   * <pre>
   * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.privacy.dlp.v2.InspectTemplate> getInspectTemplatesList() {
    return inspectTemplates_;
  }
  /**
   * <pre>
   * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.privacy.dlp.v2.InspectTemplateOrBuilder> 
      getInspectTemplatesOrBuilderList() {
    return inspectTemplates_;
  }
  /**
   * <pre>
   * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
   */
  @java.lang.Override
  public int getInspectTemplatesCount() {
    return inspectTemplates_.size();
  }
  /**
   * <pre>
   * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.InspectTemplate getInspectTemplates(int index) {
    return inspectTemplates_.get(index);
  }
  /**
   * <pre>
   * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.InspectTemplateOrBuilder getInspectTemplatesOrBuilder(
      int index) {
    return inspectTemplates_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * If the next page is available then the next page token to be used
   * in following ListInspectTemplates request.
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
   * If the next page is available then the next page token to be used
   * in following ListInspectTemplates request.
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
    for (int i = 0; i < inspectTemplates_.size(); i++) {
      output.writeMessage(1, inspectTemplates_.get(i));
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
    for (int i = 0; i < inspectTemplates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, inspectTemplates_.get(i));
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
    if (!(obj instanceof com.google.privacy.dlp.v2.ListInspectTemplatesResponse)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.ListInspectTemplatesResponse other = (com.google.privacy.dlp.v2.ListInspectTemplatesResponse) obj;

    if (!getInspectTemplatesList()
        .equals(other.getInspectTemplatesList())) return false;
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
    if (getInspectTemplatesCount() > 0) {
      hash = (37 * hash) + INSPECT_TEMPLATES_FIELD_NUMBER;
      hash = (53 * hash) + getInspectTemplatesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.ListInspectTemplatesResponse prototype) {
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
   * Response message for ListInspectTemplates.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.ListInspectTemplatesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.ListInspectTemplatesResponse)
      com.google.privacy.dlp.v2.ListInspectTemplatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListInspectTemplatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListInspectTemplatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.ListInspectTemplatesResponse.class, com.google.privacy.dlp.v2.ListInspectTemplatesResponse.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.ListInspectTemplatesResponse.newBuilder()
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
        getInspectTemplatesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (inspectTemplatesBuilder_ == null) {
        inspectTemplates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        inspectTemplatesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListInspectTemplatesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListInspectTemplatesResponse getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.ListInspectTemplatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListInspectTemplatesResponse build() {
      com.google.privacy.dlp.v2.ListInspectTemplatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListInspectTemplatesResponse buildPartial() {
      com.google.privacy.dlp.v2.ListInspectTemplatesResponse result = new com.google.privacy.dlp.v2.ListInspectTemplatesResponse(this);
      int from_bitField0_ = bitField0_;
      if (inspectTemplatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          inspectTemplates_ = java.util.Collections.unmodifiableList(inspectTemplates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inspectTemplates_ = inspectTemplates_;
      } else {
        result.inspectTemplates_ = inspectTemplatesBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.ListInspectTemplatesResponse) {
        return mergeFrom((com.google.privacy.dlp.v2.ListInspectTemplatesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.ListInspectTemplatesResponse other) {
      if (other == com.google.privacy.dlp.v2.ListInspectTemplatesResponse.getDefaultInstance()) return this;
      if (inspectTemplatesBuilder_ == null) {
        if (!other.inspectTemplates_.isEmpty()) {
          if (inspectTemplates_.isEmpty()) {
            inspectTemplates_ = other.inspectTemplates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInspectTemplatesIsMutable();
            inspectTemplates_.addAll(other.inspectTemplates_);
          }
          onChanged();
        }
      } else {
        if (!other.inspectTemplates_.isEmpty()) {
          if (inspectTemplatesBuilder_.isEmpty()) {
            inspectTemplatesBuilder_.dispose();
            inspectTemplatesBuilder_ = null;
            inspectTemplates_ = other.inspectTemplates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inspectTemplatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInspectTemplatesFieldBuilder() : null;
          } else {
            inspectTemplatesBuilder_.addAllMessages(other.inspectTemplates_);
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
      com.google.privacy.dlp.v2.ListInspectTemplatesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.ListInspectTemplatesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.privacy.dlp.v2.InspectTemplate> inspectTemplates_ =
      java.util.Collections.emptyList();
    private void ensureInspectTemplatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inspectTemplates_ = new java.util.ArrayList<com.google.privacy.dlp.v2.InspectTemplate>(inspectTemplates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2.InspectTemplate, com.google.privacy.dlp.v2.InspectTemplate.Builder, com.google.privacy.dlp.v2.InspectTemplateOrBuilder> inspectTemplatesBuilder_;

    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.InspectTemplate> getInspectTemplatesList() {
      if (inspectTemplatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inspectTemplates_);
      } else {
        return inspectTemplatesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public int getInspectTemplatesCount() {
      if (inspectTemplatesBuilder_ == null) {
        return inspectTemplates_.size();
      } else {
        return inspectTemplatesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public com.google.privacy.dlp.v2.InspectTemplate getInspectTemplates(int index) {
      if (inspectTemplatesBuilder_ == null) {
        return inspectTemplates_.get(index);
      } else {
        return inspectTemplatesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public Builder setInspectTemplates(
        int index, com.google.privacy.dlp.v2.InspectTemplate value) {
      if (inspectTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInspectTemplatesIsMutable();
        inspectTemplates_.set(index, value);
        onChanged();
      } else {
        inspectTemplatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public Builder setInspectTemplates(
        int index, com.google.privacy.dlp.v2.InspectTemplate.Builder builderForValue) {
      if (inspectTemplatesBuilder_ == null) {
        ensureInspectTemplatesIsMutable();
        inspectTemplates_.set(index, builderForValue.build());
        onChanged();
      } else {
        inspectTemplatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public Builder addInspectTemplates(com.google.privacy.dlp.v2.InspectTemplate value) {
      if (inspectTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInspectTemplatesIsMutable();
        inspectTemplates_.add(value);
        onChanged();
      } else {
        inspectTemplatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public Builder addInspectTemplates(
        int index, com.google.privacy.dlp.v2.InspectTemplate value) {
      if (inspectTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInspectTemplatesIsMutable();
        inspectTemplates_.add(index, value);
        onChanged();
      } else {
        inspectTemplatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public Builder addInspectTemplates(
        com.google.privacy.dlp.v2.InspectTemplate.Builder builderForValue) {
      if (inspectTemplatesBuilder_ == null) {
        ensureInspectTemplatesIsMutable();
        inspectTemplates_.add(builderForValue.build());
        onChanged();
      } else {
        inspectTemplatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public Builder addInspectTemplates(
        int index, com.google.privacy.dlp.v2.InspectTemplate.Builder builderForValue) {
      if (inspectTemplatesBuilder_ == null) {
        ensureInspectTemplatesIsMutable();
        inspectTemplates_.add(index, builderForValue.build());
        onChanged();
      } else {
        inspectTemplatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public Builder addAllInspectTemplates(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2.InspectTemplate> values) {
      if (inspectTemplatesBuilder_ == null) {
        ensureInspectTemplatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inspectTemplates_);
        onChanged();
      } else {
        inspectTemplatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public Builder clearInspectTemplates() {
      if (inspectTemplatesBuilder_ == null) {
        inspectTemplates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inspectTemplatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public Builder removeInspectTemplates(int index) {
      if (inspectTemplatesBuilder_ == null) {
        ensureInspectTemplatesIsMutable();
        inspectTemplates_.remove(index);
        onChanged();
      } else {
        inspectTemplatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public com.google.privacy.dlp.v2.InspectTemplate.Builder getInspectTemplatesBuilder(
        int index) {
      return getInspectTemplatesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public com.google.privacy.dlp.v2.InspectTemplateOrBuilder getInspectTemplatesOrBuilder(
        int index) {
      if (inspectTemplatesBuilder_ == null) {
        return inspectTemplates_.get(index);  } else {
        return inspectTemplatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2.InspectTemplateOrBuilder> 
         getInspectTemplatesOrBuilderList() {
      if (inspectTemplatesBuilder_ != null) {
        return inspectTemplatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inspectTemplates_);
      }
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public com.google.privacy.dlp.v2.InspectTemplate.Builder addInspectTemplatesBuilder() {
      return getInspectTemplatesFieldBuilder().addBuilder(
          com.google.privacy.dlp.v2.InspectTemplate.getDefaultInstance());
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public com.google.privacy.dlp.v2.InspectTemplate.Builder addInspectTemplatesBuilder(
        int index) {
      return getInspectTemplatesFieldBuilder().addBuilder(
          index, com.google.privacy.dlp.v2.InspectTemplate.getDefaultInstance());
    }
    /**
     * <pre>
     * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.InspectTemplate inspect_templates = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.InspectTemplate.Builder> 
         getInspectTemplatesBuilderList() {
      return getInspectTemplatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2.InspectTemplate, com.google.privacy.dlp.v2.InspectTemplate.Builder, com.google.privacy.dlp.v2.InspectTemplateOrBuilder> 
        getInspectTemplatesFieldBuilder() {
      if (inspectTemplatesBuilder_ == null) {
        inspectTemplatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.InspectTemplate, com.google.privacy.dlp.v2.InspectTemplate.Builder, com.google.privacy.dlp.v2.InspectTemplateOrBuilder>(
                inspectTemplates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        inspectTemplates_ = null;
      }
      return inspectTemplatesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * If the next page is available then the next page token to be used
     * in following ListInspectTemplates request.
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
     * If the next page is available then the next page token to be used
     * in following ListInspectTemplates request.
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
     * If the next page is available then the next page token to be used
     * in following ListInspectTemplates request.
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
     * If the next page is available then the next page token to be used
     * in following ListInspectTemplates request.
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
     * If the next page is available then the next page token to be used
     * in following ListInspectTemplates request.
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.ListInspectTemplatesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.ListInspectTemplatesResponse)
  private static final com.google.privacy.dlp.v2.ListInspectTemplatesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.ListInspectTemplatesResponse();
  }

  public static com.google.privacy.dlp.v2.ListInspectTemplatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInspectTemplatesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListInspectTemplatesResponse>() {
    @java.lang.Override
    public ListInspectTemplatesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListInspectTemplatesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListInspectTemplatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInspectTemplatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.ListInspectTemplatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

