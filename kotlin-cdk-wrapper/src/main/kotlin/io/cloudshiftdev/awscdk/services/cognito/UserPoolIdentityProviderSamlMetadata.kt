@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class UserPoolIdentityProviderSamlMetadata internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata,
) : CdkObject(cdkObject) {
  public open fun metadataContent(): String = unwrap(this).getMetadataContent()

  public open fun metadataType(): UserPoolIdentityProviderSamlMetadataType =
      unwrap(this).getMetadataType().let(UserPoolIdentityProviderSamlMetadataType::wrap)

  public companion object {
    public fun `file`(fileContent: String): UserPoolIdentityProviderSamlMetadata =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata.`file`(fileContent).let(UserPoolIdentityProviderSamlMetadata::wrap)

    public fun url(url: String): UserPoolIdentityProviderSamlMetadata =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata.url(url).let(UserPoolIdentityProviderSamlMetadata::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata):
        UserPoolIdentityProviderSamlMetadata = UserPoolIdentityProviderSamlMetadata(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderSamlMetadata):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata =
        wrapped.cdkObject
  }
}
