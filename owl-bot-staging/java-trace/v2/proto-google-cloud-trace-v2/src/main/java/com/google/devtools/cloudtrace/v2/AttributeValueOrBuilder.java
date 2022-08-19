// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v2/trace.proto

package com.google.devtools.cloudtrace.v2;

public interface AttributeValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v2.AttributeValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A string up to 256 bytes long.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   * <pre>
   * A string up to 256 bytes long.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
   * @return The stringValue.
   */
  com.google.devtools.cloudtrace.v2.TruncatableString getStringValue();
  /**
   * <pre>
   * A string up to 256 bytes long.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
   */
  com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getStringValueOrBuilder();

  /**
   * <pre>
   * A 64-bit signed integer.
   * </pre>
   *
   * <code>int64 int_value = 2;</code>
   * @return Whether the intValue field is set.
   */
  boolean hasIntValue();
  /**
   * <pre>
   * A 64-bit signed integer.
   * </pre>
   *
   * <code>int64 int_value = 2;</code>
   * @return The intValue.
   */
  long getIntValue();

  /**
   * <pre>
   * A Boolean value represented by `true` or `false`.
   * </pre>
   *
   * <code>bool bool_value = 3;</code>
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();
  /**
   * <pre>
   * A Boolean value represented by `true` or `false`.
   * </pre>
   *
   * <code>bool bool_value = 3;</code>
   * @return The boolValue.
   */
  boolean getBoolValue();

  public com.google.devtools.cloudtrace.v2.AttributeValue.ValueCase getValueCase();
}
