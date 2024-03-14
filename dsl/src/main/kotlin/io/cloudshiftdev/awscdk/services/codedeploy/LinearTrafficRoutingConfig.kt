package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.Number
import kotlin.Unit

public interface LinearTrafficRoutingConfig {
  public fun linearInterval(): Number

  public fun linearPercentage(): Number

  public interface Builder {
    public fun linearInterval(linearInterval: Number)

    public fun linearPercentage(linearPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig.Builder =
        software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig.builder()

    override fun linearInterval(linearInterval: Number) {
      cdkBuilder.linearInterval(linearInterval)
    }

    override fun linearPercentage(linearPercentage: Number) {
      cdkBuilder.linearPercentage(linearPercentage)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig,
  ) : LinearTrafficRoutingConfig {
    override fun linearInterval(): Number = unwrap(this).getLinearInterval()

    override fun linearPercentage(): Number = unwrap(this).getLinearPercentage()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LinearTrafficRoutingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig):
        LinearTrafficRoutingConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LinearTrafficRoutingConfig):
        software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig = (wrapped as
        Wrapper).cdkObject
  }
}
