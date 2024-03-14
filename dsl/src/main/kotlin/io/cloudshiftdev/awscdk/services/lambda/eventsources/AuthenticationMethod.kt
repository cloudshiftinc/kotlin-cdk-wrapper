package io.cloudshiftdev.awscdk.services.lambda.eventsources

public enum class AuthenticationMethod(
  private val cdkObject: software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod,
) {
  SASL_SCRAM_512_AUTH(software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod.SASL_SCRAM_512_AUTH),
  SASL_SCRAM_256_AUTH(software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod.SASL_SCRAM_256_AUTH),
  BASIC_AUTH(software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod.BASIC_AUTH),
  CLIENT_CERTIFICATE_TLS_AUTH(software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod.CLIENT_CERTIFICATE_TLS_AUTH),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod):
        AuthenticationMethod = when (cdkObject) {
      software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod.SASL_SCRAM_512_AUTH ->
          AuthenticationMethod.SASL_SCRAM_512_AUTH
      software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod.SASL_SCRAM_256_AUTH ->
          AuthenticationMethod.SASL_SCRAM_256_AUTH
      software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod.BASIC_AUTH ->
          AuthenticationMethod.BASIC_AUTH
      software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod.CLIENT_CERTIFICATE_TLS_AUTH ->
          AuthenticationMethod.CLIENT_CERTIFICATE_TLS_AUTH
    }

    internal fun unwrap(wrapped: AuthenticationMethod):
        software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod = wrapped.cdkObject
  }
}
