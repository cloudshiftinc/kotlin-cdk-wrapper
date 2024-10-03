@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents an identity provider that integrates with Apple.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * ProviderAttribute providerAttribute;
 * SecretValue secretValue;
 * UserPool userPool;
 * UserPoolIdentityProviderApple userPoolIdentityProviderApple =
 * UserPoolIdentityProviderApple.Builder.create(this, "MyUserPoolIdentityProviderApple")
 * .clientId("clientId")
 * .keyId("keyId")
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
 * .privateKey("privateKey")
 * .privateKeyValue(secretValue)
 * .scopes(List.of("scopes"))
 * .build();
 * ```
 */
public open class UserPoolIdentityProviderApple(
  cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple,
) : Resource(cdkObject),
    IUserPoolIdentityProvider {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserPoolIdentityProviderAppleProps,
  ) :
      this(software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(UserPoolIdentityProviderAppleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserPoolIdentityProviderAppleProps.Builder.() -> Unit,
  ) : this(scope, id, UserPoolIdentityProviderAppleProps(props)
  )

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
     * (deprecated) The privateKey content for Apple APIs to authenticate the client.
     *
     * Default: none
     *
     * @deprecated use privateKeyValue
     * @param privateKey The privateKey content for Apple APIs to authenticate the client. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun privateKey(privateKey: String)

    /**
     * The privateKey content for Apple APIs to authenticate the client.
     *
     * Default: none
     *
     * @param privateKeyValue The privateKey content for Apple APIs to authenticate the client. 
     */
    public fun privateKeyValue(privateKeyValue: SecretValue)

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
     * (deprecated) The privateKey content for Apple APIs to authenticate the client.
     *
     * Default: none
     *
     * @deprecated use privateKeyValue
     * @param privateKey The privateKey content for Apple APIs to authenticate the client. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

    /**
     * The privateKey content for Apple APIs to authenticate the client.
     *
     * Default: none
     *
     * @param privateKeyValue The privateKey content for Apple APIs to authenticate the client. 
     */
    override fun privateKeyValue(privateKeyValue: SecretValue) {
      cdkBuilder.privateKeyValue(privateKeyValue.let(SecretValue.Companion::unwrap))
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
      cdkBuilder.userPool(userPool.let(IUserPool.Companion::unwrap))
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
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple
  }
}
