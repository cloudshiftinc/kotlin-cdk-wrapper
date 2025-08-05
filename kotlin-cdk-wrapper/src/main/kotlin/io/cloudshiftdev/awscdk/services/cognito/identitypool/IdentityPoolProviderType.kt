@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

public enum class IdentityPoolProviderType(
  private val cdkObject:
      software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType,
) {
  FACEBOOK(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.FACEBOOK),
  GOOGLE(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.GOOGLE),
  AMAZON(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.AMAZON),
  APPLE(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.APPLE),
  TWITTER(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.TWITTER),
  OPEN_ID(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.OPEN_ID),
  SAML(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.SAML),
  USER_POOL(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.USER_POOL),
  CUSTOM(software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.CUSTOM),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType):
        IdentityPoolProviderType = when (cdkObject) {
      software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.FACEBOOK ->
          IdentityPoolProviderType.FACEBOOK
      software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.GOOGLE ->
          IdentityPoolProviderType.GOOGLE
      software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.AMAZON ->
          IdentityPoolProviderType.AMAZON
      software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.APPLE ->
          IdentityPoolProviderType.APPLE
      software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.TWITTER ->
          IdentityPoolProviderType.TWITTER
      software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.OPEN_ID ->
          IdentityPoolProviderType.OPEN_ID
      software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.SAML ->
          IdentityPoolProviderType.SAML
      software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.USER_POOL ->
          IdentityPoolProviderType.USER_POOL
      software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType.CUSTOM ->
          IdentityPoolProviderType.CUSTOM
    }

    internal fun unwrap(wrapped: IdentityPoolProviderType):
        software.amazon.awscdk.services.cognito.identitypool.IdentityPoolProviderType =
        wrapped.cdkObject
  }
}
