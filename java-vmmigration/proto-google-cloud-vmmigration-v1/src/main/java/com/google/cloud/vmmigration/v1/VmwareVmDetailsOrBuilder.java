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
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

public interface VmwareVmDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.VmwareVmDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The VM's id in the source (note that this is not the MigratingVm's id).
   * This is the moref id of the VM.
   * </pre>
   *
   * <code>string vm_id = 1;</code>
   *
   * @return The vmId.
   */
  java.lang.String getVmId();
  /**
   *
   *
   * <pre>
   * The VM's id in the source (note that this is not the MigratingVm's id).
   * This is the moref id of the VM.
   * </pre>
   *
   * <code>string vm_id = 1;</code>
   *
   * @return The bytes for vmId.
   */
  com.google.protobuf.ByteString getVmIdBytes();

  /**
   *
   *
   * <pre>
   * The id of the vCenter's datacenter this VM is contained in.
   * </pre>
   *
   * <code>string datacenter_id = 2;</code>
   *
   * @return The datacenterId.
   */
  java.lang.String getDatacenterId();
  /**
   *
   *
   * <pre>
   * The id of the vCenter's datacenter this VM is contained in.
   * </pre>
   *
   * <code>string datacenter_id = 2;</code>
   *
   * @return The bytes for datacenterId.
   */
  com.google.protobuf.ByteString getDatacenterIdBytes();

  /**
   *
   *
   * <pre>
   * The descriptive name of the vCenter's datacenter this VM is contained in.
   * </pre>
   *
   * <code>string datacenter_description = 3;</code>
   *
   * @return The datacenterDescription.
   */
  java.lang.String getDatacenterDescription();
  /**
   *
   *
   * <pre>
   * The descriptive name of the vCenter's datacenter this VM is contained in.
   * </pre>
   *
   * <code>string datacenter_description = 3;</code>
   *
   * @return The bytes for datacenterDescription.
   */
  com.google.protobuf.ByteString getDatacenterDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The unique identifier of the VM in vCenter.
   * </pre>
   *
   * <code>string uuid = 4;</code>
   *
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   *
   *
   * <pre>
   * The unique identifier of the VM in vCenter.
   * </pre>
   *
   * <code>string uuid = 4;</code>
   *
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString getUuidBytes();

  /**
   *
   *
   * <pre>
   * The display name of the VM. Note that this is not necessarily unique.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the VM. Note that this is not necessarily unique.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The power state of the VM at the moment list was taken.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmwareVmDetails.PowerState power_state = 6;</code>
   *
   * @return The enum numeric value on the wire for powerState.
   */
  int getPowerStateValue();
  /**
   *
   *
   * <pre>
   * The power state of the VM at the moment list was taken.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmwareVmDetails.PowerState power_state = 6;</code>
   *
   * @return The powerState.
   */
  com.google.cloud.vmmigration.v1.VmwareVmDetails.PowerState getPowerState();

  /**
   *
   *
   * <pre>
   * The number of cpus in the VM.
   * </pre>
   *
   * <code>int32 cpu_count = 7;</code>
   *
   * @return The cpuCount.
   */
  int getCpuCount();

  /**
   *
   *
   * <pre>
   * The size of the memory of the VM in MB.
   * </pre>
   *
   * <code>int32 memory_mb = 8;</code>
   *
   * @return The memoryMb.
   */
  int getMemoryMb();

  /**
   *
   *
   * <pre>
   * The number of disks the VM has.
   * </pre>
   *
   * <code>int32 disk_count = 9;</code>
   *
   * @return The diskCount.
   */
  int getDiskCount();

  /**
   *
   *
   * <pre>
   * The total size of the storage allocated to the VM in MB.
   * </pre>
   *
   * <code>int64 committed_storage_mb = 12;</code>
   *
   * @return The committedStorageMb.
   */
  long getCommittedStorageMb();

  /**
   *
   *
   * <pre>
   * The VM's OS. See for example
   * https://vdc-repo.vmware.com/vmwb-repository/dcr-public/da47f910-60ac-438b-8b9b-6122f4d14524/16b7274a-bf8b-4b4c-a05e-746f2aa93c8c/doc/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html
   * for types of strings this might hold.
   * </pre>
   *
   * <code>string guest_description = 11;</code>
   *
   * @return The guestDescription.
   */
  java.lang.String getGuestDescription();
  /**
   *
   *
   * <pre>
   * The VM's OS. See for example
   * https://vdc-repo.vmware.com/vmwb-repository/dcr-public/da47f910-60ac-438b-8b9b-6122f4d14524/16b7274a-bf8b-4b4c-a05e-746f2aa93c8c/doc/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html
   * for types of strings this might hold.
   * </pre>
   *
   * <code>string guest_description = 11;</code>
   *
   * @return The bytes for guestDescription.
   */
  com.google.protobuf.ByteString getGuestDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The VM Boot Option.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.VmwareVmDetails.BootOption boot_option = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for bootOption.
   */
  int getBootOptionValue();
  /**
   *
   *
   * <pre>
   * Output only. The VM Boot Option.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.VmwareVmDetails.BootOption boot_option = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bootOption.
   */
  com.google.cloud.vmmigration.v1.VmwareVmDetails.BootOption getBootOption();
}
