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
 * UserPool userpool = new UserPool(this, "Pool");
 * // specify the metadata as a file content
 * // specify the metadata as a file content
 * UserPoolIdentityProviderSaml.Builder.create(this, "userpoolIdpFile")
 * .userPool(userpool)
 * .metadata(UserPoolIdentityProviderSamlMetadata.file("my-file-contents"))
 * // Whether to require encrypted SAML assertions from IdP
 * .encryptedResponses(true)
 * // The signing algorithm for the SAML requests
 * .requestSigningAlgorithm(SigningAlgorithm.RSA_SHA256)
 * // Enable IdP initiated SAML auth flow
 * .idpInitiated(true)
 * .build();
 * // specify the metadata as a URL
 * // specify the metadata as a URL
 * UserPoolIdentityProviderSaml.Builder.create(this, "userpoolidpUrl")
 * .userPool(userpool)
 * .metadata(UserPoolIdentityProviderSamlMetadata.url("https://my-metadata-url.com"))
 * .build();
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
