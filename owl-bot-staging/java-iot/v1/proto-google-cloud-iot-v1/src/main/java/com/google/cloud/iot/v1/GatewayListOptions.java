// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

/**
 * <pre>
 * Options for limiting the list based on gateway type and associations.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.GatewayListOptions}
 */
public final class GatewayListOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.GatewayListOptions)
    GatewayListOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GatewayListOptions.newBuilder() to construct.
  private GatewayListOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GatewayListOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GatewayListOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GatewayListOptions(
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
          case 8: {
            int rawValue = input.readEnum();
            filterCase_ = 1;
            filter_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            filterCase_ = 2;
            filter_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            filterCase_ = 3;
            filter_ = s;
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
    return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_GatewayListOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_GatewayListOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.GatewayListOptions.class, com.google.cloud.iot.v1.GatewayListOptions.Builder.class);
  }

  private int filterCase_ = 0;
  private java.lang.Object filter_;
  public enum FilterCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GATEWAY_TYPE(1),
    ASSOCIATIONS_GATEWAY_ID(2),
    ASSOCIATIONS_DEVICE_ID(3),
    FILTER_NOT_SET(0);
    private final int value;
    private FilterCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FilterCase valueOf(int value) {
      return forNumber(value);
    }

    public static FilterCase forNumber(int value) {
      switch (value) {
        case 1: return GATEWAY_TYPE;
        case 2: return ASSOCIATIONS_GATEWAY_ID;
        case 3: return ASSOCIATIONS_DEVICE_ID;
        case 0: return FILTER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FilterCase
  getFilterCase() {
    return FilterCase.forNumber(
        filterCase_);
  }

  public static final int GATEWAY_TYPE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
   * is specified, only non-gateway devices are returned. If
   * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
   * @return Whether the gatewayType field is set.
   */
  public boolean hasGatewayType() {
    return filterCase_ == 1;
  }
  /**
   * <pre>
   * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
   * is specified, only non-gateway devices are returned. If
   * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
   * @return The enum numeric value on the wire for gatewayType.
   */
  public int getGatewayTypeValue() {
    if (filterCase_ == 1) {
      return (java.lang.Integer) filter_;
    }
    return 0;
  }
  /**
   * <pre>
   * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
   * is specified, only non-gateway devices are returned. If
   * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
   * @return The gatewayType.
   */
  public com.google.cloud.iot.v1.GatewayType getGatewayType() {
    if (filterCase_ == 1) {
      @SuppressWarnings("deprecation")
      com.google.cloud.iot.v1.GatewayType result = com.google.cloud.iot.v1.GatewayType.valueOf(
          (java.lang.Integer) filter_);
      return result == null ? com.google.cloud.iot.v1.GatewayType.UNRECOGNIZED : result;
    }
    return com.google.cloud.iot.v1.GatewayType.GATEWAY_TYPE_UNSPECIFIED;
  }

  public static final int ASSOCIATIONS_GATEWAY_ID_FIELD_NUMBER = 2;
  /**
   * <pre>
   * If set, only devices associated with the specified gateway are returned.
   * The gateway ID can be numeric (`num_id`) or the user-defined string
   * (`id`). For example, if `123` is specified, only devices bound to the
   * gateway with `num_id` 123 are returned.
   * </pre>
   *
   * <code>string associations_gateway_id = 2;</code>
   * @return Whether the associationsGatewayId field is set.
   */
  public boolean hasAssociationsGatewayId() {
    return filterCase_ == 2;
  }
  /**
   * <pre>
   * If set, only devices associated with the specified gateway are returned.
   * The gateway ID can be numeric (`num_id`) or the user-defined string
   * (`id`). For example, if `123` is specified, only devices bound to the
   * gateway with `num_id` 123 are returned.
   * </pre>
   *
   * <code>string associations_gateway_id = 2;</code>
   * @return The associationsGatewayId.
   */
  public java.lang.String getAssociationsGatewayId() {
    java.lang.Object ref = "";
    if (filterCase_ == 2) {
      ref = filter_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (filterCase_ == 2) {
        filter_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * If set, only devices associated with the specified gateway are returned.
   * The gateway ID can be numeric (`num_id`) or the user-defined string
   * (`id`). For example, if `123` is specified, only devices bound to the
   * gateway with `num_id` 123 are returned.
   * </pre>
   *
   * <code>string associations_gateway_id = 2;</code>
   * @return The bytes for associationsGatewayId.
   */
  public com.google.protobuf.ByteString
      getAssociationsGatewayIdBytes() {
    java.lang.Object ref = "";
    if (filterCase_ == 2) {
      ref = filter_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (filterCase_ == 2) {
        filter_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSOCIATIONS_DEVICE_ID_FIELD_NUMBER = 3;
  /**
   * <pre>
   * If set, returns only the gateways with which the specified device is
   * associated. The device ID can be numeric (`num_id`) or the user-defined
   * string (`id`). For example, if `456` is specified, returns only the
   * gateways to which the device with `num_id` 456 is bound.
   * </pre>
   *
   * <code>string associations_device_id = 3;</code>
   * @return Whether the associationsDeviceId field is set.
   */
  public boolean hasAssociationsDeviceId() {
    return filterCase_ == 3;
  }
  /**
   * <pre>
   * If set, returns only the gateways with which the specified device is
   * associated. The device ID can be numeric (`num_id`) or the user-defined
   * string (`id`). For example, if `456` is specified, returns only the
   * gateways to which the device with `num_id` 456 is bound.
   * </pre>
   *
   * <code>string associations_device_id = 3;</code>
   * @return The associationsDeviceId.
   */
  public java.lang.String getAssociationsDeviceId() {
    java.lang.Object ref = "";
    if (filterCase_ == 3) {
      ref = filter_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (filterCase_ == 3) {
        filter_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * If set, returns only the gateways with which the specified device is
   * associated. The device ID can be numeric (`num_id`) or the user-defined
   * string (`id`). For example, if `456` is specified, returns only the
   * gateways to which the device with `num_id` 456 is bound.
   * </pre>
   *
   * <code>string associations_device_id = 3;</code>
   * @return The bytes for associationsDeviceId.
   */
  public com.google.protobuf.ByteString
      getAssociationsDeviceIdBytes() {
    java.lang.Object ref = "";
    if (filterCase_ == 3) {
      ref = filter_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (filterCase_ == 3) {
        filter_ = b;
      }
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
    if (filterCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) filter_));
    }
    if (filterCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filter_);
    }
    if (filterCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, filter_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (filterCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) filter_));
    }
    if (filterCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filter_);
    }
    if (filterCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, filter_);
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
    if (!(obj instanceof com.google.cloud.iot.v1.GatewayListOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.GatewayListOptions other = (com.google.cloud.iot.v1.GatewayListOptions) obj;

    if (!getFilterCase().equals(other.getFilterCase())) return false;
    switch (filterCase_) {
      case 1:
        if (getGatewayTypeValue()
            != other.getGatewayTypeValue()) return false;
        break;
      case 2:
        if (!getAssociationsGatewayId()
            .equals(other.getAssociationsGatewayId())) return false;
        break;
      case 3:
        if (!getAssociationsDeviceId()
            .equals(other.getAssociationsDeviceId())) return false;
        break;
      case 0:
      default:
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
    switch (filterCase_) {
      case 1:
        hash = (37 * hash) + GATEWAY_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getGatewayTypeValue();
        break;
      case 2:
        hash = (37 * hash) + ASSOCIATIONS_GATEWAY_ID_FIELD_NUMBER;
        hash = (53 * hash) + getAssociationsGatewayId().hashCode();
        break;
      case 3:
        hash = (37 * hash) + ASSOCIATIONS_DEVICE_ID_FIELD_NUMBER;
        hash = (53 * hash) + getAssociationsDeviceId().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.GatewayListOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.GatewayListOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.GatewayListOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.GatewayListOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.GatewayListOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.GatewayListOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.GatewayListOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.GatewayListOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.GatewayListOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.GatewayListOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.GatewayListOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.GatewayListOptions parseFrom(
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
  public static Builder newBuilder(com.google.cloud.iot.v1.GatewayListOptions prototype) {
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
   * Options for limiting the list based on gateway type and associations.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.GatewayListOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.GatewayListOptions)
      com.google.cloud.iot.v1.GatewayListOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_GatewayListOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_GatewayListOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.GatewayListOptions.class, com.google.cloud.iot.v1.GatewayListOptions.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.GatewayListOptions.newBuilder()
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
      filterCase_ = 0;
      filter_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_GatewayListOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.GatewayListOptions getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.GatewayListOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.GatewayListOptions build() {
      com.google.cloud.iot.v1.GatewayListOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.GatewayListOptions buildPartial() {
      com.google.cloud.iot.v1.GatewayListOptions result = new com.google.cloud.iot.v1.GatewayListOptions(this);
      if (filterCase_ == 1) {
        result.filter_ = filter_;
      }
      if (filterCase_ == 2) {
        result.filter_ = filter_;
      }
      if (filterCase_ == 3) {
        result.filter_ = filter_;
      }
      result.filterCase_ = filterCase_;
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
      if (other instanceof com.google.cloud.iot.v1.GatewayListOptions) {
        return mergeFrom((com.google.cloud.iot.v1.GatewayListOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.GatewayListOptions other) {
      if (other == com.google.cloud.iot.v1.GatewayListOptions.getDefaultInstance()) return this;
      switch (other.getFilterCase()) {
        case GATEWAY_TYPE: {
          setGatewayTypeValue(other.getGatewayTypeValue());
          break;
        }
        case ASSOCIATIONS_GATEWAY_ID: {
          filterCase_ = 2;
          filter_ = other.filter_;
          onChanged();
          break;
        }
        case ASSOCIATIONS_DEVICE_ID: {
          filterCase_ = 3;
          filter_ = other.filter_;
          onChanged();
          break;
        }
        case FILTER_NOT_SET: {
          break;
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
      com.google.cloud.iot.v1.GatewayListOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.iot.v1.GatewayListOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int filterCase_ = 0;
    private java.lang.Object filter_;
    public FilterCase
        getFilterCase() {
      return FilterCase.forNumber(
          filterCase_);
    }

    public Builder clearFilter() {
      filterCase_ = 0;
      filter_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
     * is specified, only non-gateway devices are returned. If
     * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
     * @return Whether the gatewayType field is set.
     */
    @java.lang.Override
    public boolean hasGatewayType() {
      return filterCase_ == 1;
    }
    /**
     * <pre>
     * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
     * is specified, only non-gateway devices are returned. If
     * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
     * @return The enum numeric value on the wire for gatewayType.
     */
    @java.lang.Override
    public int getGatewayTypeValue() {
      if (filterCase_ == 1) {
        return ((java.lang.Integer) filter_).intValue();
      }
      return 0;
    }
    /**
     * <pre>
     * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
     * is specified, only non-gateway devices are returned. If
     * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
     * @param value The enum numeric value on the wire for gatewayType to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayTypeValue(int value) {
      filterCase_ = 1;
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
     * is specified, only non-gateway devices are returned. If
     * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
     * @return The gatewayType.
     */
    @java.lang.Override
    public com.google.cloud.iot.v1.GatewayType getGatewayType() {
      if (filterCase_ == 1) {
        @SuppressWarnings("deprecation")
        com.google.cloud.iot.v1.GatewayType result = com.google.cloud.iot.v1.GatewayType.valueOf(
            (java.lang.Integer) filter_);
        return result == null ? com.google.cloud.iot.v1.GatewayType.UNRECOGNIZED : result;
      }
      return com.google.cloud.iot.v1.GatewayType.GATEWAY_TYPE_UNSPECIFIED;
    }
    /**
     * <pre>
     * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
     * is specified, only non-gateway devices are returned. If
     * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
     * @param value The gatewayType to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayType(com.google.cloud.iot.v1.GatewayType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      filterCase_ = 1;
      filter_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
     * is specified, only non-gateway devices are returned. If
     * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGatewayType() {
      if (filterCase_ == 1) {
        filterCase_ = 0;
        filter_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * If set, only devices associated with the specified gateway are returned.
     * The gateway ID can be numeric (`num_id`) or the user-defined string
     * (`id`). For example, if `123` is specified, only devices bound to the
     * gateway with `num_id` 123 are returned.
     * </pre>
     *
     * <code>string associations_gateway_id = 2;</code>
     * @return Whether the associationsGatewayId field is set.
     */
    @java.lang.Override
    public boolean hasAssociationsGatewayId() {
      return filterCase_ == 2;
    }
    /**
     * <pre>
     * If set, only devices associated with the specified gateway are returned.
     * The gateway ID can be numeric (`num_id`) or the user-defined string
     * (`id`). For example, if `123` is specified, only devices bound to the
     * gateway with `num_id` 123 are returned.
     * </pre>
     *
     * <code>string associations_gateway_id = 2;</code>
     * @return The associationsGatewayId.
     */
    @java.lang.Override
    public java.lang.String getAssociationsGatewayId() {
      java.lang.Object ref = "";
      if (filterCase_ == 2) {
        ref = filter_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (filterCase_ == 2) {
          filter_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If set, only devices associated with the specified gateway are returned.
     * The gateway ID can be numeric (`num_id`) or the user-defined string
     * (`id`). For example, if `123` is specified, only devices bound to the
     * gateway with `num_id` 123 are returned.
     * </pre>
     *
     * <code>string associations_gateway_id = 2;</code>
     * @return The bytes for associationsGatewayId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAssociationsGatewayIdBytes() {
      java.lang.Object ref = "";
      if (filterCase_ == 2) {
        ref = filter_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (filterCase_ == 2) {
          filter_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If set, only devices associated with the specified gateway are returned.
     * The gateway ID can be numeric (`num_id`) or the user-defined string
     * (`id`). For example, if `123` is specified, only devices bound to the
     * gateway with `num_id` 123 are returned.
     * </pre>
     *
     * <code>string associations_gateway_id = 2;</code>
     * @param value The associationsGatewayId to set.
     * @return This builder for chaining.
     */
    public Builder setAssociationsGatewayId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  filterCase_ = 2;
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, only devices associated with the specified gateway are returned.
     * The gateway ID can be numeric (`num_id`) or the user-defined string
     * (`id`). For example, if `123` is specified, only devices bound to the
     * gateway with `num_id` 123 are returned.
     * </pre>
     *
     * <code>string associations_gateway_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAssociationsGatewayId() {
      if (filterCase_ == 2) {
        filterCase_ = 0;
        filter_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * If set, only devices associated with the specified gateway are returned.
     * The gateway ID can be numeric (`num_id`) or the user-defined string
     * (`id`). For example, if `123` is specified, only devices bound to the
     * gateway with `num_id` 123 are returned.
     * </pre>
     *
     * <code>string associations_gateway_id = 2;</code>
     * @param value The bytes for associationsGatewayId to set.
     * @return This builder for chaining.
     */
    public Builder setAssociationsGatewayIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      filterCase_ = 2;
      filter_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * If set, returns only the gateways with which the specified device is
     * associated. The device ID can be numeric (`num_id`) or the user-defined
     * string (`id`). For example, if `456` is specified, returns only the
     * gateways to which the device with `num_id` 456 is bound.
     * </pre>
     *
     * <code>string associations_device_id = 3;</code>
     * @return Whether the associationsDeviceId field is set.
     */
    @java.lang.Override
    public boolean hasAssociationsDeviceId() {
      return filterCase_ == 3;
    }
    /**
     * <pre>
     * If set, returns only the gateways with which the specified device is
     * associated. The device ID can be numeric (`num_id`) or the user-defined
     * string (`id`). For example, if `456` is specified, returns only the
     * gateways to which the device with `num_id` 456 is bound.
     * </pre>
     *
     * <code>string associations_device_id = 3;</code>
     * @return The associationsDeviceId.
     */
    @java.lang.Override
    public java.lang.String getAssociationsDeviceId() {
      java.lang.Object ref = "";
      if (filterCase_ == 3) {
        ref = filter_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (filterCase_ == 3) {
          filter_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If set, returns only the gateways with which the specified device is
     * associated. The device ID can be numeric (`num_id`) or the user-defined
     * string (`id`). For example, if `456` is specified, returns only the
     * gateways to which the device with `num_id` 456 is bound.
     * </pre>
     *
     * <code>string associations_device_id = 3;</code>
     * @return The bytes for associationsDeviceId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAssociationsDeviceIdBytes() {
      java.lang.Object ref = "";
      if (filterCase_ == 3) {
        ref = filter_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (filterCase_ == 3) {
          filter_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If set, returns only the gateways with which the specified device is
     * associated. The device ID can be numeric (`num_id`) or the user-defined
     * string (`id`). For example, if `456` is specified, returns only the
     * gateways to which the device with `num_id` 456 is bound.
     * </pre>
     *
     * <code>string associations_device_id = 3;</code>
     * @param value The associationsDeviceId to set.
     * @return This builder for chaining.
     */
    public Builder setAssociationsDeviceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  filterCase_ = 3;
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, returns only the gateways with which the specified device is
     * associated. The device ID can be numeric (`num_id`) or the user-defined
     * string (`id`). For example, if `456` is specified, returns only the
     * gateways to which the device with `num_id` 456 is bound.
     * </pre>
     *
     * <code>string associations_device_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAssociationsDeviceId() {
      if (filterCase_ == 3) {
        filterCase_ = 0;
        filter_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * If set, returns only the gateways with which the specified device is
     * associated. The device ID can be numeric (`num_id`) or the user-defined
     * string (`id`). For example, if `456` is specified, returns only the
     * gateways to which the device with `num_id` 456 is bound.
     * </pre>
     *
     * <code>string associations_device_id = 3;</code>
     * @param value The bytes for associationsDeviceId to set.
     * @return This builder for chaining.
     */
    public Builder setAssociationsDeviceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      filterCase_ = 3;
      filter_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.GatewayListOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.GatewayListOptions)
  private static final com.google.cloud.iot.v1.GatewayListOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.GatewayListOptions();
  }

  public static com.google.cloud.iot.v1.GatewayListOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GatewayListOptions>
      PARSER = new com.google.protobuf.AbstractParser<GatewayListOptions>() {
    @java.lang.Override
    public GatewayListOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GatewayListOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GatewayListOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GatewayListOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.GatewayListOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

