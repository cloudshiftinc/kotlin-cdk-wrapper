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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline
import software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps

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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html)
 */
@CdkDslMarker
public class CfnImagePipelinePropsDsl {
    private val cdkBuilder: CfnImagePipelineProps.Builder = CfnImagePipelineProps.builder()

    /**
     * @param containerRecipeArn The Amazon Resource Name (ARN) of the container recipe that is used
     *   for this pipeline.
     */
    public fun containerRecipeArn(containerRecipeArn: String) {
        cdkBuilder.containerRecipeArn(containerRecipeArn)
    }

    /** @param description The description of this image pipeline. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param distributionConfigurationArn The Amazon Resource Name (ARN) of the distribution
     *   configuration associated with this image pipeline.
     */
    public fun distributionConfigurationArn(distributionConfigurationArn: String) {
        cdkBuilder.distributionConfigurationArn(distributionConfigurationArn)
    }

    /**
     * @param enhancedImageMetadataEnabled Collects additional information about the image being
     *   created, including the operating system (OS) version and package list. This information is
     *   used to enhance the overall experience of using EC2 Image Builder. Enabled by default.
     */
    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean) {
        cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
    }

    /**
     * @param enhancedImageMetadataEnabled Collects additional information about the image being
     *   created, including the operating system (OS) version and package list. This information is
     *   used to enhance the overall experience of using EC2 Image Builder. Enabled by default.
     */
    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable) {
        cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
    }

    /**
     * @param imageRecipeArn The Amazon Resource Name (ARN) of the image recipe associated with this
     *   image pipeline.
     */
    public fun imageRecipeArn(imageRecipeArn: String) {
        cdkBuilder.imageRecipeArn(imageRecipeArn)
    }

    /**
     * @param imageScanningConfiguration Determines if tests should run after building the image.
     *   Image Builder defaults to enable tests to run following the image build, before image
     *   distribution.
     */
    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
        cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
    }

    /**
     * @param imageScanningConfiguration Determines if tests should run after building the image.
     *   Image Builder defaults to enable tests to run following the image build, before image
     *   distribution.
     */
    public fun imageScanningConfiguration(
        imageScanningConfiguration: CfnImagePipeline.ImageScanningConfigurationProperty
    ) {
        cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
    }

    /**
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     *   creation to ensure the quality of the image that was created.
     */
    public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
        cdkBuilder.imageTestsConfiguration(imageTestsConfiguration)
    }

    /**
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     *   creation to ensure the quality of the image that was created.
     */
    public fun imageTestsConfiguration(
        imageTestsConfiguration: CfnImagePipeline.ImageTestsConfigurationProperty
    ) {
        cdkBuilder.imageTestsConfiguration(imageTestsConfiguration)
    }

    /**
     * @param infrastructureConfigurationArn The Amazon Resource Name (ARN) of the infrastructure
     *   configuration associated with this image pipeline.
     */
    public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
        cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
    }

    /** @param name The name of the image pipeline. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param schedule The schedule of the image pipeline. A schedule configures how often and when
     *   a pipeline automatically creates a new image.
     */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param schedule The schedule of the image pipeline. A schedule configures how often and when
     *   a pipeline automatically creates a new image.
     */
    public fun schedule(schedule: CfnImagePipeline.ScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    /** @param status The status of the image pipeline. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param tags The tags of this image pipeline. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnImagePipelineProps = cdkBuilder.build()
}
