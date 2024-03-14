package io.cloudshiftdev.awscdk.services.applicationautoscaling

import kotlin.Number
import kotlin.Unit

public interface AdjustmentTier {
  public fun adjustment(): Number

  public fun lowerBound(): Number? = unwrap(this).getLowerBound()

  public fun upperBound(): Number? = unwrap(this).getUpperBound()

  public interface Builder {
    public fun adjustment(adjustment: Number) {
    }

    public fun lowerBound(lowerBound: Number) {
    }

    public fun upperBound(upperBound: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.Builder =
        software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.builder()

    public override fun adjustment(adjustment: Number) {
      cdkBuilder.adjustment(adjustment)
    }

    public override fun lowerBound(lowerBound: Number) {
      cdkBuilder.lowerBound(lowerBound)
    }

    public override fun upperBound(upperBound: Number) {
      cdkBuilder.upperBound(upperBound)
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier,
  ) : AdjustmentTier {
    public override fun adjustment(): Number = unwrap(this).getAdjustment()

    public override fun lowerBound(): Number? = unwrap(this).getLowerBound()

    public override fun upperBound(): Number? = unwrap(this).getUpperBound()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AdjustmentTier {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier):
        AdjustmentTier = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AdjustmentTier):
        software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier = (wrapped as
        Wrapper).cdkObject
  }
}
