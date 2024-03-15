@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a step scaling action.
 *
 * This kind of scaling policy adjusts the target capacity in configurable
 * steps. The size of the step is configurable based on the metric's distance
 * to its alarm threshold.
 *
 * This Action must be used as the target of a CloudWatch alarm to take effect.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * AutoScalingGroup autoScalingGroup;
 * StepScalingAction stepScalingAction = StepScalingAction.Builder.create(this,
 * "MyStepScalingAction")
 * .autoScalingGroup(autoScalingGroup)
 * // the properties below are optional
 * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
 * .cooldown(Duration.minutes(30))
 * .estimatedInstanceWarmup(Duration.minutes(30))
 * .metricAggregationType(MetricAggregationType.AVERAGE)
 * .minAdjustmentMagnitude(123)
 * .build();
 * ```
 */
public open class StepScalingAction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.StepScalingAction,
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1a31639d9c2c50752daff1f6132dc98d081ebfde6acff41205876ab1c365e2ce")
  public open fun addAdjustment(adjustment: AdjustmentTier.Builder.() -> Unit): Unit =
      addAdjustment(AdjustmentTier(adjustment))

  /**
   * ARN of the scaling policy.
   */
  public open fun scalingPolicyArn(): String = unwrap(this).getScalingPolicyArn()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.autoscaling.StepScalingAction].
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
     * The auto scaling group.
     *
     * @param autoScalingGroup The auto scaling group. 
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    /**
     * Period after a scaling completes before another scaling activity can start.
     *
     * Default: The default cooldown configured on the AutoScalingGroup
     *
     * @param cooldown Period after a scaling completes before another scaling activity can start. 
     */
    public fun cooldown(cooldown: Duration)

    /**
     * Estimated time until a newly launched instance can send metrics to CloudWatch.
     *
     * Default: Same as the cooldown
     *
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch. 
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration)

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
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.StepScalingAction.Builder =
        software.amazon.awscdk.services.autoscaling.StepScalingAction.Builder.create(scope, id)

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
     * The auto scaling group.
     *
     * @param autoScalingGroup The auto scaling group. 
     */
    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    /**
     * Period after a scaling completes before another scaling activity can start.
     *
     * Default: The default cooldown configured on the AutoScalingGroup
     *
     * @param cooldown Period after a scaling completes before another scaling activity can start. 
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    /**
     * Estimated time until a newly launched instance can send metrics to CloudWatch.
     *
     * Default: Same as the cooldown
     *
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch. 
     */
    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration::unwrap))
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

    public fun build(): software.amazon.awscdk.services.autoscaling.StepScalingAction =
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.StepScalingAction):
        StepScalingAction = StepScalingAction(cdkObject)

    internal fun unwrap(wrapped: StepScalingAction):
        software.amazon.awscdk.services.autoscaling.StepScalingAction = wrapped.cdkObject
  }
}
