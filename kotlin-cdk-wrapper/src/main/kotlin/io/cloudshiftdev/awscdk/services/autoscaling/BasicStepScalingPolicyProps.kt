@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

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
 * AutoScalingGroup autoScalingGroup;
 * Metric workerUtilizationMetric = Metric.Builder.create()
 * .namespace("MyService")
 * .metricName("WorkerUtilization")
 * .build();
 * autoScalingGroup.scaleOnMetric("ScaleToCPU", BasicStepScalingPolicyProps.builder()
 * .metric(workerUtilizationMetric)
 * .scalingSteps(List.of(ScalingInterval.builder().upper(10).change(-1).build(),
 * ScalingInterval.builder().lower(50).change(+1).build(),
 * ScalingInterval.builder().lower(70).change(+3).build()))
 * .evaluationPeriods(10)
 * .datapointsToAlarm(5)
 * // Change this to AdjustmentType.PERCENT_CHANGE_IN_CAPACITY to interpret the
 * // 'change' numbers before as percentages instead of capacity counts.
 * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
 * .build());
 * ```
 */
public interface BasicStepScalingPolicyProps {
  /**
   * How the adjustment numbers inside 'intervals' are interpreted.
   *
   * Default: ChangeInCapacity
   */
  public fun adjustmentType(): AdjustmentType? =
      unwrap(this).getAdjustmentType()?.let(AdjustmentType::wrap)

  /**
   * Grace period after scaling activity.
   *
   * Default: Default cooldown period on your AutoScalingGroup
   */
  public fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

  /**
   * The number of data points out of the evaluation periods that must be breaching to trigger a
   * scaling action.
   *
   * Creates an "M out of N" alarm, where this property is the M and the value set for
   * `evaluationPeriods` is the N value.
   *
   * Only has meaning if `evaluationPeriods != 1`. Must be less than or equal to
   * `evaluationPeriods`.
   *
   * Default: - Same as `evaluationPeriods`
   */
  public fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  /**
   * Estimated time until a newly launched instance can send metrics to CloudWatch.
   *
   * Default: Same as the cooldown
   */
  public fun estimatedInstanceWarmup(): Duration? =
      unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

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
  public fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

  /**
   * Metric to scale on.
   */
  public fun metric(): IMetric

  /**
   * Aggregation to apply to all data points over the evaluation periods.
   *
   * Only has meaning if `evaluationPeriods != 1`.
   *
   * Default: - The statistic from the metric if applicable (MIN, MAX, AVERAGE), otherwise AVERAGE.
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
   * The intervals for scaling.
   *
   * Maps a range of metric values to a particular scaling behavior.
   *
   * Must be between 2 and 40 steps.
   */
  public fun scalingSteps(): List<ScalingInterval>

  /**
   * A builder for [BasicStepScalingPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adjustmentType How the adjustment numbers inside 'intervals' are interpreted.
     */
    public fun adjustmentType(adjustmentType: AdjustmentType)

    /**
     * @param cooldown Grace period after scaling activity.
     */
    public fun cooldown(cooldown: Duration)

    /**
     * @param datapointsToAlarm The number of data points out of the evaluation periods that must be
     * breaching to trigger a scaling action.
     * Creates an "M out of N" alarm, where this property is the M and the value set for
     * `evaluationPeriods` is the N value.
     *
     * Only has meaning if `evaluationPeriods != 1`. Must be less than or equal to
     * `evaluationPeriods`.
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number)

    /**
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch.
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder =
        software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.builder()

    /**
     * @param adjustmentType How the adjustment numbers inside 'intervals' are interpreted.
     */
    override fun adjustmentType(adjustmentType: AdjustmentType) {
      cdkBuilder.adjustmentType(adjustmentType.let(AdjustmentType::unwrap))
    }

    /**
     * @param cooldown Grace period after scaling activity.
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
     * Only has meaning if `evaluationPeriods != 1`. Must be less than or equal to
     * `evaluationPeriods`.
     */
    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    /**
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch.
     */
    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration::unwrap))
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

    public fun build(): software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps,
  ) : CdkObject(cdkObject), BasicStepScalingPolicyProps {
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
     * Default: Default cooldown period on your AutoScalingGroup
     */
    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    /**
     * The number of data points out of the evaluation periods that must be breaching to trigger a
     * scaling action.
     *
     * Creates an "M out of N" alarm, where this property is the M and the value set for
     * `evaluationPeriods` is the N value.
     *
     * Only has meaning if `evaluationPeriods != 1`. Must be less than or equal to
     * `evaluationPeriods`.
     *
     * Default: - Same as `evaluationPeriods`
     */
    override fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

    /**
     * Estimated time until a newly launched instance can send metrics to CloudWatch.
     *
     * Default: Same as the cooldown
     */
    override fun estimatedInstanceWarmup(): Duration? =
        unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BasicStepScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps):
        BasicStepScalingPolicyProps = CdkObjectWrappers.wrap(cdkObject) as?
        BasicStepScalingPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasicStepScalingPolicyProps):
        software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps
  }
}
