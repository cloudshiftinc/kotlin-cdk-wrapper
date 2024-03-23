@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Base interface for target tracking props.
 *
 * Contains the attributes that are common to target tracking policies,
 * except the ones relating to the metric and to the scalable target.
 *
 * This interface is reused by more specific target tracking props objects.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * BaseTargetTrackingProps baseTargetTrackingProps = BaseTargetTrackingProps.builder()
 * .cooldown(Duration.minutes(30))
 * .disableScaleIn(false)
 * .estimatedInstanceWarmup(Duration.minutes(30))
 * .build();
 * ```
 */
public interface BaseTargetTrackingProps {
  /**
   * Period after a scaling completes before another scaling activity can start.
   *
   * Default: - The default cooldown configured on the AutoScalingGroup.
   */
  public fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

  /**
   * Indicates whether scale in by the target tracking policy is disabled.
   *
   * If the value is true, scale in is disabled and the target tracking policy
   * won't remove capacity from the autoscaling group. Otherwise, scale in is
   * enabled and the target tracking policy can remove capacity from the
   * group.
   *
   * Default: false
   */
  public fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

  /**
   * Estimated time until a newly launched instance can send metrics to CloudWatch.
   *
   * Default: - Same as the cooldown.
   */
  public fun estimatedInstanceWarmup(): Duration? =
      unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)

  /**
   * A builder for [BaseTargetTrackingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cooldown Period after a scaling completes before another scaling activity can start.
     */
    public fun cooldown(cooldown: Duration)

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the autoscaling group. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * group.
     */
    public fun disableScaleIn(disableScaleIn: Boolean)

    /**
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch.
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.Builder =
        software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.builder()

    /**
     * @param cooldown Period after a scaling completes before another scaling activity can start.
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the autoscaling group. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * group.
     */
    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param estimatedInstanceWarmup Estimated time until a newly launched instance can send
     * metrics to CloudWatch.
     */
    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps,
  ) : CdkObject(cdkObject), BaseTargetTrackingProps {
    /**
     * Period after a scaling completes before another scaling activity can start.
     *
     * Default: - The default cooldown configured on the AutoScalingGroup.
     */
    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    /**
     * Indicates whether scale in by the target tracking policy is disabled.
     *
     * If the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the autoscaling group. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * group.
     *
     * Default: false
     */
    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    /**
     * Estimated time until a newly launched instance can send metrics to CloudWatch.
     *
     * Default: - Same as the cooldown.
     */
    override fun estimatedInstanceWarmup(): Duration? =
        unwrap(this).getEstimatedInstanceWarmup()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseTargetTrackingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps):
        BaseTargetTrackingProps = CdkObjectWrappers.wrap(cdkObject) as? BaseTargetTrackingProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseTargetTrackingProps):
        software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps
  }
}
