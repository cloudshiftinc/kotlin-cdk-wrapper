@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions
import software.amazon.awscdk.services.iam.IRole

/**
 * Example:
 *
 * ```
 * Cluster cluster;
 * NetworkLoadBalancedEc2Service loadBalancedEcsService =
 * NetworkLoadBalancedEc2Service.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(1024)
 * .taskImageOptions(NetworkLoadBalancedTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("test"))
 * .environment(Map.of(
 * "TEST_ENVIRONMENT_VARIABLE1", "test environment variable 1 value",
 * "TEST_ENVIRONMENT_VARIABLE2", "test environment variable 2 value"))
 * .build())
 * .desiredCount(2)
 * .build();
 * ```
 */
@CdkDslMarker
public class NetworkLoadBalancedTaskImageOptionsDsl {
  private val cdkBuilder: NetworkLoadBalancedTaskImageOptions.Builder =
      NetworkLoadBalancedTaskImageOptions.builder()

  /**
   * @param containerName The container name value to be specified in the task definition.
   */
  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  /**
   * @param containerPort The port number on the container that is bound to the user-specified or
   * automatically assigned host port.
   * If you are using containers in a task with the awsvpc or host network mode, exposed ports
   * should be specified using containerPort.
   * If you are using containers in a task with the bridge network mode and you specify a container
   * port and not a host port,
   * your container automatically receives a host port in the ephemeral port range.
   *
   * Port mappings that are automatically assigned in this way do not count toward the 100 reserved
   * ports limit of a container instance.
   *
   * For more information, see
   * [hostPort](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PortMapping.html#ECS-Type-PortMapping-hostPort).
   */
  public fun containerPort(containerPort: Number) {
    cdkBuilder.containerPort(containerPort)
  }

  /**
   * @param dockerLabels A key/value map of labels to add to the container.
   */
  public fun dockerLabels(dockerLabels: Map<String, String>) {
    cdkBuilder.dockerLabels(dockerLabels)
  }

  /**
   * @param enableLogging Flag to indicate whether to enable logging.
   */
  public fun enableLogging(enableLogging: Boolean) {
    cdkBuilder.enableLogging(enableLogging)
  }

  /**
   * @param environment The environment variables to pass to the container.
   */
  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param executionRole The name of the task execution IAM role that grants the Amazon ECS
   * container agent permission to call AWS APIs on your behalf.
   */
  public fun executionRole(executionRole: IRole) {
    cdkBuilder.executionRole(executionRole)
  }

  /**
   * @param family The name of a family that this task definition is registered to.
   * A family groups multiple versions of a task definition.
   */
  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  /**
   * @param image The image used to start a container. 
   * Image or taskDefinition must be specified, but not both.
   */
  public fun image(image: ContainerImage) {
    cdkBuilder.image(image)
  }

  /**
   * @param logDriver The log driver to use.
   */
  public fun logDriver(logDriver: LogDriver) {
    cdkBuilder.logDriver(logDriver)
  }

  /**
   * @param secrets The secret to expose to the container as an environment variable.
   */
  public fun secrets(secrets: Map<String, Secret>) {
    cdkBuilder.secrets(secrets)
  }

  /**
   * @param taskRole The name of the task IAM role that grants containers in the task permission to
   * call AWS APIs on your behalf.
   */
  public fun taskRole(taskRole: IRole) {
    cdkBuilder.taskRole(taskRole)
  }

  public fun build(): NetworkLoadBalancedTaskImageOptions = cdkBuilder.build()
}
