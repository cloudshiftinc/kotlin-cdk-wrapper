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
import kotlin.String
import software.amazon.awscdk.services.internetmonitor.CfnMonitor

/**
 * Configuration information that determines the threshold and other conditions for when Internet
 * Monitor creates a health event for a local performance or availability issue, when scores cross a
 * threshold for one or more city-networks.
 *
 * Defines the percentages, for performance scores or availability scores, that are the local
 * thresholds for when Amazon CloudWatch Internet Monitor creates a health event. Also defines
 * whether a local threshold is enabled or disabled, and the minimum percentage of overall traffic
 * that must be impacted by an issue before Internet Monitor creates an event when a threshold is
 * crossed for a local health score.
 *
 * If you don't set a local health event threshold, the default value is 60%.
 *
 * For more information, see
 * [Change health event thresholds](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview)
 * in the Internet Monitor section of the *Amazon CloudWatch User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.internetmonitor.*;
 * LocalHealthEventsConfigProperty localHealthEventsConfigProperty =
 * LocalHealthEventsConfigProperty.builder()
 * .healthScoreThreshold(123)
 * .minTrafficImpact(123)
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-localhealtheventsconfig.html)
 */
@CdkDslMarker
public class CfnMonitorLocalHealthEventsConfigPropertyDsl {
    private val cdkBuilder: CfnMonitor.LocalHealthEventsConfigProperty.Builder =
        CfnMonitor.LocalHealthEventsConfigProperty.builder()

    /**
     * @param healthScoreThreshold The health event threshold percentage set for a local health
     *   score.
     */
    public fun healthScoreThreshold(healthScoreThreshold: Number) {
        cdkBuilder.healthScoreThreshold(healthScoreThreshold)
    }

    /**
     * @param minTrafficImpact The minimum percentage of overall traffic for an application that
     *   must be impacted by an issue before Internet Monitor creates an event when a threshold is
     *   crossed for a local health score. If you don't set a minimum traffic impact threshold, the
     *   default value is 0.01%.
     */
    public fun minTrafficImpact(minTrafficImpact: Number) {
        cdkBuilder.minTrafficImpact(minTrafficImpact)
    }

    /**
     * @param status The status of whether Internet Monitor creates a health event based on a
     *   threshold percentage set for a local health score. The status can be `ENABLED` or
     *   `DISABLED` .
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnMonitor.LocalHealthEventsConfigProperty = cdkBuilder.build()
}
