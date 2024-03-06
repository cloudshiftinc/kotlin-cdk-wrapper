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
import software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes

/**
 * Attributes for importing a WebSocketApi into the CDK.
 *
 * Example:
 * ```
 * IWebSocketApi webSocketApi = WebSocketApi.fromWebSocketApiAttributes(this, "mywsapi",
 * WebSocketApiAttributes.builder().webSocketId("api-1234").build());
 * ```
 */
@CdkDslMarker
public class WebSocketApiAttributesDsl {
    private val cdkBuilder: WebSocketApiAttributes.Builder = WebSocketApiAttributes.builder()

    /** @param apiEndpoint The endpoint URL of the WebSocketApi. */
    public fun apiEndpoint(apiEndpoint: String) {
        cdkBuilder.apiEndpoint(apiEndpoint)
    }

    /** @param webSocketId The identifier of the WebSocketApi. */
    public fun webSocketId(webSocketId: String) {
        cdkBuilder.webSocketId(webSocketId)
    }

    public fun build(): WebSocketApiAttributes = cdkBuilder.build()
}
