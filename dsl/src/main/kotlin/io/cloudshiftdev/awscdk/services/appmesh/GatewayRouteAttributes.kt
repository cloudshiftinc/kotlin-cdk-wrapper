package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.String
import kotlin.Unit

public interface GatewayRouteAttributes {
  public fun gatewayRouteName(): String

  public fun virtualGateway(): IVirtualGateway

  public interface Builder {
    public fun gatewayRouteName(gatewayRouteName: String)

    public fun virtualGateway(virtualGateway: IVirtualGateway)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GatewayRouteAttributes.Builder =
        software.amazon.awscdk.services.appmesh.GatewayRouteAttributes.builder()

    override fun gatewayRouteName(gatewayRouteName: String) {
      cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    override fun virtualGateway(virtualGateway: IVirtualGateway) {
      cdkBuilder.virtualGateway(virtualGateway.let(IVirtualGateway::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GatewayRouteAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteAttributes,
  ) : GatewayRouteAttributes {
    override fun gatewayRouteName(): String = unwrap(this).getGatewayRouteName()

    override fun virtualGateway(): IVirtualGateway =
        unwrap(this).getVirtualGateway().let(IVirtualGateway::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteAttributes):
        GatewayRouteAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayRouteAttributes):
        software.amazon.awscdk.services.appmesh.GatewayRouteAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
