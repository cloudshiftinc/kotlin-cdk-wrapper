@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteGrpcGatewayRouteActionPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GrpcGatewayRouteActionProperty.Builder =
      CfnGatewayRoute.GrpcGatewayRouteActionProperty.builder()

  public fun rewrite(rewrite: IResolvable) {
    cdkBuilder.rewrite(rewrite)
  }

  public fun rewrite(rewrite: CfnGatewayRoute.GrpcGatewayRouteRewriteProperty) {
    cdkBuilder.rewrite(rewrite)
  }

  public fun target(target: IResolvable) {
    cdkBuilder.target(target)
  }

  public fun target(target: CfnGatewayRoute.GatewayRouteTargetProperty) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnGatewayRoute.GrpcGatewayRouteActionProperty = cdkBuilder.build()
}
