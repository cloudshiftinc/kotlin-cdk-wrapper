package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String

public open class UserPoolIdentityProviderSamlMetadata
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata,
) {
    /** A URL hosting SAML metadata, or the content of a file containing SAML metadata. */
    public open fun metadataContent(): String = unwrap(this).getMetadataContent()

    /** The type of metadata, either a URL or file content. */
    public open fun metadataType(): UserPoolIdentityProviderSamlMetadataType =
        unwrap(this).getMetadataType().let(UserPoolIdentityProviderSamlMetadataType::wrap)

    public companion object {
        public fun `file`(fileContent: String): UserPoolIdentityProviderSamlMetadata =
            software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata.`file`(
                    fileContent
                )
                .let(UserPoolIdentityProviderSamlMetadata::wrap)

        public fun url(url: String): UserPoolIdentityProviderSamlMetadata =
            software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata.url(url)
                .let(UserPoolIdentityProviderSamlMetadata::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata
        ): UserPoolIdentityProviderSamlMetadata = UserPoolIdentityProviderSamlMetadata(cdkObject)

        internal fun unwrap(
            wrapped: UserPoolIdentityProviderSamlMetadata
        ): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata =
            wrapped.cdkObject
    }
}
