@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.GatewayRoute
import software.amazon.awscdk.services.appmesh.GatewayRouteSpec
import software.amazon.awscdk.services.appmesh.IVirtualGateway
import software.constructs.Construct

/**
 * GatewayRoute represents a new or existing gateway route attached to a VirtualGateway and Mesh.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GatewayRouteSpec gatewayRouteSpec;
 * VirtualGateway virtualGateway;
 * GatewayRoute gatewayRoute = GatewayRoute.Builder.create(this, "MyGatewayRoute")
 * .routeSpec(gatewayRouteSpec)
 * .virtualGateway(virtualGateway)
 * // the properties below are optional
 * .gatewayRouteName("gatewayRouteName")
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/gateway-routes.html)
 */
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
