@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cognito.AuthFlow
import software.amazon.awscdk.services.cognito.ClientAttributes
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.OAuthSettings
import software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider
import software.amazon.awscdk.services.cognito.UserPoolClientProps

/**
 * Properties for the UserPoolClient construct.
 *
 * Example:
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
@CdkDslMarker
public class UserPoolClientPropsDsl {
    private val cdkBuilder: UserPoolClientProps.Builder = UserPoolClientProps.builder()

    private val _supportedIdentityProviders: MutableList<UserPoolClientIdentityProvider> =
        mutableListOf()

    /**
     * @param accessTokenValidity Validity of the access token. Values between 5 minutes and 1 day
     *   are valid. The duration can not be longer than the refresh token validity.
     */
    public fun accessTokenValidity(accessTokenValidity: Duration) {
        cdkBuilder.accessTokenValidity(accessTokenValidity)
    }

    /** @param authFlows The set of OAuth authentication flows to enable on the client. */
    public fun authFlows(authFlows: AuthFlowDsl.() -> Unit = {}) {
        val builder = AuthFlowDsl()
        builder.apply(authFlows)
        cdkBuilder.authFlows(builder.build())
    }

    /** @param authFlows The set of OAuth authentication flows to enable on the client. */
    public fun authFlows(authFlows: AuthFlow) {
        cdkBuilder.authFlows(authFlows)
    }

    /**
     * @param authSessionValidity Cognito creates a session token for each API request in an
     *   authentication flow. AuthSessionValidity is the duration, in minutes, of that session
     *   token. see defaults in `AuthSessionValidity`. Valid duration is from 3 to 15 minutes.
     */
    public fun authSessionValidity(authSessionValidity: Duration) {
        cdkBuilder.authSessionValidity(authSessionValidity)
    }

    /** @param disableOAuth Turns off all OAuth interactions for this client. */
    public fun disableOAuth(disableOAuth: Boolean) {
        cdkBuilder.disableOAuth(disableOAuth)
    }

    /** @param enableTokenRevocation Enable token revocation for this client. */
    public fun enableTokenRevocation(enableTokenRevocation: Boolean) {
        cdkBuilder.enableTokenRevocation(enableTokenRevocation)
    }

    /** @param generateSecret Whether to generate a client secret. */
    public fun generateSecret(generateSecret: Boolean) {
        cdkBuilder.generateSecret(generateSecret)
    }

    /**
     * @param idTokenValidity Validity of the ID token. Values between 5 minutes and 1 day are
     *   valid. The duration can not be longer than the refresh token validity.
     */
    public fun idTokenValidity(idTokenValidity: Duration) {
        cdkBuilder.idTokenValidity(idTokenValidity)
    }

    /**
     * @param oAuth OAuth settings for this client to interact with the app. An error is thrown when
     *   this is specified and `disableOAuth` is set.
     */
    public fun oAuth(oAuth: OAuthSettingsDsl.() -> Unit = {}) {
        val builder = OAuthSettingsDsl()
        builder.apply(oAuth)
        cdkBuilder.oAuth(builder.build())
    }

    /**
     * @param oAuth OAuth settings for this client to interact with the app. An error is thrown when
     *   this is specified and `disableOAuth` is set.
     */
    public fun oAuth(oAuth: OAuthSettings) {
        cdkBuilder.oAuth(oAuth)
    }

    /**
     * @param preventUserExistenceErrors Whether Cognito returns a UserNotFoundException exception
     *   when the user does not exist in the user pool (false), or whether it returns another type
     *   of error that doesn't reveal the user's absence.
     */
    public fun preventUserExistenceErrors(preventUserExistenceErrors: Boolean) {
        cdkBuilder.preventUserExistenceErrors(preventUserExistenceErrors)
    }

    /** @param readAttributes The set of attributes this client will be able to read. */
    public fun readAttributes(readAttributes: ClientAttributes) {
        cdkBuilder.readAttributes(readAttributes)
    }

    /**
     * @param refreshTokenValidity Validity of the refresh token. Values between 60 minutes and 10
     *   years are valid.
     */
    public fun refreshTokenValidity(refreshTokenValidity: Duration) {
        cdkBuilder.refreshTokenValidity(refreshTokenValidity)
    }

    /**
     * @param supportedIdentityProviders The list of identity providers that users should be able to
     *   use to sign in using this client.
     */
    public fun supportedIdentityProviders(
        vararg supportedIdentityProviders: UserPoolClientIdentityProvider
    ) {
        _supportedIdentityProviders.addAll(listOf(*supportedIdentityProviders))
    }

    /**
     * @param supportedIdentityProviders The list of identity providers that users should be able to
     *   use to sign in using this client.
     */
    public fun supportedIdentityProviders(
        supportedIdentityProviders: Collection<UserPoolClientIdentityProvider>
    ) {
        _supportedIdentityProviders.addAll(supportedIdentityProviders)
    }

    /** @param userPool The UserPool resource this client will have access to. */
    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    /** @param userPoolClientName Name of the application client. */
    public fun userPoolClientName(userPoolClientName: String) {
        cdkBuilder.userPoolClientName(userPoolClientName)
    }

    /** @param writeAttributes The set of attributes this client will be able to write. */
    public fun writeAttributes(writeAttributes: ClientAttributes) {
        cdkBuilder.writeAttributes(writeAttributes)
    }

    public fun build(): UserPoolClientProps {
        if (_supportedIdentityProviders.isNotEmpty())
            cdkBuilder.supportedIdentityProviders(_supportedIdentityProviders)
        return cdkBuilder.build()
    }
}
