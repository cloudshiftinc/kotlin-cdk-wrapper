@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Basic configuration properties for a GatewayRoute.
 *
 * Example:
 *
 * ```
 * VirtualGateway gateway;
 * VirtualService virtualService;
 * gateway.addGatewayRoute("gateway-route-grpc", GatewayRouteBaseProps.builder()
 * .routeSpec(GatewayRouteSpec.grpc(GrpcGatewayRouteSpecOptions.builder()
 * .routeTarget(virtualService)
 * .match(GrpcGatewayRouteMatch.builder()
 * .hostname(GatewayRouteHostnameMatch.exactly("example.com"))
 * // This disables the default rewrite to virtual service name and retain original request.
 * .rewriteRequestHostname(false)
 * .build())
 * .build()))
 * .build());
 * ```
 */
public interface GatewayRouteBaseProps {
  /**
   * The name of the GatewayRoute.
   *
   * Default: - an automatically generated name
   */
  public fun gatewayRouteName(): String? = unwrap(this).getGatewayRouteName()

  /**
   * What protocol the route uses.
   */
  public fun routeSpec(): GatewayRouteSpec

  /**
   * A builder for [GatewayRouteBaseProps]
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps.Builder =
        software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps.builder()

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
      cdkBuilder.routeSpec(routeSpec.let(GatewayRouteSpec.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps,
  ) : CdkObject(cdkObject), GatewayRouteBaseProps {
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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps):
        GatewayRouteBaseProps = CdkObjectWrappers.wrap(cdkObject) as? GatewayRouteBaseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayRouteBaseProps):
        software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps
  }
}
