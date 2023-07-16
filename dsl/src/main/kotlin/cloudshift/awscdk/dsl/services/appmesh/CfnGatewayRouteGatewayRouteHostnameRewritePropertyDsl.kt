@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteGatewayRouteHostnameRewritePropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GatewayRouteHostnameRewriteProperty.Builder =
      CfnGatewayRoute.GatewayRouteHostnameRewriteProperty.builder()

  public fun defaultTargetHostname(defaultTargetHostname: String) {
    cdkBuilder.defaultTargetHostname(defaultTargetHostname)
  }

  public fun build(): CfnGatewayRoute.GatewayRouteHostnameRewriteProperty = cdkBuilder.build()
}
