package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.String
import kotlin.Unit

public interface GatewayRouteBaseProps {
  public fun gatewayRouteName(): String? = unwrap(this).getGatewayRouteName()

  public fun routeSpec(): GatewayRouteSpec

  public interface Builder {
    public fun gatewayRouteName(gatewayRouteName: String) {
    }

    public fun routeSpec(routeSpec: GatewayRouteSpec) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps.Builder =
        software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps.builder()

    public override fun gatewayRouteName(gatewayRouteName: String) {
      cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    public override fun routeSpec(routeSpec: GatewayRouteSpec) {
      cdkBuilder.routeSpec(routeSpec.let(GatewayRouteSpec::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps,
  ) : GatewayRouteBaseProps {
    public override fun gatewayRouteName(): String? = unwrap(this).getGatewayRouteName()

    public override fun routeSpec(): GatewayRouteSpec =
        unwrap(this).getRouteSpec().let(GatewayRouteSpec::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps):
        GatewayRouteBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayRouteBaseProps):
        software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps = (wrapped as
        Wrapper).cdkObject
  }
}
