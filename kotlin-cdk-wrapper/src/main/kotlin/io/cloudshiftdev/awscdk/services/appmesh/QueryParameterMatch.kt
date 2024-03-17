@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Used to generate query parameter matching methods.
 *
 * Example:
 *
 * ```
 * VirtualRouter router;
 * VirtualNode node;
 * router.addRoute("route-http2", RouteBaseProps.builder()
 * .routeSpec(RouteSpec.http2(HttpRouteSpecOptions.builder()
 * .weightedTargets(List.of(WeightedTarget.builder()
 * .virtualNode(node)
 * .build()))
 * .match(HttpRouteMatch.builder()
 * .path(HttpRoutePathMatch.exactly("/exact"))
 * .method(HttpRouteMethod.POST)
 * .protocol(HttpRouteProtocol.HTTPS)
 * .headers(List.of(HeaderMatch.valueIs("Content-Type", "application/json"),
 * HeaderMatch.valueIsNot("Content-Type", "application/json")))
 * .queryParameters(List.of(QueryParameterMatch.valueIs("query-field", "value")))
 * .build())
 * .build()))
 * .build());
 * ```
 */
public abstract class QueryParameterMatch internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatch,
) : CdkObject(cdkObject) {
  /**
   * Returns the query parameter match configuration.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): QueryParameterMatchConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(QueryParameterMatchConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatch,
  ) : QueryParameterMatch(cdkObject)

  public companion object {
    public fun valueIs(queryParameterName: String, queryParameterValue: String): QueryParameterMatch
        = software.amazon.awscdk.services.appmesh.QueryParameterMatch.valueIs(queryParameterName,
        queryParameterValue).let(QueryParameterMatch::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatch):
        QueryParameterMatch = CdkObjectWrappers.wrap(cdkObject) as? QueryParameterMatch ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryParameterMatch):
        software.amazon.awscdk.services.appmesh.QueryParameterMatch = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.QueryParameterMatch
  }
}
