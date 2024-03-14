package io.cloudshiftdev.awscdk.services.apigateway

public enum class SecurityPolicy(
  private val cdkObject: software.amazon.awscdk.services.apigateway.SecurityPolicy,
) {
  TLS_1_0(software.amazon.awscdk.services.apigateway.SecurityPolicy.TLS_1_0),
  TLS_1_2(software.amazon.awscdk.services.apigateway.SecurityPolicy.TLS_1_2),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.SecurityPolicy):
        SecurityPolicy = when (cdkObject) {
      software.amazon.awscdk.services.apigateway.SecurityPolicy.TLS_1_0 -> SecurityPolicy.TLS_1_0
      software.amazon.awscdk.services.apigateway.SecurityPolicy.TLS_1_2 -> SecurityPolicy.TLS_1_2
    }

    internal fun unwrap(wrapped: SecurityPolicy):
        software.amazon.awscdk.services.apigateway.SecurityPolicy = wrapped.cdkObject
  }
}
