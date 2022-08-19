// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/task.proto

package com.google.cloud.tasks.v2beta2;

public interface AttemptStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.AttemptStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The time that this attempt was scheduled.
   * `schedule_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 1;</code>
   * @return Whether the scheduleTime field is set.
   */
  boolean hasScheduleTime();
  /**
   * <pre>
   * Output only. The time that this attempt was scheduled.
   * `schedule_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 1;</code>
   * @return The scheduleTime.
   */
  com.google.protobuf.Timestamp getScheduleTime();
  /**
   * <pre>
   * Output only. The time that this attempt was scheduled.
   * `schedule_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time that this attempt was dispatched.
   * `dispatch_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dispatch_time = 2;</code>
   * @return Whether the dispatchTime field is set.
   */
  boolean hasDispatchTime();
  /**
   * <pre>
   * Output only. The time that this attempt was dispatched.
   * `dispatch_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dispatch_time = 2;</code>
   * @return The dispatchTime.
   */
  com.google.protobuf.Timestamp getDispatchTime();
  /**
   * <pre>
   * Output only. The time that this attempt was dispatched.
   * `dispatch_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dispatch_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDispatchTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time that this attempt response was received.
   * `response_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp response_time = 3;</code>
   * @return Whether the responseTime field is set.
   */
  boolean hasResponseTime();
  /**
   * <pre>
   * Output only. The time that this attempt response was received.
   * `response_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp response_time = 3;</code>
   * @return The responseTime.
   */
  com.google.protobuf.Timestamp getResponseTime();
  /**
   * <pre>
   * Output only. The time that this attempt response was received.
   * `response_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp response_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getResponseTimeOrBuilder();

  /**
   * <pre>
   * Output only. The response from the target for this attempt.
   * If the task has not been attempted or the task is currently running
   * then the response status is unset.
   * </pre>
   *
   * <code>.google.rpc.Status response_status = 4;</code>
   * @return Whether the responseStatus field is set.
   */
  boolean hasResponseStatus();
  /**
   * <pre>
   * Output only. The response from the target for this attempt.
   * If the task has not been attempted or the task is currently running
   * then the response status is unset.
   * </pre>
   *
   * <code>.google.rpc.Status response_status = 4;</code>
   * @return The responseStatus.
   */
  com.google.rpc.Status getResponseStatus();
  /**
   * <pre>
   * Output only. The response from the target for this attempt.
   * If the task has not been attempted or the task is currently running
   * then the response status is unset.
   * </pre>
   *
   * <code>.google.rpc.Status response_status = 4;</code>
   */
  com.google.rpc.StatusOrBuilder getResponseStatusOrBuilder();
}
