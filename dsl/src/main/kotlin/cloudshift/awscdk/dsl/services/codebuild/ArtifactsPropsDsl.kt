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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.ArtifactsProps
import kotlin.String

@CdkDslMarker
public class ArtifactsPropsDsl {
    private val cdkBuilder: ArtifactsProps.Builder = ArtifactsProps.builder()

    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun build(): ArtifactsProps = cdkBuilder.build()
}
