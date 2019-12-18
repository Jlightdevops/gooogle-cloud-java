/*
 * Copyright 2019 Google LLC
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
// source: google/iam/credentials/v1/common.proto

package com.google.cloud.iam.credentials.v1;

public interface GenerateAccessTokenRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.credentials.v1.GenerateAccessTokenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the service account for which the credentials
   * are requested, in the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the service account for which the credentials
   * are requested, in the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * </pre>
   *
   * <code>repeated string delegates = 2;</code>
   *
   * @return A list containing the delegates.
   */
  java.util.List<java.lang.String> getDelegatesList();
  /**
   *
   *
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * </pre>
   *
   * <code>repeated string delegates = 2;</code>
   *
   * @return The count of delegates.
   */
  int getDelegatesCount();
  /**
   *
   *
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * </pre>
   *
   * <code>repeated string delegates = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The delegates at the given index.
   */
  java.lang.String getDelegates(int index);
  /**
   *
   *
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * </pre>
   *
   * <code>repeated string delegates = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the delegates at the given index.
   */
  com.google.protobuf.ByteString getDelegatesBytes(int index);

  /**
   *
   *
   * <pre>
   * Code to identify the scopes to be included in the OAuth 2.0 access token.
   * See https://developers.google.com/identity/protocols/googlescopes for more
   * information.
   * At least one value required.
   * </pre>
   *
   * <code>repeated string scope = 4;</code>
   *
   * @return A list containing the scope.
   */
  java.util.List<java.lang.String> getScopeList();
  /**
   *
   *
   * <pre>
   * Code to identify the scopes to be included in the OAuth 2.0 access token.
   * See https://developers.google.com/identity/protocols/googlescopes for more
   * information.
   * At least one value required.
   * </pre>
   *
   * <code>repeated string scope = 4;</code>
   *
   * @return The count of scope.
   */
  int getScopeCount();
  /**
   *
   *
   * <pre>
   * Code to identify the scopes to be included in the OAuth 2.0 access token.
   * See https://developers.google.com/identity/protocols/googlescopes for more
   * information.
   * At least one value required.
   * </pre>
   *
   * <code>repeated string scope = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The scope at the given index.
   */
  java.lang.String getScope(int index);
  /**
   *
   *
   * <pre>
   * Code to identify the scopes to be included in the OAuth 2.0 access token.
   * See https://developers.google.com/identity/protocols/googlescopes for more
   * information.
   * At least one value required.
   * </pre>
   *
   * <code>repeated string scope = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the scope at the given index.
   */
  com.google.protobuf.ByteString getScopeBytes(int index);

  /**
   *
   *
   * <pre>
   * The desired lifetime duration of the access token in seconds.
   * Must be set to a value less than or equal to 3600 (1 hour). If a value is
   * not specified, the token's lifetime will be set to a default value of one
   * hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration lifetime = 7;</code>
   *
   * @return Whether the lifetime field is set.
   */
  boolean hasLifetime();
  /**
   *
   *
   * <pre>
   * The desired lifetime duration of the access token in seconds.
   * Must be set to a value less than or equal to 3600 (1 hour). If a value is
   * not specified, the token's lifetime will be set to a default value of one
   * hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration lifetime = 7;</code>
   *
   * @return The lifetime.
   */
  com.google.protobuf.Duration getLifetime();
  /**
   *
   *
   * <pre>
   * The desired lifetime duration of the access token in seconds.
   * Must be set to a value less than or equal to 3600 (1 hour). If a value is
   * not specified, the token's lifetime will be set to a default value of one
   * hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration lifetime = 7;</code>
   */
  com.google.protobuf.DurationOrBuilder getLifetimeOrBuilder();
}
