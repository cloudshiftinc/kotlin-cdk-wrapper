@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface CfnTrafficRoutingTimeBasedLinear {
  public fun bakeTimeMins(): Number? = unwrap(this).getBakeTimeMins()

  public fun stepPercentage(): Number? = unwrap(this).getStepPercentage()

  @CdkDslMarker
  public interface Builder {
    public fun bakeTimeMins(bakeTimeMins: Number)

    public fun stepPercentage(stepPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear.Builder =
        software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear.builder()

    override fun bakeTimeMins(bakeTimeMins: Number) {
      cdkBuilder.bakeTimeMins(bakeTimeMins)
    }

    override fun stepPercentage(stepPercentage: Number) {
      cdkBuilder.stepPercentage(stepPercentage)
    }

    public fun build(): software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear,
  ) : CdkObject(cdkObject), CfnTrafficRoutingTimeBasedLinear {
    override fun bakeTimeMins(): Number? = unwrap(this).getBakeTimeMins()

    override fun stepPercentage(): Number? = unwrap(this).getStepPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficRoutingTimeBasedLinear {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear):
        CfnTrafficRoutingTimeBasedLinear = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficRoutingTimeBasedLinear):
        software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear
  }
}
