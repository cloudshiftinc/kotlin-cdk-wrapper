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
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegration
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps

/**
 * Properties to initialize a new Route.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * WebSocketApi webSocketApi;
 * IWebSocketRouteAuthorizer webSocketRouteAuthorizer;
 * WebSocketRouteIntegration webSocketRouteIntegration;
 * WebSocketRouteProps webSocketRouteProps = WebSocketRouteProps.builder()
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
public class WebSocketRoutePropsDsl {
    private val cdkBuilder: WebSocketRouteProps.Builder = WebSocketRouteProps.builder()

    /** @param apiKeyRequired Whether the route requires an API Key to be provided. */
    public fun apiKeyRequired(apiKeyRequired: Boolean) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * @param authorizer The authorize to this route. You can only set authorizer to a $connect
     *   route.
     */
    public fun authorizer(authorizer: IWebSocketRouteAuthorizer) {
        cdkBuilder.authorizer(authorizer)
    }

    /** @param integration The integration to be configured on this route. */
    public fun integration(integration: WebSocketRouteIntegration) {
        cdkBuilder.integration(integration)
    }

    /** @param returnResponse Should the route send a response to the client. */
    public fun returnResponse(returnResponse: Boolean) {
        cdkBuilder.returnResponse(returnResponse)
    }

    /** @param routeKey The key to this route. */
    public fun routeKey(routeKey: String) {
        cdkBuilder.routeKey(routeKey)
    }

    /** @param webSocketApi The API the route is associated with. */
    public fun webSocketApi(webSocketApi: IWebSocketApi) {
        cdkBuilder.webSocketApi(webSocketApi)
    }

    public fun build(): WebSocketRouteProps = cdkBuilder.build()
}
