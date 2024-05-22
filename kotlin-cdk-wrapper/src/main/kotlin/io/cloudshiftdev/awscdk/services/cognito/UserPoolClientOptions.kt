@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Options to create a UserPoolClient.
 *
 * Example:
 *
 * ```
 * UserPool pool = new UserPool(this, "Pool");
 * pool.addClient("app-client", UserPoolClientOptions.builder()
 * .oAuth(OAuthSettings.builder()
 * .flows(OAuthFlows.builder()
 * .authorizationCodeGrant(true)
 * .build())
 * .scopes(List.of(OAuthScope.OPENID))
 * .callbackUrls(List.of("https://my-app-domain.com/welcome"))
 * .logoutUrls(List.of("https://my-app-domain.com/signin"))
 * .build())
 * .build());
 * ```
 */
public interface UserPoolClientOptions {
  /**
   * Validity of the access token.
   *
   * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
   * token validity.
   *
   * Default: Duration.minutes(60)
   *
   * [Documentation](https://docs.aws.amazon.com/en_us/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html#amazon-cognito-user-pools-using-the-access-token)
   */
  public fun accessTokenValidity(): Duration? =
      unwrap(this).getAccessTokenValidity()?.let(Duration::wrap)

  /**
   * The set of OAuth authentication flows to enable on the client.
   *
   * Default: - If you don't specify a value, your user client supports ALLOW_REFRESH_TOKEN_AUTH,
   * ALLOW_USER_SRP_AUTH, and ALLOW_CUSTOM_AUTH.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow.html)
   */
  public fun authFlows(): AuthFlow? = unwrap(this).getAuthFlows()?.let(AuthFlow::wrap)

  /**
   * Cognito creates a session token for each API request in an authentication flow.
   *
   * AuthSessionValidity is the duration, in minutes, of that session token.
   * see defaults in `AuthSessionValidity`. Valid duration is from 3 to 15 minutes.
   *
   * Default: - Duration.minutes(3)
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-authsessionvalidity)
   */
  public fun authSessionValidity(): Duration? =
      unwrap(this).getAuthSessionValidity()?.let(Duration::wrap)

  /**
   * Turns off all OAuth interactions for this client.
   *
   * Default: false
   */
  public fun disableOAuth(): Boolean? = unwrap(this).getDisableOAuth()

  /**
   * Enable token revocation for this client.
   *
   * Default: true for new user pool clients
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/token-revocation.html#enable-token-revocation)
   */
  public fun enableTokenRevocation(): Boolean? = unwrap(this).getEnableTokenRevocation()

  /**
   * Whether to generate a client secret.
   *
   * Default: false
   */
  public fun generateSecret(): Boolean? = unwrap(this).getGenerateSecret()

  /**
   * Validity of the ID token.
   *
   * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
   * token validity.
   *
   * Default: Duration.minutes(60)
   *
   * [Documentation](https://docs.aws.amazon.com/en_us/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html#amazon-cognito-user-pools-using-the-id-token)
   */
  public fun idTokenValidity(): Duration? = unwrap(this).getIdTokenValidity()?.let(Duration::wrap)

  /**
   * OAuth settings for this client to interact with the app.
   *
   * An error is thrown when this is specified and `disableOAuth` is set.
   *
   * Default: - see defaults in `OAuthSettings`. meaningless if `disableOAuth` is set.
   */
  public fun oAuth(): OAuthSettings? = unwrap(this).getOAuth()?.let(OAuthSettings::wrap)

  /**
   * Whether Cognito returns a UserNotFoundException exception when the user does not exist in the
   * user pool (false), or whether it returns another type of error that doesn't reveal the user's
   * absence.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-managing-errors.html)
   */
  public fun preventUserExistenceErrors(): Boolean? = unwrap(this).getPreventUserExistenceErrors()

  /**
   * The set of attributes this client will be able to read.
   *
   * Default: - all standard and custom attributes
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-attribute-permissions-and-scopes)
   */
  public fun readAttributes(): ClientAttributes? =
      unwrap(this).getReadAttributes()?.let(ClientAttributes::wrap)

  /**
   * Validity of the refresh token.
   *
   * Values between 60 minutes and 10 years are valid.
   *
   * Default: Duration.days(30)
   *
   * [Documentation](https://docs.aws.amazon.com/en_us/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html#amazon-cognito-user-pools-using-the-refresh-token)
   */
  public fun refreshTokenValidity(): Duration? =
      unwrap(this).getRefreshTokenValidity()?.let(Duration::wrap)

  /**
   * The list of identity providers that users should be able to use to sign in using this client.
   *
   * Default: - supports all identity providers that are registered with the user pool. If the user
   * pool and/or
   * identity providers are imported, either specify this option explicitly or ensure that the
   * identity providers are
   * registered with the user pool using the `UserPool.registerIdentityProvider()` API.
   */
  public fun supportedIdentityProviders(): List<UserPoolClientIdentityProvider> =
      unwrap(this).getSupportedIdentityProviders()?.map(UserPoolClientIdentityProvider::wrap) ?:
      emptyList()

  /**
   * Name of the application client.
   *
   * Default: - cloudformation generated name
   */
  public fun userPoolClientName(): String? = unwrap(this).getUserPoolClientName()

  /**
   * The set of attributes this client will be able to write.
   *
   * Default: - all standard and custom attributes
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-attribute-permissions-and-scopes)
   */
  public fun writeAttributes(): ClientAttributes? =
      unwrap(this).getWriteAttributes()?.let(ClientAttributes::wrap)

  /**
   * A builder for [UserPoolClientOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessTokenValidity Validity of the access token.
     * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
     * token validity.
     */
    public fun accessTokenValidity(accessTokenValidity: Duration)

    /**
     * @param authFlows The set of OAuth authentication flows to enable on the client.
     */
    public fun authFlows(authFlows: AuthFlow)

    /**
     * @param authFlows The set of OAuth authentication flows to enable on the client.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0cfe2ae57a5e682b93a6d8a3d510e0640d6c40c202e1b130a0098d653a7d12")
    public fun authFlows(authFlows: AuthFlow.Builder.() -> Unit)

    /**
     * @param authSessionValidity Cognito creates a session token for each API request in an
     * authentication flow.
     * AuthSessionValidity is the duration, in minutes, of that session token.
     * see defaults in `AuthSessionValidity`. Valid duration is from 3 to 15 minutes.
     */
    public fun authSessionValidity(authSessionValidity: Duration)

    /**
     * @param disableOAuth Turns off all OAuth interactions for this client.
     */
    public fun disableOAuth(disableOAuth: Boolean)

    /**
     * @param enableTokenRevocation Enable token revocation for this client.
     */
    public fun enableTokenRevocation(enableTokenRevocation: Boolean)

    /**
     * @param generateSecret Whether to generate a client secret.
     */
    public fun generateSecret(generateSecret: Boolean)

    /**
     * @param idTokenValidity Validity of the ID token.
     * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
     * token validity.
     */
    public fun idTokenValidity(idTokenValidity: Duration)

    /**
     * @param oAuth OAuth settings for this client to interact with the app.
     * An error is thrown when this is specified and `disableOAuth` is set.
     */
    public fun oAuth(oAuth: OAuthSettings)

    /**
     * @param oAuth OAuth settings for this client to interact with the app.
     * An error is thrown when this is specified and `disableOAuth` is set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa4601c197d8996c76173a2c079517708a09b12b5cbab765a15be3d4c1a5f52d")
    public fun oAuth(oAuth: OAuthSettings.Builder.() -> Unit)

    /**
     * @param preventUserExistenceErrors Whether Cognito returns a UserNotFoundException exception
     * when the user does not exist in the user pool (false), or whether it returns another type of
     * error that doesn't reveal the user's absence.
     */
    public fun preventUserExistenceErrors(preventUserExistenceErrors: Boolean)

    /**
     * @param readAttributes The set of attributes this client will be able to read.
     */
    public fun readAttributes(readAttributes: ClientAttributes)

    /**
     * @param refreshTokenValidity Validity of the refresh token.
     * Values between 60 minutes and 10 years are valid.
     */
    public fun refreshTokenValidity(refreshTokenValidity: Duration)

    /**
     * @param supportedIdentityProviders The list of identity providers that users should be able to
     * use to sign in using this client.
     */
    public
        fun supportedIdentityProviders(supportedIdentityProviders: List<UserPoolClientIdentityProvider>)

    /**
     * @param supportedIdentityProviders The list of identity providers that users should be able to
     * use to sign in using this client.
     */
    public fun supportedIdentityProviders(vararg
        supportedIdentityProviders: UserPoolClientIdentityProvider)

    /**
     * @param userPoolClientName Name of the application client.
     */
    public fun userPoolClientName(userPoolClientName: String)

    /**
     * @param writeAttributes The set of attributes this client will be able to write.
     */
    public fun writeAttributes(writeAttributes: ClientAttributes)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolClientOptions.Builder =
        software.amazon.awscdk.services.cognito.UserPoolClientOptions.builder()

    /**
     * @param accessTokenValidity Validity of the access token.
     * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
     * token validity.
     */
    override fun accessTokenValidity(accessTokenValidity: Duration) {
      cdkBuilder.accessTokenValidity(accessTokenValidity.let(Duration.Companion::unwrap))
    }

    /**
     * @param authFlows The set of OAuth authentication flows to enable on the client.
     */
    override fun authFlows(authFlows: AuthFlow) {
      cdkBuilder.authFlows(authFlows.let(AuthFlow.Companion::unwrap))
    }

    /**
     * @param authFlows The set of OAuth authentication flows to enable on the client.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0cfe2ae57a5e682b93a6d8a3d510e0640d6c40c202e1b130a0098d653a7d12")
    override fun authFlows(authFlows: AuthFlow.Builder.() -> Unit): Unit =
        authFlows(AuthFlow(authFlows))

    /**
     * @param authSessionValidity Cognito creates a session token for each API request in an
     * authentication flow.
     * AuthSessionValidity is the duration, in minutes, of that session token.
     * see defaults in `AuthSessionValidity`. Valid duration is from 3 to 15 minutes.
     */
    override fun authSessionValidity(authSessionValidity: Duration) {
      cdkBuilder.authSessionValidity(authSessionValidity.let(Duration.Companion::unwrap))
    }

    /**
     * @param disableOAuth Turns off all OAuth interactions for this client.
     */
    override fun disableOAuth(disableOAuth: Boolean) {
      cdkBuilder.disableOAuth(disableOAuth)
    }

    /**
     * @param enableTokenRevocation Enable token revocation for this client.
     */
    override fun enableTokenRevocation(enableTokenRevocation: Boolean) {
      cdkBuilder.enableTokenRevocation(enableTokenRevocation)
    }

    /**
     * @param generateSecret Whether to generate a client secret.
     */
    override fun generateSecret(generateSecret: Boolean) {
      cdkBuilder.generateSecret(generateSecret)
    }

    /**
     * @param idTokenValidity Validity of the ID token.
     * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
     * token validity.
     */
    override fun idTokenValidity(idTokenValidity: Duration) {
      cdkBuilder.idTokenValidity(idTokenValidity.let(Duration.Companion::unwrap))
    }

    /**
     * @param oAuth OAuth settings for this client to interact with the app.
     * An error is thrown when this is specified and `disableOAuth` is set.
     */
    override fun oAuth(oAuth: OAuthSettings) {
      cdkBuilder.oAuth(oAuth.let(OAuthSettings.Companion::unwrap))
    }

    /**
     * @param oAuth OAuth settings for this client to interact with the app.
     * An error is thrown when this is specified and `disableOAuth` is set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa4601c197d8996c76173a2c079517708a09b12b5cbab765a15be3d4c1a5f52d")
    override fun oAuth(oAuth: OAuthSettings.Builder.() -> Unit): Unit = oAuth(OAuthSettings(oAuth))

    /**
     * @param preventUserExistenceErrors Whether Cognito returns a UserNotFoundException exception
     * when the user does not exist in the user pool (false), or whether it returns another type of
     * error that doesn't reveal the user's absence.
     */
    override fun preventUserExistenceErrors(preventUserExistenceErrors: Boolean) {
      cdkBuilder.preventUserExistenceErrors(preventUserExistenceErrors)
    }

    /**
     * @param readAttributes The set of attributes this client will be able to read.
     */
    override fun readAttributes(readAttributes: ClientAttributes) {
      cdkBuilder.readAttributes(readAttributes.let(ClientAttributes.Companion::unwrap))
    }

    /**
     * @param refreshTokenValidity Validity of the refresh token.
     * Values between 60 minutes and 10 years are valid.
     */
    override fun refreshTokenValidity(refreshTokenValidity: Duration) {
      cdkBuilder.refreshTokenValidity(refreshTokenValidity.let(Duration.Companion::unwrap))
    }

    /**
     * @param supportedIdentityProviders The list of identity providers that users should be able to
     * use to sign in using this client.
     */
    override
        fun supportedIdentityProviders(supportedIdentityProviders: List<UserPoolClientIdentityProvider>) {
      cdkBuilder.supportedIdentityProviders(supportedIdentityProviders.map(UserPoolClientIdentityProvider.Companion::unwrap))
    }

    /**
     * @param supportedIdentityProviders The list of identity providers that users should be able to
     * use to sign in using this client.
     */
    override fun supportedIdentityProviders(vararg
        supportedIdentityProviders: UserPoolClientIdentityProvider): Unit =
        supportedIdentityProviders(supportedIdentityProviders.toList())

    /**
     * @param userPoolClientName Name of the application client.
     */
    override fun userPoolClientName(userPoolClientName: String) {
      cdkBuilder.userPoolClientName(userPoolClientName)
    }

    /**
     * @param writeAttributes The set of attributes this client will be able to write.
     */
    override fun writeAttributes(writeAttributes: ClientAttributes) {
      cdkBuilder.writeAttributes(writeAttributes.let(ClientAttributes.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolClientOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientOptions,
  ) : CdkObject(cdkObject), UserPoolClientOptions {
    /**
     * Validity of the access token.
     *
     * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
     * token validity.
     *
     * Default: Duration.minutes(60)
     *
     * [Documentation](https://docs.aws.amazon.com/en_us/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html#amazon-cognito-user-pools-using-the-access-token)
     */
    override fun accessTokenValidity(): Duration? =
        unwrap(this).getAccessTokenValidity()?.let(Duration::wrap)

    /**
     * The set of OAuth authentication flows to enable on the client.
     *
     * Default: - If you don't specify a value, your user client supports ALLOW_REFRESH_TOKEN_AUTH,
     * ALLOW_USER_SRP_AUTH, and ALLOW_CUSTOM_AUTH.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow.html)
     */
    override fun authFlows(): AuthFlow? = unwrap(this).getAuthFlows()?.let(AuthFlow::wrap)

    /**
     * Cognito creates a session token for each API request in an authentication flow.
     *
     * AuthSessionValidity is the duration, in minutes, of that session token.
     * see defaults in `AuthSessionValidity`. Valid duration is from 3 to 15 minutes.
     *
     * Default: - Duration.minutes(3)
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-authsessionvalidity)
     */
    override fun authSessionValidity(): Duration? =
        unwrap(this).getAuthSessionValidity()?.let(Duration::wrap)

    /**
     * Turns off all OAuth interactions for this client.
     *
     * Default: false
     */
    override fun disableOAuth(): Boolean? = unwrap(this).getDisableOAuth()

    /**
     * Enable token revocation for this client.
     *
     * Default: true for new user pool clients
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/token-revocation.html#enable-token-revocation)
     */
    override fun enableTokenRevocation(): Boolean? = unwrap(this).getEnableTokenRevocation()

    /**
     * Whether to generate a client secret.
     *
     * Default: false
     */
    override fun generateSecret(): Boolean? = unwrap(this).getGenerateSecret()

    /**
     * Validity of the ID token.
     *
     * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
     * token validity.
     *
     * Default: Duration.minutes(60)
     *
     * [Documentation](https://docs.aws.amazon.com/en_us/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html#amazon-cognito-user-pools-using-the-id-token)
     */
    override fun idTokenValidity(): Duration? =
        unwrap(this).getIdTokenValidity()?.let(Duration::wrap)

    /**
     * OAuth settings for this client to interact with the app.
     *
     * An error is thrown when this is specified and `disableOAuth` is set.
     *
     * Default: - see defaults in `OAuthSettings`. meaningless if `disableOAuth` is set.
     */
    override fun oAuth(): OAuthSettings? = unwrap(this).getOAuth()?.let(OAuthSettings::wrap)

    /**
     * Whether Cognito returns a UserNotFoundException exception when the user does not exist in the
     * user pool (false), or whether it returns another type of error that doesn't reveal the user's
     * absence.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-managing-errors.html)
     */
    override fun preventUserExistenceErrors(): Boolean? =
        unwrap(this).getPreventUserExistenceErrors()

    /**
     * The set of attributes this client will be able to read.
     *
     * Default: - all standard and custom attributes
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-attribute-permissions-and-scopes)
     */
    override fun readAttributes(): ClientAttributes? =
        unwrap(this).getReadAttributes()?.let(ClientAttributes::wrap)

    /**
     * Validity of the refresh token.
     *
     * Values between 60 minutes and 10 years are valid.
     *
     * Default: Duration.days(30)
     *
     * [Documentation](https://docs.aws.amazon.com/en_us/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html#amazon-cognito-user-pools-using-the-refresh-token)
     */
    override fun refreshTokenValidity(): Duration? =
        unwrap(this).getRefreshTokenValidity()?.let(Duration::wrap)

    /**
     * The list of identity providers that users should be able to use to sign in using this client.
     *
     * Default: - supports all identity providers that are registered with the user pool. If the
     * user pool and/or
     * identity providers are imported, either specify this option explicitly or ensure that the
     * identity providers are
     * registered with the user pool using the `UserPool.registerIdentityProvider()` API.
     */
    override fun supportedIdentityProviders(): List<UserPoolClientIdentityProvider> =
        unwrap(this).getSupportedIdentityProviders()?.map(UserPoolClientIdentityProvider::wrap) ?:
        emptyList()

    /**
     * Name of the application client.
     *
     * Default: - cloudformation generated name
     */
    override fun userPoolClientName(): String? = unwrap(this).getUserPoolClientName()

    /**
     * The set of attributes this client will be able to write.
     *
     * Default: - all standard and custom attributes
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#user-pool-settings-attribute-permissions-and-scopes)
     */
    override fun writeAttributes(): ClientAttributes? =
        unwrap(this).getWriteAttributes()?.let(ClientAttributes::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolClientOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientOptions):
        UserPoolClientOptions = CdkObjectWrappers.wrap(cdkObject) as? UserPoolClientOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolClientOptions):
        software.amazon.awscdk.services.cognito.UserPoolClientOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserPoolClientOptions
  }
}
