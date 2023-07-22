@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRoutePathRewritePropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.Builder =
      CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.builder()

  /**
   * @param exact The exact path to rewrite.
   */
  public fun exact(exact: String) {
    cdkBuilder.exact(exact)
  }

  public fun build(): CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty = cdkBuilder.build()
}
