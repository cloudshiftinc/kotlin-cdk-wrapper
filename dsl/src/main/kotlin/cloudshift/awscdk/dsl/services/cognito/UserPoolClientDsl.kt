@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
import software.amazon.awscdk.services.cognito.UserPoolClient
import software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider
import software.constructs.Construct

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
@CdkDslMarker
public class UserPoolClientDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: UserPoolClient.Builder = UserPoolClient.Builder.create(scope, id)

  private val _supportedIdentityProviders: MutableList<UserPoolClientIdentityProvider> =
      mutableListOf()

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
  public fun accessTokenValidity(accessTokenValidity: Duration) {
    cdkBuilder.accessTokenValidity(accessTokenValidity)
  }

  /**
   * The set of OAuth authentication flows to enable on the client.
   *
   * Default: - all auth flows disabled
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow.html)
   * @param authFlows The set of OAuth authentication flows to enable on the client. 
   */
  public fun authFlows(authFlows: AuthFlowDsl.() -> Unit = {}) {
    val builder = AuthFlowDsl()
    builder.apply(authFlows)
    cdkBuilder.authFlows(builder.build())
  }

  /**
   * The set of OAuth authentication flows to enable on the client.
   *
   * Default: - all auth flows disabled
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow.html)
   * @param authFlows The set of OAuth authentication flows to enable on the client. 
   */
  public fun authFlows(authFlows: AuthFlow) {
    cdkBuilder.authFlows(authFlows)
  }

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
  public fun authSessionValidity(authSessionValidity: Duration) {
    cdkBuilder.authSessionValidity(authSessionValidity)
  }

  /**
   * Turns off all OAuth interactions for this client.
   *
   * Default: false
   *
   * @param disableOAuth Turns off all OAuth interactions for this client. 
   */
  public fun disableOAuth(disableOAuth: Boolean) {
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
  public fun enableTokenRevocation(enableTokenRevocation: Boolean) {
    cdkBuilder.enableTokenRevocation(enableTokenRevocation)
  }

  /**
   * Whether to generate a client secret.
   *
   * Default: false
   *
   * @param generateSecret Whether to generate a client secret. 
   */
  public fun generateSecret(generateSecret: Boolean) {
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
  public fun idTokenValidity(idTokenValidity: Duration) {
    cdkBuilder.idTokenValidity(idTokenValidity)
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
  public fun oAuth(oAuth: OAuthSettingsDsl.() -> Unit = {}) {
    val builder = OAuthSettingsDsl()
    builder.apply(oAuth)
    cdkBuilder.oAuth(builder.build())
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
  public fun oAuth(oAuth: OAuthSettings) {
    cdkBuilder.oAuth(oAuth)
  }

  /**
   * Whether Cognito returns a UserNotFoundException exception when the user does not exist in the
   * user pool (false), or whether it returns another type of error that doesn't reveal the user's
   * absence.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-managing-errors.html)
   * @param preventUserExistenceErrors Whether Cognito returns a UserNotFoundException exception
   * when the user does not exist in the user pool (false), or whether it returns another type of error
   * that doesn't reveal the user's absence. 
   */
  public fun preventUserExistenceErrors(preventUserExistenceErrors: Boolean) {
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
  public fun readAttributes(readAttributes: ClientAttributes) {
    cdkBuilder.readAttributes(readAttributes)
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
  public fun refreshTokenValidity(refreshTokenValidity: Duration) {
    cdkBuilder.refreshTokenValidity(refreshTokenValidity)
  }

  /**
   * The list of identity providers that users should be able to use to sign in using this client.
   *
   * Default: - supports all identity providers that are registered with the user pool. If the user
   * pool and/or
   * identity providers are imported, either specify this option explicitly or ensure that the
   * identity providers are
   * registered with the user pool using the `UserPool.registerIdentityProvider()` API.
   *
   * @param supportedIdentityProviders The list of identity providers that users should be able to
   * use to sign in using this client. 
   */
  public fun supportedIdentityProviders(vararg
      supportedIdentityProviders: UserPoolClientIdentityProvider) {
    _supportedIdentityProviders.addAll(listOf(*supportedIdentityProviders))
  }

  /**
   * The list of identity providers that users should be able to use to sign in using this client.
   *
   * Default: - supports all identity providers that are registered with the user pool. If the user
   * pool and/or
   * identity providers are imported, either specify this option explicitly or ensure that the
   * identity providers are
   * registered with the user pool using the `UserPool.registerIdentityProvider()` API.
   *
   * @param supportedIdentityProviders The list of identity providers that users should be able to
   * use to sign in using this client. 
   */
  public
      fun supportedIdentityProviders(supportedIdentityProviders: Collection<UserPoolClientIdentityProvider>) {
    _supportedIdentityProviders.addAll(supportedIdentityProviders)
  }

  /**
   * The UserPool resource this client will have access to.
   *
   * @param userPool The UserPool resource this client will have access to. 
   */
  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  /**
   * Name of the application client.
   *
   * Default: - cloudformation generated name
   *
   * @param userPoolClientName Name of the application client. 
   */
  public fun userPoolClientName(userPoolClientName: String) {
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
  public fun writeAttributes(writeAttributes: ClientAttributes) {
    cdkBuilder.writeAttributes(writeAttributes)
  }

  public fun build(): UserPoolClient {
    if(_supportedIdentityProviders.isNotEmpty())
        cdkBuilder.supportedIdentityProviders(_supportedIdentityProviders)
    return cdkBuilder.build()
  }
}
