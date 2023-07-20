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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.String

@CdkDslMarker
public class CfnPipeFilterPropertyDsl {
    private val cdkBuilder: CfnPipe.FilterProperty.Builder = CfnPipe.FilterProperty.builder()

    public fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
    }

    public fun build(): CfnPipe.FilterProperty = cdkBuilder.build()
}
