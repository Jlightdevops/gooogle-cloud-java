/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1/document_processor_service.proto

package com.google.cloud.documentai.v1;

/**
 *
 *
 * <pre>
 * Response message for list processors.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1.ListProcessorVersionsResponse}
 */
public final class ListProcessorVersionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1.ListProcessorVersionsResponse)
    ListProcessorVersionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListProcessorVersionsResponse.newBuilder() to construct.
  private ListProcessorVersionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListProcessorVersionsResponse() {
    processorVersions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListProcessorVersionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListProcessorVersionsResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                processorVersions_ =
                    new java.util.ArrayList<com.google.cloud.documentai.v1.ProcessorVersion>();
                mutable_bitField0_ |= 0x00000001;
              }
              processorVersions_.add(
                  input.readMessage(
                      com.google.cloud.documentai.v1.ProcessorVersion.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        processorVersions_ = java.util.Collections.unmodifiableList(processorVersions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_ListProcessorVersionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_ListProcessorVersionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1.ListProcessorVersionsResponse.class,
            com.google.cloud.documentai.v1.ListProcessorVersionsResponse.Builder.class);
  }

  public static final int PROCESSOR_VERSIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.documentai.v1.ProcessorVersion> processorVersions_;
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.documentai.v1.ProcessorVersion>
      getProcessorVersionsList() {
    return processorVersions_;
  }
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.documentai.v1.ProcessorVersionOrBuilder>
      getProcessorVersionsOrBuilderList() {
    return processorVersions_;
  }
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
   */
  @java.lang.Override
  public int getProcessorVersionsCount() {
    return processorVersions_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.ProcessorVersion getProcessorVersions(int index) {
    return processorVersions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.ProcessorVersionOrBuilder getProcessorVersionsOrBuilder(
      int index) {
    return processorVersions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Points to the next processor, otherwise empty.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Points to the next processor, otherwise empty.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < processorVersions_.size(); i++) {
      output.writeMessage(1, processorVersions_.get(i));
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
    for (int i = 0; i < processorVersions_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, processorVersions_.get(i));
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
    if (!(obj instanceof com.google.cloud.documentai.v1.ListProcessorVersionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1.ListProcessorVersionsResponse other =
        (com.google.cloud.documentai.v1.ListProcessorVersionsResponse) obj;

    if (!getProcessorVersionsList().equals(other.getProcessorVersionsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getProcessorVersionsCount() > 0) {
      hash = (37 * hash) + PROCESSOR_VERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getProcessorVersionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.documentai.v1.ListProcessorVersionsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for list processors.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1.ListProcessorVersionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1.ListProcessorVersionsResponse)
      com.google.cloud.documentai.v1.ListProcessorVersionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_ListProcessorVersionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_ListProcessorVersionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1.ListProcessorVersionsResponse.class,
              com.google.cloud.documentai.v1.ListProcessorVersionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1.ListProcessorVersionsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getProcessorVersionsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (processorVersionsBuilder_ == null) {
        processorVersions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        processorVersionsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_ListProcessorVersionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ListProcessorVersionsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1.ListProcessorVersionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ListProcessorVersionsResponse build() {
      com.google.cloud.documentai.v1.ListProcessorVersionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ListProcessorVersionsResponse buildPartial() {
      com.google.cloud.documentai.v1.ListProcessorVersionsResponse result =
          new com.google.cloud.documentai.v1.ListProcessorVersionsResponse(this);
      int from_bitField0_ = bitField0_;
      if (processorVersionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          processorVersions_ = java.util.Collections.unmodifiableList(processorVersions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.processorVersions_ = processorVersions_;
      } else {
        result.processorVersions_ = processorVersionsBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.documentai.v1.ListProcessorVersionsResponse) {
        return mergeFrom((com.google.cloud.documentai.v1.ListProcessorVersionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1.ListProcessorVersionsResponse other) {
      if (other
          == com.google.cloud.documentai.v1.ListProcessorVersionsResponse.getDefaultInstance())
        return this;
      if (processorVersionsBuilder_ == null) {
        if (!other.processorVersions_.isEmpty()) {
          if (processorVersions_.isEmpty()) {
            processorVersions_ = other.processorVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProcessorVersionsIsMutable();
            processorVersions_.addAll(other.processorVersions_);
          }
          onChanged();
        }
      } else {
        if (!other.processorVersions_.isEmpty()) {
          if (processorVersionsBuilder_.isEmpty()) {
            processorVersionsBuilder_.dispose();
            processorVersionsBuilder_ = null;
            processorVersions_ = other.processorVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            processorVersionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getProcessorVersionsFieldBuilder()
                    : null;
          } else {
            processorVersionsBuilder_.addAllMessages(other.processorVersions_);
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
      com.google.cloud.documentai.v1.ListProcessorVersionsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.documentai.v1.ListProcessorVersionsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.documentai.v1.ProcessorVersion> processorVersions_ =
        java.util.Collections.emptyList();

    private void ensureProcessorVersionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        processorVersions_ =
            new java.util.ArrayList<com.google.cloud.documentai.v1.ProcessorVersion>(
                processorVersions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.documentai.v1.ProcessorVersion,
            com.google.cloud.documentai.v1.ProcessorVersion.Builder,
            com.google.cloud.documentai.v1.ProcessorVersionOrBuilder>
        processorVersionsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public java.util.List<com.google.cloud.documentai.v1.ProcessorVersion>
        getProcessorVersionsList() {
      if (processorVersionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(processorVersions_);
      } else {
        return processorVersionsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public int getProcessorVersionsCount() {
      if (processorVersionsBuilder_ == null) {
        return processorVersions_.size();
      } else {
        return processorVersionsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public com.google.cloud.documentai.v1.ProcessorVersion getProcessorVersions(int index) {
      if (processorVersionsBuilder_ == null) {
        return processorVersions_.get(index);
      } else {
        return processorVersionsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public Builder setProcessorVersions(
        int index, com.google.cloud.documentai.v1.ProcessorVersion value) {
      if (processorVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorVersionsIsMutable();
        processorVersions_.set(index, value);
        onChanged();
      } else {
        processorVersionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public Builder setProcessorVersions(
        int index, com.google.cloud.documentai.v1.ProcessorVersion.Builder builderForValue) {
      if (processorVersionsBuilder_ == null) {
        ensureProcessorVersionsIsMutable();
        processorVersions_.set(index, builderForValue.build());
        onChanged();
      } else {
        processorVersionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public Builder addProcessorVersions(com.google.cloud.documentai.v1.ProcessorVersion value) {
      if (processorVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorVersionsIsMutable();
        processorVersions_.add(value);
        onChanged();
      } else {
        processorVersionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public Builder addProcessorVersions(
        int index, com.google.cloud.documentai.v1.ProcessorVersion value) {
      if (processorVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorVersionsIsMutable();
        processorVersions_.add(index, value);
        onChanged();
      } else {
        processorVersionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public Builder addProcessorVersions(
        com.google.cloud.documentai.v1.ProcessorVersion.Builder builderForValue) {
      if (processorVersionsBuilder_ == null) {
        ensureProcessorVersionsIsMutable();
        processorVersions_.add(builderForValue.build());
        onChanged();
      } else {
        processorVersionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public Builder addProcessorVersions(
        int index, com.google.cloud.documentai.v1.ProcessorVersion.Builder builderForValue) {
      if (processorVersionsBuilder_ == null) {
        ensureProcessorVersionsIsMutable();
        processorVersions_.add(index, builderForValue.build());
        onChanged();
      } else {
        processorVersionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public Builder addAllProcessorVersions(
        java.lang.Iterable<? extends com.google.cloud.documentai.v1.ProcessorVersion> values) {
      if (processorVersionsBuilder_ == null) {
        ensureProcessorVersionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, processorVersions_);
        onChanged();
      } else {
        processorVersionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public Builder clearProcessorVersions() {
      if (processorVersionsBuilder_ == null) {
        processorVersions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        processorVersionsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public Builder removeProcessorVersions(int index) {
      if (processorVersionsBuilder_ == null) {
        ensureProcessorVersionsIsMutable();
        processorVersions_.remove(index);
        onChanged();
      } else {
        processorVersionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public com.google.cloud.documentai.v1.ProcessorVersion.Builder getProcessorVersionsBuilder(
        int index) {
      return getProcessorVersionsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public com.google.cloud.documentai.v1.ProcessorVersionOrBuilder getProcessorVersionsOrBuilder(
        int index) {
      if (processorVersionsBuilder_ == null) {
        return processorVersions_.get(index);
      } else {
        return processorVersionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.documentai.v1.ProcessorVersionOrBuilder>
        getProcessorVersionsOrBuilderList() {
      if (processorVersionsBuilder_ != null) {
        return processorVersionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(processorVersions_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public com.google.cloud.documentai.v1.ProcessorVersion.Builder addProcessorVersionsBuilder() {
      return getProcessorVersionsFieldBuilder()
          .addBuilder(com.google.cloud.documentai.v1.ProcessorVersion.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public com.google.cloud.documentai.v1.ProcessorVersion.Builder addProcessorVersionsBuilder(
        int index) {
      return getProcessorVersionsFieldBuilder()
          .addBuilder(index, com.google.cloud.documentai.v1.ProcessorVersion.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.ProcessorVersion processor_versions = 1;</code>
     */
    public java.util.List<com.google.cloud.documentai.v1.ProcessorVersion.Builder>
        getProcessorVersionsBuilderList() {
      return getProcessorVersionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.documentai.v1.ProcessorVersion,
            com.google.cloud.documentai.v1.ProcessorVersion.Builder,
            com.google.cloud.documentai.v1.ProcessorVersionOrBuilder>
        getProcessorVersionsFieldBuilder() {
      if (processorVersionsBuilder_ == null) {
        processorVersionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.documentai.v1.ProcessorVersion,
                com.google.cloud.documentai.v1.ProcessorVersion.Builder,
                com.google.cloud.documentai.v1.ProcessorVersionOrBuilder>(
                processorVersions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        processorVersions_ = null;
      }
      return processorVersionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Points to the next processor, otherwise empty.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Points to the next processor, otherwise empty.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Points to the next processor, otherwise empty.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Points to the next processor, otherwise empty.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Points to the next processor, otherwise empty.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1.ListProcessorVersionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1.ListProcessorVersionsResponse)
  private static final com.google.cloud.documentai.v1.ListProcessorVersionsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1.ListProcessorVersionsResponse();
  }

  public static com.google.cloud.documentai.v1.ListProcessorVersionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListProcessorVersionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListProcessorVersionsResponse>() {
        @java.lang.Override
        public ListProcessorVersionsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListProcessorVersionsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListProcessorVersionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListProcessorVersionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1.ListProcessorVersionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
