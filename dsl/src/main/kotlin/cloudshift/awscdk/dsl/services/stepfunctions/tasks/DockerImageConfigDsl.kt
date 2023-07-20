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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig
import kotlin.String

@CdkDslMarker
public class DockerImageConfigDsl {
    private val cdkBuilder: DockerImageConfig.Builder = DockerImageConfig.builder()

    public fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
    }

    public fun build(): DockerImageConfig = cdkBuilder.build()
}
