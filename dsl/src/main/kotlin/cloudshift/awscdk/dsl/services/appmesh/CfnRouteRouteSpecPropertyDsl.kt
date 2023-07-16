@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteRouteSpecPropertyDsl {
  private val cdkBuilder: CfnRoute.RouteSpecProperty.Builder = CfnRoute.RouteSpecProperty.builder()

  public fun grpcRoute(grpcRoute: IResolvable) {
    cdkBuilder.grpcRoute(grpcRoute)
  }

  public fun grpcRoute(grpcRoute: CfnRoute.GrpcRouteProperty) {
    cdkBuilder.grpcRoute(grpcRoute)
  }

  public fun http2Route(http2Route: IResolvable) {
    cdkBuilder.http2Route(http2Route)
  }

  public fun http2Route(http2Route: CfnRoute.HttpRouteProperty) {
    cdkBuilder.http2Route(http2Route)
  }

  public fun httpRoute(httpRoute: IResolvable) {
    cdkBuilder.httpRoute(httpRoute)
  }

  public fun httpRoute(httpRoute: CfnRoute.HttpRouteProperty) {
    cdkBuilder.httpRoute(httpRoute)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun tcpRoute(tcpRoute: IResolvable) {
    cdkBuilder.tcpRoute(tcpRoute)
  }

  public fun tcpRoute(tcpRoute: CfnRoute.TcpRouteProperty) {
    cdkBuilder.tcpRoute(tcpRoute)
  }

  public fun build(): CfnRoute.RouteSpecProperty = cdkBuilder.build()
}
