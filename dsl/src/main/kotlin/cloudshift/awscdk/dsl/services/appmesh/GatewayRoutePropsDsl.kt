@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.GatewayRouteProps
import software.amazon.awscdk.services.appmesh.GatewayRouteSpec
import software.amazon.awscdk.services.appmesh.IVirtualGateway
import kotlin.String

@CdkDslMarker
public class GatewayRoutePropsDsl {
    private val cdkBuilder: GatewayRouteProps.Builder = GatewayRouteProps.builder()

    public fun gatewayRouteName(gatewayRouteName: String) {
        cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    public fun routeSpec(routeSpec: GatewayRouteSpec) {
        cdkBuilder.routeSpec(routeSpec)
    }

    public fun virtualGateway(virtualGateway: IVirtualGateway) {
        cdkBuilder.virtualGateway(virtualGateway)
    }

    public fun build(): GatewayRouteProps = cdkBuilder.build()
}
