@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

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
public interface HttpRouteMatch {
  /**
   * Specifies the client request headers to match on.
   *
   * All specified headers
   * must match for the route to match.
   *
   * Default: - do not match on headers
   */
  public fun headers(): List<HeaderMatch> = unwrap(this).getHeaders()?.map(HeaderMatch::wrap) ?:
      emptyList()

  /**
   * The HTTP client request method to match on.
   *
   * Default: - do not match on request method
   */
  public fun method(): HttpRouteMethod? = unwrap(this).getMethod()?.let(HttpRouteMethod::wrap)

  /**
   * Specifies how is the request matched based on the path part of its URL.
   *
   * Default: - matches requests with all paths
   */
  public fun path(): HttpRoutePathMatch? = unwrap(this).getPath()?.let(HttpRoutePathMatch::wrap)

  /**
   * The port to match from the request.
   *
   * Default: - do not match on port
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The client request protocol to match on.
   *
   * Applicable only for HTTP2 routes.
   *
   * Default: - do not match on HTTP2 request protocol
   */
  public fun protocol(): HttpRouteProtocol? =
      unwrap(this).getProtocol()?.let(HttpRouteProtocol::wrap)

  /**
   * The query parameters to match on.
   *
   * All specified query parameters must match for the route to match.
   *
   * Default: - do not match on query parameters
   */
  public fun queryParameters(): List<QueryParameterMatch> =
      unwrap(this).getQueryParameters()?.map(QueryParameterMatch::wrap) ?: emptyList()

  /**
   * A builder for [HttpRouteMatch]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param headers Specifies the client request headers to match on.
     * All specified headers
     * must match for the route to match.
     */
    public fun headers(headers: List<HeaderMatch>)

    /**
     * @param headers Specifies the client request headers to match on.
     * All specified headers
     * must match for the route to match.
     */
    public fun headers(vararg headers: HeaderMatch)

    /**
     * @param method The HTTP client request method to match on.
     */
    public fun method(method: HttpRouteMethod)

    /**
     * @param path Specifies how is the request matched based on the path part of its URL.
     */
    public fun path(path: HttpRoutePathMatch)

    /**
     * @param port The port to match from the request.
     */
    public fun port(port: Number)

    /**
     * @param protocol The client request protocol to match on.
     * Applicable only for HTTP2 routes.
     */
    public fun protocol(protocol: HttpRouteProtocol)

    /**
     * @param queryParameters The query parameters to match on.
     * All specified query parameters must match for the route to match.
     */
    public fun queryParameters(queryParameters: List<QueryParameterMatch>)

    /**
     * @param queryParameters The query parameters to match on.
     * All specified query parameters must match for the route to match.
     */
    public fun queryParameters(vararg queryParameters: QueryParameterMatch)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpRouteMatch.Builder =
        software.amazon.awscdk.services.appmesh.HttpRouteMatch.builder()

    /**
     * @param headers Specifies the client request headers to match on.
     * All specified headers
     * must match for the route to match.
     */
    override fun headers(headers: List<HeaderMatch>) {
      cdkBuilder.headers(headers.map(HeaderMatch::unwrap))
    }

    /**
     * @param headers Specifies the client request headers to match on.
     * All specified headers
     * must match for the route to match.
     */
    override fun headers(vararg headers: HeaderMatch): Unit = headers(headers.toList())

    /**
     * @param method The HTTP client request method to match on.
     */
    override fun method(method: HttpRouteMethod) {
      cdkBuilder.method(method.let(HttpRouteMethod::unwrap))
    }

    /**
     * @param path Specifies how is the request matched based on the path part of its URL.
     */
    override fun path(path: HttpRoutePathMatch) {
      cdkBuilder.path(path.let(HttpRoutePathMatch::unwrap))
    }

    /**
     * @param port The port to match from the request.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param protocol The client request protocol to match on.
     * Applicable only for HTTP2 routes.
     */
    override fun protocol(protocol: HttpRouteProtocol) {
      cdkBuilder.protocol(protocol.let(HttpRouteProtocol::unwrap))
    }

    /**
     * @param queryParameters The query parameters to match on.
     * All specified query parameters must match for the route to match.
     */
    override fun queryParameters(queryParameters: List<QueryParameterMatch>) {
      cdkBuilder.queryParameters(queryParameters.map(QueryParameterMatch::unwrap))
    }

    /**
     * @param queryParameters The query parameters to match on.
     * All specified query parameters must match for the route to match.
     */
    override fun queryParameters(vararg queryParameters: QueryParameterMatch): Unit =
        queryParameters(queryParameters.toList())

    public fun build(): software.amazon.awscdk.services.appmesh.HttpRouteMatch = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteMatch,
  ) : CdkObject(cdkObject), HttpRouteMatch {
    /**
     * Specifies the client request headers to match on.
     *
     * All specified headers
     * must match for the route to match.
     *
     * Default: - do not match on headers
     */
    override fun headers(): List<HeaderMatch> = unwrap(this).getHeaders()?.map(HeaderMatch::wrap) ?:
        emptyList()

    /**
     * The HTTP client request method to match on.
     *
     * Default: - do not match on request method
     */
    override fun method(): HttpRouteMethod? = unwrap(this).getMethod()?.let(HttpRouteMethod::wrap)

    /**
     * Specifies how is the request matched based on the path part of its URL.
     *
     * Default: - matches requests with all paths
     */
    override fun path(): HttpRoutePathMatch? = unwrap(this).getPath()?.let(HttpRoutePathMatch::wrap)

    /**
     * The port to match from the request.
     *
     * Default: - do not match on port
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The client request protocol to match on.
     *
     * Applicable only for HTTP2 routes.
     *
     * Default: - do not match on HTTP2 request protocol
     */
    override fun protocol(): HttpRouteProtocol? =
        unwrap(this).getProtocol()?.let(HttpRouteProtocol::wrap)

    /**
     * The query parameters to match on.
     *
     * All specified query parameters must match for the route to match.
     *
     * Default: - do not match on query parameters
     */
    override fun queryParameters(): List<QueryParameterMatch> =
        unwrap(this).getQueryParameters()?.map(QueryParameterMatch::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteMatch {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteMatch):
        HttpRouteMatch = CdkObjectWrappers.wrap(cdkObject) as? HttpRouteMatch ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteMatch):
        software.amazon.awscdk.services.appmesh.HttpRouteMatch = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.HttpRouteMatch
  }
}
