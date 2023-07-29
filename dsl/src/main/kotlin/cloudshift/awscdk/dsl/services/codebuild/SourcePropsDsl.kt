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
import software.amazon.awscdk.services.codebuild.SourceProps

/**
 * Properties common to all Source classes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * SourceProps sourceProps = SourceProps.builder()
 * .identifier("identifier")
 * .build();
 * ```
 */
@CdkDslMarker
public class SourcePropsDsl {
    private val cdkBuilder: SourceProps.Builder = SourceProps.builder()

    /** @param identifier The source identifier. This property is required on secondary sources. */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun build(): SourceProps = cdkBuilder.build()
}
