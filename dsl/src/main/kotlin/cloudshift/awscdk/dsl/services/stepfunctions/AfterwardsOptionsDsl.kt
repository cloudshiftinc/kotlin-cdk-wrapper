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
import software.amazon.awscdk.services.stepfunctions.AfterwardsOptions
import kotlin.Boolean

@CdkDslMarker
public class AfterwardsOptionsDsl {
    private val cdkBuilder: AfterwardsOptions.Builder = AfterwardsOptions.builder()

    public fun includeErrorHandlers(includeErrorHandlers: Boolean) {
        cdkBuilder.includeErrorHandlers(includeErrorHandlers)
    }

    public fun includeOtherwise(includeOtherwise: Boolean) {
        cdkBuilder.includeOtherwise(includeOtherwise)
    }

    public fun build(): AfterwardsOptions = cdkBuilder.build()
}
