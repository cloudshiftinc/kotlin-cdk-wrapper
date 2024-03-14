package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class AuthorizerPayloadVersion(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.AuthorizerPayloadVersion,
) {
  VERSION_1_0(software.amazon.awscdk.services.apigatewayv2.AuthorizerPayloadVersion.VERSION_1_0),
  VERSION_2_0(software.amazon.awscdk.services.apigatewayv2.AuthorizerPayloadVersion.VERSION_2_0),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.AuthorizerPayloadVersion):
        AuthorizerPayloadVersion = when (cdkObject) {
      software.amazon.awscdk.services.apigatewayv2.AuthorizerPayloadVersion.VERSION_1_0 ->
          AuthorizerPayloadVersion.VERSION_1_0
      software.amazon.awscdk.services.apigatewayv2.AuthorizerPayloadVersion.VERSION_2_0 ->
          AuthorizerPayloadVersion.VERSION_2_0
    }

    internal fun unwrap(wrapped: AuthorizerPayloadVersion):
        software.amazon.awscdk.services.apigatewayv2.AuthorizerPayloadVersion = wrapped.cdkObject
  }
}
