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
 * Define the health event threshold percentages for the performance score and availability score
 * for your application's monitor.
 *
 * Amazon CloudWatch Internet Monitor creates a health event when there's an internet issue that
 * affects your application end users where a health score percentage is at or below a set
 * threshold.
 *
 * If you don't set a health event threshold, the default value is 95%.
 *
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

    /**
     * @param availabilityScoreThreshold The health event threshold percentage set for availability
     *   scores. When the global availability score is at or below this percentage, Internet Monitor
     *   creates a health event.
     */
    public fun availabilityScoreThreshold(availabilityScoreThreshold: Number) {
        cdkBuilder.availabilityScoreThreshold(availabilityScoreThreshold)
    }

    /**
     * @param performanceScoreThreshold The health event threshold percentage set for performance
     *   scores. When the global performance score is at or below this percentage, Internet Monitor
     *   creates a health event.
     */
    public fun performanceScoreThreshold(performanceScoreThreshold: Number) {
        cdkBuilder.performanceScoreThreshold(performanceScoreThreshold)
    }

    public fun build(): CfnMonitor.HealthEventsConfigProperty = cdkBuilder.build()
}
