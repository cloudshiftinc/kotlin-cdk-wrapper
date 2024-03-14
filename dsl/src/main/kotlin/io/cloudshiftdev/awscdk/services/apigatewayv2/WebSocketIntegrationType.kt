package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class WebSocketIntegrationType(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType,
) {
  AWS_PROXY(software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType.AWS_PROXY),
  MOCK(software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType.MOCK),
  AWS(software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType.AWS),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType):
        WebSocketIntegrationType = when (cdkObject) {
      software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType.AWS_PROXY ->
          WebSocketIntegrationType.AWS_PROXY
      software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType.MOCK ->
          WebSocketIntegrationType.MOCK
      software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType.AWS ->
          WebSocketIntegrationType.AWS
    }

    internal fun unwrap(wrapped: WebSocketIntegrationType):
        software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType = wrapped.cdkObject
  }
}
