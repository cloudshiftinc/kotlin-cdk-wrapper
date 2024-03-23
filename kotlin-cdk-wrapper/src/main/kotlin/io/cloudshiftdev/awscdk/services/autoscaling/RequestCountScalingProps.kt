@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * Properties for enabling scaling based on request/second.
 *
 * Example:
 *
 * ```
 * AutoScalingGroup autoScalingGroup;
 * autoScalingGroup.scaleOnRequestCount("LimitRPS", RequestCountScalingProps.builder()
 * .targetRequestsPerSecond(1000)
 * .build());
 * ```
 */
public interface RequestCountScalingProps : BaseTargetTrackingProps {
  /**
   * Target average requests/minute on each instance.
   *
   * Default: - Specify exactly one of 'targetRequestsPerMinute' and 'targetRequestsPerSecond'
   */
  public fun targetRequestsPerMinute(): Number? = unwrap(this).getTargetRequestsPerMinute()

  /**
   * A builder for [RequestCountScalingProps]
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

    /**
     * @param targetRequestsPerMinute Target average requests/minute on each instance.
     */
    public fun targetRequestsPerMinute(targetRequestsPerMinute: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder =
        software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.builder()

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

    /**
     * @param targetRequestsPerMinute Target average requests/minute on each instance.
     */
    override fun targetRequestsPerMinute(targetRequestsPerMinute: Number) {
      cdkBuilder.targetRequestsPerMinute(targetRequestsPerMinute)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.RequestCountScalingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.RequestCountScalingProps,
  ) : CdkObject(cdkObject), RequestCountScalingProps {
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

    /**
     * Target average requests/minute on each instance.
     *
     * Default: - Specify exactly one of 'targetRequestsPerMinute' and 'targetRequestsPerSecond'
     */
    override fun targetRequestsPerMinute(): Number? = unwrap(this).getTargetRequestsPerMinute()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RequestCountScalingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.RequestCountScalingProps):
        RequestCountScalingProps = CdkObjectWrappers.wrap(cdkObject) as? RequestCountScalingProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestCountScalingProps):
        software.amazon.awscdk.services.autoscaling.RequestCountScalingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.RequestCountScalingProps
  }
}
