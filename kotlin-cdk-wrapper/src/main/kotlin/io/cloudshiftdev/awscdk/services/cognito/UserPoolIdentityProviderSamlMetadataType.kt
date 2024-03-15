@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

public enum class UserPoolIdentityProviderSamlMetadataType(
  private val cdkObject:
      software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadataType,
) {
  URL(software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadataType.URL),
  FILE(software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadataType.FILE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadataType):
        UserPoolIdentityProviderSamlMetadataType = when (cdkObject) {
      software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadataType.URL ->
          UserPoolIdentityProviderSamlMetadataType.URL
      software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadataType.FILE ->
          UserPoolIdentityProviderSamlMetadataType.FILE
    }

    internal fun unwrap(wrapped: UserPoolIdentityProviderSamlMetadataType):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadataType =
        wrapped.cdkObject
  }
}
