@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties to initialize UserPoolAmazonIdentityProvider.
 *
 * Example:
 *
 * ```
 * UserPool pool = new UserPool(this, "Pool");
 * UserPoolIdentityProviderAmazon provider = UserPoolIdentityProviderAmazon.Builder.create(this,
 * "Amazon")
 * .userPool(pool)
 * .clientId("amzn-client-id")
 * .clientSecret("amzn-client-secret")
 * .build();
 * UserPoolClient client = pool.addClient("app-client", UserPoolClientOptions.builder()
 * // ...
 * .supportedIdentityProviders(List.of(UserPoolClientIdentityProvider.AMAZON))
 * .build());
 * client.node.addDependency(provider);
 * ```
 */
public interface UserPoolIdentityProviderAmazonProps : UserPoolIdentityProviderProps {
  /**
   * The client id recognized by Login with Amazon APIs.
   *
   * [Documentation](https://developer.amazon.com/docs/login-with-amazon/security-profile.html#client-identifier)
   */
  public fun clientId(): String

  /**
   * The client secret to be accompanied with clientId for Login with Amazon APIs to authenticate
   * the client.
   *
   * [Documentation](https://developer.amazon.com/docs/login-with-amazon/security-profile.html#client-identifier)
   */
  public fun clientSecret(): String

  /**
   * The types of user profile data to obtain for the Amazon profile.
   *
   * Default: [ profile ]
   *
   * [Documentation](https://developer.amazon.com/docs/login-with-amazon/customer-profile.html)
   */
  public fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

  /**
   * A builder for [UserPoolIdentityProviderAmazonProps]
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
    @JvmName("614fd90621e9b51dffb3a5e2e2c1a38a5527fca8dd7c10f320f1d94838c77294")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    /**
     * @param clientId The client id recognized by Login with Amazon APIs. 
     */
    public fun clientId(clientId: String)

    /**
     * @param clientSecret The client secret to be accompanied with clientId for Login with Amazon
     * APIs to authenticate the client. 
     */
    public fun clientSecret(clientSecret: String)

    /**
     * @param scopes The types of user profile data to obtain for the Amazon profile.
     */
    public fun scopes(scopes: List<String>)

    /**
     * @param scopes The types of user profile data to obtain for the Amazon profile.
     */
    public fun scopes(vararg scopes: String)

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps.builder()

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
    @JvmName("614fd90621e9b51dffb3a5e2e2c1a38a5527fca8dd7c10f320f1d94838c77294")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    /**
     * @param clientId The client id recognized by Login with Amazon APIs. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The client secret to be accompanied with clientId for Login with Amazon
     * APIs to authenticate the client. 
     */
    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * @param scopes The types of user profile data to obtain for the Amazon profile.
     */
    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    /**
     * @param scopes The types of user profile data to obtain for the Amazon profile.
     */
    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderAmazonProps {
    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     */
    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    /**
     * The client id recognized by Login with Amazon APIs.
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/security-profile.html#client-identifier)
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * The client secret to be accompanied with clientId for Login with Amazon APIs to authenticate
     * the client.
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/security-profile.html#client-identifier)
     */
    override fun clientSecret(): String = unwrap(this).getClientSecret()

    /**
     * The types of user profile data to obtain for the Amazon profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/customer-profile.html)
     */
    override fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

    /**
     * The user pool to which this construct provides identities.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        UserPoolIdentityProviderAmazonProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps):
        UserPoolIdentityProviderAmazonProps = CdkObjectWrappers.wrap(cdkObject) as?
        UserPoolIdentityProviderAmazonProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderAmazonProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps
  }
}
