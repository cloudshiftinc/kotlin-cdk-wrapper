package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class TargetTrackingScalingPolicy internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun scalingPolicyArn(): String = unwrap(this).getScalingPolicyArn()

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

    public fun scalingTarget(scalingTarget: IScalableTarget) {
    }

    public fun targetValue(targetValue: Number) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy.Builder =
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy.Builder.create(scope,
        id)

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

    public override fun scalingTarget(scalingTarget: IScalableTarget) {
      cdkBuilder.scalingTarget(scalingTarget.let(IScalableTarget::unwrap))
    }

    public override fun targetValue(targetValue: Number) {
      cdkBuilder.targetValue(targetValue)
    }

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): TargetTrackingScalingPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return TargetTrackingScalingPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy):
        TargetTrackingScalingPolicy = TargetTrackingScalingPolicy(cdkObject)

    internal fun unwrap(wrapped: TargetTrackingScalingPolicy):
        software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy =
        wrapped.cdkObject
  }
}
