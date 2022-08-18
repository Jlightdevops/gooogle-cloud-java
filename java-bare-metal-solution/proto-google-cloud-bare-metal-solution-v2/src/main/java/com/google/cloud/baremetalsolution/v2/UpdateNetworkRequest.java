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
// source: google/cloud/baremetalsolution/v2/network.proto

package com.google.cloud.baremetalsolution.v2;

/**
 *
 *
 * <pre>
 * Message requesting to updating a network.
 * </pre>
 *
 * Protobuf type {@code google.cloud.baremetalsolution.v2.UpdateNetworkRequest}
 */
public final class UpdateNetworkRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.baremetalsolution.v2.UpdateNetworkRequest)
    UpdateNetworkRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateNetworkRequest.newBuilder() to construct.
  private UpdateNetworkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateNetworkRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateNetworkRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateNetworkRequest(
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
              com.google.cloud.baremetalsolution.v2.Network.Builder subBuilder = null;
              if (network_ != null) {
                subBuilder = network_.toBuilder();
              }
              network_ =
                  input.readMessage(
                      com.google.cloud.baremetalsolution.v2.Network.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(network_);
                network_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
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
    return com.google.cloud.baremetalsolution.v2.NetworkProto
        .internal_static_google_cloud_baremetalsolution_v2_UpdateNetworkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.baremetalsolution.v2.NetworkProto
        .internal_static_google_cloud_baremetalsolution_v2_UpdateNetworkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest.class,
            com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest.Builder.class);
  }

  public static final int NETWORK_FIELD_NUMBER = 1;
  private com.google.cloud.baremetalsolution.v2.Network network_;
  /**
   *
   *
   * <pre>
   * Required. The network to update.
   * The `name` field is used to identify the instance to update.
   * Format: projects/{project}/locations/{location}/networks/{network}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.Network network = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the network field is set.
   */
  @java.lang.Override
  public boolean hasNetwork() {
    return network_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The network to update.
   * The `name` field is used to identify the instance to update.
   * Format: projects/{project}/locations/{location}/networks/{network}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.Network network = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The network.
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.Network getNetwork() {
    return network_ == null
        ? com.google.cloud.baremetalsolution.v2.Network.getDefaultInstance()
        : network_;
  }
  /**
   *
   *
   * <pre>
   * Required. The network to update.
   * The `name` field is used to identify the instance to update.
   * Format: projects/{project}/locations/{location}/networks/{network}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.Network network = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.NetworkOrBuilder getNetworkOrBuilder() {
    return getNetwork();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The only currently supported fields are:
   *   `labels`, `reservations`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The only currently supported fields are:
   *   `labels`, `reservations`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The only currently supported fields are:
   *   `labels`, `reservations`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (network_ != null) {
      output.writeMessage(1, getNetwork());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (network_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getNetwork());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest other =
        (com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest) obj;

    if (hasNetwork() != other.hasNetwork()) return false;
    if (hasNetwork()) {
      if (!getNetwork().equals(other.getNetwork())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasNetwork()) {
      hash = (37 * hash) + NETWORK_FIELD_NUMBER;
      hash = (53 * hash) + getNetwork().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parseFrom(
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
      com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest prototype) {
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
   * Message requesting to updating a network.
   * </pre>
   *
   * Protobuf type {@code google.cloud.baremetalsolution.v2.UpdateNetworkRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.baremetalsolution.v2.UpdateNetworkRequest)
      com.google.cloud.baremetalsolution.v2.UpdateNetworkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.baremetalsolution.v2.NetworkProto
          .internal_static_google_cloud_baremetalsolution_v2_UpdateNetworkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.baremetalsolution.v2.NetworkProto
          .internal_static_google_cloud_baremetalsolution_v2_UpdateNetworkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest.class,
              com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest.Builder.class);
    }

    // Construct using com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest.newBuilder()
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
      if (networkBuilder_ == null) {
        network_ = null;
      } else {
        network_ = null;
        networkBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.baremetalsolution.v2.NetworkProto
          .internal_static_google_cloud_baremetalsolution_v2_UpdateNetworkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest getDefaultInstanceForType() {
      return com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest build() {
      com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest buildPartial() {
      com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest result =
          new com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest(this);
      if (networkBuilder_ == null) {
        result.network_ = network_;
      } else {
        result.network_ = networkBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest) {
        return mergeFrom((com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest other) {
      if (other == com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest.getDefaultInstance())
        return this;
      if (other.hasNetwork()) {
        mergeNetwork(other.getNetwork());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.baremetalsolution.v2.Network network_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.Network,
            com.google.cloud.baremetalsolution.v2.Network.Builder,
            com.google.cloud.baremetalsolution.v2.NetworkOrBuilder>
        networkBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The network to update.
     * The `name` field is used to identify the instance to update.
     * Format: projects/{project}/locations/{location}/networks/{network}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Network network = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the network field is set.
     */
    public boolean hasNetwork() {
      return networkBuilder_ != null || network_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The network to update.
     * The `name` field is used to identify the instance to update.
     * Format: projects/{project}/locations/{location}/networks/{network}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Network network = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The network.
     */
    public com.google.cloud.baremetalsolution.v2.Network getNetwork() {
      if (networkBuilder_ == null) {
        return network_ == null
            ? com.google.cloud.baremetalsolution.v2.Network.getDefaultInstance()
            : network_;
      } else {
        return networkBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The network to update.
     * The `name` field is used to identify the instance to update.
     * Format: projects/{project}/locations/{location}/networks/{network}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Network network = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNetwork(com.google.cloud.baremetalsolution.v2.Network value) {
      if (networkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        network_ = value;
        onChanged();
      } else {
        networkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The network to update.
     * The `name` field is used to identify the instance to update.
     * Format: projects/{project}/locations/{location}/networks/{network}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Network network = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNetwork(
        com.google.cloud.baremetalsolution.v2.Network.Builder builderForValue) {
      if (networkBuilder_ == null) {
        network_ = builderForValue.build();
        onChanged();
      } else {
        networkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The network to update.
     * The `name` field is used to identify the instance to update.
     * Format: projects/{project}/locations/{location}/networks/{network}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Network network = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeNetwork(com.google.cloud.baremetalsolution.v2.Network value) {
      if (networkBuilder_ == null) {
        if (network_ != null) {
          network_ =
              com.google.cloud.baremetalsolution.v2.Network.newBuilder(network_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          network_ = value;
        }
        onChanged();
      } else {
        networkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The network to update.
     * The `name` field is used to identify the instance to update.
     * Format: projects/{project}/locations/{location}/networks/{network}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Network network = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearNetwork() {
      if (networkBuilder_ == null) {
        network_ = null;
        onChanged();
      } else {
        network_ = null;
        networkBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The network to update.
     * The `name` field is used to identify the instance to update.
     * Format: projects/{project}/locations/{location}/networks/{network}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Network network = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.baremetalsolution.v2.Network.Builder getNetworkBuilder() {

      onChanged();
      return getNetworkFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The network to update.
     * The `name` field is used to identify the instance to update.
     * Format: projects/{project}/locations/{location}/networks/{network}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Network network = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.baremetalsolution.v2.NetworkOrBuilder getNetworkOrBuilder() {
      if (networkBuilder_ != null) {
        return networkBuilder_.getMessageOrBuilder();
      } else {
        return network_ == null
            ? com.google.cloud.baremetalsolution.v2.Network.getDefaultInstance()
            : network_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The network to update.
     * The `name` field is used to identify the instance to update.
     * Format: projects/{project}/locations/{location}/networks/{network}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Network network = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.Network,
            com.google.cloud.baremetalsolution.v2.Network.Builder,
            com.google.cloud.baremetalsolution.v2.NetworkOrBuilder>
        getNetworkFieldBuilder() {
      if (networkBuilder_ == null) {
        networkBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.baremetalsolution.v2.Network,
                com.google.cloud.baremetalsolution.v2.Network.Builder,
                com.google.cloud.baremetalsolution.v2.NetworkOrBuilder>(
                getNetwork(), getParentForChildren(), isClean());
        network_ = null;
      }
      return networkBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`, `reservations`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`, `reservations`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`, `reservations`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`, `reservations`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`, `reservations`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`, `reservations`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`, `reservations`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`, `reservations`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `labels`, `reservations`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.baremetalsolution.v2.UpdateNetworkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.baremetalsolution.v2.UpdateNetworkRequest)
  private static final com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest();
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateNetworkRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateNetworkRequest>() {
        @java.lang.Override
        public UpdateNetworkRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateNetworkRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateNetworkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateNetworkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.UpdateNetworkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
