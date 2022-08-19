// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1beta;

public interface ConfigSyncOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1beta.ConfigSync)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Git repo configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.GitConfig git = 7;</code>
   * @return Whether the git field is set.
   */
  boolean hasGit();
  /**
   * <pre>
   * Git repo configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.GitConfig git = 7;</code>
   * @return The git.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.GitConfig getGit();
  /**
   * <pre>
   * Git repo configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.GitConfig git = 7;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.GitConfigOrBuilder getGitOrBuilder();

  /**
   * <pre>
   * Specifies whether the Config Sync Repo is
   * in “hierarchical” or “unstructured” mode.
   * </pre>
   *
   * <code>string source_format = 8;</code>
   * @return The sourceFormat.
   */
  java.lang.String getSourceFormat();
  /**
   * <pre>
   * Specifies whether the Config Sync Repo is
   * in “hierarchical” or “unstructured” mode.
   * </pre>
   *
   * <code>string source_format = 8;</code>
   * @return The bytes for sourceFormat.
   */
  com.google.protobuf.ByteString
      getSourceFormatBytes();
}
