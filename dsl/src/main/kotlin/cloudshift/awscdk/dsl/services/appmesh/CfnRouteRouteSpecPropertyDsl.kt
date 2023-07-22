@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteRouteSpecPropertyDsl {
  private val cdkBuilder: CfnRoute.RouteSpecProperty.Builder = CfnRoute.RouteSpecProperty.builder()

  /**
   * @param grpcRoute An object that represents the specification of a gRPC route.
   */
  public fun grpcRoute(grpcRoute: IResolvable) {
    cdkBuilder.grpcRoute(grpcRoute)
  }

  /**
   * @param grpcRoute An object that represents the specification of a gRPC route.
   */
  public fun grpcRoute(grpcRoute: CfnRoute.GrpcRouteProperty) {
    cdkBuilder.grpcRoute(grpcRoute)
  }

  /**
   * @param http2Route An object that represents the specification of an HTTP/2 route.
   */
  public fun http2Route(http2Route: IResolvable) {
    cdkBuilder.http2Route(http2Route)
  }

  /**
   * @param http2Route An object that represents the specification of an HTTP/2 route.
   */
  public fun http2Route(http2Route: CfnRoute.HttpRouteProperty) {
    cdkBuilder.http2Route(http2Route)
  }

  /**
   * @param httpRoute An object that represents the specification of an HTTP route.
   */
  public fun httpRoute(httpRoute: IResolvable) {
    cdkBuilder.httpRoute(httpRoute)
  }

  /**
   * @param httpRoute An object that represents the specification of an HTTP route.
   */
  public fun httpRoute(httpRoute: CfnRoute.HttpRouteProperty) {
    cdkBuilder.httpRoute(httpRoute)
  }

  /**
   * @param priority The priority for the route.
   * Routes are matched based on the specified value, where 0 is the highest priority.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param tcpRoute An object that represents the specification of a TCP route.
   */
  public fun tcpRoute(tcpRoute: IResolvable) {
    cdkBuilder.tcpRoute(tcpRoute)
  }

  /**
   * @param tcpRoute An object that represents the specification of a TCP route.
   */
  public fun tcpRoute(tcpRoute: CfnRoute.TcpRouteProperty) {
    cdkBuilder.tcpRoute(tcpRoute)
  }

  public fun build(): CfnRoute.RouteSpecProperty = cdkBuilder.build()
}
