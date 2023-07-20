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
import software.amazon.awscdk.services.codebuild.SourceProps
import kotlin.String

@CdkDslMarker
public class SourcePropsDsl {
    private val cdkBuilder: SourceProps.Builder = SourceProps.builder()

    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun build(): SourceProps = cdkBuilder.build()
}
