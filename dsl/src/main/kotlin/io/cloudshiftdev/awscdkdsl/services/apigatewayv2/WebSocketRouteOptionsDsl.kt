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
import software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegration
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions

/**
 * Options used to add route to the API.
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
public class WebSocketRouteOptionsDsl {
    private val cdkBuilder: WebSocketRouteOptions.Builder = WebSocketRouteOptions.builder()

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

    public fun build(): WebSocketRouteOptions = cdkBuilder.build()
}
