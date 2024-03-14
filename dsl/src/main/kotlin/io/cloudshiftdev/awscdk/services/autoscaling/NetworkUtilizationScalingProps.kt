package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface NetworkUtilizationScalingProps : BaseTargetTrackingProps {
  public fun targetBytesPerSecond(): Number

  public interface Builder {
    public fun cooldown(cooldown: Duration)

    public fun disableScaleIn(disableScaleIn: Boolean)

    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration)

    public fun targetBytesPerSecond(targetBytesPerSecond: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder =
        software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.builder()

    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration::unwrap))
    }

    override fun targetBytesPerSecond(targetBytesPerSecond: Number) {
      cdkBuilder.targetBytesPerSecond(targetBytesPerSecond)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps,
  ) : NetworkUtilizationScalingProps {
    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    override fun estimatedInstanceWarmup(): Duration? =
        unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

    override fun targetBytesPerSecond(): Number = unwrap(this).getTargetBytesPerSecond()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkUtilizationScalingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps):
        NetworkUtilizationScalingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkUtilizationScalingProps):
        software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps = (wrapped as
        Wrapper).cdkObject
  }
}
