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
import software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps
import software.amazon.awscdk.services.appmesh.GatewayRouteSpec
import kotlin.String

@CdkDslMarker
public class GatewayRouteBasePropsDsl {
    private val cdkBuilder: GatewayRouteBaseProps.Builder = GatewayRouteBaseProps.builder()

    public fun gatewayRouteName(gatewayRouteName: String) {
        cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    public fun routeSpec(routeSpec: GatewayRouteSpec) {
        cdkBuilder.routeSpec(routeSpec)
    }

    public fun build(): GatewayRouteBaseProps = cdkBuilder.build()
}
