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
import software.amazon.awscdk.services.apigatewayv2.IWebSocketRoute
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions
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
 * WebSocketRoute webSocketRoute;
 * WebSocketRouteAuthorizerBindOptions webSocketRouteAuthorizerBindOptions =
 * WebSocketRouteAuthorizerBindOptions.builder()
 * .route(webSocketRoute)
 * .scope(construct)
 * .build();
 * ```
 */
@CdkDslMarker
public class WebSocketRouteAuthorizerBindOptionsDsl {
    private val cdkBuilder: WebSocketRouteAuthorizerBindOptions.Builder =
        WebSocketRouteAuthorizerBindOptions.builder()

    /** @param route The route to which the authorizer is being bound. */
    public fun route(route: IWebSocketRoute) {
        cdkBuilder.route(route)
    }

    /** @param scope The scope for any constructs created as part of the bind. */
    public fun scope(scope: Construct) {
        cdkBuilder.scope(scope)
    }

    public fun build(): WebSocketRouteAuthorizerBindOptions = cdkBuilder.build()
}
