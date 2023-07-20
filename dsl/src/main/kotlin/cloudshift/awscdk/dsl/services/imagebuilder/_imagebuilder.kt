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

package cloudshift.awscdk.dsl.services.imagebuilder

import software.amazon.awscdk.services.imagebuilder.CfnComponent
import software.amazon.awscdk.services.imagebuilder.CfnComponentProps
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps
import software.amazon.awscdk.services.imagebuilder.CfnImage
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline
import software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps
import software.amazon.awscdk.services.imagebuilder.CfnImageProps
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object imagebuilder {
    public inline fun cfnComponent(
        scope: Construct,
        id: String,
        block: CfnComponentDsl.() -> Unit = {},
    ): CfnComponent {
        val builder = CfnComponentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnComponentProps(block: CfnComponentPropsDsl.() -> Unit = {}): CfnComponentProps {
        val builder = CfnComponentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerRecipe(
        scope: Construct,
        id: String,
        block: CfnContainerRecipeDsl.() -> Unit = {},
    ): CfnContainerRecipe {
        val builder = CfnContainerRecipeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerRecipeComponentConfigurationProperty(
        block: CfnContainerRecipeComponentConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnContainerRecipe.ComponentConfigurationProperty {
        val builder = CfnContainerRecipeComponentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerRecipeComponentParameterProperty(
        block: CfnContainerRecipeComponentParameterPropertyDsl.() -> Unit =
            {},
    ): CfnContainerRecipe.ComponentParameterProperty {
        val builder = CfnContainerRecipeComponentParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerRecipeEbsInstanceBlockDeviceSpecificationProperty(
        block: CfnContainerRecipeEbsInstanceBlockDeviceSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty {
        val builder = CfnContainerRecipeEbsInstanceBlockDeviceSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerRecipeInstanceBlockDeviceMappingProperty(
        block: CfnContainerRecipeInstanceBlockDeviceMappingPropertyDsl.() -> Unit =
            {},
    ): CfnContainerRecipe.InstanceBlockDeviceMappingProperty {
        val builder = CfnContainerRecipeInstanceBlockDeviceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerRecipeInstanceConfigurationProperty(
        block: CfnContainerRecipeInstanceConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnContainerRecipe.InstanceConfigurationProperty {
        val builder = CfnContainerRecipeInstanceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerRecipeProps(block: CfnContainerRecipePropsDsl.() -> Unit = {}): CfnContainerRecipeProps {
        val builder = CfnContainerRecipePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContainerRecipeTargetContainerRepositoryProperty(
        block: CfnContainerRecipeTargetContainerRepositoryPropertyDsl.() -> Unit =
            {},
    ): CfnContainerRecipe.TargetContainerRepositoryProperty {
        val builder = CfnContainerRecipeTargetContainerRepositoryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionConfiguration(
        scope: Construct,
        id: String,
        block: CfnDistributionConfigurationDsl.() -> Unit = {},
    ): CfnDistributionConfiguration {
        val builder = CfnDistributionConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionConfigurationAmiDistributionConfigurationProperty(
        block: CfnDistributionConfigurationAmiDistributionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDistributionConfiguration.AmiDistributionConfigurationProperty {
        val builder = CfnDistributionConfigurationAmiDistributionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionConfigurationContainerDistributionConfigurationProperty(
        block: CfnDistributionConfigurationContainerDistributionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDistributionConfiguration.ContainerDistributionConfigurationProperty {
        val builder = CfnDistributionConfigurationContainerDistributionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionConfigurationDistributionProperty(
        block: CfnDistributionConfigurationDistributionPropertyDsl.() -> Unit =
            {},
    ): CfnDistributionConfiguration.DistributionProperty {
        val builder = CfnDistributionConfigurationDistributionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionConfigurationFastLaunchConfigurationProperty(
        block: CfnDistributionConfigurationFastLaunchConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDistributionConfiguration.FastLaunchConfigurationProperty {
        val builder = CfnDistributionConfigurationFastLaunchConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionConfigurationFastLaunchLaunchTemplateSpecificationProperty(
        block: CfnDistributionConfigurationFastLaunchLaunchTemplateSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty {
        val builder = CfnDistributionConfigurationFastLaunchLaunchTemplateSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionConfigurationFastLaunchSnapshotConfigurationProperty(
        block: CfnDistributionConfigurationFastLaunchSnapshotConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty {
        val builder = CfnDistributionConfigurationFastLaunchSnapshotConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionConfigurationLaunchPermissionConfigurationProperty(
        block: CfnDistributionConfigurationLaunchPermissionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDistributionConfiguration.LaunchPermissionConfigurationProperty {
        val builder = CfnDistributionConfigurationLaunchPermissionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionConfigurationLaunchTemplateConfigurationProperty(
        block: CfnDistributionConfigurationLaunchTemplateConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDistributionConfiguration.LaunchTemplateConfigurationProperty {
        val builder = CfnDistributionConfigurationLaunchTemplateConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionConfigurationProps(
        block: CfnDistributionConfigurationPropsDsl.() -> Unit =
            {},
    ): CfnDistributionConfigurationProps {
        val builder = CfnDistributionConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDistributionConfigurationTargetContainerRepositoryProperty(
        block: CfnDistributionConfigurationTargetContainerRepositoryPropertyDsl.() -> Unit =
            {},
    ): CfnDistributionConfiguration.TargetContainerRepositoryProperty {
        val builder = CfnDistributionConfigurationTargetContainerRepositoryPropertyDsl()
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

    public inline fun cfnImageEcrConfigurationProperty(
        block: CfnImageEcrConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnImage.EcrConfigurationProperty {
        val builder = CfnImageEcrConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageImageScanningConfigurationProperty(
        block: CfnImageImageScanningConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnImage.ImageScanningConfigurationProperty {
        val builder = CfnImageImageScanningConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageImageTestsConfigurationProperty(
        block: CfnImageImageTestsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnImage.ImageTestsConfigurationProperty {
        val builder = CfnImageImageTestsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImagePipeline(
        scope: Construct,
        id: String,
        block: CfnImagePipelineDsl.() -> Unit = {},
    ): CfnImagePipeline {
        val builder = CfnImagePipelineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImagePipelineEcrConfigurationProperty(
        block: CfnImagePipelineEcrConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnImagePipeline.EcrConfigurationProperty {
        val builder = CfnImagePipelineEcrConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImagePipelineImageScanningConfigurationProperty(
        block: CfnImagePipelineImageScanningConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnImagePipeline.ImageScanningConfigurationProperty {
        val builder = CfnImagePipelineImageScanningConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImagePipelineImageTestsConfigurationProperty(
        block: CfnImagePipelineImageTestsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnImagePipeline.ImageTestsConfigurationProperty {
        val builder = CfnImagePipelineImageTestsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImagePipelineProps(block: CfnImagePipelinePropsDsl.() -> Unit = {}): CfnImagePipelineProps {
        val builder = CfnImagePipelinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImagePipelineScheduleProperty(
        block: CfnImagePipelineSchedulePropertyDsl.() -> Unit =
            {},
    ): CfnImagePipeline.ScheduleProperty {
        val builder = CfnImagePipelineSchedulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageProps(block: CfnImagePropsDsl.() -> Unit = {}): CfnImageProps {
        val builder = CfnImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageRecipe(
        scope: Construct,
        id: String,
        block: CfnImageRecipeDsl.() -> Unit = {},
    ): CfnImageRecipe {
        val builder = CfnImageRecipeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageRecipeAdditionalInstanceConfigurationProperty(
        block: CfnImageRecipeAdditionalInstanceConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnImageRecipe.AdditionalInstanceConfigurationProperty {
        val builder = CfnImageRecipeAdditionalInstanceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageRecipeComponentConfigurationProperty(
        block: CfnImageRecipeComponentConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnImageRecipe.ComponentConfigurationProperty {
        val builder = CfnImageRecipeComponentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageRecipeComponentParameterProperty(
        block: CfnImageRecipeComponentParameterPropertyDsl.() -> Unit =
            {},
    ): CfnImageRecipe.ComponentParameterProperty {
        val builder = CfnImageRecipeComponentParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageRecipeEbsInstanceBlockDeviceSpecificationProperty(
        block: CfnImageRecipeEbsInstanceBlockDeviceSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty {
        val builder = CfnImageRecipeEbsInstanceBlockDeviceSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageRecipeInstanceBlockDeviceMappingProperty(
        block: CfnImageRecipeInstanceBlockDeviceMappingPropertyDsl.() -> Unit =
            {},
    ): CfnImageRecipe.InstanceBlockDeviceMappingProperty {
        val builder = CfnImageRecipeInstanceBlockDeviceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageRecipeProps(block: CfnImageRecipePropsDsl.() -> Unit = {}): CfnImageRecipeProps {
        val builder = CfnImageRecipePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageRecipeSystemsManagerAgentProperty(
        block: CfnImageRecipeSystemsManagerAgentPropertyDsl.() -> Unit =
            {},
    ): CfnImageRecipe.SystemsManagerAgentProperty {
        val builder = CfnImageRecipeSystemsManagerAgentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInfrastructureConfiguration(
        scope: Construct,
        id: String,
        block: CfnInfrastructureConfigurationDsl.() -> Unit = {},
    ): CfnInfrastructureConfiguration {
        val builder = CfnInfrastructureConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInfrastructureConfigurationInstanceMetadataOptionsProperty(
        block: CfnInfrastructureConfigurationInstanceMetadataOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty {
        val builder = CfnInfrastructureConfigurationInstanceMetadataOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInfrastructureConfigurationLoggingProperty(
        block: CfnInfrastructureConfigurationLoggingPropertyDsl.() -> Unit =
            {},
    ): CfnInfrastructureConfiguration.LoggingProperty {
        val builder = CfnInfrastructureConfigurationLoggingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInfrastructureConfigurationProps(
        block: CfnInfrastructureConfigurationPropsDsl.() -> Unit =
            {},
    ): CfnInfrastructureConfigurationProps {
        val builder = CfnInfrastructureConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInfrastructureConfigurationS3LogsProperty(
        block: CfnInfrastructureConfigurationS3LogsPropertyDsl.() -> Unit =
            {},
    ): CfnInfrastructureConfiguration.S3LogsProperty {
        val builder = CfnInfrastructureConfigurationS3LogsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
