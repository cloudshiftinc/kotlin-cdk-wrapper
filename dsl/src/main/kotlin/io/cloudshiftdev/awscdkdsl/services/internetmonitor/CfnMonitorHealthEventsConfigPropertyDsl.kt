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

package io.cloudshiftdev.awscdkdsl.services.internetmonitor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
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
 * .availabilityLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
 * .healthScoreThreshold(123)
 * .minTrafficImpact(123)
 * .status("status")
 * .build())
 * .availabilityScoreThreshold(123)
 * .performanceLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
 * .healthScoreThreshold(123)
 * .minTrafficImpact(123)
 * .status("status")
 * .build())
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
     * @param availabilityLocalHealthEventsConfig The configuration that determines the threshold
     *   and other conditions for when Internet Monitor creates a health event for a local
     *   availability issue.
     */
    public fun availabilityLocalHealthEventsConfig(
        availabilityLocalHealthEventsConfig: IResolvable
    ) {
        cdkBuilder.availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig)
    }

    /**
     * @param availabilityLocalHealthEventsConfig The configuration that determines the threshold
     *   and other conditions for when Internet Monitor creates a health event for a local
     *   availability issue.
     */
    public fun availabilityLocalHealthEventsConfig(
        availabilityLocalHealthEventsConfig: CfnMonitor.LocalHealthEventsConfigProperty
    ) {
        cdkBuilder.availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig)
    }

    /**
     * @param availabilityScoreThreshold The health event threshold percentage set for availability
     *   scores. When the overall availability score is at or below this percentage, Internet
     *   Monitor creates a health event.
     */
    public fun availabilityScoreThreshold(availabilityScoreThreshold: Number) {
        cdkBuilder.availabilityScoreThreshold(availabilityScoreThreshold)
    }

    /**
     * @param performanceLocalHealthEventsConfig The configuration that determines the threshold and
     *   other conditions for when Internet Monitor creates a health event for a local performance
     *   issue.
     */
    public fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: IResolvable) {
        cdkBuilder.performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig)
    }

    /**
     * @param performanceLocalHealthEventsConfig The configuration that determines the threshold and
     *   other conditions for when Internet Monitor creates a health event for a local performance
     *   issue.
     */
    public fun performanceLocalHealthEventsConfig(
        performanceLocalHealthEventsConfig: CfnMonitor.LocalHealthEventsConfigProperty
    ) {
        cdkBuilder.performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig)
    }

    /**
     * @param performanceScoreThreshold The health event threshold percentage set for performance
     *   scores. When the overall performance score is at or below this percentage, Internet Monitor
     *   creates a health event.
     */
    public fun performanceScoreThreshold(performanceScoreThreshold: Number) {
        cdkBuilder.performanceScoreThreshold(performanceScoreThreshold)
    }

    public fun build(): CfnMonitor.HealthEventsConfigProperty = cdkBuilder.build()
}
