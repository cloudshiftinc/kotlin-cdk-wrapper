@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteQueryParameterPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.QueryParameterProperty.Builder =
      CfnGatewayRoute.QueryParameterProperty.builder()

  /**
   * @param match The query parameter to match on.
   */
  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  /**
   * @param match The query parameter to match on.
   */
  public fun match(match: CfnGatewayRoute.HttpQueryParameterMatchProperty) {
    cdkBuilder.match(match)
  }

  /**
   * @param name A name for the query parameter that will be matched on. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnGatewayRoute.QueryParameterProperty = cdkBuilder.build()
}
