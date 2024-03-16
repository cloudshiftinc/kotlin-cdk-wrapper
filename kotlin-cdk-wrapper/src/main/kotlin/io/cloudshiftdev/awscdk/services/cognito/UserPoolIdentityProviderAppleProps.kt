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
 * Properties to initialize UserPoolAppleIdentityProvider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * ProviderAttribute providerAttribute;
 * UserPool userPool;
 * UserPoolIdentityProviderAppleProps userPoolIdentityProviderAppleProps =
 * UserPoolIdentityProviderAppleProps.builder()
 * .clientId("clientId")
 * .keyId("keyId")
 * .privateKey("privateKey")
 * .teamId("teamId")
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
 * .scopes(List.of("scopes"))
 * .build();
 * ```
 */
public interface UserPoolIdentityProviderAppleProps : UserPoolIdentityProviderProps {
  /**
   * The client id recognized by Apple APIs.
   *
   * [Documentation](https://developer.apple.com/documentation/sign_in_with_apple/clientconfigi/3230948-clientid)
   */
  public fun clientId(): String

  /**
   * The keyId (of the same key, which content has to be later supplied as `privateKey`) for Apple
   * APIs to authenticate the client.
   */
  public fun keyId(): String

  /**
   * The privateKey content for Apple APIs to authenticate the client.
   */
  public fun privateKey(): String

  /**
   * The list of apple permissions to obtain for getting access to the apple profile.
   *
   * Default: [ name ]
   *
   * [Documentation](https://developer.apple.com/documentation/sign_in_with_apple/clientconfigi/3230955-scope)
   */
  public fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

  /**
   * The teamId for Apple APIs to authenticate the client.
   */
  public fun teamId(): String

  /**
   * A builder for [UserPoolIdentityProviderAppleProps]
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
    @JvmName("b32a461d52c381bc55f41650195c5a648e29781b382a8fd612ae181b498ffd7f")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    /**
     * @param clientId The client id recognized by Apple APIs. 
     */
    public fun clientId(clientId: String)

    /**
     * @param keyId The keyId (of the same key, which content has to be later supplied as
     * `privateKey`) for Apple APIs to authenticate the client. 
     */
    public fun keyId(keyId: String)

    /**
     * @param privateKey The privateKey content for Apple APIs to authenticate the client. 
     */
    public fun privateKey(privateKey: String)

    /**
     * @param scopes The list of apple permissions to obtain for getting access to the apple
     * profile.
     */
    public fun scopes(scopes: List<String>)

    /**
     * @param scopes The list of apple permissions to obtain for getting access to the apple
     * profile.
     */
    public fun scopes(vararg scopes: String)

    /**
     * @param teamId The teamId for Apple APIs to authenticate the client. 
     */
    public fun teamId(teamId: String)

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps.builder()

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
    @JvmName("b32a461d52c381bc55f41650195c5a648e29781b382a8fd612ae181b498ffd7f")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    /**
     * @param clientId The client id recognized by Apple APIs. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param keyId The keyId (of the same key, which content has to be later supplied as
     * `privateKey`) for Apple APIs to authenticate the client. 
     */
    override fun keyId(keyId: String) {
      cdkBuilder.keyId(keyId)
    }

    /**
     * @param privateKey The privateKey content for Apple APIs to authenticate the client. 
     */
    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

    /**
     * @param scopes The list of apple permissions to obtain for getting access to the apple
     * profile.
     */
    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    /**
     * @param scopes The list of apple permissions to obtain for getting access to the apple
     * profile.
     */
    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    /**
     * @param teamId The teamId for Apple APIs to authenticate the client. 
     */
    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderAppleProps {
    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     */
    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    /**
     * The client id recognized by Apple APIs.
     *
     * [Documentation](https://developer.apple.com/documentation/sign_in_with_apple/clientconfigi/3230948-clientid)
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * The keyId (of the same key, which content has to be later supplied as `privateKey`) for Apple
     * APIs to authenticate the client.
     */
    override fun keyId(): String = unwrap(this).getKeyId()

    /**
     * The privateKey content for Apple APIs to authenticate the client.
     */
    override fun privateKey(): String = unwrap(this).getPrivateKey()

    /**
     * The list of apple permissions to obtain for getting access to the apple profile.
     *
     * Default: [ name ]
     *
     * [Documentation](https://developer.apple.com/documentation/sign_in_with_apple/clientconfigi/3230955-scope)
     */
    override fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

    /**
     * The teamId for Apple APIs to authenticate the client.
     */
    override fun teamId(): String = unwrap(this).getTeamId()

    /**
     * The user pool to which this construct provides identities.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolIdentityProviderAppleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps):
        UserPoolIdentityProviderAppleProps = CdkObjectWrappers.wrap(cdkObject) as
        UserPoolIdentityProviderAppleProps

    internal fun unwrap(wrapped: UserPoolIdentityProviderAppleProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps
  }
}
