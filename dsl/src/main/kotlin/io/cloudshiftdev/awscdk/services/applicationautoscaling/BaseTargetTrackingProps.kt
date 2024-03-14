package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface BaseTargetTrackingProps {
  public fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

  public fun policyName(): String? = unwrap(this).getPolicyName()

  public fun scaleInCooldown(): Duration? = unwrap(this).getScaleInCooldown()?.let(Duration::wrap)

  public fun scaleOutCooldown(): Duration? = unwrap(this).getScaleOutCooldown()?.let(Duration::wrap)

  public interface Builder {
    public fun disableScaleIn(disableScaleIn: Boolean)

    public fun policyName(policyName: String)

    public fun scaleInCooldown(scaleInCooldown: Duration)

    public fun scaleOutCooldown(scaleOutCooldown: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.builder()

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

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps,
  ) : BaseTargetTrackingProps {
    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    override fun policyName(): String? = unwrap(this).getPolicyName()

    override fun scaleInCooldown(): Duration? =
        unwrap(this).getScaleInCooldown()?.let(Duration::wrap)

    override fun scaleOutCooldown(): Duration? =
        unwrap(this).getScaleOutCooldown()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseTargetTrackingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps):
        BaseTargetTrackingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseTargetTrackingProps):
        software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps = (wrapped as
        Wrapper).cdkObject
  }
}
