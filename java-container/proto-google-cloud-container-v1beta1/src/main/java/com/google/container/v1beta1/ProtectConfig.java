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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * ProtectConfig defines the flags needed to enable/disable features for the
 * Protect API.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.ProtectConfig}
 */
public final class ProtectConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.ProtectConfig)
    ProtectConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProtectConfig.newBuilder() to construct.
  private ProtectConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProtectConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProtectConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ProtectConfig(
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
              com.google.container.v1beta1.WorkloadConfig.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = workloadConfig_.toBuilder();
              }
              workloadConfig_ =
                  input.readMessage(
                      com.google.container.v1beta1.WorkloadConfig.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(workloadConfig_);
                workloadConfig_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_ProtectConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_ProtectConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.ProtectConfig.class,
            com.google.container.v1beta1.ProtectConfig.Builder.class);
  }

  private int bitField0_;
  public static final int WORKLOAD_CONFIG_FIELD_NUMBER = 1;
  private com.google.container.v1beta1.WorkloadConfig workloadConfig_;
  /**
   *
   *
   * <pre>
   * WorkloadConfig defines which actions are enabled for a cluster's workload
   * configurations.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
   *
   * @return Whether the workloadConfig field is set.
   */
  @java.lang.Override
  public boolean hasWorkloadConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * WorkloadConfig defines which actions are enabled for a cluster's workload
   * configurations.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
   *
   * @return The workloadConfig.
   */
  @java.lang.Override
  public com.google.container.v1beta1.WorkloadConfig getWorkloadConfig() {
    return workloadConfig_ == null
        ? com.google.container.v1beta1.WorkloadConfig.getDefaultInstance()
        : workloadConfig_;
  }
  /**
   *
   *
   * <pre>
   * WorkloadConfig defines which actions are enabled for a cluster's workload
   * configurations.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1beta1.WorkloadConfigOrBuilder getWorkloadConfigOrBuilder() {
    return workloadConfig_ == null
        ? com.google.container.v1beta1.WorkloadConfig.getDefaultInstance()
        : workloadConfig_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getWorkloadConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getWorkloadConfig());
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
    if (!(obj instanceof com.google.container.v1beta1.ProtectConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.ProtectConfig other =
        (com.google.container.v1beta1.ProtectConfig) obj;

    if (hasWorkloadConfig() != other.hasWorkloadConfig()) return false;
    if (hasWorkloadConfig()) {
      if (!getWorkloadConfig().equals(other.getWorkloadConfig())) return false;
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
    if (hasWorkloadConfig()) {
      hash = (37 * hash) + WORKLOAD_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getWorkloadConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.ProtectConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.ProtectConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.ProtectConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.ProtectConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.ProtectConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.ProtectConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.ProtectConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.ProtectConfig prototype) {
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
   * ProtectConfig defines the flags needed to enable/disable features for the
   * Protect API.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.ProtectConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.ProtectConfig)
      com.google.container.v1beta1.ProtectConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_ProtectConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_ProtectConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.ProtectConfig.class,
              com.google.container.v1beta1.ProtectConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.ProtectConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getWorkloadConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (workloadConfigBuilder_ == null) {
        workloadConfig_ = null;
      } else {
        workloadConfigBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_ProtectConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.ProtectConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.ProtectConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.ProtectConfig build() {
      com.google.container.v1beta1.ProtectConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.ProtectConfig buildPartial() {
      com.google.container.v1beta1.ProtectConfig result =
          new com.google.container.v1beta1.ProtectConfig(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (workloadConfigBuilder_ == null) {
          result.workloadConfig_ = workloadConfig_;
        } else {
          result.workloadConfig_ = workloadConfigBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.container.v1beta1.ProtectConfig) {
        return mergeFrom((com.google.container.v1beta1.ProtectConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.ProtectConfig other) {
      if (other == com.google.container.v1beta1.ProtectConfig.getDefaultInstance()) return this;
      if (other.hasWorkloadConfig()) {
        mergeWorkloadConfig(other.getWorkloadConfig());
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
      com.google.container.v1beta1.ProtectConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1beta1.ProtectConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.container.v1beta1.WorkloadConfig workloadConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1beta1.WorkloadConfig,
            com.google.container.v1beta1.WorkloadConfig.Builder,
            com.google.container.v1beta1.WorkloadConfigOrBuilder>
        workloadConfigBuilder_;
    /**
     *
     *
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     *
     * @return Whether the workloadConfig field is set.
     */
    public boolean hasWorkloadConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     *
     * @return The workloadConfig.
     */
    public com.google.container.v1beta1.WorkloadConfig getWorkloadConfig() {
      if (workloadConfigBuilder_ == null) {
        return workloadConfig_ == null
            ? com.google.container.v1beta1.WorkloadConfig.getDefaultInstance()
            : workloadConfig_;
      } else {
        return workloadConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    public Builder setWorkloadConfig(com.google.container.v1beta1.WorkloadConfig value) {
      if (workloadConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workloadConfig_ = value;
        onChanged();
      } else {
        workloadConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    public Builder setWorkloadConfig(
        com.google.container.v1beta1.WorkloadConfig.Builder builderForValue) {
      if (workloadConfigBuilder_ == null) {
        workloadConfig_ = builderForValue.build();
        onChanged();
      } else {
        workloadConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    public Builder mergeWorkloadConfig(com.google.container.v1beta1.WorkloadConfig value) {
      if (workloadConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && workloadConfig_ != null
            && workloadConfig_
                != com.google.container.v1beta1.WorkloadConfig.getDefaultInstance()) {
          workloadConfig_ =
              com.google.container.v1beta1.WorkloadConfig.newBuilder(workloadConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          workloadConfig_ = value;
        }
        onChanged();
      } else {
        workloadConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    public Builder clearWorkloadConfig() {
      if (workloadConfigBuilder_ == null) {
        workloadConfig_ = null;
        onChanged();
      } else {
        workloadConfigBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     *
     *
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    public com.google.container.v1beta1.WorkloadConfig.Builder getWorkloadConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWorkloadConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    public com.google.container.v1beta1.WorkloadConfigOrBuilder getWorkloadConfigOrBuilder() {
      if (workloadConfigBuilder_ != null) {
        return workloadConfigBuilder_.getMessageOrBuilder();
      } else {
        return workloadConfig_ == null
            ? com.google.container.v1beta1.WorkloadConfig.getDefaultInstance()
            : workloadConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * WorkloadConfig defines which actions are enabled for a cluster's workload
     * configurations.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig workload_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1beta1.WorkloadConfig,
            com.google.container.v1beta1.WorkloadConfig.Builder,
            com.google.container.v1beta1.WorkloadConfigOrBuilder>
        getWorkloadConfigFieldBuilder() {
      if (workloadConfigBuilder_ == null) {
        workloadConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.container.v1beta1.WorkloadConfig,
                com.google.container.v1beta1.WorkloadConfig.Builder,
                com.google.container.v1beta1.WorkloadConfigOrBuilder>(
                getWorkloadConfig(), getParentForChildren(), isClean());
        workloadConfig_ = null;
      }
      return workloadConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.ProtectConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.ProtectConfig)
  private static final com.google.container.v1beta1.ProtectConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.ProtectConfig();
  }

  public static com.google.container.v1beta1.ProtectConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProtectConfig> PARSER =
      new com.google.protobuf.AbstractParser<ProtectConfig>() {
        @java.lang.Override
        public ProtectConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ProtectConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ProtectConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProtectConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.ProtectConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
