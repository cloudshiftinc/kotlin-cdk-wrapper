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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.ArtifactsProps

/**
 * Properties common to all Artifacts classes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * ArtifactsProps artifactsProps = ArtifactsProps.builder()
 * .identifier("identifier")
 * .build();
 * ```
 */
@CdkDslMarker
public class ArtifactsPropsDsl {
    private val cdkBuilder: ArtifactsProps.Builder = ArtifactsProps.builder()

    /**
     * @param identifier The artifact identifier. This property is required on secondary artifacts.
     */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun build(): ArtifactsProps = cdkBuilder.build()
}
