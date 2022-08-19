// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface ContactsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.Contacts)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of contact people for the entry.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Contacts.Person people = 1;</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.Contacts.Person> 
      getPeopleList();
  /**
   * <pre>
   * The list of contact people for the entry.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Contacts.Person people = 1;</code>
   */
  com.google.cloud.datacatalog.v1.Contacts.Person getPeople(int index);
  /**
   * <pre>
   * The list of contact people for the entry.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Contacts.Person people = 1;</code>
   */
  int getPeopleCount();
  /**
   * <pre>
   * The list of contact people for the entry.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Contacts.Person people = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.Contacts.PersonOrBuilder> 
      getPeopleOrBuilderList();
  /**
   * <pre>
   * The list of contact people for the entry.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Contacts.Person people = 1;</code>
   */
  com.google.cloud.datacatalog.v1.Contacts.PersonOrBuilder getPeopleOrBuilder(
      int index);
}
