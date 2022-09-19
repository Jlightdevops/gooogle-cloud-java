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
// source: google/cloud/recommendationengine/v1beta1/catalog_service.proto

package com.google.cloud.recommendationengine.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for CreateCatalogItem method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest}
 */
public final class CreateCatalogItemRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest)
    CreateCatalogItemRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateCatalogItemRequest.newBuilder() to construct.
  private CreateCatalogItemRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateCatalogItemRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateCatalogItemRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateCatalogItemRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder subBuilder = null;
              if (catalogItem_ != null) {
                subBuilder = catalogItem_.toBuilder();
              }
              catalogItem_ =
                  input.readMessage(
                      com.google.cloud.recommendationengine.v1beta1.CatalogItem.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(catalogItem_);
                catalogItem_ = subBuilder.buildPartial();
              }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommendationengine.v1beta1.CatalogServiceOuterClass
        .internal_static_google_cloud_recommendationengine_v1beta1_CreateCatalogItemRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommendationengine.v1beta1.CatalogServiceOuterClass
        .internal_static_google_cloud_recommendationengine_v1beta1_CreateCatalogItemRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest.class,
            com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent catalog resource name, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent catalog resource name, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CATALOG_ITEM_FIELD_NUMBER = 2;
  private com.google.cloud.recommendationengine.v1beta1.CatalogItem catalogItem_;
  /**
   *
   *
   * <pre>
   * Required. The catalog item to create.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the catalogItem field is set.
   */
  @java.lang.Override
  public boolean hasCatalogItem() {
    return catalogItem_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The catalog item to create.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The catalogItem.
   */
  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.CatalogItem getCatalogItem() {
    return catalogItem_ == null
        ? com.google.cloud.recommendationengine.v1beta1.CatalogItem.getDefaultInstance()
        : catalogItem_;
  }
  /**
   *
   *
   * <pre>
   * Required. The catalog item to create.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder
      getCatalogItemOrBuilder() {
    return getCatalogItem();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (catalogItem_ != null) {
      output.writeMessage(2, getCatalogItem());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (catalogItem_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCatalogItem());
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
    if (!(obj instanceof com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest other =
        (com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasCatalogItem() != other.hasCatalogItem()) return false;
    if (hasCatalogItem()) {
      if (!getCatalogItem().equals(other.getCatalogItem())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasCatalogItem()) {
      hash = (37 * hash) + CATALOG_ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getCatalogItem().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest parseFrom(
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
      com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest prototype) {
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
   * Request message for CreateCatalogItem method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest)
      com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.CatalogServiceOuterClass
          .internal_static_google_cloud_recommendationengine_v1beta1_CreateCatalogItemRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommendationengine.v1beta1.CatalogServiceOuterClass
          .internal_static_google_cloud_recommendationengine_v1beta1_CreateCatalogItemRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest.class,
              com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (catalogItemBuilder_ == null) {
        catalogItem_ = null;
      } else {
        catalogItem_ = null;
        catalogItemBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommendationengine.v1beta1.CatalogServiceOuterClass
          .internal_static_google_cloud_recommendationengine_v1beta1_CreateCatalogItemRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest
        getDefaultInstanceForType() {
      return com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest build() {
      com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest buildPartial() {
      com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest result =
          new com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest(this);
      result.parent_ = parent_;
      if (catalogItemBuilder_ == null) {
        result.catalogItem_ = catalogItem_;
      } else {
        result.catalogItem_ = catalogItemBuilder_.build();
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
      if (other instanceof com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest) {
        return mergeFrom(
            (com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest other) {
      if (other
          == com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasCatalogItem()) {
        mergeCatalogItem(other.getCatalogItem());
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
      com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent catalog resource name, such as
     * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent catalog resource name, such as
     * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent catalog resource name, such as
     * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent catalog resource name, such as
     * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent catalog resource name, such as
     * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.recommendationengine.v1beta1.CatalogItem catalogItem_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.recommendationengine.v1beta1.CatalogItem,
            com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder,
            com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder>
        catalogItemBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The catalog item to create.
     * </pre>
     *
     * <code>
     * .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the catalogItem field is set.
     */
    public boolean hasCatalogItem() {
      return catalogItemBuilder_ != null || catalogItem_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The catalog item to create.
     * </pre>
     *
     * <code>
     * .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The catalogItem.
     */
    public com.google.cloud.recommendationengine.v1beta1.CatalogItem getCatalogItem() {
      if (catalogItemBuilder_ == null) {
        return catalogItem_ == null
            ? com.google.cloud.recommendationengine.v1beta1.CatalogItem.getDefaultInstance()
            : catalogItem_;
      } else {
        return catalogItemBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The catalog item to create.
     * </pre>
     *
     * <code>
     * .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCatalogItem(com.google.cloud.recommendationengine.v1beta1.CatalogItem value) {
      if (catalogItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        catalogItem_ = value;
        onChanged();
      } else {
        catalogItemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The catalog item to create.
     * </pre>
     *
     * <code>
     * .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCatalogItem(
        com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder builderForValue) {
      if (catalogItemBuilder_ == null) {
        catalogItem_ = builderForValue.build();
        onChanged();
      } else {
        catalogItemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The catalog item to create.
     * </pre>
     *
     * <code>
     * .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCatalogItem(
        com.google.cloud.recommendationengine.v1beta1.CatalogItem value) {
      if (catalogItemBuilder_ == null) {
        if (catalogItem_ != null) {
          catalogItem_ =
              com.google.cloud.recommendationengine.v1beta1.CatalogItem.newBuilder(catalogItem_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          catalogItem_ = value;
        }
        onChanged();
      } else {
        catalogItemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The catalog item to create.
     * </pre>
     *
     * <code>
     * .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCatalogItem() {
      if (catalogItemBuilder_ == null) {
        catalogItem_ = null;
        onChanged();
      } else {
        catalogItem_ = null;
        catalogItemBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The catalog item to create.
     * </pre>
     *
     * <code>
     * .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder
        getCatalogItemBuilder() {

      onChanged();
      return getCatalogItemFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The catalog item to create.
     * </pre>
     *
     * <code>
     * .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder
        getCatalogItemOrBuilder() {
      if (catalogItemBuilder_ != null) {
        return catalogItemBuilder_.getMessageOrBuilder();
      } else {
        return catalogItem_ == null
            ? com.google.cloud.recommendationengine.v1beta1.CatalogItem.getDefaultInstance()
            : catalogItem_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The catalog item to create.
     * </pre>
     *
     * <code>
     * .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_item = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.recommendationengine.v1beta1.CatalogItem,
            com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder,
            com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder>
        getCatalogItemFieldBuilder() {
      if (catalogItemBuilder_ == null) {
        catalogItemBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.recommendationengine.v1beta1.CatalogItem,
                com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder,
                com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder>(
                getCatalogItem(), getParentForChildren(), isClean());
        catalogItem_ = null;
      }
      return catalogItemBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest)
  private static final com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest();
  }

  public static com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCatalogItemRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateCatalogItemRequest>() {
        @java.lang.Override
        public CreateCatalogItemRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateCatalogItemRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateCatalogItemRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCatalogItemRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.CreateCatalogItemRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
