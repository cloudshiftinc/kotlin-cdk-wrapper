@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties to define a new GatewayRoute.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * GatewayRouteSpec gatewayRouteSpec;
 * VirtualGateway virtualGateway;
 * GatewayRouteProps gatewayRouteProps = GatewayRouteProps.builder()
 * .routeSpec(gatewayRouteSpec)
 * .virtualGateway(virtualGateway)
 * // the properties below are optional
 * .gatewayRouteName("gatewayRouteName")
 * .build();
 * ```
 */
public interface GatewayRouteProps : GatewayRouteBaseProps {
  /**
   * The VirtualGateway this GatewayRoute is associated with.
   */
  public fun virtualGateway(): IVirtualGateway

  /**
   * A builder for [GatewayRouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param gatewayRouteName The name of the GatewayRoute.
     */
    public fun gatewayRouteName(gatewayRouteName: String)

    /**
     * @param routeSpec What protocol the route uses. 
     */
    public fun routeSpec(routeSpec: GatewayRouteSpec)

    /**
     * @param virtualGateway The VirtualGateway this GatewayRoute is associated with. 
     */
    public fun virtualGateway(virtualGateway: IVirtualGateway)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GatewayRouteProps.Builder =
        software.amazon.awscdk.services.appmesh.GatewayRouteProps.builder()

    /**
     * @param gatewayRouteName The name of the GatewayRoute.
     */
    override fun gatewayRouteName(gatewayRouteName: String) {
      cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    /**
     * @param routeSpec What protocol the route uses. 
     */
    override fun routeSpec(routeSpec: GatewayRouteSpec) {
      cdkBuilder.routeSpec(routeSpec.let(GatewayRouteSpec::unwrap))
    }

    /**
     * @param virtualGateway The VirtualGateway this GatewayRoute is associated with. 
     */
    override fun virtualGateway(virtualGateway: IVirtualGateway) {
      cdkBuilder.virtualGateway(virtualGateway.let(IVirtualGateway::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GatewayRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteProps,
  ) : CdkObject(cdkObject), GatewayRouteProps {
    /**
     * The name of the GatewayRoute.
     *
     * Default: - an automatically generated name
     */
    override fun gatewayRouteName(): String? = unwrap(this).getGatewayRouteName()

    /**
     * What protocol the route uses.
     */
    override fun routeSpec(): GatewayRouteSpec =
        unwrap(this).getRouteSpec().let(GatewayRouteSpec::wrap)

    /**
     * The VirtualGateway this GatewayRoute is associated with.
     */
    override fun virtualGateway(): IVirtualGateway =
        unwrap(this).getVirtualGateway().let(IVirtualGateway::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteProps):
        GatewayRouteProps = CdkObjectWrappers.wrap(cdkObject) as? GatewayRouteProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayRouteProps):
        software.amazon.awscdk.services.appmesh.GatewayRouteProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.GatewayRouteProps
  }
}
