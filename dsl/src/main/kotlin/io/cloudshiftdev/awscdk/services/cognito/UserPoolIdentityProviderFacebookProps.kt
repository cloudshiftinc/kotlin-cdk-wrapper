package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface UserPoolIdentityProviderFacebookProps : UserPoolIdentityProviderProps {
  /**
   * The Facebook API version to use.
   *
   * Default: - to the oldest version supported by Facebook
   */
  public fun apiVersion(): String? = unwrap(this).getApiVersion()

  /**
   * The client id recognized by Facebook APIs.
   */
  public fun clientId(): String

  /**
   * The client secret to be accompanied with clientId for Facebook to authenticate the client.
   *
   * [Documentation](https://developers.facebook.com/docs/facebook-login/security#appsecret)
   */
  public fun clientSecret(): String

  /**
   * The list of Facebook permissions to obtain for getting access to the Facebook profile.
   *
   * Default: [ public_profile ]
   *
   * [Documentation](https://developers.facebook.com/docs/facebook-login/permissions)
   */
  public fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

  /**
   * A builder for [UserPoolIdentityProviderFacebookProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiVersion The Facebook API version to use.
     */
    public fun apiVersion(apiVersion: String)

    /**
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool.
     */
    public fun attributeMapping(attributeMapping: AttributeMapping)

    /**
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4dc76dff7b9004e248a5d779d2272bc82b692f8b8607ec389924d44c11904d4")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    /**
     * @param clientId The client id recognized by Facebook APIs. 
     */
    public fun clientId(clientId: String)

    /**
     * @param clientSecret The client secret to be accompanied with clientId for Facebook to
     * authenticate the client. 
     */
    public fun clientSecret(clientSecret: String)

    /**
     * @param scopes The list of Facebook permissions to obtain for getting access to the Facebook
     * profile.
     */
    public fun scopes(scopes: List<String>)

    /**
     * @param scopes The list of Facebook permissions to obtain for getting access to the Facebook
     * profile.
     */
    public fun scopes(vararg scopes: String)

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps.builder()

    /**
     * @param apiVersion The Facebook API version to use.
     */
    override fun apiVersion(apiVersion: String) {
      cdkBuilder.apiVersion(apiVersion)
    }

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4dc76dff7b9004e248a5d779d2272bc82b692f8b8607ec389924d44c11904d4")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    /**
     * @param clientId The client id recognized by Facebook APIs. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The client secret to be accompanied with clientId for Facebook to
     * authenticate the client. 
     */
    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * @param scopes The list of Facebook permissions to obtain for getting access to the Facebook
     * profile.
     */
    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    /**
     * @param scopes The list of Facebook permissions to obtain for getting access to the Facebook
     * profile.
     */
    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderFacebookProps {
    /**
     * The Facebook API version to use.
     *
     * Default: - to the oldest version supported by Facebook
     */
    override fun apiVersion(): String? = unwrap(this).getApiVersion()

    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     */
    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    /**
     * The client id recognized by Facebook APIs.
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * The client secret to be accompanied with clientId for Facebook to authenticate the client.
     *
     * [Documentation](https://developers.facebook.com/docs/facebook-login/security#appsecret)
     */
    override fun clientSecret(): String = unwrap(this).getClientSecret()

    /**
     * The list of Facebook permissions to obtain for getting access to the Facebook profile.
     *
     * Default: [ public_profile ]
     *
     * [Documentation](https://developers.facebook.com/docs/facebook-login/permissions)
     */
    override fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

    /**
     * The user pool to which this construct provides identities.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        UserPoolIdentityProviderFacebookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps):
        UserPoolIdentityProviderFacebookProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderFacebookProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps
  }
}
