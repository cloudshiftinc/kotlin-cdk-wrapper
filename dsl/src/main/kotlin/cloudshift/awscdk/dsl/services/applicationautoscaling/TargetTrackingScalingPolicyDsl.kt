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

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.IScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric
import software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.constructs.Construct

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Metric metric;
 * ScalableTarget scalableTarget;
 * TargetTrackingScalingPolicy targetTrackingScalingPolicy =
 * TargetTrackingScalingPolicy.Builder.create(this, "MyTargetTrackingScalingPolicy")
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
public class TargetTrackingScalingPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: TargetTrackingScalingPolicy.Builder =
        TargetTrackingScalingPolicy.Builder.create(scope, id)

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
     * capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking
     * policy can remove capacity from the scalable resource.
     *
     * Default: false
     *
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     */
    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * A name for the scaling policy.
     *
     * Default: - Automatically generated name.
     *
     * @param policyName A name for the scaling policy.
     */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    /**
     * A predefined metric for application autoscaling.
     *
     * The metric must track utilization. Scaling out will happen if the metric is higher than the
     * target value, scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     *
     * Default: - No predefined metrics.
     *
     * @param predefinedMetric A predefined metric for application autoscaling.
     */
    public fun predefinedMetric(predefinedMetric: PredefinedMetric) {
        cdkBuilder.predefinedMetric(predefinedMetric)
    }

    /**
     * Identify the resource associated with the metric type.
     *
     * Only used for predefined metric ALBRequestCountPerTarget.
     *
     * Example value:
     * `app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;`
     *
     * Default: - No resource label.
     *
     * @param resourceLabel Identify the resource associated with the metric type.
     */
    public fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
    }

    /**
     * Period after a scale in activity completes before another scale in activity can start.
     *
     * Default: Duration.seconds(300) for the following scalable targets: ECS services, Spot Fleet
     * requests, EMR clusters, AppStream 2.0 fleets, Aurora DB clusters, Amazon SageMaker endpoint
     * variants, Custom resources. For all other scalable targets, the default value is
     * Duration.seconds(0): DynamoDB tables, DynamoDB global secondary indexes, Amazon Comprehend
     * document classification endpoints, Lambda provisioned concurrency
     *
     * @param scaleInCooldown Period after a scale in activity completes before another scale in
     *   activity can start.
     */
    public fun scaleInCooldown(scaleInCooldown: Duration) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
    }

    /**
     * Period after a scale out activity completes before another scale out activity can start.
     *
     * Default: Duration.seconds(300) for the following scalable targets: ECS services, Spot Fleet
     * requests, EMR clusters, AppStream 2.0 fleets, Aurora DB clusters, Amazon SageMaker endpoint
     * variants, Custom resources. For all other scalable targets, the default value is
     * Duration.seconds(0): DynamoDB tables, DynamoDB global secondary indexes, Amazon Comprehend
     * document classification endpoints, Lambda provisioned concurrency
     *
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     *   activity can start.
     */
    public fun scaleOutCooldown(scaleOutCooldown: Duration) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
    }

    /** @param scalingTarget */
    public fun scalingTarget(scalingTarget: IScalableTarget) {
        cdkBuilder.scalingTarget(scalingTarget)
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
