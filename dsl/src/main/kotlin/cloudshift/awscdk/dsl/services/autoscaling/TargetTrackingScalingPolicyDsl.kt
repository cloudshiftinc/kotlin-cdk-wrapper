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
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.PredefinedMetric
import software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.constructs.Construct

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.autoscaling.*;
 * import software.amazon.awscdk.services.cloudwatch.*;
 * AutoScalingGroup autoScalingGroup;
 * Metric metric;
 * TargetTrackingScalingPolicy targetTrackingScalingPolicy =
 * TargetTrackingScalingPolicy.Builder.create(this, "MyTargetTrackingScalingPolicy")
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
public class TargetTrackingScalingPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: TargetTrackingScalingPolicy.Builder =
        TargetTrackingScalingPolicy.Builder.create(scope, id)

    /** @param autoScalingGroup */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
        cdkBuilder.autoScalingGroup(autoScalingGroup)
    }

    /**
     * Period after a scaling completes before another scaling activity can start.
     *
     * Default: - The default cooldown configured on the AutoScalingGroup.
     *
     * @param cooldown Period after a scaling completes before another scaling activity can start.
     */
    public fun cooldown(cooldown: Duration) {
        cdkBuilder.cooldown(cooldown)
    }

    /**
     * A custom metric for application autoscaling.
     *
     * The metric must track utilization. Scaling out will happen if the metric is higher than the
     * target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     *
     * Default: - No custom metric.
     *
     * @param customMetric A custom metric for application autoscaling.
     */
    public fun customMetric(customMetric: IMetric) {
        cdkBuilder.customMetric(customMetric)
    }

    /**
     * Indicates whether scale in by the target tracking policy is disabled.
     *
     * If the value is true, scale in is disabled and the target tracking policy won't remove
     * capacity from the autoscaling group. Otherwise, scale in is enabled and the target tracking
     * policy can remove capacity from the group.
     *
     * Default: false
     *
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     */
    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * Estimated time until a newly launched instance can send metrics to CloudWatch.
     *
     * Default: - Same as the cooldown.
     *
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     *   metrics to CloudWatch.
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
        cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
    }

    /**
     * A predefined metric for application autoscaling.
     *
     * The metric must track utilization. Scaling out will happen if the metric is higher than the
     * target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     *
     * Default: - No predefined metric.
     *
     * @param predefinedMetric A predefined metric for application autoscaling.
     */
    public fun predefinedMetric(predefinedMetric: PredefinedMetric) {
        cdkBuilder.predefinedMetric(predefinedMetric)
    }

    /**
     * The resource label associated with the predefined metric.
     *
     * Should be supplied if the predefined metric is ALBRequestCountPerTarget, and the format
     * should be:
     *
     * app/<load-balancer-name>/<load-balancer-id>/targetgroup/<target-group-name>/<target-group-id>
     *
     * Default: - No resource label.
     *
     * @param resourceLabel The resource label associated with the predefined metric.
     */
    public fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
    }

    /**
     * The target value for the metric.
     *
     * @param targetValue The target value for the metric.
     */
    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): TargetTrackingScalingPolicy = cdkBuilder.build()
}
