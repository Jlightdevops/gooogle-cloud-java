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
// source: google/cloud/gkehub/v1beta1/membership.proto

package com.google.cloud.gkehub.v1beta1;

/**
 *
 *
 * <pre>
 * The request to generate the manifests for exclusivity artifacts.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest}
 */
public final class GenerateExclusivityManifestRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest)
    GenerateExclusivityManifestRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerateExclusivityManifestRequest.newBuilder() to construct.
  private GenerateExclusivityManifestRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateExclusivityManifestRequest() {
    name_ = "";
    crdManifest_ = "";
    crManifest_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateExclusivityManifestRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GenerateExclusivityManifestRequest(
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

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              crdManifest_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              crManifest_ = s;
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
        .internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
        .internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest.class,
            com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The Membership resource name in the format
   * `projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The Membership resource name in the format
   * `projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CRD_MANIFEST_FIELD_NUMBER = 2;
  private volatile java.lang.Object crdManifest_;
  /**
   *
   *
   * <pre>
   * Optional. The YAML manifest of the membership CRD retrieved by
   * `kubectl get customresourcedefinitions membership`.
   * Leave empty if the resource does not exist.
   * </pre>
   *
   * <code>string crd_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The crdManifest.
   */
  @java.lang.Override
  public java.lang.String getCrdManifest() {
    java.lang.Object ref = crdManifest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      crdManifest_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The YAML manifest of the membership CRD retrieved by
   * `kubectl get customresourcedefinitions membership`.
   * Leave empty if the resource does not exist.
   * </pre>
   *
   * <code>string crd_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for crdManifest.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCrdManifestBytes() {
    java.lang.Object ref = crdManifest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      crdManifest_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CR_MANIFEST_FIELD_NUMBER = 3;
  private volatile java.lang.Object crManifest_;
  /**
   *
   *
   * <pre>
   * Optional. The YAML manifest of the membership CR retrieved by
   * `kubectl get memberships membership`.
   * Leave empty if the resource does not exist.
   * </pre>
   *
   * <code>string cr_manifest = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The crManifest.
   */
  @java.lang.Override
  public java.lang.String getCrManifest() {
    java.lang.Object ref = crManifest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      crManifest_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The YAML manifest of the membership CR retrieved by
   * `kubectl get memberships membership`.
   * Leave empty if the resource does not exist.
   * </pre>
   *
   * <code>string cr_manifest = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for crManifest.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCrManifestBytes() {
    java.lang.Object ref = crManifest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      crManifest_ = b;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getCrdManifestBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, crdManifest_);
    }
    if (!getCrManifestBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, crManifest_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getCrdManifestBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, crdManifest_);
    }
    if (!getCrManifestBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, crManifest_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest other =
        (com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getCrdManifest().equals(other.getCrdManifest())) return false;
    if (!getCrManifest().equals(other.getCrManifest())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CRD_MANIFEST_FIELD_NUMBER;
    hash = (53 * hash) + getCrdManifest().hashCode();
    hash = (37 * hash) + CR_MANIFEST_FIELD_NUMBER;
    hash = (53 * hash) + getCrManifest().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest parseFrom(
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
      com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest prototype) {
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
   * The request to generate the manifests for exclusivity artifacts.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest)
      com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest.class,
              com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest.newBuilder()
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
      name_ = "";

      crdManifest_ = "";

      crManifest_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest
        getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest build() {
      com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest buildPartial() {
      com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest result =
          new com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest(this);
      result.name_ = name_;
      result.crdManifest_ = crdManifest_;
      result.crManifest_ = crManifest_;
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
      if (other instanceof com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest) {
        return mergeFrom(
            (com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest other) {
      if (other
          == com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest
              .getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getCrdManifest().isEmpty()) {
        crdManifest_ = other.crdManifest_;
        onChanged();
      }
      if (!other.getCrManifest().isEmpty()) {
        crManifest_ = other.crManifest_;
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
      com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The Membership resource name in the format
     * `projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Membership resource name in the format
     * `projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Membership resource name in the format
     * `projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Membership resource name in the format
     * `projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Membership resource name in the format
     * `projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object crdManifest_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The YAML manifest of the membership CRD retrieved by
     * `kubectl get customresourcedefinitions membership`.
     * Leave empty if the resource does not exist.
     * </pre>
     *
     * <code>string crd_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The crdManifest.
     */
    public java.lang.String getCrdManifest() {
      java.lang.Object ref = crdManifest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        crdManifest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The YAML manifest of the membership CRD retrieved by
     * `kubectl get customresourcedefinitions membership`.
     * Leave empty if the resource does not exist.
     * </pre>
     *
     * <code>string crd_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for crdManifest.
     */
    public com.google.protobuf.ByteString getCrdManifestBytes() {
      java.lang.Object ref = crdManifest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        crdManifest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The YAML manifest of the membership CRD retrieved by
     * `kubectl get customresourcedefinitions membership`.
     * Leave empty if the resource does not exist.
     * </pre>
     *
     * <code>string crd_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The crdManifest to set.
     * @return This builder for chaining.
     */
    public Builder setCrdManifest(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      crdManifest_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The YAML manifest of the membership CRD retrieved by
     * `kubectl get customresourcedefinitions membership`.
     * Leave empty if the resource does not exist.
     * </pre>
     *
     * <code>string crd_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCrdManifest() {

      crdManifest_ = getDefaultInstance().getCrdManifest();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The YAML manifest of the membership CRD retrieved by
     * `kubectl get customresourcedefinitions membership`.
     * Leave empty if the resource does not exist.
     * </pre>
     *
     * <code>string crd_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for crdManifest to set.
     * @return This builder for chaining.
     */
    public Builder setCrdManifestBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      crdManifest_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object crManifest_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The YAML manifest of the membership CR retrieved by
     * `kubectl get memberships membership`.
     * Leave empty if the resource does not exist.
     * </pre>
     *
     * <code>string cr_manifest = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The crManifest.
     */
    public java.lang.String getCrManifest() {
      java.lang.Object ref = crManifest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        crManifest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The YAML manifest of the membership CR retrieved by
     * `kubectl get memberships membership`.
     * Leave empty if the resource does not exist.
     * </pre>
     *
     * <code>string cr_manifest = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for crManifest.
     */
    public com.google.protobuf.ByteString getCrManifestBytes() {
      java.lang.Object ref = crManifest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        crManifest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The YAML manifest of the membership CR retrieved by
     * `kubectl get memberships membership`.
     * Leave empty if the resource does not exist.
     * </pre>
     *
     * <code>string cr_manifest = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The crManifest to set.
     * @return This builder for chaining.
     */
    public Builder setCrManifest(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      crManifest_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The YAML manifest of the membership CR retrieved by
     * `kubectl get memberships membership`.
     * Leave empty if the resource does not exist.
     * </pre>
     *
     * <code>string cr_manifest = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCrManifest() {

      crManifest_ = getDefaultInstance().getCrManifest();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The YAML manifest of the membership CR retrieved by
     * `kubectl get memberships membership`.
     * Leave empty if the resource does not exist.
     * </pre>
     *
     * <code>string cr_manifest = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for crManifest to set.
     * @return This builder for chaining.
     */
    public Builder setCrManifestBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      crManifest_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest)
  private static final com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest();
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateExclusivityManifestRequest> PARSER =
      new com.google.protobuf.AbstractParser<GenerateExclusivityManifestRequest>() {
        @java.lang.Override
        public GenerateExclusivityManifestRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GenerateExclusivityManifestRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GenerateExclusivityManifestRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateExclusivityManifestRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
