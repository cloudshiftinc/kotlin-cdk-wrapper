package io.cloudshiftdev.awscdk.services.lambda

import kotlin.Number
import kotlin.Unit

public interface AutoScalingOptions {
  public fun maxCapacity(): Number

  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  public interface Builder {
    public fun maxCapacity(maxCapacity: Number) {
    }

    public fun minCapacity(minCapacity: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AutoScalingOptions.Builder =
        software.amazon.awscdk.services.lambda.AutoScalingOptions.builder()

    public override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    public override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): software.amazon.awscdk.services.lambda.AutoScalingOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.AutoScalingOptions,
  ) : AutoScalingOptions {
    public override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    public override fun minCapacity(): Number? = unwrap(this).getMinCapacity()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AutoScalingOptions):
        AutoScalingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoScalingOptions):
        software.amazon.awscdk.services.lambda.AutoScalingOptions = (wrapped as Wrapper).cdkObject
  }
}
