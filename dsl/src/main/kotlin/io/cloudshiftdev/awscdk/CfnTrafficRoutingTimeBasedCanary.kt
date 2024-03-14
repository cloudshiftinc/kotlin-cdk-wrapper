package io.cloudshiftdev.awscdk

import kotlin.Number
import kotlin.Unit

public interface CfnTrafficRoutingTimeBasedCanary {
  public fun bakeTimeMins(): Number? = unwrap(this).getBakeTimeMins()

  public fun stepPercentage(): Number? = unwrap(this).getStepPercentage()

  public interface Builder {
    public fun bakeTimeMins(bakeTimeMins: Number) {
    }

    public fun stepPercentage(stepPercentage: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary.Builder =
        software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary.builder()

    public override fun bakeTimeMins(bakeTimeMins: Number) {
      cdkBuilder.bakeTimeMins(bakeTimeMins)
    }

    public override fun stepPercentage(stepPercentage: Number) {
      cdkBuilder.stepPercentage(stepPercentage)
    }

    public fun build(): software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary,
  ) : CfnTrafficRoutingTimeBasedCanary {
    public override fun bakeTimeMins(): Number? = unwrap(this).getBakeTimeMins()

    public override fun stepPercentage(): Number? = unwrap(this).getStepPercentage()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficRoutingTimeBasedCanary {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary):
        CfnTrafficRoutingTimeBasedCanary = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficRoutingTimeBasedCanary):
        software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary = (wrapped as Wrapper).cdkObject
  }
}
