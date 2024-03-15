@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface WarmPoolProps : WarmPoolOptions {
  public fun autoScalingGroup(): IAutoScalingGroup

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number)

    public fun minSize(minSize: Number)

    public fun poolState(poolState: PoolState)

    public fun reuseOnScaleIn(reuseOnScaleIn: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.WarmPoolProps.Builder =
        software.amazon.awscdk.services.autoscaling.WarmPoolProps.builder()

    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    override fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
      cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
    }

    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    override fun poolState(poolState: PoolState) {
      cdkBuilder.poolState(poolState.let(PoolState::unwrap))
    }

    override fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
      cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.WarmPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.WarmPoolProps,
  ) : CdkObject(cdkObject), WarmPoolProps {
    override fun autoScalingGroup(): IAutoScalingGroup =
        unwrap(this).getAutoScalingGroup().let(IAutoScalingGroup::wrap)

    override fun maxGroupPreparedCapacity(): Number? = unwrap(this).getMaxGroupPreparedCapacity()

    override fun minSize(): Number? = unwrap(this).getMinSize()

    override fun poolState(): PoolState? = unwrap(this).getPoolState()?.let(PoolState::wrap)

    override fun reuseOnScaleIn(): Boolean? = unwrap(this).getReuseOnScaleIn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WarmPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.WarmPoolProps):
        WarmPoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WarmPoolProps):
        software.amazon.awscdk.services.autoscaling.WarmPoolProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.autoscaling.WarmPoolProps
  }
}
