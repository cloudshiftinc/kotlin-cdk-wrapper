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
import software.amazon.awscdk.services.appmesh.GatewayRouteAttributes
import software.amazon.awscdk.services.appmesh.IVirtualGateway

/**
 * Interface with properties necessary to import a reusable GatewayRoute.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGateway virtualGateway;
 * GatewayRouteAttributes gatewayRouteAttributes = GatewayRouteAttributes.builder()
 * .gatewayRouteName("gatewayRouteName")
 * .virtualGateway(virtualGateway)
 * .build();
 * ```
 */
@CdkDslMarker
public class GatewayRouteAttributesDsl {
    private val cdkBuilder: GatewayRouteAttributes.Builder = GatewayRouteAttributes.builder()

    /** @param gatewayRouteName The name of the GatewayRoute. */
    public fun gatewayRouteName(gatewayRouteName: String) {
        cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    /** @param virtualGateway The VirtualGateway this GatewayRoute is associated with. */
    public fun virtualGateway(virtualGateway: IVirtualGateway) {
        cdkBuilder.virtualGateway(virtualGateway)
    }

    public fun build(): GatewayRouteAttributes = cdkBuilder.build()
}
