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
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig

/**
 * Configuration for gateway route host name match.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GatewayRouteHostnameMatchConfig gatewayRouteHostnameMatchConfig =
 * GatewayRouteHostnameMatchConfig.builder()
 * .hostnameMatch(GatewayRouteHostnameMatchProperty.builder()
 * .exact("exact")
 * .suffix("suffix")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class GatewayRouteHostnameMatchConfigDsl {
    private val cdkBuilder: GatewayRouteHostnameMatchConfig.Builder =
        GatewayRouteHostnameMatchConfig.builder()

    /** @param hostnameMatch GatewayRoute CFN configuration for host name match. */
    public fun hostnameMatch(
        hostnameMatch: CfnGatewayRouteGatewayRouteHostnameMatchPropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnGatewayRouteGatewayRouteHostnameMatchPropertyDsl()
        builder.apply(hostnameMatch)
        cdkBuilder.hostnameMatch(builder.build())
    }

    /** @param hostnameMatch GatewayRoute CFN configuration for host name match. */
    public fun hostnameMatch(hostnameMatch: CfnGatewayRoute.GatewayRouteHostnameMatchProperty) {
        cdkBuilder.hostnameMatch(hostnameMatch)
    }

    public fun build(): GatewayRouteHostnameMatchConfig = cdkBuilder.build()
}
