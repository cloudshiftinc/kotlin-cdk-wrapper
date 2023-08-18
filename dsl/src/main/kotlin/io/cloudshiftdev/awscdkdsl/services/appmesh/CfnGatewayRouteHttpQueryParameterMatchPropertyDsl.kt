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
 * An object representing the query parameter to match.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpQueryParameterMatchProperty httpQueryParameterMatchProperty =
 * HttpQueryParameterMatchProperty.builder()
 * .exact("exact")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpqueryparametermatch.html)
 */
@CdkDslMarker
public class CfnGatewayRouteHttpQueryParameterMatchPropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.HttpQueryParameterMatchProperty.Builder =
        CfnGatewayRoute.HttpQueryParameterMatchProperty.builder()

    /** @param exact The exact query parameter to match on. */
    public fun exact(exact: String) {
        cdkBuilder.exact(exact)
    }

    public fun build(): CfnGatewayRoute.HttpQueryParameterMatchProperty = cdkBuilder.build()
}
