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
import software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps
import software.amazon.awscdk.services.appmesh.GatewayRouteSpec

/**
 * Basic configuration properties for a GatewayRoute.
 *
 * Example:
 * ```
 * VirtualGateway gateway;
 * VirtualService virtualService;
 * gateway.addGatewayRoute("gateway-route-grpc", GatewayRouteBaseProps.builder()
 * .routeSpec(GatewayRouteSpec.grpc(GrpcGatewayRouteSpecOptions.builder()
 * .routeTarget(virtualService)
 * .match(GrpcGatewayRouteMatch.builder()
 * .hostname(GatewayRouteHostnameMatch.exactly("example.com"))
 * // This disables the default rewrite to virtual service name and retain original request.
 * .rewriteRequestHostname(false)
 * .build())
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class GatewayRouteBasePropsDsl {
    private val cdkBuilder: GatewayRouteBaseProps.Builder = GatewayRouteBaseProps.builder()

    /** @param gatewayRouteName The name of the GatewayRoute. */
    public fun gatewayRouteName(gatewayRouteName: String) {
        cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    /** @param routeSpec What protocol the route uses. */
    public fun routeSpec(routeSpec: GatewayRouteSpec) {
        cdkBuilder.routeSpec(routeSpec)
    }

    public fun build(): GatewayRouteBaseProps = cdkBuilder.build()
}
