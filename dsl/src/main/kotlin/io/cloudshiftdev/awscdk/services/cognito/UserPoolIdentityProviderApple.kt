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

public open class UserPoolIdentityProviderApple internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple,
) : Resource(cdkObject), IUserPoolIdentityProvider {
  /**
   * The primary identifier of this identity provider.
   */
  public override fun providerName(): String = unwrap(this).getProviderName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.UserPoolIdentityProviderApple].
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
    @JvmName("612ecef2cc73e507e37d4eabc619e5df491a30563d64e6198a8d14825310f52a")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    /**
     * The client id recognized by Apple APIs.
     *
     * [Documentation](https://developer.apple.com/documentation/sign_in_with_apple/clientconfigi/3230948-clientid)
     * @param clientId The client id recognized by Apple APIs. 
     */
    public fun clientId(clientId: String)

    /**
     * The keyId (of the same key, which content has to be later supplied as `privateKey`) for Apple
     * APIs to authenticate the client.
     *
     * @param keyId The keyId (of the same key, which content has to be later supplied as
     * `privateKey`) for Apple APIs to authenticate the client. 
     */
    public fun keyId(keyId: String)

    /**
     * The privateKey content for Apple APIs to authenticate the client.
     *
     * @param privateKey The privateKey content for Apple APIs to authenticate the client. 
     */
    public fun privateKey(privateKey: String)

    /**
     * The list of apple permissions to obtain for getting access to the apple profile.
     *
     * Default: [ name ]
     *
     * [Documentation](https://developer.apple.com/documentation/sign_in_with_apple/clientconfigi/3230955-scope)
     * @param scopes The list of apple permissions to obtain for getting access to the apple
     * profile. 
     */
    public fun scopes(scopes: List<String>)

    /**
     * The list of apple permissions to obtain for getting access to the apple profile.
     *
     * Default: [ name ]
     *
     * [Documentation](https://developer.apple.com/documentation/sign_in_with_apple/clientconfigi/3230955-scope)
     * @param scopes The list of apple permissions to obtain for getting access to the apple
     * profile. 
     */
    public fun scopes(vararg scopes: String)

    /**
     * The teamId for Apple APIs to authenticate the client.
     *
     * @param teamId The teamId for Apple APIs to authenticate the client. 
     */
    public fun teamId(teamId: String)

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
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple.Builder.create(scope,
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
    @JvmName("612ecef2cc73e507e37d4eabc619e5df491a30563d64e6198a8d14825310f52a")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    /**
     * The client id recognized by Apple APIs.
     *
     * [Documentation](https://developer.apple.com/documentation/sign_in_with_apple/clientconfigi/3230948-clientid)
     * @param clientId The client id recognized by Apple APIs. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * The keyId (of the same key, which content has to be later supplied as `privateKey`) for Apple
     * APIs to authenticate the client.
     *
     * @param keyId The keyId (of the same key, which content has to be later supplied as
     * `privateKey`) for Apple APIs to authenticate the client. 
     */
    override fun keyId(keyId: String) {
      cdkBuilder.keyId(keyId)
    }

    /**
     * The privateKey content for Apple APIs to authenticate the client.
     *
     * @param privateKey The privateKey content for Apple APIs to authenticate the client. 
     */
    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

    /**
     * The list of apple permissions to obtain for getting access to the apple profile.
     *
     * Default: [ name ]
     *
     * [Documentation](https://developer.apple.com/documentation/sign_in_with_apple/clientconfigi/3230955-scope)
     * @param scopes The list of apple permissions to obtain for getting access to the apple
     * profile. 
     */
    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    /**
     * The list of apple permissions to obtain for getting access to the apple profile.
     *
     * Default: [ name ]
     *
     * [Documentation](https://developer.apple.com/documentation/sign_in_with_apple/clientconfigi/3230955-scope)
     * @param scopes The list of apple permissions to obtain for getting access to the apple
     * profile. 
     */
    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    /**
     * The teamId for Apple APIs to authenticate the client.
     *
     * @param teamId The teamId for Apple APIs to authenticate the client. 
     */
    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    /**
     * The user pool to which this construct provides identities.
     *
     * @param userPool The user pool to which this construct provides identities. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolIdentityProviderApple {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolIdentityProviderApple(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple):
        UserPoolIdentityProviderApple = UserPoolIdentityProviderApple(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderApple):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple = wrapped.cdkObject
  }
}
