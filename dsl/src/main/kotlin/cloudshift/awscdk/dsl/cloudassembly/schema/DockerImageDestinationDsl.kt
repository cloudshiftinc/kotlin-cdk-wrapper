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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.DockerImageDestination
import kotlin.String

@CdkDslMarker
public class DockerImageDestinationDsl {
    private val cdkBuilder: DockerImageDestination.Builder = DockerImageDestination.builder()

    public fun assumeRoleArn(assumeRoleArn: String) {
        cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    public fun assumeRoleExternalId(assumeRoleExternalId: String) {
        cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    public fun imageTag(imageTag: String) {
        cdkBuilder.imageTag(imageTag)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): DockerImageDestination = cdkBuilder.build()
}
