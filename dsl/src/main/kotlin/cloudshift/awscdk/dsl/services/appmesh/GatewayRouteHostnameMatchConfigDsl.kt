@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig

@CdkDslMarker
public class GatewayRouteHostnameMatchConfigDsl {
  private val cdkBuilder: GatewayRouteHostnameMatchConfig.Builder =
      GatewayRouteHostnameMatchConfig.builder()

  /**
   * @param hostnameMatch GatewayRoute CFN configuration for host name match. 
   */
  public
      fun hostnameMatch(hostnameMatch: CfnGatewayRouteGatewayRouteHostnameMatchPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnGatewayRouteGatewayRouteHostnameMatchPropertyDsl()
    builder.apply(hostnameMatch)
    cdkBuilder.hostnameMatch(builder.build())
  }

  /**
   * @param hostnameMatch GatewayRoute CFN configuration for host name match. 
   */
  public fun hostnameMatch(hostnameMatch: CfnGatewayRoute.GatewayRouteHostnameMatchProperty) {
    cdkBuilder.hostnameMatch(hostnameMatch)
  }

  public fun build(): GatewayRouteHostnameMatchConfig = cdkBuilder.build()
}
