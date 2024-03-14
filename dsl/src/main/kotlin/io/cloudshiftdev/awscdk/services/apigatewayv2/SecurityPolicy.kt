package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class SecurityPolicy(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.SecurityPolicy,
) {
  TLS_1_0(software.amazon.awscdk.services.apigatewayv2.SecurityPolicy.TLS_1_0),
  TLS_1_2(software.amazon.awscdk.services.apigatewayv2.SecurityPolicy.TLS_1_2),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.SecurityPolicy):
        SecurityPolicy = when (cdkObject) {
      software.amazon.awscdk.services.apigatewayv2.SecurityPolicy.TLS_1_0 -> SecurityPolicy.TLS_1_0
      software.amazon.awscdk.services.apigatewayv2.SecurityPolicy.TLS_1_2 -> SecurityPolicy.TLS_1_2
    }

    internal fun unwrap(wrapped: SecurityPolicy):
        software.amazon.awscdk.services.apigatewayv2.SecurityPolicy = wrapped.cdkObject
  }
}
