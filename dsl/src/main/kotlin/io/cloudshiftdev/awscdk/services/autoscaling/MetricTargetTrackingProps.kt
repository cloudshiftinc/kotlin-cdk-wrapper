package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface MetricTargetTrackingProps : BaseTargetTrackingProps {
  /**
   * Metric to track.
   *
   * The metric must represent a utilization, so that if it's higher than the
   * target value, your ASG should scale out, and if it's lower it should
   * scale in.
   */
  public fun metric(): IMetric

  /**
   * Value to keep the metric around.
   */
  public fun targetValue(): Number

  /**
   * A builder for [MetricTargetTrackingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cooldown Period after a scaling completes before another scaling activity can start.
     */
    public fun cooldown(cooldown: Duration)

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the autoscaling group. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * group.
     */
    public fun disableScaleIn(disableScaleIn: Boolean)

    /**
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch.
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration)

    /**
     * @param metric Metric to track. 
     * The metric must represent a utilization, so that if it's higher than the
     * target value, your ASG should scale out, and if it's lower it should
     * scale in.
     */
    public fun metric(metric: IMetric)

    /**
     * @param targetValue Value to keep the metric around. 
     */
    public fun targetValue(targetValue: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder =
        software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.builder()

    /**
     * @param cooldown Period after a scaling completes before another scaling activity can start.
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the autoscaling group. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * group.
     */
    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch.
     */
    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration::unwrap))
    }

    /**
     * @param metric Metric to track. 
     * The metric must represent a utilization, so that if it's higher than the
     * target value, your ASG should scale out, and if it's lower it should
     * scale in.
     */
    override fun metric(metric: IMetric) {
      cdkBuilder.metric(metric.let(IMetric::unwrap))
    }

    /**
     * @param targetValue Value to keep the metric around. 
     */
    override fun targetValue(targetValue: Number) {
      cdkBuilder.targetValue(targetValue)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps,
  ) : CdkObject(cdkObject), MetricTargetTrackingProps {
    /**
     * Period after a scaling completes before another scaling activity can start.
     *
     * Default: - The default cooldown configured on the AutoScalingGroup.
     */
    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    /**
     * Indicates whether scale in by the target tracking policy is disabled.
     *
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the autoscaling group. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * group.
     *
     * Default: false
     */
    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    /**
     * Estimated time until a newly launched instance can send metrics to CloudWatch.
     *
     * Default: - Same as the cooldown.
     */
    override fun estimatedInstanceWarmup(): Duration? =
        unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

    /**
     * Metric to track.
     *
     * The metric must represent a utilization, so that if it's higher than the
     * target value, your ASG should scale out, and if it's lower it should
     * scale in.
     */
    override fun metric(): IMetric = unwrap(this).getMetric().let(IMetric::wrap)

    /**
     * Value to keep the metric around.
     */
    override fun targetValue(): Number = unwrap(this).getTargetValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MetricTargetTrackingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps):
        MetricTargetTrackingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricTargetTrackingProps):
        software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps
  }
}
