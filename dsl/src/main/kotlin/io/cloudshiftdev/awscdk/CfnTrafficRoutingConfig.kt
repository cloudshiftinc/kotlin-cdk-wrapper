package io.cloudshiftdev.awscdk

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnTrafficRoutingConfig {
  public fun timeBasedCanary(): CfnTrafficRoutingTimeBasedCanary? =
      unwrap(this).getTimeBasedCanary()?.let(CfnTrafficRoutingTimeBasedCanary::wrap)

  public fun timeBasedLinear(): CfnTrafficRoutingTimeBasedLinear? =
      unwrap(this).getTimeBasedLinear()?.let(CfnTrafficRoutingTimeBasedLinear::wrap)

  public fun type(): CfnTrafficRoutingType

  public interface Builder {
    public fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2f18a4c00dee6b1717fe36ccb423739ed976d7942ee012bb49626ecfa8f6d32")
    public
        fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary.Builder.() -> Unit) {
    }

    public fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4673ccdf5a8b5ba95ef4c0e7c337fca978ab5873ea1eddbdc5b40984ac4bbb70")
    public
        fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear.Builder.() -> Unit) {
    }

    public fun type(type: CfnTrafficRoutingType) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTrafficRoutingConfig.Builder =
        software.amazon.awscdk.CfnTrafficRoutingConfig.builder()

    public override fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary) {
      cdkBuilder.timeBasedCanary(timeBasedCanary.let(CfnTrafficRoutingTimeBasedCanary::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2f18a4c00dee6b1717fe36ccb423739ed976d7942ee012bb49626ecfa8f6d32")
    public override
        fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary.Builder.() -> Unit):
        Unit = timeBasedCanary(CfnTrafficRoutingTimeBasedCanary(timeBasedCanary))

    public override fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear) {
      cdkBuilder.timeBasedLinear(timeBasedLinear.let(CfnTrafficRoutingTimeBasedLinear::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4673ccdf5a8b5ba95ef4c0e7c337fca978ab5873ea1eddbdc5b40984ac4bbb70")
    public override
        fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear.Builder.() -> Unit):
        Unit = timeBasedLinear(CfnTrafficRoutingTimeBasedLinear(timeBasedLinear))

    public override fun type(type: CfnTrafficRoutingType) {
      cdkBuilder.type(type.let(CfnTrafficRoutingType::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnTrafficRoutingConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnTrafficRoutingConfig,
  ) : CfnTrafficRoutingConfig {
    public override fun timeBasedCanary(): CfnTrafficRoutingTimeBasedCanary? =
        unwrap(this).getTimeBasedCanary()?.let(CfnTrafficRoutingTimeBasedCanary::wrap)

    public override fun timeBasedLinear(): CfnTrafficRoutingTimeBasedLinear? =
        unwrap(this).getTimeBasedLinear()?.let(CfnTrafficRoutingTimeBasedLinear::wrap)

    public override fun type(): CfnTrafficRoutingType =
        unwrap(this).getType().let(CfnTrafficRoutingType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficRoutingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTrafficRoutingConfig):
        CfnTrafficRoutingConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficRoutingConfig):
        software.amazon.awscdk.CfnTrafficRoutingConfig = (wrapped as Wrapper).cdkObject
  }
}
