@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.AdjustmentType
import software.amazon.awscdk.services.applicationautoscaling.IScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType
import software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps

/**
 * Properties for a scaling policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * ScalableTarget scalableTarget;
 * StepScalingActionProps stepScalingActionProps = StepScalingActionProps.builder()
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
public class StepScalingActionPropsDsl {
  private val cdkBuilder: StepScalingActionProps.Builder = StepScalingActionProps.builder()

  /**
   * @param adjustmentType How the adjustment numbers are interpreted.
   */
  public fun adjustmentType(adjustmentType: AdjustmentType) {
    cdkBuilder.adjustmentType(adjustmentType)
  }

  /**
   * @param cooldown Grace period after scaling activity.
   * For scale out policies, multiple scale outs during the cooldown period are
   * squashed so that only the biggest scale out happens.
   *
   * For scale in policies, subsequent scale ins during the cooldown period are
   * ignored.
   */
  public fun cooldown(cooldown: Duration) {
    cdkBuilder.cooldown(cooldown)
  }

  /**
   * @param metricAggregationType The aggregation type for the CloudWatch metrics.
   */
  public fun metricAggregationType(metricAggregationType: MetricAggregationType) {
    cdkBuilder.metricAggregationType(metricAggregationType)
  }

  /**
   * @param minAdjustmentMagnitude Minimum absolute number to adjust capacity with as result of
   * percentage scaling.
   * Only when using AdjustmentType = PercentChangeInCapacity, this number controls
   * the minimum absolute effect size.
   */
  public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
    cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
  }

  /**
   * @param policyName A name for the scaling policy.
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  /**
   * @param scalingTarget The scalable target. 
   */
  public fun scalingTarget(scalingTarget: IScalableTarget) {
    cdkBuilder.scalingTarget(scalingTarget)
  }

  public fun build(): StepScalingActionProps = cdkBuilder.build()
}
