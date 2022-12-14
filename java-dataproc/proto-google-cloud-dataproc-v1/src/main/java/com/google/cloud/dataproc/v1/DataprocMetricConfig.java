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
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Specifies a Dataproc metric config
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.DataprocMetricConfig}
 */
public final class DataprocMetricConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.DataprocMetricConfig)
    DataprocMetricConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataprocMetricConfig.newBuilder() to construct.
  private DataprocMetricConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataprocMetricConfig() {
    metrics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataprocMetricConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DataprocMetricConfig(
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
                metrics_ = new java.util.ArrayList<com.google.cloud.dataproc.v1.Metric>();
                mutable_bitField0_ |= 0x00000001;
              }
              metrics_.add(
                  input.readMessage(
                      com.google.cloud.dataproc.v1.Metric.parser(), extensionRegistry));
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
        metrics_ = java.util.Collections.unmodifiableList(metrics_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_DataprocMetricConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_DataprocMetricConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.DataprocMetricConfig.class,
            com.google.cloud.dataproc.v1.DataprocMetricConfig.Builder.class);
  }

  public static final int METRICS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dataproc.v1.Metric> metrics_;
  /**
   *
   *
   * <pre>
   * Configuration set of metrics to collect from the cluster
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dataproc.v1.Metric> getMetricsList() {
    return metrics_;
  }
  /**
   *
   *
   * <pre>
   * Configuration set of metrics to collect from the cluster
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dataproc.v1.MetricOrBuilder>
      getMetricsOrBuilderList() {
    return metrics_;
  }
  /**
   *
   *
   * <pre>
   * Configuration set of metrics to collect from the cluster
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public int getMetricsCount() {
    return metrics_.size();
  }
  /**
   *
   *
   * <pre>
   * Configuration set of metrics to collect from the cluster
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.Metric getMetrics(int index) {
    return metrics_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Configuration set of metrics to collect from the cluster
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.MetricOrBuilder getMetricsOrBuilder(int index) {
    return metrics_.get(index);
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
    for (int i = 0; i < metrics_.size(); i++) {
      output.writeMessage(1, metrics_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < metrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, metrics_.get(i));
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.DataprocMetricConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.DataprocMetricConfig other =
        (com.google.cloud.dataproc.v1.DataprocMetricConfig) obj;

    if (!getMetricsList().equals(other.getMetricsList())) return false;
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
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.DataprocMetricConfig prototype) {
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
   * Specifies a Dataproc metric config
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.DataprocMetricConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.DataprocMetricConfig)
      com.google.cloud.dataproc.v1.DataprocMetricConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_DataprocMetricConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_DataprocMetricConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.DataprocMetricConfig.class,
              com.google.cloud.dataproc.v1.DataprocMetricConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.DataprocMetricConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMetricsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_DataprocMetricConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.DataprocMetricConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.DataprocMetricConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.DataprocMetricConfig build() {
      com.google.cloud.dataproc.v1.DataprocMetricConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.DataprocMetricConfig buildPartial() {
      com.google.cloud.dataproc.v1.DataprocMetricConfig result =
          new com.google.cloud.dataproc.v1.DataprocMetricConfig(this);
      int from_bitField0_ = bitField0_;
      if (metricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          metrics_ = java.util.Collections.unmodifiableList(metrics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.metrics_ = metrics_;
      } else {
        result.metrics_ = metricsBuilder_.build();
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
      if (other instanceof com.google.cloud.dataproc.v1.DataprocMetricConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.DataprocMetricConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.DataprocMetricConfig other) {
      if (other == com.google.cloud.dataproc.v1.DataprocMetricConfig.getDefaultInstance())
        return this;
      if (metricsBuilder_ == null) {
        if (!other.metrics_.isEmpty()) {
          if (metrics_.isEmpty()) {
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMetricsIsMutable();
            metrics_.addAll(other.metrics_);
          }
          onChanged();
        }
      } else {
        if (!other.metrics_.isEmpty()) {
          if (metricsBuilder_.isEmpty()) {
            metricsBuilder_.dispose();
            metricsBuilder_ = null;
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            metricsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMetricsFieldBuilder()
                    : null;
          } else {
            metricsBuilder_.addAllMessages(other.metrics_);
          }
        }
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
      com.google.cloud.dataproc.v1.DataprocMetricConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dataproc.v1.DataprocMetricConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.dataproc.v1.Metric> metrics_ =
        java.util.Collections.emptyList();

    private void ensureMetricsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        metrics_ = new java.util.ArrayList<com.google.cloud.dataproc.v1.Metric>(metrics_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataproc.v1.Metric,
            com.google.cloud.dataproc.v1.Metric.Builder,
            com.google.cloud.dataproc.v1.MetricOrBuilder>
        metricsBuilder_;

    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.dataproc.v1.Metric> getMetricsList() {
      if (metricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metrics_);
      } else {
        return metricsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getMetricsCount() {
      if (metricsBuilder_ == null) {
        return metrics_.size();
      } else {
        return metricsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataproc.v1.Metric getMetrics(int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetrics(int index, com.google.cloud.dataproc.v1.Metric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.set(index, value);
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetrics(
        int index, com.google.cloud.dataproc.v1.Metric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addMetrics(com.google.cloud.dataproc.v1.Metric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addMetrics(int index, com.google.cloud.dataproc.v1.Metric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(index, value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addMetrics(com.google.cloud.dataproc.v1.Metric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addMetrics(
        int index, com.google.cloud.dataproc.v1.Metric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllMetrics(
        java.lang.Iterable<? extends com.google.cloud.dataproc.v1.Metric> values) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, metrics_);
        onChanged();
      } else {
        metricsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMetrics() {
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeMetrics(int index) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.remove(index);
        onChanged();
      } else {
        metricsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataproc.v1.Metric.Builder getMetricsBuilder(int index) {
      return getMetricsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataproc.v1.MetricOrBuilder getMetricsOrBuilder(int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.dataproc.v1.MetricOrBuilder>
        getMetricsOrBuilderList() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metrics_);
      }
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataproc.v1.Metric.Builder addMetricsBuilder() {
      return getMetricsFieldBuilder()
          .addBuilder(com.google.cloud.dataproc.v1.Metric.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataproc.v1.Metric.Builder addMetricsBuilder(int index) {
      return getMetricsFieldBuilder()
          .addBuilder(index, com.google.cloud.dataproc.v1.Metric.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Configuration set of metrics to collect from the cluster
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Metric metrics = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.dataproc.v1.Metric.Builder> getMetricsBuilderList() {
      return getMetricsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataproc.v1.Metric,
            com.google.cloud.dataproc.v1.Metric.Builder,
            com.google.cloud.dataproc.v1.MetricOrBuilder>
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dataproc.v1.Metric,
                com.google.cloud.dataproc.v1.Metric.Builder,
                com.google.cloud.dataproc.v1.MetricOrBuilder>(
                metrics_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.DataprocMetricConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.DataprocMetricConfig)
  private static final com.google.cloud.dataproc.v1.DataprocMetricConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.DataprocMetricConfig();
  }

  public static com.google.cloud.dataproc.v1.DataprocMetricConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataprocMetricConfig> PARSER =
      new com.google.protobuf.AbstractParser<DataprocMetricConfig>() {
        @java.lang.Override
        public DataprocMetricConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DataprocMetricConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DataprocMetricConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataprocMetricConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.DataprocMetricConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
