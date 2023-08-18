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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.PredefinedMetric
import software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps
import software.amazon.awscdk.services.cloudwatch.IMetric

/**
 * Properties for a concrete TargetTrackingPolicy.
 *
 * Adds the scalingTarget.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.autoscaling.*;
 * import software.amazon.awscdk.services.cloudwatch.*;
 * AutoScalingGroup autoScalingGroup;
 * Metric metric;
 * TargetTrackingScalingPolicyProps targetTrackingScalingPolicyProps =
 * TargetTrackingScalingPolicyProps.builder()
 * .autoScalingGroup(autoScalingGroup)
 * .targetValue(123)
 * // the properties below are optional
 * .cooldown(Duration.minutes(30))
 * .customMetric(metric)
 * .disableScaleIn(false)
 * .estimatedInstanceWarmup(Duration.minutes(30))
 * .predefinedMetric(PredefinedMetric.ASG_AVERAGE_CPU_UTILIZATION)
 * .resourceLabel("resourceLabel")
 * .build();
 * ```
 */
@CdkDslMarker
public class TargetTrackingScalingPolicyPropsDsl {
    private val cdkBuilder: TargetTrackingScalingPolicyProps.Builder =
        TargetTrackingScalingPolicyProps.builder()

    /** @param autoScalingGroup the value to be set. */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
        cdkBuilder.autoScalingGroup(autoScalingGroup)
    }

    /**
     * @param cooldown Period after a scaling completes before another scaling activity can start.
     */
    public fun cooldown(cooldown: Duration) {
        cdkBuilder.cooldown(cooldown)
    }

    /**
     * @param customMetric A custom metric for application autoscaling. The metric must track
     *   utilization. Scaling out will happen if the metric is higher than the target value, scaling
     *   in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     */
    public fun customMetric(customMetric: IMetric) {
        cdkBuilder.customMetric(customMetric)
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
     * @param predefinedMetric A predefined metric for application autoscaling. The metric must
     *   track utilization. Scaling out will happen if the metric is higher than the target value,
     *   scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     */
    public fun predefinedMetric(predefinedMetric: PredefinedMetric) {
        cdkBuilder.predefinedMetric(predefinedMetric)
    }

    /**
     * @param resourceLabel The resource label associated with the predefined metric. Should be
     *   supplied if the predefined metric is ALBRequestCountPerTarget, and the format should be:
     *
     * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>
     */
    public fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
    }

    /** @param targetValue The target value for the metric. */
    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): TargetTrackingScalingPolicyProps = cdkBuilder.build()
}
