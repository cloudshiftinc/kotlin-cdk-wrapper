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
 * Properties for the UserPoolClient construct.
 *
 * Example:
 *
 * ```
 * UserPool importedPool;
 * UserPoolClient userPoolClient = UserPoolClient.Builder.create(this, "UserPoolClient")
 * .userPool(importedPool)
 * .generateSecret(true)
 * .build();
 * // Allows you to pass the generated secret to other pieces of infrastructure
 * SecretValue secret = userPoolClient.getUserPoolClientSecret();
 * ```
 */
public interface UserPoolClientProps : UserPoolClientOptions {
  /**
   * The UserPool resource this client will have access to.
   */
  public fun userPool(): IUserPool

  /**
   * A builder for [UserPoolClientProps]
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
    @JvmName("d31c00fb95139c9bad265ea6f1a4fd04a164637660d9c93124841e50458bc6ad")
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
    @JvmName("621d37efe4019acde8c371f44054d86129f0fa508b8f5e3e86957726bf5659fe")
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
     * @param userPool The UserPool resource this client will have access to. 
     */
    public fun userPool(userPool: IUserPool)

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
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolClientProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolClientProps.builder()

    /**
     * @param accessTokenValidity Validity of the access token.
     * Values between 5 minutes and 1 day are valid. The duration can not be longer than the refresh
     * token validity.
     */
    override fun accessTokenValidity(accessTokenValidity: Duration) {
      cdkBuilder.accessTokenValidity(accessTokenValidity.let(Duration::unwrap))
    }

    /**
     * @param authFlows The set of OAuth authentication flows to enable on the client.
     */
    override fun authFlows(authFlows: AuthFlow) {
      cdkBuilder.authFlows(authFlows.let(AuthFlow::unwrap))
    }

    /**
     * @param authFlows The set of OAuth authentication flows to enable on the client.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d31c00fb95139c9bad265ea6f1a4fd04a164637660d9c93124841e50458bc6ad")
    override fun authFlows(authFlows: AuthFlow.Builder.() -> Unit): Unit =
        authFlows(AuthFlow(authFlows))

    /**
     * @param authSessionValidity Cognito creates a session token for each API request in an
     * authentication flow.
     * AuthSessionValidity is the duration, in minutes, of that session token.
     * see defaults in `AuthSessionValidity`. Valid duration is from 3 to 15 minutes.
     */
    override fun authSessionValidity(authSessionValidity: Duration) {
      cdkBuilder.authSessionValidity(authSessionValidity.let(Duration::unwrap))
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
      cdkBuilder.idTokenValidity(idTokenValidity.let(Duration::unwrap))
    }

    /**
     * @param oAuth OAuth settings for this client to interact with the app.
     * An error is thrown when this is specified and `disableOAuth` is set.
     */
    override fun oAuth(oAuth: OAuthSettings) {
      cdkBuilder.oAuth(oAuth.let(OAuthSettings::unwrap))
    }

    /**
     * @param oAuth OAuth settings for this client to interact with the app.
     * An error is thrown when this is specified and `disableOAuth` is set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("621d37efe4019acde8c371f44054d86129f0fa508b8f5e3e86957726bf5659fe")
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
      cdkBuilder.readAttributes(readAttributes.let(ClientAttributes::unwrap))
    }

    /**
     * @param refreshTokenValidity Validity of the refresh token.
     * Values between 60 minutes and 10 years are valid.
     */
    override fun refreshTokenValidity(refreshTokenValidity: Duration) {
      cdkBuilder.refreshTokenValidity(refreshTokenValidity.let(Duration::unwrap))
    }

    /**
     * @param supportedIdentityProviders The list of identity providers that users should be able to
     * use to sign in using this client.
     */
    override
        fun supportedIdentityProviders(supportedIdentityProviders: List<UserPoolClientIdentityProvider>) {
      cdkBuilder.supportedIdentityProviders(supportedIdentityProviders.map(UserPoolClientIdentityProvider::unwrap))
    }

    /**
     * @param supportedIdentityProviders The list of identity providers that users should be able to
     * use to sign in using this client.
     */
    override fun supportedIdentityProviders(vararg
        supportedIdentityProviders: UserPoolClientIdentityProvider): Unit =
        supportedIdentityProviders(supportedIdentityProviders.toList())

    /**
     * @param userPool The UserPool resource this client will have access to. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

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
      cdkBuilder.writeAttributes(writeAttributes.let(ClientAttributes::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolClientProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientProps,
  ) : CdkObject(cdkObject), UserPoolClientProps {
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
     * The UserPool resource this client will have access to.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolClientProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientProps):
        UserPoolClientProps = CdkObjectWrappers.wrap(cdkObject) as? UserPoolClientProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolClientProps):
        software.amazon.awscdk.services.cognito.UserPoolClientProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserPoolClientProps
  }
}
