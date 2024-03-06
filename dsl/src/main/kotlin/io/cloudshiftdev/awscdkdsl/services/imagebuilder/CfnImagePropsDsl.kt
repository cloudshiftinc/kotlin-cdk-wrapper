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
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImage
import software.amazon.awscdk.services.imagebuilder.CfnImageProps

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
@CdkDslMarker
public class CfnImagePropsDsl {
    private val cdkBuilder: CfnImageProps.Builder = CfnImageProps.builder()

    private val _workflows: MutableList<Any> = mutableListOf()

    /**
     * @param containerRecipeArn The Amazon Resource Name (ARN) of the container recipe that defines
     *   how images are configured and tested.
     */
    public fun containerRecipeArn(containerRecipeArn: String) {
        cdkBuilder.containerRecipeArn(containerRecipeArn)
    }

    /**
     * @param distributionConfigurationArn The Amazon Resource Name (ARN) of the distribution
     *   configuration that defines and configures the outputs of your pipeline.
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
     * @param executionRole The name or Amazon Resource Name (ARN) for the IAM role you create that
     *   grants Image Builder access to perform workflow actions.
     */
    public fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
    }

    /**
     * @param imageRecipeArn The Amazon Resource Name (ARN) of the image recipe that defines how
     *   images are configured, tested, and assessed.
     */
    public fun imageRecipeArn(imageRecipeArn: String) {
        cdkBuilder.imageRecipeArn(imageRecipeArn)
    }

    /** @param imageScanningConfiguration Contains settings for vulnerability scans. */
    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
        cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
    }

    /** @param imageScanningConfiguration Contains settings for vulnerability scans. */
    public fun imageScanningConfiguration(
        imageScanningConfiguration: CfnImage.ImageScanningConfigurationProperty
    ) {
        cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
    }

    /** @param imageTestsConfiguration The image tests configuration of the image. */
    public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
        cdkBuilder.imageTestsConfiguration(imageTestsConfiguration)
    }

    /** @param imageTestsConfiguration The image tests configuration of the image. */
    public fun imageTestsConfiguration(
        imageTestsConfiguration: CfnImage.ImageTestsConfigurationProperty
    ) {
        cdkBuilder.imageTestsConfiguration(imageTestsConfiguration)
    }

    /**
     * @param infrastructureConfigurationArn The Amazon Resource Name (ARN) of the infrastructure
     *   configuration that defines the environment in which your image will be built and tested.
     */
    public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
        cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
    }

    /** @param tags The tags of the image. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /** @param workflows Contains an array of workflow configuration objects. */
    public fun workflows(vararg workflows: Any) {
        _workflows.addAll(listOf(*workflows))
    }

    /** @param workflows Contains an array of workflow configuration objects. */
    public fun workflows(workflows: Collection<Any>) {
        _workflows.addAll(workflows)
    }

    /** @param workflows Contains an array of workflow configuration objects. */
    public fun workflows(workflows: IResolvable) {
        cdkBuilder.workflows(workflows)
    }

    public fun build(): CfnImageProps {
        if (_workflows.isNotEmpty()) cdkBuilder.workflows(_workflows)
        return cdkBuilder.build()
    }
}
