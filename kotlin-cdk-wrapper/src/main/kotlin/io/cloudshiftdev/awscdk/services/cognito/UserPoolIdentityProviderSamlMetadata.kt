@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Metadata for a SAML user pool identity provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * UserPoolIdentityProviderSamlMetadata userPoolIdentityProviderSamlMetadata =
 * UserPoolIdentityProviderSamlMetadata.file("fileContent");
 * ```
 */
public open class UserPoolIdentityProviderSamlMetadata(
  cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata,
) : CdkObject(cdkObject) {
  /**
   * A URL hosting SAML metadata, or the content of a file containing SAML metadata.
   */
  public open fun metadataContent(): String = unwrap(this).getMetadataContent()

  /**
   * The type of metadata, either a URL or file content.
   */
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
        wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata
  }
}
