package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class WarmPool internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.WarmPool,
) : Resource(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.autoscaling.WarmPool].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Auto Scaling group to add the warm pool to.
     *
     * @param autoScalingGroup The Auto Scaling group to add the warm pool to. 
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    /**
     * The maximum number of instances that are allowed to be in the warm pool or in any state
     * except Terminated for the Auto Scaling group.
     *
     * If the value is not specified, Amazon EC2 Auto Scaling launches and maintains
     * the difference between the group's maximum capacity and its desired capacity.
     *
     * Default: - max size of the Auto Scaling group
     *
     * @param maxGroupPreparedCapacity The maximum number of instances that are allowed to be in the
     * warm pool or in any state except Terminated for the Auto Scaling group. 
     */
    public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number)

    /**
     * The minimum number of instances to maintain in the warm pool.
     *
     * Default: 0
     *
     * @param minSize The minimum number of instances to maintain in the warm pool. 
     */
    public fun minSize(minSize: Number)

    /**
     * The instance state to transition to after the lifecycle actions are complete.
     *
     * Default: PoolState.STOPPED
     *
     * @param poolState The instance state to transition to after the lifecycle actions are
     * complete. 
     */
    public fun poolState(poolState: PoolState)

    /**
     * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * If the value is not specified, instances in the Auto Scaling group will be terminated
     * when the group scales in.
     *
     * Default: false
     *
     * @param reuseOnScaleIn Indicates whether instances in the Auto Scaling group can be returned
     * to the warm pool on scale in. 
     */
    public fun reuseOnScaleIn(reuseOnScaleIn: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.WarmPool.Builder =
        software.amazon.awscdk.services.autoscaling.WarmPool.Builder.create(scope, id)

    /**
     * The Auto Scaling group to add the warm pool to.
     *
     * @param autoScalingGroup The Auto Scaling group to add the warm pool to. 
     */
    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    /**
     * The maximum number of instances that are allowed to be in the warm pool or in any state
     * except Terminated for the Auto Scaling group.
     *
     * If the value is not specified, Amazon EC2 Auto Scaling launches and maintains
     * the difference between the group's maximum capacity and its desired capacity.
     *
     * Default: - max size of the Auto Scaling group
     *
     * @param maxGroupPreparedCapacity The maximum number of instances that are allowed to be in the
     * warm pool or in any state except Terminated for the Auto Scaling group. 
     */
    override fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
      cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
    }

    /**
     * The minimum number of instances to maintain in the warm pool.
     *
     * Default: 0
     *
     * @param minSize The minimum number of instances to maintain in the warm pool. 
     */
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * The instance state to transition to after the lifecycle actions are complete.
     *
     * Default: PoolState.STOPPED
     *
     * @param poolState The instance state to transition to after the lifecycle actions are
     * complete. 
     */
    override fun poolState(poolState: PoolState) {
      cdkBuilder.poolState(poolState.let(PoolState::unwrap))
    }

    /**
     * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * If the value is not specified, instances in the Auto Scaling group will be terminated
     * when the group scales in.
     *
     * Default: false
     *
     * @param reuseOnScaleIn Indicates whether instances in the Auto Scaling group can be returned
     * to the warm pool on scale in. 
     */
    override fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
      cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.WarmPool = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): WarmPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return WarmPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.WarmPool): WarmPool =
        WarmPool(cdkObject)

    internal fun unwrap(wrapped: WarmPool): software.amazon.awscdk.services.autoscaling.WarmPool =
        wrapped.cdkObject
  }
}