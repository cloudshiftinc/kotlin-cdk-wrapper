@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sagemaker

import software.amazon.awscdk.services.sagemaker.CfnApp
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnDevice
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleet
import software.amazon.awscdk.services.sagemaker.CfnDomain
import software.amazon.awscdk.services.sagemaker.CfnEndpoint
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
import software.amazon.awscdk.services.sagemaker.CfnModel
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstance
import software.amazon.awscdk.services.sagemaker.CfnProject
import software.amazon.awscdk.services.sagemaker.CfnSpace
import software.amazon.awscdk.services.sagemaker.CfnUserProfile
import software.amazon.awscdk.services.sagemaker.CfnWorkteam
import kotlin.Unit

public inline fun CfnNotebookInstance.setInstanceMetadataServiceConfiguration(
    block: CfnNotebookInstanceInstanceMetadataServiceConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnNotebookInstanceInstanceMetadataServiceConfigurationPropertyDsl()
    builder.apply(block)
    return setInstanceMetadataServiceConfiguration(builder.build())
}

public inline fun CfnProject.setServiceCatalogProvisionedProductDetails(
    block: CfnProjectServiceCatalogProvisionedProductDetailsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnProjectServiceCatalogProvisionedProductDetailsPropertyDsl()
    builder.apply(block)
    return setServiceCatalogProvisionedProductDetails(builder.build())
}

public inline fun CfnEndpoint.setDeploymentConfig(
    block: CfnEndpointDeploymentConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnEndpointDeploymentConfigPropertyDsl()
    builder.apply(block)
    return setDeploymentConfig(builder.build())
}

public inline fun CfnModelBiasJobDefinition.setJobResources(
    block: CfnModelBiasJobDefinitionMonitoringResourcesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelBiasJobDefinitionMonitoringResourcesPropertyDsl()
    builder.apply(block)
    return setJobResources(builder.build())
}

public inline fun CfnModelBiasJobDefinition.setModelBiasAppSpecification(
    block: CfnModelBiasJobDefinitionModelBiasAppSpecificationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelBiasJobDefinitionModelBiasAppSpecificationPropertyDsl()
    builder.apply(block)
    return setModelBiasAppSpecification(builder.build())
}

public inline fun CfnModelBiasJobDefinition.setModelBiasJobInput(
    block: CfnModelBiasJobDefinitionModelBiasJobInputPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelBiasJobDefinitionModelBiasJobInputPropertyDsl()
    builder.apply(block)
    return setModelBiasJobInput(builder.build())
}

public inline fun CfnModelBiasJobDefinition.setModelBiasJobOutputConfig(
    block: CfnModelBiasJobDefinitionMonitoringOutputConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelBiasJobDefinitionMonitoringOutputConfigPropertyDsl()
    builder.apply(block)
    return setModelBiasJobOutputConfig(builder.build())
}

public inline fun CfnModelBiasJobDefinition.setModelBiasBaselineConfig(
    block: CfnModelBiasJobDefinitionModelBiasBaselineConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelBiasJobDefinitionModelBiasBaselineConfigPropertyDsl()
    builder.apply(block)
    return setModelBiasBaselineConfig(builder.build())
}

public inline fun CfnModelBiasJobDefinition.setNetworkConfig(
    block: CfnModelBiasJobDefinitionNetworkConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelBiasJobDefinitionNetworkConfigPropertyDsl()
    builder.apply(block)
    return setNetworkConfig(builder.build())
}

public inline fun CfnModelBiasJobDefinition.setStoppingCondition(
    block: CfnModelBiasJobDefinitionStoppingConditionPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelBiasJobDefinitionStoppingConditionPropertyDsl()
    builder.apply(block)
    return setStoppingCondition(builder.build())
}

public inline fun CfnAppImageConfig.setKernelGatewayImageConfig(
    block: CfnAppImageConfigKernelGatewayImageConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnAppImageConfigKernelGatewayImageConfigPropertyDsl()
    builder.apply(block)
    return setKernelGatewayImageConfig(builder.build())
}

public inline fun CfnCodeRepository.setGitConfig(
    block: CfnCodeRepositoryGitConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnCodeRepositoryGitConfigPropertyDsl()
    builder.apply(block)
    return setGitConfig(builder.build())
}

public inline fun CfnModelCard.setContent(block: CfnModelCardContentPropertyDsl.() -> Unit = {}) {
    val builder = CfnModelCardContentPropertyDsl()
    builder.apply(block)
    return setContent(builder.build())
}

public inline fun CfnModelCard.setCreatedBy(
    block: CfnModelCardUserContextPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelCardUserContextPropertyDsl()
    builder.apply(block)
    return setCreatedBy(builder.build())
}

public inline fun CfnModelCard.setLastModifiedBy(block: CfnModelCardUserContextPropertyDsl.() -> Unit = {}) {
    val builder = CfnModelCardUserContextPropertyDsl()
    builder.apply(block)
    return setLastModifiedBy(builder.build())
}

public inline fun CfnModelCard.setSecurityConfig(
    block: CfnModelCardSecurityConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelCardSecurityConfigPropertyDsl()
    builder.apply(block)
    return setSecurityConfig(builder.build())
}

public inline fun CfnMonitoringSchedule.setMonitoringScheduleConfig(
    block: CfnMonitoringScheduleMonitoringScheduleConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnMonitoringScheduleMonitoringScheduleConfigPropertyDsl()
    builder.apply(block)
    return setMonitoringScheduleConfig(builder.build())
}

public inline fun CfnMonitoringSchedule.setLastMonitoringExecutionSummary(
    block: CfnMonitoringScheduleMonitoringExecutionSummaryPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnMonitoringScheduleMonitoringExecutionSummaryPropertyDsl()
    builder.apply(block)
    return setLastMonitoringExecutionSummary(builder.build())
}

public inline fun CfnModelExplainabilityJobDefinition.setJobResources(
    block: CfnModelExplainabilityJobDefinitionMonitoringResourcesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelExplainabilityJobDefinitionMonitoringResourcesPropertyDsl()
    builder.apply(block)
    return setJobResources(builder.build())
}

public inline fun CfnModelExplainabilityJobDefinition.setModelExplainabilityAppSpecification(
    block: CfnModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationPropertyDsl()
    builder.apply(block)
    return setModelExplainabilityAppSpecification(builder.build())
}

public inline fun CfnModelExplainabilityJobDefinition.setModelExplainabilityJobInput(
    block: CfnModelExplainabilityJobDefinitionModelExplainabilityJobInputPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelExplainabilityJobDefinitionModelExplainabilityJobInputPropertyDsl()
    builder.apply(block)
    return setModelExplainabilityJobInput(builder.build())
}

public inline fun CfnModelExplainabilityJobDefinition.setModelExplainabilityJobOutputConfig(
    block: CfnModelExplainabilityJobDefinitionMonitoringOutputConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelExplainabilityJobDefinitionMonitoringOutputConfigPropertyDsl()
    builder.apply(block)
    return setModelExplainabilityJobOutputConfig(builder.build())
}

public inline fun CfnModelExplainabilityJobDefinition.setModelExplainabilityBaselineConfig(
    block: CfnModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigPropertyDsl()
    builder.apply(block)
    return setModelExplainabilityBaselineConfig(builder.build())
}

public inline fun CfnModelExplainabilityJobDefinition.setNetworkConfig(
    block: CfnModelExplainabilityJobDefinitionNetworkConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelExplainabilityJobDefinitionNetworkConfigPropertyDsl()
    builder.apply(block)
    return setNetworkConfig(builder.build())
}

public inline fun CfnModelExplainabilityJobDefinition.setStoppingCondition(
    block: CfnModelExplainabilityJobDefinitionStoppingConditionPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelExplainabilityJobDefinitionStoppingConditionPropertyDsl()
    builder.apply(block)
    return setStoppingCondition(builder.build())
}

public inline fun CfnEndpointConfig.setAsyncInferenceConfig(
    block: CfnEndpointConfigAsyncInferenceConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnEndpointConfigAsyncInferenceConfigPropertyDsl()
    builder.apply(block)
    return setAsyncInferenceConfig(builder.build())
}

public inline fun CfnEndpointConfig.setDataCaptureConfig(
    block: CfnEndpointConfigDataCaptureConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnEndpointConfigDataCaptureConfigPropertyDsl()
    builder.apply(block)
    return setDataCaptureConfig(builder.build())
}

public inline fun CfnEndpointConfig.setExplainerConfig(
    block: CfnEndpointConfigExplainerConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnEndpointConfigExplainerConfigPropertyDsl()
    builder.apply(block)
    return setExplainerConfig(builder.build())
}

public inline fun CfnDataQualityJobDefinition.setDataQualityAppSpecification(
    block: CfnDataQualityJobDefinitionDataQualityAppSpecificationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDataQualityJobDefinitionDataQualityAppSpecificationPropertyDsl()
    builder.apply(block)
    return setDataQualityAppSpecification(builder.build())
}

public inline fun CfnDataQualityJobDefinition.setDataQualityJobInput(
    block: CfnDataQualityJobDefinitionDataQualityJobInputPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDataQualityJobDefinitionDataQualityJobInputPropertyDsl()
    builder.apply(block)
    return setDataQualityJobInput(builder.build())
}

public inline fun CfnDataQualityJobDefinition.setDataQualityJobOutputConfig(
    block: CfnDataQualityJobDefinitionMonitoringOutputConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDataQualityJobDefinitionMonitoringOutputConfigPropertyDsl()
    builder.apply(block)
    return setDataQualityJobOutputConfig(builder.build())
}

public inline fun CfnDataQualityJobDefinition.setJobResources(
    block: CfnDataQualityJobDefinitionMonitoringResourcesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDataQualityJobDefinitionMonitoringResourcesPropertyDsl()
    builder.apply(block)
    return setJobResources(builder.build())
}

public inline fun CfnDataQualityJobDefinition.setDataQualityBaselineConfig(
    block: CfnDataQualityJobDefinitionDataQualityBaselineConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDataQualityJobDefinitionDataQualityBaselineConfigPropertyDsl()
    builder.apply(block)
    return setDataQualityBaselineConfig(builder.build())
}

public inline fun CfnDataQualityJobDefinition.setNetworkConfig(
    block: CfnDataQualityJobDefinitionNetworkConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDataQualityJobDefinitionNetworkConfigPropertyDsl()
    builder.apply(block)
    return setNetworkConfig(builder.build())
}

public inline fun CfnDataQualityJobDefinition.setStoppingCondition(
    block: CfnDataQualityJobDefinitionStoppingConditionPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDataQualityJobDefinitionStoppingConditionPropertyDsl()
    builder.apply(block)
    return setStoppingCondition(builder.build())
}

public inline fun CfnUserProfile.setUserSettings(
    block: CfnUserProfileUserSettingsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnUserProfileUserSettingsPropertyDsl()
    builder.apply(block)
    return setUserSettings(builder.build())
}

public inline fun CfnInferenceExperiment.setDataStorageConfig(
    block: CfnInferenceExperimentDataStorageConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInferenceExperimentDataStorageConfigPropertyDsl()
    builder.apply(block)
    return setDataStorageConfig(builder.build())
}

public inline fun CfnInferenceExperiment.setSchedule(
    block: CfnInferenceExperimentInferenceExperimentSchedulePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInferenceExperimentInferenceExperimentSchedulePropertyDsl()
    builder.apply(block)
    return setSchedule(builder.build())
}

public inline fun CfnInferenceExperiment.setShadowModeConfig(
    block: CfnInferenceExperimentShadowModeConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInferenceExperimentShadowModeConfigPropertyDsl()
    builder.apply(block)
    return setShadowModeConfig(builder.build())
}

public inline fun CfnDeviceFleet.setOutputConfig(
    block: CfnDeviceFleetEdgeOutputConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDeviceFleetEdgeOutputConfigPropertyDsl()
    builder.apply(block)
    return setOutputConfig(builder.build())
}

public inline fun CfnApp.setResourceSpec(block: CfnAppResourceSpecPropertyDsl.() -> Unit = {}) {
    val builder = CfnAppResourceSpecPropertyDsl()
    builder.apply(block)
    return setResourceSpec(builder.build())
}

public inline fun CfnWorkteam.setNotificationConfiguration(
    block: CfnWorkteamNotificationConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnWorkteamNotificationConfigurationPropertyDsl()
    builder.apply(block)
    return setNotificationConfiguration(builder.build())
}

public inline fun CfnModel.setInferenceExecutionConfig(
    block: CfnModelInferenceExecutionConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelInferenceExecutionConfigPropertyDsl()
    builder.apply(block)
    return setInferenceExecutionConfig(builder.build())
}

public inline fun CfnModel.setPrimaryContainer(
    block: CfnModelContainerDefinitionPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelContainerDefinitionPropertyDsl()
    builder.apply(block)
    return setPrimaryContainer(builder.build())
}

public inline fun CfnModel.setVpcConfig(block: CfnModelVpcConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnModelVpcConfigPropertyDsl()
    builder.apply(block)
    return setVpcConfig(builder.build())
}

public inline fun CfnSpace.setSpaceSettings(
    block: CfnSpaceSpaceSettingsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnSpaceSpaceSettingsPropertyDsl()
    builder.apply(block)
    return setSpaceSettings(builder.build())
}

public inline fun CfnModelQualityJobDefinition.setJobResources(
    block: CfnModelQualityJobDefinitionMonitoringResourcesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelQualityJobDefinitionMonitoringResourcesPropertyDsl()
    builder.apply(block)
    return setJobResources(builder.build())
}

public inline fun CfnModelQualityJobDefinition.setModelQualityAppSpecification(
    block: CfnModelQualityJobDefinitionModelQualityAppSpecificationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelQualityJobDefinitionModelQualityAppSpecificationPropertyDsl()
    builder.apply(block)
    return setModelQualityAppSpecification(builder.build())
}

public inline fun CfnModelQualityJobDefinition.setModelQualityJobInput(
    block: CfnModelQualityJobDefinitionModelQualityJobInputPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelQualityJobDefinitionModelQualityJobInputPropertyDsl()
    builder.apply(block)
    return setModelQualityJobInput(builder.build())
}

public inline fun CfnModelQualityJobDefinition.setModelQualityJobOutputConfig(
    block: CfnModelQualityJobDefinitionMonitoringOutputConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelQualityJobDefinitionMonitoringOutputConfigPropertyDsl()
    builder.apply(block)
    return setModelQualityJobOutputConfig(builder.build())
}

public inline fun CfnModelQualityJobDefinition.setModelQualityBaselineConfig(
    block: CfnModelQualityJobDefinitionModelQualityBaselineConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelQualityJobDefinitionModelQualityBaselineConfigPropertyDsl()
    builder.apply(block)
    return setModelQualityBaselineConfig(builder.build())
}

public inline fun CfnModelQualityJobDefinition.setNetworkConfig(
    block: CfnModelQualityJobDefinitionNetworkConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelQualityJobDefinitionNetworkConfigPropertyDsl()
    builder.apply(block)
    return setNetworkConfig(builder.build())
}

public inline fun CfnModelQualityJobDefinition.setStoppingCondition(
    block: CfnModelQualityJobDefinitionStoppingConditionPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelQualityJobDefinitionStoppingConditionPropertyDsl()
    builder.apply(block)
    return setStoppingCondition(builder.build())
}

public inline fun CfnDomain.setDefaultUserSettings(block: CfnDomainUserSettingsPropertyDsl.() -> Unit = {}) {
    val builder = CfnDomainUserSettingsPropertyDsl()
    builder.apply(block)
    return setDefaultUserSettings(builder.build())
}

public inline fun CfnDomain.setDefaultSpaceSettings(
    block: CfnDomainDefaultSpaceSettingsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDomainDefaultSpaceSettingsPropertyDsl()
    builder.apply(block)
    return setDefaultSpaceSettings(builder.build())
}

public inline fun CfnDomain.setDomainSettings(
    block: CfnDomainDomainSettingsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDomainDomainSettingsPropertyDsl()
    builder.apply(block)
    return setDomainSettings(builder.build())
}

public inline fun CfnDevice.setDevice(block: CfnDeviceDevicePropertyDsl.() -> Unit = {}) {
    val builder = CfnDeviceDevicePropertyDsl()
    builder.apply(block)
    return setDevice(builder.build())
}

public inline fun CfnModelPackage.setDriftCheckBaselines(
    block: CfnModelPackageDriftCheckBaselinesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelPackageDriftCheckBaselinesPropertyDsl()
    builder.apply(block)
    return setDriftCheckBaselines(builder.build())
}

public inline fun CfnModelPackage.setInferenceSpecification(
    block: CfnModelPackageInferenceSpecificationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelPackageInferenceSpecificationPropertyDsl()
    builder.apply(block)
    return setInferenceSpecification(builder.build())
}

public inline fun CfnModelPackage.setMetadataProperties(
    block: CfnModelPackageMetadataPropertiesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelPackageMetadataPropertiesPropertyDsl()
    builder.apply(block)
    return setMetadataProperties(builder.build())
}

public inline fun CfnModelPackage.setModelMetrics(
    block: CfnModelPackageModelMetricsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelPackageModelMetricsPropertyDsl()
    builder.apply(block)
    return setModelMetrics(builder.build())
}

public inline fun CfnModelPackage.setModelPackageStatusDetails(
    block: CfnModelPackageModelPackageStatusDetailsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelPackageModelPackageStatusDetailsPropertyDsl()
    builder.apply(block)
    return setModelPackageStatusDetails(builder.build())
}

public inline fun CfnModelPackage.setSourceAlgorithmSpecification(
    block: CfnModelPackageSourceAlgorithmSpecificationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelPackageSourceAlgorithmSpecificationPropertyDsl()
    builder.apply(block)
    return setSourceAlgorithmSpecification(builder.build())
}

public inline fun CfnModelPackage.setValidationSpecification(
    block: CfnModelPackageValidationSpecificationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnModelPackageValidationSpecificationPropertyDsl()
    builder.apply(block)
    return setValidationSpecification(builder.build())
}
