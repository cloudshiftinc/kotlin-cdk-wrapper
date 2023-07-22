@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskSet

/**
 * The details for the service registry.
 *
 * Each service may be associated with one service registry. Multiple service registries for each
 * service are not supported.
 *
 * When you add, update, or remove the service registries configuration, Amazon ECS starts a new
 * deployment. New tasks are registered and deregistered to the updated service registry configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ServiceRegistryProperty serviceRegistryProperty = ServiceRegistryProperty.builder()
 * .containerName("containerName")
 * .containerPort(123)
 * .port(123)
 * .registryArn("registryArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html)
 */
@CdkDslMarker
public class CfnTaskSetServiceRegistryPropertyDsl {
  private val cdkBuilder: CfnTaskSet.ServiceRegistryProperty.Builder =
      CfnTaskSet.ServiceRegistryProperty.builder()

  /**
   * @param containerName The container name value to be used for your service discovery service.
   * It's already specified in the task definition. If the task definition that your service task
   * specifies uses the `bridge` or `host` network mode, you must specify a `containerName` and
   * `containerPort` combination from the task definition. If the task definition that your service
   * task specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you must specify
   * either a `containerName` and `containerPort` combination or a `port` value. However, you can't
   * specify both.
   */
  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  /**
   * @param containerPort The port value to be used for your service discovery service.
   * It's already specified in the task definition. If the task definition your service task
   * specifies uses the `bridge` or `host` network mode, you must specify a `containerName` and
   * `containerPort` combination from the task definition. If the task definition your service task
   * specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you must specify
   * either a `containerName` and `containerPort` combination or a `port` value. However, you can't
   * specify both.
   */
  public fun containerPort(containerPort: Number) {
    cdkBuilder.containerPort(containerPort)
  }

  /**
   * @param port The port value used if your service discovery service specified an SRV record.
   * This field might be used if both the `awsvpc` network mode and SRV records are used.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param registryArn The Amazon Resource Name (ARN) of the service registry.
   * The currently supported service registry is AWS Cloud Map . For more information, see
   * [CreateService](https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html) .
   */
  public fun registryArn(registryArn: String) {
    cdkBuilder.registryArn(registryArn)
  }

  public fun build(): CfnTaskSet.ServiceRegistryProperty = cdkBuilder.build()
}
