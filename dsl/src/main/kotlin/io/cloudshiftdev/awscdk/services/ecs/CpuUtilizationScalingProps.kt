package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.applicationautoscaling.BaseTargetTrackingProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CpuUtilizationScalingProps : BaseTargetTrackingProps {
  public fun targetUtilizationPercent(): Number

  public interface Builder {
    public fun disableScaleIn(disableScaleIn: Boolean)

    public fun policyName(policyName: String)

    public fun scaleInCooldown(scaleInCooldown: Duration)

    public fun scaleOutCooldown(scaleOutCooldown: Duration)

    public fun targetUtilizationPercent(targetUtilizationPercent: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder =
        software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.builder()

    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun scaleInCooldown(scaleInCooldown: Duration) {
      cdkBuilder.scaleInCooldown(scaleInCooldown.let(Duration::unwrap))
    }

    override fun scaleOutCooldown(scaleOutCooldown: Duration) {
      cdkBuilder.scaleOutCooldown(scaleOutCooldown.let(Duration::unwrap))
    }

    override fun targetUtilizationPercent(targetUtilizationPercent: Number) {
      cdkBuilder.targetUtilizationPercent(targetUtilizationPercent)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps,
  ) : CpuUtilizationScalingProps {
    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    override fun policyName(): String? = unwrap(this).getPolicyName()

    override fun scaleInCooldown(): Duration? =
        unwrap(this).getScaleInCooldown()?.let(Duration::wrap)

    override fun scaleOutCooldown(): Duration? =
        unwrap(this).getScaleOutCooldown()?.let(Duration::wrap)

    override fun targetUtilizationPercent(): Number = unwrap(this).getTargetUtilizationPercent()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CpuUtilizationScalingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps):
        CpuUtilizationScalingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CpuUtilizationScalingProps):
        software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps = (wrapped as
        Wrapper).cdkObject
  }
}
