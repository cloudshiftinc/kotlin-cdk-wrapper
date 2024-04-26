@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties to initialize UserPoolIdentityProviderSaml.
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
public interface UserPoolIdentityProviderSamlProps : UserPoolIdentityProviderProps {
  /**
   * Whether to require encrypted SAML assertions from IdP.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-SAML-signing-encryption.html#cognito-user-pools-SAML-encryption)
   */
  public fun encryptedResponses(): Boolean? = unwrap(this).getEncryptedResponses()

  /**
   * Identifiers.
   *
   * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
   *
   * Default: - no identifiers used
   */
  public fun identifiers(): List<String> = unwrap(this).getIdentifiers() ?: emptyList()

  /**
   * Whether to enable IdP-initiated SAML auth flows.
   *
   * Default: false
   */
  public fun idpInitiated(): Boolean? = unwrap(this).getIdpInitiated()

  /**
   * Whether to enable the "Sign-out flow" feature.
   *
   * Default: - false
   */
  public fun idpSignout(): Boolean? = unwrap(this).getIdpSignout()

  /**
   * The SAML metadata.
   */
  public fun metadata(): UserPoolIdentityProviderSamlMetadata

  /**
   * The name of the provider.
   *
   * Must be between 3 and 32 characters.
   *
   * Default: - the unique ID of the construct
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The signing algorithm for SAML requests.
   *
   * Default: - don't sign requests
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-SAML-signing-encryption.html#cognito-user-pools-SAML-signing)
   */
  public fun requestSigningAlgorithm(): SigningAlgorithm? =
      unwrap(this).getRequestSigningAlgorithm()?.let(SigningAlgorithm::wrap)

  /**
   * A builder for [UserPoolIdentityProviderSamlProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool.
     */
    public fun attributeMapping(attributeMapping: AttributeMapping)

    /**
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f249519be5b5218935deb62a01e70e9328388781333df34109754790e1f63c43")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    /**
     * @param encryptedResponses Whether to require encrypted SAML assertions from IdP.
     */
    public fun encryptedResponses(encryptedResponses: Boolean)

    /**
     * @param identifiers Identifiers.
     * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
     */
    public fun identifiers(identifiers: List<String>)

    /**
     * @param identifiers Identifiers.
     * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
     */
    public fun identifiers(vararg identifiers: String)

    /**
     * @param idpInitiated Whether to enable IdP-initiated SAML auth flows.
     */
    public fun idpInitiated(idpInitiated: Boolean)

    /**
     * @param idpSignout Whether to enable the "Sign-out flow" feature.
     */
    public fun idpSignout(idpSignout: Boolean)

    /**
     * @param metadata The SAML metadata. 
     */
    public fun metadata(metadata: UserPoolIdentityProviderSamlMetadata)

    /**
     * @param name The name of the provider.
     * Must be between 3 and 32 characters.
     */
    public fun name(name: String)

    /**
     * @param requestSigningAlgorithm The signing algorithm for SAML requests.
     */
    public fun requestSigningAlgorithm(requestSigningAlgorithm: SigningAlgorithm)

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps.builder()

    /**
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool.
     */
    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    /**
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f249519be5b5218935deb62a01e70e9328388781333df34109754790e1f63c43")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    /**
     * @param encryptedResponses Whether to require encrypted SAML assertions from IdP.
     */
    override fun encryptedResponses(encryptedResponses: Boolean) {
      cdkBuilder.encryptedResponses(encryptedResponses)
    }

    /**
     * @param identifiers Identifiers.
     * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
     */
    override fun identifiers(identifiers: List<String>) {
      cdkBuilder.identifiers(identifiers)
    }

    /**
     * @param identifiers Identifiers.
     * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
     */
    override fun identifiers(vararg identifiers: String): Unit = identifiers(identifiers.toList())

    /**
     * @param idpInitiated Whether to enable IdP-initiated SAML auth flows.
     */
    override fun idpInitiated(idpInitiated: Boolean) {
      cdkBuilder.idpInitiated(idpInitiated)
    }

    /**
     * @param idpSignout Whether to enable the "Sign-out flow" feature.
     */
    override fun idpSignout(idpSignout: Boolean) {
      cdkBuilder.idpSignout(idpSignout)
    }

    /**
     * @param metadata The SAML metadata. 
     */
    override fun metadata(metadata: UserPoolIdentityProviderSamlMetadata) {
      cdkBuilder.metadata(metadata.let(UserPoolIdentityProviderSamlMetadata::unwrap))
    }

    /**
     * @param name The name of the provider.
     * Must be between 3 and 32 characters.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param requestSigningAlgorithm The signing algorithm for SAML requests.
     */
    override fun requestSigningAlgorithm(requestSigningAlgorithm: SigningAlgorithm) {
      cdkBuilder.requestSigningAlgorithm(requestSigningAlgorithm.let(SigningAlgorithm::unwrap))
    }

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderSamlProps {
    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     */
    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    /**
     * Whether to require encrypted SAML assertions from IdP.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-SAML-signing-encryption.html#cognito-user-pools-SAML-encryption)
     */
    override fun encryptedResponses(): Boolean? = unwrap(this).getEncryptedResponses()

    /**
     * Identifiers.
     *
     * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
     *
     * Default: - no identifiers used
     */
    override fun identifiers(): List<String> = unwrap(this).getIdentifiers() ?: emptyList()

    /**
     * Whether to enable IdP-initiated SAML auth flows.
     *
     * Default: false
     */
    override fun idpInitiated(): Boolean? = unwrap(this).getIdpInitiated()

    /**
     * Whether to enable the "Sign-out flow" feature.
     *
     * Default: - false
     */
    override fun idpSignout(): Boolean? = unwrap(this).getIdpSignout()

    /**
     * The SAML metadata.
     */
    override fun metadata(): UserPoolIdentityProviderSamlMetadata =
        unwrap(this).getMetadata().let(UserPoolIdentityProviderSamlMetadata::wrap)

    /**
     * The name of the provider.
     *
     * Must be between 3 and 32 characters.
     *
     * Default: - the unique ID of the construct
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The signing algorithm for SAML requests.
     *
     * Default: - don't sign requests
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-SAML-signing-encryption.html#cognito-user-pools-SAML-signing)
     */
    override fun requestSigningAlgorithm(): SigningAlgorithm? =
        unwrap(this).getRequestSigningAlgorithm()?.let(SigningAlgorithm::wrap)

    /**
     * The user pool to which this construct provides identities.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolIdentityProviderSamlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps):
        UserPoolIdentityProviderSamlProps = CdkObjectWrappers.wrap(cdkObject) as?
        UserPoolIdentityProviderSamlProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderSamlProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps
  }
}
