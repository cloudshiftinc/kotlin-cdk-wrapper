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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object that represents the gateway route to rewrite.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GrpcGatewayRouteRewriteProperty grpcGatewayRouteRewriteProperty =
 * GrpcGatewayRouteRewriteProperty.builder()
 * .hostname(GatewayRouteHostnameRewriteProperty.builder()
 * .defaultTargetHostname("defaultTargetHostname")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayrouterewrite.html)
 */
@CdkDslMarker
public class CfnGatewayRouteGrpcGatewayRouteRewritePropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.GrpcGatewayRouteRewriteProperty.Builder =
        CfnGatewayRoute.GrpcGatewayRouteRewriteProperty.builder()

    /** @param hostname The host name of the gateway route to rewrite. */
    public fun hostname(hostname: IResolvable) {
        cdkBuilder.hostname(hostname)
    }

    /** @param hostname The host name of the gateway route to rewrite. */
    public fun hostname(hostname: CfnGatewayRoute.GatewayRouteHostnameRewriteProperty) {
        cdkBuilder.hostname(hostname)
    }

    public fun build(): CfnGatewayRoute.GrpcGatewayRouteRewriteProperty = cdkBuilder.build()
}
