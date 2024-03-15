@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a UserPool App Client.
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
public open class UserPoolClient internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolClient,
) : Resource(cdkObject), IUserPoolClient {
  /**
   * The OAuth flows enabled for this client.
   */
  public open fun oAuthFlows(): OAuthFlows = unwrap(this).getOAuthFlows().let(OAuthFlows::wrap)

  /**
   * Name of the application client.
   */
  public override fun userPoolClientId(): String = unwrap(this).getUserPoolClientId()

  /**
   * The client name that was specified via the `userPoolClientName` property during initialization,
   * throws an error otherwise.
   */
  public open fun userPoolClientName(): String = unwrap(this).getUserPoolClientName()

  /**
   * The generated client secret.
   *
   * Only available if the "generateSecret" props is set to true
   */
  public override fun userPoolClientSecret(): SecretValue =
      unwrap(this).getUserPoolClientSecret().let(SecretValue::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.UserPoolClient].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Validity of the access token.
     *
     * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
     * token validity.
     *
     * Default: Duration.minutes(60)
     *
     * [Documentation](https://docs.aws.amazon.com/en_us/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html#amazon-cognito-user-pools-using-the-access-token)
     * @param accessTokenValidity Validity of the access token. 
     */
    public fun accessTokenValidity(accessTokenValidity: Duration)

    /**
     * The set of OAuth authentication flows to enable on the client.
     *
     * Default: - If you don't specify a value, your user client supports ALLOW_REFRESH_TOKEN_AUTH,
     * ALLOW_USER_SRP_AUTH, and ALLOW_CUSTOM_AUTH.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow.html)
     * @param authFlows The set of OAuth authentication flows to enable on the client. 
     */
    public fun authFlows(authFlows: AuthFlow)

    /**
     * The set of OAuth authentication flows to enable on the client.
     *
     * Default: - If you don't specify a value, your user client supports ALLOW_REFRESH_TOKEN_AUTH,
     * ALLOW_USER_SRP_AUTH, and ALLOW_CUSTOM_AUTH.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow.html)
     * @param authFlows The set of OAuth authentication flows to enable on the client. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba14b3785c393a90f5f7281966ce647938ca9352287cfa5fa83557e18297ed19")
    public fun authFlows(authFlows: AuthFlow.Builder.() -> Unit)

    /**
     * Cognito creates a session token for each API request in an authentication flow.
     *
     * AuthSessionValidity is the duration, in minutes, of that session token.
     * see defaults in `AuthSessionValidity`. Valid duration is from 3 to 15 minutes.
     *
     * Default: - Duration.minutes(3)
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-authsessionvalidity)
     * @param authSessionValidity Cognito creates a session token for each API request in an
     * authentication flow. 
     */
    public fun authSessionValidity(authSessionValidity: Duration)

    /**
     * Turns off all OAuth interactions for this client.
     *
     * Default: false
     *
     * @param disableOAuth Turns off all OAuth interactions for this client. 
     */
    public fun disableOAuth(disableOAuth: Boolean)

    /**
     * Enable token revocation for this client.
     *
     * Default: true for new user pool clients
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/token-revocation.html#enable-token-revocation)
     * @param enableTokenRevocation Enable token revocation for this client. 
     */
    public fun enableTokenRevocation(enableTokenRevocation: Boolean)

    /**
     * Whether to generate a client secret.
     *
     * Default: false
     *
     * @param generateSecret Whether to generate a client secret. 
     */
    public fun generateSecret(generateSecret: Boolean)

    /**
     * Validity of the ID token.
     *
     * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
     * token validity.
     *
     * Default: Duration.minutes(60)
     *
     * [Documentation](https://docs.aws.amazon.com/en_us/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html#amazon-cognito-user-pools-using-the-id-token)
     * @param idTokenValidity Validity of the ID token. 
     */
    public fun idTokenValidity(idTokenValidity: Duration)

    /**
     * OAuth settings for this client to interact with the app.
     *
     * An error is thrown when this is specified and `disableOAuth` is set.
     *
     * Default: - see defaults in `OAuthSettings`. meaningless if `disableOAuth` is set.
     *
     * @param oAuth OAuth settings for this client to interact with the app. 
     */
    public fun oAuth(oAuth: OAuthSettings)

    /**
     * OAuth settings for this client to interact with the app.
     *
     * An error is thrown when this is specified and `disableOAuth` is set.
     *
     * Default: - see defaults in `OAuthSettings`. meaningless if `disableOAuth` is set.
     *
     * @param oAuth OAuth settings for this client to interact with the app. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22e0c75887cff0caf44dc059347f5d22050bdcb0bfcc6b08a98f5c506aa29a0c")
    public fun oAuth(oAuth: OAuthSettings.Builder.() -> Unit)

    /**
     * Whether Cognito returns a UserNotFoundException exception when the user does not exist in the
     * user pool (false), or whether it returns another type of error that doesn't reveal the user's
     * absence.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-managing-errors.html)
     * @param preventUserExistenceErrors Whether Cognito returns a UserNotFoundException exception
     * when the user does not exist in the user pool (false), or whether it returns another type of
     * error that doesn't reveal the user's absence. 
     */
    public fun preventUserExistenceErrors(preventUserExistenceErrors: Boolean)

    /**
     * The set of attributes this client will be able to read.
     *
     * Default: - all standard and custom attributes
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-attribute-permissions-and-scopes)
     * @param readAttributes The set of attributes this client will be able to read. 
     */
    public fun readAttributes(readAttributes: ClientAttributes)

    /**
     * Validity of the refresh token.
     *
     * Values between 60 minutes and 10 years are valid.
     *
     * Default: Duration.days(30)
     *
     * [Documentation](https://docs.aws.amazon.com/en_us/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html#amazon-cognito-user-pools-using-the-refresh-token)
     * @param refreshTokenValidity Validity of the refresh token. 
     */
    public fun refreshTokenValidity(refreshTokenValidity: Duration)

    /**
     * The list of identity providers that users should be able to use to sign in using this client.
     *
     * Default: - supports all identity providers that are registered with the user pool. If the
     * user pool and/or
     * identity providers are imported, either specify this option explicitly or ensure that the
     * identity providers are
     * registered with the user pool using the `UserPool.registerIdentityProvider()` API.
     *
     * @param supportedIdentityProviders The list of identity providers that users should be able to
     * use to sign in using this client. 
     */
    public
        fun supportedIdentityProviders(supportedIdentityProviders: List<UserPoolClientIdentityProvider>)

    /**
     * The list of identity providers that users should be able to use to sign in using this client.
     *
     * Default: - supports all identity providers that are registered with the user pool. If the
     * user pool and/or
     * identity providers are imported, either specify this option explicitly or ensure that the
     * identity providers are
     * registered with the user pool using the `UserPool.registerIdentityProvider()` API.
     *
     * @param supportedIdentityProviders The list of identity providers that users should be able to
     * use to sign in using this client. 
     */
    public fun supportedIdentityProviders(vararg
        supportedIdentityProviders: UserPoolClientIdentityProvider)

    /**
     * The UserPool resource this client will have access to.
     *
     * @param userPool The UserPool resource this client will have access to. 
     */
    public fun userPool(userPool: IUserPool)

    /**
     * Name of the application client.
     *
     * Default: - cloudformation generated name
     *
     * @param userPoolClientName Name of the application client. 
     */
    public fun userPoolClientName(userPoolClientName: String)

    /**
     * The set of attributes this client will be able to write.
     *
     * Default: - all standard and custom attributes
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-attribute-permissions-and-scopes)
     * @param writeAttributes The set of attributes this client will be able to write. 
     */
    public fun writeAttributes(writeAttributes: ClientAttributes)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolClient.Builder =
        software.amazon.awscdk.services.cognito.UserPoolClient.Builder.create(scope, id)

    /**
     * Validity of the access token.
     *
     * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
     * token validity.
     *
     * Default: Duration.minutes(60)
     *
     * [Documentation](https://docs.aws.amazon.com/en_us/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html#amazon-cognito-user-pools-using-the-access-token)
     * @param accessTokenValidity Validity of the access token. 
     */
    override fun accessTokenValidity(accessTokenValidity: Duration) {
      cdkBuilder.accessTokenValidity(accessTokenValidity.let(Duration::unwrap))
    }

    /**
     * The set of OAuth authentication flows to enable on the client.
     *
     * Default: - If you don't specify a value, your user client supports ALLOW_REFRESH_TOKEN_AUTH,
     * ALLOW_USER_SRP_AUTH, and ALLOW_CUSTOM_AUTH.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow.html)
     * @param authFlows The set of OAuth authentication flows to enable on the client. 
     */
    override fun authFlows(authFlows: AuthFlow) {
      cdkBuilder.authFlows(authFlows.let(AuthFlow::unwrap))
    }

    /**
     * The set of OAuth authentication flows to enable on the client.
     *
     * Default: - If you don't specify a value, your user client supports ALLOW_REFRESH_TOKEN_AUTH,
     * ALLOW_USER_SRP_AUTH, and ALLOW_CUSTOM_AUTH.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow.html)
     * @param authFlows The set of OAuth authentication flows to enable on the client. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba14b3785c393a90f5f7281966ce647938ca9352287cfa5fa83557e18297ed19")
    override fun authFlows(authFlows: AuthFlow.Builder.() -> Unit): Unit =
        authFlows(AuthFlow(authFlows))

    /**
     * Cognito creates a session token for each API request in an authentication flow.
     *
     * AuthSessionValidity is the duration, in minutes, of that session token.
     * see defaults in `AuthSessionValidity`. Valid duration is from 3 to 15 minutes.
     *
     * Default: - Duration.minutes(3)
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-authsessionvalidity)
     * @param authSessionValidity Cognito creates a session token for each API request in an
     * authentication flow. 
     */
    override fun authSessionValidity(authSessionValidity: Duration) {
      cdkBuilder.authSessionValidity(authSessionValidity.let(Duration::unwrap))
    }

    /**
     * Turns off all OAuth interactions for this client.
     *
     * Default: false
     *
     * @param disableOAuth Turns off all OAuth interactions for this client. 
     */
    override fun disableOAuth(disableOAuth: Boolean) {
      cdkBuilder.disableOAuth(disableOAuth)
    }

    /**
     * Enable token revocation for this client.
     *
     * Default: true for new user pool clients
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/token-revocation.html#enable-token-revocation)
     * @param enableTokenRevocation Enable token revocation for this client. 
     */
    override fun enableTokenRevocation(enableTokenRevocation: Boolean) {
      cdkBuilder.enableTokenRevocation(enableTokenRevocation)
    }

    /**
     * Whether to generate a client secret.
     *
     * Default: false
     *
     * @param generateSecret Whether to generate a client secret. 
     */
    override fun generateSecret(generateSecret: Boolean) {
      cdkBuilder.generateSecret(generateSecret)
    }

    /**
     * Validity of the ID token.
     *
     * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
     * token validity.
     *
     * Default: Duration.minutes(60)
     *
     * [Documentation](https://docs.aws.amazon.com/en_us/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html#amazon-cognito-user-pools-using-the-id-token)
     * @param idTokenValidity Validity of the ID token. 
     */
    override fun idTokenValidity(idTokenValidity: Duration) {
      cdkBuilder.idTokenValidity(idTokenValidity.let(Duration::unwrap))
    }

    /**
     * OAuth settings for this client to interact with the app.
     *
     * An error is thrown when this is specified and `disableOAuth` is set.
     *
     * Default: - see defaults in `OAuthSettings`. meaningless if `disableOAuth` is set.
     *
     * @param oAuth OAuth settings for this client to interact with the app. 
     */
    override fun oAuth(oAuth: OAuthSettings) {
      cdkBuilder.oAuth(oAuth.let(OAuthSettings::unwrap))
    }

    /**
     * OAuth settings for this client to interact with the app.
     *
     * An error is thrown when this is specified and `disableOAuth` is set.
     *
     * Default: - see defaults in `OAuthSettings`. meaningless if `disableOAuth` is set.
     *
     * @param oAuth OAuth settings for this client to interact with the app. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22e0c75887cff0caf44dc059347f5d22050bdcb0bfcc6b08a98f5c506aa29a0c")
    override fun oAuth(oAuth: OAuthSettings.Builder.() -> Unit): Unit = oAuth(OAuthSettings(oAuth))

    /**
     * Whether Cognito returns a UserNotFoundException exception when the user does not exist in the
     * user pool (false), or whether it returns another type of error that doesn't reveal the user's
     * absence.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-managing-errors.html)
     * @param preventUserExistenceErrors Whether Cognito returns a UserNotFoundException exception
     * when the user does not exist in the user pool (false), or whether it returns another type of
     * error that doesn't reveal the user's absence. 
     */
    override fun preventUserExistenceErrors(preventUserExistenceErrors: Boolean) {
      cdkBuilder.preventUserExistenceErrors(preventUserExistenceErrors)
    }

    /**
     * The set of attributes this client will be able to read.
     *
     * Default: - all standard and custom attributes
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-attribute-permissions-and-scopes)
     * @param readAttributes The set of attributes this client will be able to read. 
     */
    override fun readAttributes(readAttributes: ClientAttributes) {
      cdkBuilder.readAttributes(readAttributes.let(ClientAttributes::unwrap))
    }

    /**
     * Validity of the refresh token.
     *
     * Values between 60 minutes and 10 years are valid.
     *
     * Default: Duration.days(30)
     *
     * [Documentation](https://docs.aws.amazon.com/en_us/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html#amazon-cognito-user-pools-using-the-refresh-token)
     * @param refreshTokenValidity Validity of the refresh token. 
     */
    override fun refreshTokenValidity(refreshTokenValidity: Duration) {
      cdkBuilder.refreshTokenValidity(refreshTokenValidity.let(Duration::unwrap))
    }

    /**
     * The list of identity providers that users should be able to use to sign in using this client.
     *
     * Default: - supports all identity providers that are registered with the user pool. If the
     * user pool and/or
     * identity providers are imported, either specify this option explicitly or ensure that the
     * identity providers are
     * registered with the user pool using the `UserPool.registerIdentityProvider()` API.
     *
     * @param supportedIdentityProviders The list of identity providers that users should be able to
     * use to sign in using this client. 
     */
    override
        fun supportedIdentityProviders(supportedIdentityProviders: List<UserPoolClientIdentityProvider>) {
      cdkBuilder.supportedIdentityProviders(supportedIdentityProviders.map(UserPoolClientIdentityProvider::unwrap))
    }

    /**
     * The list of identity providers that users should be able to use to sign in using this client.
     *
     * Default: - supports all identity providers that are registered with the user pool. If the
     * user pool and/or
     * identity providers are imported, either specify this option explicitly or ensure that the
     * identity providers are
     * registered with the user pool using the `UserPool.registerIdentityProvider()` API.
     *
     * @param supportedIdentityProviders The list of identity providers that users should be able to
     * use to sign in using this client. 
     */
    override fun supportedIdentityProviders(vararg
        supportedIdentityProviders: UserPoolClientIdentityProvider): Unit =
        supportedIdentityProviders(supportedIdentityProviders.toList())

    /**
     * The UserPool resource this client will have access to.
     *
     * @param userPool The UserPool resource this client will have access to. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    /**
     * Name of the application client.
     *
     * Default: - cloudformation generated name
     *
     * @param userPoolClientName Name of the application client. 
     */
    override fun userPoolClientName(userPoolClientName: String) {
      cdkBuilder.userPoolClientName(userPoolClientName)
    }

    /**
     * The set of attributes this client will be able to write.
     *
     * Default: - all standard and custom attributes
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-attribute-permissions-and-scopes)
     * @param writeAttributes The set of attributes this client will be able to write. 
     */
    override fun writeAttributes(writeAttributes: ClientAttributes) {
      cdkBuilder.writeAttributes(writeAttributes.let(ClientAttributes::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolClient = cdkBuilder.build()
  }

  public companion object {
    public fun fromUserPoolClientId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userPoolClientId: String,
    ): IUserPoolClient =
        software.amazon.awscdk.services.cognito.UserPoolClient.fromUserPoolClientId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, userPoolClientId).let(IUserPoolClient::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolClient {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolClient(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolClient):
        UserPoolClient = UserPoolClient(cdkObject)

    internal fun unwrap(wrapped: UserPoolClient):
        software.amazon.awscdk.services.cognito.UserPoolClient = wrapped.cdkObject
  }
}
