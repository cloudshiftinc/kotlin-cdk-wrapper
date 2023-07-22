@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskSet
import software.amazon.awscdk.services.ecs.CfnTaskSetProps

/**
 * Properties for defining a `CfnTaskSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * CfnTaskSetProps cfnTaskSetProps = CfnTaskSetProps.builder()
 * .cluster("cluster")
 * .service("service")
 * .taskDefinition("taskDefinition")
 * // the properties below are optional
 * .externalId("externalId")
 * .launchType("launchType")
 * .loadBalancers(List.of(LoadBalancerProperty.builder()
 * .containerName("containerName")
 * .containerPort(123)
 * .loadBalancerName("loadBalancerName")
 * .targetGroupArn("targetGroupArn")
 * .build()))
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .build())
 * .build())
 * .platformVersion("platformVersion")
 * .scale(ScaleProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .serviceRegistries(List.of(ServiceRegistryProperty.builder()
 * .containerName("containerName")
 * .containerPort(123)
 * .port(123)
 * .registryArn("registryArn")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html)
 */
@CdkDslMarker
public class CfnTaskSetPropsDsl {
  private val cdkBuilder: CfnTaskSetProps.Builder = CfnTaskSetProps.builder()

  private val _loadBalancers: MutableList<Any> = mutableListOf()

  private val _serviceRegistries: MutableList<Any> = mutableListOf()

  /**
   * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts the
   * service to create the task set in. 
   */
  public fun cluster(cluster: String) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * @param externalId An optional non-unique tag that identifies this task set in external systems.
   * If the task set is associated with a service discovery registry, the tasks in this task set
   * will have the `ECS_TASK_SET_EXTERNAL_ID` AWS Cloud Map attribute set to the provided value.
   */
  public fun externalId(externalId: String) {
    cdkBuilder.externalId(externalId)
  }

  /**
   * @param launchType The launch type that new tasks in the task set uses.
   * For more information, see [Amazon ECS launch
   * types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   * If a `launchType` is specified, the `capacityProviderStrategy` parameter must be omitted.
   */
  public fun launchType(launchType: String) {
    cdkBuilder.launchType(launchType)
  }

  /**
   * @param loadBalancers A load balancer object representing the load balancer to use with the task
   * set.
   * The supported load balancer types are either an Application Load Balancer or a Network Load
   * Balancer.
   */
  public fun loadBalancers(vararg loadBalancers: Any) {
    _loadBalancers.addAll(listOf(*loadBalancers))
  }

  /**
   * @param loadBalancers A load balancer object representing the load balancer to use with the task
   * set.
   * The supported load balancer types are either an Application Load Balancer or a Network Load
   * Balancer.
   */
  public fun loadBalancers(loadBalancers: Collection<Any>) {
    _loadBalancers.addAll(loadBalancers)
  }

  /**
   * @param loadBalancers A load balancer object representing the load balancer to use with the task
   * set.
   * The supported load balancer types are either an Application Load Balancer or a Network Load
   * Balancer.
   */
  public fun loadBalancers(loadBalancers: IResolvable) {
    cdkBuilder.loadBalancers(loadBalancers)
  }

  /**
   * @param networkConfiguration The network configuration for the task set.
   */
  public fun networkConfiguration(networkConfiguration: IResolvable) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  /**
   * @param networkConfiguration The network configuration for the task set.
   */
  public fun networkConfiguration(networkConfiguration: CfnTaskSet.NetworkConfigurationProperty) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  /**
   * @param platformVersion The platform version that the tasks in the task set uses.
   * A platform version is specified only for tasks using the Fargate launch type. If one isn't
   * specified, the `LATEST` platform version is used.
   */
  public fun platformVersion(platformVersion: String) {
    cdkBuilder.platformVersion(platformVersion)
  }

  /**
   * @param scale A floating-point percentage of your desired number of tasks to place and keep
   * running in the task set.
   */
  public fun scale(scale: IResolvable) {
    cdkBuilder.scale(scale)
  }

  /**
   * @param scale A floating-point percentage of your desired number of tasks to place and keep
   * running in the task set.
   */
  public fun scale(scale: CfnTaskSet.ScaleProperty) {
    cdkBuilder.scale(scale)
  }

  /**
   * @param service The short name or full Amazon Resource Name (ARN) of the service to create the
   * task set in. 
   */
  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  /**
   * @param serviceRegistries The details of the service discovery registries to assign to this task
   * set.
   * For more information, see [Service
   * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
   */
  public fun serviceRegistries(vararg serviceRegistries: Any) {
    _serviceRegistries.addAll(listOf(*serviceRegistries))
  }

  /**
   * @param serviceRegistries The details of the service discovery registries to assign to this task
   * set.
   * For more information, see [Service
   * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
   */
  public fun serviceRegistries(serviceRegistries: Collection<Any>) {
    _serviceRegistries.addAll(serviceRegistries)
  }

  /**
   * @param serviceRegistries The details of the service discovery registries to assign to this task
   * set.
   * For more information, see [Service
   * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
   */
  public fun serviceRegistries(serviceRegistries: IResolvable) {
    cdkBuilder.serviceRegistries(serviceRegistries)
  }

  /**
   * @param taskDefinition The task definition for the tasks in the task set to use. 
   * If a revision isn't specified, the latest `ACTIVE` revision is used.
   */
  public fun taskDefinition(taskDefinition: String) {
    cdkBuilder.taskDefinition(taskDefinition)
  }

  public fun build(): CfnTaskSetProps {
    if(_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
    if(_serviceRegistries.isNotEmpty()) cdkBuilder.serviceRegistries(_serviceRegistries)
    return cdkBuilder.build()
  }
}
