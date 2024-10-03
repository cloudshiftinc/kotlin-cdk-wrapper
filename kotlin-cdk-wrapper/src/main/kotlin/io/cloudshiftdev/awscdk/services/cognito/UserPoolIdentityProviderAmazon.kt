@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents an identity provider that integrates with Login with Amazon.
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
public open class UserPoolIdentityProviderAmazon(
  cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon,
) : Resource(cdkObject),
    IUserPoolIdentityProvider {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserPoolIdentityProviderAmazonProps,
  ) :
      this(software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(UserPoolIdentityProviderAmazonProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserPoolIdentityProviderAmazonProps.Builder.() -> Unit,
  ) : this(scope, id, UserPoolIdentityProviderAmazonProps(props)
  )

  /**
   * The primary identifier of this identity provider.
   */
  public override fun providerName(): String = unwrap(this).getProviderName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.UserPoolIdentityProviderAmazon].
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("428881ebb5d6adfee39d8c5562b22b48a809c9a10fb834306b0653a7e39e7e60")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    /**
     * The client id recognized by Login with Amazon APIs.
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/security-profile.html#client-identifier)
     * @param clientId The client id recognized by Login with Amazon APIs. 
     */
    public fun clientId(clientId: String)

    /**
     * The client secret to be accompanied with clientId for Login with Amazon APIs to authenticate
     * the client.
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/security-profile.html#client-identifier)
     * @param clientSecret The client secret to be accompanied with clientId for Login with Amazon
     * APIs to authenticate the client. 
     */
    public fun clientSecret(clientSecret: String)

    /**
     * The types of user profile data to obtain for the Amazon profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/customer-profile.html)
     * @param scopes The types of user profile data to obtain for the Amazon profile. 
     */
    public fun scopes(scopes: List<String>)

    /**
     * The types of user profile data to obtain for the Amazon profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/customer-profile.html)
     * @param scopes The types of user profile data to obtain for the Amazon profile. 
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
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon.Builder.create(scope,
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
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("428881ebb5d6adfee39d8c5562b22b48a809c9a10fb834306b0653a7e39e7e60")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    /**
     * The client id recognized by Login with Amazon APIs.
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/security-profile.html#client-identifier)
     * @param clientId The client id recognized by Login with Amazon APIs. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * The client secret to be accompanied with clientId for Login with Amazon APIs to authenticate
     * the client.
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/security-profile.html#client-identifier)
     * @param clientSecret The client secret to be accompanied with clientId for Login with Amazon
     * APIs to authenticate the client. 
     */
    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * The types of user profile data to obtain for the Amazon profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/customer-profile.html)
     * @param scopes The types of user profile data to obtain for the Amazon profile. 
     */
    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    /**
     * The types of user profile data to obtain for the Amazon profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developer.amazon.com/docs/login-with-amazon/customer-profile.html)
     * @param scopes The types of user profile data to obtain for the Amazon profile. 
     */
    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    /**
     * The user pool to which this construct provides identities.
     *
     * @param userPool The user pool to which this construct provides identities. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolIdentityProviderAmazon {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolIdentityProviderAmazon(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon):
        UserPoolIdentityProviderAmazon = UserPoolIdentityProviderAmazon(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderAmazon):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon = wrapped.cdkObject
        as software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon
  }
}
