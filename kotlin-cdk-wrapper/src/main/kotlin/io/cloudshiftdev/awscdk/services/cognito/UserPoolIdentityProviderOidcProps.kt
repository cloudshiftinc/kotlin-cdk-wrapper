@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties to initialize UserPoolIdentityProviderOidc.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * ProviderAttribute providerAttribute;
 * UserPool userPool;
 * UserPoolIdentityProviderOidcProps userPoolIdentityProviderOidcProps =
 * UserPoolIdentityProviderOidcProps.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .issuerUrl("issuerUrl")
 * .userPool(userPool)
 * // the properties below are optional
 * .attributeMapping(AttributeMapping.builder()
 * .address(providerAttribute)
 * .birthdate(providerAttribute)
 * .custom(Map.of(
 * "customKey", providerAttribute))
 * .email(providerAttribute)
 * .familyName(providerAttribute)
 * .fullname(providerAttribute)
 * .gender(providerAttribute)
 * .givenName(providerAttribute)
 * .lastUpdateTime(providerAttribute)
 * .locale(providerAttribute)
 * .middleName(providerAttribute)
 * .nickname(providerAttribute)
 * .phoneNumber(providerAttribute)
 * .preferredUsername(providerAttribute)
 * .profilePage(providerAttribute)
 * .profilePicture(providerAttribute)
 * .timezone(providerAttribute)
 * .website(providerAttribute)
 * .build())
 * .attributeRequestMethod(OidcAttributeRequestMethod.GET)
 * .endpoints(OidcEndpoints.builder()
 * .authorization("authorization")
 * .jwksUri("jwksUri")
 * .token("token")
 * .userInfo("userInfo")
 * .build())
 * .identifiers(List.of("identifiers"))
 * .name("name")
 * .scopes(List.of("scopes"))
 * .build();
 * ```
 */
public interface UserPoolIdentityProviderOidcProps : UserPoolIdentityProviderProps {
  /**
   * The method to use to request attributes.
   *
   * Default: OidcAttributeRequestMethod.GET
   */
  public fun attributeRequestMethod(): OidcAttributeRequestMethod? =
      unwrap(this).getAttributeRequestMethod()?.let(OidcAttributeRequestMethod::wrap)

  /**
   * The client id.
   */
  public fun clientId(): String

  /**
   * The client secret.
   */
  public fun clientSecret(): String

  /**
   * OpenID connect endpoints.
   *
   * Default: - auto discovered with issuer URL
   */
  public fun endpoints(): OidcEndpoints? = unwrap(this).getEndpoints()?.let(OidcEndpoints::wrap)

  /**
   * Identifiers.
   *
   * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
   *
   * Default: - no identifiers used
   */
  public fun identifiers(): List<String> = unwrap(this).getIdentifiers() ?: emptyList()

  /**
   * Issuer URL.
   */
  public fun issuerUrl(): String

  /**
   * The name of the provider.
   *
   * Default: - the unique ID of the construct
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are groups of OpenID
   * Connect user attributes to exchange with your app.
   *
   * Default: ['openid']
   */
  public fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

  /**
   * A builder for [UserPoolIdentityProviderOidcProps]
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
    @JvmName("25e89b7fefaa4ce1fbb91d0fdaba402251b851e019a720677c00946e095895bf")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    /**
     * @param attributeRequestMethod The method to use to request attributes.
     */
    public fun attributeRequestMethod(attributeRequestMethod: OidcAttributeRequestMethod)

    /**
     * @param clientId The client id. 
     */
    public fun clientId(clientId: String)

    /**
     * @param clientSecret The client secret. 
     */
    public fun clientSecret(clientSecret: String)

    /**
     * @param endpoints OpenID connect endpoints.
     */
    public fun endpoints(endpoints: OidcEndpoints)

    /**
     * @param endpoints OpenID connect endpoints.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00a796853f9e507218b68bee07f7a22e112a4867366616cfabb511165a47c5ee")
    public fun endpoints(endpoints: OidcEndpoints.Builder.() -> Unit)

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
     * @param issuerUrl Issuer URL. 
     */
    public fun issuerUrl(issuerUrl: String)

    /**
     * @param name The name of the provider.
     */
    public fun name(name: String)

    /**
     * @param scopes The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are
     * groups of OpenID Connect user attributes to exchange with your app.
     */
    public fun scopes(scopes: List<String>)

    /**
     * @param scopes The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are
     * groups of OpenID Connect user attributes to exchange with your app.
     */
    public fun scopes(vararg scopes: String)

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps.builder()

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
    @JvmName("25e89b7fefaa4ce1fbb91d0fdaba402251b851e019a720677c00946e095895bf")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    /**
     * @param attributeRequestMethod The method to use to request attributes.
     */
    override fun attributeRequestMethod(attributeRequestMethod: OidcAttributeRequestMethod) {
      cdkBuilder.attributeRequestMethod(attributeRequestMethod.let(OidcAttributeRequestMethod::unwrap))
    }

    /**
     * @param clientId The client id. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The client secret. 
     */
    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * @param endpoints OpenID connect endpoints.
     */
    override fun endpoints(endpoints: OidcEndpoints) {
      cdkBuilder.endpoints(endpoints.let(OidcEndpoints::unwrap))
    }

    /**
     * @param endpoints OpenID connect endpoints.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00a796853f9e507218b68bee07f7a22e112a4867366616cfabb511165a47c5ee")
    override fun endpoints(endpoints: OidcEndpoints.Builder.() -> Unit): Unit =
        endpoints(OidcEndpoints(endpoints))

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
     * @param issuerUrl Issuer URL. 
     */
    override fun issuerUrl(issuerUrl: String) {
      cdkBuilder.issuerUrl(issuerUrl)
    }

    /**
     * @param name The name of the provider.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param scopes The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are
     * groups of OpenID Connect user attributes to exchange with your app.
     */
    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    /**
     * @param scopes The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are
     * groups of OpenID Connect user attributes to exchange with your app.
     */
    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderOidcProps {
    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     */
    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    /**
     * The method to use to request attributes.
     *
     * Default: OidcAttributeRequestMethod.GET
     */
    override fun attributeRequestMethod(): OidcAttributeRequestMethod? =
        unwrap(this).getAttributeRequestMethod()?.let(OidcAttributeRequestMethod::wrap)

    /**
     * The client id.
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * The client secret.
     */
    override fun clientSecret(): String = unwrap(this).getClientSecret()

    /**
     * OpenID connect endpoints.
     *
     * Default: - auto discovered with issuer URL
     */
    override fun endpoints(): OidcEndpoints? = unwrap(this).getEndpoints()?.let(OidcEndpoints::wrap)

    /**
     * Identifiers.
     *
     * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
     *
     * Default: - no identifiers used
     */
    override fun identifiers(): List<String> = unwrap(this).getIdentifiers() ?: emptyList()

    /**
     * Issuer URL.
     */
    override fun issuerUrl(): String = unwrap(this).getIssuerUrl()

    /**
     * The name of the provider.
     *
     * Default: - the unique ID of the construct
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are groups of OpenID
     * Connect user attributes to exchange with your app.
     *
     * Default: ['openid']
     */
    override fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

    /**
     * The user pool to which this construct provides identities.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolIdentityProviderOidcProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps):
        UserPoolIdentityProviderOidcProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderOidcProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps
  }
}
