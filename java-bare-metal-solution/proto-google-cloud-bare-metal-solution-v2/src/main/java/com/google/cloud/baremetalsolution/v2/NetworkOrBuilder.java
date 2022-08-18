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
// source: google/cloud/baremetalsolution/v2/network.proto

package com.google.cloud.baremetalsolution.v2;

public interface NetworkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.Network)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of this `Network`.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * Format:
   * `projects/{project}/locations/{location}/networks/{network}`
   * </pre>
   *
   * <code>string name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of this `Network`.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * Format:
   * `projects/{project}/locations/{location}/networks/{network}`
   * </pre>
   *
   * <code>string name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * An identifier for the `Network`, generated by the backend.
   * </pre>
   *
   * <code>string id = 10;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * An identifier for the `Network`, generated by the backend.
   * </pre>
   *
   * <code>string id = 10;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The type of this network.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Network.Type type = 2;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of this network.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Network.Type type = 2;</code>
   *
   * @return The type.
   */
  com.google.cloud.baremetalsolution.v2.Network.Type getType();

  /**
   *
   *
   * <pre>
   * IP address configured.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * IP address configured.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * List of physical interfaces.
   * </pre>
   *
   * <code>repeated string mac_address = 4;</code>
   *
   * @return A list containing the macAddress.
   */
  java.util.List<java.lang.String> getMacAddressList();
  /**
   *
   *
   * <pre>
   * List of physical interfaces.
   * </pre>
   *
   * <code>repeated string mac_address = 4;</code>
   *
   * @return The count of macAddress.
   */
  int getMacAddressCount();
  /**
   *
   *
   * <pre>
   * List of physical interfaces.
   * </pre>
   *
   * <code>repeated string mac_address = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The macAddress at the given index.
   */
  java.lang.String getMacAddress(int index);
  /**
   *
   *
   * <pre>
   * List of physical interfaces.
   * </pre>
   *
   * <code>repeated string mac_address = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the macAddress at the given index.
   */
  com.google.protobuf.ByteString getMacAddressBytes(int index);

  /**
   *
   *
   * <pre>
   * The Network state.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Network.State state = 6;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The Network state.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Network.State state = 6;</code>
   *
   * @return The state.
   */
  com.google.cloud.baremetalsolution.v2.Network.State getState();

  /**
   *
   *
   * <pre>
   * The vlan id of the Network.
   * </pre>
   *
   * <code>string vlan_id = 7;</code>
   *
   * @return The vlanId.
   */
  java.lang.String getVlanId();
  /**
   *
   *
   * <pre>
   * The vlan id of the Network.
   * </pre>
   *
   * <code>string vlan_id = 7;</code>
   *
   * @return The bytes for vlanId.
   */
  com.google.protobuf.ByteString getVlanIdBytes();

  /**
   *
   *
   * <pre>
   * The cidr of the Network.
   * </pre>
   *
   * <code>string cidr = 8;</code>
   *
   * @return The cidr.
   */
  java.lang.String getCidr();
  /**
   *
   *
   * <pre>
   * The cidr of the Network.
   * </pre>
   *
   * <code>string cidr = 8;</code>
   *
   * @return The bytes for cidr.
   */
  com.google.protobuf.ByteString getCidrBytes();

  /**
   *
   *
   * <pre>
   * The vrf for the Network.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.VRF vrf = 9;</code>
   *
   * @return Whether the vrf field is set.
   */
  boolean hasVrf();
  /**
   *
   *
   * <pre>
   * The vrf for the Network.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.VRF vrf = 9;</code>
   *
   * @return The vrf.
   */
  com.google.cloud.baremetalsolution.v2.VRF getVrf();
  /**
   *
   *
   * <pre>
   * The vrf for the Network.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.VRF vrf = 9;</code>
   */
  com.google.cloud.baremetalsolution.v2.VRFOrBuilder getVrfOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * IP range for reserved for services (e.g. NFS).
   * </pre>
   *
   * <code>string services_cidr = 12;</code>
   *
   * @return The servicesCidr.
   */
  java.lang.String getServicesCidr();
  /**
   *
   *
   * <pre>
   * IP range for reserved for services (e.g. NFS).
   * </pre>
   *
   * <code>string services_cidr = 12;</code>
   *
   * @return The bytes for servicesCidr.
   */
  com.google.protobuf.ByteString getServicesCidrBytes();

  /**
   *
   *
   * <pre>
   * List of IP address reservations in this network.
   * When updating this field, an error will be generated if a reservation
   * conflicts with an IP address already allocated to a physical server.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkAddressReservation reservations = 13;
   * </code>
   */
  java.util.List<com.google.cloud.baremetalsolution.v2.NetworkAddressReservation>
      getReservationsList();
  /**
   *
   *
   * <pre>
   * List of IP address reservations in this network.
   * When updating this field, an error will be generated if a reservation
   * conflicts with an IP address already allocated to a physical server.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkAddressReservation reservations = 13;
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.NetworkAddressReservation getReservations(int index);
  /**
   *
   *
   * <pre>
   * List of IP address reservations in this network.
   * When updating this field, an error will be generated if a reservation
   * conflicts with an IP address already allocated to a physical server.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkAddressReservation reservations = 13;
   * </code>
   */
  int getReservationsCount();
  /**
   *
   *
   * <pre>
   * List of IP address reservations in this network.
   * When updating this field, an error will be generated if a reservation
   * conflicts with an IP address already allocated to a physical server.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkAddressReservation reservations = 13;
   * </code>
   */
  java.util.List<? extends com.google.cloud.baremetalsolution.v2.NetworkAddressReservationOrBuilder>
      getReservationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of IP address reservations in this network.
   * When updating this field, an error will be generated if a reservation
   * conflicts with an IP address already allocated to a physical server.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkAddressReservation reservations = 13;
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.NetworkAddressReservationOrBuilder getReservationsOrBuilder(
      int index);
}
