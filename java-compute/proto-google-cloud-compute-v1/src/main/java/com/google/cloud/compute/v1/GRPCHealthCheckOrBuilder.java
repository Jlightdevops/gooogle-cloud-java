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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GRPCHealthCheckOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GRPCHealthCheck)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The gRPC service name for the health check. This field is optional. The value of grpc_service_name has the following meanings by convention: - Empty service_name means the overall status of all services at the backend. - Non-empty service_name means the health of that gRPC service, as defined by the owner of the service. The grpc_service_name can only be ASCII.
   * </pre>
   *
   * <code>optional string grpc_service_name = 136533078;</code>
   *
   * @return Whether the grpcServiceName field is set.
   */
  boolean hasGrpcServiceName();
  /**
   *
   *
   * <pre>
   * The gRPC service name for the health check. This field is optional. The value of grpc_service_name has the following meanings by convention: - Empty service_name means the overall status of all services at the backend. - Non-empty service_name means the health of that gRPC service, as defined by the owner of the service. The grpc_service_name can only be ASCII.
   * </pre>
   *
   * <code>optional string grpc_service_name = 136533078;</code>
   *
   * @return The grpcServiceName.
   */
  java.lang.String getGrpcServiceName();
  /**
   *
   *
   * <pre>
   * The gRPC service name for the health check. This field is optional. The value of grpc_service_name has the following meanings by convention: - Empty service_name means the overall status of all services at the backend. - Non-empty service_name means the health of that gRPC service, as defined by the owner of the service. The grpc_service_name can only be ASCII.
   * </pre>
   *
   * <code>optional string grpc_service_name = 136533078;</code>
   *
   * @return The bytes for grpcServiceName.
   */
  com.google.protobuf.ByteString getGrpcServiceNameBytes();

  /**
   *
   *
   * <pre>
   * The port number for the health check request. Must be specified if port_name and port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
   * </pre>
   *
   * <code>optional int32 port = 3446913;</code>
   *
   * @return Whether the port field is set.
   */
  boolean hasPort();
  /**
   *
   *
   * <pre>
   * The port number for the health check request. Must be specified if port_name and port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
   * </pre>
   *
   * <code>optional int32 port = 3446913;</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. The port_name should conform to RFC1035.
   * </pre>
   *
   * <code>optional string port_name = 41534345;</code>
   *
   * @return Whether the portName field is set.
   */
  boolean hasPortName();
  /**
   *
   *
   * <pre>
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. The port_name should conform to RFC1035.
   * </pre>
   *
   * <code>optional string port_name = 41534345;</code>
   *
   * @return The portName.
   */
  java.lang.String getPortName();
  /**
   *
   *
   * <pre>
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. The port_name should conform to RFC1035.
   * </pre>
   *
   * <code>optional string port_name = 41534345;</code>
   *
   * @return The bytes for portName.
   */
  com.google.protobuf.ByteString getPortNameBytes();

  /**
   *
   *
   * <pre>
   * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, gRPC health check follows behavior specified in port and portName fields.
   * Check the PortSpecification enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_specification = 51590597;</code>
   *
   * @return Whether the portSpecification field is set.
   */
  boolean hasPortSpecification();
  /**
   *
   *
   * <pre>
   * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, gRPC health check follows behavior specified in port and portName fields.
   * Check the PortSpecification enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_specification = 51590597;</code>
   *
   * @return The portSpecification.
   */
  java.lang.String getPortSpecification();
  /**
   *
   *
   * <pre>
   * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, gRPC health check follows behavior specified in port and portName fields.
   * Check the PortSpecification enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_specification = 51590597;</code>
   *
   * @return The bytes for portSpecification.
   */
  com.google.protobuf.ByteString getPortSpecificationBytes();
}
