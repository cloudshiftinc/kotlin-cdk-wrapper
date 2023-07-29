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
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object that represents the virtual service that traffic is routed to.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GatewayRouteVirtualServiceProperty gatewayRouteVirtualServiceProperty =
 * GatewayRouteVirtualServiceProperty.builder()
 * .virtualServiceName("virtualServiceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutevirtualservice.html)
 */
@CdkDslMarker
public class CfnGatewayRouteGatewayRouteVirtualServicePropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.GatewayRouteVirtualServiceProperty.Builder =
        CfnGatewayRoute.GatewayRouteVirtualServiceProperty.builder()

    /** @param virtualServiceName The name of the virtual service that traffic is routed to. */
    public fun virtualServiceName(virtualServiceName: String) {
        cdkBuilder.virtualServiceName(virtualServiceName)
    }

    public fun build(): CfnGatewayRoute.GatewayRouteVirtualServiceProperty = cdkBuilder.build()
}
