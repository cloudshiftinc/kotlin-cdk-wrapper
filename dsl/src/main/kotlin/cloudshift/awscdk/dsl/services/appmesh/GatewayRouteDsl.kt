@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.GatewayRoute
import software.amazon.awscdk.services.appmesh.GatewayRouteSpec
import software.amazon.awscdk.services.appmesh.IVirtualGateway
import software.constructs.Construct

@CdkDslMarker
public class GatewayRouteDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: GatewayRoute.Builder = GatewayRoute.Builder.create(scope, id)

  /**
   * The name of the GatewayRoute.
   *
   * Default: - an automatically generated name
   *
   * @param gatewayRouteName The name of the GatewayRoute. 
   */
  public fun gatewayRouteName(gatewayRouteName: String) {
    cdkBuilder.gatewayRouteName(gatewayRouteName)
  }

  /**
   * What protocol the route uses.
   *
   * @param routeSpec What protocol the route uses. 
   */
  public fun routeSpec(routeSpec: GatewayRouteSpec) {
    cdkBuilder.routeSpec(routeSpec)
  }

  /**
   * The VirtualGateway this GatewayRoute is associated with.
   *
   * @param virtualGateway The VirtualGateway this GatewayRoute is associated with. 
   */
  public fun virtualGateway(virtualGateway: IVirtualGateway) {
    cdkBuilder.virtualGateway(virtualGateway)
  }

  public fun build(): GatewayRoute = cdkBuilder.build()
}
