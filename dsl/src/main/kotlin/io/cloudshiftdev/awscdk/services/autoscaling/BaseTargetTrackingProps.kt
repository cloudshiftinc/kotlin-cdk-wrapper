package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.Unit

public interface BaseTargetTrackingProps {
  public fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

  public fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

  public fun estimatedInstanceWarmup(): Duration? =
      unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

  public interface Builder {
    public fun cooldown(cooldown: Duration) {
    }

    public fun disableScaleIn(disableScaleIn: Boolean) {
    }

    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.Builder =
        software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.builder()

    public override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    public override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    public override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps,
  ) : BaseTargetTrackingProps {
    public override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    public override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    public override fun estimatedInstanceWarmup(): Duration? =
        unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseTargetTrackingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps):
        BaseTargetTrackingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseTargetTrackingProps):
        software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps = (wrapped as
        Wrapper).cdkObject
  }
}
