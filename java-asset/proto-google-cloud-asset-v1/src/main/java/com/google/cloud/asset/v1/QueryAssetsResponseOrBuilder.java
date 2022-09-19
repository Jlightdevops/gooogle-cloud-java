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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface QueryAssetsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.QueryAssetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Reference to a query job.
   * </pre>
   *
   * <code>string job_reference = 1;</code>
   *
   * @return The jobReference.
   */
  java.lang.String getJobReference();
  /**
   *
   *
   * <pre>
   * Reference to a query job.
   * </pre>
   *
   * <code>string job_reference = 1;</code>
   *
   * @return The bytes for jobReference.
   */
  com.google.protobuf.ByteString getJobReferenceBytes();

  /**
   *
   *
   * <pre>
   * The query response, which can be either an `error` or a valid `response`.
   * If `done` == `false` and the query result is being saved in a output, the
   * output_config field will be set.
   * If `done` == `true`, exactly one of
   * `error`, `query_result` or `output_config` will be set.
   * </pre>
   *
   * <code>bool done = 2;</code>
   *
   * @return The done.
   */
  boolean getDone();

  /**
   *
   *
   * <pre>
   * Error status.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Error status.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Error status.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Result of the query.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.QueryResult query_result = 4;</code>
   *
   * @return Whether the queryResult field is set.
   */
  boolean hasQueryResult();
  /**
   *
   *
   * <pre>
   * Result of the query.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.QueryResult query_result = 4;</code>
   *
   * @return The queryResult.
   */
  com.google.cloud.asset.v1.QueryResult getQueryResult();
  /**
   *
   *
   * <pre>
   * Result of the query.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.QueryResult query_result = 4;</code>
   */
  com.google.cloud.asset.v1.QueryResultOrBuilder getQueryResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Output configuration which indicates instead of being returned in API
   * response on the fly, the query result will be saved in a specific output.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.QueryAssetsOutputConfig output_config = 5;</code>
   *
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   *
   *
   * <pre>
   * Output configuration which indicates instead of being returned in API
   * response on the fly, the query result will be saved in a specific output.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.QueryAssetsOutputConfig output_config = 5;</code>
   *
   * @return The outputConfig.
   */
  com.google.cloud.asset.v1.QueryAssetsOutputConfig getOutputConfig();
  /**
   *
   *
   * <pre>
   * Output configuration which indicates instead of being returned in API
   * response on the fly, the query result will be saved in a specific output.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.QueryAssetsOutputConfig output_config = 5;</code>
   */
  com.google.cloud.asset.v1.QueryAssetsOutputConfigOrBuilder getOutputConfigOrBuilder();

  public com.google.cloud.asset.v1.QueryAssetsResponse.ResponseCase getResponseCase();
}
