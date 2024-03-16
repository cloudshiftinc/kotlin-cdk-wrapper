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
 * Properties for enabling scaling based on network utilization.
 *
 * Example:
 *
 * ```
 * AutoScalingGroup autoScalingGroup;
 * autoScalingGroup.scaleOnIncomingBytes("LimitIngressPerInstance",
 * NetworkUtilizationScalingProps.builder()
 * .targetBytesPerSecond(10 * 1024 * 1024)
 * .build());
 * autoScalingGroup.scaleOnOutgoingBytes("LimitEgressPerInstance",
 * NetworkUtilizationScalingProps.builder()
 * .targetBytesPerSecond(10 * 1024 * 1024)
 * .build());
 * ```
 */
public interface NetworkUtilizationScalingProps : BaseTargetTrackingProps {
  /**
   * Target average bytes/seconds on each instance.
   */
  public fun targetBytesPerSecond(): Number

  /**
   * A builder for [NetworkUtilizationScalingProps]
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
     * @param targetBytesPerSecond Target average bytes/seconds on each instance. 
     */
    public fun targetBytesPerSecond(targetBytesPerSecond: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder =
        software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.builder()

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
     * @param targetBytesPerSecond Target average bytes/seconds on each instance. 
     */
    override fun targetBytesPerSecond(targetBytesPerSecond: Number) {
      cdkBuilder.targetBytesPerSecond(targetBytesPerSecond)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps,
  ) : CdkObject(cdkObject), NetworkUtilizationScalingProps {
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
     * Target average bytes/seconds on each instance.
     */
    override fun targetBytesPerSecond(): Number = unwrap(this).getTargetBytesPerSecond()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkUtilizationScalingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps):
        NetworkUtilizationScalingProps = CdkObjectWrappers.wrap(cdkObject) as
        NetworkUtilizationScalingProps

    internal fun unwrap(wrapped: NetworkUtilizationScalingProps):
        software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps
  }
}
