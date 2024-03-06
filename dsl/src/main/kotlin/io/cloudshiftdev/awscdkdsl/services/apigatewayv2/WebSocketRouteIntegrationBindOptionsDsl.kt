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
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions
import software.constructs.Construct

/**
 * Options to the WebSocketRouteIntegration during its bind operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * import software.constructs.*;
 * Construct construct;
 * WebSocketRoute webSocketRoute;
 * WebSocketRouteIntegrationBindOptions webSocketRouteIntegrationBindOptions =
 * WebSocketRouteIntegrationBindOptions.builder()
 * .route(webSocketRoute)
 * .scope(construct)
 * .build();
 * ```
 */
@CdkDslMarker
public class WebSocketRouteIntegrationBindOptionsDsl {
    private val cdkBuilder: WebSocketRouteIntegrationBindOptions.Builder =
        WebSocketRouteIntegrationBindOptions.builder()

    /** @param route The route to which this is being bound. */
    public fun route(route: IWebSocketRoute) {
        cdkBuilder.route(route)
    }

    /**
     * @param scope The current scope in which the bind is occurring. If the
     *   `WebSocketRouteIntegration` being bound creates additional constructs, this will be used as
     *   their parent scope.
     */
    public fun scope(scope: Construct) {
        cdkBuilder.scope(scope)
    }

    public fun build(): WebSocketRouteIntegrationBindOptions = cdkBuilder.build()
}
