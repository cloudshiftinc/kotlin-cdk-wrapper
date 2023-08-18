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
import software.amazon.awscdk.services.appmesh.CfnRoute

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpqueryparametermatch.html)
 */
@CdkDslMarker
public class CfnRouteHttpQueryParameterMatchPropertyDsl {
    private val cdkBuilder: CfnRoute.HttpQueryParameterMatchProperty.Builder =
        CfnRoute.HttpQueryParameterMatchProperty.builder()

    /** @param exact The exact query parameter to match on. */
    public fun exact(exact: String) {
        cdkBuilder.exact(exact)
    }

    public fun build(): CfnRoute.HttpQueryParameterMatchProperty = cdkBuilder.build()
}
