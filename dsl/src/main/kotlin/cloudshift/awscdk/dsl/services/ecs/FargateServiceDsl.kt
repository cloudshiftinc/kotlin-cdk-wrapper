@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.DeploymentAlarmConfig
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.ecs.FargateService
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.ServiceConnectProps
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.constructs.Construct

/**
 * This creates a service using the Fargate launch type on an ECS cluster.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * Alarm elbAlarm;
 * FargateService service = FargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .deploymentAlarms(DeploymentAlarmConfig.builder()
 * .alarmNames(List.of(elbAlarm.getAlarmName()))
 * .behavior(AlarmBehavior.ROLLBACK_ON_ALARM)
 * .build())
 * .build();
 * // Defining a deployment alarm after the service has been created
 * String cpuAlarmName = "MyCpuMetricAlarm";
 * Alarm.Builder.create(this, "CPUAlarm")
 * .alarmName(cpuAlarmName)
 * .metric(service.metricCpuUtilization())
 * .evaluationPeriods(2)
 * .threshold(80)
 * .build();
 * service.enableDeploymentAlarms(List.of(cpuAlarmName), DeploymentAlarmOptions.builder()
 * .behavior(AlarmBehavior.FAIL_ON_ALARM)
 * .build());
 * ```
 */
@CdkDslMarker
public class FargateServiceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: FargateService.Builder = FargateService.Builder.create(scope, id)

  private val _capacityProviderStrategies: MutableList<CapacityProviderStrategy> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * Specifies whether the task's elastic network interface receives a public IP address.
   *
   * If true, each task will receive a public IP address.
   *
   * Default: false
   *
   * @param assignPublicIp Specifies whether the task's elastic network interface receives a public
   * IP address. 
   */
  public fun assignPublicIp(assignPublicIp: Boolean) {
    cdkBuilder.assignPublicIp(assignPublicIp)
  }

  /**
   * A list of Capacity Provider strategies used to place a service.
   *
   * Default: - undefined
   *
   * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
   * service. 
   */
  public
      fun capacityProviderStrategies(capacityProviderStrategies: CapacityProviderStrategyDsl.() -> Unit) {
    _capacityProviderStrategies.add(CapacityProviderStrategyDsl().apply(capacityProviderStrategies).build())
  }

  /**
   * A list of Capacity Provider strategies used to place a service.
   *
   * Default: - undefined
   *
   * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
   * service. 
   */
  public
      fun capacityProviderStrategies(capacityProviderStrategies: Collection<CapacityProviderStrategy>) {
    _capacityProviderStrategies.addAll(capacityProviderStrategies)
  }

  /**
   * Whether to enable the deployment circuit breaker.
   *
   * If this property is defined, circuit breaker will be implicitly
   * enabled.
   *
   * Default: - disabled
   *
   * @param circuitBreaker Whether to enable the deployment circuit breaker. 
   */
  public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreakerDsl.() -> Unit = {}) {
    val builder = DeploymentCircuitBreakerDsl()
    builder.apply(circuitBreaker)
    cdkBuilder.circuitBreaker(builder.build())
  }

  /**
   * Whether to enable the deployment circuit breaker.
   *
   * If this property is defined, circuit breaker will be implicitly
   * enabled.
   *
   * Default: - disabled
   *
   * @param circuitBreaker Whether to enable the deployment circuit breaker. 
   */
  public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
    cdkBuilder.circuitBreaker(circuitBreaker)
  }

  /**
   * The options for configuring an Amazon ECS service to use service discovery.
   *
   * Default: - AWS Cloud Map service discovery is not enabled.
   *
   * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
   * discovery. 
   */
  public fun cloudMapOptions(cloudMapOptions: CloudMapOptionsDsl.() -> Unit = {}) {
    val builder = CloudMapOptionsDsl()
    builder.apply(cloudMapOptions)
    cdkBuilder.cloudMapOptions(builder.build())
  }

  /**
   * The options for configuring an Amazon ECS service to use service discovery.
   *
   * Default: - AWS Cloud Map service discovery is not enabled.
   *
   * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
   * discovery. 
   */
  public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
    cdkBuilder.cloudMapOptions(cloudMapOptions)
  }

  /**
   * The name of the cluster that hosts the service.
   *
   * @param cluster The name of the cluster that hosts the service. 
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * The alarm(s) to monitor during deployment, and behavior to apply if at least one enters a state
   * of alarm during the deployment or bake time.
   *
   * Default: - No alarms will be monitored during deployment.
   *
   * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if at
   * least one enters a state of alarm during the deployment or bake time. 
   */
  public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfigDsl.() -> Unit = {}) {
    val builder = DeploymentAlarmConfigDsl()
    builder.apply(deploymentAlarms)
    cdkBuilder.deploymentAlarms(builder.build())
  }

  /**
   * The alarm(s) to monitor during deployment, and behavior to apply if at least one enters a state
   * of alarm during the deployment or bake time.
   *
   * Default: - No alarms will be monitored during deployment.
   *
   * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if at
   * least one enters a state of alarm during the deployment or bake time. 
   */
  public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig) {
    cdkBuilder.deploymentAlarms(deploymentAlarms)
  }

  /**
   * Specifies which deployment controller to use for the service.
   *
   * For more information, see
   * [Amazon ECS Deployment
   * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
   *
   * Default: - Rolling update (ECS)
   *
   * @param deploymentController Specifies which deployment controller to use for the service. 
   */
  public fun deploymentController(deploymentController: DeploymentControllerDsl.() -> Unit = {}) {
    val builder = DeploymentControllerDsl()
    builder.apply(deploymentController)
    cdkBuilder.deploymentController(builder.build())
  }

  /**
   * Specifies which deployment controller to use for the service.
   *
   * For more information, see
   * [Amazon ECS Deployment
   * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
   *
   * Default: - Rolling update (ECS)
   *
   * @param deploymentController Specifies which deployment controller to use for the service. 
   */
  public fun deploymentController(deploymentController: DeploymentController) {
    cdkBuilder.deploymentController(deploymentController)
  }

  /**
   * The desired number of instantiations of the task definition to keep running on the service.
   *
   * Default: - When creating the service, default is 1; when updating the service, default uses
   * the current task number.
   *
   * @param desiredCount The desired number of instantiations of the task definition to keep running
   * on the service. 
   */
  public fun desiredCount(desiredCount: Number) {
    cdkBuilder.desiredCount(desiredCount)
  }

  /**
   * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
   *
   * For more information, see
   * [Tagging Your Amazon ECS
   * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
   *
   * Default: false
   *
   * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
   * within the service. 
   */
  public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
  }

  /**
   * Whether to enable the ability to execute into a container.
   *
   * Default: - undefined
   *
   * @param enableExecuteCommand Whether to enable the ability to execute into a container. 
   */
  public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    cdkBuilder.enableExecuteCommand(enableExecuteCommand)
  }

  /**
   * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic
   * Load Balancing target health checks after a task has first started.
   *
   * Default: - defaults to 60 seconds if at least one load balancer is in-use and it is not already
   * set
   *
   * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
   * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
   * started. 
   */
  public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
    cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
  }

  /**
   * The maximum number of tasks, specified as a percentage of the Amazon ECS service's DesiredCount
   * value, that can run in a service during a deployment.
   *
   * Default: - 100 if daemon, otherwise 200
   *
   * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
   * ECS service's DesiredCount value, that can run in a service during a deployment. 
   */
  public fun maxHealthyPercent(maxHealthyPercent: Number) {
    cdkBuilder.maxHealthyPercent(maxHealthyPercent)
  }

  /**
   * The minimum number of tasks, specified as a percentage of the Amazon ECS service's DesiredCount
   * value, that must continue to run and remain healthy during a deployment.
   *
   * Default: - 0 if daemon, otherwise 50
   *
   * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
   * ECS service's DesiredCount value, that must continue to run and remain healthy during a
   * deployment. 
   */
  public fun minHealthyPercent(minHealthyPercent: Number) {
    cdkBuilder.minHealthyPercent(minHealthyPercent)
  }

  /**
   * The platform version on which to run your service.
   *
   * If one is not specified, the LATEST platform version is used by default. For more information,
   * see
   * [AWS Fargate Platform
   * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
   * in the Amazon Elastic Container Service Developer Guide.
   *
   * Default: Latest
   *
   * @param platformVersion The platform version on which to run your service. 
   */
  public fun platformVersion(platformVersion: FargatePlatformVersion) {
    cdkBuilder.platformVersion(platformVersion)
  }

  /**
   * Specifies whether to propagate the tags from the task definition or the service to the tasks in
   * the service.
   *
   * Valid values are: PropagatedTagSource.SERVICE, PropagatedTagSource.TASK_DEFINITION or
   * PropagatedTagSource.NONE
   *
   * Default: PropagatedTagSource.NONE
   *
   * @param propagateTags Specifies whether to propagate the tags from the task definition or the
   * service to the tasks in the service. 
   */
  public fun propagateTags(propagateTags: PropagatedTagSource) {
    cdkBuilder.propagateTags(propagateTags)
  }

  /**
   * The security groups to associate with the service.
   *
   * If you do not specify a security group, a new security group is created.
   *
   * Default: - A new security group is created.
   *
   * @param securityGroups The security groups to associate with the service. 
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * The security groups to associate with the service.
   *
   * If you do not specify a security group, a new security group is created.
   *
   * Default: - A new security group is created.
   *
   * @param securityGroups The security groups to associate with the service. 
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * Configuration for Service Connect.
   *
   * Default: No ports are advertised via Service Connect on this service, and the service
   * cannot make requests to other services via Service Connect.
   *
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
   * Configuration for Service Connect.
   *
   * Default: No ports are advertised via Service Connect on this service, and the service
   * cannot make requests to other services via Service Connect.
   *
   * @param serviceConnectConfiguration Configuration for Service Connect. 
   */
  public fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps) {
    cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration)
  }

  /**
   * The name of the service.
   *
   * Default: - CloudFormation-generated name.
   *
   * @param serviceName The name of the service. 
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  /**
   * The task definition to use for tasks in the service.
   *
   * [disable-awslint:ref-via-interface]
   *
   * @param taskDefinition The task definition to use for tasks in the service. 
   */
  public fun taskDefinition(taskDefinition: TaskDefinition) {
    cdkBuilder.taskDefinition(taskDefinition)
  }

  /**
   * The subnets to associate with the service.
   *
   * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
   * Private, Isolated, Public, in that order.
   *
   * @param vpcSubnets The subnets to associate with the service. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * The subnets to associate with the service.
   *
   * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
   * Private, Isolated, Public, in that order.
   *
   * @param vpcSubnets The subnets to associate with the service. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): FargateService {
    if(_capacityProviderStrategies.isNotEmpty())
        cdkBuilder.capacityProviderStrategies(_capacityProviderStrategies)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
