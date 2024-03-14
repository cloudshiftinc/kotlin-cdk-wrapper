package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface TrafficRoutingConfig {
  public fun timeBasedCanary(): CanaryTrafficRoutingConfig? =
      unwrap(this).getTimeBasedCanary()?.let(CanaryTrafficRoutingConfig::wrap)

  public fun timeBasedLinear(): LinearTrafficRoutingConfig? =
      unwrap(this).getTimeBasedLinear()?.let(LinearTrafficRoutingConfig::wrap)

  public fun type(): String

  public interface Builder {
    public fun timeBasedCanary(timeBasedCanary: CanaryTrafficRoutingConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f076af8f5e555c9cf21b1c3c6778faf9db6ca3c9f4adaa14681641c21b3014e6")
    public fun timeBasedCanary(timeBasedCanary: CanaryTrafficRoutingConfig.Builder.() -> Unit) {
    }

    public fun timeBasedLinear(timeBasedLinear: LinearTrafficRoutingConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("edc4691914a3070d0dba4be8b71d60519eadc7f3016a9134a914bd4ee0702eca")
    public fun timeBasedLinear(timeBasedLinear: LinearTrafficRoutingConfig.Builder.() -> Unit) {
    }

    public fun type(type: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig.Builder
        = software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig.builder()

    public override fun timeBasedCanary(timeBasedCanary: CanaryTrafficRoutingConfig) {
      cdkBuilder.timeBasedCanary(timeBasedCanary.let(CanaryTrafficRoutingConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f076af8f5e555c9cf21b1c3c6778faf9db6ca3c9f4adaa14681641c21b3014e6")
    public override
        fun timeBasedCanary(timeBasedCanary: CanaryTrafficRoutingConfig.Builder.() -> Unit): Unit =
        timeBasedCanary(CanaryTrafficRoutingConfig(timeBasedCanary))

    public override fun timeBasedLinear(timeBasedLinear: LinearTrafficRoutingConfig) {
      cdkBuilder.timeBasedLinear(timeBasedLinear.let(LinearTrafficRoutingConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("edc4691914a3070d0dba4be8b71d60519eadc7f3016a9134a914bd4ee0702eca")
    public override
        fun timeBasedLinear(timeBasedLinear: LinearTrafficRoutingConfig.Builder.() -> Unit): Unit =
        timeBasedLinear(LinearTrafficRoutingConfig(timeBasedLinear))

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig,
  ) : TrafficRoutingConfig {
    public override fun timeBasedCanary(): CanaryTrafficRoutingConfig? =
        unwrap(this).getTimeBasedCanary()?.let(CanaryTrafficRoutingConfig::wrap)

    public override fun timeBasedLinear(): LinearTrafficRoutingConfig? =
        unwrap(this).getTimeBasedLinear()?.let(LinearTrafficRoutingConfig::wrap)

    public override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TrafficRoutingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig):
        TrafficRoutingConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TrafficRoutingConfig):
        software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig = (wrapped as
        Wrapper).cdkObject
  }
}
