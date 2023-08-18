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
import software.amazon.awscdk.services.imagebuilder.CfnImage
import software.constructs.Construct

/**
 * An image build version.
 *
 * An image is a customized, secure, and up-to-date “golden” server image that is pre-installed and
 * pre-configured with software and settings to meet specific IT standards.
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html)
 */
@CdkDslMarker
public class CfnImageDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnImage.Builder = CfnImage.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the container recipe that is used for this pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-containerrecipearn)
     *
     * @param containerRecipeArn The Amazon Resource Name (ARN) of the container recipe that is used
     *   for this pipeline.
     */
    public fun containerRecipeArn(containerRecipeArn: String) {
        cdkBuilder.containerRecipeArn(containerRecipeArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-distributionconfigurationarn)
     *
     * @param distributionConfigurationArn The Amazon Resource Name (ARN) of the distribution
     *   configuration.
     */
    public fun distributionConfigurationArn(distributionConfigurationArn: String) {
        cdkBuilder.distributionConfigurationArn(distributionConfigurationArn)
    }

    /**
     * Indicates whether Image Builder collects additional information about the image, such as the
     * operating system (OS) version and package list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-enhancedimagemetadataenabled)
     *
     * @param enhancedImageMetadataEnabled Indicates whether Image Builder collects additional
     *   information about the image, such as the operating system (OS) version and package list.
     */
    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean) {
        cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
    }

    /**
     * Indicates whether Image Builder collects additional information about the image, such as the
     * operating system (OS) version and package list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-enhancedimagemetadataenabled)
     *
     * @param enhancedImageMetadataEnabled Indicates whether Image Builder collects additional
     *   information about the image, such as the operating system (OS) version and package list.
     */
    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable) {
        cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
    }

    /**
     * The Amazon Resource Name (ARN) of the image recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagerecipearn)
     *
     * @param imageRecipeArn The Amazon Resource Name (ARN) of the image recipe.
     */
    public fun imageRecipeArn(imageRecipeArn: String) {
        cdkBuilder.imageRecipeArn(imageRecipeArn)
    }

    /**
     * Contains settings for Image Builder image resource and container image scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagescanningconfiguration)
     *
     * @param imageScanningConfiguration Contains settings for Image Builder image resource and
     *   container image scans.
     */
    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
        cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
    }

    /**
     * Contains settings for Image Builder image resource and container image scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagescanningconfiguration)
     *
     * @param imageScanningConfiguration Contains settings for Image Builder image resource and
     *   container image scans.
     */
    public fun imageScanningConfiguration(
        imageScanningConfiguration: CfnImage.ImageScanningConfigurationProperty
    ) {
        cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
    }

    /**
     * The configuration settings for your image test components, which includes a toggle that
     * allows you to turn off tests, and a timeout setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagetestsconfiguration)
     *
     * @param imageTestsConfiguration The configuration settings for your image test components,
     *   which includes a toggle that allows you to turn off tests, and a timeout setting.
     */
    public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
        cdkBuilder.imageTestsConfiguration(imageTestsConfiguration)
    }

    /**
     * The configuration settings for your image test components, which includes a toggle that
     * allows you to turn off tests, and a timeout setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagetestsconfiguration)
     *
     * @param imageTestsConfiguration The configuration settings for your image test components,
     *   which includes a toggle that allows you to turn off tests, and a timeout setting.
     */
    public fun imageTestsConfiguration(
        imageTestsConfiguration: CfnImage.ImageTestsConfigurationProperty
    ) {
        cdkBuilder.imageTestsConfiguration(imageTestsConfiguration)
    }

    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image
     * pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-infrastructureconfigurationarn)
     *
     * @param infrastructureConfigurationArn The Amazon Resource Name (ARN) of the infrastructure
     *   configuration associated with this image pipeline.
     */
    public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
        cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
    }

    /**
     * The tags of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-tags)
     *
     * @param tags The tags of the image.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnImage = cdkBuilder.build()
}
