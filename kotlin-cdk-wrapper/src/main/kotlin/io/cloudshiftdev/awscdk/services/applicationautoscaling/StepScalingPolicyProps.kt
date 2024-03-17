@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Metric metric;
 * ScalableTarget scalableTarget;
 * StepScalingPolicyProps stepScalingPolicyProps = StepScalingPolicyProps.builder()
 * .metric(metric)
 * .scalingSteps(List.of(ScalingInterval.builder()
 * .change(123)
 * // the properties below are optional
 * .lower(123)
 * .upper(123)
 * .build()))
 * .scalingTarget(scalableTarget)
 * // the properties below are optional
 * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
 * .cooldown(Duration.minutes(30))
 * .datapointsToAlarm(123)
 * .evaluationPeriods(123)
 * .metricAggregationType(MetricAggregationType.AVERAGE)
 * .minAdjustmentMagnitude(123)
 * .build();
 * ```
 */
public interface StepScalingPolicyProps : BasicStepScalingPolicyProps {
  /**
   * The scaling target.
   */
  public fun scalingTarget(): IScalableTarget

  /**
   * A builder for [StepScalingPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adjustmentType How the adjustment numbers inside 'intervals' are interpreted.
     */
    public fun adjustmentType(adjustmentType: AdjustmentType)

    /**
     * @param cooldown Grace period after scaling activity.
     * Subsequent scale outs during the cooldown period are squashed so that only
     * the biggest scale out happens.
     *
     * Subsequent scale ins during the cooldown period are ignored.
     */
    public fun cooldown(cooldown: Duration)

    /**
     * @param datapointsToAlarm The number of data points out of the evaluation periods that must be
     * breaching to trigger a scaling action.
     * Creates an "M out of N" alarm, where this property is the M and the value set for
     * `evaluationPeriods` is the N value.
     *
     * Only has meaning if `evaluationPeriods != 1`.
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number)

    /**
     * @param evaluationPeriods How many evaluation periods of the metric to wait before triggering
     * a scaling action.
     * Raising this value can be used to smooth out the metric, at the expense
     * of slower response times.
     *
     * If `datapointsToAlarm` is not set, then all data points in the evaluation period
     * must meet the criteria to trigger a scaling action.
     */
    public fun evaluationPeriods(evaluationPeriods: Number)

    /**
     * @param metric Metric to scale on. 
     */
    public fun metric(metric: IMetric)

    /**
     * @param metricAggregationType Aggregation to apply to all data points over the evaluation
     * periods.
     * Only has meaning if `evaluationPeriods != 1`.
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
     * @param scalingSteps The intervals for scaling. 
     * Maps a range of metric values to a particular scaling behavior.
     *
     * Must be between 2 and 40 steps.
     */
    public fun scalingSteps(scalingSteps: List<ScalingInterval>)

    /**
     * @param scalingSteps The intervals for scaling. 
     * Maps a range of metric values to a particular scaling behavior.
     *
     * Must be between 2 and 40 steps.
     */
    public fun scalingSteps(vararg scalingSteps: ScalingInterval)

    /**
     * @param scalingTarget The scaling target. 
     */
    public fun scalingTarget(scalingTarget: IScalableTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.builder()

    /**
     * @param adjustmentType How the adjustment numbers inside 'intervals' are interpreted.
     */
    override fun adjustmentType(adjustmentType: AdjustmentType) {
      cdkBuilder.adjustmentType(adjustmentType.let(AdjustmentType::unwrap))
    }

    /**
     * @param cooldown Grace period after scaling activity.
     * Subsequent scale outs during the cooldown period are squashed so that only
     * the biggest scale out happens.
     *
     * Subsequent scale ins during the cooldown period are ignored.
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    /**
     * @param datapointsToAlarm The number of data points out of the evaluation periods that must be
     * breaching to trigger a scaling action.
     * Creates an "M out of N" alarm, where this property is the M and the value set for
     * `evaluationPeriods` is the N value.
     *
     * Only has meaning if `evaluationPeriods != 1`.
     */
    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    /**
     * @param evaluationPeriods How many evaluation periods of the metric to wait before triggering
     * a scaling action.
     * Raising this value can be used to smooth out the metric, at the expense
     * of slower response times.
     *
     * If `datapointsToAlarm` is not set, then all data points in the evaluation period
     * must meet the criteria to trigger a scaling action.
     */
    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /**
     * @param metric Metric to scale on. 
     */
    override fun metric(metric: IMetric) {
      cdkBuilder.metric(metric.let(IMetric::unwrap))
    }

    /**
     * @param metricAggregationType Aggregation to apply to all data points over the evaluation
     * periods.
     * Only has meaning if `evaluationPeriods != 1`.
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
     * @param scalingSteps The intervals for scaling. 
     * Maps a range of metric values to a particular scaling behavior.
     *
     * Must be between 2 and 40 steps.
     */
    override fun scalingSteps(scalingSteps: List<ScalingInterval>) {
      cdkBuilder.scalingSteps(scalingSteps.map(ScalingInterval::unwrap))
    }

    /**
     * @param scalingSteps The intervals for scaling. 
     * Maps a range of metric values to a particular scaling behavior.
     *
     * Must be between 2 and 40 steps.
     */
    override fun scalingSteps(vararg scalingSteps: ScalingInterval): Unit =
        scalingSteps(scalingSteps.toList())

    /**
     * @param scalingTarget The scaling target. 
     */
    override fun scalingTarget(scalingTarget: IScalableTarget) {
      cdkBuilder.scalingTarget(scalingTarget.let(IScalableTarget::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps,
  ) : CdkObject(cdkObject), StepScalingPolicyProps {
    /**
     * How the adjustment numbers inside 'intervals' are interpreted.
     *
     * Default: ChangeInCapacity
     */
    override fun adjustmentType(): AdjustmentType? =
        unwrap(this).getAdjustmentType()?.let(AdjustmentType::wrap)

    /**
     * Grace period after scaling activity.
     *
     * Subsequent scale outs during the cooldown period are squashed so that only
     * the biggest scale out happens.
     *
     * Subsequent scale ins during the cooldown period are ignored.
     *
     * Default: No cooldown period
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepScalingPolicyConfiguration.html)
     */
    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    /**
     * The number of data points out of the evaluation periods that must be breaching to trigger a
     * scaling action.
     *
     * Creates an "M out of N" alarm, where this property is the M and the value set for
     * `evaluationPeriods` is the N value.
     *
     * Only has meaning if `evaluationPeriods != 1`.
     *
     * Default: - Same as `evaluationPeriods`
     */
    override fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

    /**
     * How many evaluation periods of the metric to wait before triggering a scaling action.
     *
     * Raising this value can be used to smooth out the metric, at the expense
     * of slower response times.
     *
     * If `datapointsToAlarm` is not set, then all data points in the evaluation period
     * must meet the criteria to trigger a scaling action.
     *
     * Default: 1
     */
    override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

    /**
     * Metric to scale on.
     */
    override fun metric(): IMetric = unwrap(this).getMetric().let(IMetric::wrap)

    /**
     * Aggregation to apply to all data points over the evaluation periods.
     *
     * Only has meaning if `evaluationPeriods != 1`.
     *
     * Default: - The statistic from the metric if applicable (MIN, MAX, AVERAGE), otherwise
     * AVERAGE.
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
     * The intervals for scaling.
     *
     * Maps a range of metric values to a particular scaling behavior.
     *
     * Must be between 2 and 40 steps.
     */
    override fun scalingSteps(): List<ScalingInterval> =
        unwrap(this).getScalingSteps().map(ScalingInterval::wrap)

    /**
     * The scaling target.
     */
    override fun scalingTarget(): IScalableTarget =
        unwrap(this).getScalingTarget().let(IScalableTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StepScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps):
        StepScalingPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? StepScalingPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StepScalingPolicyProps):
        software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps
  }
}
