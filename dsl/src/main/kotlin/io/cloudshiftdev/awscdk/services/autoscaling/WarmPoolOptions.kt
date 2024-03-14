package io.cloudshiftdev.awscdk.services.autoscaling

import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface WarmPoolOptions {
  public fun maxGroupPreparedCapacity(): Number? = unwrap(this).getMaxGroupPreparedCapacity()

  public fun minSize(): Number? = unwrap(this).getMinSize()

  public fun poolState(): PoolState? = unwrap(this).getPoolState()?.let(PoolState::wrap)

  public fun reuseOnScaleIn(): Boolean? = unwrap(this).getReuseOnScaleIn()

  public interface Builder {
    public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
    }

    public fun minSize(minSize: Number) {
    }

    public fun poolState(poolState: PoolState) {
    }

    public fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.WarmPoolOptions.Builder =
        software.amazon.awscdk.services.autoscaling.WarmPoolOptions.builder()

    public override fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
      cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
    }

    public override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    public override fun poolState(poolState: PoolState) {
      cdkBuilder.poolState(poolState.let(PoolState::unwrap))
    }

    public override fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
      cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.WarmPoolOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.WarmPoolOptions,
  ) : WarmPoolOptions {
    public override fun maxGroupPreparedCapacity(): Number? =
        unwrap(this).getMaxGroupPreparedCapacity()

    public override fun minSize(): Number? = unwrap(this).getMinSize()

    public override fun poolState(): PoolState? = unwrap(this).getPoolState()?.let(PoolState::wrap)

    public override fun reuseOnScaleIn(): Boolean? = unwrap(this).getReuseOnScaleIn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): WarmPoolOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.WarmPoolOptions):
        WarmPoolOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WarmPoolOptions):
        software.amazon.awscdk.services.autoscaling.WarmPoolOptions = (wrapped as Wrapper).cdkObject
  }
}
