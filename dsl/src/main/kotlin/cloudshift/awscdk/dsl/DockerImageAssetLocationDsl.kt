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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.DockerImageAssetLocation
import kotlin.String

@CdkDslMarker
public class DockerImageAssetLocationDsl {
    private val cdkBuilder: DockerImageAssetLocation.Builder = DockerImageAssetLocation.builder()

    public fun imageTag(imageTag: String) {
        cdkBuilder.imageTag(imageTag)
    }

    public fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): DockerImageAssetLocation = cdkBuilder.build()
}
