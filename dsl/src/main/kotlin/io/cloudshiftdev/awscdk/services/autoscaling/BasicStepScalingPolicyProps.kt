package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface BasicStepScalingPolicyProps {
  public fun adjustmentType(): AdjustmentType? =
      unwrap(this).getAdjustmentType()?.let(AdjustmentType::wrap)

  public fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

  public fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  public fun estimatedInstanceWarmup(): Duration? =
      unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

  public fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

  public fun metric(): IMetric

  public fun metricAggregationType(): MetricAggregationType? =
      unwrap(this).getMetricAggregationType()?.let(MetricAggregationType::wrap)

  public fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

  public fun scalingSteps(): List<ScalingInterval>

  public interface Builder {
    public fun adjustmentType(adjustmentType: AdjustmentType)

    public fun cooldown(cooldown: Duration)

    public fun datapointsToAlarm(datapointsToAlarm: Number)

    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration)

    public fun evaluationPeriods(evaluationPeriods: Number)

    public fun metric(metric: IMetric)

    public fun metricAggregationType(metricAggregationType: MetricAggregationType)

    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number)

    public fun scalingSteps(scalingSteps: List<ScalingInterval>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder =
        software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.builder()

    override fun adjustmentType(adjustmentType: AdjustmentType) {
      cdkBuilder.adjustmentType(adjustmentType.let(AdjustmentType::unwrap))
    }

    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration::unwrap))
    }

    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    override fun metric(metric: IMetric) {
      cdkBuilder.metric(metric.let(IMetric::unwrap))
    }

    override fun metricAggregationType(metricAggregationType: MetricAggregationType) {
      cdkBuilder.metricAggregationType(metricAggregationType.let(MetricAggregationType::unwrap))
    }

    override fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
      cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    override fun scalingSteps(scalingSteps: List<ScalingInterval>) {
      cdkBuilder.scalingSteps(scalingSteps.map(ScalingInterval::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps,
  ) : BasicStepScalingPolicyProps {
    override fun adjustmentType(): AdjustmentType? =
        unwrap(this).getAdjustmentType()?.let(AdjustmentType::wrap)

    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    override fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

    override fun estimatedInstanceWarmup(): Duration? =
        unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

    override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

    override fun metric(): IMetric = unwrap(this).getMetric().let(IMetric::wrap)

    override fun metricAggregationType(): MetricAggregationType? =
        unwrap(this).getMetricAggregationType()?.let(MetricAggregationType::wrap)

    override fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

    override fun scalingSteps(): List<ScalingInterval> =
        unwrap(this).getScalingSteps().map(ScalingInterval::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BasicStepScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps):
        BasicStepScalingPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasicStepScalingPolicyProps):
        software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps = (wrapped as
        Wrapper).cdkObject
  }
}
