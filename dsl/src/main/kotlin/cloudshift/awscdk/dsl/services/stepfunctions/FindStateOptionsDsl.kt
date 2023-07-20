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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.FindStateOptions
import kotlin.Boolean

@CdkDslMarker
public class FindStateOptionsDsl {
    private val cdkBuilder: FindStateOptions.Builder = FindStateOptions.builder()

    public fun includeErrorHandlers(includeErrorHandlers: Boolean) {
        cdkBuilder.includeErrorHandlers(includeErrorHandlers)
    }

    public fun build(): FindStateOptions = cdkBuilder.build()
}
