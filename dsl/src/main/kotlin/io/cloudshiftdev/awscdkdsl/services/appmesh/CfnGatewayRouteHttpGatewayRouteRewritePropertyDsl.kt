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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object representing the gateway route to rewrite.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpGatewayRouteRewriteProperty httpGatewayRouteRewriteProperty =
 * HttpGatewayRouteRewriteProperty.builder()
 * .hostname(GatewayRouteHostnameRewriteProperty.builder()
 * .defaultTargetHostname("defaultTargetHostname")
 * .build())
 * .path(HttpGatewayRoutePathRewriteProperty.builder()
 * .exact("exact")
 * .build())
 * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
 * .defaultPrefix("defaultPrefix")
 * .value("value")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouterewrite.html)
 */
@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRouteRewritePropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.HttpGatewayRouteRewriteProperty.Builder =
        CfnGatewayRoute.HttpGatewayRouteRewriteProperty.builder()

    /** @param hostname The host name to rewrite. */
    public fun hostname(hostname: IResolvable) {
        cdkBuilder.hostname(hostname)
    }

    /** @param hostname The host name to rewrite. */
    public fun hostname(hostname: CfnGatewayRoute.GatewayRouteHostnameRewriteProperty) {
        cdkBuilder.hostname(hostname)
    }

    /** @param path The path to rewrite. */
    public fun path(path: IResolvable) {
        cdkBuilder.path(path)
    }

    /** @param path The path to rewrite. */
    public fun path(path: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty) {
        cdkBuilder.path(path)
    }

    /** @param prefix The specified beginning characters to rewrite. */
    public fun prefix(prefix: IResolvable) {
        cdkBuilder.prefix(prefix)
    }

    /** @param prefix The specified beginning characters to rewrite. */
    public fun prefix(prefix: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnGatewayRoute.HttpGatewayRouteRewriteProperty = cdkBuilder.build()
}
