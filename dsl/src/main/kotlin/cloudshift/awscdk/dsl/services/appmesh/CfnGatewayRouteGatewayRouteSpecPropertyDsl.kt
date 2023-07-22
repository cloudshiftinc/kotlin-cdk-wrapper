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

  /**
   * @param grpcRoute An object that represents the specification of a gRPC gateway route.
   */
  public fun grpcRoute(grpcRoute: IResolvable) {
    cdkBuilder.grpcRoute(grpcRoute)
  }

  /**
   * @param grpcRoute An object that represents the specification of a gRPC gateway route.
   */
  public fun grpcRoute(grpcRoute: CfnGatewayRoute.GrpcGatewayRouteProperty) {
    cdkBuilder.grpcRoute(grpcRoute)
  }

  /**
   * @param http2Route An object that represents the specification of an HTTP/2 gateway route.
   */
  public fun http2Route(http2Route: IResolvable) {
    cdkBuilder.http2Route(http2Route)
  }

  /**
   * @param http2Route An object that represents the specification of an HTTP/2 gateway route.
   */
  public fun http2Route(http2Route: CfnGatewayRoute.HttpGatewayRouteProperty) {
    cdkBuilder.http2Route(http2Route)
  }

  /**
   * @param httpRoute An object that represents the specification of an HTTP gateway route.
   */
  public fun httpRoute(httpRoute: IResolvable) {
    cdkBuilder.httpRoute(httpRoute)
  }

  /**
   * @param httpRoute An object that represents the specification of an HTTP gateway route.
   */
  public fun httpRoute(httpRoute: CfnGatewayRoute.HttpGatewayRouteProperty) {
    cdkBuilder.httpRoute(httpRoute)
  }

  /**
   * @param priority The ordering of the gateway routes spec.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): CfnGatewayRoute.GatewayRouteSpecProperty = cdkBuilder.build()
}
