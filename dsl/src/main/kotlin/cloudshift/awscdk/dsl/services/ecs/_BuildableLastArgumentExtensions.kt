@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.dsl.services.applicationautoscaling.BasicStepScalingPolicyPropsDsl
import cloudshift.awscdk.dsl.services.applicationautoscaling.EnableScalingPropsDsl
import cloudshift.awscdk.dsl.services.applicationautoscaling.ScalingScheduleDsl
import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.amazon.awscdk.services.autoscaling.AutoScalingGroup
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.ecs.AsgCapacityProvider
import software.amazon.awscdk.services.ecs.BaseService
import software.amazon.awscdk.services.ecs.CfnCapacityProvider
import software.amazon.awscdk.services.ecs.CfnCluster
import software.amazon.awscdk.services.ecs.CfnService
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import software.amazon.awscdk.services.ecs.CfnTaskSet
import software.amazon.awscdk.services.ecs.Cluster
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.ecs.ExternalService
import software.amazon.awscdk.services.ecs.ExternalTaskDefinition
import software.amazon.awscdk.services.ecs.FirelensLogRouter
import software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget
import software.amazon.awscdk.services.ecs.LinuxParameters
import software.amazon.awscdk.services.ecs.ScalableTaskCount
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.servicediscovery.INamespace
import software.amazon.awscdk.services.servicediscovery.Service

/**
 * Adds a new container to the task definition.
 *
 * @param id 
 * @param props 
 */
public inline fun TaskDefinition.addContainer(id: String,
    block: ContainerDefinitionOptionsDsl.() -> Unit = {}): ContainerDefinition {
  val builder = ContainerDefinitionOptionsDsl()
  builder.apply(block)
  return addContainer(id, builder.build())
}

/**
 * Adds a firelens log router to the task definition.
 *
 * @param id 
 * @param props 
 */
public inline fun TaskDefinition.addFirelensLogRouter(id: String,
    block: FirelensLogRouterDefinitionOptionsDsl.() -> Unit = {}): FirelensLogRouter {
  val builder = FirelensLogRouterDefinitionOptionsDsl()
  builder.apply(block)
  return addFirelensLogRouter(id, builder.build())
}

/**
 * Adds an inference accelerator to the task definition.
 *
 * @param inferenceAccelerator 
 */
public inline fun TaskDefinition.addInferenceAccelerator(block: InferenceAcceleratorDsl.() -> Unit =
    {}) {
  val builder = InferenceAcceleratorDsl()
  builder.apply(block)
  return addInferenceAccelerator(builder.build())
}

/**
 * Adds a policy statement to the task execution IAM role.
 *
 * @param statement 
 */
public inline fun TaskDefinition.addToExecutionRolePolicy(block: PolicyStatementDsl.() -> Unit =
    {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToExecutionRolePolicy(builder.build())
}

/**
 * Adds a policy statement to the task IAM role.
 *
 * @param statement 
 */
public inline fun TaskDefinition.addToTaskRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToTaskRolePolicy(builder.build())
}

/**
 * Adds a volume to the task definition.
 *
 * @param volume 
 */
public inline fun TaskDefinition.addVolume(block: VolumeDsl.() -> Unit = {}) {
  val builder = VolumeDsl()
  builder.apply(block)
  return addVolume(builder.build())
}

/**
 * The network configuration for the task set.
 */
public inline
    fun CfnTaskSet.setNetworkConfiguration(block: CfnTaskSetNetworkConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTaskSetNetworkConfigurationPropertyDsl()
  builder.apply(block)
  return setNetworkConfiguration(builder.build())
}

/**
 * A floating-point percentage of your desired number of tasks to place and keep running in the task
 * set.
 */
public inline fun CfnTaskSet.setScale(block: CfnTaskSetScalePropertyDsl.() -> Unit = {}) {
  val builder = CfnTaskSetScalePropertyDsl()
  builder.apply(block)
  return setScale(builder.build())
}

/**
 * Scales in or out to achieve a target CPU utilization.
 *
 * @param id 
 * @param props 
 */
public inline fun ScalableTaskCount.scaleOnCpuUtilization(id: String,
    block: CpuUtilizationScalingPropsDsl.() -> Unit = {}) {
  val builder = CpuUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnCpuUtilization(id, builder.build())
}

/**
 * Scales in or out to achieve a target memory utilization.
 *
 * @param id 
 * @param props 
 */
public inline fun ScalableTaskCount.scaleOnMemoryUtilization(id: String,
    block: MemoryUtilizationScalingPropsDsl.() -> Unit = {}) {
  val builder = MemoryUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnMemoryUtilization(id, builder.build())
}

/**
 * Scales in or out based on a specified metric value.
 *
 * @param id 
 * @param props 
 */
public inline fun ScalableTaskCount.scaleOnMetric(id: String,
    block: BasicStepScalingPolicyPropsDsl.() -> Unit = {}) {
  val builder = BasicStepScalingPolicyPropsDsl()
  builder.apply(block)
  return scaleOnMetric(id, builder.build())
}

/**
 * Scales in or out to achieve a target Application Load Balancer request count per target.
 *
 * @param id 
 * @param props 
 */
public inline fun ScalableTaskCount.scaleOnRequestCount(id: String,
    block: RequestCountScalingPropsDsl.() -> Unit = {}) {
  val builder = RequestCountScalingPropsDsl()
  builder.apply(block)
  return scaleOnRequestCount(id, builder.build())
}

/**
 * Scales in or out based on a specified scheduled time.
 *
 * @param id 
 * @param props 
 */
public inline fun ScalableTaskCount.scaleOnSchedule(id: String, block: ScalingScheduleDsl.() -> Unit
    = {}) {
  val builder = ScalingScheduleDsl()
  builder.apply(block)
  return scaleOnSchedule(id, builder.build())
}

/**
 * Scales in or out to achieve a target on a custom metric.
 *
 * @param id 
 * @param props 
 */
public inline fun ScalableTaskCount.scaleToTrackCustomMetric(id: String,
    block: TrackCustomMetricPropsDsl.() -> Unit = {}) {
  val builder = TrackCustomMetricPropsDsl()
  builder.apply(block)
  return scaleToTrackCustomMetric(id, builder.build())
}

/**
 * The execute command configuration for the cluster.
 */
public inline
    fun CfnCluster.setConfiguration(block: CfnClusterClusterConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterClusterConfigurationPropertyDsl()
  builder.apply(block)
  return setConfiguration(builder.build())
}

/**
 * Use this parameter to set a default Service Connect namespace.
 */
public inline
    fun CfnCluster.setServiceConnectDefaults(block: CfnClusterServiceConnectDefaultsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClusterServiceConnectDefaultsPropertyDsl()
  builder.apply(block)
  return setServiceConnectDefaults(builder.build())
}

/**
 * Adds one or more host devices to a container.
 *
 * @param device 
 */
public inline fun LinuxParameters.addDevices(block: DeviceDsl.() -> Unit = {}) {
  val builder = DeviceDsl()
  builder.apply(block)
  return addDevices(builder.build())
}

/**
 * Specifies the container path, mount options, and size (in MiB) of the tmpfs mount for a
 * container.
 *
 * Only works with EC2 launch type.
 *
 * @param tmpfs 
 */
public inline fun LinuxParameters.addTmpfs(block: TmpfsDsl.() -> Unit = {}) {
  val builder = TmpfsDsl()
  builder.apply(block)
  return addTmpfs(builder.build())
}

/**
 * Overriden method to throw error as `associateCloudMapService` is not supported for external
 * service.
 *
 * @param _options 
 */
public inline
    fun ExternalService.associateCloudMapService(block: AssociateCloudMapServiceOptionsDsl.() -> Unit
    = {}) {
  val builder = AssociateCloudMapServiceOptionsDsl()
  builder.apply(block)
  return associateCloudMapService(builder.build())
}

/**
 * Overriden method to throw error as `autoScaleTaskCount` is not supported for external service.
 *
 * @param _props 
 */
public inline fun ExternalService.autoScaleTaskCount(block: EnableScalingPropsDsl.() -> Unit = {}):
    ScalableTaskCount {
  val builder = EnableScalingPropsDsl()
  builder.apply(block)
  return autoScaleTaskCount(builder.build())
}

/**
 * Overriden method to throw error as `enableCloudMap` is not supported for external service.
 *
 * @param _options 
 */
public inline fun ExternalService.enableCloudMap(block: CloudMapOptionsDsl.() -> Unit = {}):
    Service {
  val builder = CloudMapOptionsDsl()
  builder.apply(block)
  return enableCloudMap(builder.build())
}

/**
 * Overriden method to throw error as `loadBalancerTarget` is not supported for external service.
 *
 * @param _options 
 */
public inline fun ExternalService.loadBalancerTarget(block: LoadBalancerTargetOptionsDsl.() -> Unit
    = {}): IEcsLoadBalancerTarget {
  val builder = LoadBalancerTargetOptionsDsl()
  builder.apply(block)
  return loadBalancerTarget(builder.build())
}

/**
 * Overriden method to throw error as `registerLoadBalancerTargets` is not supported for external
 * service.
 *
 * @param _targets 
 */
public inline fun ExternalService.registerLoadBalancerTargets(block: EcsTargetDsl.() -> Unit = {}) {
  val builder = EcsTargetDsl()
  builder.apply(block)
  return registerLoadBalancerTargets(builder.build())
}

/**
 * This method adds one or more container dependencies to the container.
 *
 * @param containerDependencies 
 */
public inline
    fun ContainerDefinition.addContainerDependencies(block: ContainerDependencyDsl.() -> Unit =
    {}) {
  val builder = ContainerDependencyDsl()
  builder.apply(block)
  return addContainerDependencies(builder.build())
}

/**
 * This method adds one or more mount points for data volumes to the container.
 *
 * @param mountPoints 
 */
public inline fun ContainerDefinition.addMountPoints(block: MountPointDsl.() -> Unit = {}) {
  val builder = MountPointDsl()
  builder.apply(block)
  return addMountPoints(builder.build())
}

/**
 * This method adds one or more port mappings to the container.
 *
 * @param portMappings 
 */
public inline fun ContainerDefinition.addPortMappings(block: PortMappingDsl.() -> Unit = {}) {
  val builder = PortMappingDsl()
  builder.apply(block)
  return addPortMappings(builder.build())
}

/**
 * This method mounts temporary disk space to the container.
 *
 * This adds the correct container mountPoint and task definition volume.
 *
 * @param scratch 
 */
public inline fun ContainerDefinition.addScratch(block: ScratchSpaceDsl.() -> Unit = {}) {
  val builder = ScratchSpaceDsl()
  builder.apply(block)
  return addScratch(builder.build())
}

/**
 * This method adds the specified statement to the IAM task execution policy in the task definition.
 *
 * @param statement 
 */
public inline fun ContainerDefinition.addToExecutionPolicy(block: PolicyStatementDsl.() -> Unit =
    {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToExecutionPolicy(builder.build())
}

/**
 * This method adds one or more ulimits to the container.
 *
 * @param ulimits 
 */
public inline fun ContainerDefinition.addUlimits(block: UlimitDsl.() -> Unit = {}) {
  val builder = UlimitDsl()
  builder.apply(block)
  return addUlimits(builder.build())
}

/**
 * This method adds one or more volumes to the container.
 *
 * @param volumesFrom 
 */
public inline fun ContainerDefinition.addVolumesFrom(block: VolumeFromDsl.() -> Unit = {}) {
  val builder = VolumeFromDsl()
  builder.apply(block)
  return addVolumesFrom(builder.build())
}

/**
 * Optional deployment parameters that control how many tasks run during the deployment and the
 * ordering of stopping and starting tasks.
 */
public inline
    fun CfnService.setDeploymentConfiguration(block: CfnServiceDeploymentConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceDeploymentConfigurationPropertyDsl()
  builder.apply(block)
  return setDeploymentConfiguration(builder.build())
}

/**
 * The deployment controller to use for the service.
 */
public inline
    fun CfnService.setDeploymentController(block: CfnServiceDeploymentControllerPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceDeploymentControllerPropertyDsl()
  builder.apply(block)
  return setDeploymentController(builder.build())
}

/**
 * The network configuration for the service.
 */
public inline
    fun CfnService.setNetworkConfiguration(block: CfnServiceNetworkConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceNetworkConfigurationPropertyDsl()
  builder.apply(block)
  return setNetworkConfiguration(builder.build())
}

/**
 * The configuration for this service to discover and connect to services, and be discovered by, and
 * connected from, other services within a namespace.
 */
public inline
    fun CfnService.setServiceConnectConfiguration(block: CfnServiceServiceConnectConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceServiceConnectConfigurationPropertyDsl()
  builder.apply(block)
  return setServiceConnectConfiguration(builder.build())
}

/**
 * This method adds an Auto Scaling Group Capacity Provider to a cluster.
 *
 * @param provider the capacity provider to add to this cluster. 
 * @param options
 */
public inline fun Cluster.addAsgCapacityProvider(provider: AsgCapacityProvider,
    block: AddAutoScalingGroupCapacityOptionsDsl.() -> Unit = {}) {
  val builder = AddAutoScalingGroupCapacityOptionsDsl()
  builder.apply(block)
  return addAsgCapacityProvider(provider, builder.build())
}

/**
 * It is highly recommended to use `Cluster.addAsgCapacityProvider` instead of this method.
 *
 * This method adds compute capacity to a cluster by creating an AutoScalingGroup with the specified
 * options.
 *
 * Returns the AutoScalingGroup so you can add autoscaling settings to it.
 *
 * @param id 
 * @param options 
 */
public inline fun Cluster.addCapacity(id: String, block: AddCapacityOptionsDsl.() -> Unit = {}):
    AutoScalingGroup {
  val builder = AddCapacityOptionsDsl()
  builder.apply(block)
  return addCapacity(id, builder.build())
}

/**
 * Add an AWS Cloud Map DNS namespace for this cluster.
 *
 * NOTE: HttpNamespaces are supported only for use cases involving Service Connect. For use cases
 * involving both Service-
 * Discovery and Service Connect, customers should manage the HttpNamespace outside of the
 * Cluster.addDefaultCloudMapNamespace method.
 *
 * @param options 
 */
public inline fun Cluster.addDefaultCloudMapNamespace(block: CloudMapNamespaceOptionsDsl.() -> Unit
    = {}): INamespace {
  val builder = CloudMapNamespaceOptionsDsl()
  builder.apply(block)
  return addDefaultCloudMapNamespace(builder.build())
}

/**
 * This method returns the specifed CloudWatch metric for this cluster.
 *
 * @param metricName 
 * @param props
 */
public inline fun Cluster.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

/**
 * This method returns the CloudWatch metric for this clusters CPU reservation.
 *
 * Default: average over 5 minutes
 *
 * @param props
 */
public inline fun Cluster.metricCpuReservation(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCpuReservation(builder.build())
}

/**
 * This method returns the CloudWatch metric for this clusters CPU utilization.
 *
 * Default: average over 5 minutes
 *
 * @param props
 */
public inline fun Cluster.metricCpuUtilization(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCpuUtilization(builder.build())
}

/**
 * This method returns the CloudWatch metric for this clusters memory reservation.
 *
 * Default: average over 5 minutes
 *
 * @param props
 */
public inline fun Cluster.metricMemoryReservation(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricMemoryReservation(builder.build())
}

/**
 * This method returns the CloudWatch metric for this clusters memory utilization.
 *
 * Default: average over 5 minutes
 *
 * @param props
 */
public inline fun Cluster.metricMemoryUtilization(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricMemoryUtilization(builder.build())
}

/**
 * The ephemeral storage settings to use for tasks run with the task definition.
 */
public inline
    fun CfnTaskDefinition.setEphemeralStorage(block: CfnTaskDefinitionEphemeralStoragePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTaskDefinitionEphemeralStoragePropertyDsl()
  builder.apply(block)
  return setEphemeralStorage(builder.build())
}

/**
 * The configuration details for the App Mesh proxy.
 */
public inline
    fun CfnTaskDefinition.setProxyConfiguration(block: CfnTaskDefinitionProxyConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTaskDefinitionProxyConfigurationPropertyDsl()
  builder.apply(block)
  return setProxyConfiguration(builder.build())
}

/**
 * The operating system that your tasks definitions run on.
 */
public inline
    fun CfnTaskDefinition.setRuntimePlatform(block: CfnTaskDefinitionRuntimePlatformPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTaskDefinitionRuntimePlatformPropertyDsl()
  builder.apply(block)
  return setRuntimePlatform(builder.build())
}

/**
 * Associates this service with a CloudMap service.
 *
 * @param options 
 */
public inline
    fun BaseService.associateCloudMapService(block: AssociateCloudMapServiceOptionsDsl.() -> Unit =
    {}) {
  val builder = AssociateCloudMapServiceOptionsDsl()
  builder.apply(block)
  return associateCloudMapService(builder.build())
}

/**
 * An attribute representing the minimum and maximum task count for an AutoScalingGroup.
 *
 * @param props 
 */
public inline fun BaseService.autoScaleTaskCount(block: EnableScalingPropsDsl.() -> Unit = {}):
    ScalableTaskCount {
  val builder = EnableScalingPropsDsl()
  builder.apply(block)
  return autoScaleTaskCount(builder.build())
}

/**
 * Enable CloudMap service discovery for the service.
 *
 * @return The created CloudMap service
 * @param options 
 */
public inline fun BaseService.enableCloudMap(block: CloudMapOptionsDsl.() -> Unit = {}): Service {
  val builder = CloudMapOptionsDsl()
  builder.apply(block)
  return enableCloudMap(builder.build())
}

/**
 * Enable Deployment Alarms which take advantage of arbitrary alarms and configure them after
 * service initialization.
 *
 * If you have already enabled deployment alarms, this function can be used to tell ECS about
 * additional alarms that
 * should interrupt a deployment.
 *
 * New alarms specified in subsequent calls of this function will be appended to the existing list
 * of alarms.
 *
 * The same Alarm Behavior must be used on all deployment alarms. If you specify different
 * AlarmBehavior values in
 * multiple calls to this function, or the Alarm Behavior used here doesn't match the one used in
 * the service
 * constructor, an error will be thrown.
 *
 * If the alarm's metric references the service, you cannot pass `Alarm.alarmName` here. That will
 * cause a circular
 * dependency between the service and its deployment alarm. See this package's README for options to
 * alarm on service
 * metrics, and avoid this circular dependency.
 *
 * @param alarmNames 
 * @param options
 */
public inline fun BaseService.enableDeploymentAlarms(alarmNames: List<String>,
    block: DeploymentAlarmOptionsDsl.() -> Unit = {}) {
  val builder = DeploymentAlarmOptionsDsl()
  builder.apply(block)
  return enableDeploymentAlarms(alarmNames, builder.build())
}

/**
 * Enable Service Connect on this service.
 *
 * @param config
 */
public inline fun BaseService.enableServiceConnect(block: ServiceConnectPropsDsl.() -> Unit = {}) {
  val builder = ServiceConnectPropsDsl()
  builder.apply(block)
  return enableServiceConnect(builder.build())
}

/**
 * Return a load balancing target for a specific container and port.
 *
 * Use this function to create a load balancer target if you want to load balance to
 * another container than the first essential container or the first mapped port on
 * the container.
 *
 * Use the return value of this function where you would normally use a load balancer
 * target, instead of the `Service` object itself.
 *
 * Example:
 *
 * ```
 * ApplicationListener listener;
 * BaseService service;
 * listener.addTargets("ECS", AddApplicationTargetsProps.builder()
 * .port(80)
 * .targets(List.of(service.loadBalancerTarget(LoadBalancerTargetOptions.builder()
 * .containerName("MyContainer")
 * .containerPort(1234)
 * .build())))
 * .build());
 * ```
 *
 * @param options 
 */
public inline fun BaseService.loadBalancerTarget(block: LoadBalancerTargetOptionsDsl.() -> Unit =
    {}): IEcsLoadBalancerTarget {
  val builder = LoadBalancerTargetOptionsDsl()
  builder.apply(block)
  return loadBalancerTarget(builder.build())
}

/**
 * This method returns the specified CloudWatch metric name for this service.
 *
 * @param metricName 
 * @param props
 */
public inline fun BaseService.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

/**
 * This method returns the CloudWatch metric for this service's CPU utilization.
 *
 * Default: average over 5 minutes
 *
 * @param props
 */
public inline fun BaseService.metricCpuUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCpuUtilization(builder.build())
}

/**
 * This method returns the CloudWatch metric for this service's memory utilization.
 *
 * Default: average over 5 minutes
 *
 * @param props
 */
public inline fun BaseService.metricMemoryUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricMemoryUtilization(builder.build())
}

/**
 * Use this function to create all load balancer targets to be registered in this service, add them
 * to target groups, and attach target groups to listeners accordingly.
 *
 * Alternatively, you can use `listener.addTargets()` to create targets and add them to target
 * groups.
 *
 * Example:
 *
 * ```
 * ApplicationListener listener;
 * BaseService service;
 * service.registerLoadBalancerTargets(EcsTarget.builder()
 * .containerName("web")
 * .containerPort(80)
 * .newTargetGroupId("ECS")
 * .listener(ListenerConfig.applicationListener(listener, AddApplicationTargetsProps.builder()
 * .protocol(ApplicationProtocol.HTTPS)
 * .build()))
 * .build());
 * ```
 *
 * @param targets 
 */
public inline fun BaseService.registerLoadBalancerTargets(block: EcsTargetDsl.() -> Unit = {}) {
  val builder = EcsTargetDsl()
  builder.apply(block)
  return registerLoadBalancerTargets(builder.build())
}

/**
 * Overriden method to throw error as interface accelerators are not supported for external tasks.
 *
 * @param _inferenceAccelerator 
 */
public inline
    fun ExternalTaskDefinition.addInferenceAccelerator(block: InferenceAcceleratorDsl.() -> Unit =
    {}) {
  val builder = InferenceAcceleratorDsl()
  builder.apply(block)
  return addInferenceAccelerator(builder.build())
}

/**
 * The Auto Scaling group settings for the capacity provider.
 */
public inline
    fun CfnCapacityProvider.setAutoScalingGroupProvider(block: CfnCapacityProviderAutoScalingGroupProviderPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCapacityProviderAutoScalingGroupProviderPropertyDsl()
  builder.apply(block)
  return setAutoScalingGroupProvider(builder.build())
}
