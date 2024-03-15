@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface CommonGatewayRouteSpecOptions {
  public fun priority(): Number? = unwrap(this).getPriority()

  @CdkDslMarker
  public interface Builder {
    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions.builder()

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions,
  ) : CdkObject(cdkObject), CommonGatewayRouteSpecOptions {
    override fun priority(): Number? = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonGatewayRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions):
        CommonGatewayRouteSpecOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonGatewayRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions
  }
}
