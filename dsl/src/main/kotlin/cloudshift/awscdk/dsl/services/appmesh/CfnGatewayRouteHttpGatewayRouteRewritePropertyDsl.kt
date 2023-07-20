@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRouteRewritePropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.HttpGatewayRouteRewriteProperty.Builder =
      CfnGatewayRoute.HttpGatewayRouteRewriteProperty.builder()

  public fun hostname(hostname: IResolvable) {
    cdkBuilder.hostname(hostname)
  }

  public fun hostname(hostname: CfnGatewayRoute.GatewayRouteHostnameRewriteProperty) {
    cdkBuilder.hostname(hostname)
  }

  public fun path(path: IResolvable) {
    cdkBuilder.path(path)
  }

  public fun path(path: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty) {
    cdkBuilder.path(path)
  }

  public fun prefix(prefix: IResolvable) {
    cdkBuilder.prefix(prefix)
  }

  public fun prefix(prefix: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnGatewayRoute.HttpGatewayRouteRewriteProperty = cdkBuilder.build()
}
