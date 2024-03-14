package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class WebSocketApiKeySelectionExpression internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression,
) : CdkObject(cdkObject) {
  /**
   * The expression used by API Gateway.
   */
  public open fun customApiKeySelector(): String = unwrap(this).getCustomApiKeySelector()

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression):
        WebSocketApiKeySelectionExpression = WebSocketApiKeySelectionExpression(cdkObject)

    internal fun unwrap(wrapped: WebSocketApiKeySelectionExpression):
        software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression =
        wrapped.cdkObject
  }
}
