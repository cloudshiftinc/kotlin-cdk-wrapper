@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Used to generate host name matching methods.
 *
 * Example:
 *
 * ```
 * VirtualGateway gateway;
 * VirtualService virtualService;
 * gateway.addGatewayRoute("gateway-route-grpc", GatewayRouteBaseProps.builder()
 * .routeSpec(GatewayRouteSpec.grpc(GrpcGatewayRouteSpecOptions.builder()
 * .routeTarget(virtualService)
 * .match(GrpcGatewayRouteMatch.builder()
 * .hostname(GatewayRouteHostnameMatch.endsWith(".example.com"))
 * .build())
 * .build()))
 * .build());
 * ```
 */
public abstract class GatewayRouteHostnameMatch(
  cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch,
) : CdkObject(cdkObject) {
  /**
   * Returns the gateway route host name match configuration.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): GatewayRouteHostnameMatchConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(GatewayRouteHostnameMatchConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch,
  ) : GatewayRouteHostnameMatch(cdkObject)

  public companion object {
    public fun endsWith(suffix: String): GatewayRouteHostnameMatch =
        software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch.endsWith(suffix).let(GatewayRouteHostnameMatch::wrap)

    public fun exactly(name: String): GatewayRouteHostnameMatch =
        software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch.exactly(name).let(GatewayRouteHostnameMatch::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch):
        GatewayRouteHostnameMatch = CdkObjectWrappers.wrap(cdkObject) as? GatewayRouteHostnameMatch
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayRouteHostnameMatch):
        software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch
  }
}
