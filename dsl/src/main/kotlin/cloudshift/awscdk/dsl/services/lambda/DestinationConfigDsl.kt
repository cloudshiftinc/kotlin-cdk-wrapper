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
import software.amazon.awscdk.services.lambda.DestinationConfig
import kotlin.String

@CdkDslMarker
public class DestinationConfigDsl {
    private val cdkBuilder: DestinationConfig.Builder = DestinationConfig.builder()

    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    public fun build(): DestinationConfig = cdkBuilder.build()
}
