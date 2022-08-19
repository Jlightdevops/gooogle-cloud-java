// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha2/membership.proto

package com.google.cloud.gkehub.v1alpha2;

public interface KubernetesResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1alpha2.KubernetesResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Input only. The YAML representation of the Membership CR. This field is ignored for GKE
   * clusters where Hub can read the CR directly.
   * Callers should provide the CR that is currently present in the cluster
   * during Create or Update, or leave this field empty if none exists. The CR
   * manifest is used to validate the cluster has not been registered with
   * another Membership.
   * </pre>
   *
   * <code>string membership_cr_manifest = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The membershipCrManifest.
   */
  java.lang.String getMembershipCrManifest();
  /**
   * <pre>
   * Input only. The YAML representation of the Membership CR. This field is ignored for GKE
   * clusters where Hub can read the CR directly.
   * Callers should provide the CR that is currently present in the cluster
   * during Create or Update, or leave this field empty if none exists. The CR
   * manifest is used to validate the cluster has not been registered with
   * another Membership.
   * </pre>
   *
   * <code>string membership_cr_manifest = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The bytes for membershipCrManifest.
   */
  com.google.protobuf.ByteString
      getMembershipCrManifestBytes();

  /**
   * <pre>
   * Output only. Additional Kubernetes resources that need to be applied to the cluster
   * after Membership creation, and after every update.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1alpha2.ResourceManifest membership_resources = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.gkehub.v1alpha2.ResourceManifest> 
      getMembershipResourcesList();
  /**
   * <pre>
   * Output only. Additional Kubernetes resources that need to be applied to the cluster
   * after Membership creation, and after every update.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1alpha2.ResourceManifest membership_resources = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.gkehub.v1alpha2.ResourceManifest getMembershipResources(int index);
  /**
   * <pre>
   * Output only. Additional Kubernetes resources that need to be applied to the cluster
   * after Membership creation, and after every update.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1alpha2.ResourceManifest membership_resources = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getMembershipResourcesCount();
  /**
   * <pre>
   * Output only. Additional Kubernetes resources that need to be applied to the cluster
   * after Membership creation, and after every update.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1alpha2.ResourceManifest membership_resources = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.gkehub.v1alpha2.ResourceManifestOrBuilder> 
      getMembershipResourcesOrBuilderList();
  /**
   * <pre>
   * Output only. Additional Kubernetes resources that need to be applied to the cluster
   * after Membership creation, and after every update.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1alpha2.ResourceManifest membership_resources = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.gkehub.v1alpha2.ResourceManifestOrBuilder getMembershipResourcesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. The Kubernetes resources for installing the GKE Connect agent.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1alpha2.ResourceManifest connect_resources = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.gkehub.v1alpha2.ResourceManifest> 
      getConnectResourcesList();
  /**
   * <pre>
   * Output only. The Kubernetes resources for installing the GKE Connect agent.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1alpha2.ResourceManifest connect_resources = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.gkehub.v1alpha2.ResourceManifest getConnectResources(int index);
  /**
   * <pre>
   * Output only. The Kubernetes resources for installing the GKE Connect agent.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1alpha2.ResourceManifest connect_resources = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getConnectResourcesCount();
  /**
   * <pre>
   * Output only. The Kubernetes resources for installing the GKE Connect agent.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1alpha2.ResourceManifest connect_resources = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.gkehub.v1alpha2.ResourceManifestOrBuilder> 
      getConnectResourcesOrBuilderList();
  /**
   * <pre>
   * Output only. The Kubernetes resources for installing the GKE Connect agent.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1alpha2.ResourceManifest connect_resources = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.gkehub.v1alpha2.ResourceManifestOrBuilder getConnectResourcesOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Options for Kubernetes resource generation.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha2.ResourceOptions resource_options = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the resourceOptions field is set.
   */
  boolean hasResourceOptions();
  /**
   * <pre>
   * Optional. Options for Kubernetes resource generation.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha2.ResourceOptions resource_options = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The resourceOptions.
   */
  com.google.cloud.gkehub.v1alpha2.ResourceOptions getResourceOptions();
  /**
   * <pre>
   * Optional. Options for Kubernetes resource generation.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha2.ResourceOptions resource_options = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkehub.v1alpha2.ResourceOptionsOrBuilder getResourceOptionsOrBuilder();
}
