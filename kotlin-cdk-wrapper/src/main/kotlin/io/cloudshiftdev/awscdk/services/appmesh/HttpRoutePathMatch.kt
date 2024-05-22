@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Defines HTTP route matching based on the URL path of the request.
 *
 * Example:
 *
 * ```
 * VirtualRouter router;
 * VirtualNode node;
 * router.addRoute("route-http", RouteBaseProps.builder()
 * .routeSpec(RouteSpec.http(HttpRouteSpecOptions.builder()
 * .weightedTargets(List.of(WeightedTarget.builder()
 * .virtualNode(node)
 * .weight(50)
 * .build(), WeightedTarget.builder()
 * .virtualNode(node)
 * .weight(50)
 * .build()))
 * .match(HttpRouteMatch.builder()
 * .path(HttpRoutePathMatch.startsWith("/path-to-app"))
 * .build())
 * .build()))
 * .build());
 * ```
 */
public abstract class HttpRoutePathMatch(
  cdkObject: software.amazon.awscdk.services.appmesh.HttpRoutePathMatch,
) : CdkObject(cdkObject) {
  /**
   * Returns the route path match configuration.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): HttpRoutePathMatchConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap)).let(HttpRoutePathMatchConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HttpRoutePathMatch,
  ) : HttpRoutePathMatch(cdkObject)

  public companion object {
    public fun exactly(path: String): HttpRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatch.exactly(path).let(HttpRoutePathMatch::wrap)

    public fun regex(regex: String): HttpRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatch.regex(regex).let(HttpRoutePathMatch::wrap)

    public fun startsWith(prefix: String): HttpRoutePathMatch =
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatch.startsWith(prefix).let(HttpRoutePathMatch::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpRoutePathMatch):
        HttpRoutePathMatch = CdkObjectWrappers.wrap(cdkObject) as? HttpRoutePathMatch ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRoutePathMatch):
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatch = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpRoutePathMatch
  }
}
