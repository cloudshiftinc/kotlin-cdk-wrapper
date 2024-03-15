@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface GatewayRouteBaseProps {
  public fun gatewayRouteName(): String? = unwrap(this).getGatewayRouteName()

  public fun routeSpec(): GatewayRouteSpec

  @CdkDslMarker
  public interface Builder {
    public fun gatewayRouteName(gatewayRouteName: String)

    public fun routeSpec(routeSpec: GatewayRouteSpec)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps.Builder =
        software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps.builder()

    override fun gatewayRouteName(gatewayRouteName: String) {
      cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    override fun routeSpec(routeSpec: GatewayRouteSpec) {
      cdkBuilder.routeSpec(routeSpec.let(GatewayRouteSpec::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps,
  ) : CdkObject(cdkObject), GatewayRouteBaseProps {
    override fun gatewayRouteName(): String? = unwrap(this).getGatewayRouteName()

    override fun routeSpec(): GatewayRouteSpec =
        unwrap(this).getRouteSpec().let(GatewayRouteSpec::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps):
        GatewayRouteBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayRouteBaseProps):
        software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps
  }
}
