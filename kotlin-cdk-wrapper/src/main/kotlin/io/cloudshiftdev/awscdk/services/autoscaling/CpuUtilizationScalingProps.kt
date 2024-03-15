@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface CpuUtilizationScalingProps : BaseTargetTrackingProps {
  public fun targetUtilizationPercent(): Number

  @CdkDslMarker
  public interface Builder {
    public fun cooldown(cooldown: Duration)

    public fun disableScaleIn(disableScaleIn: Boolean)

    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration)

    public fun targetUtilizationPercent(targetUtilizationPercent: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder =
        software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.builder()

    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration::unwrap))
    }

    override fun targetUtilizationPercent(targetUtilizationPercent: Number) {
      cdkBuilder.targetUtilizationPercent(targetUtilizationPercent)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps,
  ) : CdkObject(cdkObject), CpuUtilizationScalingProps {
    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    override fun estimatedInstanceWarmup(): Duration? =
        unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

    override fun targetUtilizationPercent(): Number = unwrap(this).getTargetUtilizationPercent()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CpuUtilizationScalingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps):
        CpuUtilizationScalingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CpuUtilizationScalingProps):
        software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps
  }
}