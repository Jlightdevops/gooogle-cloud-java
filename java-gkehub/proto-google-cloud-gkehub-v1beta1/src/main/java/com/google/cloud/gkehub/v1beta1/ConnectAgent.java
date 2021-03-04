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
 * The information required from end users to use GKE Connect.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1beta1.ConnectAgent}
 */
public final class ConnectAgent extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1beta1.ConnectAgent)
    ConnectAgentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConnectAgent.newBuilder() to construct.
  private ConnectAgent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConnectAgent() {
    name_ = "";
    proxy_ = com.google.protobuf.ByteString.EMPTY;
    namespace_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConnectAgent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ConnectAgent(
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
              proxy_ = input.readBytes();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              namespace_ = s;
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
        .internal_static_google_cloud_gkehub_v1beta1_ConnectAgent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
        .internal_static_google_cloud_gkehub_v1beta1_ConnectAgent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1beta1.ConnectAgent.class,
            com.google.cloud.gkehub.v1beta1.ConnectAgent.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Do not set.
   * </pre>
   *
   * <code>string name = 1 [deprecated = true];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  @java.lang.Deprecated
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
   * Do not set.
   * </pre>
   *
   * <code>string name = 1 [deprecated = true];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  @java.lang.Deprecated
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

  public static final int PROXY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString proxy_;
  /**
   *
   *
   * <pre>
   * Optional. URI of a proxy if connectivity from the agent to gkeconnect.googleapis.com
   * requires the use of a proxy. Format must be in the form
   * `http(s)://{proxy_address}`, depending on the HTTP/HTTPS protocol
   * supported by the proxy. This will direct the connect agent's outbound
   * traffic through a HTTP(S) proxy.
   * </pre>
   *
   * <code>bytes proxy = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The proxy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProxy() {
    return proxy_;
  }

  public static final int NAMESPACE_FIELD_NUMBER = 3;
  private volatile java.lang.Object namespace_;
  /**
   *
   *
   * <pre>
   * Optional. Namespace for GKE Connect agent resources. Defaults to `gke-connect`.
   * The Connect Agent is authorized automatically when run in the default
   * namespace. Otherwise, explicit authorization must be granted with an
   * additional IAM binding.
   * </pre>
   *
   * <code>string namespace = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The namespace.
   */
  @java.lang.Override
  public java.lang.String getNamespace() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Namespace for GKE Connect agent resources. Defaults to `gke-connect`.
   * The Connect Agent is authorized automatically when run in the default
   * namespace. Otherwise, explicit authorization must be granted with an
   * additional IAM binding.
   * </pre>
   *
   * <code>string namespace = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for namespace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNamespaceBytes() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      namespace_ = b;
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
    if (!proxy_.isEmpty()) {
      output.writeBytes(2, proxy_);
    }
    if (!getNamespaceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, namespace_);
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
    if (!proxy_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, proxy_);
    }
    if (!getNamespaceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, namespace_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1beta1.ConnectAgent)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1beta1.ConnectAgent other =
        (com.google.cloud.gkehub.v1beta1.ConnectAgent) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getProxy().equals(other.getProxy())) return false;
    if (!getNamespace().equals(other.getNamespace())) return false;
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
    hash = (37 * hash) + PROXY_FIELD_NUMBER;
    hash = (53 * hash) + getProxy().hashCode();
    hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getNamespace().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkehub.v1beta1.ConnectAgent prototype) {
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
   * The information required from end users to use GKE Connect.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1beta1.ConnectAgent}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1beta1.ConnectAgent)
      com.google.cloud.gkehub.v1beta1.ConnectAgentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_ConnectAgent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_ConnectAgent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1beta1.ConnectAgent.class,
              com.google.cloud.gkehub.v1beta1.ConnectAgent.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1beta1.ConnectAgent.newBuilder()
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

      proxy_ = com.google.protobuf.ByteString.EMPTY;

      namespace_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_ConnectAgent_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ConnectAgent getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1beta1.ConnectAgent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ConnectAgent build() {
      com.google.cloud.gkehub.v1beta1.ConnectAgent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ConnectAgent buildPartial() {
      com.google.cloud.gkehub.v1beta1.ConnectAgent result =
          new com.google.cloud.gkehub.v1beta1.ConnectAgent(this);
      result.name_ = name_;
      result.proxy_ = proxy_;
      result.namespace_ = namespace_;
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
      if (other instanceof com.google.cloud.gkehub.v1beta1.ConnectAgent) {
        return mergeFrom((com.google.cloud.gkehub.v1beta1.ConnectAgent) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1beta1.ConnectAgent other) {
      if (other == com.google.cloud.gkehub.v1beta1.ConnectAgent.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getProxy() != com.google.protobuf.ByteString.EMPTY) {
        setProxy(other.getProxy());
      }
      if (!other.getNamespace().isEmpty()) {
        namespace_ = other.namespace_;
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
      com.google.cloud.gkehub.v1beta1.ConnectAgent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.gkehub.v1beta1.ConnectAgent) e.getUnfinishedMessage();
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
     * Do not set.
     * </pre>
     *
     * <code>string name = 1 [deprecated = true];</code>
     *
     * @return The name.
     */
    @java.lang.Deprecated
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
     * Do not set.
     * </pre>
     *
     * <code>string name = 1 [deprecated = true];</code>
     *
     * @return The bytes for name.
     */
    @java.lang.Deprecated
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
     * Do not set.
     * </pre>
     *
     * <code>string name = 1 [deprecated = true];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
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
     * Do not set.
     * </pre>
     *
     * <code>string name = 1 [deprecated = true];</code>
     *
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Do not set.
     * </pre>
     *
     * <code>string name = 1 [deprecated = true];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString proxy_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Optional. URI of a proxy if connectivity from the agent to gkeconnect.googleapis.com
     * requires the use of a proxy. Format must be in the form
     * `http(s)://{proxy_address}`, depending on the HTTP/HTTPS protocol
     * supported by the proxy. This will direct the connect agent's outbound
     * traffic through a HTTP(S) proxy.
     * </pre>
     *
     * <code>bytes proxy = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The proxy.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getProxy() {
      return proxy_;
    }
    /**
     *
     *
     * <pre>
     * Optional. URI of a proxy if connectivity from the agent to gkeconnect.googleapis.com
     * requires the use of a proxy. Format must be in the form
     * `http(s)://{proxy_address}`, depending on the HTTP/HTTPS protocol
     * supported by the proxy. This will direct the connect agent's outbound
     * traffic through a HTTP(S) proxy.
     * </pre>
     *
     * <code>bytes proxy = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The proxy to set.
     * @return This builder for chaining.
     */
    public Builder setProxy(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      proxy_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. URI of a proxy if connectivity from the agent to gkeconnect.googleapis.com
     * requires the use of a proxy. Format must be in the form
     * `http(s)://{proxy_address}`, depending on the HTTP/HTTPS protocol
     * supported by the proxy. This will direct the connect agent's outbound
     * traffic through a HTTP(S) proxy.
     * </pre>
     *
     * <code>bytes proxy = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProxy() {

      proxy_ = getDefaultInstance().getProxy();
      onChanged();
      return this;
    }

    private java.lang.Object namespace_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Namespace for GKE Connect agent resources. Defaults to `gke-connect`.
     * The Connect Agent is authorized automatically when run in the default
     * namespace. Otherwise, explicit authorization must be granted with an
     * additional IAM binding.
     * </pre>
     *
     * <code>string namespace = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The namespace.
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Namespace for GKE Connect agent resources. Defaults to `gke-connect`.
     * The Connect Agent is authorized automatically when run in the default
     * namespace. Otherwise, explicit authorization must be granted with an
     * additional IAM binding.
     * </pre>
     *
     * <code>string namespace = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for namespace.
     */
    public com.google.protobuf.ByteString getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Namespace for GKE Connect agent resources. Defaults to `gke-connect`.
     * The Connect Agent is authorized automatically when run in the default
     * namespace. Otherwise, explicit authorization must be granted with an
     * additional IAM binding.
     * </pre>
     *
     * <code>string namespace = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespace(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      namespace_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Namespace for GKE Connect agent resources. Defaults to `gke-connect`.
     * The Connect Agent is authorized automatically when run in the default
     * namespace. Otherwise, explicit authorization must be granted with an
     * additional IAM binding.
     * </pre>
     *
     * <code>string namespace = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNamespace() {

      namespace_ = getDefaultInstance().getNamespace();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Namespace for GKE Connect agent resources. Defaults to `gke-connect`.
     * The Connect Agent is authorized automatically when run in the default
     * namespace. Otherwise, explicit authorization must be granted with an
     * additional IAM binding.
     * </pre>
     *
     * <code>string namespace = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      namespace_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1beta1.ConnectAgent)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1beta1.ConnectAgent)
  private static final com.google.cloud.gkehub.v1beta1.ConnectAgent DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1beta1.ConnectAgent();
  }

  public static com.google.cloud.gkehub.v1beta1.ConnectAgent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectAgent> PARSER =
      new com.google.protobuf.AbstractParser<ConnectAgent>() {
        @java.lang.Override
        public ConnectAgent parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ConnectAgent(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ConnectAgent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectAgent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1beta1.ConnectAgent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
