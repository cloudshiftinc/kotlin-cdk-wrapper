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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration

/**
 * Options used when configuring multiple routes, at once.
 *
 * The options here are the ones that would be configured for all being set up.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * HttpRouteIntegration httpRouteIntegration;
 * BatchHttpRouteOptions batchHttpRouteOptions = BatchHttpRouteOptions.builder()
 * .integration(httpRouteIntegration)
 * .build();
 * ```
 */
@CdkDslMarker
public class BatchHttpRouteOptionsDsl {
    private val cdkBuilder: BatchHttpRouteOptions.Builder = BatchHttpRouteOptions.builder()

    /** @param integration The integration to be configured on this route. */
    public fun integration(integration: HttpRouteIntegration) {
        cdkBuilder.integration(integration)
    }

    public fun build(): BatchHttpRouteOptions = cdkBuilder.build()
}
