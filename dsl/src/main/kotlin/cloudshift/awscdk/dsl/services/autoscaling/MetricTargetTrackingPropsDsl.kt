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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps
import software.amazon.awscdk.services.cloudwatch.IMetric

/**
 * Properties for enabling tracking of an arbitrary metric.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.autoscaling.*;
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Metric metric;
 * MetricTargetTrackingProps metricTargetTrackingProps = MetricTargetTrackingProps.builder()
 * .metric(metric)
 * .targetValue(123)
 * // the properties below are optional
 * .cooldown(Duration.minutes(30))
 * .disableScaleIn(false)
 * .estimatedInstanceWarmup(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class MetricTargetTrackingPropsDsl {
    private val cdkBuilder: MetricTargetTrackingProps.Builder = MetricTargetTrackingProps.builder()

    /**
     * @param cooldown Period after a scaling completes before another scaling activity can start.
     */
    public fun cooldown(cooldown: Duration) {
        cdkBuilder.cooldown(cooldown)
    }

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     *   If the value is true, scale in is disabled and the target tracking policy won't remove
     *   capacity from the autoscaling group. Otherwise, scale in is enabled and the target tracking
     *   policy can remove capacity from the group.
     */
    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     *   metrics to CloudWatch.
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
        cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
    }

    /**
     * @param metric Metric to track. The metric must represent a utilization, so that if it's
     *   higher than the target value, your ASG should scale out, and if it's lower it should scale
     *   in.
     */
    public fun metric(metric: IMetric) {
        cdkBuilder.metric(metric)
    }

    /** @param targetValue Value to keep the metric around. */
    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): MetricTargetTrackingProps = cdkBuilder.build()
}
