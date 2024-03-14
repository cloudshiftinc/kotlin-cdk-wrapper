package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps,
  ) : BaseTargetTrackingProps {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseTargetTrackingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps):
        BaseTargetTrackingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseTargetTrackingProps):
        software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps = (wrapped as
        Wrapper).cdkObject
  }
}
