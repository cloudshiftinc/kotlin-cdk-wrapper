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
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object representing the gateway route host name to match.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GatewayRouteHostnameMatchProperty gatewayRouteHostnameMatchProperty =
 * GatewayRouteHostnameMatchProperty.builder()
 * .exact("exact")
 * .suffix("suffix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutehostnamematch.html)
 */
@CdkDslMarker
public class CfnGatewayRouteGatewayRouteHostnameMatchPropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.GatewayRouteHostnameMatchProperty.Builder =
        CfnGatewayRoute.GatewayRouteHostnameMatchProperty.builder()

    /** @param exact The exact host name to match on. */
    public fun exact(exact: String) {
        cdkBuilder.exact(exact)
    }

    /** @param suffix The specified ending characters of the host name to match on. */
    public fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
    }

    public fun build(): CfnGatewayRoute.GatewayRouteHostnameMatchProperty = cdkBuilder.build()
}
