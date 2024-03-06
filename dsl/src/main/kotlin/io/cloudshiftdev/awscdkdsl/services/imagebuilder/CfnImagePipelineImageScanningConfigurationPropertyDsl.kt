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
@CdkDslMarker
public class CfnImagePipelineImageScanningConfigurationPropertyDsl {
    private val cdkBuilder: CfnImagePipeline.ImageScanningConfigurationProperty.Builder =
        CfnImagePipeline.ImageScanningConfigurationProperty.builder()

    /** @param ecrConfiguration Contains Amazon ECR settings for vulnerability scans. */
    public fun ecrConfiguration(ecrConfiguration: IResolvable) {
        cdkBuilder.ecrConfiguration(ecrConfiguration)
    }

    /** @param ecrConfiguration Contains Amazon ECR settings for vulnerability scans. */
    public fun ecrConfiguration(ecrConfiguration: CfnImagePipeline.EcrConfigurationProperty) {
        cdkBuilder.ecrConfiguration(ecrConfiguration)
    }

    /**
     * @param imageScanningEnabled A setting that indicates whether Image Builder keeps a snapshot
     *   of the vulnerability scans that Amazon Inspector runs against the build instance when you
     *   create a new image.
     */
    public fun imageScanningEnabled(imageScanningEnabled: Boolean) {
        cdkBuilder.imageScanningEnabled(imageScanningEnabled)
    }

    /**
     * @param imageScanningEnabled A setting that indicates whether Image Builder keeps a snapshot
     *   of the vulnerability scans that Amazon Inspector runs against the build instance when you
     *   create a new image.
     */
    public fun imageScanningEnabled(imageScanningEnabled: IResolvable) {
        cdkBuilder.imageScanningEnabled(imageScanningEnabled)
    }

    public fun build(): CfnImagePipeline.ImageScanningConfigurationProperty = cdkBuilder.build()
}
