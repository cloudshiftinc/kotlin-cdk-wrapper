@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface TargetTrackingScalingPolicyProps : BasicTargetTrackingScalingPolicyProps {
  public fun autoScalingGroup(): IAutoScalingGroup

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    public fun cooldown(cooldown: Duration)

    public fun customMetric(customMetric: IMetric)

    public fun disableScaleIn(disableScaleIn: Boolean)

    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration)

    public fun predefinedMetric(predefinedMetric: PredefinedMetric)

    public fun resourceLabel(resourceLabel: String)

    public fun targetValue(targetValue: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder =
        software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.builder()

    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    override fun customMetric(customMetric: IMetric) {
      cdkBuilder.customMetric(customMetric.let(IMetric::unwrap))
    }

    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration::unwrap))
    }

    override fun predefinedMetric(predefinedMetric: PredefinedMetric) {
      cdkBuilder.predefinedMetric(predefinedMetric.let(PredefinedMetric::unwrap))
    }

    override fun resourceLabel(resourceLabel: String) {
      cdkBuilder.resourceLabel(resourceLabel)
    }

    override fun targetValue(targetValue: Number) {
      cdkBuilder.targetValue(targetValue)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps,
  ) : CdkObject(cdkObject), TargetTrackingScalingPolicyProps {
    override fun autoScalingGroup(): IAutoScalingGroup =
        unwrap(this).getAutoScalingGroup().let(IAutoScalingGroup::wrap)

    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    override fun customMetric(): IMetric? = unwrap(this).getCustomMetric()?.let(IMetric::wrap)

    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    override fun estimatedInstanceWarmup(): Duration? =
        unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

    override fun predefinedMetric(): PredefinedMetric? =
        unwrap(this).getPredefinedMetric()?.let(PredefinedMetric::wrap)

    override fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    override fun targetValue(): Number = unwrap(this).getTargetValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TargetTrackingScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps):
        TargetTrackingScalingPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TargetTrackingScalingPolicyProps):
        software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps
  }
}
