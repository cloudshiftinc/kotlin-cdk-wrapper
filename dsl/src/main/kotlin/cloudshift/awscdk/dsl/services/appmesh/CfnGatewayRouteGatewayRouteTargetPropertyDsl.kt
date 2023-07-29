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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object that represents a gateway route target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GatewayRouteTargetProperty gatewayRouteTargetProperty = GatewayRouteTargetProperty.builder()
 * .virtualService(GatewayRouteVirtualServiceProperty.builder()
 * .virtualServiceName("virtualServiceName")
 * .build())
 * // the properties below are optional
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutetarget.html)
 */
@CdkDslMarker
public class CfnGatewayRouteGatewayRouteTargetPropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.GatewayRouteTargetProperty.Builder =
        CfnGatewayRoute.GatewayRouteTargetProperty.builder()

    /** @param port The port number of the gateway route target. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param virtualService An object that represents a virtual service gateway route target. */
    public fun virtualService(virtualService: IResolvable) {
        cdkBuilder.virtualService(virtualService)
    }

    /** @param virtualService An object that represents a virtual service gateway route target. */
    public fun virtualService(virtualService: CfnGatewayRoute.GatewayRouteVirtualServiceProperty) {
        cdkBuilder.virtualService(virtualService)
    }

    public fun build(): CfnGatewayRoute.GatewayRouteTargetProperty = cdkBuilder.build()
}
