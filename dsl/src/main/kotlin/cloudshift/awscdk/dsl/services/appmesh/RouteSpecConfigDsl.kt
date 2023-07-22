@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.RouteSpecConfig

@CdkDslMarker
public class RouteSpecConfigDsl {
  private val cdkBuilder: RouteSpecConfig.Builder = RouteSpecConfig.builder()

  /**
   * @param grpcRouteSpec The spec for a grpc route.
   */
  public fun grpcRouteSpec(grpcRouteSpec: CfnRouteGrpcRoutePropertyDsl.() -> Unit = {}) {
    val builder = CfnRouteGrpcRoutePropertyDsl()
    builder.apply(grpcRouteSpec)
    cdkBuilder.grpcRouteSpec(builder.build())
  }

  /**
   * @param grpcRouteSpec The spec for a grpc route.
   */
  public fun grpcRouteSpec(grpcRouteSpec: CfnRoute.GrpcRouteProperty) {
    cdkBuilder.grpcRouteSpec(grpcRouteSpec)
  }

  /**
   * @param http2RouteSpec The spec for an http2 route.
   */
  public fun http2RouteSpec(http2RouteSpec: CfnRouteHttpRoutePropertyDsl.() -> Unit = {}) {
    val builder = CfnRouteHttpRoutePropertyDsl()
    builder.apply(http2RouteSpec)
    cdkBuilder.http2RouteSpec(builder.build())
  }

  /**
   * @param http2RouteSpec The spec for an http2 route.
   */
  public fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty) {
    cdkBuilder.http2RouteSpec(http2RouteSpec)
  }

  /**
   * @param httpRouteSpec The spec for an http route.
   */
  public fun httpRouteSpec(httpRouteSpec: CfnRouteHttpRoutePropertyDsl.() -> Unit = {}) {
    val builder = CfnRouteHttpRoutePropertyDsl()
    builder.apply(httpRouteSpec)
    cdkBuilder.httpRouteSpec(builder.build())
  }

  /**
   * @param httpRouteSpec The spec for an http route.
   */
  public fun httpRouteSpec(httpRouteSpec: CfnRoute.HttpRouteProperty) {
    cdkBuilder.httpRouteSpec(httpRouteSpec)
  }

  /**
   * @param priority The priority for the route.
   * When a Virtual Router has multiple routes, route match is performed in the
   * order of specified value, where 0 is the highest priority, and first matched route is selected.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param tcpRouteSpec The spec for a tcp route.
   */
  public fun tcpRouteSpec(tcpRouteSpec: CfnRouteTcpRoutePropertyDsl.() -> Unit = {}) {
    val builder = CfnRouteTcpRoutePropertyDsl()
    builder.apply(tcpRouteSpec)
    cdkBuilder.tcpRouteSpec(builder.build())
  }

  /**
   * @param tcpRouteSpec The spec for a tcp route.
   */
  public fun tcpRouteSpec(tcpRouteSpec: CfnRoute.TcpRouteProperty) {
    cdkBuilder.tcpRouteSpec(tcpRouteSpec)
  }

  public fun build(): RouteSpecConfig = cdkBuilder.build()
}
