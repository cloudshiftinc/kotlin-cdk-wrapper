@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig

@CdkDslMarker
public class GatewayRouteSpecConfigDsl {
  private val cdkBuilder: GatewayRouteSpecConfig.Builder = GatewayRouteSpecConfig.builder()

  /**
   * @param grpcSpecConfig The spec for a grpc gateway route.
   */
  public fun grpcSpecConfig(grpcSpecConfig: CfnGatewayRouteGrpcGatewayRoutePropertyDsl.() -> Unit =
      {}) {
    val builder = CfnGatewayRouteGrpcGatewayRoutePropertyDsl()
    builder.apply(grpcSpecConfig)
    cdkBuilder.grpcSpecConfig(builder.build())
  }

  /**
   * @param grpcSpecConfig The spec for a grpc gateway route.
   */
  public fun grpcSpecConfig(grpcSpecConfig: CfnGatewayRoute.GrpcGatewayRouteProperty) {
    cdkBuilder.grpcSpecConfig(grpcSpecConfig)
  }

  /**
   * @param http2SpecConfig The spec for an http2 gateway route.
   */
  public fun http2SpecConfig(http2SpecConfig: CfnGatewayRouteHttpGatewayRoutePropertyDsl.() -> Unit
      = {}) {
    val builder = CfnGatewayRouteHttpGatewayRoutePropertyDsl()
    builder.apply(http2SpecConfig)
    cdkBuilder.http2SpecConfig(builder.build())
  }

  /**
   * @param http2SpecConfig The spec for an http2 gateway route.
   */
  public fun http2SpecConfig(http2SpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty) {
    cdkBuilder.http2SpecConfig(http2SpecConfig)
  }

  /**
   * @param httpSpecConfig The spec for an http gateway route.
   */
  public fun httpSpecConfig(httpSpecConfig: CfnGatewayRouteHttpGatewayRoutePropertyDsl.() -> Unit =
      {}) {
    val builder = CfnGatewayRouteHttpGatewayRoutePropertyDsl()
    builder.apply(httpSpecConfig)
    cdkBuilder.httpSpecConfig(builder.build())
  }

  /**
   * @param httpSpecConfig The spec for an http gateway route.
   */
  public fun httpSpecConfig(httpSpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty) {
    cdkBuilder.httpSpecConfig(httpSpecConfig)
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

  public fun build(): GatewayRouteSpecConfig = cdkBuilder.build()
}
