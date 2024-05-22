@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

/**
 * The criterion for determining a request match for this GatewayRoute.
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
public interface HttpGatewayRouteMatch {
  /**
   * Specifies the client request headers to match on.
   *
   * All specified headers
   * must match for the gateway route to match.
   *
   * Default: - do not match on headers
   */
  public fun headers(): List<HeaderMatch> = unwrap(this).getHeaders()?.map(HeaderMatch::wrap) ?:
      emptyList()

  /**
   * The gateway route host name to be matched on.
   *
   * Default: - do not match on host name
   */
  public fun hostname(): GatewayRouteHostnameMatch? =
      unwrap(this).getHostname()?.let(GatewayRouteHostnameMatch::wrap)

  /**
   * The method to match on.
   *
   * Default: - do not match on method
   */
  public fun method(): HttpRouteMethod? = unwrap(this).getMethod()?.let(HttpRouteMethod::wrap)

  /**
   * Specify how to match requests based on the 'path' part of their URL.
   *
   * Default: - matches requests with any path
   */
  public fun path(): HttpGatewayRoutePathMatch? =
      unwrap(this).getPath()?.let(HttpGatewayRoutePathMatch::wrap)

  /**
   * The port number to match on.
   *
   * Default: - no default port
   */
  public fun port(): Number? = unwrap(this).getPort()

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
   * When `true`, rewrites the original request received at the Virtual Gateway to the destination
   * Virtual Service name.
   *
   * When `false`, retains the original hostname from the request.
   *
   * Default: true
   */
  public fun rewriteRequestHostname(): Boolean? = unwrap(this).getRewriteRequestHostname()

  /**
   * A builder for [HttpGatewayRouteMatch]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param headers Specifies the client request headers to match on.
     * All specified headers
     * must match for the gateway route to match.
     */
    public fun headers(headers: List<HeaderMatch>)

    /**
     * @param headers Specifies the client request headers to match on.
     * All specified headers
     * must match for the gateway route to match.
     */
    public fun headers(vararg headers: HeaderMatch)

    /**
     * @param hostname The gateway route host name to be matched on.
     */
    public fun hostname(hostname: GatewayRouteHostnameMatch)

    /**
     * @param method The method to match on.
     */
    public fun method(method: HttpRouteMethod)

    /**
     * @param path Specify how to match requests based on the 'path' part of their URL.
     */
    public fun path(path: HttpGatewayRoutePathMatch)

    /**
     * @param port The port number to match on.
     */
    public fun port(port: Number)

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

    /**
     * @param rewriteRequestHostname When `true`, rewrites the original request received at the
     * Virtual Gateway to the destination Virtual Service name.
     * When `false`, retains the original hostname from the request.
     */
    public fun rewriteRequestHostname(rewriteRequestHostname: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch.Builder =
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch.builder()

    /**
     * @param headers Specifies the client request headers to match on.
     * All specified headers
     * must match for the gateway route to match.
     */
    override fun headers(headers: List<HeaderMatch>) {
      cdkBuilder.headers(headers.map(HeaderMatch.Companion::unwrap))
    }

    /**
     * @param headers Specifies the client request headers to match on.
     * All specified headers
     * must match for the gateway route to match.
     */
    override fun headers(vararg headers: HeaderMatch): Unit = headers(headers.toList())

    /**
     * @param hostname The gateway route host name to be matched on.
     */
    override fun hostname(hostname: GatewayRouteHostnameMatch) {
      cdkBuilder.hostname(hostname.let(GatewayRouteHostnameMatch.Companion::unwrap))
    }

    /**
     * @param method The method to match on.
     */
    override fun method(method: HttpRouteMethod) {
      cdkBuilder.method(method.let(HttpRouteMethod.Companion::unwrap))
    }

    /**
     * @param path Specify how to match requests based on the 'path' part of their URL.
     */
    override fun path(path: HttpGatewayRoutePathMatch) {
      cdkBuilder.path(path.let(HttpGatewayRoutePathMatch.Companion::unwrap))
    }

    /**
     * @param port The port number to match on.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param queryParameters The query parameters to match on.
     * All specified query parameters must match for the route to match.
     */
    override fun queryParameters(queryParameters: List<QueryParameterMatch>) {
      cdkBuilder.queryParameters(queryParameters.map(QueryParameterMatch.Companion::unwrap))
    }

    /**
     * @param queryParameters The query parameters to match on.
     * All specified query parameters must match for the route to match.
     */
    override fun queryParameters(vararg queryParameters: QueryParameterMatch): Unit =
        queryParameters(queryParameters.toList())

    /**
     * @param rewriteRequestHostname When `true`, rewrites the original request received at the
     * Virtual Gateway to the destination Virtual Service name.
     * When `false`, retains the original hostname from the request.
     */
    override fun rewriteRequestHostname(rewriteRequestHostname: Boolean) {
      cdkBuilder.rewriteRequestHostname(rewriteRequestHostname)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch,
  ) : CdkObject(cdkObject), HttpGatewayRouteMatch {
    /**
     * Specifies the client request headers to match on.
     *
     * All specified headers
     * must match for the gateway route to match.
     *
     * Default: - do not match on headers
     */
    override fun headers(): List<HeaderMatch> = unwrap(this).getHeaders()?.map(HeaderMatch::wrap) ?:
        emptyList()

    /**
     * The gateway route host name to be matched on.
     *
     * Default: - do not match on host name
     */
    override fun hostname(): GatewayRouteHostnameMatch? =
        unwrap(this).getHostname()?.let(GatewayRouteHostnameMatch::wrap)

    /**
     * The method to match on.
     *
     * Default: - do not match on method
     */
    override fun method(): HttpRouteMethod? = unwrap(this).getMethod()?.let(HttpRouteMethod::wrap)

    /**
     * Specify how to match requests based on the 'path' part of their URL.
     *
     * Default: - matches requests with any path
     */
    override fun path(): HttpGatewayRoutePathMatch? =
        unwrap(this).getPath()?.let(HttpGatewayRoutePathMatch::wrap)

    /**
     * The port number to match on.
     *
     * Default: - no default port
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The query parameters to match on.
     *
     * All specified query parameters must match for the route to match.
     *
     * Default: - do not match on query parameters
     */
    override fun queryParameters(): List<QueryParameterMatch> =
        unwrap(this).getQueryParameters()?.map(QueryParameterMatch::wrap) ?: emptyList()

    /**
     * When `true`, rewrites the original request received at the Virtual Gateway to the destination
     * Virtual Service name.
     *
     * When `false`, retains the original hostname from the request.
     *
     * Default: true
     */
    override fun rewriteRequestHostname(): Boolean? = unwrap(this).getRewriteRequestHostname()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteMatch {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch):
        HttpGatewayRouteMatch = CdkObjectWrappers.wrap(cdkObject) as? HttpGatewayRouteMatch ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpGatewayRouteMatch):
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch
  }
}
