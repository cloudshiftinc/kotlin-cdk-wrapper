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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.AdjustmentType
import software.amazon.awscdk.services.applicationautoscaling.IScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType
import software.amazon.awscdk.services.applicationautoscaling.StepScalingAction
import software.constructs.Construct

/**
 * Define a step scaling action.
 *
 * This kind of scaling policy adjusts the target capacity in configurable steps. The size of the
 * step is configurable based on the metric's distance to its alarm threshold.
 *
 * This Action must be used as the target of a CloudWatch alarm to take effect.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * ScalableTarget scalableTarget;
 * StepScalingAction stepScalingAction = StepScalingAction.Builder.create(this,
 * "MyStepScalingAction")
 * .scalingTarget(scalableTarget)
 * // the properties below are optional
 * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
 * .cooldown(Duration.minutes(30))
 * .metricAggregationType(MetricAggregationType.AVERAGE)
 * .minAdjustmentMagnitude(123)
 * .policyName("policyName")
 * .build();
 * ```
 */
@CdkDslMarker
public class StepScalingActionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: StepScalingAction.Builder = StepScalingAction.Builder.create(scope, id)

    /**
     * How the adjustment numbers are interpreted.
     *
     * Default: ChangeInCapacity
     *
     * @param adjustmentType How the adjustment numbers are interpreted.
     */
    public fun adjustmentType(adjustmentType: AdjustmentType) {
        cdkBuilder.adjustmentType(adjustmentType)
    }

    /**
     * Grace period after scaling activity.
     *
     * For scale out policies, multiple scale outs during the cooldown period are squashed so that
     * only the biggest scale out happens.
     *
     * For scale in policies, subsequent scale ins during the cooldown period are ignored.
     *
     * Default: No cooldown period
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepScalingPolicyConfiguration.html)
     *
     * @param cooldown Grace period after scaling activity.
     */
    public fun cooldown(cooldown: Duration) {
        cdkBuilder.cooldown(cooldown)
    }

    /**
     * The aggregation type for the CloudWatch metrics.
     *
     * Default: Average
     *
     * @param metricAggregationType The aggregation type for the CloudWatch metrics.
     */
    public fun metricAggregationType(metricAggregationType: MetricAggregationType) {
        cdkBuilder.metricAggregationType(metricAggregationType)
    }

    /**
     * Minimum absolute number to adjust capacity with as result of percentage scaling.
     *
     * Only when using AdjustmentType = PercentChangeInCapacity, this number controls the minimum
     * absolute effect size.
     *
     * Default: No minimum scaling effect
     *
     * @param minAdjustmentMagnitude Minimum absolute number to adjust capacity with as result of
     *   percentage scaling.
     */
    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
        cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    /**
     * A name for the scaling policy.
     *
     * Default: Automatically generated name
     *
     * @param policyName A name for the scaling policy.
     */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    /**
     * The scalable target.
     *
     * @param scalingTarget The scalable target.
     */
    public fun scalingTarget(scalingTarget: IScalableTarget) {
        cdkBuilder.scalingTarget(scalingTarget)
    }

    public fun build(): StepScalingAction = cdkBuilder.build()
}
