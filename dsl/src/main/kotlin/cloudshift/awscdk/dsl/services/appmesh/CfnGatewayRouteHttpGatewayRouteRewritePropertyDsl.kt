@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRouteRewritePropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.HttpGatewayRouteRewriteProperty.Builder =
      CfnGatewayRoute.HttpGatewayRouteRewriteProperty.builder()

  /**
   * @param hostname The host name to rewrite.
   */
  public fun hostname(hostname: IResolvable) {
    cdkBuilder.hostname(hostname)
  }

  /**
   * @param hostname The host name to rewrite.
   */
  public fun hostname(hostname: CfnGatewayRoute.GatewayRouteHostnameRewriteProperty) {
    cdkBuilder.hostname(hostname)
  }

  /**
   * @param path The path to rewrite.
   */
  public fun path(path: IResolvable) {
    cdkBuilder.path(path)
  }

  /**
   * @param path The path to rewrite.
   */
  public fun path(path: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty) {
    cdkBuilder.path(path)
  }

  /**
   * @param prefix The specified beginning characters to rewrite.
   */
  public fun prefix(prefix: IResolvable) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param prefix The specified beginning characters to rewrite.
   */
  public fun prefix(prefix: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnGatewayRoute.HttpGatewayRouteRewriteProperty = cdkBuilder.build()
}
