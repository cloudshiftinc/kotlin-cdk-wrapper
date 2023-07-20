@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch
import software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions
import software.amazon.awscdk.services.appmesh.IVirtualService

@CdkDslMarker
public class GrpcGatewayRouteSpecOptionsDsl {
  private val cdkBuilder: GrpcGatewayRouteSpecOptions.Builder =
      GrpcGatewayRouteSpecOptions.builder()

  public fun match(block: GrpcGatewayRouteMatchDsl.() -> Unit = {}) {
    val builder = GrpcGatewayRouteMatchDsl()
    builder.apply(block)
    cdkBuilder.match(builder.build())
  }

  public fun match(match: GrpcGatewayRouteMatch) {
    cdkBuilder.match(match)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun routeTarget(routeTarget: IVirtualService) {
    cdkBuilder.routeTarget(routeTarget)
  }

  public fun build(): GrpcGatewayRouteSpecOptions = cdkBuilder.build()
}
