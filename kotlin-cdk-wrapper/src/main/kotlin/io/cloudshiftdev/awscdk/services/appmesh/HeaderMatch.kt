@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Number
import kotlin.String

/**
 * Used to generate header matching methods.
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
public abstract class HeaderMatch internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.HeaderMatch,
) : CdkObject(cdkObject) {
  /**
   * Returns the header match configuration.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): HeaderMatchConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(HeaderMatchConfig::wrap)

  public companion object {
    public fun valueDoesNotEndWith(headerName: String, suffix: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueDoesNotEndWith(headerName,
        suffix).let(HeaderMatch::wrap)

    public fun valueDoesNotMatchRegex(headerName: String, regex: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueDoesNotMatchRegex(headerName,
        regex).let(HeaderMatch::wrap)

    public fun valueDoesNotStartWith(headerName: String, prefix: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueDoesNotStartWith(headerName,
        prefix).let(HeaderMatch::wrap)

    public fun valueEndsWith(headerName: String, suffix: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueEndsWith(headerName,
        suffix).let(HeaderMatch::wrap)

    public fun valueIs(headerName: String, headerValue: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueIs(headerName,
        headerValue).let(HeaderMatch::wrap)

    public fun valueIsNot(headerName: String, headerValue: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueIsNot(headerName,
        headerValue).let(HeaderMatch::wrap)

    public fun valueMatchesRegex(headerName: String, regex: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueMatchesRegex(headerName,
        regex).let(HeaderMatch::wrap)

    public fun valueStartsWith(headerName: String, prefix: String): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valueStartsWith(headerName,
        prefix).let(HeaderMatch::wrap)

    public fun valuesIsInRange(
      headerName: String,
      start: Number,
      end: Number,
    ): HeaderMatch = software.amazon.awscdk.services.appmesh.HeaderMatch.valuesIsInRange(headerName,
        start, end).let(HeaderMatch::wrap)

    public fun valuesIsNotInRange(
      headerName: String,
      start: Number,
      end: Number,
    ): HeaderMatch =
        software.amazon.awscdk.services.appmesh.HeaderMatch.valuesIsNotInRange(headerName, start,
        end).let(HeaderMatch::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HeaderMatch): HeaderMatch =
        CdkObjectWrappers.wrap(cdkObject) as HeaderMatch

    internal fun unwrap(wrapped: HeaderMatch): software.amazon.awscdk.services.appmesh.HeaderMatch =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HeaderMatch
  }
}
