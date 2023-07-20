@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch
import software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions
import software.amazon.awscdk.services.appmesh.IVirtualService

@CdkDslMarker
public class HttpGatewayRouteSpecOptionsDsl {
  private val cdkBuilder: HttpGatewayRouteSpecOptions.Builder =
      HttpGatewayRouteSpecOptions.builder()

  public fun match(block: HttpGatewayRouteMatchDsl.() -> Unit = {}) {
    val builder = HttpGatewayRouteMatchDsl()
    builder.apply(block)
    cdkBuilder.match(builder.build())
  }

  public fun match(match: HttpGatewayRouteMatch) {
    cdkBuilder.match(match)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun routeTarget(routeTarget: IVirtualService) {
    cdkBuilder.routeTarget(routeTarget)
  }

  public fun build(): HttpGatewayRouteSpecOptions = cdkBuilder.build()
}
