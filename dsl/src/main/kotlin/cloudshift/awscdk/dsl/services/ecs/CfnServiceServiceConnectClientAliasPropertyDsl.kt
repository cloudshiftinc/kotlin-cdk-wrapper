@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnService

/**
 * Each alias ("endpoint") is a fully-qualified name and port number that other tasks ("clients")
 * can use to connect to this service.
 *
 * Each name and port mapping must be unique within the namespace.
 *
 * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks
 * can connect to services across all of the clusters in the namespace. Tasks connect through a managed
 * proxy container that collects logs and metrics for increased visibility. Only the tasks that Amazon
 * ECS services create are supported with Service Connect. For more information, see [Service
 * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in the
 * *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ServiceConnectClientAliasProperty serviceConnectClientAliasProperty =
 * ServiceConnectClientAliasProperty.builder()
 * .port(123)
 * // the properties below are optional
 * .dnsName("dnsName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectclientalias.html)
 */
@CdkDslMarker
public class CfnServiceServiceConnectClientAliasPropertyDsl {
  private val cdkBuilder: CfnService.ServiceConnectClientAliasProperty.Builder =
      CfnService.ServiceConnectClientAliasProperty.builder()

  /**
   * @param dnsName The `dnsName` is the name that you use in the applications of client tasks to
   * connect to this service.
   * The name must be a valid DNS name but doesn't need to be fully-qualified. The name can include
   * up to 127 characters. The name can include lowercase letters, numbers, underscores (_), hyphens
   * (-), and periods (.). The name can't start with a hyphen.
   *
   * If this parameter isn't specified, the default value of `discoveryName.namespace` is used. If
   * the `discoveryName` isn't specified, the port mapping name from the task definition is used in
   * `portName.namespace` .
   *
   * To avoid changing your applications in client Amazon ECS services, set this to the same name
   * that the client application uses by default. For example, a few common names are `database` , `db`
   * , or the lowercase name of a database, such as `mysql` or `redis` . For more information, see
   * [Service
   * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   */
  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  /**
   * @param port The listening port number for the Service Connect proxy. 
   * This port is available inside of all of the tasks within the same namespace.
   *
   * To avoid changing your applications in client Amazon ECS services, set this to the same port
   * that the client application uses by default. For more information, see [Service
   * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnService.ServiceConnectClientAliasProperty = cdkBuilder.build()
}
