@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Base interface for target tracking props.
 *
 * Contains the attributes that are common to target tracking policies,
 * except the ones relating to the metric and to the scalable target.
 *
 * This interface is reused by more specific target tracking props objects
 * in other services.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
 * BaseTargetTrackingProps baseTargetTrackingProps = BaseTargetTrackingProps.builder()
 * .disableScaleIn(false)
 * .policyName("policyName")
 * .scaleInCooldown(Duration.minutes(30))
 * .scaleOutCooldown(Duration.minutes(30))
 * .build();
 * ```
 */
public interface BaseTargetTrackingProps {
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
  public fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

  /**
   * A name for the scaling policy.
   *
   * Default: - Automatically generated name.
   */
  public fun policyName(): String? = unwrap(this).getPolicyName()

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
  public fun scaleInCooldown(): Duration? = unwrap(this).getScaleInCooldown()?.let(Duration::wrap)

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
  public fun scaleOutCooldown(): Duration? = unwrap(this).getScaleOutCooldown()?.let(Duration::wrap)

  /**
   * A builder for [BaseTargetTrackingProps]
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.builder()

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
      cdkBuilder.scaleInCooldown(scaleInCooldown.let(Duration.Companion::unwrap))
    }

    /**
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     * activity can start.
     */
    override fun scaleOutCooldown(scaleOutCooldown: Duration) {
      cdkBuilder.scaleOutCooldown(scaleOutCooldown.let(Duration.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps,
  ) : CdkObject(cdkObject), BaseTargetTrackingProps {
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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseTargetTrackingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps):
        BaseTargetTrackingProps = CdkObjectWrappers.wrap(cdkObject) as? BaseTargetTrackingProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseTargetTrackingProps):
        software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps
  }
}
