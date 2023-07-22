@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteGrpcGatewayRouteActionPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GrpcGatewayRouteActionProperty.Builder =
      CfnGatewayRoute.GrpcGatewayRouteActionProperty.builder()

  /**
   * @param rewrite The gateway route action to rewrite.
   */
  public fun rewrite(rewrite: IResolvable) {
    cdkBuilder.rewrite(rewrite)
  }

  /**
   * @param rewrite The gateway route action to rewrite.
   */
  public fun rewrite(rewrite: CfnGatewayRoute.GrpcGatewayRouteRewriteProperty) {
    cdkBuilder.rewrite(rewrite)
  }

  /**
   * @param target An object that represents the target that traffic is routed to when a request
   * matches the gateway route. 
   */
  public fun target(target: IResolvable) {
    cdkBuilder.target(target)
  }

  /**
   * @param target An object that represents the target that traffic is routed to when a request
   * matches the gateway route. 
   */
  public fun target(target: CfnGatewayRoute.GatewayRouteTargetProperty) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnGatewayRoute.GrpcGatewayRouteActionProperty = cdkBuilder.build()
}
