package io.cloudshiftdev.awscdk.services.servicediscovery

import kotlin.Number
import kotlin.Unit

public interface HealthCheckCustomConfig {
  public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

  public interface Builder {
    public fun failureThreshold(failureThreshold: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig.Builder =
        software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig.builder()

    override fun failureThreshold(failureThreshold: Number) {
      cdkBuilder.failureThreshold(failureThreshold)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig,
  ) : HealthCheckCustomConfig {
    override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckCustomConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig):
        HealthCheckCustomConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheckCustomConfig):
        software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig = (wrapped as
        Wrapper).cdkObject
  }
}
