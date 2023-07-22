@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteGatewayRouteVirtualServicePropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GatewayRouteVirtualServiceProperty.Builder =
      CfnGatewayRoute.GatewayRouteVirtualServiceProperty.builder()

  /**
   * @param virtualServiceName The name of the virtual service that traffic is routed to. 
   */
  public fun virtualServiceName(virtualServiceName: String) {
    cdkBuilder.virtualServiceName(virtualServiceName)
  }

  public fun build(): CfnGatewayRoute.GatewayRouteVirtualServiceProperty = cdkBuilder.build()
}
