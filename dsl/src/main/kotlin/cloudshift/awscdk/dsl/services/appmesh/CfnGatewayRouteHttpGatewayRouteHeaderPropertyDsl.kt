@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRouteHeaderPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.HttpGatewayRouteHeaderProperty.Builder =
      CfnGatewayRoute.HttpGatewayRouteHeaderProperty.builder()

  /**
   * @param invert Specify `True` to match anything except the match criteria.
   * The default value is `False` .
   */
  public fun invert(invert: Boolean) {
    cdkBuilder.invert(invert)
  }

  /**
   * @param invert Specify `True` to match anything except the match criteria.
   * The default value is `False` .
   */
  public fun invert(invert: IResolvable) {
    cdkBuilder.invert(invert)
  }

  /**
   * @param match An object that represents the method and value to match with the header value sent
   * in a request.
   * Specify one match method.
   */
  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  /**
   * @param match An object that represents the method and value to match with the header value sent
   * in a request.
   * Specify one match method.
   */
  public fun match(match: CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty) {
    cdkBuilder.match(match)
  }

  /**
   * @param name A name for the HTTP header in the gateway route that will be matched on. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnGatewayRoute.HttpGatewayRouteHeaderProperty = cdkBuilder.build()
}
