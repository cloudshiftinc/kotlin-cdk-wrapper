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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.IWebSocketApi
import software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer
import software.amazon.awscdk.services.apigatewayv2.WebSocketRoute
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegration
import software.constructs.Construct

/**
 * Route class that creates the Route for API Gateway WebSocket API.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * WebSocketApi webSocketApi;
 * IWebSocketRouteAuthorizer webSocketRouteAuthorizer;
 * WebSocketRouteIntegration webSocketRouteIntegration;
 * WebSocketRoute webSocketRoute = WebSocketRoute.Builder.create(this, "MyWebSocketRoute")
 * .integration(webSocketRouteIntegration)
 * .routeKey("routeKey")
 * .webSocketApi(webSocketApi)
 * // the properties below are optional
 * .apiKeyRequired(false)
 * .authorizer(webSocketRouteAuthorizer)
 * .returnResponse(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class WebSocketRouteDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: WebSocketRoute.Builder = WebSocketRoute.Builder.create(scope, id)

    /**
     * Whether the route requires an API Key to be provided.
     *
     * Default: false
     *
     * @param apiKeyRequired Whether the route requires an API Key to be provided.
     */
    public fun apiKeyRequired(apiKeyRequired: Boolean) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * The authorize to this route.
     *
     * You can only set authorizer to a $connect route.
     *
     * Default: - No Authorizer
     *
     * @param authorizer The authorize to this route.
     */
    public fun authorizer(authorizer: IWebSocketRouteAuthorizer) {
        cdkBuilder.authorizer(authorizer)
    }

    /**
     * The integration to be configured on this route.
     *
     * @param integration The integration to be configured on this route.
     */
    public fun integration(integration: WebSocketRouteIntegration) {
        cdkBuilder.integration(integration)
    }

    /**
     * Should the route send a response to the client.
     *
     * Default: false
     *
     * @param returnResponse Should the route send a response to the client.
     */
    public fun returnResponse(returnResponse: Boolean) {
        cdkBuilder.returnResponse(returnResponse)
    }

    /**
     * The key to this route.
     *
     * @param routeKey The key to this route.
     */
    public fun routeKey(routeKey: String) {
        cdkBuilder.routeKey(routeKey)
    }

    /**
     * The API the route is associated with.
     *
     * @param webSocketApi The API the route is associated with.
     */
    public fun webSocketApi(webSocketApi: IWebSocketApi) {
        cdkBuilder.webSocketApi(webSocketApi)
    }

    public fun build(): WebSocketRoute = cdkBuilder.build()
}
