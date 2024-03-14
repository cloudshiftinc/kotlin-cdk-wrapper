package io.cloudshiftdev.awscdk.services.appsync

public enum class AuthorizationType(
  private val cdkObject: software.amazon.awscdk.services.appsync.AuthorizationType,
) {
  API_KEY(software.amazon.awscdk.services.appsync.AuthorizationType.API_KEY),
  IAM(software.amazon.awscdk.services.appsync.AuthorizationType.IAM),
  USER_POOL(software.amazon.awscdk.services.appsync.AuthorizationType.USER_POOL),
  OIDC(software.amazon.awscdk.services.appsync.AuthorizationType.OIDC),
  LAMBDA(software.amazon.awscdk.services.appsync.AuthorizationType.LAMBDA),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AuthorizationType):
        AuthorizationType = when (cdkObject) {
      software.amazon.awscdk.services.appsync.AuthorizationType.API_KEY -> AuthorizationType.API_KEY
      software.amazon.awscdk.services.appsync.AuthorizationType.IAM -> AuthorizationType.IAM
      software.amazon.awscdk.services.appsync.AuthorizationType.USER_POOL ->
          AuthorizationType.USER_POOL
      software.amazon.awscdk.services.appsync.AuthorizationType.OIDC -> AuthorizationType.OIDC
      software.amazon.awscdk.services.appsync.AuthorizationType.LAMBDA -> AuthorizationType.LAMBDA
    }

    internal fun unwrap(wrapped: AuthorizationType):
        software.amazon.awscdk.services.appsync.AuthorizationType = wrapped.cdkObject
  }
}
