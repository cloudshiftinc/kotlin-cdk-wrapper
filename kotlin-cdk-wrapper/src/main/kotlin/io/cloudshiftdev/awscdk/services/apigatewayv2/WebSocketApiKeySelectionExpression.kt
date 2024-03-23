@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Represents the currently available API Key Selection Expressions.
 *
 * Example:
 *
 * ```
 * WebSocketApi webSocketApi = WebSocketApi.Builder.create(this, "mywsapi")
 * .apiKeySelectionExpression(WebSocketApiKeySelectionExpression.HEADER_X_API_KEY)
 * .build();
 * ```
 */
public open class WebSocketApiKeySelectionExpression(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression,
) : CdkObject(cdkObject) {
  public constructor(customApiKeySelector: String) :
      this(software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression(customApiKeySelector)
  )

  /**
   * The expression used by API Gateway.
   */
  public open fun customApiKeySelector(): String = unwrap(this).getCustomApiKeySelector()

  public companion object {
    public val AUTHORIZER_USAGE_IDENTIFIER_KEY: WebSocketApiKeySelectionExpression =
        WebSocketApiKeySelectionExpression.wrap(software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression.AUTHORIZER_USAGE_IDENTIFIER_KEY)

    public val HEADER_X_API_KEY: WebSocketApiKeySelectionExpression =
        WebSocketApiKeySelectionExpression.wrap(software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression.HEADER_X_API_KEY)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression):
        WebSocketApiKeySelectionExpression = WebSocketApiKeySelectionExpression(cdkObject)

    internal fun unwrap(wrapped: WebSocketApiKeySelectionExpression):
        software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression =
        wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketApiKeySelectionExpression
  }
}
