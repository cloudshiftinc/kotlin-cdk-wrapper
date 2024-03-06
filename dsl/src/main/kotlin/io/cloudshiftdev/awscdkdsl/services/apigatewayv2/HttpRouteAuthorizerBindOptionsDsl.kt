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
import software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions
import software.amazon.awscdk.services.apigatewayv2.IHttpRoute
import software.constructs.Construct

/**
 * Input to the bind() operation, that binds an authorizer to a route.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * import software.constructs.*;
 * Construct construct;
 * HttpRoute httpRoute;
 * HttpRouteAuthorizerBindOptions httpRouteAuthorizerBindOptions =
 * HttpRouteAuthorizerBindOptions.builder()
 * .route(httpRoute)
 * .scope(construct)
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpRouteAuthorizerBindOptionsDsl {
    private val cdkBuilder: HttpRouteAuthorizerBindOptions.Builder =
        HttpRouteAuthorizerBindOptions.builder()

    /** @param route The route to which the authorizer is being bound. */
    public fun route(route: IHttpRoute) {
        cdkBuilder.route(route)
    }

    /** @param scope The scope for any constructs created as part of the bind. */
    public fun scope(scope: Construct) {
        cdkBuilder.scope(scope)
    }

    public fun build(): HttpRouteAuthorizerBindOptions = cdkBuilder.build()
}
