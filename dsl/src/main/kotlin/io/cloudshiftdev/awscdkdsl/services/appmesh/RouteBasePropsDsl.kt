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

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.RouteBaseProps
import software.amazon.awscdk.services.appmesh.RouteSpec

/**
 * Base interface properties for all Routes.
 *
 * Example:
 * ```
 * VirtualRouter router;
 * VirtualNode node;
 * router.addRoute("route-http2-retry", RouteBaseProps.builder()
 * .routeSpec(RouteSpec.http2(HttpRouteSpecOptions.builder()
 * .weightedTargets(List.of(WeightedTarget.builder().virtualNode(node).build()))
 * .retryPolicy(HttpRetryPolicy.builder()
 * // Retry if the connection failed
 * .tcpRetryEvents(List.of(TcpRetryEvent.CONNECTION_ERROR))
 * // Retry if HTTP responds with a gateway error (502, 503, 504)
 * .httpRetryEvents(List.of(HttpRetryEvent.GATEWAY_ERROR))
 * // Retry five times
 * .retryAttempts(5)
 * // Use a 1 second timeout per retry
 * .retryTimeout(Duration.seconds(1))
 * .build())
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class RouteBasePropsDsl {
    private val cdkBuilder: RouteBaseProps.Builder = RouteBaseProps.builder()

    /** @param routeName The name of the route. */
    public fun routeName(routeName: String) {
        cdkBuilder.routeName(routeName)
    }

    /** @param routeSpec Protocol specific spec. */
    public fun routeSpec(routeSpec: RouteSpec) {
        cdkBuilder.routeSpec(routeSpec)
    }

    public fun build(): RouteBaseProps = cdkBuilder.build()
}
