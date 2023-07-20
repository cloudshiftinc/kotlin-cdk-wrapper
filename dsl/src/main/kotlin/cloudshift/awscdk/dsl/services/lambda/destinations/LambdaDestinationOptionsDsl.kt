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

package cloudshift.awscdk.dsl.services.lambda.destinations

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions
import kotlin.Boolean

@CdkDslMarker
public class LambdaDestinationOptionsDsl {
    private val cdkBuilder: LambdaDestinationOptions.Builder = LambdaDestinationOptions.builder()

    public fun responseOnly(responseOnly: Boolean) {
        cdkBuilder.responseOnly(responseOnly)
    }

    public fun build(): LambdaDestinationOptions = cdkBuilder.build()
}
