@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for a scaling policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
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
public interface StepScalingActionProps {
  /**
   * How the adjustment numbers are interpreted.
   *
   * Default: ChangeInCapacity
   */
  public fun adjustmentType(): AdjustmentType? =
      unwrap(this).getAdjustmentType()?.let(AdjustmentType::wrap)

  /**
   * Grace period after scaling activity.
   *
   * For scale out policies, multiple scale outs during the cooldown period are
   * squashed so that only the biggest scale out happens.
   *
   * For scale in policies, subsequent scale ins during the cooldown period are
   * ignored.
   *
   * Default: No cooldown period
   *
   * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepScalingPolicyConfiguration.html)
   */
  public fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

  /**
   * The aggregation type for the CloudWatch metrics.
   *
   * Default: Average
   */
  public fun metricAggregationType(): MetricAggregationType? =
      unwrap(this).getMetricAggregationType()?.let(MetricAggregationType::wrap)

  /**
   * Minimum absolute number to adjust capacity with as result of percentage scaling.
   *
   * Only when using AdjustmentType = PercentChangeInCapacity, this number controls
   * the minimum absolute effect size.
   *
   * Default: No minimum scaling effect
   */
  public fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

  /**
   * A name for the scaling policy.
   *
   * Default: Automatically generated name
   */
  public fun policyName(): String? = unwrap(this).getPolicyName()

  /**
   * The scalable target.
   */
  public fun scalingTarget(): IScalableTarget

  /**
   * A builder for [StepScalingActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adjustmentType How the adjustment numbers are interpreted.
     */
    public fun adjustmentType(adjustmentType: AdjustmentType)

    /**
     * @param cooldown Grace period after scaling activity.
     * For scale out policies, multiple scale outs during the cooldown period are
     * squashed so that only the biggest scale out happens.
     *
     * For scale in policies, subsequent scale ins during the cooldown period are
     * ignored.
     */
    public fun cooldown(cooldown: Duration)

    /**
     * @param metricAggregationType The aggregation type for the CloudWatch metrics.
     */
    public fun metricAggregationType(metricAggregationType: MetricAggregationType)

    /**
     * @param minAdjustmentMagnitude Minimum absolute number to adjust capacity with as result of
     * percentage scaling.
     * Only when using AdjustmentType = PercentChangeInCapacity, this number controls
     * the minimum absolute effect size.
     */
    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number)

    /**
     * @param policyName A name for the scaling policy.
     */
    public fun policyName(policyName: String)

    /**
     * @param scalingTarget The scalable target. 
     */
    public fun scalingTarget(scalingTarget: IScalableTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.builder()

    /**
     * @param adjustmentType How the adjustment numbers are interpreted.
     */
    override fun adjustmentType(adjustmentType: AdjustmentType) {
      cdkBuilder.adjustmentType(adjustmentType.let(AdjustmentType::unwrap))
    }

    /**
     * @param cooldown Grace period after scaling activity.
     * For scale out policies, multiple scale outs during the cooldown period are
     * squashed so that only the biggest scale out happens.
     *
     * For scale in policies, subsequent scale ins during the cooldown period are
     * ignored.
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    /**
     * @param metricAggregationType The aggregation type for the CloudWatch metrics.
     */
    override fun metricAggregationType(metricAggregationType: MetricAggregationType) {
      cdkBuilder.metricAggregationType(metricAggregationType.let(MetricAggregationType::unwrap))
    }

    /**
     * @param minAdjustmentMagnitude Minimum absolute number to adjust capacity with as result of
     * percentage scaling.
     * Only when using AdjustmentType = PercentChangeInCapacity, this number controls
     * the minimum absolute effect size.
     */
    override fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
      cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    /**
     * @param policyName A name for the scaling policy.
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * @param scalingTarget The scalable target. 
     */
    override fun scalingTarget(scalingTarget: IScalableTarget) {
      cdkBuilder.scalingTarget(scalingTarget.let(IScalableTarget::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps,
  ) : CdkObject(cdkObject), StepScalingActionProps {
    /**
     * How the adjustment numbers are interpreted.
     *
     * Default: ChangeInCapacity
     */
    override fun adjustmentType(): AdjustmentType? =
        unwrap(this).getAdjustmentType()?.let(AdjustmentType::wrap)

    /**
     * Grace period after scaling activity.
     *
     * For scale out policies, multiple scale outs during the cooldown period are
     * squashed so that only the biggest scale out happens.
     *
     * For scale in policies, subsequent scale ins during the cooldown period are
     * ignored.
     *
     * Default: No cooldown period
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepScalingPolicyConfiguration.html)
     */
    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    /**
     * The aggregation type for the CloudWatch metrics.
     *
     * Default: Average
     */
    override fun metricAggregationType(): MetricAggregationType? =
        unwrap(this).getMetricAggregationType()?.let(MetricAggregationType::wrap)

    /**
     * Minimum absolute number to adjust capacity with as result of percentage scaling.
     *
     * Only when using AdjustmentType = PercentChangeInCapacity, this number controls
     * the minimum absolute effect size.
     *
     * Default: No minimum scaling effect
     */
    override fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

    /**
     * A name for the scaling policy.
     *
     * Default: Automatically generated name
     */
    override fun policyName(): String? = unwrap(this).getPolicyName()

    /**
     * The scalable target.
     */
    override fun scalingTarget(): IScalableTarget =
        unwrap(this).getScalingTarget().let(IScalableTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StepScalingActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps):
        StepScalingActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StepScalingActionProps):
        software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps
  }
}
