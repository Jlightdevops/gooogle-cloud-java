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
// source: google/analytics/admin/v1beta/resources.proto

package com.google.analytics.admin.v1beta;

/**
 *
 *
 * <pre>
 * A virtual resource representing metadata for a GA4 property.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.PropertySummary}
 */
public final class PropertySummary extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.PropertySummary)
    PropertySummaryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PropertySummary.newBuilder() to construct.
  private PropertySummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PropertySummary() {
    property_ = "";
    displayName_ = "";
    propertyType_ = 0;
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PropertySummary();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PropertySummary(
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

              property_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              displayName_ = s;
              break;
            }
          case 24:
            {
              int rawValue = input.readEnum();

              propertyType_ = rawValue;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
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
    return com.google.analytics.admin.v1beta.ResourcesProto
        .internal_static_google_analytics_admin_v1beta_PropertySummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.ResourcesProto
        .internal_static_google_analytics_admin_v1beta_PropertySummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.PropertySummary.class,
            com.google.analytics.admin.v1beta.PropertySummary.Builder.class);
  }

  public static final int PROPERTY_FIELD_NUMBER = 1;
  private volatile java.lang.Object property_;
  /**
   *
   *
   * <pre>
   * Resource name of property referred to by this property summary
   * Format: properties/{property_id}
   * Example: "properties/1000"
   * </pre>
   *
   * <code>string property = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The property.
   */
  @java.lang.Override
  public java.lang.String getProperty() {
    java.lang.Object ref = property_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      property_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource name of property referred to by this property summary
   * Format: properties/{property_id}
   * Example: "properties/1000"
   * </pre>
   *
   * <code>string property = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for property.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPropertyBytes() {
    java.lang.Object ref = property_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      property_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object displayName_;
  /**
   *
   *
   * <pre>
   * Display name for the property referred to in this property summary.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Display name for the property referred to in this property summary.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROPERTY_TYPE_FIELD_NUMBER = 3;
  private int propertyType_;
  /**
   *
   *
   * <pre>
   * The property's property type.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.PropertyType property_type = 3;</code>
   *
   * @return The enum numeric value on the wire for propertyType.
   */
  @java.lang.Override
  public int getPropertyTypeValue() {
    return propertyType_;
  }
  /**
   *
   *
   * <pre>
   * The property's property type.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.PropertyType property_type = 3;</code>
   *
   * @return The propertyType.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.PropertyType getPropertyType() {
    @SuppressWarnings("deprecation")
    com.google.analytics.admin.v1beta.PropertyType result =
        com.google.analytics.admin.v1beta.PropertyType.valueOf(propertyType_);
    return result == null ? com.google.analytics.admin.v1beta.PropertyType.UNRECOGNIZED : result;
  }

  public static final int PARENT_FIELD_NUMBER = 4;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Resource name of this property's logical parent.
   * Note: The Property-Moving UI can be used to change the parent.
   * Format: accounts/{account}, properties/{property}
   * Example: "accounts/100", "properties/200"
   * </pre>
   *
   * <code>string parent = 4;</code>
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
   * Resource name of this property's logical parent.
   * Note: The Property-Moving UI can be used to change the parent.
   * Format: accounts/{account}, properties/{property}
   * Example: "accounts/100", "properties/200"
   * </pre>
   *
   * <code>string parent = 4;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(property_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, property_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    if (propertyType_
        != com.google.analytics.admin.v1beta.PropertyType.PROPERTY_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, propertyType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, parent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(property_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, property_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
    }
    if (propertyType_
        != com.google.analytics.admin.v1beta.PropertyType.PROPERTY_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, propertyType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, parent_);
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.PropertySummary)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.PropertySummary other =
        (com.google.analytics.admin.v1beta.PropertySummary) obj;

    if (!getProperty().equals(other.getProperty())) return false;
    if (!getDisplayName().equals(other.getDisplayName())) return false;
    if (propertyType_ != other.propertyType_) return false;
    if (!getParent().equals(other.getParent())) return false;
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
    hash = (37 * hash) + PROPERTY_FIELD_NUMBER;
    hash = (53 * hash) + getProperty().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + PROPERTY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + propertyType_;
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.PropertySummary parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.PropertySummary parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.PropertySummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.PropertySummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.PropertySummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.PropertySummary parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.PropertySummary parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.PropertySummary parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.PropertySummary parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.PropertySummary parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.PropertySummary parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.PropertySummary parseFrom(
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

  public static Builder newBuilder(com.google.analytics.admin.v1beta.PropertySummary prototype) {
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
   * A virtual resource representing metadata for a GA4 property.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.PropertySummary}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.PropertySummary)
      com.google.analytics.admin.v1beta.PropertySummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1beta.ResourcesProto
          .internal_static_google_analytics_admin_v1beta_PropertySummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.ResourcesProto
          .internal_static_google_analytics_admin_v1beta_PropertySummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.PropertySummary.class,
              com.google.analytics.admin.v1beta.PropertySummary.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.PropertySummary.newBuilder()
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
      property_ = "";

      displayName_ = "";

      propertyType_ = 0;

      parent_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1beta.ResourcesProto
          .internal_static_google_analytics_admin_v1beta_PropertySummary_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.PropertySummary getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.PropertySummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.PropertySummary build() {
      com.google.analytics.admin.v1beta.PropertySummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.PropertySummary buildPartial() {
      com.google.analytics.admin.v1beta.PropertySummary result =
          new com.google.analytics.admin.v1beta.PropertySummary(this);
      result.property_ = property_;
      result.displayName_ = displayName_;
      result.propertyType_ = propertyType_;
      result.parent_ = parent_;
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
      if (other instanceof com.google.analytics.admin.v1beta.PropertySummary) {
        return mergeFrom((com.google.analytics.admin.v1beta.PropertySummary) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.PropertySummary other) {
      if (other == com.google.analytics.admin.v1beta.PropertySummary.getDefaultInstance())
        return this;
      if (!other.getProperty().isEmpty()) {
        property_ = other.property_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (other.propertyType_ != 0) {
        setPropertyTypeValue(other.getPropertyTypeValue());
      }
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
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
      com.google.analytics.admin.v1beta.PropertySummary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1beta.PropertySummary) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object property_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of property referred to by this property summary
     * Format: properties/{property_id}
     * Example: "properties/1000"
     * </pre>
     *
     * <code>string property = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The property.
     */
    public java.lang.String getProperty() {
      java.lang.Object ref = property_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        property_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of property referred to by this property summary
     * Format: properties/{property_id}
     * Example: "properties/1000"
     * </pre>
     *
     * <code>string property = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for property.
     */
    public com.google.protobuf.ByteString getPropertyBytes() {
      java.lang.Object ref = property_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        property_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of property referred to by this property summary
     * Format: properties/{property_id}
     * Example: "properties/1000"
     * </pre>
     *
     * <code>string property = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The property to set.
     * @return This builder for chaining.
     */
    public Builder setProperty(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      property_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of property referred to by this property summary
     * Format: properties/{property_id}
     * Example: "properties/1000"
     * </pre>
     *
     * <code>string property = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProperty() {

      property_ = getDefaultInstance().getProperty();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of property referred to by this property summary
     * Format: properties/{property_id}
     * Example: "properties/1000"
     * </pre>
     *
     * <code>string property = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for property to set.
     * @return This builder for chaining.
     */
    public Builder setPropertyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      property_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Display name for the property referred to in this property summary.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Display name for the property referred to in this property summary.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Display name for the property referred to in this property summary.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Display name for the property referred to in this property summary.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {

      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Display name for the property referred to in this property summary.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      displayName_ = value;
      onChanged();
      return this;
    }

    private int propertyType_ = 0;
    /**
     *
     *
     * <pre>
     * The property's property type.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.PropertyType property_type = 3;</code>
     *
     * @return The enum numeric value on the wire for propertyType.
     */
    @java.lang.Override
    public int getPropertyTypeValue() {
      return propertyType_;
    }
    /**
     *
     *
     * <pre>
     * The property's property type.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.PropertyType property_type = 3;</code>
     *
     * @param value The enum numeric value on the wire for propertyType to set.
     * @return This builder for chaining.
     */
    public Builder setPropertyTypeValue(int value) {

      propertyType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The property's property type.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.PropertyType property_type = 3;</code>
     *
     * @return The propertyType.
     */
    @java.lang.Override
    public com.google.analytics.admin.v1beta.PropertyType getPropertyType() {
      @SuppressWarnings("deprecation")
      com.google.analytics.admin.v1beta.PropertyType result =
          com.google.analytics.admin.v1beta.PropertyType.valueOf(propertyType_);
      return result == null ? com.google.analytics.admin.v1beta.PropertyType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The property's property type.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.PropertyType property_type = 3;</code>
     *
     * @param value The propertyType to set.
     * @return This builder for chaining.
     */
    public Builder setPropertyType(com.google.analytics.admin.v1beta.PropertyType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      propertyType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The property's property type.
     * </pre>
     *
     * <code>.google.analytics.admin.v1beta.PropertyType property_type = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPropertyType() {

      propertyType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of this property's logical parent.
     * Note: The Property-Moving UI can be used to change the parent.
     * Format: accounts/{account}, properties/{property}
     * Example: "accounts/100", "properties/200"
     * </pre>
     *
     * <code>string parent = 4;</code>
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
     * Resource name of this property's logical parent.
     * Note: The Property-Moving UI can be used to change the parent.
     * Format: accounts/{account}, properties/{property}
     * Example: "accounts/100", "properties/200"
     * </pre>
     *
     * <code>string parent = 4;</code>
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
     * Resource name of this property's logical parent.
     * Note: The Property-Moving UI can be used to change the parent.
     * Format: accounts/{account}, properties/{property}
     * Example: "accounts/100", "properties/200"
     * </pre>
     *
     * <code>string parent = 4;</code>
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
     * Resource name of this property's logical parent.
     * Note: The Property-Moving UI can be used to change the parent.
     * Format: accounts/{account}, properties/{property}
     * Example: "accounts/100", "properties/200"
     * </pre>
     *
     * <code>string parent = 4;</code>
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
     * Resource name of this property's logical parent.
     * Note: The Property-Moving UI can be used to change the parent.
     * Format: accounts/{account}, properties/{property}
     * Example: "accounts/100", "properties/200"
     * </pre>
     *
     * <code>string parent = 4;</code>
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.PropertySummary)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.PropertySummary)
  private static final com.google.analytics.admin.v1beta.PropertySummary DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.PropertySummary();
  }

  public static com.google.analytics.admin.v1beta.PropertySummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PropertySummary> PARSER =
      new com.google.protobuf.AbstractParser<PropertySummary>() {
        @java.lang.Override
        public PropertySummary parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PropertySummary(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PropertySummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PropertySummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.PropertySummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
