package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface AdjustmentTier {
  /**
   * What number to adjust the capacity with.
   *
   * The number is interpeted as an added capacity, a new fixed capacity or an
   * added percentage depending on the AdjustmentType value of the
   * StepScalingPolicy.
   *
   * Can be positive or negative.
   */
  public fun adjustment(): Number

  /**
   * Lower bound where this scaling tier applies.
   *
   * The scaling tier applies if the difference between the metric
   * value and its alarm threshold is higher than this value.
   *
   * Default: -Infinity if this is the first tier, otherwise the upperBound of the previous tier
   */
  public fun lowerBound(): Number? = unwrap(this).getLowerBound()

  /**
   * Upper bound where this scaling tier applies.
   *
   * The scaling tier applies if the difference between the metric
   * value and its alarm threshold is lower than this value.
   *
   * Default: +Infinity
   */
  public fun upperBound(): Number? = unwrap(this).getUpperBound()

  /**
   * A builder for [AdjustmentTier]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adjustment What number to adjust the capacity with. 
     * The number is interpeted as an added capacity, a new fixed capacity or an
     * added percentage depending on the AdjustmentType value of the
     * StepScalingPolicy.
     *
     * Can be positive or negative.
     */
    public fun adjustment(adjustment: Number)

    /**
     * @param lowerBound Lower bound where this scaling tier applies.
     * The scaling tier applies if the difference between the metric
     * value and its alarm threshold is higher than this value.
     */
    public fun lowerBound(lowerBound: Number)

    /**
     * @param upperBound Upper bound where this scaling tier applies.
     * The scaling tier applies if the difference between the metric
     * value and its alarm threshold is lower than this value.
     */
    public fun upperBound(upperBound: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.Builder =
        software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.builder()

    /**
     * @param adjustment What number to adjust the capacity with. 
     * The number is interpeted as an added capacity, a new fixed capacity or an
     * added percentage depending on the AdjustmentType value of the
     * StepScalingPolicy.
     *
     * Can be positive or negative.
     */
    override fun adjustment(adjustment: Number) {
      cdkBuilder.adjustment(adjustment)
    }

    /**
     * @param lowerBound Lower bound where this scaling tier applies.
     * The scaling tier applies if the difference between the metric
     * value and its alarm threshold is higher than this value.
     */
    override fun lowerBound(lowerBound: Number) {
      cdkBuilder.lowerBound(lowerBound)
    }

    /**
     * @param upperBound Upper bound where this scaling tier applies.
     * The scaling tier applies if the difference between the metric
     * value and its alarm threshold is lower than this value.
     */
    override fun upperBound(upperBound: Number) {
      cdkBuilder.upperBound(upperBound)
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier,
  ) : CdkObject(cdkObject), AdjustmentTier {
    /**
     * What number to adjust the capacity with.
     *
     * The number is interpeted as an added capacity, a new fixed capacity or an
     * added percentage depending on the AdjustmentType value of the
     * StepScalingPolicy.
     *
     * Can be positive or negative.
     */
    override fun adjustment(): Number = unwrap(this).getAdjustment()

    /**
     * Lower bound where this scaling tier applies.
     *
     * The scaling tier applies if the difference between the metric
     * value and its alarm threshold is higher than this value.
     *
     * Default: -Infinity if this is the first tier, otherwise the upperBound of the previous tier
     */
    override fun lowerBound(): Number? = unwrap(this).getLowerBound()

    /**
     * Upper bound where this scaling tier applies.
     *
     * The scaling tier applies if the difference between the metric
     * value and its alarm threshold is lower than this value.
     *
     * Default: +Infinity
     */
    override fun upperBound(): Number? = unwrap(this).getUpperBound()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AdjustmentTier {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier):
        AdjustmentTier = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AdjustmentTier):
        software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier
  }
}
