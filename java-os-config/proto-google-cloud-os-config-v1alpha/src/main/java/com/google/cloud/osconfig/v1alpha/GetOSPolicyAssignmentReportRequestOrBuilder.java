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
// source: google/cloud/osconfig/v1alpha/os_policy_assignment_reports.proto

package com.google.cloud.osconfig.v1alpha;

public interface GetOSPolicyAssignmentReportRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. API resource name for OS policy assignment report.
   * Format:
   * `/projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/report`
   * For `{project}`, either `project-number` or `project-id` can be provided.
   * For `{instance_id}`, either Compute Engine `instance-id` or `instance-name`
   * can be provided.
   * For `{assignment_id}`, the OSPolicyAssignment id must be provided.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. API resource name for OS policy assignment report.
   * Format:
   * `/projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/report`
   * For `{project}`, either `project-number` or `project-id` can be provided.
   * For `{instance_id}`, either Compute Engine `instance-id` or `instance-name`
   * can be provided.
   * For `{assignment_id}`, the OSPolicyAssignment id must be provided.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}