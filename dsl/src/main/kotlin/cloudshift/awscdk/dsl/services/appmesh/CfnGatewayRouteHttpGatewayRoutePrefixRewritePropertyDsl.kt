@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRoutePrefixRewritePropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.Builder =
      CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.builder()

  public fun defaultPrefix(defaultPrefix: String) {
    cdkBuilder.defaultPrefix(defaultPrefix)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty = cdkBuilder.build()
}
