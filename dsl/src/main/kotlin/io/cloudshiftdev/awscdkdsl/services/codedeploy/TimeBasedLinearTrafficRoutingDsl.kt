@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codedeploy

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRouting

/**
 * Define a traffic routing config of type 'TimeBasedLinear'.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * TrafficRouting timeBasedLinearTrafficRouting = TimeBasedLinearTrafficRouting.allAtOnce();
 * ```
 */
@CdkDslMarker
public class TimeBasedLinearTrafficRoutingDsl {
    private val cdkBuilder: TimeBasedLinearTrafficRouting.Builder =
        TimeBasedLinearTrafficRouting.Builder.create()

    /**
     * The amount of time between traffic shifts.
     *
     * @param interval The amount of time between traffic shifts.
     */
    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    /**
     * The percentage to increase traffic on each traffic shift.
     *
     * @param percentage The percentage to increase traffic on each traffic shift.
     */
    public fun percentage(percentage: Number) {
        cdkBuilder.percentage(percentage)
    }

    public fun build(): TimeBasedLinearTrafficRouting = cdkBuilder.build()
}
