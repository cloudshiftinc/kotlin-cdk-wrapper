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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps

/**
 * Construction properties for `TimeBasedLinearTrafficRouting`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.codedeploy.*;
 * TimeBasedLinearTrafficRoutingProps timeBasedLinearTrafficRoutingProps =
 * TimeBasedLinearTrafficRoutingProps.builder()
 * .interval(Duration.minutes(30))
 * .percentage(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class TimeBasedLinearTrafficRoutingPropsDsl {
    private val cdkBuilder: TimeBasedLinearTrafficRoutingProps.Builder =
        TimeBasedLinearTrafficRoutingProps.builder()

    /** @param interval The amount of time between traffic shifts. */
    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    /** @param percentage The percentage to increase traffic on each traffic shift. */
    public fun percentage(percentage: Number) {
        cdkBuilder.percentage(percentage)
    }

    public fun build(): TimeBasedLinearTrafficRoutingProps = cdkBuilder.build()
}
