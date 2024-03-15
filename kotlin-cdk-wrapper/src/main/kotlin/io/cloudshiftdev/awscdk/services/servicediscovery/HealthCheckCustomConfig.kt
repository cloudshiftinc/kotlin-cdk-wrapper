@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface HealthCheckCustomConfig {
  public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig,
  ) : CdkObject(cdkObject), HealthCheckCustomConfig {
    override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckCustomConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig):
        HealthCheckCustomConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheckCustomConfig):
        software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig
  }
}
