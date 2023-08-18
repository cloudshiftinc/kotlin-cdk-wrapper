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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object that represents the query parameter in the request.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * QueryParameterProperty queryParameterProperty = QueryParameterProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .match(HttpQueryParameterMatchProperty.builder()
 * .exact("exact")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-queryparameter.html)
 */
@CdkDslMarker
public class CfnGatewayRouteQueryParameterPropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.QueryParameterProperty.Builder =
        CfnGatewayRoute.QueryParameterProperty.builder()

    /** @param match The query parameter to match on. */
    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    /** @param match The query parameter to match on. */
    public fun match(match: CfnGatewayRoute.HttpQueryParameterMatchProperty) {
        cdkBuilder.match(match)
    }

    /** @param name A name for the query parameter that will be matched on. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnGatewayRoute.QueryParameterProperty = cdkBuilder.build()
}
