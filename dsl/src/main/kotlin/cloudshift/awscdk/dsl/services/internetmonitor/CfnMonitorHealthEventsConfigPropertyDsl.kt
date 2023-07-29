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

package cloudshift.awscdk.dsl.services.internetmonitor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.internetmonitor.CfnMonitor

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.internetmonitor.*;
 * HealthEventsConfigProperty healthEventsConfigProperty = HealthEventsConfigProperty.builder()
 * .availabilityScoreThreshold(123)
 * .performanceScoreThreshold(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-healtheventsconfig.html)
 */
@CdkDslMarker
public class CfnMonitorHealthEventsConfigPropertyDsl {
    private val cdkBuilder: CfnMonitor.HealthEventsConfigProperty.Builder =
        CfnMonitor.HealthEventsConfigProperty.builder()

    /** @param availabilityScoreThreshold the value to be set. */
    public fun availabilityScoreThreshold(availabilityScoreThreshold: Number) {
        cdkBuilder.availabilityScoreThreshold(availabilityScoreThreshold)
    }

    /** @param performanceScoreThreshold the value to be set. */
    public fun performanceScoreThreshold(performanceScoreThreshold: Number) {
        cdkBuilder.performanceScoreThreshold(performanceScoreThreshold)
    }

    public fun build(): CfnMonitor.HealthEventsConfigProperty = cdkBuilder.build()
}
