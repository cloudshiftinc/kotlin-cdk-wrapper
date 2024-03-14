package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface RequestCountScalingProps : BaseTargetTrackingProps {
  public fun targetRequestsPerMinute(): Number? = unwrap(this).getTargetRequestsPerMinute()

  public interface Builder {
    public fun cooldown(cooldown: Duration)

    public fun disableScaleIn(disableScaleIn: Boolean)

    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration)

    public fun targetRequestsPerMinute(targetRequestsPerMinute: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder =
        software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.builder()

    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration::unwrap))
    }

    override fun targetRequestsPerMinute(targetRequestsPerMinute: Number) {
      cdkBuilder.targetRequestsPerMinute(targetRequestsPerMinute)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.RequestCountScalingProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.RequestCountScalingProps,
  ) : RequestCountScalingProps {
    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    override fun estimatedInstanceWarmup(): Duration? =
        unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

    override fun targetRequestsPerMinute(): Number? = unwrap(this).getTargetRequestsPerMinute()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RequestCountScalingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.RequestCountScalingProps):
        RequestCountScalingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestCountScalingProps):
        software.amazon.awscdk.services.autoscaling.RequestCountScalingProps = (wrapped as
        Wrapper).cdkObject
  }
}
