@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch
import software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions
import software.amazon.awscdk.services.appmesh.IVirtualService

/**
 * Properties specific for a gRPC GatewayRoute.
 *
 * Example:
 *
 * ```
 * VirtualGateway gateway;
 * VirtualService virtualService;
 * gateway.addGatewayRoute("gateway-route-grpc", GatewayRouteBaseProps.builder()
 * .routeSpec(GatewayRouteSpec.grpc(GrpcGatewayRouteSpecOptions.builder()
 * .routeTarget(virtualService)
 * .match(GrpcGatewayRouteMatch.builder()
 * .hostname(GatewayRouteHostnameMatch.endsWith(".example.com"))
 * .build())
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class GrpcGatewayRouteSpecOptionsDsl {
  private val cdkBuilder: GrpcGatewayRouteSpecOptions.Builder =
      GrpcGatewayRouteSpecOptions.builder()

  /**
   * @param match The criterion for determining a request match for this GatewayRoute. 
   */
  public fun match(match: GrpcGatewayRouteMatchDsl.() -> Unit = {}) {
    val builder = GrpcGatewayRouteMatchDsl()
    builder.apply(match)
    cdkBuilder.match(builder.build())
  }

  /**
   * @param match The criterion for determining a request match for this GatewayRoute. 
   */
  public fun match(match: GrpcGatewayRouteMatch) {
    cdkBuilder.match(match)
  }

  /**
   * @param priority The priority for the gateway route.
   * When a Virtual Gateway has multiple gateway routes, gateway route match
   * is performed in the order of specified value, where 0 is the highest priority,
   * and first matched gateway route is selected.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param routeTarget The VirtualService this GatewayRoute directs traffic to. 
   */
  public fun routeTarget(routeTarget: IVirtualService) {
    cdkBuilder.routeTarget(routeTarget)
  }

  public fun build(): GrpcGatewayRouteSpecOptions = cdkBuilder.build()
}
