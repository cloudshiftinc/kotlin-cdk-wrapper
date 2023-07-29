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
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch
import software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions
import software.amazon.awscdk.services.appmesh.IVirtualService

/**
 * Properties specific for HTTP Based GatewayRoutes.
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
public class HttpGatewayRouteSpecOptionsDsl {
    private val cdkBuilder: HttpGatewayRouteSpecOptions.Builder =
        HttpGatewayRouteSpecOptions.builder()

    /**
     * @param match The criterion for determining a request match for this GatewayRoute. When path
     *   match is defined, this may optionally determine the path rewrite configuration.
     */
    public fun match(match: HttpGatewayRouteMatchDsl.() -> Unit = {}) {
        val builder = HttpGatewayRouteMatchDsl()
        builder.apply(match)
        cdkBuilder.match(builder.build())
    }

    /**
     * @param match The criterion for determining a request match for this GatewayRoute. When path
     *   match is defined, this may optionally determine the path rewrite configuration.
     */
    public fun match(match: HttpGatewayRouteMatch) {
        cdkBuilder.match(match)
    }

    /**
     * @param priority The priority for the gateway route. When a Virtual Gateway has multiple
     *   gateway routes, gateway route match is performed in the order of specified value, where 0
     *   is the highest priority, and first matched gateway route is selected.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /** @param routeTarget The VirtualService this GatewayRoute directs traffic to. */
    public fun routeTarget(routeTarget: IVirtualService) {
        cdkBuilder.routeTarget(routeTarget)
    }

    public fun build(): HttpGatewayRouteSpecOptions = cdkBuilder.build()
}
