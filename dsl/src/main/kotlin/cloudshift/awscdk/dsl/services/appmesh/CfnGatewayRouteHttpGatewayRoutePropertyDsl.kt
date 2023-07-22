@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRoutePropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.HttpGatewayRouteProperty.Builder =
      CfnGatewayRoute.HttpGatewayRouteProperty.builder()

  /**
   * @param action An object that represents the action to take if a match is determined. 
   */
  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  /**
   * @param action An object that represents the action to take if a match is determined. 
   */
  public fun action(action: CfnGatewayRoute.HttpGatewayRouteActionProperty) {
    cdkBuilder.action(action)
  }

  /**
   * @param match An object that represents the criteria for determining a request match. 
   */
  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  /**
   * @param match An object that represents the criteria for determining a request match. 
   */
  public fun match(match: CfnGatewayRoute.HttpGatewayRouteMatchProperty) {
    cdkBuilder.match(match)
  }

  public fun build(): CfnGatewayRoute.HttpGatewayRouteProperty = cdkBuilder.build()
}
