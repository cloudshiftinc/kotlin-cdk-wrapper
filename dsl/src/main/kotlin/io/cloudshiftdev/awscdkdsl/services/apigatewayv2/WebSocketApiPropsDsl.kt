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
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression
import software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions

/**
 * Props for WebSocket API.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer;
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
 * // This function handles your auth logic
 * Function authHandler;
 * // This function handles your WebSocket requests
 * Function handler;
 * WebSocketLambdaAuthorizer authorizer = new WebSocketLambdaAuthorizer("Authorizer", authHandler);
 * WebSocketLambdaIntegration integration = new WebSocketLambdaIntegration("Integration", handler);
 * WebSocketApi.Builder.create(this, "WebSocketApi")
 * .connectRouteOptions(WebSocketRouteOptions.builder()
 * .integration(integration)
 * .authorizer(authorizer)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class WebSocketApiPropsDsl {
    private val cdkBuilder: WebSocketApiProps.Builder = WebSocketApiProps.builder()

    /**
     * @param apiKeySelectionExpression An API key selection expression. Providing this option will
     *   require an API Key be provided to access the API.
     */
    public fun apiKeySelectionExpression(
        apiKeySelectionExpression: WebSocketApiKeySelectionExpression
    ) {
        cdkBuilder.apiKeySelectionExpression(apiKeySelectionExpression)
    }

    /** @param apiName Name for the WebSocket API resource. */
    public fun apiName(apiName: String) {
        cdkBuilder.apiName(apiName)
    }

    /** @param connectRouteOptions Options to configure a '$connect' route. */
    public fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptionsDsl.() -> Unit = {}) {
        val builder = WebSocketRouteOptionsDsl()
        builder.apply(connectRouteOptions)
        cdkBuilder.connectRouteOptions(builder.build())
    }

    /** @param connectRouteOptions Options to configure a '$connect' route. */
    public fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions) {
        cdkBuilder.connectRouteOptions(connectRouteOptions)
    }

    /** @param defaultRouteOptions Options to configure a '$default' route. */
    public fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptionsDsl.() -> Unit = {}) {
        val builder = WebSocketRouteOptionsDsl()
        builder.apply(defaultRouteOptions)
        cdkBuilder.defaultRouteOptions(builder.build())
    }

    /** @param defaultRouteOptions Options to configure a '$default' route. */
    public fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions) {
        cdkBuilder.defaultRouteOptions(defaultRouteOptions)
    }

    /** @param description The description of the API. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param disconnectRouteOptions Options to configure a '$disconnect' route. */
    public fun disconnectRouteOptions(
        disconnectRouteOptions: WebSocketRouteOptionsDsl.() -> Unit = {}
    ) {
        val builder = WebSocketRouteOptionsDsl()
        builder.apply(disconnectRouteOptions)
        cdkBuilder.disconnectRouteOptions(builder.build())
    }

    /** @param disconnectRouteOptions Options to configure a '$disconnect' route. */
    public fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions) {
        cdkBuilder.disconnectRouteOptions(disconnectRouteOptions)
    }

    /** @param routeSelectionExpression The route selection expression for the API. */
    public fun routeSelectionExpression(routeSelectionExpression: String) {
        cdkBuilder.routeSelectionExpression(routeSelectionExpression)
    }

    public fun build(): WebSocketApiProps = cdkBuilder.build()
}
