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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.ThrottleSettings
import kotlin.Number

@CdkDslMarker
public class ThrottleSettingsDsl {
    private val cdkBuilder: ThrottleSettings.Builder = ThrottleSettings.builder()

    public fun burstLimit(burstLimit: Number) {
        cdkBuilder.burstLimit(burstLimit)
    }

    public fun rateLimit(rateLimit: Number) {
        cdkBuilder.rateLimit(rateLimit)
    }

    public fun build(): ThrottleSettings = cdkBuilder.build()
}
