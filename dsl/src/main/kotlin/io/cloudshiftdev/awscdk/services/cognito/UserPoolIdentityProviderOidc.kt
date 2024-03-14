package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPoolIdentityProviderOidc internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc,
) : Resource(cdkObject), IUserPoolIdentityProvider {
  /**
   * The primary identifier of this identity provider.
   */
  public override fun providerName(): String = unwrap(this).getProviderName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.UserPoolIdentityProviderOidc].
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
    @JvmName("603595185306f3cbe3b150f2d42508de726dc0a43008589c4ee2fb5565eac7f6")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    /**
     * The method to use to request attributes.
     *
     * Default: OidcAttributeRequestMethod.GET
     *
     * @param attributeRequestMethod The method to use to request attributes. 
     */
    public fun attributeRequestMethod(attributeRequestMethod: OidcAttributeRequestMethod)

    /**
     * The client id.
     *
     * @param clientId The client id. 
     */
    public fun clientId(clientId: String)

    /**
     * The client secret.
     *
     * @param clientSecret The client secret. 
     */
    public fun clientSecret(clientSecret: String)

    /**
     * OpenID connect endpoints.
     *
     * Default: - auto discovered with issuer URL
     *
     * @param endpoints OpenID connect endpoints. 
     */
    public fun endpoints(endpoints: OidcEndpoints)

    /**
     * OpenID connect endpoints.
     *
     * Default: - auto discovered with issuer URL
     *
     * @param endpoints OpenID connect endpoints. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47ba295429bf4c0b6cf598bc197daa092bdec752210ec00b61c23f978b2e181c")
    public fun endpoints(endpoints: OidcEndpoints.Builder.() -> Unit)

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
     * Issuer URL.
     *
     * @param issuerUrl Issuer URL. 
     */
    public fun issuerUrl(issuerUrl: String)

    /**
     * The name of the provider.
     *
     * Default: - the unique ID of the construct
     *
     * @param name The name of the provider. 
     */
    public fun name(name: String)

    /**
     * The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are groups of OpenID
     * Connect user attributes to exchange with your app.
     *
     * Default: ['openid']
     *
     * @param scopes The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are
     * groups of OpenID Connect user attributes to exchange with your app. 
     */
    public fun scopes(scopes: List<String>)

    /**
     * The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are groups of OpenID
     * Connect user attributes to exchange with your app.
     *
     * Default: ['openid']
     *
     * @param scopes The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are
     * groups of OpenID Connect user attributes to exchange with your app. 
     */
    public fun scopes(vararg scopes: String)

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
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc.Builder.create(scope,
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
    @JvmName("603595185306f3cbe3b150f2d42508de726dc0a43008589c4ee2fb5565eac7f6")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    /**
     * The method to use to request attributes.
     *
     * Default: OidcAttributeRequestMethod.GET
     *
     * @param attributeRequestMethod The method to use to request attributes. 
     */
    override fun attributeRequestMethod(attributeRequestMethod: OidcAttributeRequestMethod) {
      cdkBuilder.attributeRequestMethod(attributeRequestMethod.let(OidcAttributeRequestMethod::unwrap))
    }

    /**
     * The client id.
     *
     * @param clientId The client id. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * The client secret.
     *
     * @param clientSecret The client secret. 
     */
    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * OpenID connect endpoints.
     *
     * Default: - auto discovered with issuer URL
     *
     * @param endpoints OpenID connect endpoints. 
     */
    override fun endpoints(endpoints: OidcEndpoints) {
      cdkBuilder.endpoints(endpoints.let(OidcEndpoints::unwrap))
    }

    /**
     * OpenID connect endpoints.
     *
     * Default: - auto discovered with issuer URL
     *
     * @param endpoints OpenID connect endpoints. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47ba295429bf4c0b6cf598bc197daa092bdec752210ec00b61c23f978b2e181c")
    override fun endpoints(endpoints: OidcEndpoints.Builder.() -> Unit): Unit =
        endpoints(OidcEndpoints(endpoints))

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
     * Issuer URL.
     *
     * @param issuerUrl Issuer URL. 
     */
    override fun issuerUrl(issuerUrl: String) {
      cdkBuilder.issuerUrl(issuerUrl)
    }

    /**
     * The name of the provider.
     *
     * Default: - the unique ID of the construct
     *
     * @param name The name of the provider. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are groups of OpenID
     * Connect user attributes to exchange with your app.
     *
     * Default: ['openid']
     *
     * @param scopes The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are
     * groups of OpenID Connect user attributes to exchange with your app. 
     */
    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    /**
     * The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are groups of OpenID
     * Connect user attributes to exchange with your app.
     *
     * Default: ['openid']
     *
     * @param scopes The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are
     * groups of OpenID Connect user attributes to exchange with your app. 
     */
    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    /**
     * The user pool to which this construct provides identities.
     *
     * @param userPool The user pool to which this construct provides identities. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolIdentityProviderOidc {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolIdentityProviderOidc(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc):
        UserPoolIdentityProviderOidc = UserPoolIdentityProviderOidc(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderOidc):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc = wrapped.cdkObject
  }
}
