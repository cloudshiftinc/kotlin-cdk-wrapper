package io.cloudshiftdev.awscdk.services.autoscaling

import kotlin.Number
import kotlin.Unit

public interface ScalingInterval {
  public fun change(): Number

  public fun lower(): Number? = unwrap(this).getLower()

  public fun upper(): Number? = unwrap(this).getUpper()

  public interface Builder {
    public fun change(change: Number) {
    }

    public fun lower(lower: Number) {
    }

    public fun upper(upper: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.ScalingInterval.Builder =
        software.amazon.awscdk.services.autoscaling.ScalingInterval.builder()

    public override fun change(change: Number) {
      cdkBuilder.change(change)
    }

    public override fun lower(lower: Number) {
      cdkBuilder.lower(lower)
    }

    public override fun upper(upper: Number) {
      cdkBuilder.upper(upper)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.ScalingInterval =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.ScalingInterval,
  ) : ScalingInterval {
    public override fun change(): Number = unwrap(this).getChange()

    public override fun lower(): Number? = unwrap(this).getLower()

    public override fun upper(): Number? = unwrap(this).getUpper()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ScalingInterval {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ScalingInterval):
        ScalingInterval = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScalingInterval):
        software.amazon.awscdk.services.autoscaling.ScalingInterval = (wrapped as Wrapper).cdkObject
  }
}
