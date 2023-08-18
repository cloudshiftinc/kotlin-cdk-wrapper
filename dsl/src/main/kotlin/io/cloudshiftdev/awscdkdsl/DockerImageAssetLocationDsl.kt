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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.DockerImageAssetLocation

/**
 * The location of the published docker image.
 *
 * This is where the image can be consumed at runtime.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * DockerImageAssetLocation dockerImageAssetLocation = DockerImageAssetLocation.builder()
 * .imageUri("imageUri")
 * .repositoryName("repositoryName")
 * // the properties below are optional
 * .imageTag("imageTag")
 * .build();
 * ```
 */
@CdkDslMarker
public class DockerImageAssetLocationDsl {
    private val cdkBuilder: DockerImageAssetLocation.Builder = DockerImageAssetLocation.builder()

    /** @param imageTag The tag of the image in Amazon ECR. */
    public fun imageTag(imageTag: String) {
        cdkBuilder.imageTag(imageTag)
    }

    /** @param imageUri The URI of the image in Amazon ECR (including a tag). */
    public fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
    }

    /** @param repositoryName The name of the ECR repository. */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): DockerImageAssetLocation = cdkBuilder.build()
}
