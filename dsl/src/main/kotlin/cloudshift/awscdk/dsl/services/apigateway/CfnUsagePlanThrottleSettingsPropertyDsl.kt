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
import software.amazon.awscdk.services.apigateway.CfnUsagePlan
import kotlin.Number

@CdkDslMarker
public class CfnUsagePlanThrottleSettingsPropertyDsl {
    private val cdkBuilder: CfnUsagePlan.ThrottleSettingsProperty.Builder =
        CfnUsagePlan.ThrottleSettingsProperty.builder()

    public fun burstLimit(burstLimit: Number) {
        cdkBuilder.burstLimit(burstLimit)
    }

    public fun rateLimit(rateLimit: Number) {
        cdkBuilder.rateLimit(rateLimit)
    }

    public fun build(): CfnUsagePlan.ThrottleSettingsProperty = cdkBuilder.build()
}
