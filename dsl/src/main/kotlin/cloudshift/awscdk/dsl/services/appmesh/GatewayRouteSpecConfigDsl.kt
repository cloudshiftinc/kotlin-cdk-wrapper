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

  public fun grpcSpecConfig(block: CfnGatewayRouteGrpcGatewayRoutePropertyDsl.() -> Unit = {}) {
    val builder = CfnGatewayRouteGrpcGatewayRoutePropertyDsl()
    builder.apply(block)
    cdkBuilder.grpcSpecConfig(builder.build())
  }

  public fun grpcSpecConfig(grpcSpecConfig: CfnGatewayRoute.GrpcGatewayRouteProperty) {
    cdkBuilder.grpcSpecConfig(grpcSpecConfig)
  }

  public fun http2SpecConfig(block: CfnGatewayRouteHttpGatewayRoutePropertyDsl.() -> Unit = {}) {
    val builder = CfnGatewayRouteHttpGatewayRoutePropertyDsl()
    builder.apply(block)
    cdkBuilder.http2SpecConfig(builder.build())
  }

  public fun http2SpecConfig(http2SpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty) {
    cdkBuilder.http2SpecConfig(http2SpecConfig)
  }

  public fun httpSpecConfig(block: CfnGatewayRouteHttpGatewayRoutePropertyDsl.() -> Unit = {}) {
    val builder = CfnGatewayRouteHttpGatewayRoutePropertyDsl()
    builder.apply(block)
    cdkBuilder.httpSpecConfig(builder.build())
  }

  public fun httpSpecConfig(httpSpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty) {
    cdkBuilder.httpSpecConfig(httpSpecConfig)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): GatewayRouteSpecConfig = cdkBuilder.build()
}
