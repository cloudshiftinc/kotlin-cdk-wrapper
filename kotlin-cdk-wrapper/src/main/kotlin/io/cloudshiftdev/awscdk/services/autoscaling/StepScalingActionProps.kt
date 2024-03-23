@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
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
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * AutoScalingGroup autoScalingGroup;
 * StepScalingActionProps stepScalingActionProps = StepScalingActionProps.builder()
 * .autoScalingGroup(autoScalingGroup)
 * // the properties below are optional
 * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
 * .cooldown(Duration.minutes(30))
 * .estimatedInstanceWarmup(Duration.minutes(30))
 * .metricAggregationType(MetricAggregationType.AVERAGE)
 * .minAdjustmentMagnitude(123)
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
   * The auto scaling group.
   */
  public fun autoScalingGroup(): IAutoScalingGroup

  /**
   * Period after a scaling completes before another scaling activity can start.
   *
   * Default: The default cooldown configured on the AutoScalingGroup
   */
  public fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

  /**
   * Estimated time until a newly launched instance can send metrics to CloudWatch.
   *
   * Default: Same as the cooldown
   */
  public fun estimatedInstanceWarmup(): Duration? =
      unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

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
   * A builder for [StepScalingActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adjustmentType How the adjustment numbers are interpreted.
     */
    public fun adjustmentType(adjustmentType: AdjustmentType)

    /**
     * @param autoScalingGroup The auto scaling group. 
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    /**
     * @param cooldown Period after a scaling completes before another scaling activity can start.
     */
    public fun cooldown(cooldown: Duration)

    /**
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch.
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder =
        software.amazon.awscdk.services.autoscaling.StepScalingActionProps.builder()

    /**
     * @param adjustmentType How the adjustment numbers are interpreted.
     */
    override fun adjustmentType(adjustmentType: AdjustmentType) {
      cdkBuilder.adjustmentType(adjustmentType.let(AdjustmentType::unwrap))
    }

    /**
     * @param autoScalingGroup The auto scaling group. 
     */
    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    /**
     * @param cooldown Period after a scaling completes before another scaling activity can start.
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    /**
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch.
     */
    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration::unwrap))
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

    public fun build(): software.amazon.awscdk.services.autoscaling.StepScalingActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.StepScalingActionProps,
  ) : CdkObject(cdkObject), StepScalingActionProps {
    /**
     * How the adjustment numbers are interpreted.
     *
     * Default: ChangeInCapacity
     */
    override fun adjustmentType(): AdjustmentType? =
        unwrap(this).getAdjustmentType()?.let(AdjustmentType::wrap)

    /**
     * The auto scaling group.
     */
    override fun autoScalingGroup(): IAutoScalingGroup =
        unwrap(this).getAutoScalingGroup().let(IAutoScalingGroup::wrap)

    /**
     * Period after a scaling completes before another scaling activity can start.
     *
     * Default: The default cooldown configured on the AutoScalingGroup
     */
    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    /**
     * Estimated time until a newly launched instance can send metrics to CloudWatch.
     *
     * Default: Same as the cooldown
     */
    override fun estimatedInstanceWarmup(): Duration? =
        unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StepScalingActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.StepScalingActionProps):
        StepScalingActionProps = CdkObjectWrappers.wrap(cdkObject) as? StepScalingActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StepScalingActionProps):
        software.amazon.awscdk.services.autoscaling.StepScalingActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.StepScalingActionProps
  }
}
