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
 * An object representing the gateway route host name to rewrite.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GatewayRouteHostnameRewriteProperty gatewayRouteHostnameRewriteProperty =
 * GatewayRouteHostnameRewriteProperty.builder()
 * .defaultTargetHostname("defaultTargetHostname")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutehostnamerewrite.html)
 */
@CdkDslMarker
public class CfnGatewayRouteGatewayRouteHostnameRewritePropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.GatewayRouteHostnameRewriteProperty.Builder =
        CfnGatewayRoute.GatewayRouteHostnameRewriteProperty.builder()

    /** @param defaultTargetHostname The default target host name to write to. */
    public fun defaultTargetHostname(defaultTargetHostname: String) {
        cdkBuilder.defaultTargetHostname(defaultTargetHostname)
    }

    public fun build(): CfnGatewayRoute.GatewayRouteHostnameRewriteProperty = cdkBuilder.build()
}
