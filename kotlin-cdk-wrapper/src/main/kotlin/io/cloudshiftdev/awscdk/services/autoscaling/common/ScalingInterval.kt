@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling.common

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * A range of metric values in which to apply a certain scaling operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.common.*;
 * ScalingInterval scalingInterval = ScalingInterval.builder()
 * .change(123)
 * // the properties below are optional
 * .lower(123)
 * .upper(123)
 * .build();
 * ```
 */
public interface ScalingInterval {
  /**
   * The capacity adjustment to apply in this interval.
   *
   * The number is interpreted differently based on AdjustmentType:
   *
   * * ChangeInCapacity: add the adjustment to the current capacity.
   * The number can be positive or negative.
   * * PercentChangeInCapacity: add or remove the given percentage of the current
   * capacity to itself. The number can be in the range [-100..100].
   * * ExactCapacity: set the capacity to this number. The number must
   * be positive.
   */
  public fun change(): Number

  /**
   * The lower bound of the interval.
   *
   * The scaling adjustment will be applied if the metric is higher than this value.
   *
   * Default: Threshold automatically derived from neighbouring intervals
   */
  public fun lower(): Number? = unwrap(this).getLower()

  /**
   * The upper bound of the interval.
   *
   * The scaling adjustment will be applied if the metric is lower than this value.
   *
   * Default: Threshold automatically derived from neighbouring intervals
   */
  public fun upper(): Number? = unwrap(this).getUpper()

  /**
   * A builder for [ScalingInterval]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param change The capacity adjustment to apply in this interval. 
     * The number is interpreted differently based on AdjustmentType:
     *
     * * ChangeInCapacity: add the adjustment to the current capacity.
     * The number can be positive or negative.
     * * PercentChangeInCapacity: add or remove the given percentage of the current
     * capacity to itself. The number can be in the range [-100..100].
     * * ExactCapacity: set the capacity to this number. The number must
     * be positive.
     */
    public fun change(change: Number)

    /**
     * @param lower The lower bound of the interval.
     * The scaling adjustment will be applied if the metric is higher than this value.
     */
    public fun lower(lower: Number)

    /**
     * @param upper The upper bound of the interval.
     * The scaling adjustment will be applied if the metric is lower than this value.
     */
    public fun upper(upper: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.common.ScalingInterval.Builder =
        software.amazon.awscdk.services.autoscaling.common.ScalingInterval.builder()

    /**
     * @param change The capacity adjustment to apply in this interval. 
     * The number is interpreted differently based on AdjustmentType:
     *
     * * ChangeInCapacity: add the adjustment to the current capacity.
     * The number can be positive or negative.
     * * PercentChangeInCapacity: add or remove the given percentage of the current
     * capacity to itself. The number can be in the range [-100..100].
     * * ExactCapacity: set the capacity to this number. The number must
     * be positive.
     */
    override fun change(change: Number) {
      cdkBuilder.change(change)
    }

    /**
     * @param lower The lower bound of the interval.
     * The scaling adjustment will be applied if the metric is higher than this value.
     */
    override fun lower(lower: Number) {
      cdkBuilder.lower(lower)
    }

    /**
     * @param upper The upper bound of the interval.
     * The scaling adjustment will be applied if the metric is lower than this value.
     */
    override fun upper(upper: Number) {
      cdkBuilder.upper(upper)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.common.ScalingInterval =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.common.ScalingInterval,
  ) : CdkObject(cdkObject), ScalingInterval {
    /**
     * The capacity adjustment to apply in this interval.
     *
     * The number is interpreted differently based on AdjustmentType:
     *
     * * ChangeInCapacity: add the adjustment to the current capacity.
     * The number can be positive or negative.
     * * PercentChangeInCapacity: add or remove the given percentage of the current
     * capacity to itself. The number can be in the range [-100..100].
     * * ExactCapacity: set the capacity to this number. The number must
     * be positive.
     */
    override fun change(): Number = unwrap(this).getChange()

    /**
     * The lower bound of the interval.
     *
     * The scaling adjustment will be applied if the metric is higher than this value.
     *
     * Default: Threshold automatically derived from neighbouring intervals
     */
    override fun lower(): Number? = unwrap(this).getLower()

    /**
     * The upper bound of the interval.
     *
     * The scaling adjustment will be applied if the metric is lower than this value.
     *
     * Default: Threshold automatically derived from neighbouring intervals
     */
    override fun upper(): Number? = unwrap(this).getUpper()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScalingInterval {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.common.ScalingInterval):
        ScalingInterval = CdkObjectWrappers.wrap(cdkObject) as? ScalingInterval ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScalingInterval):
        software.amazon.awscdk.services.autoscaling.common.ScalingInterval = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.common.ScalingInterval
  }
}
