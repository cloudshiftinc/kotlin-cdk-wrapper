@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface CfnTrafficRoutingTimeBasedCanary {
  public fun bakeTimeMins(): Number? = unwrap(this).getBakeTimeMins()

  public fun stepPercentage(): Number? = unwrap(this).getStepPercentage()

  @CdkDslMarker
  public interface Builder {
    public fun bakeTimeMins(bakeTimeMins: Number)

    public fun stepPercentage(stepPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary.Builder =
        software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary.builder()

    override fun bakeTimeMins(bakeTimeMins: Number) {
      cdkBuilder.bakeTimeMins(bakeTimeMins)
    }

    override fun stepPercentage(stepPercentage: Number) {
      cdkBuilder.stepPercentage(stepPercentage)
    }

    public fun build(): software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary,
  ) : CdkObject(cdkObject), CfnTrafficRoutingTimeBasedCanary {
    override fun bakeTimeMins(): Number? = unwrap(this).getBakeTimeMins()

    override fun stepPercentage(): Number? = unwrap(this).getStepPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficRoutingTimeBasedCanary {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary):
        CfnTrafficRoutingTimeBasedCanary = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficRoutingTimeBasedCanary):
        software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary
  }
}
