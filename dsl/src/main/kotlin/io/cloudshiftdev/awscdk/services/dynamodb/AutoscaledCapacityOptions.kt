package io.cloudshiftdev.awscdk.services.dynamodb

import kotlin.Number
import kotlin.Unit

public interface AutoscaledCapacityOptions {
  public fun maxCapacity(): Number

  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  public fun seedCapacity(): Number? = unwrap(this).getSeedCapacity()

  public fun targetUtilizationPercent(): Number? = unwrap(this).getTargetUtilizationPercent()

  public interface Builder {
    public fun maxCapacity(maxCapacity: Number) {
    }

    public fun minCapacity(minCapacity: Number) {
    }

    public fun seedCapacity(seedCapacity: Number) {
    }

    public fun targetUtilizationPercent(targetUtilizationPercent: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions.Builder =
        software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions.builder()

    public override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    public override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    public override fun seedCapacity(seedCapacity: Number) {
      cdkBuilder.seedCapacity(seedCapacity)
    }

    public override fun targetUtilizationPercent(targetUtilizationPercent: Number) {
      cdkBuilder.targetUtilizationPercent(targetUtilizationPercent)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions,
  ) : AutoscaledCapacityOptions {
    public override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    public override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    public override fun seedCapacity(): Number? = unwrap(this).getSeedCapacity()

    public override fun targetUtilizationPercent(): Number? =
        unwrap(this).getTargetUtilizationPercent()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AutoscaledCapacityOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions):
        AutoscaledCapacityOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoscaledCapacityOptions):
        software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions = (wrapped as
        Wrapper).cdkObject
  }
}
