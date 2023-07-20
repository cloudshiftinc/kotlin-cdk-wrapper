@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteGatewayRouteTargetPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GatewayRouteTargetProperty.Builder =
      CfnGatewayRoute.GatewayRouteTargetProperty.builder()

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun virtualService(virtualService: IResolvable) {
    cdkBuilder.virtualService(virtualService)
  }

  public fun virtualService(virtualService: CfnGatewayRoute.GatewayRouteVirtualServiceProperty) {
    cdkBuilder.virtualService(virtualService)
  }

  public fun build(): CfnGatewayRoute.GatewayRouteTargetProperty = cdkBuilder.build()
}
