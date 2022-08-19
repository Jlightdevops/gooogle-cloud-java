// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secretmanager/v1/resources.proto

package com.google.cloud.secretmanager.v1;

/**
 * <pre>
 * Describes the status of customer-managed encryption.
 * </pre>
 *
 * Protobuf type {@code google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus}
 */
public final class CustomerManagedEncryptionStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus)
    CustomerManagedEncryptionStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomerManagedEncryptionStatus.newBuilder() to construct.
  private CustomerManagedEncryptionStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomerManagedEncryptionStatus() {
    kmsKeyVersionName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomerManagedEncryptionStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CustomerManagedEncryptionStatus(
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

            kmsKeyVersionName_ = s;
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
    return com.google.cloud.secretmanager.v1.ResourcesProto.internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.secretmanager.v1.ResourcesProto.internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus.class, com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus.Builder.class);
  }

  public static final int KMS_KEY_VERSION_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object kmsKeyVersionName_;
  /**
   * <pre>
   * Required. The resource name of the Cloud KMS CryptoKeyVersion used to encrypt the
   * secret payload, in the following format:
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string kms_key_version_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The kmsKeyVersionName.
   */
  @java.lang.Override
  public java.lang.String getKmsKeyVersionName() {
    java.lang.Object ref = kmsKeyVersionName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kmsKeyVersionName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the Cloud KMS CryptoKeyVersion used to encrypt the
   * secret payload, in the following format:
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string kms_key_version_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for kmsKeyVersionName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKmsKeyVersionNameBytes() {
    java.lang.Object ref = kmsKeyVersionName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kmsKeyVersionName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kmsKeyVersionName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kmsKeyVersionName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kmsKeyVersionName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kmsKeyVersionName_);
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
    if (!(obj instanceof com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus other = (com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus) obj;

    if (!getKmsKeyVersionName()
        .equals(other.getKmsKeyVersionName())) return false;
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
    hash = (37 * hash) + KMS_KEY_VERSION_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getKmsKeyVersionName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parseFrom(
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
  public static Builder newBuilder(com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus prototype) {
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
   * Describes the status of customer-managed encryption.
   * </pre>
   *
   * Protobuf type {@code google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus)
      com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.secretmanager.v1.ResourcesProto.internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.secretmanager.v1.ResourcesProto.internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus.class, com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus.Builder.class);
    }

    // Construct using com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus.newBuilder()
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
      kmsKeyVersionName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.secretmanager.v1.ResourcesProto.internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus getDefaultInstanceForType() {
      return com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus build() {
      com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus buildPartial() {
      com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus result = new com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus(this);
      result.kmsKeyVersionName_ = kmsKeyVersionName_;
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
      if (other instanceof com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus) {
        return mergeFrom((com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus other) {
      if (other == com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus.getDefaultInstance()) return this;
      if (!other.getKmsKeyVersionName().isEmpty()) {
        kmsKeyVersionName_ = other.kmsKeyVersionName_;
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
      com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object kmsKeyVersionName_ = "";
    /**
     * <pre>
     * Required. The resource name of the Cloud KMS CryptoKeyVersion used to encrypt the
     * secret payload, in the following format:
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string kms_key_version_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The kmsKeyVersionName.
     */
    public java.lang.String getKmsKeyVersionName() {
      java.lang.Object ref = kmsKeyVersionName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kmsKeyVersionName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the Cloud KMS CryptoKeyVersion used to encrypt the
     * secret payload, in the following format:
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string kms_key_version_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for kmsKeyVersionName.
     */
    public com.google.protobuf.ByteString
        getKmsKeyVersionNameBytes() {
      java.lang.Object ref = kmsKeyVersionName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kmsKeyVersionName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the Cloud KMS CryptoKeyVersion used to encrypt the
     * secret payload, in the following format:
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string kms_key_version_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The kmsKeyVersionName to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyVersionName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kmsKeyVersionName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the Cloud KMS CryptoKeyVersion used to encrypt the
     * secret payload, in the following format:
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string kms_key_version_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearKmsKeyVersionName() {
      
      kmsKeyVersionName_ = getDefaultInstance().getKmsKeyVersionName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the Cloud KMS CryptoKeyVersion used to encrypt the
     * secret payload, in the following format:
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string kms_key_version_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for kmsKeyVersionName to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyVersionNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kmsKeyVersionName_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus)
  private static final com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus();
  }

  public static com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerManagedEncryptionStatus>
      PARSER = new com.google.protobuf.AbstractParser<CustomerManagedEncryptionStatus>() {
    @java.lang.Override
    public CustomerManagedEncryptionStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CustomerManagedEncryptionStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CustomerManagedEncryptionStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerManagedEncryptionStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

