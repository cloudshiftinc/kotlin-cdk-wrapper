@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import kotlin.String
import kotlin.Unit
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
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps
import software.amazon.awscdk.services.imagebuilder.CfnWorkflow
import software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps
import software.constructs.Construct

public object imagebuilder {
    /**
     * Creates a new component that can be used to build, validate, test, and assess your image.
     *
     * The component is based on a YAML document that you specify using exactly one of the following
     * methods:
     * * Inline, using the `data` property in the request body.
     * * A URL that points to a YAML document file stored in Amazon S3, using the `uri` property in
     *   the request body.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnComponent cfnComponent = CfnComponent.Builder.create(this, "MyCfnComponent")
     * .name("name")
     * .platform("platform")
     * .version("version")
     * // the properties below are optional
     * .changeDescription("changeDescription")
     * .data("data")
     * .description("description")
     * .kmsKeyId("kmsKeyId")
     * .supportedOsVersions(List.of("supportedOsVersions"))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .uri("uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html)
     */
    public inline fun cfnComponent(
        scope: Construct,
        id: String,
        block: CfnComponentDsl.() -> Unit = {},
    ): CfnComponent {
        val builder = CfnComponentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnComponent`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnComponentProps cfnComponentProps = CfnComponentProps.builder()
     * .name("name")
     * .platform("platform")
     * .version("version")
     * // the properties below are optional
     * .changeDescription("changeDescription")
     * .data("data")
     * .description("description")
     * .kmsKeyId("kmsKeyId")
     * .supportedOsVersions(List.of("supportedOsVersions"))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .uri("uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html)
     */
    public inline fun cfnComponentProps(
        block: CfnComponentPropsDsl.() -> Unit = {}
    ): CfnComponentProps {
        val builder = CfnComponentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new container recipe.
     *
     * Container recipes define how images are configured, tested, and assessed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnContainerRecipe cfnContainerRecipe = CfnContainerRecipe.Builder.create(this,
     * "MyCfnContainerRecipe")
     * .components(List.of(ComponentConfigurationProperty.builder()
     * .componentArn("componentArn")
     * .parameters(List.of(ComponentParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build()))
     * .build()))
     * .containerType("containerType")
     * .name("name")
     * .parentImage("parentImage")
     * .targetRepository(TargetContainerRepositoryProperty.builder()
     * .repositoryName("repositoryName")
     * .service("service")
     * .build())
     * .version("version")
     * // the properties below are optional
     * .description("description")
     * .dockerfileTemplateData("dockerfileTemplateData")
     * .dockerfileTemplateUri("dockerfileTemplateUri")
     * .imageOsVersionOverride("imageOsVersionOverride")
     * .instanceConfiguration(InstanceConfigurationProperty.builder()
     * .blockDeviceMappings(List.of(InstanceBlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * .ebs(EbsInstanceBlockDeviceSpecificationProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build()))
     * .image("image")
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .platformOverride("platformOverride")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html)
     */
    public inline fun cfnContainerRecipe(
        scope: Construct,
        id: String,
        block: CfnContainerRecipeDsl.() -> Unit = {},
    ): CfnContainerRecipe {
        val builder = CfnContainerRecipeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration details of the component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ComponentConfigurationProperty componentConfigurationProperty =
     * ComponentConfigurationProperty.builder()
     * .componentArn("componentArn")
     * .parameters(List.of(ComponentParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-componentconfiguration.html)
     */
    public inline fun cfnContainerRecipeComponentConfigurationProperty(
        block: CfnContainerRecipeComponentConfigurationPropertyDsl.() -> Unit = {}
    ): CfnContainerRecipe.ComponentConfigurationProperty {
        val builder = CfnContainerRecipeComponentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains a key/value pair that sets the named component parameter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ComponentParameterProperty componentParameterProperty = ComponentParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-componentparameter.html)
     */
    public inline fun cfnContainerRecipeComponentParameterProperty(
        block: CfnContainerRecipeComponentParameterPropertyDsl.() -> Unit = {}
    ): CfnContainerRecipe.ComponentParameterProperty {
        val builder = CfnContainerRecipeComponentParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon EBS-specific block device mapping specifications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * EbsInstanceBlockDeviceSpecificationProperty ebsInstanceBlockDeviceSpecificationProperty =
     * EbsInstanceBlockDeviceSpecificationProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-ebsinstanceblockdevicespecification.html)
     */
    public inline fun cfnContainerRecipeEbsInstanceBlockDeviceSpecificationProperty(
        block: CfnContainerRecipeEbsInstanceBlockDeviceSpecificationPropertyDsl.() -> Unit = {}
    ): CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty {
        val builder = CfnContainerRecipeEbsInstanceBlockDeviceSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines block device mappings for the instance used to configure your image.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * InstanceBlockDeviceMappingProperty instanceBlockDeviceMappingProperty =
     * InstanceBlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * .ebs(EbsInstanceBlockDeviceSpecificationProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceblockdevicemapping.html)
     */
    public inline fun cfnContainerRecipeInstanceBlockDeviceMappingProperty(
        block: CfnContainerRecipeInstanceBlockDeviceMappingPropertyDsl.() -> Unit = {}
    ): CfnContainerRecipe.InstanceBlockDeviceMappingProperty {
        val builder = CfnContainerRecipeInstanceBlockDeviceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a custom base AMI and block device mapping configurations of an instance used for
     * building and testing container images.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * InstanceConfigurationProperty instanceConfigurationProperty =
     * InstanceConfigurationProperty.builder()
     * .blockDeviceMappings(List.of(InstanceBlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * .ebs(EbsInstanceBlockDeviceSpecificationProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build()))
     * .image("image")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceconfiguration.html)
     */
    public inline fun cfnContainerRecipeInstanceConfigurationProperty(
        block: CfnContainerRecipeInstanceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnContainerRecipe.InstanceConfigurationProperty {
        val builder = CfnContainerRecipeInstanceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnContainerRecipe`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnContainerRecipeProps cfnContainerRecipeProps = CfnContainerRecipeProps.builder()
     * .components(List.of(ComponentConfigurationProperty.builder()
     * .componentArn("componentArn")
     * .parameters(List.of(ComponentParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build()))
     * .build()))
     * .containerType("containerType")
     * .name("name")
     * .parentImage("parentImage")
     * .targetRepository(TargetContainerRepositoryProperty.builder()
     * .repositoryName("repositoryName")
     * .service("service")
     * .build())
     * .version("version")
     * // the properties below are optional
     * .description("description")
     * .dockerfileTemplateData("dockerfileTemplateData")
     * .dockerfileTemplateUri("dockerfileTemplateUri")
     * .imageOsVersionOverride("imageOsVersionOverride")
     * .instanceConfiguration(InstanceConfigurationProperty.builder()
     * .blockDeviceMappings(List.of(InstanceBlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * .ebs(EbsInstanceBlockDeviceSpecificationProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build()))
     * .image("image")
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .platformOverride("platformOverride")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-containerrecipe.html)
     */
    public inline fun cfnContainerRecipeProps(
        block: CfnContainerRecipePropsDsl.() -> Unit = {}
    ): CfnContainerRecipeProps {
        val builder = CfnContainerRecipePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The container repository where the output container image is stored.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * TargetContainerRepositoryProperty targetContainerRepositoryProperty =
     * TargetContainerRepositoryProperty.builder()
     * .repositoryName("repositoryName")
     * .service("service")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-targetcontainerrepository.html)
     */
    public inline fun cfnContainerRecipeTargetContainerRepositoryProperty(
        block: CfnContainerRecipeTargetContainerRepositoryPropertyDsl.() -> Unit = {}
    ): CfnContainerRecipe.TargetContainerRepositoryProperty {
        val builder = CfnContainerRecipeTargetContainerRepositoryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A distribution configuration allows you to specify the name and description of your output
     * AMI, authorize other AWS account s to launch the AMI, and replicate the AMI to other AWS
     * Regions .
     *
     * It also allows you to export the AMI to Amazon S3 .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * Object amiDistributionConfiguration;
     * Object containerDistributionConfiguration;
     * CfnDistributionConfiguration cfnDistributionConfiguration =
     * CfnDistributionConfiguration.Builder.create(this, "MyCfnDistributionConfiguration")
     * .distributions(List.of(DistributionProperty.builder()
     * .region("region")
     * // the properties below are optional
     * .amiDistributionConfiguration(amiDistributionConfiguration)
     * .containerDistributionConfiguration(containerDistributionConfiguration)
     * .fastLaunchConfigurations(List.of(FastLaunchConfigurationProperty.builder()
     * .accountId("accountId")
     * .enabled(false)
     * .launchTemplate(FastLaunchLaunchTemplateSpecificationProperty.builder()
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .launchTemplateVersion("launchTemplateVersion")
     * .build())
     * .maxParallelLaunches(123)
     * .snapshotConfiguration(FastLaunchSnapshotConfigurationProperty.builder()
     * .targetResourceCount(123)
     * .build())
     * .build()))
     * .launchTemplateConfigurations(List.of(LaunchTemplateConfigurationProperty.builder()
     * .accountId("accountId")
     * .launchTemplateId("launchTemplateId")
     * .setDefaultVersion(false)
     * .build()))
     * .licenseConfigurationArns(List.of("licenseConfigurationArns"))
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html)
     */
    public inline fun cfnDistributionConfiguration(
        scope: Construct,
        id: String,
        block: CfnDistributionConfigurationDsl.() -> Unit = {},
    ): CfnDistributionConfiguration {
        val builder = CfnDistributionConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define and configure the output AMIs of the pipeline.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * AmiDistributionConfigurationProperty amiDistributionConfigurationProperty =
     * AmiDistributionConfigurationProperty.builder()
     * .amiTags(Map.of(
     * "amiTagsKey", "amiTags"))
     * .description("description")
     * .kmsKeyId("kmsKeyId")
     * .launchPermissionConfiguration(LaunchPermissionConfigurationProperty.builder()
     * .organizationalUnitArns(List.of("organizationalUnitArns"))
     * .organizationArns(List.of("organizationArns"))
     * .userGroups(List.of("userGroups"))
     * .userIds(List.of("userIds"))
     * .build())
     * .name("name")
     * .targetAccountIds(List.of("targetAccountIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html)
     */
    public inline fun cfnDistributionConfigurationAmiDistributionConfigurationProperty(
        block: CfnDistributionConfigurationAmiDistributionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDistributionConfiguration.AmiDistributionConfigurationProperty {
        val builder = CfnDistributionConfigurationAmiDistributionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Container distribution settings for encryption, licensing, and sharing in a specific Region.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ContainerDistributionConfigurationProperty containerDistributionConfigurationProperty =
     * ContainerDistributionConfigurationProperty.builder()
     * .containerTags(List.of("containerTags"))
     * .description("description")
     * .targetRepository(TargetContainerRepositoryProperty.builder()
     * .repositoryName("repositoryName")
     * .service("service")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-containerdistributionconfiguration.html)
     */
    public inline fun cfnDistributionConfigurationContainerDistributionConfigurationProperty(
        block:
            CfnDistributionConfigurationContainerDistributionConfigurationPropertyDsl.() -> Unit =
            {}
    ): CfnDistributionConfiguration.ContainerDistributionConfigurationProperty {
        val builder = CfnDistributionConfigurationContainerDistributionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The distribution configuration distribution defines the settings for a specific Region in the
     * Distribution Configuration.
     *
     * You must specify whether the distribution is for an AMI or a container image. To do so,
     * include exactly one of the following data types for your distribution:
     * * amiDistributionConfiguration
     * * containerDistributionConfiguration
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * Object amiDistributionConfiguration;
     * Object containerDistributionConfiguration;
     * DistributionProperty distributionProperty = DistributionProperty.builder()
     * .region("region")
     * // the properties below are optional
     * .amiDistributionConfiguration(amiDistributionConfiguration)
     * .containerDistributionConfiguration(containerDistributionConfiguration)
     * .fastLaunchConfigurations(List.of(FastLaunchConfigurationProperty.builder()
     * .accountId("accountId")
     * .enabled(false)
     * .launchTemplate(FastLaunchLaunchTemplateSpecificationProperty.builder()
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .launchTemplateVersion("launchTemplateVersion")
     * .build())
     * .maxParallelLaunches(123)
     * .snapshotConfiguration(FastLaunchSnapshotConfigurationProperty.builder()
     * .targetResourceCount(123)
     * .build())
     * .build()))
     * .launchTemplateConfigurations(List.of(LaunchTemplateConfigurationProperty.builder()
     * .accountId("accountId")
     * .launchTemplateId("launchTemplateId")
     * .setDefaultVersion(false)
     * .build()))
     * .licenseConfigurationArns(List.of("licenseConfigurationArns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html)
     */
    public inline fun cfnDistributionConfigurationDistributionProperty(
        block: CfnDistributionConfigurationDistributionPropertyDsl.() -> Unit = {}
    ): CfnDistributionConfiguration.DistributionProperty {
        val builder = CfnDistributionConfigurationDistributionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define and configure faster launching for output Windows AMIs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * FastLaunchConfigurationProperty fastLaunchConfigurationProperty =
     * FastLaunchConfigurationProperty.builder()
     * .accountId("accountId")
     * .enabled(false)
     * .launchTemplate(FastLaunchLaunchTemplateSpecificationProperty.builder()
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .launchTemplateVersion("launchTemplateVersion")
     * .build())
     * .maxParallelLaunches(123)
     * .snapshotConfiguration(FastLaunchSnapshotConfigurationProperty.builder()
     * .targetResourceCount(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html)
     */
    public inline fun cfnDistributionConfigurationFastLaunchConfigurationProperty(
        block: CfnDistributionConfigurationFastLaunchConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDistributionConfiguration.FastLaunchConfigurationProperty {
        val builder = CfnDistributionConfigurationFastLaunchConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies the launch template that the associated Windows AMI uses for launching an instance
     * when faster launching is enabled.
     *
     * You can specify either the `launchTemplateName` or the `launchTemplateId` , but not both.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * FastLaunchLaunchTemplateSpecificationProperty fastLaunchLaunchTemplateSpecificationProperty =
     * FastLaunchLaunchTemplateSpecificationProperty.builder()
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .launchTemplateVersion("launchTemplateVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification.html)
     */
    public inline fun cfnDistributionConfigurationFastLaunchLaunchTemplateSpecificationProperty(
        block:
            CfnDistributionConfigurationFastLaunchLaunchTemplateSpecificationPropertyDsl.(
            ) -> Unit =
            {}
    ): CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty {
        val builder = CfnDistributionConfigurationFastLaunchLaunchTemplateSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration settings for creating and managing pre-provisioned snapshots for a fast-launch
     * enabled Windows AMI.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * FastLaunchSnapshotConfigurationProperty fastLaunchSnapshotConfigurationProperty =
     * FastLaunchSnapshotConfigurationProperty.builder()
     * .targetResourceCount(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchsnapshotconfiguration.html)
     */
    public inline fun cfnDistributionConfigurationFastLaunchSnapshotConfigurationProperty(
        block: CfnDistributionConfigurationFastLaunchSnapshotConfigurationPropertyDsl.() -> Unit =
            {}
    ): CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty {
        val builder = CfnDistributionConfigurationFastLaunchSnapshotConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the configuration for a launch permission.
     *
     * The launch permission modification request is sent to the
     * [Amazon EC2 ModifyImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyImageAttribute.html)
     * API on behalf of the user for each Region they have selected to distribute the AMI. To make
     * an AMI public, set the launch permission authorized accounts to `all` . See the examples for
     * making an AMI public at
     * [Amazon EC2 ModifyImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyImageAttribute.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * LaunchPermissionConfigurationProperty launchPermissionConfigurationProperty =
     * LaunchPermissionConfigurationProperty.builder()
     * .organizationalUnitArns(List.of("organizationalUnitArns"))
     * .organizationArns(List.of("organizationArns"))
     * .userGroups(List.of("userGroups"))
     * .userIds(List.of("userIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchpermissionconfiguration.html)
     */
    public inline fun cfnDistributionConfigurationLaunchPermissionConfigurationProperty(
        block: CfnDistributionConfigurationLaunchPermissionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDistributionConfiguration.LaunchPermissionConfigurationProperty {
        val builder = CfnDistributionConfigurationLaunchPermissionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies an Amazon EC2 launch template to use for a specific account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * LaunchTemplateConfigurationProperty launchTemplateConfigurationProperty =
     * LaunchTemplateConfigurationProperty.builder()
     * .accountId("accountId")
     * .launchTemplateId("launchTemplateId")
     * .setDefaultVersion(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchtemplateconfiguration.html)
     */
    public inline fun cfnDistributionConfigurationLaunchTemplateConfigurationProperty(
        block: CfnDistributionConfigurationLaunchTemplateConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDistributionConfiguration.LaunchTemplateConfigurationProperty {
        val builder = CfnDistributionConfigurationLaunchTemplateConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDistributionConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * Object amiDistributionConfiguration;
     * Object containerDistributionConfiguration;
     * CfnDistributionConfigurationProps cfnDistributionConfigurationProps =
     * CfnDistributionConfigurationProps.builder()
     * .distributions(List.of(DistributionProperty.builder()
     * .region("region")
     * // the properties below are optional
     * .amiDistributionConfiguration(amiDistributionConfiguration)
     * .containerDistributionConfiguration(containerDistributionConfiguration)
     * .fastLaunchConfigurations(List.of(FastLaunchConfigurationProperty.builder()
     * .accountId("accountId")
     * .enabled(false)
     * .launchTemplate(FastLaunchLaunchTemplateSpecificationProperty.builder()
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .launchTemplateVersion("launchTemplateVersion")
     * .build())
     * .maxParallelLaunches(123)
     * .snapshotConfiguration(FastLaunchSnapshotConfigurationProperty.builder()
     * .targetResourceCount(123)
     * .build())
     * .build()))
     * .launchTemplateConfigurations(List.of(LaunchTemplateConfigurationProperty.builder()
     * .accountId("accountId")
     * .launchTemplateId("launchTemplateId")
     * .setDefaultVersion(false)
     * .build()))
     * .licenseConfigurationArns(List.of("licenseConfigurationArns"))
     * .build()))
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html)
     */
    public inline fun cfnDistributionConfigurationProps(
        block: CfnDistributionConfigurationPropsDsl.() -> Unit = {}
    ): CfnDistributionConfigurationProps {
        val builder = CfnDistributionConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The container repository where the output container image is stored.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * TargetContainerRepositoryProperty targetContainerRepositoryProperty =
     * TargetContainerRepositoryProperty.builder()
     * .repositoryName("repositoryName")
     * .service("service")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-targetcontainerrepository.html)
     */
    public inline fun cfnDistributionConfigurationTargetContainerRepositoryProperty(
        block: CfnDistributionConfigurationTargetContainerRepositoryPropertyDsl.() -> Unit = {}
    ): CfnDistributionConfiguration.TargetContainerRepositoryProperty {
        val builder = CfnDistributionConfigurationTargetContainerRepositoryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new image.
     *
     * This request will create a new image along with all of the configured output resources
     * defined in the distribution configuration. You must specify exactly one recipe for your
     * image, using either a ContainerRecipeArn or an ImageRecipeArn.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnImage cfnImage = CfnImage.Builder.create(this, "MyCfnImage")
     * .infrastructureConfigurationArn("infrastructureConfigurationArn")
     * // the properties below are optional
     * .containerRecipeArn("containerRecipeArn")
     * .distributionConfigurationArn("distributionConfigurationArn")
     * .enhancedImageMetadataEnabled(false)
     * .executionRole("executionRole")
     * .imageRecipeArn("imageRecipeArn")
     * .imageScanningConfiguration(ImageScanningConfigurationProperty.builder()
     * .ecrConfiguration(EcrConfigurationProperty.builder()
     * .containerTags(List.of("containerTags"))
     * .repositoryName("repositoryName")
     * .build())
     * .imageScanningEnabled(false)
     * .build())
     * .imageTestsConfiguration(ImageTestsConfigurationProperty.builder()
     * .imageTestsEnabled(false)
     * .timeoutMinutes(123)
     * .build())
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .workflows(List.of(WorkflowConfigurationProperty.builder()
     * .onFailure("onFailure")
     * .parallelGroup("parallelGroup")
     * .parameters(List.of(WorkflowParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build()))
     * .workflowArn("workflowArn")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html)
     */
    public inline fun cfnImage(
        scope: Construct,
        id: String,
        block: CfnImageDsl.() -> Unit = {},
    ): CfnImage {
        val builder = CfnImageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that Image Builder uses to configure the ECR repository and the output container
     * images that Amazon Inspector scans.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * EcrConfigurationProperty ecrConfigurationProperty = EcrConfigurationProperty.builder()
     * .containerTags(List.of("containerTags"))
     * .repositoryName("repositoryName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-ecrconfiguration.html)
     */
    public inline fun cfnImageEcrConfigurationProperty(
        block: CfnImageEcrConfigurationPropertyDsl.() -> Unit = {}
    ): CfnImage.EcrConfigurationProperty {
        val builder = CfnImageEcrConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains settings for Image Builder image resource and container image scans.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ImageScanningConfigurationProperty imageScanningConfigurationProperty =
     * ImageScanningConfigurationProperty.builder()
     * .ecrConfiguration(EcrConfigurationProperty.builder()
     * .containerTags(List.of("containerTags"))
     * .repositoryName("repositoryName")
     * .build())
     * .imageScanningEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-imagescanningconfiguration.html)
     */
    public inline fun cfnImageImageScanningConfigurationProperty(
        block: CfnImageImageScanningConfigurationPropertyDsl.() -> Unit = {}
    ): CfnImage.ImageScanningConfigurationProperty {
        val builder = CfnImageImageScanningConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you create an image or container recipe with Image Builder , you can add the build or
     * test components that are used to create the final image.
     *
     * You must have at least one build component to create a recipe, but test components are not
     * required. If you have added tests, they run after the image is created, to ensure that the
     * target image is functional and can be used reliably for launching Amazon EC2 instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ImageTestsConfigurationProperty imageTestsConfigurationProperty =
     * ImageTestsConfigurationProperty.builder()
     * .imageTestsEnabled(false)
     * .timeoutMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-imagetestsconfiguration.html)
     */
    public inline fun cfnImageImageTestsConfigurationProperty(
        block: CfnImageImageTestsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnImage.ImageTestsConfigurationProperty {
        val builder = CfnImageImageTestsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An image pipeline is the automation configuration for building secure OS images on AWS .
     *
     * The Image Builder image pipeline is associated with an image recipe that defines the build,
     * validation, and test phases for an image build lifecycle. An image pipeline can be associated
     * with an infrastructure configuration that defines where your image is built. You can define
     * attributes, such as instance types, a subnet for your VPC, security groups, logging, and
     * other infrastructure-related configurations. You can also associate your image pipeline with
     * a distribution configuration to define how you would like to deploy your image.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnImagePipeline cfnImagePipeline = CfnImagePipeline.Builder.create(this, "MyCfnImagePipeline")
     * .infrastructureConfigurationArn("infrastructureConfigurationArn")
     * .name("name")
     * // the properties below are optional
     * .containerRecipeArn("containerRecipeArn")
     * .description("description")
     * .distributionConfigurationArn("distributionConfigurationArn")
     * .enhancedImageMetadataEnabled(false)
     * .executionRole("executionRole")
     * .imageRecipeArn("imageRecipeArn")
     * .imageScanningConfiguration(ImageScanningConfigurationProperty.builder()
     * .ecrConfiguration(EcrConfigurationProperty.builder()
     * .containerTags(List.of("containerTags"))
     * .repositoryName("repositoryName")
     * .build())
     * .imageScanningEnabled(false)
     * .build())
     * .imageTestsConfiguration(ImageTestsConfigurationProperty.builder()
     * .imageTestsEnabled(false)
     * .timeoutMinutes(123)
     * .build())
     * .schedule(ScheduleProperty.builder()
     * .pipelineExecutionStartCondition("pipelineExecutionStartCondition")
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .status("status")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .workflows(List.of(WorkflowConfigurationProperty.builder()
     * .onFailure("onFailure")
     * .parallelGroup("parallelGroup")
     * .parameters(List.of(WorkflowParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build()))
     * .workflowArn("workflowArn")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html)
     */
    public inline fun cfnImagePipeline(
        scope: Construct,
        id: String,
        block: CfnImagePipelineDsl.() -> Unit = {},
    ): CfnImagePipeline {
        val builder = CfnImagePipelineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that Image Builder uses to configure the ECR repository and the output container
     * images that Amazon Inspector scans.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * EcrConfigurationProperty ecrConfigurationProperty = EcrConfigurationProperty.builder()
     * .containerTags(List.of("containerTags"))
     * .repositoryName("repositoryName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-ecrconfiguration.html)
     */
    public inline fun cfnImagePipelineEcrConfigurationProperty(
        block: CfnImagePipelineEcrConfigurationPropertyDsl.() -> Unit = {}
    ): CfnImagePipeline.EcrConfigurationProperty {
        val builder = CfnImagePipelineEcrConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains settings for Image Builder image resource and container image scans.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ImageScanningConfigurationProperty imageScanningConfigurationProperty =
     * ImageScanningConfigurationProperty.builder()
     * .ecrConfiguration(EcrConfigurationProperty.builder()
     * .containerTags(List.of("containerTags"))
     * .repositoryName("repositoryName")
     * .build())
     * .imageScanningEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagescanningconfiguration.html)
     */
    public inline fun cfnImagePipelineImageScanningConfigurationProperty(
        block: CfnImagePipelineImageScanningConfigurationPropertyDsl.() -> Unit = {}
    ): CfnImagePipeline.ImageScanningConfigurationProperty {
        val builder = CfnImagePipelineImageScanningConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you create an image or container recipe with Image Builder , you can add the build or
     * test components that your image pipeline uses to create the final image.
     *
     * You must have at least one build component to create a recipe, but test components are not
     * required. Your pipeline runs tests after it builds the image, to ensure that the target image
     * is functional and can be used reliably for launching Amazon EC2 instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ImageTestsConfigurationProperty imageTestsConfigurationProperty =
     * ImageTestsConfigurationProperty.builder()
     * .imageTestsEnabled(false)
     * .timeoutMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html)
     */
    public inline fun cfnImagePipelineImageTestsConfigurationProperty(
        block: CfnImagePipelineImageTestsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnImagePipeline.ImageTestsConfigurationProperty {
        val builder = CfnImagePipelineImageTestsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnImagePipeline`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnImagePipelineProps cfnImagePipelineProps = CfnImagePipelineProps.builder()
     * .infrastructureConfigurationArn("infrastructureConfigurationArn")
     * .name("name")
     * // the properties below are optional
     * .containerRecipeArn("containerRecipeArn")
     * .description("description")
     * .distributionConfigurationArn("distributionConfigurationArn")
     * .enhancedImageMetadataEnabled(false)
     * .executionRole("executionRole")
     * .imageRecipeArn("imageRecipeArn")
     * .imageScanningConfiguration(ImageScanningConfigurationProperty.builder()
     * .ecrConfiguration(EcrConfigurationProperty.builder()
     * .containerTags(List.of("containerTags"))
     * .repositoryName("repositoryName")
     * .build())
     * .imageScanningEnabled(false)
     * .build())
     * .imageTestsConfiguration(ImageTestsConfigurationProperty.builder()
     * .imageTestsEnabled(false)
     * .timeoutMinutes(123)
     * .build())
     * .schedule(ScheduleProperty.builder()
     * .pipelineExecutionStartCondition("pipelineExecutionStartCondition")
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .status("status")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .workflows(List.of(WorkflowConfigurationProperty.builder()
     * .onFailure("onFailure")
     * .parallelGroup("parallelGroup")
     * .parameters(List.of(WorkflowParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build()))
     * .workflowArn("workflowArn")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html)
     */
    public inline fun cfnImagePipelineProps(
        block: CfnImagePipelinePropsDsl.() -> Unit = {}
    ): CfnImagePipelineProps {
        val builder = CfnImagePipelinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A schedule configures when and how often a pipeline will automatically create a new image.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
     * .pipelineExecutionStartCondition("pipelineExecutionStartCondition")
     * .scheduleExpression("scheduleExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html)
     */
    public inline fun cfnImagePipelineScheduleProperty(
        block: CfnImagePipelineSchedulePropertyDsl.() -> Unit = {}
    ): CfnImagePipeline.ScheduleProperty {
        val builder = CfnImagePipelineSchedulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains control settings and configurable inputs for a workflow resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * WorkflowConfigurationProperty workflowConfigurationProperty =
     * WorkflowConfigurationProperty.builder()
     * .onFailure("onFailure")
     * .parallelGroup("parallelGroup")
     * .parameters(List.of(WorkflowParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build()))
     * .workflowArn("workflowArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowconfiguration.html)
     */
    public inline fun cfnImagePipelineWorkflowConfigurationProperty(
        block: CfnImagePipelineWorkflowConfigurationPropertyDsl.() -> Unit = {}
    ): CfnImagePipeline.WorkflowConfigurationProperty {
        val builder = CfnImagePipelineWorkflowConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains a key/value pair that sets the named workflow parameter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * WorkflowParameterProperty workflowParameterProperty = WorkflowParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowparameter.html)
     */
    public inline fun cfnImagePipelineWorkflowParameterProperty(
        block: CfnImagePipelineWorkflowParameterPropertyDsl.() -> Unit = {}
    ): CfnImagePipeline.WorkflowParameterProperty {
        val builder = CfnImagePipelineWorkflowParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnImage`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnImageProps cfnImageProps = CfnImageProps.builder()
     * .infrastructureConfigurationArn("infrastructureConfigurationArn")
     * // the properties below are optional
     * .containerRecipeArn("containerRecipeArn")
     * .distributionConfigurationArn("distributionConfigurationArn")
     * .enhancedImageMetadataEnabled(false)
     * .executionRole("executionRole")
     * .imageRecipeArn("imageRecipeArn")
     * .imageScanningConfiguration(ImageScanningConfigurationProperty.builder()
     * .ecrConfiguration(EcrConfigurationProperty.builder()
     * .containerTags(List.of("containerTags"))
     * .repositoryName("repositoryName")
     * .build())
     * .imageScanningEnabled(false)
     * .build())
     * .imageTestsConfiguration(ImageTestsConfigurationProperty.builder()
     * .imageTestsEnabled(false)
     * .timeoutMinutes(123)
     * .build())
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .workflows(List.of(WorkflowConfigurationProperty.builder()
     * .onFailure("onFailure")
     * .parallelGroup("parallelGroup")
     * .parameters(List.of(WorkflowParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build()))
     * .workflowArn("workflowArn")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html)
     */
    public inline fun cfnImageProps(block: CfnImagePropsDsl.() -> Unit = {}): CfnImageProps {
        val builder = CfnImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An Image Builder image recipe is a document that defines the base image and the components to
     * be applied to the base image to produce the desired configuration for the output image.
     *
     * You can use an image recipe to duplicate builds. Image Builder image recipes can be shared,
     * branched, and edited using the console wizard, the AWS CLI , or the API. You can use image
     * recipes with your version control software to maintain shareable versioned image recipes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnImageRecipe cfnImageRecipe = CfnImageRecipe.Builder.create(this, "MyCfnImageRecipe")
     * .components(List.of(ComponentConfigurationProperty.builder()
     * .componentArn("componentArn")
     * .parameters(List.of(ComponentParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build()))
     * .build()))
     * .name("name")
     * .parentImage("parentImage")
     * .version("version")
     * // the properties below are optional
     * .additionalInstanceConfiguration(AdditionalInstanceConfigurationProperty.builder()
     * .systemsManagerAgent(SystemsManagerAgentProperty.builder()
     * .uninstallAfterBuild(false)
     * .build())
     * .userDataOverride("userDataOverride")
     * .build())
     * .blockDeviceMappings(List.of(InstanceBlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * .ebs(EbsInstanceBlockDeviceSpecificationProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build()))
     * .description("description")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html)
     */
    public inline fun cfnImageRecipe(
        scope: Construct,
        id: String,
        block: CfnImageRecipeDsl.() -> Unit = {},
    ): CfnImageRecipe {
        val builder = CfnImageRecipeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * In addition to your infrastructure configuration, these settings provide an extra layer of
     * control over your build instances.
     *
     * You can also specify commands to run on launch for all of your build instances.
     *
     * Image Builder does not automatically install the Systems Manager agent on Windows instances.
     * If your base image includes the Systems Manager agent, then the AMI that you create will also
     * include the agent. For Linux instances, if the base image does not already include the
     * Systems Manager agent, Image Builder installs it. For Linux instances where Image Builder
     * installs the Systems Manager agent, you can choose whether to keep it for the AMI that you
     * create.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * AdditionalInstanceConfigurationProperty additionalInstanceConfigurationProperty =
     * AdditionalInstanceConfigurationProperty.builder()
     * .systemsManagerAgent(SystemsManagerAgentProperty.builder()
     * .uninstallAfterBuild(false)
     * .build())
     * .userDataOverride("userDataOverride")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-additionalinstanceconfiguration.html)
     */
    public inline fun cfnImageRecipeAdditionalInstanceConfigurationProperty(
        block: CfnImageRecipeAdditionalInstanceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnImageRecipe.AdditionalInstanceConfigurationProperty {
        val builder = CfnImageRecipeAdditionalInstanceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration details of the component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ComponentConfigurationProperty componentConfigurationProperty =
     * ComponentConfigurationProperty.builder()
     * .componentArn("componentArn")
     * .parameters(List.of(ComponentParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentconfiguration.html)
     */
    public inline fun cfnImageRecipeComponentConfigurationProperty(
        block: CfnImageRecipeComponentConfigurationPropertyDsl.() -> Unit = {}
    ): CfnImageRecipe.ComponentConfigurationProperty {
        val builder = CfnImageRecipeComponentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains a key/value pair that sets the named component parameter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ComponentParameterProperty componentParameterProperty = ComponentParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-componentparameter.html)
     */
    public inline fun cfnImageRecipeComponentParameterProperty(
        block: CfnImageRecipeComponentParameterPropertyDsl.() -> Unit = {}
    ): CfnImageRecipe.ComponentParameterProperty {
        val builder = CfnImageRecipeComponentParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The image recipe EBS instance block device specification includes the Amazon EBS-specific
     * block device mapping specifications for the image.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * EbsInstanceBlockDeviceSpecificationProperty ebsInstanceBlockDeviceSpecificationProperty =
     * EbsInstanceBlockDeviceSpecificationProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html)
     */
    public inline fun cfnImageRecipeEbsInstanceBlockDeviceSpecificationProperty(
        block: CfnImageRecipeEbsInstanceBlockDeviceSpecificationPropertyDsl.() -> Unit = {}
    ): CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty {
        val builder = CfnImageRecipeEbsInstanceBlockDeviceSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines block device mappings for the instance used to configure your image.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * InstanceBlockDeviceMappingProperty instanceBlockDeviceMappingProperty =
     * InstanceBlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * .ebs(EbsInstanceBlockDeviceSpecificationProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-instanceblockdevicemapping.html)
     */
    public inline fun cfnImageRecipeInstanceBlockDeviceMappingProperty(
        block: CfnImageRecipeInstanceBlockDeviceMappingPropertyDsl.() -> Unit = {}
    ): CfnImageRecipe.InstanceBlockDeviceMappingProperty {
        val builder = CfnImageRecipeInstanceBlockDeviceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnImageRecipe`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnImageRecipeProps cfnImageRecipeProps = CfnImageRecipeProps.builder()
     * .components(List.of(ComponentConfigurationProperty.builder()
     * .componentArn("componentArn")
     * .parameters(List.of(ComponentParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build()))
     * .build()))
     * .name("name")
     * .parentImage("parentImage")
     * .version("version")
     * // the properties below are optional
     * .additionalInstanceConfiguration(AdditionalInstanceConfigurationProperty.builder()
     * .systemsManagerAgent(SystemsManagerAgentProperty.builder()
     * .uninstallAfterBuild(false)
     * .build())
     * .userDataOverride("userDataOverride")
     * .build())
     * .blockDeviceMappings(List.of(InstanceBlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * .ebs(EbsInstanceBlockDeviceSpecificationProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .kmsKeyId("kmsKeyId")
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice("noDevice")
     * .virtualName("virtualName")
     * .build()))
     * .description("description")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagerecipe.html)
     */
    public inline fun cfnImageRecipeProps(
        block: CfnImageRecipePropsDsl.() -> Unit = {}
    ): CfnImageRecipeProps {
        val builder = CfnImageRecipePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains settings for the Systems Manager agent on your build instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * SystemsManagerAgentProperty systemsManagerAgentProperty = SystemsManagerAgentProperty.builder()
     * .uninstallAfterBuild(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-systemsmanageragent.html)
     */
    public inline fun cfnImageRecipeSystemsManagerAgentProperty(
        block: CfnImageRecipeSystemsManagerAgentPropertyDsl.() -> Unit = {}
    ): CfnImageRecipe.SystemsManagerAgentProperty {
        val builder = CfnImageRecipeSystemsManagerAgentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains control settings and configurable inputs for a workflow resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * WorkflowConfigurationProperty workflowConfigurationProperty =
     * WorkflowConfigurationProperty.builder()
     * .onFailure("onFailure")
     * .parallelGroup("parallelGroup")
     * .parameters(List.of(WorkflowParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build()))
     * .workflowArn("workflowArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowconfiguration.html)
     */
    public inline fun cfnImageWorkflowConfigurationProperty(
        block: CfnImageWorkflowConfigurationPropertyDsl.() -> Unit = {}
    ): CfnImage.WorkflowConfigurationProperty {
        val builder = CfnImageWorkflowConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains a key/value pair that sets the named workflow parameter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * WorkflowParameterProperty workflowParameterProperty = WorkflowParameterProperty.builder()
     * .name("name")
     * .value(List.of("value"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowparameter.html)
     */
    public inline fun cfnImageWorkflowParameterProperty(
        block: CfnImageWorkflowParameterPropertyDsl.() -> Unit = {}
    ): CfnImage.WorkflowParameterProperty {
        val builder = CfnImageWorkflowParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The infrastructure configuration allows you to specify the infrastructure within which to
     * build and test your image.
     *
     * In the infrastructure configuration, you can specify instance types, subnets, and security
     * groups to associate with your instance. You can also associate an Amazon EC2 key pair with
     * the instance used to build your image. This allows you to log on to your instance to
     * troubleshoot if your build fails and you set terminateInstanceOnFailure to false.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnInfrastructureConfiguration cfnInfrastructureConfiguration =
     * CfnInfrastructureConfiguration.Builder.create(this, "MyCfnInfrastructureConfiguration")
     * .instanceProfileName("instanceProfileName")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .instanceMetadataOptions(InstanceMetadataOptionsProperty.builder()
     * .httpPutResponseHopLimit(123)
     * .httpTokens("httpTokens")
     * .build())
     * .instanceTypes(List.of("instanceTypes"))
     * .keyPair("keyPair")
     * .logging(LoggingProperty.builder()
     * .s3Logs(S3LogsProperty.builder()
     * .s3BucketName("s3BucketName")
     * .s3KeyPrefix("s3KeyPrefix")
     * .build())
     * .build())
     * .resourceTags(Map.of(
     * "resourceTagsKey", "resourceTags"))
     * .securityGroupIds(List.of("securityGroupIds"))
     * .snsTopicArn("snsTopicArn")
     * .subnetId("subnetId")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .terminateInstanceOnFailure(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html)
     */
    public inline fun cfnInfrastructureConfiguration(
        scope: Construct,
        id: String,
        block: CfnInfrastructureConfigurationDsl.() -> Unit = {},
    ): CfnInfrastructureConfiguration {
        val builder = CfnInfrastructureConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The instance metadata options that apply to the HTTP requests that pipeline builds use to
     * launch EC2 build and test instances.
     *
     * For more information about instance metadata options, see
     * [Configure the instance metadata options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-instance-metadata-options.html)
     * in the **Amazon EC2 User Guide** for Linux instances, or
     * [Configure the instance metadata options](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/configuring-instance-metadata-options.html)
     * in the **Amazon EC2 Windows Guide** for Windows instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * InstanceMetadataOptionsProperty instanceMetadataOptionsProperty =
     * InstanceMetadataOptionsProperty.builder()
     * .httpPutResponseHopLimit(123)
     * .httpTokens("httpTokens")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-instancemetadataoptions.html)
     */
    public inline fun cfnInfrastructureConfigurationInstanceMetadataOptionsProperty(
        block: CfnInfrastructureConfigurationInstanceMetadataOptionsPropertyDsl.() -> Unit = {}
    ): CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty {
        val builder = CfnInfrastructureConfigurationInstanceMetadataOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Logging configuration defines where Image Builder uploads your logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * LoggingProperty loggingProperty = LoggingProperty.builder()
     * .s3Logs(S3LogsProperty.builder()
     * .s3BucketName("s3BucketName")
     * .s3KeyPrefix("s3KeyPrefix")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-logging.html)
     */
    public inline fun cfnInfrastructureConfigurationLoggingProperty(
        block: CfnInfrastructureConfigurationLoggingPropertyDsl.() -> Unit = {}
    ): CfnInfrastructureConfiguration.LoggingProperty {
        val builder = CfnInfrastructureConfigurationLoggingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInfrastructureConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnInfrastructureConfigurationProps cfnInfrastructureConfigurationProps =
     * CfnInfrastructureConfigurationProps.builder()
     * .instanceProfileName("instanceProfileName")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .instanceMetadataOptions(InstanceMetadataOptionsProperty.builder()
     * .httpPutResponseHopLimit(123)
     * .httpTokens("httpTokens")
     * .build())
     * .instanceTypes(List.of("instanceTypes"))
     * .keyPair("keyPair")
     * .logging(LoggingProperty.builder()
     * .s3Logs(S3LogsProperty.builder()
     * .s3BucketName("s3BucketName")
     * .s3KeyPrefix("s3KeyPrefix")
     * .build())
     * .build())
     * .resourceTags(Map.of(
     * "resourceTagsKey", "resourceTags"))
     * .securityGroupIds(List.of("securityGroupIds"))
     * .snsTopicArn("snsTopicArn")
     * .subnetId("subnetId")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .terminateInstanceOnFailure(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html)
     */
    public inline fun cfnInfrastructureConfigurationProps(
        block: CfnInfrastructureConfigurationPropsDsl.() -> Unit = {}
    ): CfnInfrastructureConfigurationProps {
        val builder = CfnInfrastructureConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon S3 logging configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * S3LogsProperty s3LogsProperty = S3LogsProperty.builder()
     * .s3BucketName("s3BucketName")
     * .s3KeyPrefix("s3KeyPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-s3logs.html)
     */
    public inline fun cfnInfrastructureConfigurationS3LogsProperty(
        block: CfnInfrastructureConfigurationS3LogsPropertyDsl.() -> Unit = {}
    ): CfnInfrastructureConfiguration.S3LogsProperty {
        val builder = CfnInfrastructureConfigurationS3LogsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a lifecycle policy resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnLifecyclePolicy cfnLifecyclePolicy = CfnLifecyclePolicy.Builder.create(this,
     * "MyCfnLifecyclePolicy")
     * .executionRole("executionRole")
     * .name("name")
     * .policyDetails(List.of(PolicyDetailProperty.builder()
     * .action(ActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .includeResources(IncludeResourcesProperty.builder()
     * .amis(false)
     * .containers(false)
     * .snapshots(false)
     * .build())
     * .build())
     * .filter(FilterProperty.builder()
     * .type("type")
     * .value(123)
     * // the properties below are optional
     * .retainAtLeast(123)
     * .unit("unit")
     * .build())
     * // the properties below are optional
     * .exclusionRules(ExclusionRulesProperty.builder()
     * .amis(AmiExclusionRulesProperty.builder()
     * .isPublic(false)
     * .lastLaunched(LastLaunchedProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .regions(List.of("regions"))
     * .sharedAccounts(List.of("sharedAccounts"))
     * .tagMap(Map.of(
     * "tagMapKey", "tagMap"))
     * .build())
     * .tagMap(Map.of(
     * "tagMapKey", "tagMap"))
     * .build())
     * .build()))
     * .resourceSelection(ResourceSelectionProperty.builder()
     * .recipes(List.of(RecipeSelectionProperty.builder()
     * .name("name")
     * .semanticVersion("semanticVersion")
     * .build()))
     * .tagMap(Map.of(
     * "tagMapKey", "tagMap"))
     * .build())
     * .resourceType("resourceType")
     * // the properties below are optional
     * .description("description")
     * .status("status")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html)
     */
    public inline fun cfnLifecyclePolicy(
        scope: Construct,
        id: String,
        block: CfnLifecyclePolicyDsl.() -> Unit = {},
    ): CfnLifecyclePolicy {
        val builder = CfnLifecyclePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains selection criteria for the lifecycle policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ActionProperty actionProperty = ActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .includeResources(IncludeResourcesProperty.builder()
     * .amis(false)
     * .containers(false)
     * .snapshots(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-action.html)
     */
    public inline fun cfnLifecyclePolicyActionProperty(
        block: CfnLifecyclePolicyActionPropertyDsl.() -> Unit = {}
    ): CfnLifecyclePolicy.ActionProperty {
        val builder = CfnLifecyclePolicyActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines criteria for AMIs that are excluded from lifecycle actions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * AmiExclusionRulesProperty amiExclusionRulesProperty = AmiExclusionRulesProperty.builder()
     * .isPublic(false)
     * .lastLaunched(LastLaunchedProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .regions(List.of("regions"))
     * .sharedAccounts(List.of("sharedAccounts"))
     * .tagMap(Map.of(
     * "tagMapKey", "tagMap"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html)
     */
    public inline fun cfnLifecyclePolicyAmiExclusionRulesProperty(
        block: CfnLifecyclePolicyAmiExclusionRulesPropertyDsl.() -> Unit = {}
    ): CfnLifecyclePolicy.AmiExclusionRulesProperty {
        val builder = CfnLifecyclePolicyAmiExclusionRulesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies resources that lifecycle policy actions should not apply to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ExclusionRulesProperty exclusionRulesProperty = ExclusionRulesProperty.builder()
     * .amis(AmiExclusionRulesProperty.builder()
     * .isPublic(false)
     * .lastLaunched(LastLaunchedProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .regions(List.of("regions"))
     * .sharedAccounts(List.of("sharedAccounts"))
     * .tagMap(Map.of(
     * "tagMapKey", "tagMap"))
     * .build())
     * .tagMap(Map.of(
     * "tagMapKey", "tagMap"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-exclusionrules.html)
     */
    public inline fun cfnLifecyclePolicyExclusionRulesProperty(
        block: CfnLifecyclePolicyExclusionRulesPropertyDsl.() -> Unit = {}
    ): CfnLifecyclePolicy.ExclusionRulesProperty {
        val builder = CfnLifecyclePolicyExclusionRulesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines filters that the lifecycle policy uses to determine impacted resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * FilterProperty filterProperty = FilterProperty.builder()
     * .type("type")
     * .value(123)
     * // the properties below are optional
     * .retainAtLeast(123)
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-filter.html)
     */
    public inline fun cfnLifecyclePolicyFilterProperty(
        block: CfnLifecyclePolicyFilterPropertyDsl.() -> Unit = {}
    ): CfnLifecyclePolicy.FilterProperty {
        val builder = CfnLifecyclePolicyFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how the lifecycle policy should apply actions to selected resources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * IncludeResourcesProperty includeResourcesProperty = IncludeResourcesProperty.builder()
     * .amis(false)
     * .containers(false)
     * .snapshots(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-includeresources.html)
     */
    public inline fun cfnLifecyclePolicyIncludeResourcesProperty(
        block: CfnLifecyclePolicyIncludeResourcesPropertyDsl.() -> Unit = {}
    ): CfnLifecyclePolicy.IncludeResourcesProperty {
        val builder = CfnLifecyclePolicyIncludeResourcesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines criteria to exclude AMIs from lifecycle actions based on the last time they were used
     * to launch an instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * LastLaunchedProperty lastLaunchedProperty = LastLaunchedProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-lastlaunched.html)
     */
    public inline fun cfnLifecyclePolicyLastLaunchedProperty(
        block: CfnLifecyclePolicyLastLaunchedPropertyDsl.() -> Unit = {}
    ): CfnLifecyclePolicy.LastLaunchedProperty {
        val builder = CfnLifecyclePolicyLastLaunchedPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration details for a lifecycle policy resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * PolicyDetailProperty policyDetailProperty = PolicyDetailProperty.builder()
     * .action(ActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .includeResources(IncludeResourcesProperty.builder()
     * .amis(false)
     * .containers(false)
     * .snapshots(false)
     * .build())
     * .build())
     * .filter(FilterProperty.builder()
     * .type("type")
     * .value(123)
     * // the properties below are optional
     * .retainAtLeast(123)
     * .unit("unit")
     * .build())
     * // the properties below are optional
     * .exclusionRules(ExclusionRulesProperty.builder()
     * .amis(AmiExclusionRulesProperty.builder()
     * .isPublic(false)
     * .lastLaunched(LastLaunchedProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .regions(List.of("regions"))
     * .sharedAccounts(List.of("sharedAccounts"))
     * .tagMap(Map.of(
     * "tagMapKey", "tagMap"))
     * .build())
     * .tagMap(Map.of(
     * "tagMapKey", "tagMap"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-policydetail.html)
     */
    public inline fun cfnLifecyclePolicyPolicyDetailProperty(
        block: CfnLifecyclePolicyPolicyDetailPropertyDsl.() -> Unit = {}
    ): CfnLifecyclePolicy.PolicyDetailProperty {
        val builder = CfnLifecyclePolicyPolicyDetailPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLifecyclePolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnLifecyclePolicyProps cfnLifecyclePolicyProps = CfnLifecyclePolicyProps.builder()
     * .executionRole("executionRole")
     * .name("name")
     * .policyDetails(List.of(PolicyDetailProperty.builder()
     * .action(ActionProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .includeResources(IncludeResourcesProperty.builder()
     * .amis(false)
     * .containers(false)
     * .snapshots(false)
     * .build())
     * .build())
     * .filter(FilterProperty.builder()
     * .type("type")
     * .value(123)
     * // the properties below are optional
     * .retainAtLeast(123)
     * .unit("unit")
     * .build())
     * // the properties below are optional
     * .exclusionRules(ExclusionRulesProperty.builder()
     * .amis(AmiExclusionRulesProperty.builder()
     * .isPublic(false)
     * .lastLaunched(LastLaunchedProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .regions(List.of("regions"))
     * .sharedAccounts(List.of("sharedAccounts"))
     * .tagMap(Map.of(
     * "tagMapKey", "tagMap"))
     * .build())
     * .tagMap(Map.of(
     * "tagMapKey", "tagMap"))
     * .build())
     * .build()))
     * .resourceSelection(ResourceSelectionProperty.builder()
     * .recipes(List.of(RecipeSelectionProperty.builder()
     * .name("name")
     * .semanticVersion("semanticVersion")
     * .build()))
     * .tagMap(Map.of(
     * "tagMapKey", "tagMap"))
     * .build())
     * .resourceType("resourceType")
     * // the properties below are optional
     * .description("description")
     * .status("status")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html)
     */
    public inline fun cfnLifecyclePolicyProps(
        block: CfnLifecyclePolicyPropsDsl.() -> Unit = {}
    ): CfnLifecyclePolicyProps {
        val builder = CfnLifecyclePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Image Builder recipe that the lifecycle policy uses for resource selection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * RecipeSelectionProperty recipeSelectionProperty = RecipeSelectionProperty.builder()
     * .name("name")
     * .semanticVersion("semanticVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-recipeselection.html)
     */
    public inline fun cfnLifecyclePolicyRecipeSelectionProperty(
        block: CfnLifecyclePolicyRecipeSelectionPropertyDsl.() -> Unit = {}
    ): CfnLifecyclePolicy.RecipeSelectionProperty {
        val builder = CfnLifecyclePolicyRecipeSelectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Resource selection criteria for the lifecycle policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * ResourceSelectionProperty resourceSelectionProperty = ResourceSelectionProperty.builder()
     * .recipes(List.of(RecipeSelectionProperty.builder()
     * .name("name")
     * .semanticVersion("semanticVersion")
     * .build()))
     * .tagMap(Map.of(
     * "tagMapKey", "tagMap"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-resourceselection.html)
     */
    public inline fun cfnLifecyclePolicyResourceSelectionProperty(
        block: CfnLifecyclePolicyResourceSelectionPropertyDsl.() -> Unit = {}
    ): CfnLifecyclePolicy.ResourceSelectionProperty {
        val builder = CfnLifecyclePolicyResourceSelectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a new workflow or a new version of an existing workflow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnWorkflow cfnWorkflow = CfnWorkflow.Builder.create(this, "MyCfnWorkflow")
     * .name("name")
     * .type("type")
     * .version("version")
     * // the properties below are optional
     * .changeDescription("changeDescription")
     * .data("data")
     * .description("description")
     * .kmsKeyId("kmsKeyId")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .uri("uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html)
     */
    public inline fun cfnWorkflow(
        scope: Construct,
        id: String,
        block: CfnWorkflowDsl.() -> Unit = {},
    ): CfnWorkflow {
        val builder = CfnWorkflowDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWorkflow`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.imagebuilder.*;
     * CfnWorkflowProps cfnWorkflowProps = CfnWorkflowProps.builder()
     * .name("name")
     * .type("type")
     * .version("version")
     * // the properties below are optional
     * .changeDescription("changeDescription")
     * .data("data")
     * .description("description")
     * .kmsKeyId("kmsKeyId")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .uri("uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-workflow.html)
     */
    public inline fun cfnWorkflowProps(
        block: CfnWorkflowPropsDsl.() -> Unit = {}
    ): CfnWorkflowProps {
        val builder = CfnWorkflowPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
