@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface HealthCheckConfig {
  public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

  public fun resourcePath(): String? = unwrap(this).getResourcePath()

  public fun type(): HealthCheckType? = unwrap(this).getType()?.let(HealthCheckType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun failureThreshold(failureThreshold: Number)

    public fun resourcePath(resourcePath: String)

    public fun type(type: HealthCheckType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.HealthCheckConfig.Builder =
        software.amazon.awscdk.services.servicediscovery.HealthCheckConfig.builder()

    override fun failureThreshold(failureThreshold: Number) {
      cdkBuilder.failureThreshold(failureThreshold)
    }

    override fun resourcePath(resourcePath: String) {
      cdkBuilder.resourcePath(resourcePath)
    }

    override fun type(type: HealthCheckType) {
      cdkBuilder.type(type.let(HealthCheckType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.HealthCheckConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.HealthCheckConfig,
  ) : CdkObject(cdkObject), HealthCheckConfig {
    override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

    override fun resourcePath(): String? = unwrap(this).getResourcePath()

    override fun type(): HealthCheckType? = unwrap(this).getType()?.let(HealthCheckType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.HealthCheckConfig):
        HealthCheckConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheckConfig):
        software.amazon.awscdk.services.servicediscovery.HealthCheckConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
  }
}
