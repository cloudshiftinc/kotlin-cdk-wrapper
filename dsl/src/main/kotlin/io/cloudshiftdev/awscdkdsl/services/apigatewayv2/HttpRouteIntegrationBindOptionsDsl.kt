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
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions
import software.amazon.awscdk.services.apigatewayv2.IHttpRoute
import software.constructs.Construct

/**
 * Options to the HttpRouteIntegration during its bind operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * import software.constructs.*;
 * Construct construct;
 * HttpRoute httpRoute;
 * HttpRouteIntegrationBindOptions httpRouteIntegrationBindOptions =
 * HttpRouteIntegrationBindOptions.builder()
 * .route(httpRoute)
 * .scope(construct)
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpRouteIntegrationBindOptionsDsl {
    private val cdkBuilder: HttpRouteIntegrationBindOptions.Builder =
        HttpRouteIntegrationBindOptions.builder()

    /** @param route The route to which this is being bound. */
    public fun route(route: IHttpRoute) {
        cdkBuilder.route(route)
    }

    /**
     * @param scope The current scope in which the bind is occurring. If the `HttpRouteIntegration`
     *   being bound creates additional constructs, this will be used as their parent scope.
     */
    public fun scope(scope: Construct) {
        cdkBuilder.scope(scope)
    }

    public fun build(): HttpRouteIntegrationBindOptions = cdkBuilder.build()
}
