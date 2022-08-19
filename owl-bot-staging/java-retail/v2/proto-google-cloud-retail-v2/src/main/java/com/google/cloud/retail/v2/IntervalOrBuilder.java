// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/common.proto

package com.google.cloud.retail.v2;

public interface IntervalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.Interval)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Inclusive lower bound.
   * </pre>
   *
   * <code>double minimum = 1;</code>
   * @return Whether the minimum field is set.
   */
  boolean hasMinimum();
  /**
   * <pre>
   * Inclusive lower bound.
   * </pre>
   *
   * <code>double minimum = 1;</code>
   * @return The minimum.
   */
  double getMinimum();

  /**
   * <pre>
   * Exclusive lower bound.
   * </pre>
   *
   * <code>double exclusive_minimum = 2;</code>
   * @return Whether the exclusiveMinimum field is set.
   */
  boolean hasExclusiveMinimum();
  /**
   * <pre>
   * Exclusive lower bound.
   * </pre>
   *
   * <code>double exclusive_minimum = 2;</code>
   * @return The exclusiveMinimum.
   */
  double getExclusiveMinimum();

  /**
   * <pre>
   * Inclusive upper bound.
   * </pre>
   *
   * <code>double maximum = 3;</code>
   * @return Whether the maximum field is set.
   */
  boolean hasMaximum();
  /**
   * <pre>
   * Inclusive upper bound.
   * </pre>
   *
   * <code>double maximum = 3;</code>
   * @return The maximum.
   */
  double getMaximum();

  /**
   * <pre>
   * Exclusive upper bound.
   * </pre>
   *
   * <code>double exclusive_maximum = 4;</code>
   * @return Whether the exclusiveMaximum field is set.
   */
  boolean hasExclusiveMaximum();
  /**
   * <pre>
   * Exclusive upper bound.
   * </pre>
   *
   * <code>double exclusive_maximum = 4;</code>
   * @return The exclusiveMaximum.
   */
  double getExclusiveMaximum();

  public com.google.cloud.retail.v2.Interval.MinCase getMinCase();

  public com.google.cloud.retail.v2.Interval.MaxCase getMaxCase();
}
