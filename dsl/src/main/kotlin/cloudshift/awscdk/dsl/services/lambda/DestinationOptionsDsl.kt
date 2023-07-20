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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.DestinationOptions
import software.amazon.awscdk.services.lambda.DestinationType

@CdkDslMarker
public class DestinationOptionsDsl {
    private val cdkBuilder: DestinationOptions.Builder = DestinationOptions.builder()

    public fun type(type: DestinationType) {
        cdkBuilder.type(type)
    }

    public fun build(): DestinationOptions = cdkBuilder.build()
}
