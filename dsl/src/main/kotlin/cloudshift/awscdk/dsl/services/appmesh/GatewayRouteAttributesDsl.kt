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
import software.amazon.awscdk.services.appmesh.GatewayRouteAttributes
import software.amazon.awscdk.services.appmesh.IVirtualGateway
import kotlin.String

@CdkDslMarker
public class GatewayRouteAttributesDsl {
    private val cdkBuilder: GatewayRouteAttributes.Builder = GatewayRouteAttributes.builder()

    public fun gatewayRouteName(gatewayRouteName: String) {
        cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    public fun virtualGateway(virtualGateway: IVirtualGateway) {
        cdkBuilder.virtualGateway(virtualGateway)
    }

    public fun build(): GatewayRouteAttributes = cdkBuilder.build()
}
