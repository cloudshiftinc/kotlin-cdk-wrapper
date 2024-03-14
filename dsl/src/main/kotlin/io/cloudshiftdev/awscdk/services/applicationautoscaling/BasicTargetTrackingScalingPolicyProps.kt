package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface BasicTargetTrackingScalingPolicyProps : BaseTargetTrackingProps {
  public fun customMetric(): IMetric? = unwrap(this).getCustomMetric()?.let(IMetric::wrap)

  public fun predefinedMetric(): PredefinedMetric? =
      unwrap(this).getPredefinedMetric()?.let(PredefinedMetric::wrap)

  public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

  public fun targetValue(): Number

  public interface Builder {
    public fun customMetric(customMetric: IMetric) {
    }

    public fun disableScaleIn(disableScaleIn: Boolean) {
    }

    public fun policyName(policyName: String) {
    }

    public fun predefinedMetric(predefinedMetric: PredefinedMetric) {
    }

    public fun resourceLabel(resourceLabel: String) {
    }

    public fun scaleInCooldown(scaleInCooldown: Duration) {
    }

    public fun scaleOutCooldown(scaleOutCooldown: Duration) {
    }

    public fun targetValue(targetValue: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder
        =
        software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.builder()

    public override fun customMetric(customMetric: IMetric) {
      cdkBuilder.customMetric(customMetric.let(IMetric::unwrap))
    }

    public override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    public override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    public override fun predefinedMetric(predefinedMetric: PredefinedMetric) {
      cdkBuilder.predefinedMetric(predefinedMetric.let(PredefinedMetric::unwrap))
    }

    public override fun resourceLabel(resourceLabel: String) {
      cdkBuilder.resourceLabel(resourceLabel)
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

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps,
  ) : BasicTargetTrackingScalingPolicyProps {
    public override fun customMetric(): IMetric? =
        unwrap(this).getCustomMetric()?.let(IMetric::wrap)

    public override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    public override fun policyName(): String? = unwrap(this).getPolicyName()

    public override fun predefinedMetric(): PredefinedMetric? =
        unwrap(this).getPredefinedMetric()?.let(PredefinedMetric::wrap)

    public override fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    public override fun scaleInCooldown(): Duration? =
        unwrap(this).getScaleInCooldown()?.let(Duration::wrap)

    public override fun scaleOutCooldown(): Duration? =
        unwrap(this).getScaleOutCooldown()?.let(Duration::wrap)

    public override fun targetValue(): Number = unwrap(this).getTargetValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        BasicTargetTrackingScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps):
        BasicTargetTrackingScalingPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasicTargetTrackingScalingPolicyProps):
        software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps
        = (wrapped as Wrapper).cdkObject
  }
}
