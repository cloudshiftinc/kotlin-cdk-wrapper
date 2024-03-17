@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.applicationautoscaling.BaseTargetTrackingProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Options for enabling Lambda utilization tracking.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * Function fn;
 * Alias alias = fn.addAlias("prod");
 * // Create AutoScaling target
 * IScalableFunctionAttribute as =
 * alias.addAutoScaling(AutoScalingOptions.builder().maxCapacity(50).build());
 * // Configure Target Tracking
 * as.scaleOnUtilization(UtilizationScalingOptions.builder()
 * .utilizationTarget(0.5)
 * .build());
 * // Configure Scheduled Scaling
 * as.scaleOnSchedule("ScaleUpInTheMorning", ScalingSchedule.builder()
 * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
 * .minCapacity(20)
 * .build());
 * ```
 */
public interface UtilizationScalingOptions : BaseTargetTrackingProps {
  /**
   * Utilization target for the attribute.
   *
   * For example, .5 indicates that 50 percent of allocated provisioned concurrency is in use.
   */
  public fun utilizationTarget(): Number

  /**
   * A builder for [UtilizationScalingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource.
     */
    public fun disableScaleIn(disableScaleIn: Boolean)

    /**
     * @param policyName A name for the scaling policy.
     */
    public fun policyName(policyName: String)

    /**
     * @param scaleInCooldown Period after a scale in activity completes before another scale in
     * activity can start.
     */
    public fun scaleInCooldown(scaleInCooldown: Duration)

    /**
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     * activity can start.
     */
    public fun scaleOutCooldown(scaleOutCooldown: Duration)

    /**
     * @param utilizationTarget Utilization target for the attribute. 
     * For example, .5 indicates that 50 percent of allocated provisioned concurrency is in use.
     */
    public fun utilizationTarget(utilizationTarget: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.UtilizationScalingOptions.Builder
        = software.amazon.awscdk.services.lambda.UtilizationScalingOptions.builder()

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource.
     */
    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param policyName A name for the scaling policy.
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * @param scaleInCooldown Period after a scale in activity completes before another scale in
     * activity can start.
     */
    override fun scaleInCooldown(scaleInCooldown: Duration) {
      cdkBuilder.scaleInCooldown(scaleInCooldown.let(Duration::unwrap))
    }

    /**
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     * activity can start.
     */
    override fun scaleOutCooldown(scaleOutCooldown: Duration) {
      cdkBuilder.scaleOutCooldown(scaleOutCooldown.let(Duration::unwrap))
    }

    /**
     * @param utilizationTarget Utilization target for the attribute. 
     * For example, .5 indicates that 50 percent of allocated provisioned concurrency is in use.
     */
    override fun utilizationTarget(utilizationTarget: Number) {
      cdkBuilder.utilizationTarget(utilizationTarget)
    }

    public fun build(): software.amazon.awscdk.services.lambda.UtilizationScalingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.UtilizationScalingOptions,
  ) : CdkObject(cdkObject), UtilizationScalingOptions {
    /**
     * Indicates whether scale in by the target tracking policy is disabled.
     *
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource.
     *
     * Default: false
     */
    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    /**
     * A name for the scaling policy.
     *
     * Default: - Automatically generated name.
     */
    override fun policyName(): String? = unwrap(this).getPolicyName()

    /**
     * Period after a scale in activity completes before another scale in activity can start.
     *
     * Default: Duration.seconds(300) for the following scalable targets: ECS services,
     * Spot Fleet requests, EMR clusters, AppStream 2.0 fleets, Aurora DB clusters,
     * Amazon SageMaker endpoint variants, Custom resources. For all other scalable
     * targets, the default value is Duration.seconds(0): DynamoDB tables, DynamoDB
     * global secondary indexes, Amazon Comprehend document classification endpoints,
     * Lambda provisioned concurrency
     */
    override fun scaleInCooldown(): Duration? =
        unwrap(this).getScaleInCooldown()?.let(Duration::wrap)

    /**
     * Period after a scale out activity completes before another scale out activity can start.
     *
     * Default: Duration.seconds(300) for the following scalable targets: ECS services,
     * Spot Fleet requests, EMR clusters, AppStream 2.0 fleets, Aurora DB clusters,
     * Amazon SageMaker endpoint variants, Custom resources. For all other scalable
     * targets, the default value is Duration.seconds(0): DynamoDB tables, DynamoDB
     * global secondary indexes, Amazon Comprehend document classification endpoints,
     * Lambda provisioned concurrency
     */
    override fun scaleOutCooldown(): Duration? =
        unwrap(this).getScaleOutCooldown()?.let(Duration::wrap)

    /**
     * Utilization target for the attribute.
     *
     * For example, .5 indicates that 50 percent of allocated provisioned concurrency is in use.
     */
    override fun utilizationTarget(): Number = unwrap(this).getUtilizationTarget()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UtilizationScalingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.UtilizationScalingOptions):
        UtilizationScalingOptions = CdkObjectWrappers.wrap(cdkObject) as? UtilizationScalingOptions
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UtilizationScalingOptions):
        software.amazon.awscdk.services.lambda.UtilizationScalingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.UtilizationScalingOptions
  }
}
