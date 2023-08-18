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
 * An object that represents the path to rewrite.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpGatewayRoutePathRewriteProperty httpGatewayRoutePathRewriteProperty =
 * HttpGatewayRoutePathRewriteProperty.builder()
 * .exact("exact")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutepathrewrite.html)
 */
@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRoutePathRewritePropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.Builder =
        CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.builder()

    /** @param exact The exact path to rewrite. */
    public fun exact(exact: String) {
        cdkBuilder.exact(exact)
    }

    public fun build(): CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty = cdkBuilder.build()
}
