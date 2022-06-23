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
// source: google/cloud/talent/v4beta1/event.proto

package com.google.cloud.talent.v4beta1;

public interface ProfileEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ProfileEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Type of event.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Type of event.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.talent.v4beta1.ProfileEvent.ProfileEventType getType();

  /**
   *
   *
   * <pre>
   * Required. The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated with this client event.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}",
   * for example, "projects/foo/tenants/bar/profiles/baz".
   * </pre>
   *
   * <code>repeated string profiles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the profiles.
   */
  java.util.List<java.lang.String> getProfilesList();
  /**
   *
   *
   * <pre>
   * Required. The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated with this client event.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}",
   * for example, "projects/foo/tenants/bar/profiles/baz".
   * </pre>
   *
   * <code>repeated string profiles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of profiles.
   */
  int getProfilesCount();
  /**
   *
   *
   * <pre>
   * Required. The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated with this client event.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}",
   * for example, "projects/foo/tenants/bar/profiles/baz".
   * </pre>
   *
   * <code>repeated string profiles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The profiles at the given index.
   */
  java.lang.String getProfiles(int index);
  /**
   *
   *
   * <pre>
   * Required. The [profile name(s)][google.cloud.talent.v4beta1.Profile.name] associated with this client event.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}",
   * for example, "projects/foo/tenants/bar/profiles/baz".
   * </pre>
   *
   * <code>repeated string profiles = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the profiles at the given index.
   */
  com.google.protobuf.ByteString getProfilesBytes(int index);

  /**
   *
   *
   * <pre>
   * The [job name(s)][google.cloud.talent.v4beta1.Job.name] associated with this client event. Leave it
   * empty if the event isn't associated with a job.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}", for
   * example, "projects/foo/tenants/bar/jobs/baz".
   * </pre>
   *
   * <code>repeated string jobs = 6;</code>
   *
   * @return A list containing the jobs.
   */
  java.util.List<java.lang.String> getJobsList();
  /**
   *
   *
   * <pre>
   * The [job name(s)][google.cloud.talent.v4beta1.Job.name] associated with this client event. Leave it
   * empty if the event isn't associated with a job.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}", for
   * example, "projects/foo/tenants/bar/jobs/baz".
   * </pre>
   *
   * <code>repeated string jobs = 6;</code>
   *
   * @return The count of jobs.
   */
  int getJobsCount();
  /**
   *
   *
   * <pre>
   * The [job name(s)][google.cloud.talent.v4beta1.Job.name] associated with this client event. Leave it
   * empty if the event isn't associated with a job.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}", for
   * example, "projects/foo/tenants/bar/jobs/baz".
   * </pre>
   *
   * <code>repeated string jobs = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The jobs at the given index.
   */
  java.lang.String getJobs(int index);
  /**
   *
   *
   * <pre>
   * The [job name(s)][google.cloud.talent.v4beta1.Job.name] associated with this client event. Leave it
   * empty if the event isn't associated with a job.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}", for
   * example, "projects/foo/tenants/bar/jobs/baz".
   * </pre>
   *
   * <code>repeated string jobs = 6;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the jobs at the given index.
   */
  com.google.protobuf.ByteString getJobsBytes(int index);
}