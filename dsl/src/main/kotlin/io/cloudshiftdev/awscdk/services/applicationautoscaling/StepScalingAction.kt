package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class StepScalingAction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.applicationautoscaling.StepScalingAction,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun addAdjustment(adjustment: AdjustmentTier) {
    unwrap(this).addAdjustment(adjustment.let(AdjustmentTier::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("625f4be44fadba0d8875e450d0be9f4ba2684ac6527d0045bf440ed6d3312ef9")
  public open fun addAdjustment(adjustment: AdjustmentTier.Builder.() -> Unit): Unit =
      addAdjustment(AdjustmentTier(adjustment))

  public open fun scalingPolicyArn(): String = unwrap(this).getScalingPolicyArn()

  public interface Builder {
    public fun adjustmentType(adjustmentType: AdjustmentType) {
    }

    public fun cooldown(cooldown: Duration) {
    }

    public fun metricAggregationType(metricAggregationType: MetricAggregationType) {
    }

    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
    }

    public fun policyName(policyName: String) {
    }

    public fun scalingTarget(scalingTarget: IScalableTarget) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.StepScalingAction.Builder =
        software.amazon.awscdk.services.applicationautoscaling.StepScalingAction.Builder.create(scope,
        id)

    public override fun adjustmentType(adjustmentType: AdjustmentType) {
      cdkBuilder.adjustmentType(adjustmentType.let(AdjustmentType::unwrap))
    }

    public override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    public override fun metricAggregationType(metricAggregationType: MetricAggregationType) {
      cdkBuilder.metricAggregationType(metricAggregationType.let(MetricAggregationType::unwrap))
    }

    public override fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
      cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    public override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    public override fun scalingTarget(scalingTarget: IScalableTarget) {
      cdkBuilder.scalingTarget(scalingTarget.let(IScalableTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.StepScalingAction =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): StepScalingAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return StepScalingAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.StepScalingAction):
        StepScalingAction = StepScalingAction(cdkObject)

    internal fun unwrap(wrapped: StepScalingAction):
        software.amazon.awscdk.services.applicationautoscaling.StepScalingAction = wrapped.cdkObject
  }
}
