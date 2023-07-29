@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch
import software.amazon.awscdk.services.appmesh.HeaderMatch
import software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch
import software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch
import software.amazon.awscdk.services.appmesh.HttpRouteMethod
import software.amazon.awscdk.services.appmesh.QueryParameterMatch

/**
 * The criterion for determining a request match for this GatewayRoute.
 *
 * Example:
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
@CdkDslMarker
public class HttpGatewayRouteMatchDsl {
    private val cdkBuilder: HttpGatewayRouteMatch.Builder = HttpGatewayRouteMatch.builder()

    private val _headers: MutableList<HeaderMatch> = mutableListOf()

    private val _queryParameters: MutableList<QueryParameterMatch> = mutableListOf()

    /**
     * @param headers Specifies the client request headers to match on. All specified headers must
     *   match for the gateway route to match.
     */
    public fun headers(vararg headers: HeaderMatch) {
        _headers.addAll(listOf(*headers))
    }

    /**
     * @param headers Specifies the client request headers to match on. All specified headers must
     *   match for the gateway route to match.
     */
    public fun headers(headers: Collection<HeaderMatch>) {
        _headers.addAll(headers)
    }

    /** @param hostname The gateway route host name to be matched on. */
    public fun hostname(hostname: GatewayRouteHostnameMatch) {
        cdkBuilder.hostname(hostname)
    }

    /** @param method The method to match on. */
    public fun method(method: HttpRouteMethod) {
        cdkBuilder.method(method)
    }

    /** @param path Specify how to match requests based on the 'path' part of their URL. */
    public fun path(path: HttpGatewayRoutePathMatch) {
        cdkBuilder.path(path)
    }

    /** @param port The port number to match on. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param queryParameters The query parameters to match on. All specified query parameters must
     *   match for the route to match.
     */
    public fun queryParameters(vararg queryParameters: QueryParameterMatch) {
        _queryParameters.addAll(listOf(*queryParameters))
    }

    /**
     * @param queryParameters The query parameters to match on. All specified query parameters must
     *   match for the route to match.
     */
    public fun queryParameters(queryParameters: Collection<QueryParameterMatch>) {
        _queryParameters.addAll(queryParameters)
    }

    /**
     * @param rewriteRequestHostname When `true`, rewrites the original request received at the
     *   Virtual Gateway to the destination Virtual Service name. When `false`, retains the original
     *   hostname from the request.
     */
    public fun rewriteRequestHostname(rewriteRequestHostname: Boolean) {
        cdkBuilder.rewriteRequestHostname(rewriteRequestHostname)
    }

    public fun build(): HttpGatewayRouteMatch {
        if (_headers.isNotEmpty()) cdkBuilder.headers(_headers)
        if (_queryParameters.isNotEmpty()) cdkBuilder.queryParameters(_queryParameters)
        return cdkBuilder.build()
    }
}
