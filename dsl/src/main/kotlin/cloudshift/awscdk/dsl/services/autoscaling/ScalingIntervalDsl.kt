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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.autoscaling.ScalingInterval
import kotlin.Number

@CdkDslMarker
public class ScalingIntervalDsl {
    private val cdkBuilder: ScalingInterval.Builder = ScalingInterval.builder()

    public fun change(change: Number) {
        cdkBuilder.change(change)
    }

    public fun lower(lower: Number) {
        cdkBuilder.lower(lower)
    }

    public fun upper(upper: Number) {
        cdkBuilder.upper(upper)
    }

    public fun build(): ScalingInterval = cdkBuilder.build()
}
