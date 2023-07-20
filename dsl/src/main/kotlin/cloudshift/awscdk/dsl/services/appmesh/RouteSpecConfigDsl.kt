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

  public fun grpcRouteSpec(block: CfnRouteGrpcRoutePropertyDsl.() -> Unit = {}) {
    val builder = CfnRouteGrpcRoutePropertyDsl()
    builder.apply(block)
    cdkBuilder.grpcRouteSpec(builder.build())
  }

  public fun grpcRouteSpec(grpcRouteSpec: CfnRoute.GrpcRouteProperty) {
    cdkBuilder.grpcRouteSpec(grpcRouteSpec)
  }

  public fun http2RouteSpec(block: CfnRouteHttpRoutePropertyDsl.() -> Unit = {}) {
    val builder = CfnRouteHttpRoutePropertyDsl()
    builder.apply(block)
    cdkBuilder.http2RouteSpec(builder.build())
  }

  public fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty) {
    cdkBuilder.http2RouteSpec(http2RouteSpec)
  }

  public fun httpRouteSpec(block: CfnRouteHttpRoutePropertyDsl.() -> Unit = {}) {
    val builder = CfnRouteHttpRoutePropertyDsl()
    builder.apply(block)
    cdkBuilder.httpRouteSpec(builder.build())
  }

  public fun httpRouteSpec(httpRouteSpec: CfnRoute.HttpRouteProperty) {
    cdkBuilder.httpRouteSpec(httpRouteSpec)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun tcpRouteSpec(block: CfnRouteTcpRoutePropertyDsl.() -> Unit = {}) {
    val builder = CfnRouteTcpRoutePropertyDsl()
    builder.apply(block)
    cdkBuilder.tcpRouteSpec(builder.build())
  }

  public fun tcpRouteSpec(tcpRouteSpec: CfnRoute.TcpRouteProperty) {
    cdkBuilder.tcpRouteSpec(tcpRouteSpec)
  }

  public fun build(): RouteSpecConfig = cdkBuilder.build()
}
