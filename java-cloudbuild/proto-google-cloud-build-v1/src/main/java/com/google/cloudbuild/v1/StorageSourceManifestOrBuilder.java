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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface StorageSourceManifestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.StorageSourceManifest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Google Cloud Storage bucket containing the source manifest (see [Bucket
   * Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * </pre>
   *
   * <code>string bucket = 1;</code>
   *
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage bucket containing the source manifest (see [Bucket
   * Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * </pre>
   *
   * <code>string bucket = 1;</code>
   *
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString getBucketBytes();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage object containing the source manifest.
   * This object must be a JSON file.
   * </pre>
   *
   * <code>string object = 2;</code>
   *
   * @return The object.
   */
  java.lang.String getObject();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage object containing the source manifest.
   * This object must be a JSON file.
   * </pre>
   *
   * <code>string object = 2;</code>
   *
   * @return The bytes for object.
   */
  com.google.protobuf.ByteString getObjectBytes();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage generation for the object. If the generation is
   * omitted, the latest generation will be used.
   * </pre>
   *
   * <code>int64 generation = 3;</code>
   *
   * @return The generation.
   */
  long getGeneration();
}
