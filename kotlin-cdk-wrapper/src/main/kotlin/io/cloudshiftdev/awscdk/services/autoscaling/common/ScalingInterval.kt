@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling.common

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface ScalingInterval {
  public fun change(): Number

  public fun lower(): Number? = unwrap(this).getLower()

  public fun upper(): Number? = unwrap(this).getUpper()

  @CdkDslMarker
  public interface Builder {
    public fun change(change: Number)

    public fun lower(lower: Number)

    public fun upper(upper: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.common.ScalingInterval.Builder =
        software.amazon.awscdk.services.autoscaling.common.ScalingInterval.builder()

    override fun change(change: Number) {
      cdkBuilder.change(change)
    }

    override fun lower(lower: Number) {
      cdkBuilder.lower(lower)
    }

    override fun upper(upper: Number) {
      cdkBuilder.upper(upper)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.common.ScalingInterval =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.common.ScalingInterval,
  ) : CdkObject(cdkObject), ScalingInterval {
    override fun change(): Number = unwrap(this).getChange()

    override fun lower(): Number? = unwrap(this).getLower()

    override fun upper(): Number? = unwrap(this).getUpper()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScalingInterval {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.common.ScalingInterval):
        ScalingInterval = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScalingInterval):
        software.amazon.awscdk.services.autoscaling.common.ScalingInterval = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.common.ScalingInterval
  }
}
