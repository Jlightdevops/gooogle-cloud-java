// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/target.proto

package com.google.cloud.tasks.v2beta2;

public interface AppEngineRoutingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.AppEngineRouting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * App service.
   * By default, the task is sent to the service which is the default
   * service when the task is attempted.
   * For some queues or tasks which were created using the App Engine
   * Task Queue API, [host][google.cloud.tasks.v2beta2.AppEngineRouting.host] is not parsable
   * into [service][google.cloud.tasks.v2beta2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2beta2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance]. For example, some tasks
   * which were created using the App Engine SDK use a custom domain
   * name; custom domains are not parsed by Cloud Tasks. If
   * [host][google.cloud.tasks.v2beta2.AppEngineRouting.host] is not parsable, then
   * [service][google.cloud.tasks.v2beta2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2beta2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] are the empty string.
   * </pre>
   *
   * <code>string service = 1;</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <pre>
   * App service.
   * By default, the task is sent to the service which is the default
   * service when the task is attempted.
   * For some queues or tasks which were created using the App Engine
   * Task Queue API, [host][google.cloud.tasks.v2beta2.AppEngineRouting.host] is not parsable
   * into [service][google.cloud.tasks.v2beta2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2beta2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance]. For example, some tasks
   * which were created using the App Engine SDK use a custom domain
   * name; custom domains are not parsed by Cloud Tasks. If
   * [host][google.cloud.tasks.v2beta2.AppEngineRouting.host] is not parsable, then
   * [service][google.cloud.tasks.v2beta2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2beta2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] are the empty string.
   * </pre>
   *
   * <code>string service = 1;</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <pre>
   * App version.
   * By default, the task is sent to the version which is the default
   * version when the task is attempted.
   * For some queues or tasks which were created using the App Engine
   * Task Queue API, [host][google.cloud.tasks.v2beta2.AppEngineRouting.host] is not parsable
   * into [service][google.cloud.tasks.v2beta2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2beta2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance]. For example, some tasks
   * which were created using the App Engine SDK use a custom domain
   * name; custom domains are not parsed by Cloud Tasks. If
   * [host][google.cloud.tasks.v2beta2.AppEngineRouting.host] is not parsable, then
   * [service][google.cloud.tasks.v2beta2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2beta2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] are the empty string.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * App version.
   * By default, the task is sent to the version which is the default
   * version when the task is attempted.
   * For some queues or tasks which were created using the App Engine
   * Task Queue API, [host][google.cloud.tasks.v2beta2.AppEngineRouting.host] is not parsable
   * into [service][google.cloud.tasks.v2beta2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2beta2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance]. For example, some tasks
   * which were created using the App Engine SDK use a custom domain
   * name; custom domains are not parsed by Cloud Tasks. If
   * [host][google.cloud.tasks.v2beta2.AppEngineRouting.host] is not parsable, then
   * [service][google.cloud.tasks.v2beta2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2beta2.AppEngineRouting.version], and
   * [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] are the empty string.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * App instance.
   * By default, the task is sent to an instance which is available when
   * the task is attempted.
   * Requests can only be sent to a specific instance if
   * [manual scaling is used in App Engine
   * Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine?hl=en_US#scaling_types_and_instance_classes).
   * App Engine Flex does not support instances. For more information, see
   * [App Engine Standard request
   * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed)
   * and [App Engine Flex request
   * routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
   * </pre>
   *
   * <code>string instance = 3;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * App instance.
   * By default, the task is sent to an instance which is available when
   * the task is attempted.
   * Requests can only be sent to a specific instance if
   * [manual scaling is used in App Engine
   * Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine?hl=en_US#scaling_types_and_instance_classes).
   * App Engine Flex does not support instances. For more information, see
   * [App Engine Standard request
   * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed)
   * and [App Engine Flex request
   * routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
   * </pre>
   *
   * <code>string instance = 3;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();

  /**
   * <pre>
   * Output only. The host that the task is sent to.
   * For more information, see
   * [How Requests are
   * Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed).
   * The host is constructed as:
   * * `host = [application_domain_name]`&lt;/br&gt;
   *   `| [service] + '.' + [application_domain_name]`&lt;/br&gt;
   *   `| [version] + '.' + [application_domain_name]`&lt;/br&gt;
   *   `| [version_dot_service]+ '.' + [application_domain_name]`&lt;/br&gt;
   *   `| [instance] + '.' + [application_domain_name]`&lt;/br&gt;
   *   `| [instance_dot_service] + '.' + [application_domain_name]`&lt;/br&gt;
   *   `| [instance_dot_version] + '.' + [application_domain_name]`&lt;/br&gt;
   *   `| [instance_dot_version_dot_service] + '.' + [application_domain_name]`
   * * `application_domain_name` = The domain name of the app, for
   *   example &lt;app-id&gt;.appspot.com, which is associated with the
   *   queue's project ID. Some tasks which were created using the App Engine
   *   SDK use a custom domain name.
   * * `service =` [service][google.cloud.tasks.v2beta2.AppEngineRouting.service]
   * * `version =` [version][google.cloud.tasks.v2beta2.AppEngineRouting.version]
   * * `version_dot_service =`
   *   [version][google.cloud.tasks.v2beta2.AppEngineRouting.version] `+ '.' +`
   *   [service][google.cloud.tasks.v2beta2.AppEngineRouting.service]
   * * `instance =` [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance]
   * * `instance_dot_service =`
   *   [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] `+ '.' +`
   *   [service][google.cloud.tasks.v2beta2.AppEngineRouting.service]
   * * `instance_dot_version =`
   *   [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] `+ '.' +`
   *   [version][google.cloud.tasks.v2beta2.AppEngineRouting.version]
   * * `instance_dot_version_dot_service =`
   *   [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] `+ '.' +`
   *   [version][google.cloud.tasks.v2beta2.AppEngineRouting.version] `+ '.' +`
   *   [service][google.cloud.tasks.v2beta2.AppEngineRouting.service]
   * If [service][google.cloud.tasks.v2beta2.AppEngineRouting.service] is empty, then the task will be sent
   * to the service which is the default service when the task is attempted.
   * If [version][google.cloud.tasks.v2beta2.AppEngineRouting.version] is empty, then the task will be sent
   * to the version which is the default version when the task is attempted.
   * If [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] is empty, then the task
   * will be sent to an instance which is available when the task is
   * attempted.
   * If [service][google.cloud.tasks.v2beta2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2beta2.AppEngineRouting.version], or
   * [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] is invalid, then the task
   * will be sent to the default version of the default service when
   * the task is attempted.
   * </pre>
   *
   * <code>string host = 4;</code>
   * @return The host.
   */
  java.lang.String getHost();
  /**
   * <pre>
   * Output only. The host that the task is sent to.
   * For more information, see
   * [How Requests are
   * Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed).
   * The host is constructed as:
   * * `host = [application_domain_name]`&lt;/br&gt;
   *   `| [service] + '.' + [application_domain_name]`&lt;/br&gt;
   *   `| [version] + '.' + [application_domain_name]`&lt;/br&gt;
   *   `| [version_dot_service]+ '.' + [application_domain_name]`&lt;/br&gt;
   *   `| [instance] + '.' + [application_domain_name]`&lt;/br&gt;
   *   `| [instance_dot_service] + '.' + [application_domain_name]`&lt;/br&gt;
   *   `| [instance_dot_version] + '.' + [application_domain_name]`&lt;/br&gt;
   *   `| [instance_dot_version_dot_service] + '.' + [application_domain_name]`
   * * `application_domain_name` = The domain name of the app, for
   *   example &lt;app-id&gt;.appspot.com, which is associated with the
   *   queue's project ID. Some tasks which were created using the App Engine
   *   SDK use a custom domain name.
   * * `service =` [service][google.cloud.tasks.v2beta2.AppEngineRouting.service]
   * * `version =` [version][google.cloud.tasks.v2beta2.AppEngineRouting.version]
   * * `version_dot_service =`
   *   [version][google.cloud.tasks.v2beta2.AppEngineRouting.version] `+ '.' +`
   *   [service][google.cloud.tasks.v2beta2.AppEngineRouting.service]
   * * `instance =` [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance]
   * * `instance_dot_service =`
   *   [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] `+ '.' +`
   *   [service][google.cloud.tasks.v2beta2.AppEngineRouting.service]
   * * `instance_dot_version =`
   *   [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] `+ '.' +`
   *   [version][google.cloud.tasks.v2beta2.AppEngineRouting.version]
   * * `instance_dot_version_dot_service =`
   *   [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] `+ '.' +`
   *   [version][google.cloud.tasks.v2beta2.AppEngineRouting.version] `+ '.' +`
   *   [service][google.cloud.tasks.v2beta2.AppEngineRouting.service]
   * If [service][google.cloud.tasks.v2beta2.AppEngineRouting.service] is empty, then the task will be sent
   * to the service which is the default service when the task is attempted.
   * If [version][google.cloud.tasks.v2beta2.AppEngineRouting.version] is empty, then the task will be sent
   * to the version which is the default version when the task is attempted.
   * If [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] is empty, then the task
   * will be sent to an instance which is available when the task is
   * attempted.
   * If [service][google.cloud.tasks.v2beta2.AppEngineRouting.service],
   * [version][google.cloud.tasks.v2beta2.AppEngineRouting.version], or
   * [instance][google.cloud.tasks.v2beta2.AppEngineRouting.instance] is invalid, then the task
   * will be sent to the default version of the default service when
   * the task is attempted.
   * </pre>
   *
   * <code>string host = 4;</code>
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString
      getHostBytes();
}
