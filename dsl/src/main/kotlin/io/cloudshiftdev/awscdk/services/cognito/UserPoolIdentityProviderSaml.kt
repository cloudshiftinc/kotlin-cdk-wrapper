package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPoolIdentityProviderSaml internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml,
) : Resource(cdkObject), IUserPoolIdentityProvider {
  /**
   * The primary identifier of this identity provider.
   */
  public override fun providerName(): String = unwrap(this).getProviderName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.UserPoolIdentityProviderSaml].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     *
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool. 
     */
    public fun attributeMapping(attributeMapping: AttributeMapping)

    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     *
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3771ad72297d21014e17d52c30c5f392224535d2f3ee940dc37713e13e6ce65")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    /**
     * Identifiers.
     *
     * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
     *
     * Default: - no identifiers used
     *
     * @param identifiers Identifiers. 
     */
    public fun identifiers(identifiers: List<String>)

    /**
     * Identifiers.
     *
     * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
     *
     * Default: - no identifiers used
     *
     * @param identifiers Identifiers. 
     */
    public fun identifiers(vararg identifiers: String)

    /**
     * Whether to enable the "Sign-out flow" feature.
     *
     * Default: - false
     *
     * @param idpSignout Whether to enable the "Sign-out flow" feature. 
     */
    public fun idpSignout(idpSignout: Boolean)

    /**
     * The SAML metadata.
     *
     * @param metadata The SAML metadata. 
     */
    public fun metadata(metadata: UserPoolIdentityProviderSamlMetadata)

    /**
     * The name of the provider.
     *
     * Must be between 3 and 32 characters.
     *
     * Default: - the unique ID of the construct
     *
     * @param name The name of the provider. 
     */
    public fun name(name: String)

    /**
     * The user pool to which this construct provides identities.
     *
     * @param userPool The user pool to which this construct provides identities. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml.Builder.create(scope,
        id)

    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     *
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool. 
     */
    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     *
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3771ad72297d21014e17d52c30c5f392224535d2f3ee940dc37713e13e6ce65")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    /**
     * Identifiers.
     *
     * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
     *
     * Default: - no identifiers used
     *
     * @param identifiers Identifiers. 
     */
    override fun identifiers(identifiers: List<String>) {
      cdkBuilder.identifiers(identifiers)
    }

    /**
     * Identifiers.
     *
     * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
     *
     * Default: - no identifiers used
     *
     * @param identifiers Identifiers. 
     */
    override fun identifiers(vararg identifiers: String): Unit = identifiers(identifiers.toList())

    /**
     * Whether to enable the "Sign-out flow" feature.
     *
     * Default: - false
     *
     * @param idpSignout Whether to enable the "Sign-out flow" feature. 
     */
    override fun idpSignout(idpSignout: Boolean) {
      cdkBuilder.idpSignout(idpSignout)
    }

    /**
     * The SAML metadata.
     *
     * @param metadata The SAML metadata. 
     */
    override fun metadata(metadata: UserPoolIdentityProviderSamlMetadata) {
      cdkBuilder.metadata(metadata.let(UserPoolIdentityProviderSamlMetadata::unwrap))
    }

    /**
     * The name of the provider.
     *
     * Must be between 3 and 32 characters.
     *
     * Default: - the unique ID of the construct
     *
     * @param name The name of the provider. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The user pool to which this construct provides identities.
     *
     * @param userPool The user pool to which this construct provides identities. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolIdentityProviderSaml {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolIdentityProviderSaml(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml):
        UserPoolIdentityProviderSaml = UserPoolIdentityProviderSaml(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderSaml):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml = wrapped.cdkObject
  }
}
