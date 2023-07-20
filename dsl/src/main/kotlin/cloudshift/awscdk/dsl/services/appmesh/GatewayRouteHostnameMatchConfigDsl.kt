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
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig
import kotlin.Unit

@CdkDslMarker
public class GatewayRouteHostnameMatchConfigDsl {
    private val cdkBuilder: GatewayRouteHostnameMatchConfig.Builder =
        GatewayRouteHostnameMatchConfig.builder()

    public fun hostnameMatch(
        block: CfnGatewayRouteGatewayRouteHostnameMatchPropertyDsl.() -> Unit =
            {},
    ) {
        val builder = CfnGatewayRouteGatewayRouteHostnameMatchPropertyDsl()
        builder.apply(block)
        cdkBuilder.hostnameMatch(builder.build())
    }

    public fun hostnameMatch(hostnameMatch: CfnGatewayRoute.GatewayRouteHostnameMatchProperty) {
        cdkBuilder.hostnameMatch(hostnameMatch)
    }

    public fun build(): GatewayRouteHostnameMatchConfig = cdkBuilder.build()
}
