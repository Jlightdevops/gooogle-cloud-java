// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1beta;

public interface MembershipStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1beta.MembershipState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user-defined name for the cluster used by ClusterSelectors to group
   * clusters together. This should match Membership's membership_name,
   * unless the user installed ACM on the cluster manually prior to enabling
   * the ACM hub feature.
   * Unique within a Anthos Config Management installation.
   * </pre>
   *
   * <code>string cluster_name = 1;</code>
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   * <pre>
   * The user-defined name for the cluster used by ClusterSelectors to group
   * clusters together. This should match Membership's membership_name,
   * unless the user installed ACM on the cluster manually prior to enabling
   * the ACM hub feature.
   * Unique within a Anthos Config Management installation.
   * </pre>
   *
   * <code>string cluster_name = 1;</code>
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <pre>
   * Membership configuration in the cluster. This represents the actual state
   * in the cluster, while the MembershipSpec in the FeatureSpec represents
   * the intended state
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.MembershipSpec membership_spec = 2;</code>
   * @return Whether the membershipSpec field is set.
   */
  boolean hasMembershipSpec();
  /**
   * <pre>
   * Membership configuration in the cluster. This represents the actual state
   * in the cluster, while the MembershipSpec in the FeatureSpec represents
   * the intended state
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.MembershipSpec membership_spec = 2;</code>
   * @return The membershipSpec.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.MembershipSpec getMembershipSpec();
  /**
   * <pre>
   * Membership configuration in the cluster. This represents the actual state
   * in the cluster, while the MembershipSpec in the FeatureSpec represents
   * the intended state
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.MembershipSpec membership_spec = 2;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.MembershipSpecOrBuilder getMembershipSpecOrBuilder();

  /**
   * <pre>
   * Current install status of ACM's Operator
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.OperatorState operator_state = 3;</code>
   * @return Whether the operatorState field is set.
   */
  boolean hasOperatorState();
  /**
   * <pre>
   * Current install status of ACM's Operator
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.OperatorState operator_state = 3;</code>
   * @return The operatorState.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.OperatorState getOperatorState();
  /**
   * <pre>
   * Current install status of ACM's Operator
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.OperatorState operator_state = 3;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.OperatorStateOrBuilder getOperatorStateOrBuilder();

  /**
   * <pre>
   * Current sync status
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncState config_sync_state = 4;</code>
   * @return Whether the configSyncState field is set.
   */
  boolean hasConfigSyncState();
  /**
   * <pre>
   * Current sync status
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncState config_sync_state = 4;</code>
   * @return The configSyncState.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncState getConfigSyncState();
  /**
   * <pre>
   * Current sync status
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncState config_sync_state = 4;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncStateOrBuilder getConfigSyncStateOrBuilder();

  /**
   * <pre>
   * PolicyController status
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.PolicyControllerState policy_controller_state = 5;</code>
   * @return Whether the policyControllerState field is set.
   */
  boolean hasPolicyControllerState();
  /**
   * <pre>
   * PolicyController status
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.PolicyControllerState policy_controller_state = 5;</code>
   * @return The policyControllerState.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.PolicyControllerState getPolicyControllerState();
  /**
   * <pre>
   * PolicyController status
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.PolicyControllerState policy_controller_state = 5;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.PolicyControllerStateOrBuilder getPolicyControllerStateOrBuilder();

  /**
   * <pre>
   * Binauthz status
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzState binauthz_state = 6;</code>
   * @return Whether the binauthzState field is set.
   */
  boolean hasBinauthzState();
  /**
   * <pre>
   * Binauthz status
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzState binauthz_state = 6;</code>
   * @return The binauthzState.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState getBinauthzState();
  /**
   * <pre>
   * Binauthz status
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzState binauthz_state = 6;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.BinauthzStateOrBuilder getBinauthzStateOrBuilder();

  /**
   * <pre>
   * Hierarchy Controller status
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerState hierarchy_controller_state = 7;</code>
   * @return Whether the hierarchyControllerState field is set.
   */
  boolean hasHierarchyControllerState();
  /**
   * <pre>
   * Hierarchy Controller status
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerState hierarchy_controller_state = 7;</code>
   * @return The hierarchyControllerState.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerState getHierarchyControllerState();
  /**
   * <pre>
   * Hierarchy Controller status
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerState hierarchy_controller_state = 7;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerStateOrBuilder getHierarchyControllerStateOrBuilder();
}
