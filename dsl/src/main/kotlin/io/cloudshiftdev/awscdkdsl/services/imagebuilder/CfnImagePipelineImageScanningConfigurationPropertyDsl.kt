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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

/**
 * Determines if tests should run after building the image.
 *
 * Image Builder defaults to enable tests to run following the image build, before image
 * distribution.
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
@CdkDslMarker
public class CfnImagePipelineImageScanningConfigurationPropertyDsl {
    private val cdkBuilder: CfnImagePipeline.ImageScanningConfigurationProperty.Builder =
        CfnImagePipeline.ImageScanningConfigurationProperty.builder()

    /**
     * @param ecrConfiguration Settings for Image Builder to configure the ECR repository and output
     *   container images that are scanned.
     */
    public fun ecrConfiguration(ecrConfiguration: IResolvable) {
        cdkBuilder.ecrConfiguration(ecrConfiguration)
    }

    /**
     * @param ecrConfiguration Settings for Image Builder to configure the ECR repository and output
     *   container images that are scanned.
     */
    public fun ecrConfiguration(ecrConfiguration: CfnImagePipeline.EcrConfigurationProperty) {
        cdkBuilder.ecrConfiguration(ecrConfiguration)
    }

    /**
     * @param imageScanningEnabled This sets whether Image Builder keeps a snapshot of the
     *   vulnerability scans that Amazon Inspector runs against the build instance when you create a
     *   new image.
     */
    public fun imageScanningEnabled(imageScanningEnabled: Boolean) {
        cdkBuilder.imageScanningEnabled(imageScanningEnabled)
    }

    /**
     * @param imageScanningEnabled This sets whether Image Builder keeps a snapshot of the
     *   vulnerability scans that Amazon Inspector runs against the build instance when you create a
     *   new image.
     */
    public fun imageScanningEnabled(imageScanningEnabled: IResolvable) {
        cdkBuilder.imageScanningEnabled(imageScanningEnabled)
    }

    public fun build(): CfnImagePipeline.ImageScanningConfigurationProperty = cdkBuilder.build()
}
