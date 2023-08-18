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

package io.cloudshiftdev.awscdkdsl.services.applicationautoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.IScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps
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
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Metric metric;
 * ScalableTarget scalableTarget;
 * TargetTrackingScalingPolicyProps targetTrackingScalingPolicyProps =
 * TargetTrackingScalingPolicyProps.builder()
 * .scalingTarget(scalableTarget)
 * .targetValue(123)
 * // the properties below are optional
 * .customMetric(metric)
 * .disableScaleIn(false)
 * .policyName("policyName")
 * .predefinedMetric(PredefinedMetric.APPSTREAM_AVERAGE_CAPACITY_UTILIZATION)
 * .resourceLabel("resourceLabel")
 * .scaleInCooldown(Duration.minutes(30))
 * .scaleOutCooldown(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class TargetTrackingScalingPolicyPropsDsl {
    private val cdkBuilder: TargetTrackingScalingPolicyProps.Builder =
        TargetTrackingScalingPolicyProps.builder()

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
     *   capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking
     *   policy can remove capacity from the scalable resource.
     */
    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /** @param policyName A name for the scaling policy. */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
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
     * @param resourceLabel Identify the resource associated with the metric type. Only used for
     *   predefined metric ALBRequestCountPerTarget.
     *
     * Example value:
     * `app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;`
     */
    public fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
    }

    /**
     * @param scaleInCooldown Period after a scale in activity completes before another scale in
     *   activity can start.
     */
    public fun scaleInCooldown(scaleInCooldown: Duration) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
    }

    /**
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     *   activity can start.
     */
    public fun scaleOutCooldown(scaleOutCooldown: Duration) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
    }

    /** @param scalingTarget the value to be set. */
    public fun scalingTarget(scalingTarget: IScalableTarget) {
        cdkBuilder.scalingTarget(scalingTarget)
    }

    /** @param targetValue The target value for the metric. */
    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): TargetTrackingScalingPolicyProps = cdkBuilder.build()
}
