@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteGatewayRouteRangeMatchPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GatewayRouteRangeMatchProperty.Builder =
      CfnGatewayRoute.GatewayRouteRangeMatchProperty.builder()

  /**
   * @param end The end of the range. 
   */
  public fun end(end: Number) {
    cdkBuilder.end(end)
  }

  /**
   * @param start The start of the range. 
   */
  public fun start(start: Number) {
    cdkBuilder.start(start)
  }

  public fun build(): CfnGatewayRoute.GatewayRouteRangeMatchProperty = cdkBuilder.build()
}
