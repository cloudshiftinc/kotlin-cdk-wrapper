@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Defines HTTP gateway route matching based on the URL path of the request.
 *
 * Example:
 *
 * ```
 * VirtualGateway gateway;
 * VirtualService virtualService;
 * gateway.addGatewayRoute("gateway-route-http-2", GatewayRouteBaseProps.builder()
 * .routeSpec(GatewayRouteSpec.http(HttpGatewayRouteSpecOptions.builder()
 * .routeTarget(virtualService)
 * .match(HttpGatewayRouteMatch.builder()
 * // This rewrites the path from '/test' to '/rewrittenPath'.
 * .path(HttpGatewayRoutePathMatch.exactly("/test", "/rewrittenPath"))
 * .build())
 * .build()))
 * .build());
 * ```
 */
public abstract class HttpGatewayRoutePathMatch(
  cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch,
) : CdkObject(cdkObject) {
  /**
   * Returns the gateway route path match configuration.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): HttpGatewayRoutePathMatchConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap)).let(HttpGatewayRoutePathMatchConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch,
  ) : HttpGatewayRoutePathMatch(cdkObject)

  public companion object {
    public fun exactly(path: String): HttpGatewayRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch.exactly(path).let(HttpGatewayRoutePathMatch::wrap)

    public fun exactly(path: String, rewriteTo: String): HttpGatewayRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch.exactly(path,
        rewriteTo).let(HttpGatewayRoutePathMatch::wrap)

    public fun regex(regex: String): HttpGatewayRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch.regex(regex).let(HttpGatewayRoutePathMatch::wrap)

    public fun regex(regex: String, rewriteTo: String): HttpGatewayRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch.regex(regex,
        rewriteTo).let(HttpGatewayRoutePathMatch::wrap)

    public fun startsWith(prefix: String): HttpGatewayRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch.startsWith(prefix).let(HttpGatewayRoutePathMatch::wrap)

    public fun startsWith(prefix: String, rewriteTo: String): HttpGatewayRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch.startsWith(prefix,
        rewriteTo).let(HttpGatewayRoutePathMatch::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch):
        HttpGatewayRoutePathMatch = CdkObjectWrappers.wrap(cdkObject) as? HttpGatewayRoutePathMatch
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpGatewayRoutePathMatch):
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch
  }
}
