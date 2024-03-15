@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling.common

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface ArbitraryIntervals {
  public fun absolute(): Boolean

  public fun intervals(): List<ScalingInterval>

  @CdkDslMarker
  public interface Builder {
    public fun absolute(absolute: Boolean)

    public fun intervals(intervals: List<ScalingInterval>)

    public fun intervals(vararg intervals: ScalingInterval)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals.Builder =
        software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals.builder()

    override fun absolute(absolute: Boolean) {
      cdkBuilder.absolute(absolute)
    }

    override fun intervals(intervals: List<ScalingInterval>) {
      cdkBuilder.intervals(intervals.map(ScalingInterval::unwrap))
    }

    override fun intervals(vararg intervals: ScalingInterval): Unit = intervals(intervals.toList())

    public fun build(): software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals,
  ) : CdkObject(cdkObject), ArbitraryIntervals {
    override fun absolute(): Boolean = unwrap(this).getAbsolute()

    override fun intervals(): List<ScalingInterval> =
        unwrap(this).getIntervals().map(ScalingInterval::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ArbitraryIntervals {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals):
        ArbitraryIntervals = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ArbitraryIntervals):
        software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals
  }
}
