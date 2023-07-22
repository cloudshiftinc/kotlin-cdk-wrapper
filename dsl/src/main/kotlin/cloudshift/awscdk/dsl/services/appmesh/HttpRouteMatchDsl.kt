@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.HeaderMatch
import software.amazon.awscdk.services.appmesh.HttpRouteMatch
import software.amazon.awscdk.services.appmesh.HttpRouteMethod
import software.amazon.awscdk.services.appmesh.HttpRoutePathMatch
import software.amazon.awscdk.services.appmesh.HttpRouteProtocol
import software.amazon.awscdk.services.appmesh.QueryParameterMatch

/**
 * The criterion for determining a request match for this Route.
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
@CdkDslMarker
public class HttpRouteMatchDsl {
  private val cdkBuilder: HttpRouteMatch.Builder = HttpRouteMatch.builder()

  private val _headers: MutableList<HeaderMatch> = mutableListOf()

  private val _queryParameters: MutableList<QueryParameterMatch> = mutableListOf()

  /**
   * @param headers Specifies the client request headers to match on.
   * All specified headers
   * must match for the route to match.
   */
  public fun headers(vararg headers: HeaderMatch) {
    _headers.addAll(listOf(*headers))
  }

  /**
   * @param headers Specifies the client request headers to match on.
   * All specified headers
   * must match for the route to match.
   */
  public fun headers(headers: Collection<HeaderMatch>) {
    _headers.addAll(headers)
  }

  /**
   * @param method The HTTP client request method to match on.
   */
  public fun method(method: HttpRouteMethod) {
    cdkBuilder.method(method)
  }

  /**
   * @param path Specifies how is the request matched based on the path part of its URL.
   */
  public fun path(path: HttpRoutePathMatch) {
    cdkBuilder.path(path)
  }

  /**
   * @param port The port to match from the request.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The client request protocol to match on.
   * Applicable only for HTTP2 routes.
   */
  public fun protocol(protocol: HttpRouteProtocol) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param queryParameters The query parameters to match on.
   * All specified query parameters must match for the route to match.
   */
  public fun queryParameters(vararg queryParameters: QueryParameterMatch) {
    _queryParameters.addAll(listOf(*queryParameters))
  }

  /**
   * @param queryParameters The query parameters to match on.
   * All specified query parameters must match for the route to match.
   */
  public fun queryParameters(queryParameters: Collection<QueryParameterMatch>) {
    _queryParameters.addAll(queryParameters)
  }

  public fun build(): HttpRouteMatch {
    if(_headers.isNotEmpty()) cdkBuilder.headers(_headers)
    if(_queryParameters.isNotEmpty()) cdkBuilder.queryParameters(_queryParameters)
    return cdkBuilder.build()
  }
}
