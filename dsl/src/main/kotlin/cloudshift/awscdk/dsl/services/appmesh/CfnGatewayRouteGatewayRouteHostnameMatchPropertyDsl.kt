@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteGatewayRouteHostnameMatchPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GatewayRouteHostnameMatchProperty.Builder =
      CfnGatewayRoute.GatewayRouteHostnameMatchProperty.builder()

  public fun exact(exact: String) {
    cdkBuilder.exact(exact)
  }

  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  public fun build(): CfnGatewayRoute.GatewayRouteHostnameMatchProperty = cdkBuilder.build()
}
