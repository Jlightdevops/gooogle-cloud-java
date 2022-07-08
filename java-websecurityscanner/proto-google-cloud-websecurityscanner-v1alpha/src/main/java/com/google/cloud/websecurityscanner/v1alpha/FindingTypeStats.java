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
// source: google/cloud/websecurityscanner/v1alpha/finding_type_stats.proto

package com.google.cloud.websecurityscanner.v1alpha;

/**
 *
 *
 * <pre>
 * A FindingTypeStats resource represents stats regarding a specific FindingType
 * of Findings under a given ScanRun.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.FindingTypeStats}
 */
public final class FindingTypeStats extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1alpha.FindingTypeStats)
    FindingTypeStatsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FindingTypeStats.newBuilder() to construct.
  private FindingTypeStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FindingTypeStats() {
    findingType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FindingTypeStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private FindingTypeStats(
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
          case 8:
            {
              int rawValue = input.readEnum();

              findingType_ = rawValue;
              break;
            }
          case 16:
            {
              findingCount_ = input.readInt32();
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
    return com.google.cloud.websecurityscanner.v1alpha.FindingTypeStatsProto
        .internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1alpha.FindingTypeStatsProto
        .internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats.class,
            com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats.Builder.class);
  }

  public static final int FINDING_TYPE_FIELD_NUMBER = 1;
  private int findingType_;
  /**
   *
   *
   * <pre>
   * The finding type associated with the stats.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 1;</code>
   *
   * @return The enum numeric value on the wire for findingType.
   */
  @java.lang.Override
  public int getFindingTypeValue() {
    return findingType_;
  }
  /**
   *
   *
   * <pre>
   * The finding type associated with the stats.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 1;</code>
   *
   * @return The findingType.
   */
  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType getFindingType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType result =
        com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType.valueOf(findingType_);
    return result == null
        ? com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType.UNRECOGNIZED
        : result;
  }

  public static final int FINDING_COUNT_FIELD_NUMBER = 2;
  private int findingCount_;
  /**
   *
   *
   * <pre>
   * The count of findings belonging to this finding type.
   * </pre>
   *
   * <code>int32 finding_count = 2;</code>
   *
   * @return The findingCount.
   */
  @java.lang.Override
  public int getFindingCount() {
    return findingCount_;
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
    if (findingType_
        != com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType.FINDING_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, findingType_);
    }
    if (findingCount_ != 0) {
      output.writeInt32(2, findingCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (findingType_
        != com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType.FINDING_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, findingType_);
    }
    if (findingCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, findingCount_);
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats other =
        (com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats) obj;

    if (findingType_ != other.findingType_) return false;
    if (getFindingCount() != other.getFindingCount()) return false;
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
    hash = (37 * hash) + FINDING_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + findingType_;
    hash = (37 * hash) + FINDING_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getFindingCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parseFrom(
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
      com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats prototype) {
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
   * A FindingTypeStats resource represents stats regarding a specific FindingType
   * of Findings under a given ScanRun.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.FindingTypeStats}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1alpha.FindingTypeStats)
      com.google.cloud.websecurityscanner.v1alpha.FindingTypeStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1alpha.FindingTypeStatsProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1alpha.FindingTypeStatsProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats.class,
              com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats.Builder.class);
    }

    // Construct using com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats.newBuilder()
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
      findingType_ = 0;

      findingCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1alpha.FindingTypeStatsProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats
        getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats build() {
      com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats buildPartial() {
      com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats result =
          new com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats(this);
      result.findingType_ = findingType_;
      result.findingCount_ = findingCount_;
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
      if (other instanceof com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats) {
        return mergeFrom((com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats other) {
      if (other
          == com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats.getDefaultInstance())
        return this;
      if (other.findingType_ != 0) {
        setFindingTypeValue(other.getFindingTypeValue());
      }
      if (other.getFindingCount() != 0) {
        setFindingCount(other.getFindingCount());
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
      com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int findingType_ = 0;
    /**
     *
     *
     * <pre>
     * The finding type associated with the stats.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 1;</code>
     *
     * @return The enum numeric value on the wire for findingType.
     */
    @java.lang.Override
    public int getFindingTypeValue() {
      return findingType_;
    }
    /**
     *
     *
     * <pre>
     * The finding type associated with the stats.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for findingType to set.
     * @return This builder for chaining.
     */
    public Builder setFindingTypeValue(int value) {

      findingType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The finding type associated with the stats.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 1;</code>
     *
     * @return The findingType.
     */
    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType getFindingType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType result =
          com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType.valueOf(findingType_);
      return result == null
          ? com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The finding type associated with the stats.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 1;</code>
     *
     * @param value The findingType to set.
     * @return This builder for chaining.
     */
    public Builder setFindingType(
        com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      findingType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The finding type associated with the stats.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFindingType() {

      findingType_ = 0;
      onChanged();
      return this;
    }

    private int findingCount_;
    /**
     *
     *
     * <pre>
     * The count of findings belonging to this finding type.
     * </pre>
     *
     * <code>int32 finding_count = 2;</code>
     *
     * @return The findingCount.
     */
    @java.lang.Override
    public int getFindingCount() {
      return findingCount_;
    }
    /**
     *
     *
     * <pre>
     * The count of findings belonging to this finding type.
     * </pre>
     *
     * <code>int32 finding_count = 2;</code>
     *
     * @param value The findingCount to set.
     * @return This builder for chaining.
     */
    public Builder setFindingCount(int value) {

      findingCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The count of findings belonging to this finding type.
     * </pre>
     *
     * <code>int32 finding_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFindingCount() {

      findingCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1alpha.FindingTypeStats)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1alpha.FindingTypeStats)
  private static final com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats();
  }

  public static com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindingTypeStats> PARSER =
      new com.google.protobuf.AbstractParser<FindingTypeStats>() {
        @java.lang.Override
        public FindingTypeStats parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FindingTypeStats(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FindingTypeStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindingTypeStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.FindingTypeStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
