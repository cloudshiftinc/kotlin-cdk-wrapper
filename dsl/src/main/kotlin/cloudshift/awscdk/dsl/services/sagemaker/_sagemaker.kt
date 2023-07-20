@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnApp
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps
import software.amazon.awscdk.services.sagemaker.CfnAppProps
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository
import software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps
import software.amazon.awscdk.services.sagemaker.CfnDevice
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleet
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps
import software.amazon.awscdk.services.sagemaker.CfnDeviceProps
import software.amazon.awscdk.services.sagemaker.CfnDomain
import software.amazon.awscdk.services.sagemaker.CfnDomainProps
import software.amazon.awscdk.services.sagemaker.CfnEndpoint
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps
import software.amazon.awscdk.services.sagemaker.CfnEndpointProps
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps
import software.amazon.awscdk.services.sagemaker.CfnImage
import software.amazon.awscdk.services.sagemaker.CfnImageProps
import software.amazon.awscdk.services.sagemaker.CfnImageVersion
import software.amazon.awscdk.services.sagemaker.CfnImageVersionProps
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps
import software.amazon.awscdk.services.sagemaker.CfnModel
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import software.amazon.awscdk.services.sagemaker.CfnModelCardProps
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps
import software.amazon.awscdk.services.sagemaker.CfnModelPackageProps
import software.amazon.awscdk.services.sagemaker.CfnModelProps
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstance
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps
import software.amazon.awscdk.services.sagemaker.CfnPipeline
import software.amazon.awscdk.services.sagemaker.CfnPipelineProps
import software.amazon.awscdk.services.sagemaker.CfnProject
import software.amazon.awscdk.services.sagemaker.CfnProjectProps
import software.amazon.awscdk.services.sagemaker.CfnSpace
import software.amazon.awscdk.services.sagemaker.CfnSpaceProps
import software.amazon.awscdk.services.sagemaker.CfnUserProfile
import software.amazon.awscdk.services.sagemaker.CfnUserProfileProps
import software.amazon.awscdk.services.sagemaker.CfnWorkteam
import software.amazon.awscdk.services.sagemaker.CfnWorkteamProps
import software.constructs.Construct

public object sagemaker {
  public inline fun cfnApp(
    scope: Construct,
    id: String,
    block: CfnAppDsl.() -> Unit = {},
  ): CfnApp {
    val builder = CfnAppDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAppImageConfig(
    scope: Construct,
    id: String,
    block: CfnAppImageConfigDsl.() -> Unit = {},
  ): CfnAppImageConfig {
    val builder = CfnAppImageConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAppImageConfigFileSystemConfigProperty(block: CfnAppImageConfigFileSystemConfigPropertyDsl.() -> Unit
      = {}): CfnAppImageConfig.FileSystemConfigProperty {
    val builder = CfnAppImageConfigFileSystemConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAppImageConfigKernelGatewayImageConfigProperty(block: CfnAppImageConfigKernelGatewayImageConfigPropertyDsl.() -> Unit
      = {}): CfnAppImageConfig.KernelGatewayImageConfigProperty {
    val builder = CfnAppImageConfigKernelGatewayImageConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAppImageConfigKernelSpecProperty(block: CfnAppImageConfigKernelSpecPropertyDsl.() -> Unit
      = {}): CfnAppImageConfig.KernelSpecProperty {
    val builder = CfnAppImageConfigKernelSpecPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAppImageConfigProps(block: CfnAppImageConfigPropsDsl.() -> Unit = {}):
      CfnAppImageConfigProps {
    val builder = CfnAppImageConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAppProps(block: CfnAppPropsDsl.() -> Unit = {}): CfnAppProps {
    val builder = CfnAppPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAppResourceSpecProperty(block: CfnAppResourceSpecPropertyDsl.() -> Unit =
      {}): CfnApp.ResourceSpecProperty {
    val builder = CfnAppResourceSpecPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCodeRepository(
    scope: Construct,
    id: String,
    block: CfnCodeRepositoryDsl.() -> Unit = {},
  ): CfnCodeRepository {
    val builder = CfnCodeRepositoryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCodeRepositoryGitConfigProperty(block: CfnCodeRepositoryGitConfigPropertyDsl.() -> Unit
      = {}): CfnCodeRepository.GitConfigProperty {
    val builder = CfnCodeRepositoryGitConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCodeRepositoryProps(block: CfnCodeRepositoryPropsDsl.() -> Unit = {}):
      CfnCodeRepositoryProps {
    val builder = CfnCodeRepositoryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataQualityJobDefinition(
    scope: Construct,
    id: String,
    block: CfnDataQualityJobDefinitionDsl.() -> Unit = {},
  ): CfnDataQualityJobDefinition {
    val builder = CfnDataQualityJobDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionBatchTransformInputProperty(block: CfnDataQualityJobDefinitionBatchTransformInputPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.BatchTransformInputProperty {
    val builder = CfnDataQualityJobDefinitionBatchTransformInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionClusterConfigProperty(block: CfnDataQualityJobDefinitionClusterConfigPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.ClusterConfigProperty {
    val builder = CfnDataQualityJobDefinitionClusterConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionConstraintsResourceProperty(block: CfnDataQualityJobDefinitionConstraintsResourcePropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.ConstraintsResourceProperty {
    val builder = CfnDataQualityJobDefinitionConstraintsResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionCsvProperty(block: CfnDataQualityJobDefinitionCsvPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.CsvProperty {
    val builder = CfnDataQualityJobDefinitionCsvPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionDataQualityAppSpecificationProperty(block: CfnDataQualityJobDefinitionDataQualityAppSpecificationPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty {
    val builder = CfnDataQualityJobDefinitionDataQualityAppSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionDataQualityBaselineConfigProperty(block: CfnDataQualityJobDefinitionDataQualityBaselineConfigPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty {
    val builder = CfnDataQualityJobDefinitionDataQualityBaselineConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionDataQualityJobInputProperty(block: CfnDataQualityJobDefinitionDataQualityJobInputPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.DataQualityJobInputProperty {
    val builder = CfnDataQualityJobDefinitionDataQualityJobInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionDatasetFormatProperty(block: CfnDataQualityJobDefinitionDatasetFormatPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.DatasetFormatProperty {
    val builder = CfnDataQualityJobDefinitionDatasetFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionEndpointInputProperty(block: CfnDataQualityJobDefinitionEndpointInputPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.EndpointInputProperty {
    val builder = CfnDataQualityJobDefinitionEndpointInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionJsonProperty(block: CfnDataQualityJobDefinitionJsonPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.JsonProperty {
    val builder = CfnDataQualityJobDefinitionJsonPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionMonitoringOutputConfigProperty(block: CfnDataQualityJobDefinitionMonitoringOutputConfigPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.MonitoringOutputConfigProperty {
    val builder = CfnDataQualityJobDefinitionMonitoringOutputConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionMonitoringOutputProperty(block: CfnDataQualityJobDefinitionMonitoringOutputPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.MonitoringOutputProperty {
    val builder = CfnDataQualityJobDefinitionMonitoringOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionMonitoringResourcesProperty(block: CfnDataQualityJobDefinitionMonitoringResourcesPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.MonitoringResourcesProperty {
    val builder = CfnDataQualityJobDefinitionMonitoringResourcesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionNetworkConfigProperty(block: CfnDataQualityJobDefinitionNetworkConfigPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.NetworkConfigProperty {
    val builder = CfnDataQualityJobDefinitionNetworkConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionProps(block: CfnDataQualityJobDefinitionPropsDsl.() -> Unit =
      {}): CfnDataQualityJobDefinitionProps {
    val builder = CfnDataQualityJobDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionS3OutputProperty(block: CfnDataQualityJobDefinitionS3OutputPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.S3OutputProperty {
    val builder = CfnDataQualityJobDefinitionS3OutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionStatisticsResourceProperty(block: CfnDataQualityJobDefinitionStatisticsResourcePropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.StatisticsResourceProperty {
    val builder = CfnDataQualityJobDefinitionStatisticsResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionStoppingConditionProperty(block: CfnDataQualityJobDefinitionStoppingConditionPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.StoppingConditionProperty {
    val builder = CfnDataQualityJobDefinitionStoppingConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataQualityJobDefinitionVpcConfigProperty(block: CfnDataQualityJobDefinitionVpcConfigPropertyDsl.() -> Unit
      = {}): CfnDataQualityJobDefinition.VpcConfigProperty {
    val builder = CfnDataQualityJobDefinitionVpcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDevice(
    scope: Construct,
    id: String,
    block: CfnDeviceDsl.() -> Unit = {},
  ): CfnDevice {
    val builder = CfnDeviceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeviceDeviceProperty(block: CfnDeviceDevicePropertyDsl.() -> Unit = {}):
      CfnDevice.DeviceProperty {
    val builder = CfnDeviceDevicePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeviceFleet(
    scope: Construct,
    id: String,
    block: CfnDeviceFleetDsl.() -> Unit = {},
  ): CfnDeviceFleet {
    val builder = CfnDeviceFleetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeviceFleetEdgeOutputConfigProperty(block: CfnDeviceFleetEdgeOutputConfigPropertyDsl.() -> Unit
      = {}): CfnDeviceFleet.EdgeOutputConfigProperty {
    val builder = CfnDeviceFleetEdgeOutputConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeviceFleetProps(block: CfnDeviceFleetPropsDsl.() -> Unit = {}):
      CfnDeviceFleetProps {
    val builder = CfnDeviceFleetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeviceProps(block: CfnDevicePropsDsl.() -> Unit = {}): CfnDeviceProps {
    val builder = CfnDevicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomain(
    scope: Construct,
    id: String,
    block: CfnDomainDsl.() -> Unit = {},
  ): CfnDomain {
    val builder = CfnDomainDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainCustomImageProperty(block: CfnDomainCustomImagePropertyDsl.() -> Unit =
      {}): CfnDomain.CustomImageProperty {
    val builder = CfnDomainCustomImagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainDefaultSpaceSettingsProperty(block: CfnDomainDefaultSpaceSettingsPropertyDsl.() -> Unit
      = {}): CfnDomain.DefaultSpaceSettingsProperty {
    val builder = CfnDomainDefaultSpaceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainDomainSettingsProperty(block: CfnDomainDomainSettingsPropertyDsl.() -> Unit =
      {}): CfnDomain.DomainSettingsProperty {
    val builder = CfnDomainDomainSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainJupyterServerAppSettingsProperty(block: CfnDomainJupyterServerAppSettingsPropertyDsl.() -> Unit
      = {}): CfnDomain.JupyterServerAppSettingsProperty {
    val builder = CfnDomainJupyterServerAppSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainKernelGatewayAppSettingsProperty(block: CfnDomainKernelGatewayAppSettingsPropertyDsl.() -> Unit
      = {}): CfnDomain.KernelGatewayAppSettingsProperty {
    val builder = CfnDomainKernelGatewayAppSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
    val builder = CfnDomainPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainRSessionAppSettingsProperty(block: CfnDomainRSessionAppSettingsPropertyDsl.() -> Unit
      = {}): CfnDomain.RSessionAppSettingsProperty {
    val builder = CfnDomainRSessionAppSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainRStudioServerProAppSettingsProperty(block: CfnDomainRStudioServerProAppSettingsPropertyDsl.() -> Unit
      = {}): CfnDomain.RStudioServerProAppSettingsProperty {
    val builder = CfnDomainRStudioServerProAppSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainRStudioServerProDomainSettingsProperty(block: CfnDomainRStudioServerProDomainSettingsPropertyDsl.() -> Unit
      = {}): CfnDomain.RStudioServerProDomainSettingsProperty {
    val builder = CfnDomainRStudioServerProDomainSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainResourceSpecProperty(block: CfnDomainResourceSpecPropertyDsl.() -> Unit
      = {}): CfnDomain.ResourceSpecProperty {
    val builder = CfnDomainResourceSpecPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainSharingSettingsProperty(block: CfnDomainSharingSettingsPropertyDsl.() -> Unit =
      {}): CfnDomain.SharingSettingsProperty {
    val builder = CfnDomainSharingSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainUserSettingsProperty(block: CfnDomainUserSettingsPropertyDsl.() -> Unit
      = {}): CfnDomain.UserSettingsProperty {
    val builder = CfnDomainUserSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpoint(
    scope: Construct,
    id: String,
    block: CfnEndpointDsl.() -> Unit = {},
  ): CfnEndpoint {
    val builder = CfnEndpointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpointAlarmProperty(block: CfnEndpointAlarmPropertyDsl.() -> Unit = {}):
      CfnEndpoint.AlarmProperty {
    val builder = CfnEndpointAlarmPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointAutoRollbackConfigProperty(block: CfnEndpointAutoRollbackConfigPropertyDsl.() -> Unit
      = {}): CfnEndpoint.AutoRollbackConfigProperty {
    val builder = CfnEndpointAutoRollbackConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointBlueGreenUpdatePolicyProperty(block: CfnEndpointBlueGreenUpdatePolicyPropertyDsl.() -> Unit
      = {}): CfnEndpoint.BlueGreenUpdatePolicyProperty {
    val builder = CfnEndpointBlueGreenUpdatePolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointCapacitySizeProperty(block: CfnEndpointCapacitySizePropertyDsl.() -> Unit =
      {}): CfnEndpoint.CapacitySizeProperty {
    val builder = CfnEndpointCapacitySizePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpointConfig(
    scope: Construct,
    id: String,
    block: CfnEndpointConfigDsl.() -> Unit = {},
  ): CfnEndpointConfig {
    val builder = CfnEndpointConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigAsyncInferenceClientConfigProperty(block: CfnEndpointConfigAsyncInferenceClientConfigPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.AsyncInferenceClientConfigProperty {
    val builder = CfnEndpointConfigAsyncInferenceClientConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigAsyncInferenceConfigProperty(block: CfnEndpointConfigAsyncInferenceConfigPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.AsyncInferenceConfigProperty {
    val builder = CfnEndpointConfigAsyncInferenceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigAsyncInferenceNotificationConfigProperty(block: CfnEndpointConfigAsyncInferenceNotificationConfigPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.AsyncInferenceNotificationConfigProperty {
    val builder = CfnEndpointConfigAsyncInferenceNotificationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigAsyncInferenceOutputConfigProperty(block: CfnEndpointConfigAsyncInferenceOutputConfigPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.AsyncInferenceOutputConfigProperty {
    val builder = CfnEndpointConfigAsyncInferenceOutputConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigCaptureContentTypeHeaderProperty(block: CfnEndpointConfigCaptureContentTypeHeaderPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.CaptureContentTypeHeaderProperty {
    val builder = CfnEndpointConfigCaptureContentTypeHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigCaptureOptionProperty(block: CfnEndpointConfigCaptureOptionPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.CaptureOptionProperty {
    val builder = CfnEndpointConfigCaptureOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigClarifyExplainerConfigProperty(block: CfnEndpointConfigClarifyExplainerConfigPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.ClarifyExplainerConfigProperty {
    val builder = CfnEndpointConfigClarifyExplainerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigClarifyInferenceConfigProperty(block: CfnEndpointConfigClarifyInferenceConfigPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.ClarifyInferenceConfigProperty {
    val builder = CfnEndpointConfigClarifyInferenceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigClarifyShapBaselineConfigProperty(block: CfnEndpointConfigClarifyShapBaselineConfigPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.ClarifyShapBaselineConfigProperty {
    val builder = CfnEndpointConfigClarifyShapBaselineConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigClarifyShapConfigProperty(block: CfnEndpointConfigClarifyShapConfigPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.ClarifyShapConfigProperty {
    val builder = CfnEndpointConfigClarifyShapConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigClarifyTextConfigProperty(block: CfnEndpointConfigClarifyTextConfigPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.ClarifyTextConfigProperty {
    val builder = CfnEndpointConfigClarifyTextConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigDataCaptureConfigProperty(block: CfnEndpointConfigDataCaptureConfigPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.DataCaptureConfigProperty {
    val builder = CfnEndpointConfigDataCaptureConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigExplainerConfigProperty(block: CfnEndpointConfigExplainerConfigPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.ExplainerConfigProperty {
    val builder = CfnEndpointConfigExplainerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigProductionVariantProperty(block: CfnEndpointConfigProductionVariantPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.ProductionVariantProperty {
    val builder = CfnEndpointConfigProductionVariantPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpointConfigProps(block: CfnEndpointConfigPropsDsl.() -> Unit = {}):
      CfnEndpointConfigProps {
    val builder = CfnEndpointConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointConfigServerlessConfigProperty(block: CfnEndpointConfigServerlessConfigPropertyDsl.() -> Unit
      = {}): CfnEndpointConfig.ServerlessConfigProperty {
    val builder = CfnEndpointConfigServerlessConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointDeploymentConfigProperty(block: CfnEndpointDeploymentConfigPropertyDsl.() -> Unit
      = {}): CfnEndpoint.DeploymentConfigProperty {
    val builder = CfnEndpointDeploymentConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpointProps(block: CfnEndpointPropsDsl.() -> Unit = {}): CfnEndpointProps {
    val builder = CfnEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointTrafficRoutingConfigProperty(block: CfnEndpointTrafficRoutingConfigPropertyDsl.() -> Unit
      = {}): CfnEndpoint.TrafficRoutingConfigProperty {
    val builder = CfnEndpointTrafficRoutingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointVariantPropertyProperty(block: CfnEndpointVariantPropertyPropertyDsl.() -> Unit
      = {}): CfnEndpoint.VariantPropertyProperty {
    val builder = CfnEndpointVariantPropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFeatureGroup(
    scope: Construct,
    id: String,
    block: CfnFeatureGroupDsl.() -> Unit = {},
  ): CfnFeatureGroup {
    val builder = CfnFeatureGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFeatureGroupDataCatalogConfigProperty(block: CfnFeatureGroupDataCatalogConfigPropertyDsl.() -> Unit
      = {}): CfnFeatureGroup.DataCatalogConfigProperty {
    val builder = CfnFeatureGroupDataCatalogConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFeatureGroupFeatureDefinitionProperty(block: CfnFeatureGroupFeatureDefinitionPropertyDsl.() -> Unit
      = {}): CfnFeatureGroup.FeatureDefinitionProperty {
    val builder = CfnFeatureGroupFeatureDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFeatureGroupOfflineStoreConfigProperty(block: CfnFeatureGroupOfflineStoreConfigPropertyDsl.() -> Unit
      = {}): CfnFeatureGroup.OfflineStoreConfigProperty {
    val builder = CfnFeatureGroupOfflineStoreConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFeatureGroupOnlineStoreConfigProperty(block: CfnFeatureGroupOnlineStoreConfigPropertyDsl.() -> Unit
      = {}): CfnFeatureGroup.OnlineStoreConfigProperty {
    val builder = CfnFeatureGroupOnlineStoreConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFeatureGroupOnlineStoreSecurityConfigProperty(block: CfnFeatureGroupOnlineStoreSecurityConfigPropertyDsl.() -> Unit
      = {}): CfnFeatureGroup.OnlineStoreSecurityConfigProperty {
    val builder = CfnFeatureGroupOnlineStoreSecurityConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFeatureGroupProps(block: CfnFeatureGroupPropsDsl.() -> Unit = {}):
      CfnFeatureGroupProps {
    val builder = CfnFeatureGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFeatureGroupS3StorageConfigProperty(block: CfnFeatureGroupS3StorageConfigPropertyDsl.() -> Unit
      = {}): CfnFeatureGroup.S3StorageConfigProperty {
    val builder = CfnFeatureGroupS3StorageConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnImage(
    scope: Construct,
    id: String,
    block: CfnImageDsl.() -> Unit = {},
  ): CfnImage {
    val builder = CfnImageDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnImageProps(block: CfnImagePropsDsl.() -> Unit = {}): CfnImageProps {
    val builder = CfnImagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnImageVersion(
    scope: Construct,
    id: String,
    block: CfnImageVersionDsl.() -> Unit = {},
  ): CfnImageVersion {
    val builder = CfnImageVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnImageVersionProps(block: CfnImageVersionPropsDsl.() -> Unit = {}):
      CfnImageVersionProps {
    val builder = CfnImageVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInferenceExperiment(
    scope: Construct,
    id: String,
    block: CfnInferenceExperimentDsl.() -> Unit = {},
  ): CfnInferenceExperiment {
    val builder = CfnInferenceExperimentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceExperimentCaptureContentTypeHeaderProperty(block: CfnInferenceExperimentCaptureContentTypeHeaderPropertyDsl.() -> Unit
      = {}): CfnInferenceExperiment.CaptureContentTypeHeaderProperty {
    val builder = CfnInferenceExperimentCaptureContentTypeHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceExperimentDataStorageConfigProperty(block: CfnInferenceExperimentDataStorageConfigPropertyDsl.() -> Unit
      = {}): CfnInferenceExperiment.DataStorageConfigProperty {
    val builder = CfnInferenceExperimentDataStorageConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceExperimentEndpointMetadataProperty(block: CfnInferenceExperimentEndpointMetadataPropertyDsl.() -> Unit
      = {}): CfnInferenceExperiment.EndpointMetadataProperty {
    val builder = CfnInferenceExperimentEndpointMetadataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceExperimentInferenceExperimentScheduleProperty(block: CfnInferenceExperimentInferenceExperimentSchedulePropertyDsl.() -> Unit
      = {}): CfnInferenceExperiment.InferenceExperimentScheduleProperty {
    val builder = CfnInferenceExperimentInferenceExperimentSchedulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceExperimentModelInfrastructureConfigProperty(block: CfnInferenceExperimentModelInfrastructureConfigPropertyDsl.() -> Unit
      = {}): CfnInferenceExperiment.ModelInfrastructureConfigProperty {
    val builder = CfnInferenceExperimentModelInfrastructureConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceExperimentModelVariantConfigProperty(block: CfnInferenceExperimentModelVariantConfigPropertyDsl.() -> Unit
      = {}): CfnInferenceExperiment.ModelVariantConfigProperty {
    val builder = CfnInferenceExperimentModelVariantConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInferenceExperimentProps(block: CfnInferenceExperimentPropsDsl.() -> Unit =
      {}): CfnInferenceExperimentProps {
    val builder = CfnInferenceExperimentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceExperimentRealTimeInferenceConfigProperty(block: CfnInferenceExperimentRealTimeInferenceConfigPropertyDsl.() -> Unit
      = {}): CfnInferenceExperiment.RealTimeInferenceConfigProperty {
    val builder = CfnInferenceExperimentRealTimeInferenceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceExperimentShadowModeConfigProperty(block: CfnInferenceExperimentShadowModeConfigPropertyDsl.() -> Unit
      = {}): CfnInferenceExperiment.ShadowModeConfigProperty {
    val builder = CfnInferenceExperimentShadowModeConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInferenceExperimentShadowModelVariantConfigProperty(block: CfnInferenceExperimentShadowModelVariantConfigPropertyDsl.() -> Unit
      = {}): CfnInferenceExperiment.ShadowModelVariantConfigProperty {
    val builder = CfnInferenceExperimentShadowModelVariantConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModel(
    scope: Construct,
    id: String,
    block: CfnModelDsl.() -> Unit = {},
  ): CfnModel {
    val builder = CfnModelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelBiasJobDefinition(
    scope: Construct,
    id: String,
    block: CfnModelBiasJobDefinitionDsl.() -> Unit = {},
  ): CfnModelBiasJobDefinition {
    val builder = CfnModelBiasJobDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionBatchTransformInputProperty(block: CfnModelBiasJobDefinitionBatchTransformInputPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.BatchTransformInputProperty {
    val builder = CfnModelBiasJobDefinitionBatchTransformInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionClusterConfigProperty(block: CfnModelBiasJobDefinitionClusterConfigPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.ClusterConfigProperty {
    val builder = CfnModelBiasJobDefinitionClusterConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionConstraintsResourceProperty(block: CfnModelBiasJobDefinitionConstraintsResourcePropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.ConstraintsResourceProperty {
    val builder = CfnModelBiasJobDefinitionConstraintsResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionCsvProperty(block: CfnModelBiasJobDefinitionCsvPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.CsvProperty {
    val builder = CfnModelBiasJobDefinitionCsvPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionDatasetFormatProperty(block: CfnModelBiasJobDefinitionDatasetFormatPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.DatasetFormatProperty {
    val builder = CfnModelBiasJobDefinitionDatasetFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionEndpointInputProperty(block: CfnModelBiasJobDefinitionEndpointInputPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.EndpointInputProperty {
    val builder = CfnModelBiasJobDefinitionEndpointInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionJsonProperty(block: CfnModelBiasJobDefinitionJsonPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.JsonProperty {
    val builder = CfnModelBiasJobDefinitionJsonPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionModelBiasAppSpecificationProperty(block: CfnModelBiasJobDefinitionModelBiasAppSpecificationPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty {
    val builder = CfnModelBiasJobDefinitionModelBiasAppSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionModelBiasBaselineConfigProperty(block: CfnModelBiasJobDefinitionModelBiasBaselineConfigPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty {
    val builder = CfnModelBiasJobDefinitionModelBiasBaselineConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionModelBiasJobInputProperty(block: CfnModelBiasJobDefinitionModelBiasJobInputPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.ModelBiasJobInputProperty {
    val builder = CfnModelBiasJobDefinitionModelBiasJobInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionMonitoringGroundTruthS3InputProperty(block: CfnModelBiasJobDefinitionMonitoringGroundTruthS3InputPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty {
    val builder = CfnModelBiasJobDefinitionMonitoringGroundTruthS3InputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionMonitoringOutputConfigProperty(block: CfnModelBiasJobDefinitionMonitoringOutputConfigPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.MonitoringOutputConfigProperty {
    val builder = CfnModelBiasJobDefinitionMonitoringOutputConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionMonitoringOutputProperty(block: CfnModelBiasJobDefinitionMonitoringOutputPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.MonitoringOutputProperty {
    val builder = CfnModelBiasJobDefinitionMonitoringOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionMonitoringResourcesProperty(block: CfnModelBiasJobDefinitionMonitoringResourcesPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.MonitoringResourcesProperty {
    val builder = CfnModelBiasJobDefinitionMonitoringResourcesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionNetworkConfigProperty(block: CfnModelBiasJobDefinitionNetworkConfigPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.NetworkConfigProperty {
    val builder = CfnModelBiasJobDefinitionNetworkConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionProps(block: CfnModelBiasJobDefinitionPropsDsl.() -> Unit = {}):
      CfnModelBiasJobDefinitionProps {
    val builder = CfnModelBiasJobDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionS3OutputProperty(block: CfnModelBiasJobDefinitionS3OutputPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.S3OutputProperty {
    val builder = CfnModelBiasJobDefinitionS3OutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionStoppingConditionProperty(block: CfnModelBiasJobDefinitionStoppingConditionPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.StoppingConditionProperty {
    val builder = CfnModelBiasJobDefinitionStoppingConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelBiasJobDefinitionVpcConfigProperty(block: CfnModelBiasJobDefinitionVpcConfigPropertyDsl.() -> Unit
      = {}): CfnModelBiasJobDefinition.VpcConfigProperty {
    val builder = CfnModelBiasJobDefinitionVpcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelCard(
    scope: Construct,
    id: String,
    block: CfnModelCardDsl.() -> Unit = {},
  ): CfnModelCard {
    val builder = CfnModelCardDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardAdditionalInformationProperty(block: CfnModelCardAdditionalInformationPropertyDsl.() -> Unit
      = {}): CfnModelCard.AdditionalInformationProperty {
    val builder = CfnModelCardAdditionalInformationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardBusinessDetailsProperty(block: CfnModelCardBusinessDetailsPropertyDsl.() -> Unit
      = {}): CfnModelCard.BusinessDetailsProperty {
    val builder = CfnModelCardBusinessDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelCardContainerProperty(block: CfnModelCardContainerPropertyDsl.() -> Unit
      = {}): CfnModelCard.ContainerProperty {
    val builder = CfnModelCardContainerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelCardContentProperty(block: CfnModelCardContentPropertyDsl.() -> Unit =
      {}): CfnModelCard.ContentProperty {
    val builder = CfnModelCardContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardEvaluationDetailProperty(block: CfnModelCardEvaluationDetailPropertyDsl.() -> Unit
      = {}): CfnModelCard.EvaluationDetailProperty {
    val builder = CfnModelCardEvaluationDetailPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelCardFunctionProperty(block: CfnModelCardFunctionPropertyDsl.() -> Unit =
      {}): CfnModelCard.FunctionProperty {
    val builder = CfnModelCardFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardInferenceEnvironmentProperty(block: CfnModelCardInferenceEnvironmentPropertyDsl.() -> Unit
      = {}): CfnModelCard.InferenceEnvironmentProperty {
    val builder = CfnModelCardInferenceEnvironmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardInferenceSpecificationProperty(block: CfnModelCardInferenceSpecificationPropertyDsl.() -> Unit
      = {}): CfnModelCard.InferenceSpecificationProperty {
    val builder = CfnModelCardInferenceSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardIntendedUsesProperty(block: CfnModelCardIntendedUsesPropertyDsl.() -> Unit =
      {}): CfnModelCard.IntendedUsesProperty {
    val builder = CfnModelCardIntendedUsesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardMetricDataItemsProperty(block: CfnModelCardMetricDataItemsPropertyDsl.() -> Unit
      = {}): CfnModelCard.MetricDataItemsProperty {
    val builder = CfnModelCardMetricDataItemsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardMetricGroupProperty(block: CfnModelCardMetricGroupPropertyDsl.() -> Unit =
      {}): CfnModelCard.MetricGroupProperty {
    val builder = CfnModelCardMetricGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardModelOverviewProperty(block: CfnModelCardModelOverviewPropertyDsl.() -> Unit =
      {}): CfnModelCard.ModelOverviewProperty {
    val builder = CfnModelCardModelOverviewPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardModelPackageCreatorProperty(block: CfnModelCardModelPackageCreatorPropertyDsl.() -> Unit
      = {}): CfnModelCard.ModelPackageCreatorProperty {
    val builder = CfnModelCardModelPackageCreatorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardModelPackageDetailsProperty(block: CfnModelCardModelPackageDetailsPropertyDsl.() -> Unit
      = {}): CfnModelCard.ModelPackageDetailsProperty {
    val builder = CfnModelCardModelPackageDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardObjectiveFunctionProperty(block: CfnModelCardObjectiveFunctionPropertyDsl.() -> Unit
      = {}): CfnModelCard.ObjectiveFunctionProperty {
    val builder = CfnModelCardObjectiveFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelCardProps(block: CfnModelCardPropsDsl.() -> Unit = {}):
      CfnModelCardProps {
    val builder = CfnModelCardPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardSecurityConfigProperty(block: CfnModelCardSecurityConfigPropertyDsl.() -> Unit
      = {}): CfnModelCard.SecurityConfigProperty {
    val builder = CfnModelCardSecurityConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardSourceAlgorithmProperty(block: CfnModelCardSourceAlgorithmPropertyDsl.() -> Unit
      = {}): CfnModelCard.SourceAlgorithmProperty {
    val builder = CfnModelCardSourceAlgorithmPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardTrainingDetailsProperty(block: CfnModelCardTrainingDetailsPropertyDsl.() -> Unit
      = {}): CfnModelCard.TrainingDetailsProperty {
    val builder = CfnModelCardTrainingDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardTrainingEnvironmentProperty(block: CfnModelCardTrainingEnvironmentPropertyDsl.() -> Unit
      = {}): CfnModelCard.TrainingEnvironmentProperty {
    val builder = CfnModelCardTrainingEnvironmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardTrainingHyperParameterProperty(block: CfnModelCardTrainingHyperParameterPropertyDsl.() -> Unit
      = {}): CfnModelCard.TrainingHyperParameterProperty {
    val builder = CfnModelCardTrainingHyperParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardTrainingJobDetailsProperty(block: CfnModelCardTrainingJobDetailsPropertyDsl.() -> Unit
      = {}): CfnModelCard.TrainingJobDetailsProperty {
    val builder = CfnModelCardTrainingJobDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardTrainingMetricProperty(block: CfnModelCardTrainingMetricPropertyDsl.() -> Unit
      = {}): CfnModelCard.TrainingMetricProperty {
    val builder = CfnModelCardTrainingMetricPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelCardUserContextProperty(block: CfnModelCardUserContextPropertyDsl.() -> Unit =
      {}): CfnModelCard.UserContextProperty {
    val builder = CfnModelCardUserContextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelContainerDefinitionProperty(block: CfnModelContainerDefinitionPropertyDsl.() -> Unit
      = {}): CfnModel.ContainerDefinitionProperty {
    val builder = CfnModelContainerDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelExplainabilityJobDefinition(
    scope: Construct,
    id: String,
    block: CfnModelExplainabilityJobDefinitionDsl.() -> Unit = {},
  ): CfnModelExplainabilityJobDefinition {
    val builder = CfnModelExplainabilityJobDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionBatchTransformInputProperty(block: CfnModelExplainabilityJobDefinitionBatchTransformInputPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.BatchTransformInputProperty {
    val builder = CfnModelExplainabilityJobDefinitionBatchTransformInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionClusterConfigProperty(block: CfnModelExplainabilityJobDefinitionClusterConfigPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.ClusterConfigProperty {
    val builder = CfnModelExplainabilityJobDefinitionClusterConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionConstraintsResourceProperty(block: CfnModelExplainabilityJobDefinitionConstraintsResourcePropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty {
    val builder = CfnModelExplainabilityJobDefinitionConstraintsResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionCsvProperty(block: CfnModelExplainabilityJobDefinitionCsvPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.CsvProperty {
    val builder = CfnModelExplainabilityJobDefinitionCsvPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionDatasetFormatProperty(block: CfnModelExplainabilityJobDefinitionDatasetFormatPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.DatasetFormatProperty {
    val builder = CfnModelExplainabilityJobDefinitionDatasetFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionEndpointInputProperty(block: CfnModelExplainabilityJobDefinitionEndpointInputPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.EndpointInputProperty {
    val builder = CfnModelExplainabilityJobDefinitionEndpointInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionJsonProperty(block: CfnModelExplainabilityJobDefinitionJsonPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.JsonProperty {
    val builder = CfnModelExplainabilityJobDefinitionJsonPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationProperty(block: CfnModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty {
    val builder =
        CfnModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigProperty(block: CfnModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty {
    val builder = CfnModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionModelExplainabilityJobInputProperty(block: CfnModelExplainabilityJobDefinitionModelExplainabilityJobInputPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty {
    val builder = CfnModelExplainabilityJobDefinitionModelExplainabilityJobInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionMonitoringOutputConfigProperty(block: CfnModelExplainabilityJobDefinitionMonitoringOutputConfigPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty {
    val builder = CfnModelExplainabilityJobDefinitionMonitoringOutputConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionMonitoringOutputProperty(block: CfnModelExplainabilityJobDefinitionMonitoringOutputPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.MonitoringOutputProperty {
    val builder = CfnModelExplainabilityJobDefinitionMonitoringOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionMonitoringResourcesProperty(block: CfnModelExplainabilityJobDefinitionMonitoringResourcesPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty {
    val builder = CfnModelExplainabilityJobDefinitionMonitoringResourcesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionNetworkConfigProperty(block: CfnModelExplainabilityJobDefinitionNetworkConfigPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.NetworkConfigProperty {
    val builder = CfnModelExplainabilityJobDefinitionNetworkConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionProps(block: CfnModelExplainabilityJobDefinitionPropsDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinitionProps {
    val builder = CfnModelExplainabilityJobDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionS3OutputProperty(block: CfnModelExplainabilityJobDefinitionS3OutputPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.S3OutputProperty {
    val builder = CfnModelExplainabilityJobDefinitionS3OutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionStoppingConditionProperty(block: CfnModelExplainabilityJobDefinitionStoppingConditionPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.StoppingConditionProperty {
    val builder = CfnModelExplainabilityJobDefinitionStoppingConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelExplainabilityJobDefinitionVpcConfigProperty(block: CfnModelExplainabilityJobDefinitionVpcConfigPropertyDsl.() -> Unit
      = {}): CfnModelExplainabilityJobDefinition.VpcConfigProperty {
    val builder = CfnModelExplainabilityJobDefinitionVpcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelImageConfigProperty(block: CfnModelImageConfigPropertyDsl.() -> Unit =
      {}): CfnModel.ImageConfigProperty {
    val builder = CfnModelImageConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelInferenceExecutionConfigProperty(block: CfnModelInferenceExecutionConfigPropertyDsl.() -> Unit
      = {}): CfnModel.InferenceExecutionConfigProperty {
    val builder = CfnModelInferenceExecutionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelMultiModelConfigProperty(block: CfnModelMultiModelConfigPropertyDsl.() -> Unit =
      {}): CfnModel.MultiModelConfigProperty {
    val builder = CfnModelMultiModelConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelPackage(
    scope: Construct,
    id: String,
    block: CfnModelPackageDsl.() -> Unit = {},
  ): CfnModelPackage {
    val builder = CfnModelPackageDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageAdditionalInferenceSpecificationDefinitionProperty(block: CfnModelPackageAdditionalInferenceSpecificationDefinitionPropertyDsl.() -> Unit
      = {}): CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty {
    val builder = CfnModelPackageAdditionalInferenceSpecificationDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelPackageBiasProperty(block: CfnModelPackageBiasPropertyDsl.() -> Unit =
      {}): CfnModelPackage.BiasProperty {
    val builder = CfnModelPackageBiasPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageDataSourceProperty(block: CfnModelPackageDataSourcePropertyDsl.() -> Unit =
      {}): CfnModelPackage.DataSourceProperty {
    val builder = CfnModelPackageDataSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageDriftCheckBaselinesProperty(block: CfnModelPackageDriftCheckBaselinesPropertyDsl.() -> Unit
      = {}): CfnModelPackage.DriftCheckBaselinesProperty {
    val builder = CfnModelPackageDriftCheckBaselinesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageDriftCheckBiasProperty(block: CfnModelPackageDriftCheckBiasPropertyDsl.() -> Unit
      = {}): CfnModelPackage.DriftCheckBiasProperty {
    val builder = CfnModelPackageDriftCheckBiasPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageDriftCheckExplainabilityProperty(block: CfnModelPackageDriftCheckExplainabilityPropertyDsl.() -> Unit
      = {}): CfnModelPackage.DriftCheckExplainabilityProperty {
    val builder = CfnModelPackageDriftCheckExplainabilityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageDriftCheckModelDataQualityProperty(block: CfnModelPackageDriftCheckModelDataQualityPropertyDsl.() -> Unit
      = {}): CfnModelPackage.DriftCheckModelDataQualityProperty {
    val builder = CfnModelPackageDriftCheckModelDataQualityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageDriftCheckModelQualityProperty(block: CfnModelPackageDriftCheckModelQualityPropertyDsl.() -> Unit
      = {}): CfnModelPackage.DriftCheckModelQualityProperty {
    val builder = CfnModelPackageDriftCheckModelQualityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageExplainabilityProperty(block: CfnModelPackageExplainabilityPropertyDsl.() -> Unit
      = {}): CfnModelPackage.ExplainabilityProperty {
    val builder = CfnModelPackageExplainabilityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageFileSourceProperty(block: CfnModelPackageFileSourcePropertyDsl.() -> Unit =
      {}): CfnModelPackage.FileSourceProperty {
    val builder = CfnModelPackageFileSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelPackageGroup(
    scope: Construct,
    id: String,
    block: CfnModelPackageGroupDsl.() -> Unit = {},
  ): CfnModelPackageGroup {
    val builder = CfnModelPackageGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelPackageGroupProps(block: CfnModelPackageGroupPropsDsl.() -> Unit = {}):
      CfnModelPackageGroupProps {
    val builder = CfnModelPackageGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageInferenceSpecificationProperty(block: CfnModelPackageInferenceSpecificationPropertyDsl.() -> Unit
      = {}): CfnModelPackage.InferenceSpecificationProperty {
    val builder = CfnModelPackageInferenceSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageMetadataPropertiesProperty(block: CfnModelPackageMetadataPropertiesPropertyDsl.() -> Unit
      = {}): CfnModelPackage.MetadataPropertiesProperty {
    val builder = CfnModelPackageMetadataPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageMetricsSourceProperty(block: CfnModelPackageMetricsSourcePropertyDsl.() -> Unit
      = {}): CfnModelPackage.MetricsSourceProperty {
    val builder = CfnModelPackageMetricsSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageModelDataQualityProperty(block: CfnModelPackageModelDataQualityPropertyDsl.() -> Unit
      = {}): CfnModelPackage.ModelDataQualityProperty {
    val builder = CfnModelPackageModelDataQualityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageModelInputProperty(block: CfnModelPackageModelInputPropertyDsl.() -> Unit =
      {}): CfnModelPackage.ModelInputProperty {
    val builder = CfnModelPackageModelInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageModelMetricsProperty(block: CfnModelPackageModelMetricsPropertyDsl.() -> Unit
      = {}): CfnModelPackage.ModelMetricsProperty {
    val builder = CfnModelPackageModelMetricsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageModelPackageContainerDefinitionProperty(block: CfnModelPackageModelPackageContainerDefinitionPropertyDsl.() -> Unit
      = {}): CfnModelPackage.ModelPackageContainerDefinitionProperty {
    val builder = CfnModelPackageModelPackageContainerDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageModelPackageStatusDetailsProperty(block: CfnModelPackageModelPackageStatusDetailsPropertyDsl.() -> Unit
      = {}): CfnModelPackage.ModelPackageStatusDetailsProperty {
    val builder = CfnModelPackageModelPackageStatusDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageModelPackageStatusItemProperty(block: CfnModelPackageModelPackageStatusItemPropertyDsl.() -> Unit
      = {}): CfnModelPackage.ModelPackageStatusItemProperty {
    val builder = CfnModelPackageModelPackageStatusItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageModelQualityProperty(block: CfnModelPackageModelQualityPropertyDsl.() -> Unit
      = {}): CfnModelPackage.ModelQualityProperty {
    val builder = CfnModelPackageModelQualityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelPackageProps(block: CfnModelPackagePropsDsl.() -> Unit = {}):
      CfnModelPackageProps {
    val builder = CfnModelPackagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageS3DataSourceProperty(block: CfnModelPackageS3DataSourcePropertyDsl.() -> Unit
      = {}): CfnModelPackage.S3DataSourceProperty {
    val builder = CfnModelPackageS3DataSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageSourceAlgorithmProperty(block: CfnModelPackageSourceAlgorithmPropertyDsl.() -> Unit
      = {}): CfnModelPackage.SourceAlgorithmProperty {
    val builder = CfnModelPackageSourceAlgorithmPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageSourceAlgorithmSpecificationProperty(block: CfnModelPackageSourceAlgorithmSpecificationPropertyDsl.() -> Unit
      = {}): CfnModelPackage.SourceAlgorithmSpecificationProperty {
    val builder = CfnModelPackageSourceAlgorithmSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageTransformInputProperty(block: CfnModelPackageTransformInputPropertyDsl.() -> Unit
      = {}): CfnModelPackage.TransformInputProperty {
    val builder = CfnModelPackageTransformInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageTransformJobDefinitionProperty(block: CfnModelPackageTransformJobDefinitionPropertyDsl.() -> Unit
      = {}): CfnModelPackage.TransformJobDefinitionProperty {
    val builder = CfnModelPackageTransformJobDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageTransformOutputProperty(block: CfnModelPackageTransformOutputPropertyDsl.() -> Unit
      = {}): CfnModelPackage.TransformOutputProperty {
    val builder = CfnModelPackageTransformOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageTransformResourcesProperty(block: CfnModelPackageTransformResourcesPropertyDsl.() -> Unit
      = {}): CfnModelPackage.TransformResourcesProperty {
    val builder = CfnModelPackageTransformResourcesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageValidationProfileProperty(block: CfnModelPackageValidationProfilePropertyDsl.() -> Unit
      = {}): CfnModelPackage.ValidationProfileProperty {
    val builder = CfnModelPackageValidationProfilePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelPackageValidationSpecificationProperty(block: CfnModelPackageValidationSpecificationPropertyDsl.() -> Unit
      = {}): CfnModelPackage.ValidationSpecificationProperty {
    val builder = CfnModelPackageValidationSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelProps(block: CfnModelPropsDsl.() -> Unit = {}): CfnModelProps {
    val builder = CfnModelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelQualityJobDefinition(
    scope: Construct,
    id: String,
    block: CfnModelQualityJobDefinitionDsl.() -> Unit = {},
  ): CfnModelQualityJobDefinition {
    val builder = CfnModelQualityJobDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionBatchTransformInputProperty(block: CfnModelQualityJobDefinitionBatchTransformInputPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.BatchTransformInputProperty {
    val builder = CfnModelQualityJobDefinitionBatchTransformInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionClusterConfigProperty(block: CfnModelQualityJobDefinitionClusterConfigPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.ClusterConfigProperty {
    val builder = CfnModelQualityJobDefinitionClusterConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionConstraintsResourceProperty(block: CfnModelQualityJobDefinitionConstraintsResourcePropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.ConstraintsResourceProperty {
    val builder = CfnModelQualityJobDefinitionConstraintsResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionCsvProperty(block: CfnModelQualityJobDefinitionCsvPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.CsvProperty {
    val builder = CfnModelQualityJobDefinitionCsvPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionDatasetFormatProperty(block: CfnModelQualityJobDefinitionDatasetFormatPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.DatasetFormatProperty {
    val builder = CfnModelQualityJobDefinitionDatasetFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionEndpointInputProperty(block: CfnModelQualityJobDefinitionEndpointInputPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.EndpointInputProperty {
    val builder = CfnModelQualityJobDefinitionEndpointInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionJsonProperty(block: CfnModelQualityJobDefinitionJsonPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.JsonProperty {
    val builder = CfnModelQualityJobDefinitionJsonPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionModelQualityAppSpecificationProperty(block: CfnModelQualityJobDefinitionModelQualityAppSpecificationPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty {
    val builder = CfnModelQualityJobDefinitionModelQualityAppSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionModelQualityBaselineConfigProperty(block: CfnModelQualityJobDefinitionModelQualityBaselineConfigPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty {
    val builder = CfnModelQualityJobDefinitionModelQualityBaselineConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionModelQualityJobInputProperty(block: CfnModelQualityJobDefinitionModelQualityJobInputPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.ModelQualityJobInputProperty {
    val builder = CfnModelQualityJobDefinitionModelQualityJobInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionMonitoringGroundTruthS3InputProperty(block: CfnModelQualityJobDefinitionMonitoringGroundTruthS3InputPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty {
    val builder = CfnModelQualityJobDefinitionMonitoringGroundTruthS3InputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionMonitoringOutputConfigProperty(block: CfnModelQualityJobDefinitionMonitoringOutputConfigPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.MonitoringOutputConfigProperty {
    val builder = CfnModelQualityJobDefinitionMonitoringOutputConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionMonitoringOutputProperty(block: CfnModelQualityJobDefinitionMonitoringOutputPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.MonitoringOutputProperty {
    val builder = CfnModelQualityJobDefinitionMonitoringOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionMonitoringResourcesProperty(block: CfnModelQualityJobDefinitionMonitoringResourcesPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.MonitoringResourcesProperty {
    val builder = CfnModelQualityJobDefinitionMonitoringResourcesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionNetworkConfigProperty(block: CfnModelQualityJobDefinitionNetworkConfigPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.NetworkConfigProperty {
    val builder = CfnModelQualityJobDefinitionNetworkConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionProps(block: CfnModelQualityJobDefinitionPropsDsl.() -> Unit =
      {}): CfnModelQualityJobDefinitionProps {
    val builder = CfnModelQualityJobDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionS3OutputProperty(block: CfnModelQualityJobDefinitionS3OutputPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.S3OutputProperty {
    val builder = CfnModelQualityJobDefinitionS3OutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionStoppingConditionProperty(block: CfnModelQualityJobDefinitionStoppingConditionPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.StoppingConditionProperty {
    val builder = CfnModelQualityJobDefinitionStoppingConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelQualityJobDefinitionVpcConfigProperty(block: CfnModelQualityJobDefinitionVpcConfigPropertyDsl.() -> Unit
      = {}): CfnModelQualityJobDefinition.VpcConfigProperty {
    val builder = CfnModelQualityJobDefinitionVpcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnModelRepositoryAuthConfigProperty(block: CfnModelRepositoryAuthConfigPropertyDsl.() -> Unit
      = {}): CfnModel.RepositoryAuthConfigProperty {
    val builder = CfnModelRepositoryAuthConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModelVpcConfigProperty(block: CfnModelVpcConfigPropertyDsl.() -> Unit = {}):
      CfnModel.VpcConfigProperty {
    val builder = CfnModelVpcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMonitoringSchedule(
    scope: Construct,
    id: String,
    block: CfnMonitoringScheduleDsl.() -> Unit = {},
  ): CfnMonitoringSchedule {
    val builder = CfnMonitoringScheduleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleBaselineConfigProperty(block: CfnMonitoringScheduleBaselineConfigPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.BaselineConfigProperty {
    val builder = CfnMonitoringScheduleBaselineConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleBatchTransformInputProperty(block: CfnMonitoringScheduleBatchTransformInputPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.BatchTransformInputProperty {
    val builder = CfnMonitoringScheduleBatchTransformInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleClusterConfigProperty(block: CfnMonitoringScheduleClusterConfigPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.ClusterConfigProperty {
    val builder = CfnMonitoringScheduleClusterConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleConstraintsResourceProperty(block: CfnMonitoringScheduleConstraintsResourcePropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.ConstraintsResourceProperty {
    val builder = CfnMonitoringScheduleConstraintsResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleCsvProperty(block: CfnMonitoringScheduleCsvPropertyDsl.() -> Unit =
      {}): CfnMonitoringSchedule.CsvProperty {
    val builder = CfnMonitoringScheduleCsvPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleDatasetFormatProperty(block: CfnMonitoringScheduleDatasetFormatPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.DatasetFormatProperty {
    val builder = CfnMonitoringScheduleDatasetFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleEndpointInputProperty(block: CfnMonitoringScheduleEndpointInputPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.EndpointInputProperty {
    val builder = CfnMonitoringScheduleEndpointInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleJsonProperty(block: CfnMonitoringScheduleJsonPropertyDsl.() -> Unit =
      {}): CfnMonitoringSchedule.JsonProperty {
    val builder = CfnMonitoringScheduleJsonPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleMonitoringAppSpecificationProperty(block: CfnMonitoringScheduleMonitoringAppSpecificationPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.MonitoringAppSpecificationProperty {
    val builder = CfnMonitoringScheduleMonitoringAppSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleMonitoringExecutionSummaryProperty(block: CfnMonitoringScheduleMonitoringExecutionSummaryPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.MonitoringExecutionSummaryProperty {
    val builder = CfnMonitoringScheduleMonitoringExecutionSummaryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleMonitoringInputProperty(block: CfnMonitoringScheduleMonitoringInputPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.MonitoringInputProperty {
    val builder = CfnMonitoringScheduleMonitoringInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleMonitoringJobDefinitionProperty(block: CfnMonitoringScheduleMonitoringJobDefinitionPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.MonitoringJobDefinitionProperty {
    val builder = CfnMonitoringScheduleMonitoringJobDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleMonitoringOutputConfigProperty(block: CfnMonitoringScheduleMonitoringOutputConfigPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.MonitoringOutputConfigProperty {
    val builder = CfnMonitoringScheduleMonitoringOutputConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleMonitoringOutputProperty(block: CfnMonitoringScheduleMonitoringOutputPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.MonitoringOutputProperty {
    val builder = CfnMonitoringScheduleMonitoringOutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleMonitoringResourcesProperty(block: CfnMonitoringScheduleMonitoringResourcesPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.MonitoringResourcesProperty {
    val builder = CfnMonitoringScheduleMonitoringResourcesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleMonitoringScheduleConfigProperty(block: CfnMonitoringScheduleMonitoringScheduleConfigPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.MonitoringScheduleConfigProperty {
    val builder = CfnMonitoringScheduleMonitoringScheduleConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleNetworkConfigProperty(block: CfnMonitoringScheduleNetworkConfigPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.NetworkConfigProperty {
    val builder = CfnMonitoringScheduleNetworkConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMonitoringScheduleProps(block: CfnMonitoringSchedulePropsDsl.() -> Unit =
      {}): CfnMonitoringScheduleProps {
    val builder = CfnMonitoringSchedulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleS3OutputProperty(block: CfnMonitoringScheduleS3OutputPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.S3OutputProperty {
    val builder = CfnMonitoringScheduleS3OutputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleScheduleConfigProperty(block: CfnMonitoringScheduleScheduleConfigPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.ScheduleConfigProperty {
    val builder = CfnMonitoringScheduleScheduleConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleStatisticsResourceProperty(block: CfnMonitoringScheduleStatisticsResourcePropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.StatisticsResourceProperty {
    val builder = CfnMonitoringScheduleStatisticsResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleStoppingConditionProperty(block: CfnMonitoringScheduleStoppingConditionPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.StoppingConditionProperty {
    val builder = CfnMonitoringScheduleStoppingConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringScheduleVpcConfigProperty(block: CfnMonitoringScheduleVpcConfigPropertyDsl.() -> Unit
      = {}): CfnMonitoringSchedule.VpcConfigProperty {
    val builder = CfnMonitoringScheduleVpcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNotebookInstance(
    scope: Construct,
    id: String,
    block: CfnNotebookInstanceDsl.() -> Unit = {},
  ): CfnNotebookInstance {
    val builder = CfnNotebookInstanceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNotebookInstanceInstanceMetadataServiceConfigurationProperty(block: CfnNotebookInstanceInstanceMetadataServiceConfigurationPropertyDsl.() -> Unit
      = {}): CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty {
    val builder = CfnNotebookInstanceInstanceMetadataServiceConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNotebookInstanceLifecycleConfig(
    scope: Construct,
    id: String,
    block: CfnNotebookInstanceLifecycleConfigDsl.() -> Unit = {},
  ): CfnNotebookInstanceLifecycleConfig {
    val builder = CfnNotebookInstanceLifecycleConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNotebookInstanceLifecycleConfigNotebookInstanceLifecycleHookProperty(block: CfnNotebookInstanceLifecycleConfigNotebookInstanceLifecycleHookPropertyDsl.() -> Unit
      = {}): CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty {
    val builder = CfnNotebookInstanceLifecycleConfigNotebookInstanceLifecycleHookPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNotebookInstanceLifecycleConfigProps(block: CfnNotebookInstanceLifecycleConfigPropsDsl.() -> Unit
      = {}): CfnNotebookInstanceLifecycleConfigProps {
    val builder = CfnNotebookInstanceLifecycleConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNotebookInstanceProps(block: CfnNotebookInstancePropsDsl.() -> Unit = {}):
      CfnNotebookInstanceProps {
    val builder = CfnNotebookInstancePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipeline(
    scope: Construct,
    id: String,
    block: CfnPipelineDsl.() -> Unit = {},
  ): CfnPipeline {
    val builder = CfnPipelineDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelineParallelismConfigurationProperty(block: CfnPipelineParallelismConfigurationPropertyDsl.() -> Unit
      = {}): CfnPipeline.ParallelismConfigurationProperty {
    val builder = CfnPipelineParallelismConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPipelinePipelineDefinitionProperty(block: CfnPipelinePipelineDefinitionPropertyDsl.() -> Unit
      = {}): CfnPipeline.PipelineDefinitionProperty {
    val builder = CfnPipelinePipelineDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipelineProps(block: CfnPipelinePropsDsl.() -> Unit = {}): CfnPipelineProps {
    val builder = CfnPipelinePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPipelineS3LocationProperty(block: CfnPipelineS3LocationPropertyDsl.() -> Unit
      = {}): CfnPipeline.S3LocationProperty {
    val builder = CfnPipelineS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProject(
    scope: Construct,
    id: String,
    block: CfnProjectDsl.() -> Unit = {},
  ): CfnProject {
    val builder = CfnProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
    val builder = CfnProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectProvisioningParameterProperty(block: CfnProjectProvisioningParameterPropertyDsl.() -> Unit
      = {}): CfnProject.ProvisioningParameterProperty {
    val builder = CfnProjectProvisioningParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectServiceCatalogProvisionedProductDetailsProperty(block: CfnProjectServiceCatalogProvisionedProductDetailsPropertyDsl.() -> Unit
      = {}): CfnProject.ServiceCatalogProvisionedProductDetailsProperty {
    val builder = CfnProjectServiceCatalogProvisionedProductDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnProjectServiceCatalogProvisioningDetailsProperty(block: CfnProjectServiceCatalogProvisioningDetailsPropertyDsl.() -> Unit
      = {}): CfnProject.ServiceCatalogProvisioningDetailsProperty {
    val builder = CfnProjectServiceCatalogProvisioningDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSpace(
    scope: Construct,
    id: String,
    block: CfnSpaceDsl.() -> Unit = {},
  ): CfnSpace {
    val builder = CfnSpaceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSpaceCustomImageProperty(block: CfnSpaceCustomImagePropertyDsl.() -> Unit =
      {}): CfnSpace.CustomImageProperty {
    val builder = CfnSpaceCustomImagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpaceJupyterServerAppSettingsProperty(block: CfnSpaceJupyterServerAppSettingsPropertyDsl.() -> Unit
      = {}): CfnSpace.JupyterServerAppSettingsProperty {
    val builder = CfnSpaceJupyterServerAppSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSpaceKernelGatewayAppSettingsProperty(block: CfnSpaceKernelGatewayAppSettingsPropertyDsl.() -> Unit
      = {}): CfnSpace.KernelGatewayAppSettingsProperty {
    val builder = CfnSpaceKernelGatewayAppSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSpaceProps(block: CfnSpacePropsDsl.() -> Unit = {}): CfnSpaceProps {
    val builder = CfnSpacePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSpaceResourceSpecProperty(block: CfnSpaceResourceSpecPropertyDsl.() -> Unit =
      {}): CfnSpace.ResourceSpecProperty {
    val builder = CfnSpaceResourceSpecPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSpaceSpaceSettingsProperty(block: CfnSpaceSpaceSettingsPropertyDsl.() -> Unit
      = {}): CfnSpace.SpaceSettingsProperty {
    val builder = CfnSpaceSpaceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserProfile(
    scope: Construct,
    id: String,
    block: CfnUserProfileDsl.() -> Unit = {},
  ): CfnUserProfile {
    val builder = CfnUserProfileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserProfileCustomImageProperty(block: CfnUserProfileCustomImagePropertyDsl.() -> Unit =
      {}): CfnUserProfile.CustomImageProperty {
    val builder = CfnUserProfileCustomImagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserProfileJupyterServerAppSettingsProperty(block: CfnUserProfileJupyterServerAppSettingsPropertyDsl.() -> Unit
      = {}): CfnUserProfile.JupyterServerAppSettingsProperty {
    val builder = CfnUserProfileJupyterServerAppSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserProfileKernelGatewayAppSettingsProperty(block: CfnUserProfileKernelGatewayAppSettingsPropertyDsl.() -> Unit
      = {}): CfnUserProfile.KernelGatewayAppSettingsProperty {
    val builder = CfnUserProfileKernelGatewayAppSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserProfileProps(block: CfnUserProfilePropsDsl.() -> Unit = {}):
      CfnUserProfileProps {
    val builder = CfnUserProfilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserProfileRStudioServerProAppSettingsProperty(block: CfnUserProfileRStudioServerProAppSettingsPropertyDsl.() -> Unit
      = {}): CfnUserProfile.RStudioServerProAppSettingsProperty {
    val builder = CfnUserProfileRStudioServerProAppSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserProfileResourceSpecProperty(block: CfnUserProfileResourceSpecPropertyDsl.() -> Unit
      = {}): CfnUserProfile.ResourceSpecProperty {
    val builder = CfnUserProfileResourceSpecPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserProfileSharingSettingsProperty(block: CfnUserProfileSharingSettingsPropertyDsl.() -> Unit
      = {}): CfnUserProfile.SharingSettingsProperty {
    val builder = CfnUserProfileSharingSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserProfileUserSettingsProperty(block: CfnUserProfileUserSettingsPropertyDsl.() -> Unit
      = {}): CfnUserProfile.UserSettingsProperty {
    val builder = CfnUserProfileUserSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWorkteam(
    scope: Construct,
    id: String,
    block: CfnWorkteamDsl.() -> Unit = {},
  ): CfnWorkteam {
    val builder = CfnWorkteamDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkteamCognitoMemberDefinitionProperty(block: CfnWorkteamCognitoMemberDefinitionPropertyDsl.() -> Unit
      = {}): CfnWorkteam.CognitoMemberDefinitionProperty {
    val builder = CfnWorkteamCognitoMemberDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkteamMemberDefinitionProperty(block: CfnWorkteamMemberDefinitionPropertyDsl.() -> Unit
      = {}): CfnWorkteam.MemberDefinitionProperty {
    val builder = CfnWorkteamMemberDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkteamNotificationConfigurationProperty(block: CfnWorkteamNotificationConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkteam.NotificationConfigurationProperty {
    val builder = CfnWorkteamNotificationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkteamOidcMemberDefinitionProperty(block: CfnWorkteamOidcMemberDefinitionPropertyDsl.() -> Unit
      = {}): CfnWorkteam.OidcMemberDefinitionProperty {
    val builder = CfnWorkteamOidcMemberDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWorkteamProps(block: CfnWorkteamPropsDsl.() -> Unit = {}): CfnWorkteamProps {
    val builder = CfnWorkteamPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
