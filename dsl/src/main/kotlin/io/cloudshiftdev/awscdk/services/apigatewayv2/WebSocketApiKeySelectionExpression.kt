package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String

public open class WebSocketApiKeySelectionExpression
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression,
) {
    /** The expression used by API Gateway. */
    public open fun customApiKeySelector(): String = unwrap(this).getCustomApiKeySelector()

    public companion object {
        init {}

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression
        ): WebSocketApiKeySelectionExpression = WebSocketApiKeySelectionExpression(cdkObject)

        internal fun unwrap(
            wrapped: WebSocketApiKeySelectionExpression
        ): software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression =
            wrapped.cdkObject
    }
}
