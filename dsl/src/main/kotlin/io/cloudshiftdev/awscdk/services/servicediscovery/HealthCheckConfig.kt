package io.cloudshiftdev.awscdk.services.servicediscovery

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface HealthCheckConfig {
  public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

  public fun resourcePath(): String? = unwrap(this).getResourcePath()

  public fun type(): HealthCheckType? = unwrap(this).getType()?.let(HealthCheckType::wrap)

  public interface Builder {
    public fun failureThreshold(failureThreshold: Number) {
    }

    public fun resourcePath(resourcePath: String) {
    }

    public fun type(type: HealthCheckType) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.HealthCheckConfig.Builder =
        software.amazon.awscdk.services.servicediscovery.HealthCheckConfig.builder()

    public override fun failureThreshold(failureThreshold: Number) {
      cdkBuilder.failureThreshold(failureThreshold)
    }

    public override fun resourcePath(resourcePath: String) {
      cdkBuilder.resourcePath(resourcePath)
    }

    public override fun type(type: HealthCheckType) {
      cdkBuilder.type(type.let(HealthCheckType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.HealthCheckConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicediscovery.HealthCheckConfig,
  ) : HealthCheckConfig {
    public override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

    public override fun resourcePath(): String? = unwrap(this).getResourcePath()

    public override fun type(): HealthCheckType? =
        unwrap(this).getType()?.let(HealthCheckType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.HealthCheckConfig):
        HealthCheckConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheckConfig):
        software.amazon.awscdk.services.servicediscovery.HealthCheckConfig = (wrapped as
        Wrapper).cdkObject
  }
}
