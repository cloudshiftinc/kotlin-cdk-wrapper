@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps
import software.amazon.awscdk.services.batch.CfnJobDefinition
import software.amazon.awscdk.services.batch.CfnJobDefinitionProps
import software.amazon.awscdk.services.batch.CfnJobQueue
import software.amazon.awscdk.services.batch.CfnJobQueueProps
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy
import software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps
import software.constructs.Construct

public object batch {
  public inline fun cfnComputeEnvironment(
    scope: Construct,
    id: String,
    block: CfnComputeEnvironmentDsl.() -> Unit = {},
  ): CfnComputeEnvironment {
    val builder = CfnComputeEnvironmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComputeEnvironmentComputeResourcesProperty(block: CfnComputeEnvironmentComputeResourcesPropertyDsl.() -> Unit
      = {}): CfnComputeEnvironment.ComputeResourcesProperty {
    val builder = CfnComputeEnvironmentComputeResourcesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComputeEnvironmentEc2ConfigurationObjectProperty(block: CfnComputeEnvironmentEc2ConfigurationObjectPropertyDsl.() -> Unit
      = {}): CfnComputeEnvironment.Ec2ConfigurationObjectProperty {
    val builder = CfnComputeEnvironmentEc2ConfigurationObjectPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComputeEnvironmentEksConfigurationProperty(block: CfnComputeEnvironmentEksConfigurationPropertyDsl.() -> Unit
      = {}): CfnComputeEnvironment.EksConfigurationProperty {
    val builder = CfnComputeEnvironmentEksConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComputeEnvironmentLaunchTemplateSpecificationProperty(block: CfnComputeEnvironmentLaunchTemplateSpecificationPropertyDsl.() -> Unit
      = {}): CfnComputeEnvironment.LaunchTemplateSpecificationProperty {
    val builder = CfnComputeEnvironmentLaunchTemplateSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnComputeEnvironmentProps(block: CfnComputeEnvironmentPropsDsl.() -> Unit =
      {}): CfnComputeEnvironmentProps {
    val builder = CfnComputeEnvironmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComputeEnvironmentUpdatePolicyProperty(block: CfnComputeEnvironmentUpdatePolicyPropertyDsl.() -> Unit
      = {}): CfnComputeEnvironment.UpdatePolicyProperty {
    val builder = CfnComputeEnvironmentUpdatePolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnJobDefinition(
    scope: Construct,
    id: String,
    block: CfnJobDefinitionDsl.() -> Unit = {},
  ): CfnJobDefinition {
    val builder = CfnJobDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionAuthorizationConfigProperty(block: CfnJobDefinitionAuthorizationConfigPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.AuthorizationConfigProperty {
    val builder = CfnJobDefinitionAuthorizationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionContainerPropertiesProperty(block: CfnJobDefinitionContainerPropertiesPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.ContainerPropertiesProperty {
    val builder = CfnJobDefinitionContainerPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionDeviceProperty(block: CfnJobDefinitionDevicePropertyDsl.() -> Unit = {}):
      CfnJobDefinition.DeviceProperty {
    val builder = CfnJobDefinitionDevicePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionEfsVolumeConfigurationProperty(block: CfnJobDefinitionEfsVolumeConfigurationPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.EfsVolumeConfigurationProperty {
    val builder = CfnJobDefinitionEfsVolumeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionEksContainerEnvironmentVariableProperty(block: CfnJobDefinitionEksContainerEnvironmentVariablePropertyDsl.() -> Unit
      = {}): CfnJobDefinition.EksContainerEnvironmentVariableProperty {
    val builder = CfnJobDefinitionEksContainerEnvironmentVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionEksContainerProperty(block: CfnJobDefinitionEksContainerPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.EksContainerProperty {
    val builder = CfnJobDefinitionEksContainerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionEksContainerVolumeMountProperty(block: CfnJobDefinitionEksContainerVolumeMountPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.EksContainerVolumeMountProperty {
    val builder = CfnJobDefinitionEksContainerVolumeMountPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionEksPropertiesProperty(block: CfnJobDefinitionEksPropertiesPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.EksPropertiesProperty {
    val builder = CfnJobDefinitionEksPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionEksSecretProperty(block: CfnJobDefinitionEksSecretPropertyDsl.() -> Unit =
      {}): CfnJobDefinition.EksSecretProperty {
    val builder = CfnJobDefinitionEksSecretPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionEksVolumeProperty(block: CfnJobDefinitionEksVolumePropertyDsl.() -> Unit =
      {}): CfnJobDefinition.EksVolumeProperty {
    val builder = CfnJobDefinitionEksVolumePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionEmptyDirProperty(block: CfnJobDefinitionEmptyDirPropertyDsl.() -> Unit =
      {}): CfnJobDefinition.EmptyDirProperty {
    val builder = CfnJobDefinitionEmptyDirPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionEnvironmentProperty(block: CfnJobDefinitionEnvironmentPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.EnvironmentProperty {
    val builder = CfnJobDefinitionEnvironmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionEphemeralStorageProperty(block: CfnJobDefinitionEphemeralStoragePropertyDsl.() -> Unit
      = {}): CfnJobDefinition.EphemeralStorageProperty {
    val builder = CfnJobDefinitionEphemeralStoragePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionEvaluateOnExitProperty(block: CfnJobDefinitionEvaluateOnExitPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.EvaluateOnExitProperty {
    val builder = CfnJobDefinitionEvaluateOnExitPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionFargatePlatformConfigurationProperty(block: CfnJobDefinitionFargatePlatformConfigurationPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.FargatePlatformConfigurationProperty {
    val builder = CfnJobDefinitionFargatePlatformConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionHostPathProperty(block: CfnJobDefinitionHostPathPropertyDsl.() -> Unit =
      {}): CfnJobDefinition.HostPathProperty {
    val builder = CfnJobDefinitionHostPathPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionLinuxParametersProperty(block: CfnJobDefinitionLinuxParametersPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.LinuxParametersProperty {
    val builder = CfnJobDefinitionLinuxParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionLogConfigurationProperty(block: CfnJobDefinitionLogConfigurationPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.LogConfigurationProperty {
    val builder = CfnJobDefinitionLogConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionMetadataProperty(block: CfnJobDefinitionMetadataPropertyDsl.() -> Unit =
      {}): CfnJobDefinition.MetadataProperty {
    val builder = CfnJobDefinitionMetadataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionMountPointsProperty(block: CfnJobDefinitionMountPointsPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.MountPointsProperty {
    val builder = CfnJobDefinitionMountPointsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionNetworkConfigurationProperty(block: CfnJobDefinitionNetworkConfigurationPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.NetworkConfigurationProperty {
    val builder = CfnJobDefinitionNetworkConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionNodePropertiesProperty(block: CfnJobDefinitionNodePropertiesPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.NodePropertiesProperty {
    val builder = CfnJobDefinitionNodePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionNodeRangePropertyProperty(block: CfnJobDefinitionNodeRangePropertyPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.NodeRangePropertyProperty {
    val builder = CfnJobDefinitionNodeRangePropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionPodPropertiesProperty(block: CfnJobDefinitionPodPropertiesPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.PodPropertiesProperty {
    val builder = CfnJobDefinitionPodPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnJobDefinitionProps(block: CfnJobDefinitionPropsDsl.() -> Unit = {}):
      CfnJobDefinitionProps {
    val builder = CfnJobDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionResourceRequirementProperty(block: CfnJobDefinitionResourceRequirementPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.ResourceRequirementProperty {
    val builder = CfnJobDefinitionResourceRequirementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionResourcesProperty(block: CfnJobDefinitionResourcesPropertyDsl.() -> Unit =
      {}): CfnJobDefinition.ResourcesProperty {
    val builder = CfnJobDefinitionResourcesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionRetryStrategyProperty(block: CfnJobDefinitionRetryStrategyPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.RetryStrategyProperty {
    val builder = CfnJobDefinitionRetryStrategyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionSecretProperty(block: CfnJobDefinitionSecretPropertyDsl.() -> Unit = {}):
      CfnJobDefinition.SecretProperty {
    val builder = CfnJobDefinitionSecretPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionSecurityContextProperty(block: CfnJobDefinitionSecurityContextPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.SecurityContextProperty {
    val builder = CfnJobDefinitionSecurityContextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionTimeoutProperty(block: CfnJobDefinitionTimeoutPropertyDsl.() -> Unit =
      {}): CfnJobDefinition.TimeoutProperty {
    val builder = CfnJobDefinitionTimeoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnJobDefinitionTmpfsProperty(block: CfnJobDefinitionTmpfsPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.TmpfsProperty {
    val builder = CfnJobDefinitionTmpfsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionUlimitProperty(block: CfnJobDefinitionUlimitPropertyDsl.() -> Unit = {}):
      CfnJobDefinition.UlimitProperty {
    val builder = CfnJobDefinitionUlimitPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionVolumesHostProperty(block: CfnJobDefinitionVolumesHostPropertyDsl.() -> Unit
      = {}): CfnJobDefinition.VolumesHostProperty {
    val builder = CfnJobDefinitionVolumesHostPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobDefinitionVolumesProperty(block: CfnJobDefinitionVolumesPropertyDsl.() -> Unit =
      {}): CfnJobDefinition.VolumesProperty {
    val builder = CfnJobDefinitionVolumesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnJobQueue(
    scope: Construct,
    id: String,
    block: CfnJobQueueDsl.() -> Unit = {},
  ): CfnJobQueue {
    val builder = CfnJobQueueDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnJobQueueComputeEnvironmentOrderProperty(block: CfnJobQueueComputeEnvironmentOrderPropertyDsl.() -> Unit
      = {}): CfnJobQueue.ComputeEnvironmentOrderProperty {
    val builder = CfnJobQueueComputeEnvironmentOrderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnJobQueueProps(block: CfnJobQueuePropsDsl.() -> Unit = {}): CfnJobQueueProps {
    val builder = CfnJobQueuePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSchedulingPolicy(
    scope: Construct,
    id: String,
    block: CfnSchedulingPolicyDsl.() -> Unit = {},
  ): CfnSchedulingPolicy {
    val builder = CfnSchedulingPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSchedulingPolicyFairsharePolicyProperty(block: CfnSchedulingPolicyFairsharePolicyPropertyDsl.() -> Unit
      = {}): CfnSchedulingPolicy.FairsharePolicyProperty {
    val builder = CfnSchedulingPolicyFairsharePolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSchedulingPolicyProps(block: CfnSchedulingPolicyPropsDsl.() -> Unit = {}):
      CfnSchedulingPolicyProps {
    val builder = CfnSchedulingPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSchedulingPolicyShareAttributesProperty(block: CfnSchedulingPolicyShareAttributesPropertyDsl.() -> Unit
      = {}): CfnSchedulingPolicy.ShareAttributesProperty {
    val builder = CfnSchedulingPolicyShareAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
