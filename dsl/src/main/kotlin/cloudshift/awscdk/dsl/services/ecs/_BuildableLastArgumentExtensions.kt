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

public inline fun TaskDefinition.addContainer(id: String,
    block: ContainerDefinitionOptionsDsl.() -> Unit = {}): ContainerDefinition {
  val builder = ContainerDefinitionOptionsDsl()
  builder.apply(block)
  return addContainer(id, builder.build())
}

public inline fun TaskDefinition.addFirelensLogRouter(id: String,
    block: FirelensLogRouterDefinitionOptionsDsl.() -> Unit = {}): FirelensLogRouter {
  val builder = FirelensLogRouterDefinitionOptionsDsl()
  builder.apply(block)
  return addFirelensLogRouter(id, builder.build())
}

public inline fun TaskDefinition.addInferenceAccelerator(block: InferenceAcceleratorDsl.() -> Unit =
    {}) {
  val builder = InferenceAcceleratorDsl()
  builder.apply(block)
  return addInferenceAccelerator(builder.build())
}

public inline fun TaskDefinition.addToExecutionRolePolicy(block: PolicyStatementDsl.() -> Unit =
    {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToExecutionRolePolicy(builder.build())
}

public inline fun TaskDefinition.addToTaskRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToTaskRolePolicy(builder.build())
}

public inline fun TaskDefinition.addVolume(block: VolumeDsl.() -> Unit = {}) {
  val builder = VolumeDsl()
  builder.apply(block)
  return addVolume(builder.build())
}

public inline
    fun CfnTaskSet.setNetworkConfiguration(block: CfnTaskSetNetworkConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTaskSetNetworkConfigurationPropertyDsl()
  builder.apply(block)
  return setNetworkConfiguration(builder.build())
}

public inline fun CfnTaskSet.setScale(block: CfnTaskSetScalePropertyDsl.() -> Unit = {}) {
  val builder = CfnTaskSetScalePropertyDsl()
  builder.apply(block)
  return setScale(builder.build())
}

public inline fun ScalableTaskCount.scaleOnCpuUtilization(id: String,
    block: CpuUtilizationScalingPropsDsl.() -> Unit = {}) {
  val builder = CpuUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnCpuUtilization(id, builder.build())
}

public inline fun ScalableTaskCount.scaleOnMemoryUtilization(id: String,
    block: MemoryUtilizationScalingPropsDsl.() -> Unit = {}) {
  val builder = MemoryUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnMemoryUtilization(id, builder.build())
}

public inline fun ScalableTaskCount.scaleOnMetric(id: String,
    block: BasicStepScalingPolicyPropsDsl.() -> Unit = {}) {
  val builder = BasicStepScalingPolicyPropsDsl()
  builder.apply(block)
  return scaleOnMetric(id, builder.build())
}

public inline fun ScalableTaskCount.scaleOnRequestCount(id: String,
    block: RequestCountScalingPropsDsl.() -> Unit = {}) {
  val builder = RequestCountScalingPropsDsl()
  builder.apply(block)
  return scaleOnRequestCount(id, builder.build())
}

public inline fun ScalableTaskCount.scaleOnSchedule(id: String, block: ScalingScheduleDsl.() -> Unit
    = {}) {
  val builder = ScalingScheduleDsl()
  builder.apply(block)
  return scaleOnSchedule(id, builder.build())
}

public inline fun ScalableTaskCount.scaleToTrackCustomMetric(id: String,
    block: TrackCustomMetricPropsDsl.() -> Unit = {}) {
  val builder = TrackCustomMetricPropsDsl()
  builder.apply(block)
  return scaleToTrackCustomMetric(id, builder.build())
}

public inline
    fun CfnCluster.setConfiguration(block: CfnClusterClusterConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterClusterConfigurationPropertyDsl()
  builder.apply(block)
  return setConfiguration(builder.build())
}

public inline
    fun CfnCluster.setServiceConnectDefaults(block: CfnClusterServiceConnectDefaultsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClusterServiceConnectDefaultsPropertyDsl()
  builder.apply(block)
  return setServiceConnectDefaults(builder.build())
}

public inline fun LinuxParameters.addDevices(block: DeviceDsl.() -> Unit = {}) {
  val builder = DeviceDsl()
  builder.apply(block)
  return addDevices(builder.build())
}

public inline fun LinuxParameters.addTmpfs(block: TmpfsDsl.() -> Unit = {}) {
  val builder = TmpfsDsl()
  builder.apply(block)
  return addTmpfs(builder.build())
}

public inline
    fun ExternalService.associateCloudMapService(block: AssociateCloudMapServiceOptionsDsl.() -> Unit
    = {}) {
  val builder = AssociateCloudMapServiceOptionsDsl()
  builder.apply(block)
  return associateCloudMapService(builder.build())
}

public inline fun ExternalService.autoScaleTaskCount(block: EnableScalingPropsDsl.() -> Unit = {}):
    ScalableTaskCount {
  val builder = EnableScalingPropsDsl()
  builder.apply(block)
  return autoScaleTaskCount(builder.build())
}

public inline fun ExternalService.enableCloudMap(block: CloudMapOptionsDsl.() -> Unit = {}):
    Service {
  val builder = CloudMapOptionsDsl()
  builder.apply(block)
  return enableCloudMap(builder.build())
}

public inline fun ExternalService.loadBalancerTarget(block: LoadBalancerTargetOptionsDsl.() -> Unit
    = {}): IEcsLoadBalancerTarget {
  val builder = LoadBalancerTargetOptionsDsl()
  builder.apply(block)
  return loadBalancerTarget(builder.build())
}

public inline fun ExternalService.registerLoadBalancerTargets(block: EcsTargetDsl.() -> Unit = {}) {
  val builder = EcsTargetDsl()
  builder.apply(block)
  return registerLoadBalancerTargets(builder.build())
}

public inline
    fun ContainerDefinition.addContainerDependencies(block: ContainerDependencyDsl.() -> Unit =
    {}) {
  val builder = ContainerDependencyDsl()
  builder.apply(block)
  return addContainerDependencies(builder.build())
}

public inline fun ContainerDefinition.addMountPoints(block: MountPointDsl.() -> Unit = {}) {
  val builder = MountPointDsl()
  builder.apply(block)
  return addMountPoints(builder.build())
}

public inline fun ContainerDefinition.addPortMappings(block: PortMappingDsl.() -> Unit = {}) {
  val builder = PortMappingDsl()
  builder.apply(block)
  return addPortMappings(builder.build())
}

public inline fun ContainerDefinition.addScratch(block: ScratchSpaceDsl.() -> Unit = {}) {
  val builder = ScratchSpaceDsl()
  builder.apply(block)
  return addScratch(builder.build())
}

public inline fun ContainerDefinition.addToExecutionPolicy(block: PolicyStatementDsl.() -> Unit =
    {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToExecutionPolicy(builder.build())
}

public inline fun ContainerDefinition.addUlimits(block: UlimitDsl.() -> Unit = {}) {
  val builder = UlimitDsl()
  builder.apply(block)
  return addUlimits(builder.build())
}

public inline fun ContainerDefinition.addVolumesFrom(block: VolumeFromDsl.() -> Unit = {}) {
  val builder = VolumeFromDsl()
  builder.apply(block)
  return addVolumesFrom(builder.build())
}

public inline
    fun CfnService.setDeploymentConfiguration(block: CfnServiceDeploymentConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceDeploymentConfigurationPropertyDsl()
  builder.apply(block)
  return setDeploymentConfiguration(builder.build())
}

public inline
    fun CfnService.setDeploymentController(block: CfnServiceDeploymentControllerPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceDeploymentControllerPropertyDsl()
  builder.apply(block)
  return setDeploymentController(builder.build())
}

public inline
    fun CfnService.setNetworkConfiguration(block: CfnServiceNetworkConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceNetworkConfigurationPropertyDsl()
  builder.apply(block)
  return setNetworkConfiguration(builder.build())
}

public inline
    fun CfnService.setServiceConnectConfiguration(block: CfnServiceServiceConnectConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceServiceConnectConfigurationPropertyDsl()
  builder.apply(block)
  return setServiceConnectConfiguration(builder.build())
}

public inline fun Cluster.addAsgCapacityProvider(provider: AsgCapacityProvider,
    block: AddAutoScalingGroupCapacityOptionsDsl.() -> Unit = {}) {
  val builder = AddAutoScalingGroupCapacityOptionsDsl()
  builder.apply(block)
  return addAsgCapacityProvider(provider, builder.build())
}

public inline fun Cluster.addCapacity(id: String, block: AddCapacityOptionsDsl.() -> Unit = {}):
    AutoScalingGroup {
  val builder = AddCapacityOptionsDsl()
  builder.apply(block)
  return addCapacity(id, builder.build())
}

public inline fun Cluster.addDefaultCloudMapNamespace(block: CloudMapNamespaceOptionsDsl.() -> Unit
    = {}): INamespace {
  val builder = CloudMapNamespaceOptionsDsl()
  builder.apply(block)
  return addDefaultCloudMapNamespace(builder.build())
}

public inline fun Cluster.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun Cluster.metricCpuReservation(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCpuReservation(builder.build())
}

public inline fun Cluster.metricCpuUtilization(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCpuUtilization(builder.build())
}

public inline fun Cluster.metricMemoryReservation(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricMemoryReservation(builder.build())
}

public inline fun Cluster.metricMemoryUtilization(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricMemoryUtilization(builder.build())
}

public inline
    fun CfnTaskDefinition.setEphemeralStorage(block: CfnTaskDefinitionEphemeralStoragePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTaskDefinitionEphemeralStoragePropertyDsl()
  builder.apply(block)
  return setEphemeralStorage(builder.build())
}

public inline
    fun CfnTaskDefinition.setProxyConfiguration(block: CfnTaskDefinitionProxyConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTaskDefinitionProxyConfigurationPropertyDsl()
  builder.apply(block)
  return setProxyConfiguration(builder.build())
}

public inline
    fun CfnTaskDefinition.setRuntimePlatform(block: CfnTaskDefinitionRuntimePlatformPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTaskDefinitionRuntimePlatformPropertyDsl()
  builder.apply(block)
  return setRuntimePlatform(builder.build())
}

public inline
    fun BaseService.associateCloudMapService(block: AssociateCloudMapServiceOptionsDsl.() -> Unit =
    {}) {
  val builder = AssociateCloudMapServiceOptionsDsl()
  builder.apply(block)
  return associateCloudMapService(builder.build())
}

public inline fun BaseService.autoScaleTaskCount(block: EnableScalingPropsDsl.() -> Unit = {}):
    ScalableTaskCount {
  val builder = EnableScalingPropsDsl()
  builder.apply(block)
  return autoScaleTaskCount(builder.build())
}

public inline fun BaseService.enableCloudMap(block: CloudMapOptionsDsl.() -> Unit = {}): Service {
  val builder = CloudMapOptionsDsl()
  builder.apply(block)
  return enableCloudMap(builder.build())
}

public inline fun BaseService.enableDeploymentAlarms(alarmNames: List<String>,
    block: DeploymentAlarmOptionsDsl.() -> Unit = {}) {
  val builder = DeploymentAlarmOptionsDsl()
  builder.apply(block)
  return enableDeploymentAlarms(alarmNames, builder.build())
}

public inline fun BaseService.enableServiceConnect(block: ServiceConnectPropsDsl.() -> Unit = {}) {
  val builder = ServiceConnectPropsDsl()
  builder.apply(block)
  return enableServiceConnect(builder.build())
}

public inline fun BaseService.loadBalancerTarget(block: LoadBalancerTargetOptionsDsl.() -> Unit =
    {}): IEcsLoadBalancerTarget {
  val builder = LoadBalancerTargetOptionsDsl()
  builder.apply(block)
  return loadBalancerTarget(builder.build())
}

public inline fun BaseService.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun BaseService.metricCpuUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCpuUtilization(builder.build())
}

public inline fun BaseService.metricMemoryUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricMemoryUtilization(builder.build())
}

public inline fun BaseService.registerLoadBalancerTargets(block: EcsTargetDsl.() -> Unit = {}) {
  val builder = EcsTargetDsl()
  builder.apply(block)
  return registerLoadBalancerTargets(builder.build())
}

public inline
    fun ExternalTaskDefinition.addInferenceAccelerator(block: InferenceAcceleratorDsl.() -> Unit =
    {}) {
  val builder = InferenceAcceleratorDsl()
  builder.apply(block)
  return addInferenceAccelerator(builder.build())
}

public inline
    fun CfnCapacityProvider.setAutoScalingGroupProvider(block: CfnCapacityProviderAutoScalingGroupProviderPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCapacityProviderAutoScalingGroupProviderPropertyDsl()
  builder.apply(block)
  return setAutoScalingGroupProvider(builder.build())
}
