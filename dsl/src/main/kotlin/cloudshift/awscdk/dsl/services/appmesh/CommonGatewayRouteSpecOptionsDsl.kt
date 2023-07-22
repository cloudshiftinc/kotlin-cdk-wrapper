@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions

@CdkDslMarker
public class CommonGatewayRouteSpecOptionsDsl {
  private val cdkBuilder: CommonGatewayRouteSpecOptions.Builder =
      CommonGatewayRouteSpecOptions.builder()

  /**
   * @param priority The priority for the gateway route.
   * When a Virtual Gateway has multiple gateway routes, gateway route match
   * is performed in the order of specified value, where 0 is the highest priority,
   * and first matched gateway route is selected.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): CommonGatewayRouteSpecOptions = cdkBuilder.build()
}
