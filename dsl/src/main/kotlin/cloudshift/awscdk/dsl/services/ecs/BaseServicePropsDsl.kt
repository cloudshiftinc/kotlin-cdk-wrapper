@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.BaseServiceProps
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.DeploymentAlarmConfig
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.LaunchType
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.ServiceConnectProps

/**
 * Complete base service properties that are required to be supplied by the implementation of the
 * BaseService class.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.servicediscovery.*;
 * Cluster cluster;
 * ContainerDefinition containerDefinition;
 * LogDriver logDriver;
 * INamespace namespace;
 * BaseServiceProps baseServiceProps = BaseServiceProps.builder()
 * .cluster(cluster)
 * .launchType(LaunchType.EC2)
 * // the properties below are optional
 * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build()))
 * .circuitBreaker(DeploymentCircuitBreaker.builder()
 * .rollback(false)
 * .build())
 * .cloudMapOptions(CloudMapOptions.builder()
 * .cloudMapNamespace(namespace)
 * .container(containerDefinition)
 * .containerPort(123)
 * .dnsRecordType(DnsRecordType.A)
 * .dnsTtl(Duration.minutes(30))
 * .failureThreshold(123)
 * .name("name")
 * .build())
 * .deploymentAlarms(DeploymentAlarmConfig.builder()
 * .alarmNames(List.of("alarmNames"))
 * // the properties below are optional
 * .behavior(AlarmBehavior.ROLLBACK_ON_ALARM)
 * .build())
 * .deploymentController(DeploymentController.builder()
 * .type(DeploymentControllerType.ECS)
 * .build())
 * .desiredCount(123)
 * .enableECSManagedTags(false)
 * .enableExecuteCommand(false)
 * .healthCheckGracePeriod(Duration.minutes(30))
 * .maxHealthyPercent(123)
 * .minHealthyPercent(123)
 * .propagateTags(PropagatedTagSource.SERVICE)
 * .serviceConnectConfiguration(ServiceConnectProps.builder()
 * .logDriver(logDriver)
 * .namespace("namespace")
 * .services(List.of(ServiceConnectService.builder()
 * .portMappingName("portMappingName")
 * // the properties below are optional
 * .discoveryName("discoveryName")
 * .dnsName("dnsName")
 * .ingressPortOverride(123)
 * .port(123)
 * .build()))
 * .build())
 * .serviceName("serviceName")
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseServicePropsDsl {
  private val cdkBuilder: BaseServiceProps.Builder = BaseServiceProps.builder()

  private val _capacityProviderStrategies: MutableList<CapacityProviderStrategy> = mutableListOf()

  /**
   * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
   * service.
   */
  public
      fun capacityProviderStrategies(capacityProviderStrategies: CapacityProviderStrategyDsl.() -> Unit) {
    _capacityProviderStrategies.add(CapacityProviderStrategyDsl().apply(capacityProviderStrategies).build())
  }

  /**
   * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
   * service.
   */
  public
      fun capacityProviderStrategies(capacityProviderStrategies: Collection<CapacityProviderStrategy>) {
    _capacityProviderStrategies.addAll(capacityProviderStrategies)
  }

  /**
   * @param circuitBreaker Whether to enable the deployment circuit breaker.
   * If this property is defined, circuit breaker will be implicitly
   * enabled.
   */
  public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreakerDsl.() -> Unit = {}) {
    val builder = DeploymentCircuitBreakerDsl()
    builder.apply(circuitBreaker)
    cdkBuilder.circuitBreaker(builder.build())
  }

  /**
   * @param circuitBreaker Whether to enable the deployment circuit breaker.
   * If this property is defined, circuit breaker will be implicitly
   * enabled.
   */
  public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
    cdkBuilder.circuitBreaker(circuitBreaker)
  }

  /**
   * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
   * discovery.
   */
  public fun cloudMapOptions(cloudMapOptions: CloudMapOptionsDsl.() -> Unit = {}) {
    val builder = CloudMapOptionsDsl()
    builder.apply(cloudMapOptions)
    cdkBuilder.cloudMapOptions(builder.build())
  }

  /**
   * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
   * discovery.
   */
  public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
    cdkBuilder.cloudMapOptions(cloudMapOptions)
  }

  /**
   * @param cluster The name of the cluster that hosts the service. 
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if at
   * least one enters a state of alarm during the deployment or bake time.
   */
  public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfigDsl.() -> Unit = {}) {
    val builder = DeploymentAlarmConfigDsl()
    builder.apply(deploymentAlarms)
    cdkBuilder.deploymentAlarms(builder.build())
  }

  /**
   * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if at
   * least one enters a state of alarm during the deployment or bake time.
   */
  public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig) {
    cdkBuilder.deploymentAlarms(deploymentAlarms)
  }

  /**
   * @param deploymentController Specifies which deployment controller to use for the service.
   * For more information, see
   * [Amazon ECS Deployment
   * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
   */
  public fun deploymentController(deploymentController: DeploymentControllerDsl.() -> Unit = {}) {
    val builder = DeploymentControllerDsl()
    builder.apply(deploymentController)
    cdkBuilder.deploymentController(builder.build())
  }

  /**
   * @param deploymentController Specifies which deployment controller to use for the service.
   * For more information, see
   * [Amazon ECS Deployment
   * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
   */
  public fun deploymentController(deploymentController: DeploymentController) {
    cdkBuilder.deploymentController(deploymentController)
  }

  /**
   * @param desiredCount The desired number of instantiations of the task definition to keep running
   * on the service.
   */
  public fun desiredCount(desiredCount: Number) {
    cdkBuilder.desiredCount(desiredCount)
  }

  /**
   * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
   * within the service.
   * For more information, see
   * [Tagging Your Amazon ECS
   * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
   */
  public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
  }

  /**
   * @param enableExecuteCommand Whether to enable the ability to execute into a container.
   */
  public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    cdkBuilder.enableExecuteCommand(enableExecuteCommand)
  }

  /**
   * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
   * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
   * started.
   */
  public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
    cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
  }

  /**
   * @param launchType The launch type on which to run your service. 
   * LaunchType will be omitted if capacity provider strategies are specified on the service.
   */
  public fun launchType(launchType: LaunchType) {
    cdkBuilder.launchType(launchType)
  }

  /**
   * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
   * ECS service's DesiredCount value, that can run in a service during a deployment.
   */
  public fun maxHealthyPercent(maxHealthyPercent: Number) {
    cdkBuilder.maxHealthyPercent(maxHealthyPercent)
  }

  /**
   * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
   * ECS service's DesiredCount value, that must continue to run and remain healthy during a
   * deployment.
   */
  public fun minHealthyPercent(minHealthyPercent: Number) {
    cdkBuilder.minHealthyPercent(minHealthyPercent)
  }

  /**
   * @param propagateTags Specifies whether to propagate the tags from the task definition or the
   * service to the tasks in the service.
   * Valid values are: PropagatedTagSource.SERVICE, PropagatedTagSource.TASK_DEFINITION or
   * PropagatedTagSource.NONE
   */
  public fun propagateTags(propagateTags: PropagatedTagSource) {
    cdkBuilder.propagateTags(propagateTags)
  }

  /**
   * @param serviceConnectConfiguration Configuration for Service Connect.
   */
  public
      fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectPropsDsl.() -> Unit
      = {}) {
    val builder = ServiceConnectPropsDsl()
    builder.apply(serviceConnectConfiguration)
    cdkBuilder.serviceConnectConfiguration(builder.build())
  }

  /**
   * @param serviceConnectConfiguration Configuration for Service Connect.
   */
  public fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps) {
    cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration)
  }

  /**
   * @param serviceName The name of the service.
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): BaseServiceProps {
    if(_capacityProviderStrategies.isNotEmpty())
        cdkBuilder.capacityProviderStrategies(_capacityProviderStrategies)
    return cdkBuilder.build()
  }
}
