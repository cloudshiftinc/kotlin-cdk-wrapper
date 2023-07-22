@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.GatewayRouteProps
import software.amazon.awscdk.services.appmesh.GatewayRouteSpec
import software.amazon.awscdk.services.appmesh.IVirtualGateway

@CdkDslMarker
public class GatewayRoutePropsDsl {
  private val cdkBuilder: GatewayRouteProps.Builder = GatewayRouteProps.builder()

  /**
   * @param gatewayRouteName The name of the GatewayRoute.
   */
  public fun gatewayRouteName(gatewayRouteName: String) {
    cdkBuilder.gatewayRouteName(gatewayRouteName)
  }

  /**
   * @param routeSpec What protocol the route uses. 
   */
  public fun routeSpec(routeSpec: GatewayRouteSpec) {
    cdkBuilder.routeSpec(routeSpec)
  }

  /**
   * @param virtualGateway The VirtualGateway this GatewayRoute is associated with. 
   */
  public fun virtualGateway(virtualGateway: IVirtualGateway) {
    cdkBuilder.virtualGateway(virtualGateway)
  }

  public fun build(): GatewayRouteProps = cdkBuilder.build()
}
