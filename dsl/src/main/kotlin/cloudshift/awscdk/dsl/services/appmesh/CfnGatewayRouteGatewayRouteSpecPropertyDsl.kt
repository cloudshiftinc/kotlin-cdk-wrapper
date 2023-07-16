@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteGatewayRouteSpecPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GatewayRouteSpecProperty.Builder =
      CfnGatewayRoute.GatewayRouteSpecProperty.builder()

  public fun grpcRoute(grpcRoute: IResolvable) {
    cdkBuilder.grpcRoute(grpcRoute)
  }

  public fun grpcRoute(grpcRoute: CfnGatewayRoute.GrpcGatewayRouteProperty) {
    cdkBuilder.grpcRoute(grpcRoute)
  }

  public fun http2Route(http2Route: IResolvable) {
    cdkBuilder.http2Route(http2Route)
  }

  public fun http2Route(http2Route: CfnGatewayRoute.HttpGatewayRouteProperty) {
    cdkBuilder.http2Route(http2Route)
  }

  public fun httpRoute(httpRoute: IResolvable) {
    cdkBuilder.httpRoute(httpRoute)
  }

  public fun httpRoute(httpRoute: CfnGatewayRoute.HttpGatewayRouteProperty) {
    cdkBuilder.httpRoute(httpRoute)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): CfnGatewayRoute.GatewayRouteSpecProperty = cdkBuilder.build()
}
