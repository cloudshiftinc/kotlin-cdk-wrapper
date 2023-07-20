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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary
import kotlin.Number

@CdkDslMarker
public class CfnTrafficRoutingTimeBasedCanaryDsl {
    private val cdkBuilder: CfnTrafficRoutingTimeBasedCanary.Builder =
        CfnTrafficRoutingTimeBasedCanary.builder()

    public fun bakeTimeMins(bakeTimeMins: Number) {
        cdkBuilder.bakeTimeMins(bakeTimeMins)
    }

    public fun stepPercentage(stepPercentage: Number) {
        cdkBuilder.stepPercentage(stepPercentage)
    }

    public fun build(): CfnTrafficRoutingTimeBasedCanary = cdkBuilder.build()
}
