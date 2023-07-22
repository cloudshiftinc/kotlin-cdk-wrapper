@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteHttpPathMatchPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.HttpPathMatchProperty.Builder =
      CfnGatewayRoute.HttpPathMatchProperty.builder()

  /**
   * @param exact The exact path to match on.
   */
  public fun exact(exact: String) {
    cdkBuilder.exact(exact)
  }

  /**
   * @param regex The regex used to match the path.
   */
  public fun regex(regex: String) {
    cdkBuilder.regex(regex)
  }

  public fun build(): CfnGatewayRoute.HttpPathMatchProperty = cdkBuilder.build()
}
