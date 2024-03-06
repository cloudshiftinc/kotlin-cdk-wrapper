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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

/**
 * Settings that Image Builder uses to configure the ECR repository and the output container images
 * that Amazon Inspector scans.
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
@CdkDslMarker
public class CfnImagePipelineEcrConfigurationPropertyDsl {
    private val cdkBuilder: CfnImagePipeline.EcrConfigurationProperty.Builder =
        CfnImagePipeline.EcrConfigurationProperty.builder()

    private val _containerTags: MutableList<String> = mutableListOf()

    /**
     * @param containerTags Tags for Image Builder to apply to the output container image that
     *   &amp;INS;. scans. Tags can help you identify and manage your scanned images.
     */
    public fun containerTags(vararg containerTags: String) {
        _containerTags.addAll(listOf(*containerTags))
    }

    /**
     * @param containerTags Tags for Image Builder to apply to the output container image that
     *   &amp;INS;. scans. Tags can help you identify and manage your scanned images.
     */
    public fun containerTags(containerTags: Collection<String>) {
        _containerTags.addAll(containerTags)
    }

    /**
     * @param repositoryName The name of the container repository that Amazon Inspector scans to
     *   identify findings for your container images. The name includes the path for the repository
     *   location. If you don’t provide this information, Image Builder creates a repository in your
     *   account named `image-builder-image-scanning-repository` for vulnerability scans of your
     *   output container images.
     */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): CfnImagePipeline.EcrConfigurationProperty {
        if (_containerTags.isNotEmpty()) cdkBuilder.containerTags(_containerTags)
        return cdkBuilder.build()
    }
}
