package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.applicationautoscaling.BaseTargetTrackingProps
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface TrackCustomMetricProps : BaseTargetTrackingProps {
  public fun metric(): IMetric

  public fun targetValue(): Number

  public interface Builder {
    public fun disableScaleIn(disableScaleIn: Boolean) {
    }

    public fun metric(metric: IMetric) {
    }

    public fun policyName(policyName: String) {
    }

    public fun scaleInCooldown(scaleInCooldown: Duration) {
    }

    public fun scaleOutCooldown(scaleOutCooldown: Duration) {
    }

    public fun targetValue(targetValue: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder =
        software.amazon.awscdk.services.ecs.TrackCustomMetricProps.builder()

    public override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    public override fun metric(metric: IMetric) {
      cdkBuilder.metric(metric.let(IMetric::unwrap))
    }

    public override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    public override fun scaleInCooldown(scaleInCooldown: Duration) {
      cdkBuilder.scaleInCooldown(scaleInCooldown.let(Duration::unwrap))
    }

    public override fun scaleOutCooldown(scaleOutCooldown: Duration) {
      cdkBuilder.scaleOutCooldown(scaleOutCooldown.let(Duration::unwrap))
    }

    public override fun targetValue(targetValue: Number) {
      cdkBuilder.targetValue(targetValue)
    }

    public fun build(): software.amazon.awscdk.services.ecs.TrackCustomMetricProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.TrackCustomMetricProps,
  ) : TrackCustomMetricProps {
    public override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    public override fun metric(): IMetric = unwrap(this).getMetric().let(IMetric::wrap)

    public override fun policyName(): String? = unwrap(this).getPolicyName()

    public override fun scaleInCooldown(): Duration? =
        unwrap(this).getScaleInCooldown()?.let(Duration::wrap)

    public override fun scaleOutCooldown(): Duration? =
        unwrap(this).getScaleOutCooldown()?.let(Duration::wrap)

    public override fun targetValue(): Number = unwrap(this).getTargetValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TrackCustomMetricProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.TrackCustomMetricProps):
        TrackCustomMetricProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TrackCustomMetricProps):
        software.amazon.awscdk.services.ecs.TrackCustomMetricProps = (wrapped as Wrapper).cdkObject
  }
}
