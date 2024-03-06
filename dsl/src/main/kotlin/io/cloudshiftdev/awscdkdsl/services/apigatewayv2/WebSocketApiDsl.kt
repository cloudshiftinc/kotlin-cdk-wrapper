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
import software.amazon.awscdk.services.apigatewayv2.WebSocketApi
import software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions
import software.constructs.Construct

/**
 * Create a new API Gateway WebSocket API endpoint.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
 * Function messageHandler;
 * WebSocketApi webSocketApi = new WebSocketApi(this, "mywsapi");
 * WebSocketStage.Builder.create(this, "mystage")
 * .webSocketApi(webSocketApi)
 * .stageName("dev")
 * .autoDeploy(true)
 * .build();
 * webSocketApi.addRoute("sendMessage", WebSocketRouteOptions.builder()
 * .integration(new WebSocketLambdaIntegration("SendMessageIntegration", messageHandler))
 * .build());
 * ```
 */
@CdkDslMarker
public class WebSocketApiDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: WebSocketApi.Builder = WebSocketApi.Builder.create(scope, id)

    /**
     * An API key selection expression.
     *
     * Providing this option will require an API Key be provided to access the API.
     *
     * Default: - Key is not required to access these APIs
     *
     * @param apiKeySelectionExpression An API key selection expression.
     */
    public fun apiKeySelectionExpression(
        apiKeySelectionExpression: WebSocketApiKeySelectionExpression
    ) {
        cdkBuilder.apiKeySelectionExpression(apiKeySelectionExpression)
    }

    /**
     * Name for the WebSocket API resource.
     *
     * Default: - id of the WebSocketApi construct.
     *
     * @param apiName Name for the WebSocket API resource.
     */
    public fun apiName(apiName: String) {
        cdkBuilder.apiName(apiName)
    }

    /**
     * Options to configure a '$connect' route.
     *
     * Default: - no '$connect' route configured
     *
     * @param connectRouteOptions Options to configure a '$connect' route.
     */
    public fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptionsDsl.() -> Unit = {}) {
        val builder = WebSocketRouteOptionsDsl()
        builder.apply(connectRouteOptions)
        cdkBuilder.connectRouteOptions(builder.build())
    }

    /**
     * Options to configure a '$connect' route.
     *
     * Default: - no '$connect' route configured
     *
     * @param connectRouteOptions Options to configure a '$connect' route.
     */
    public fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions) {
        cdkBuilder.connectRouteOptions(connectRouteOptions)
    }

    /**
     * Options to configure a '$default' route.
     *
     * Default: - no '$default' route configured
     *
     * @param defaultRouteOptions Options to configure a '$default' route.
     */
    public fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptionsDsl.() -> Unit = {}) {
        val builder = WebSocketRouteOptionsDsl()
        builder.apply(defaultRouteOptions)
        cdkBuilder.defaultRouteOptions(builder.build())
    }

    /**
     * Options to configure a '$default' route.
     *
     * Default: - no '$default' route configured
     *
     * @param defaultRouteOptions Options to configure a '$default' route.
     */
    public fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions) {
        cdkBuilder.defaultRouteOptions(defaultRouteOptions)
    }

    /**
     * The description of the API.
     *
     * Default: - none
     *
     * @param description The description of the API.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Options to configure a '$disconnect' route.
     *
     * Default: - no '$disconnect' route configured
     *
     * @param disconnectRouteOptions Options to configure a '$disconnect' route.
     */
    public fun disconnectRouteOptions(
        disconnectRouteOptions: WebSocketRouteOptionsDsl.() -> Unit = {}
    ) {
        val builder = WebSocketRouteOptionsDsl()
        builder.apply(disconnectRouteOptions)
        cdkBuilder.disconnectRouteOptions(builder.build())
    }

    /**
     * Options to configure a '$disconnect' route.
     *
     * Default: - no '$disconnect' route configured
     *
     * @param disconnectRouteOptions Options to configure a '$disconnect' route.
     */
    public fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions) {
        cdkBuilder.disconnectRouteOptions(disconnectRouteOptions)
    }

    /**
     * The route selection expression for the API.
     *
     * Default: '$request.body.action'
     *
     * @param routeSelectionExpression The route selection expression for the API.
     */
    public fun routeSelectionExpression(routeSelectionExpression: String) {
        cdkBuilder.routeSelectionExpression(routeSelectionExpression)
    }

    public fun build(): WebSocketApi = cdkBuilder.build()
}
