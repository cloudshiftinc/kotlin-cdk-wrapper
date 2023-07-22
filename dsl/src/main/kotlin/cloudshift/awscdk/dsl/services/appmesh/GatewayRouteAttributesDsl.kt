@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.GatewayRouteAttributes
import software.amazon.awscdk.services.appmesh.IVirtualGateway

@CdkDslMarker
public class GatewayRouteAttributesDsl {
  private val cdkBuilder: GatewayRouteAttributes.Builder = GatewayRouteAttributes.builder()

  /**
   * @param gatewayRouteName The name of the GatewayRoute. 
   */
  public fun gatewayRouteName(gatewayRouteName: String) {
    cdkBuilder.gatewayRouteName(gatewayRouteName)
  }

  /**
   * @param virtualGateway The VirtualGateway this GatewayRoute is associated with. 
   */
  public fun virtualGateway(virtualGateway: IVirtualGateway) {
    cdkBuilder.virtualGateway(virtualGateway)
  }

  public fun build(): GatewayRouteAttributes = cdkBuilder.build()
}
