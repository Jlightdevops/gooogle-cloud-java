// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/repository.proto

package com.google.devtools.artifactregistry.v1beta2;

/**
 * <pre>
 * The request to create a new repository.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest}
 */
public final class CreateRepositoryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest)
    CreateRepositoryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRepositoryRequest.newBuilder() to construct.
  private CreateRepositoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRepositoryRequest() {
    parent_ = "";
    repositoryId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateRepositoryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateRepositoryRequest(
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

            parent_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            repositoryId_ = s;
            break;
          }
          case 26: {
            com.google.devtools.artifactregistry.v1beta2.Repository.Builder subBuilder = null;
            if (repository_ != null) {
              subBuilder = repository_.toBuilder();
            }
            repository_ = input.readMessage(com.google.devtools.artifactregistry.v1beta2.Repository.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(repository_);
              repository_ = subBuilder.buildPartial();
            }

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
    return com.google.devtools.artifactregistry.v1beta2.RepositoryProto.internal_static_google_devtools_artifactregistry_v1beta2_CreateRepositoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1beta2.RepositoryProto.internal_static_google_devtools_artifactregistry_v1beta2_CreateRepositoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest.class, com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The name of the parent resource where the repository will be created.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the parent resource where the repository will be created.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPOSITORY_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object repositoryId_;
  /**
   * <pre>
   * The repository id to use for this repository.
   * </pre>
   *
   * <code>string repository_id = 2;</code>
   * @return The repositoryId.
   */
  @java.lang.Override
  public java.lang.String getRepositoryId() {
    java.lang.Object ref = repositoryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      repositoryId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The repository id to use for this repository.
   * </pre>
   *
   * <code>string repository_id = 2;</code>
   * @return The bytes for repositoryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRepositoryIdBytes() {
    java.lang.Object ref = repositoryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      repositoryId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPOSITORY_FIELD_NUMBER = 3;
  private com.google.devtools.artifactregistry.v1beta2.Repository repository_;
  /**
   * <pre>
   * The repository to be created.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
   * @return Whether the repository field is set.
   */
  @java.lang.Override
  public boolean hasRepository() {
    return repository_ != null;
  }
  /**
   * <pre>
   * The repository to be created.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
   * @return The repository.
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.Repository getRepository() {
    return repository_ == null ? com.google.devtools.artifactregistry.v1beta2.Repository.getDefaultInstance() : repository_;
  }
  /**
   * <pre>
   * The repository to be created.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.RepositoryOrBuilder getRepositoryOrBuilder() {
    return getRepository();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(repositoryId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, repositoryId_);
    }
    if (repository_ != null) {
      output.writeMessage(3, getRepository());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(repositoryId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, repositoryId_);
    }
    if (repository_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRepository());
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest other = (com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getRepositoryId()
        .equals(other.getRepositoryId())) return false;
    if (hasRepository() != other.hasRepository()) return false;
    if (hasRepository()) {
      if (!getRepository()
          .equals(other.getRepository())) return false;
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
    hash = (37 * hash) + REPOSITORY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRepositoryId().hashCode();
    if (hasRepository()) {
      hash = (37 * hash) + REPOSITORY_FIELD_NUMBER;
      hash = (53 * hash) + getRepository().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest prototype) {
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
   * The request to create a new repository.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest)
      com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.artifactregistry.v1beta2.RepositoryProto.internal_static_google_devtools_artifactregistry_v1beta2_CreateRepositoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1beta2.RepositoryProto.internal_static_google_devtools_artifactregistry_v1beta2_CreateRepositoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest.class, com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest.newBuilder()
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
      parent_ = "";

      repositoryId_ = "";

      if (repositoryBuilder_ == null) {
        repository_ = null;
      } else {
        repository_ = null;
        repositoryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1beta2.RepositoryProto.internal_static_google_devtools_artifactregistry_v1beta2_CreateRepositoryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest build() {
      com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest buildPartial() {
      com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest result = new com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest(this);
      result.parent_ = parent_;
      result.repositoryId_ = repositoryId_;
      if (repositoryBuilder_ == null) {
        result.repository_ = repository_;
      } else {
        result.repository_ = repositoryBuilder_.build();
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
      if (other instanceof com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest) {
        return mergeFrom((com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest other) {
      if (other == com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getRepositoryId().isEmpty()) {
        repositoryId_ = other.repositoryId_;
        onChanged();
      }
      if (other.hasRepository()) {
        mergeRepository(other.getRepository());
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
      com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest) e.getUnfinishedMessage();
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
     * <pre>
     * Required. The name of the parent resource where the repository will be created.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the parent resource where the repository will be created.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the parent resource where the repository will be created.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the parent resource where the repository will be created.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the parent resource where the repository will be created.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object repositoryId_ = "";
    /**
     * <pre>
     * The repository id to use for this repository.
     * </pre>
     *
     * <code>string repository_id = 2;</code>
     * @return The repositoryId.
     */
    public java.lang.String getRepositoryId() {
      java.lang.Object ref = repositoryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repositoryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The repository id to use for this repository.
     * </pre>
     *
     * <code>string repository_id = 2;</code>
     * @return The bytes for repositoryId.
     */
    public com.google.protobuf.ByteString
        getRepositoryIdBytes() {
      java.lang.Object ref = repositoryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        repositoryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The repository id to use for this repository.
     * </pre>
     *
     * <code>string repository_id = 2;</code>
     * @param value The repositoryId to set.
     * @return This builder for chaining.
     */
    public Builder setRepositoryId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      repositoryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The repository id to use for this repository.
     * </pre>
     *
     * <code>string repository_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRepositoryId() {
      
      repositoryId_ = getDefaultInstance().getRepositoryId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The repository id to use for this repository.
     * </pre>
     *
     * <code>string repository_id = 2;</code>
     * @param value The bytes for repositoryId to set.
     * @return This builder for chaining.
     */
    public Builder setRepositoryIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      repositoryId_ = value;
      onChanged();
      return this;
    }

    private com.google.devtools.artifactregistry.v1beta2.Repository repository_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.artifactregistry.v1beta2.Repository, com.google.devtools.artifactregistry.v1beta2.Repository.Builder, com.google.devtools.artifactregistry.v1beta2.RepositoryOrBuilder> repositoryBuilder_;
    /**
     * <pre>
     * The repository to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
     * @return Whether the repository field is set.
     */
    public boolean hasRepository() {
      return repositoryBuilder_ != null || repository_ != null;
    }
    /**
     * <pre>
     * The repository to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
     * @return The repository.
     */
    public com.google.devtools.artifactregistry.v1beta2.Repository getRepository() {
      if (repositoryBuilder_ == null) {
        return repository_ == null ? com.google.devtools.artifactregistry.v1beta2.Repository.getDefaultInstance() : repository_;
      } else {
        return repositoryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The repository to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
     */
    public Builder setRepository(com.google.devtools.artifactregistry.v1beta2.Repository value) {
      if (repositoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        repository_ = value;
        onChanged();
      } else {
        repositoryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The repository to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
     */
    public Builder setRepository(
        com.google.devtools.artifactregistry.v1beta2.Repository.Builder builderForValue) {
      if (repositoryBuilder_ == null) {
        repository_ = builderForValue.build();
        onChanged();
      } else {
        repositoryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The repository to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
     */
    public Builder mergeRepository(com.google.devtools.artifactregistry.v1beta2.Repository value) {
      if (repositoryBuilder_ == null) {
        if (repository_ != null) {
          repository_ =
            com.google.devtools.artifactregistry.v1beta2.Repository.newBuilder(repository_).mergeFrom(value).buildPartial();
        } else {
          repository_ = value;
        }
        onChanged();
      } else {
        repositoryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The repository to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
     */
    public Builder clearRepository() {
      if (repositoryBuilder_ == null) {
        repository_ = null;
        onChanged();
      } else {
        repository_ = null;
        repositoryBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The repository to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.Repository.Builder getRepositoryBuilder() {
      
      onChanged();
      return getRepositoryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The repository to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.RepositoryOrBuilder getRepositoryOrBuilder() {
      if (repositoryBuilder_ != null) {
        return repositoryBuilder_.getMessageOrBuilder();
      } else {
        return repository_ == null ?
            com.google.devtools.artifactregistry.v1beta2.Repository.getDefaultInstance() : repository_;
      }
    }
    /**
     * <pre>
     * The repository to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Repository repository = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.artifactregistry.v1beta2.Repository, com.google.devtools.artifactregistry.v1beta2.Repository.Builder, com.google.devtools.artifactregistry.v1beta2.RepositoryOrBuilder> 
        getRepositoryFieldBuilder() {
      if (repositoryBuilder_ == null) {
        repositoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.artifactregistry.v1beta2.Repository, com.google.devtools.artifactregistry.v1beta2.Repository.Builder, com.google.devtools.artifactregistry.v1beta2.RepositoryOrBuilder>(
                getRepository(),
                getParentForChildren(),
                isClean());
        repository_ = null;
      }
      return repositoryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest)
  private static final com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest();
  }

  public static com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRepositoryRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateRepositoryRequest>() {
    @java.lang.Override
    public CreateRepositoryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateRepositoryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateRepositoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRepositoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

