package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface GatewayRouteAttributes {
  /**
   * The name of the GatewayRoute.
   */
  public fun gatewayRouteName(): String

  /**
   * The VirtualGateway this GatewayRoute is associated with.
   */
  public fun virtualGateway(): IVirtualGateway

  /**
   * A builder for [GatewayRouteAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param gatewayRouteName The name of the GatewayRoute. 
     */
    public fun gatewayRouteName(gatewayRouteName: String)

    /**
     * @param virtualGateway The VirtualGateway this GatewayRoute is associated with. 
     */
    public fun virtualGateway(virtualGateway: IVirtualGateway)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GatewayRouteAttributes.Builder =
        software.amazon.awscdk.services.appmesh.GatewayRouteAttributes.builder()

    /**
     * @param gatewayRouteName The name of the GatewayRoute. 
     */
    override fun gatewayRouteName(gatewayRouteName: String) {
      cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    /**
     * @param virtualGateway The VirtualGateway this GatewayRoute is associated with. 
     */
    override fun virtualGateway(virtualGateway: IVirtualGateway) {
      cdkBuilder.virtualGateway(virtualGateway.let(IVirtualGateway::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GatewayRouteAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteAttributes,
  ) : GatewayRouteAttributes {
    /**
     * The name of the GatewayRoute.
     */
    override fun gatewayRouteName(): String = unwrap(this).getGatewayRouteName()

    /**
     * The VirtualGateway this GatewayRoute is associated with.
     */
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
