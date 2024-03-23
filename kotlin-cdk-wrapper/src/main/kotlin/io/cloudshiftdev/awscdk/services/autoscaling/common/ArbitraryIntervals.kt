@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling.common

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.common.*;
 * ArbitraryIntervals arbitraryIntervals = ArbitraryIntervals.builder()
 * .absolute(false)
 * .intervals(List.of(ScalingInterval.builder()
 * .change(123)
 * // the properties below are optional
 * .lower(123)
 * .upper(123)
 * .build()))
 * .build();
 * ```
 */
public interface ArbitraryIntervals {
  /**
   *
   */
  public fun absolute(): Boolean

  /**
   *
   */
  public fun intervals(): List<ScalingInterval>

  /**
   * A builder for [ArbitraryIntervals]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param absolute the value to be set. 
     */
    public fun absolute(absolute: Boolean)

    /**
     * @param intervals the value to be set. 
     */
    public fun intervals(intervals: List<ScalingInterval>)

    /**
     * @param intervals the value to be set. 
     */
    public fun intervals(vararg intervals: ScalingInterval)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals.Builder =
        software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals.builder()

    /**
     * @param absolute the value to be set. 
     */
    override fun absolute(absolute: Boolean) {
      cdkBuilder.absolute(absolute)
    }

    /**
     * @param intervals the value to be set. 
     */
    override fun intervals(intervals: List<ScalingInterval>) {
      cdkBuilder.intervals(intervals.map(ScalingInterval::unwrap))
    }

    /**
     * @param intervals the value to be set. 
     */
    override fun intervals(vararg intervals: ScalingInterval): Unit = intervals(intervals.toList())

    public fun build(): software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals,
  ) : CdkObject(cdkObject), ArbitraryIntervals {
    /**
     *
     */
    override fun absolute(): Boolean = unwrap(this).getAbsolute()

    /**
     *
     */
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
        ArbitraryIntervals = CdkObjectWrappers.wrap(cdkObject) as? ArbitraryIntervals ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ArbitraryIntervals):
        software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals
  }
}
