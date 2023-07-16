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

  public fun gatewayRouteName(gatewayRouteName: String) {
    cdkBuilder.gatewayRouteName(gatewayRouteName)
  }

  public fun routeSpec(routeSpec: GatewayRouteSpec) {
    cdkBuilder.routeSpec(routeSpec)
  }

  public fun virtualGateway(virtualGateway: IVirtualGateway) {
    cdkBuilder.virtualGateway(virtualGateway)
  }

  public fun build(): GatewayRoute = cdkBuilder.build()
}
