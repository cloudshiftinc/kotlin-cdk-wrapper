@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface HealthCheckBindOptions {
  public fun defaultPort(): Number? = unwrap(this).getDefaultPort()

  @CdkDslMarker
  public interface Builder {
    public fun defaultPort(defaultPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HealthCheckBindOptions.Builder =
        software.amazon.awscdk.services.appmesh.HealthCheckBindOptions.builder()

    override fun defaultPort(defaultPort: Number) {
      cdkBuilder.defaultPort(defaultPort)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HealthCheckBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HealthCheckBindOptions,
  ) : CdkObject(cdkObject), HealthCheckBindOptions {
    override fun defaultPort(): Number? = unwrap(this).getDefaultPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HealthCheckBindOptions):
        HealthCheckBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheckBindOptions):
        software.amazon.awscdk.services.appmesh.HealthCheckBindOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HealthCheckBindOptions
  }
}
