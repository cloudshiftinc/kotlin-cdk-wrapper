@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService

/**
 * The Service Connect service object configuration.
 *
 * For more information, see [Service
 * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in the
 * *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ServiceConnectServiceProperty serviceConnectServiceProperty =
 * ServiceConnectServiceProperty.builder()
 * .portName("portName")
 * // the properties below are optional
 * .clientAliases(List.of(ServiceConnectClientAliasProperty.builder()
 * .port(123)
 * // the properties below are optional
 * .dnsName("dnsName")
 * .build()))
 * .discoveryName("discoveryName")
 * .ingressPortOverride(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html)
 */
@CdkDslMarker
public class CfnServiceServiceConnectServicePropertyDsl {
  private val cdkBuilder: CfnService.ServiceConnectServiceProperty.Builder =
      CfnService.ServiceConnectServiceProperty.builder()

  private val _clientAliases: MutableList<Any> = mutableListOf()

  /**
   * @param clientAliases The list of client aliases for this Service Connect service.
   * You use these to assign names that can be used by client applications. The maximum number of
   * client aliases that you can have in this list is 1.
   *
   * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks
   * ("clients") can use to connect to this service.
   *
   * Each name and port mapping must be unique within the namespace.
   *
   * For each `ServiceConnectService` , you must provide at least one `clientAlias` with one `port`
   * .
   */
  public fun clientAliases(vararg clientAliases: Any) {
    _clientAliases.addAll(listOf(*clientAliases))
  }

  /**
   * @param clientAliases The list of client aliases for this Service Connect service.
   * You use these to assign names that can be used by client applications. The maximum number of
   * client aliases that you can have in this list is 1.
   *
   * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks
   * ("clients") can use to connect to this service.
   *
   * Each name and port mapping must be unique within the namespace.
   *
   * For each `ServiceConnectService` , you must provide at least one `clientAlias` with one `port`
   * .
   */
  public fun clientAliases(clientAliases: Collection<Any>) {
    _clientAliases.addAll(clientAliases)
  }

  /**
   * @param clientAliases The list of client aliases for this Service Connect service.
   * You use these to assign names that can be used by client applications. The maximum number of
   * client aliases that you can have in this list is 1.
   *
   * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks
   * ("clients") can use to connect to this service.
   *
   * Each name and port mapping must be unique within the namespace.
   *
   * For each `ServiceConnectService` , you must provide at least one `clientAlias` with one `port`
   * .
   */
  public fun clientAliases(clientAliases: IResolvable) {
    cdkBuilder.clientAliases(clientAliases)
  }

  /**
   * @param discoveryName The `discoveryName` is the name of the new AWS Cloud Map service that
   * Amazon ECS creates for this Amazon ECS service.
   * This must be unique within the AWS Cloud Map namespace. The name can contain up to 64
   * characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-). The
   * name can't start with a hyphen.
   *
   * If the `discoveryName` isn't specified, the port mapping name from the task definition is used
   * in `portName.namespace` .
   */
  public fun discoveryName(discoveryName: String) {
    cdkBuilder.discoveryName(discoveryName)
  }

  /**
   * @param ingressPortOverride The port number for the Service Connect proxy to listen on.
   * Use the value of this field to bypass the proxy for traffic on the port number specified in the
   * named `portMapping` in the task definition of this application, and then use it in your VPC
   * security groups to allow traffic into the proxy for this Amazon ECS service.
   *
   * In `awsvpc` mode and Fargate, the default value is the container port number. The container
   * port number is in the `portMapping` in the task definition. In bridge mode, the default value is
   * the ephemeral port of the Service Connect proxy.
   */
  public fun ingressPortOverride(ingressPortOverride: Number) {
    cdkBuilder.ingressPortOverride(ingressPortOverride)
  }

  /**
   * @param portName The `portName` must match the name of one of the `portMappings` from all the
   * containers in the task definition of this Amazon ECS service. 
   */
  public fun portName(portName: String) {
    cdkBuilder.portName(portName)
  }

  public fun build(): CfnService.ServiceConnectServiceProperty {
    if(_clientAliases.isNotEmpty()) cdkBuilder.clientAliases(_clientAliases)
    return cdkBuilder.build()
  }
}
