// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/firewall.proto

package com.google.appengine.v1.firewall;

/**
 * <pre>
 * A single firewall rule that is evaluated against incoming traffic
 * and provides an action to take on matched requests.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.FirewallRule}
 */
public final class FirewallRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.FirewallRule)
    FirewallRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FirewallRule.newBuilder() to construct.
  private FirewallRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FirewallRule() {
    action_ = 0;
    sourceRange_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FirewallRule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FirewallRule(
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

            priority_ = input.readInt32();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            action_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            sourceRange_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
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
    return com.google.appengine.v1.firewall.FirewallProto.internal_static_google_appengine_v1_FirewallRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.firewall.FirewallProto.internal_static_google_appengine_v1_FirewallRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.firewall.FirewallRule.class, com.google.appengine.v1.firewall.FirewallRule.Builder.class);
  }

  /**
   * <pre>
   * Available actions to take on matching requests.
   * </pre>
   *
   * Protobuf enum {@code google.appengine.v1.FirewallRule.Action}
   */
  public enum Action
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSPECIFIED_ACTION = 0;</code>
     */
    UNSPECIFIED_ACTION(0),
    /**
     * <pre>
     * Matching requests are allowed.
     * </pre>
     *
     * <code>ALLOW = 1;</code>
     */
    ALLOW(1),
    /**
     * <pre>
     * Matching requests are denied.
     * </pre>
     *
     * <code>DENY = 2;</code>
     */
    DENY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSPECIFIED_ACTION = 0;</code>
     */
    public static final int UNSPECIFIED_ACTION_VALUE = 0;
    /**
     * <pre>
     * Matching requests are allowed.
     * </pre>
     *
     * <code>ALLOW = 1;</code>
     */
    public static final int ALLOW_VALUE = 1;
    /**
     * <pre>
     * Matching requests are denied.
     * </pre>
     *
     * <code>DENY = 2;</code>
     */
    public static final int DENY_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Action valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Action forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED_ACTION;
        case 1: return ALLOW;
        case 2: return DENY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Action>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Action> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Action>() {
            public Action findValueByNumber(int number) {
              return Action.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.appengine.v1.firewall.FirewallRule.getDescriptor().getEnumTypes().get(0);
    }

    private static final Action[] VALUES = values();

    public static Action valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Action(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.appengine.v1.FirewallRule.Action)
  }

  public static final int PRIORITY_FIELD_NUMBER = 1;
  private int priority_;
  /**
   * <pre>
   * A positive integer between [1, Int32.MaxValue-1] that defines the order of
   * rule evaluation. Rules with the lowest priority are evaluated first.
   * A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic
   * when no previous rule matches. Only the action of this rule can be modified
   * by the user.
   * </pre>
   *
   * <code>int32 priority = 1;</code>
   * @return The priority.
   */
  @java.lang.Override
  public int getPriority() {
    return priority_;
  }

  public static final int ACTION_FIELD_NUMBER = 2;
  private int action_;
  /**
   * <pre>
   * The action to take on matched requests.
   * </pre>
   *
   * <code>.google.appengine.v1.FirewallRule.Action action = 2;</code>
   * @return The enum numeric value on the wire for action.
   */
  @java.lang.Override public int getActionValue() {
    return action_;
  }
  /**
   * <pre>
   * The action to take on matched requests.
   * </pre>
   *
   * <code>.google.appengine.v1.FirewallRule.Action action = 2;</code>
   * @return The action.
   */
  @java.lang.Override public com.google.appengine.v1.firewall.FirewallRule.Action getAction() {
    @SuppressWarnings("deprecation")
    com.google.appengine.v1.firewall.FirewallRule.Action result = com.google.appengine.v1.firewall.FirewallRule.Action.valueOf(action_);
    return result == null ? com.google.appengine.v1.firewall.FirewallRule.Action.UNRECOGNIZED : result;
  }

  public static final int SOURCE_RANGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object sourceRange_;
  /**
   * <pre>
   * IP address or range, defined using CIDR notation, of requests that this
   * rule applies to. You can use the wildcard character "*" to match all IPs
   * equivalent to "0/0" and "::/0" together.
   * Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32`
   *           or `2001:0db8:0000:0042:0000:8a2e:0370:7334`.
   * &lt;p&gt;Truncation will be silently performed on addresses which are not
   * properly truncated. For example, `1.2.3.4/24` is accepted as the same
   * address as `1.2.3.0/24`. Similarly, for IPv6, `2001:db8::1/32` is accepted
   * as the same address as `2001:db8::/32`.
   * </pre>
   *
   * <code>string source_range = 3;</code>
   * @return The sourceRange.
   */
  @java.lang.Override
  public java.lang.String getSourceRange() {
    java.lang.Object ref = sourceRange_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceRange_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * IP address or range, defined using CIDR notation, of requests that this
   * rule applies to. You can use the wildcard character "*" to match all IPs
   * equivalent to "0/0" and "::/0" together.
   * Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32`
   *           or `2001:0db8:0000:0042:0000:8a2e:0370:7334`.
   * &lt;p&gt;Truncation will be silently performed on addresses which are not
   * properly truncated. For example, `1.2.3.4/24` is accepted as the same
   * address as `1.2.3.0/24`. Similarly, for IPv6, `2001:db8::1/32` is accepted
   * as the same address as `2001:db8::/32`.
   * </pre>
   *
   * <code>string source_range = 3;</code>
   * @return The bytes for sourceRange.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceRangeBytes() {
    java.lang.Object ref = sourceRange_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceRange_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * An optional string description of this rule.
   * This field has a maximum length of 100 characters.
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An optional string description of this rule.
   * This field has a maximum length of 100 characters.
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
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
    if (priority_ != 0) {
      output.writeInt32(1, priority_);
    }
    if (action_ != com.google.appengine.v1.firewall.FirewallRule.Action.UNSPECIFIED_ACTION.getNumber()) {
      output.writeEnum(2, action_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceRange_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sourceRange_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, description_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (priority_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, priority_);
    }
    if (action_ != com.google.appengine.v1.firewall.FirewallRule.Action.UNSPECIFIED_ACTION.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, action_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceRange_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sourceRange_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, description_);
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
    if (!(obj instanceof com.google.appengine.v1.firewall.FirewallRule)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.firewall.FirewallRule other = (com.google.appengine.v1.firewall.FirewallRule) obj;

    if (getPriority()
        != other.getPriority()) return false;
    if (action_ != other.action_) return false;
    if (!getSourceRange()
        .equals(other.getSourceRange())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
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
    hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + getPriority();
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + action_;
    hash = (37 * hash) + SOURCE_RANGE_FIELD_NUMBER;
    hash = (53 * hash) + getSourceRange().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.firewall.FirewallRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.firewall.FirewallRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.firewall.FirewallRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.firewall.FirewallRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.firewall.FirewallRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.firewall.FirewallRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.firewall.FirewallRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.firewall.FirewallRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.firewall.FirewallRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.firewall.FirewallRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.firewall.FirewallRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.firewall.FirewallRule parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.firewall.FirewallRule prototype) {
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
   * A single firewall rule that is evaluated against incoming traffic
   * and provides an action to take on matched requests.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.FirewallRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.FirewallRule)
      com.google.appengine.v1.firewall.FirewallRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.firewall.FirewallProto.internal_static_google_appengine_v1_FirewallRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.firewall.FirewallProto.internal_static_google_appengine_v1_FirewallRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.firewall.FirewallRule.class, com.google.appengine.v1.firewall.FirewallRule.Builder.class);
    }

    // Construct using com.google.appengine.v1.firewall.FirewallRule.newBuilder()
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
      priority_ = 0;

      action_ = 0;

      sourceRange_ = "";

      description_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.firewall.FirewallProto.internal_static_google_appengine_v1_FirewallRule_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.firewall.FirewallRule getDefaultInstanceForType() {
      return com.google.appengine.v1.firewall.FirewallRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.firewall.FirewallRule build() {
      com.google.appengine.v1.firewall.FirewallRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.firewall.FirewallRule buildPartial() {
      com.google.appengine.v1.firewall.FirewallRule result = new com.google.appengine.v1.firewall.FirewallRule(this);
      result.priority_ = priority_;
      result.action_ = action_;
      result.sourceRange_ = sourceRange_;
      result.description_ = description_;
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
      if (other instanceof com.google.appengine.v1.firewall.FirewallRule) {
        return mergeFrom((com.google.appengine.v1.firewall.FirewallRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.firewall.FirewallRule other) {
      if (other == com.google.appengine.v1.firewall.FirewallRule.getDefaultInstance()) return this;
      if (other.getPriority() != 0) {
        setPriority(other.getPriority());
      }
      if (other.action_ != 0) {
        setActionValue(other.getActionValue());
      }
      if (!other.getSourceRange().isEmpty()) {
        sourceRange_ = other.sourceRange_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
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
      com.google.appengine.v1.firewall.FirewallRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.firewall.FirewallRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int priority_ ;
    /**
     * <pre>
     * A positive integer between [1, Int32.MaxValue-1] that defines the order of
     * rule evaluation. Rules with the lowest priority are evaluated first.
     * A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic
     * when no previous rule matches. Only the action of this rule can be modified
     * by the user.
     * </pre>
     *
     * <code>int32 priority = 1;</code>
     * @return The priority.
     */
    @java.lang.Override
    public int getPriority() {
      return priority_;
    }
    /**
     * <pre>
     * A positive integer between [1, Int32.MaxValue-1] that defines the order of
     * rule evaluation. Rules with the lowest priority are evaluated first.
     * A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic
     * when no previous rule matches. Only the action of this rule can be modified
     * by the user.
     * </pre>
     *
     * <code>int32 priority = 1;</code>
     * @param value The priority to set.
     * @return This builder for chaining.
     */
    public Builder setPriority(int value) {
      
      priority_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A positive integer between [1, Int32.MaxValue-1] that defines the order of
     * rule evaluation. Rules with the lowest priority are evaluated first.
     * A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic
     * when no previous rule matches. Only the action of this rule can be modified
     * by the user.
     * </pre>
     *
     * <code>int32 priority = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPriority() {
      
      priority_ = 0;
      onChanged();
      return this;
    }

    private int action_ = 0;
    /**
     * <pre>
     * The action to take on matched requests.
     * </pre>
     *
     * <code>.google.appengine.v1.FirewallRule.Action action = 2;</code>
     * @return The enum numeric value on the wire for action.
     */
    @java.lang.Override public int getActionValue() {
      return action_;
    }
    /**
     * <pre>
     * The action to take on matched requests.
     * </pre>
     *
     * <code>.google.appengine.v1.FirewallRule.Action action = 2;</code>
     * @param value The enum numeric value on the wire for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionValue(int value) {
      
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The action to take on matched requests.
     * </pre>
     *
     * <code>.google.appengine.v1.FirewallRule.Action action = 2;</code>
     * @return The action.
     */
    @java.lang.Override
    public com.google.appengine.v1.firewall.FirewallRule.Action getAction() {
      @SuppressWarnings("deprecation")
      com.google.appengine.v1.firewall.FirewallRule.Action result = com.google.appengine.v1.firewall.FirewallRule.Action.valueOf(action_);
      return result == null ? com.google.appengine.v1.firewall.FirewallRule.Action.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The action to take on matched requests.
     * </pre>
     *
     * <code>.google.appengine.v1.FirewallRule.Action action = 2;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(com.google.appengine.v1.firewall.FirewallRule.Action value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The action to take on matched requests.
     * </pre>
     *
     * <code>.google.appengine.v1.FirewallRule.Action action = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      
      action_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object sourceRange_ = "";
    /**
     * <pre>
     * IP address or range, defined using CIDR notation, of requests that this
     * rule applies to. You can use the wildcard character "*" to match all IPs
     * equivalent to "0/0" and "::/0" together.
     * Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32`
     *           or `2001:0db8:0000:0042:0000:8a2e:0370:7334`.
     * &lt;p&gt;Truncation will be silently performed on addresses which are not
     * properly truncated. For example, `1.2.3.4/24` is accepted as the same
     * address as `1.2.3.0/24`. Similarly, for IPv6, `2001:db8::1/32` is accepted
     * as the same address as `2001:db8::/32`.
     * </pre>
     *
     * <code>string source_range = 3;</code>
     * @return The sourceRange.
     */
    public java.lang.String getSourceRange() {
      java.lang.Object ref = sourceRange_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceRange_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * IP address or range, defined using CIDR notation, of requests that this
     * rule applies to. You can use the wildcard character "*" to match all IPs
     * equivalent to "0/0" and "::/0" together.
     * Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32`
     *           or `2001:0db8:0000:0042:0000:8a2e:0370:7334`.
     * &lt;p&gt;Truncation will be silently performed on addresses which are not
     * properly truncated. For example, `1.2.3.4/24` is accepted as the same
     * address as `1.2.3.0/24`. Similarly, for IPv6, `2001:db8::1/32` is accepted
     * as the same address as `2001:db8::/32`.
     * </pre>
     *
     * <code>string source_range = 3;</code>
     * @return The bytes for sourceRange.
     */
    public com.google.protobuf.ByteString
        getSourceRangeBytes() {
      java.lang.Object ref = sourceRange_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceRange_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * IP address or range, defined using CIDR notation, of requests that this
     * rule applies to. You can use the wildcard character "*" to match all IPs
     * equivalent to "0/0" and "::/0" together.
     * Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32`
     *           or `2001:0db8:0000:0042:0000:8a2e:0370:7334`.
     * &lt;p&gt;Truncation will be silently performed on addresses which are not
     * properly truncated. For example, `1.2.3.4/24` is accepted as the same
     * address as `1.2.3.0/24`. Similarly, for IPv6, `2001:db8::1/32` is accepted
     * as the same address as `2001:db8::/32`.
     * </pre>
     *
     * <code>string source_range = 3;</code>
     * @param value The sourceRange to set.
     * @return This builder for chaining.
     */
    public Builder setSourceRange(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sourceRange_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IP address or range, defined using CIDR notation, of requests that this
     * rule applies to. You can use the wildcard character "*" to match all IPs
     * equivalent to "0/0" and "::/0" together.
     * Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32`
     *           or `2001:0db8:0000:0042:0000:8a2e:0370:7334`.
     * &lt;p&gt;Truncation will be silently performed on addresses which are not
     * properly truncated. For example, `1.2.3.4/24` is accepted as the same
     * address as `1.2.3.0/24`. Similarly, for IPv6, `2001:db8::1/32` is accepted
     * as the same address as `2001:db8::/32`.
     * </pre>
     *
     * <code>string source_range = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceRange() {
      
      sourceRange_ = getDefaultInstance().getSourceRange();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IP address or range, defined using CIDR notation, of requests that this
     * rule applies to. You can use the wildcard character "*" to match all IPs
     * equivalent to "0/0" and "::/0" together.
     * Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32`
     *           or `2001:0db8:0000:0042:0000:8a2e:0370:7334`.
     * &lt;p&gt;Truncation will be silently performed on addresses which are not
     * properly truncated. For example, `1.2.3.4/24` is accepted as the same
     * address as `1.2.3.0/24`. Similarly, for IPv6, `2001:db8::1/32` is accepted
     * as the same address as `2001:db8::/32`.
     * </pre>
     *
     * <code>string source_range = 3;</code>
     * @param value The bytes for sourceRange to set.
     * @return This builder for chaining.
     */
    public Builder setSourceRangeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sourceRange_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * An optional string description of this rule.
     * This field has a maximum length of 100 characters.
     * </pre>
     *
     * <code>string description = 4;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An optional string description of this rule.
     * This field has a maximum length of 100 characters.
     * </pre>
     *
     * <code>string description = 4;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An optional string description of this rule.
     * This field has a maximum length of 100 characters.
     * </pre>
     *
     * <code>string description = 4;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional string description of this rule.
     * This field has a maximum length of 100 characters.
     * </pre>
     *
     * <code>string description = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional string description of this rule.
     * This field has a maximum length of 100 characters.
     * </pre>
     *
     * <code>string description = 4;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.FirewallRule)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.FirewallRule)
  private static final com.google.appengine.v1.firewall.FirewallRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.firewall.FirewallRule();
  }

  public static com.google.appengine.v1.firewall.FirewallRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FirewallRule>
      PARSER = new com.google.protobuf.AbstractParser<FirewallRule>() {
    @java.lang.Override
    public FirewallRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FirewallRule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FirewallRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FirewallRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.firewall.FirewallRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

