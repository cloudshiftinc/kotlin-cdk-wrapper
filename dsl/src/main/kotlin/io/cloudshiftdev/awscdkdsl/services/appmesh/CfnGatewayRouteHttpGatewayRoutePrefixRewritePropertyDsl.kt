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
 * An object representing the beginning characters of the route to rewrite.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpGatewayRoutePrefixRewriteProperty httpGatewayRoutePrefixRewriteProperty =
 * HttpGatewayRoutePrefixRewriteProperty.builder()
 * .defaultPrefix("defaultPrefix")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteprefixrewrite.html)
 */
@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRoutePrefixRewritePropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.Builder =
        CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.builder()

    /**
     * @param defaultPrefix The default prefix used to replace the incoming route prefix when
     *   rewritten.
     */
    public fun defaultPrefix(defaultPrefix: String) {
        cdkBuilder.defaultPrefix(defaultPrefix)
    }

    /** @param value The value used to replace the incoming route prefix when rewritten. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty = cdkBuilder.build()
}
