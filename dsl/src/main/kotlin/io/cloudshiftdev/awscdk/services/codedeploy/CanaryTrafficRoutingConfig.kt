package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.Number
import kotlin.Unit

public interface CanaryTrafficRoutingConfig {
  public fun canaryInterval(): Number

  public fun canaryPercentage(): Number

  public interface Builder {
    public fun canaryInterval(canaryInterval: Number) {
    }

    public fun canaryPercentage(canaryPercentage: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig.Builder =
        software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig.builder()

    public override fun canaryInterval(canaryInterval: Number) {
      cdkBuilder.canaryInterval(canaryInterval)
    }

    public override fun canaryPercentage(canaryPercentage: Number) {
      cdkBuilder.canaryPercentage(canaryPercentage)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig,
  ) : CanaryTrafficRoutingConfig {
    public override fun canaryInterval(): Number = unwrap(this).getCanaryInterval()

    public override fun canaryPercentage(): Number = unwrap(this).getCanaryPercentage()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CanaryTrafficRoutingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig):
        CanaryTrafficRoutingConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CanaryTrafficRoutingConfig):
        software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig = (wrapped as
        Wrapper).cdkObject
  }
}
