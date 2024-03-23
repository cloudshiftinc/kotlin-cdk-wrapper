@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * Properties for a warm pool.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * AutoScalingGroup autoScalingGroup;
 * WarmPoolProps warmPoolProps = WarmPoolProps.builder()
 * .autoScalingGroup(autoScalingGroup)
 * // the properties below are optional
 * .maxGroupPreparedCapacity(123)
 * .minSize(123)
 * .poolState(PoolState.HIBERNATED)
 * .reuseOnScaleIn(false)
 * .build();
 * ```
 */
public interface WarmPoolProps : WarmPoolOptions {
  /**
   * The Auto Scaling group to add the warm pool to.
   */
  public fun autoScalingGroup(): IAutoScalingGroup

  /**
   * A builder for [WarmPoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingGroup The Auto Scaling group to add the warm pool to. 
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    /**
     * @param maxGroupPreparedCapacity The maximum number of instances that are allowed to be in the
     * warm pool or in any state except Terminated for the Auto Scaling group.
     * If the value is not specified, Amazon EC2 Auto Scaling launches and maintains
     * the difference between the group's maximum capacity and its desired capacity.
     */
    public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number)

    /**
     * @param minSize The minimum number of instances to maintain in the warm pool.
     */
    public fun minSize(minSize: Number)

    /**
     * @param poolState The instance state to transition to after the lifecycle actions are
     * complete.
     */
    public fun poolState(poolState: PoolState)

    /**
     * @param reuseOnScaleIn Indicates whether instances in the Auto Scaling group can be returned
     * to the warm pool on scale in.
     * If the value is not specified, instances in the Auto Scaling group will be terminated
     * when the group scales in.
     */
    public fun reuseOnScaleIn(reuseOnScaleIn: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.WarmPoolProps.Builder =
        software.amazon.awscdk.services.autoscaling.WarmPoolProps.builder()

    /**
     * @param autoScalingGroup The Auto Scaling group to add the warm pool to. 
     */
    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    /**
     * @param maxGroupPreparedCapacity The maximum number of instances that are allowed to be in the
     * warm pool or in any state except Terminated for the Auto Scaling group.
     * If the value is not specified, Amazon EC2 Auto Scaling launches and maintains
     * the difference between the group's maximum capacity and its desired capacity.
     */
    override fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
      cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
    }

    /**
     * @param minSize The minimum number of instances to maintain in the warm pool.
     */
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * @param poolState The instance state to transition to after the lifecycle actions are
     * complete.
     */
    override fun poolState(poolState: PoolState) {
      cdkBuilder.poolState(poolState.let(PoolState::unwrap))
    }

    /**
     * @param reuseOnScaleIn Indicates whether instances in the Auto Scaling group can be returned
     * to the warm pool on scale in.
     * If the value is not specified, instances in the Auto Scaling group will be terminated
     * when the group scales in.
     */
    override fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
      cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.WarmPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.WarmPoolProps,
  ) : CdkObject(cdkObject), WarmPoolProps {
    /**
     * The Auto Scaling group to add the warm pool to.
     */
    override fun autoScalingGroup(): IAutoScalingGroup =
        unwrap(this).getAutoScalingGroup().let(IAutoScalingGroup::wrap)

    /**
     * The maximum number of instances that are allowed to be in the warm pool or in any state
     * except Terminated for the Auto Scaling group.
     *
     * If the value is not specified, Amazon EC2 Auto Scaling launches and maintains
     * the difference between the group's maximum capacity and its desired capacity.
     *
     * Default: - max size of the Auto Scaling group
     */
    override fun maxGroupPreparedCapacity(): Number? = unwrap(this).getMaxGroupPreparedCapacity()

    /**
     * The minimum number of instances to maintain in the warm pool.
     *
     * Default: 0
     */
    override fun minSize(): Number? = unwrap(this).getMinSize()

    /**
     * The instance state to transition to after the lifecycle actions are complete.
     *
     * Default: PoolState.STOPPED
     */
    override fun poolState(): PoolState? = unwrap(this).getPoolState()?.let(PoolState::wrap)

    /**
     * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * If the value is not specified, instances in the Auto Scaling group will be terminated
     * when the group scales in.
     *
     * Default: false
     */
    override fun reuseOnScaleIn(): Boolean? = unwrap(this).getReuseOnScaleIn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WarmPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.WarmPoolProps):
        WarmPoolProps = CdkObjectWrappers.wrap(cdkObject) as? WarmPoolProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WarmPoolProps):
        software.amazon.awscdk.services.autoscaling.WarmPoolProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.autoscaling.WarmPoolProps
  }
}
