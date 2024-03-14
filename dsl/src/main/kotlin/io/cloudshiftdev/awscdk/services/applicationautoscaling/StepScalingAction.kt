package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class StepScalingAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.applicationautoscaling.StepScalingAction,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  /**
   * Add an adjusment interval to the ScalingAction.
   *
   * @param adjustment 
   */
  public open fun addAdjustment(adjustment: AdjustmentTier) {
    unwrap(this).addAdjustment(adjustment.let(AdjustmentTier::unwrap))
  }

  /**
   * Add an adjusment interval to the ScalingAction.
   *
   * @param adjustment 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("625f4be44fadba0d8875e450d0be9f4ba2684ac6527d0045bf440ed6d3312ef9")
  public open fun addAdjustment(adjustment: AdjustmentTier.Builder.() -> Unit): Unit =
      addAdjustment(AdjustmentTier(adjustment))

  /**
   * ARN of the scaling policy.
   */
  public open fun scalingPolicyArn(): String = unwrap(this).getScalingPolicyArn()

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.applicationautoscaling.StepScalingAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * How the adjustment numbers are interpreted.
     *
     * Default: ChangeInCapacity
     *
     * @param adjustmentType How the adjustment numbers are interpreted. 
     */
    public fun adjustmentType(adjustmentType: AdjustmentType)

    /**
     * Grace period after scaling activity.
     *
     * For scale out policies, multiple scale outs during the cooldown period are
     * squashed so that only the biggest scale out happens.
     *
     * For scale in policies, subsequent scale ins during the cooldown period are
     * ignored.
     *
     * Default: No cooldown period
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepScalingPolicyConfiguration.html)
     * @param cooldown Grace period after scaling activity. 
     */
    public fun cooldown(cooldown: Duration)

    /**
     * The aggregation type for the CloudWatch metrics.
     *
     * Default: Average
     *
     * @param metricAggregationType The aggregation type for the CloudWatch metrics. 
     */
    public fun metricAggregationType(metricAggregationType: MetricAggregationType)

    /**
     * Minimum absolute number to adjust capacity with as result of percentage scaling.
     *
     * Only when using AdjustmentType = PercentChangeInCapacity, this number controls
     * the minimum absolute effect size.
     *
     * Default: No minimum scaling effect
     *
     * @param minAdjustmentMagnitude Minimum absolute number to adjust capacity with as result of
     * percentage scaling. 
     */
    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number)

    /**
     * A name for the scaling policy.
     *
     * Default: Automatically generated name
     *
     * @param policyName A name for the scaling policy. 
     */
    public fun policyName(policyName: String)

    /**
     * The scalable target.
     *
     * @param scalingTarget The scalable target. 
     */
    public fun scalingTarget(scalingTarget: IScalableTarget)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.StepScalingAction.Builder =
        software.amazon.awscdk.services.applicationautoscaling.StepScalingAction.Builder.create(scope,
        id)

    /**
     * How the adjustment numbers are interpreted.
     *
     * Default: ChangeInCapacity
     *
     * @param adjustmentType How the adjustment numbers are interpreted. 
     */
    override fun adjustmentType(adjustmentType: AdjustmentType) {
      cdkBuilder.adjustmentType(adjustmentType.let(AdjustmentType::unwrap))
    }

    /**
     * Grace period after scaling activity.
     *
     * For scale out policies, multiple scale outs during the cooldown period are
     * squashed so that only the biggest scale out happens.
     *
     * For scale in policies, subsequent scale ins during the cooldown period are
     * ignored.
     *
     * Default: No cooldown period
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepScalingPolicyConfiguration.html)
     * @param cooldown Grace period after scaling activity. 
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    /**
     * The aggregation type for the CloudWatch metrics.
     *
     * Default: Average
     *
     * @param metricAggregationType The aggregation type for the CloudWatch metrics. 
     */
    override fun metricAggregationType(metricAggregationType: MetricAggregationType) {
      cdkBuilder.metricAggregationType(metricAggregationType.let(MetricAggregationType::unwrap))
    }

    /**
     * Minimum absolute number to adjust capacity with as result of percentage scaling.
     *
     * Only when using AdjustmentType = PercentChangeInCapacity, this number controls
     * the minimum absolute effect size.
     *
     * Default: No minimum scaling effect
     *
     * @param minAdjustmentMagnitude Minimum absolute number to adjust capacity with as result of
     * percentage scaling. 
     */
    override fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
      cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    /**
     * A name for the scaling policy.
     *
     * Default: Automatically generated name
     *
     * @param policyName A name for the scaling policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * The scalable target.
     *
     * @param scalingTarget The scalable target. 
     */
    override fun scalingTarget(scalingTarget: IScalableTarget) {
      cdkBuilder.scalingTarget(scalingTarget.let(IScalableTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.StepScalingAction =
        cdkBuilder.build()
  }

  public companion object {
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
