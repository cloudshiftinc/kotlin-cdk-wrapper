@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolClient
import software.amazon.awscdk.services.cognito.CfnUserPoolClientProps

@CdkDslMarker
public class CfnUserPoolClientPropsDsl {
  private val cdkBuilder: CfnUserPoolClientProps.Builder = CfnUserPoolClientProps.builder()

  private val _allowedOAuthFlows: MutableList<String> = mutableListOf()

  private val _allowedOAuthScopes: MutableList<String> = mutableListOf()

  private val _callbackUrLs: MutableList<String> = mutableListOf()

  private val _explicitAuthFlows: MutableList<String> = mutableListOf()

  private val _logoutUrLs: MutableList<String> = mutableListOf()

  private val _readAttributes: MutableList<String> = mutableListOf()

  private val _supportedIdentityProviders: MutableList<String> = mutableListOf()

  private val _writeAttributes: MutableList<String> = mutableListOf()

  /**
   * @param accessTokenValidity The access token time limit.
   * After this limit expires, your user can't use their access token. To specify the time unit for
   * `AccessTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a `TokenValidityUnits`
   * value in your API request.
   *
   * For example, when you set `AccessTokenValidity` to `10` and `TokenValidityUnits` to `hours` ,
   * your user can authorize access with their access token for 10 hours.
   *
   * The default time unit for `AccessTokenValidity` in an API request is hours.
   */
  public fun accessTokenValidity(accessTokenValidity: Number) {
    cdkBuilder.accessTokenValidity(accessTokenValidity)
  }

  /**
   * @param allowedOAuthFlows The allowed OAuth flows.
   * * **code** - Use a code grant flow, which provides an authorization code as the response. This
   * code can be exchanged for access tokens with the `/oauth2/token` endpoint.
   * * **implicit** - Issue the access token (and, optionally, ID token, based on scopes) directly
   * to your user.
   * * **client_credentials** - Issue the access token from the `/oauth2/token` endpoint directly to
   * a non-person user using a combination of the client ID and client secret.
   */
  public fun allowedOAuthFlows(vararg allowedOAuthFlows: String) {
    _allowedOAuthFlows.addAll(listOf(*allowedOAuthFlows))
  }

  /**
   * @param allowedOAuthFlows The allowed OAuth flows.
   * * **code** - Use a code grant flow, which provides an authorization code as the response. This
   * code can be exchanged for access tokens with the `/oauth2/token` endpoint.
   * * **implicit** - Issue the access token (and, optionally, ID token, based on scopes) directly
   * to your user.
   * * **client_credentials** - Issue the access token from the `/oauth2/token` endpoint directly to
   * a non-person user using a combination of the client ID and client secret.
   */
  public fun allowedOAuthFlows(allowedOAuthFlows: Collection<String>) {
    _allowedOAuthFlows.addAll(allowedOAuthFlows)
  }

  /**
   * @param allowedOAuthFlowsUserPoolClient Set to true if the client is allowed to follow the OAuth
   * protocol when interacting with Amazon Cognito user pools.
   */
  public fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: Boolean) {
    cdkBuilder.allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient)
  }

  /**
   * @param allowedOAuthFlowsUserPoolClient Set to true if the client is allowed to follow the OAuth
   * protocol when interacting with Amazon Cognito user pools.
   */
  public fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: IResolvable) {
    cdkBuilder.allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient)
  }

  /**
   * @param allowedOAuthScopes The allowed OAuth scopes.
   * Possible values provided by OAuth are `phone` , `email` , `openid` , and `profile` . Possible
   * values provided by AWS are `aws.cognito.signin.user.admin` . Custom scopes created in Resource
   * Servers are also supported.
   */
  public fun allowedOAuthScopes(vararg allowedOAuthScopes: String) {
    _allowedOAuthScopes.addAll(listOf(*allowedOAuthScopes))
  }

  /**
   * @param allowedOAuthScopes The allowed OAuth scopes.
   * Possible values provided by OAuth are `phone` , `email` , `openid` , and `profile` . Possible
   * values provided by AWS are `aws.cognito.signin.user.admin` . Custom scopes created in Resource
   * Servers are also supported.
   */
  public fun allowedOAuthScopes(allowedOAuthScopes: Collection<String>) {
    _allowedOAuthScopes.addAll(allowedOAuthScopes)
  }

  /**
   * @param analyticsConfiguration The user pool analytics configuration for collecting metrics and
   * sending them to your Amazon Pinpoint campaign.
   *
   * In AWS Regions where Amazon Pinpoint isn't available, user pools only support sending events to
   * Amazon Pinpoint projects in AWS Region us-east-1. In Regions where Amazon Pinpoint is available,
   * user pools support sending events to Amazon Pinpoint projects within that same Region.
   */
  public fun analyticsConfiguration(analyticsConfiguration: IResolvable) {
    cdkBuilder.analyticsConfiguration(analyticsConfiguration)
  }

  /**
   * @param analyticsConfiguration The user pool analytics configuration for collecting metrics and
   * sending them to your Amazon Pinpoint campaign.
   *
   * In AWS Regions where Amazon Pinpoint isn't available, user pools only support sending events to
   * Amazon Pinpoint projects in AWS Region us-east-1. In Regions where Amazon Pinpoint is available,
   * user pools support sending events to Amazon Pinpoint projects within that same Region.
   */
  public
      fun analyticsConfiguration(analyticsConfiguration: CfnUserPoolClient.AnalyticsConfigurationProperty) {
    cdkBuilder.analyticsConfiguration(analyticsConfiguration)
  }

  /**
   * @param authSessionValidity Amazon Cognito creates a session token for each API request in an
   * authentication flow.
   * `AuthSessionValidity` is the duration, in minutes, of that session token. Your user pool native
   * user must respond to each authentication challenge before the session expires.
   */
  public fun authSessionValidity(authSessionValidity: Number) {
    cdkBuilder.authSessionValidity(authSessionValidity)
  }

  /**
   * @param callbackUrLs A list of allowed redirect (callback) URLs for the IdPs.
   * A redirect URI must:
   *
   * * Be an absolute URI.
   * * Be registered with the authorization server.
   * * Not include a fragment component.
   *
   * See [OAuth 2.0 - Redirection
   * Endpoint](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6749#section-3.1.2) .
   *
   * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
   *
   * App callback URLs such as myapp://example are also supported.
   */
  public fun callbackUrLs(vararg callbackUrLs: String) {
    _callbackUrLs.addAll(listOf(*callbackUrLs))
  }

  /**
   * @param callbackUrLs A list of allowed redirect (callback) URLs for the IdPs.
   * A redirect URI must:
   *
   * * Be an absolute URI.
   * * Be registered with the authorization server.
   * * Not include a fragment component.
   *
   * See [OAuth 2.0 - Redirection
   * Endpoint](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6749#section-3.1.2) .
   *
   * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
   *
   * App callback URLs such as myapp://example are also supported.
   */
  public fun callbackUrLs(callbackUrLs: Collection<String>) {
    _callbackUrLs.addAll(callbackUrLs)
  }

  /**
   * @param clientName The client name for the user pool client you would like to create.
   */
  public fun clientName(clientName: String) {
    cdkBuilder.clientName(clientName)
  }

  /**
   * @param defaultRedirectUri The default redirect URI. Must be in the `CallbackURLs` list.
   * A redirect URI must:
   *
   * * Be an absolute URI.
   * * Be registered with the authorization server.
   * * Not include a fragment component.
   *
   * See [OAuth 2.0 - Redirection
   * Endpoint](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6749#section-3.1.2) .
   *
   * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
   *
   * App callback URLs such as myapp://example are also supported.
   */
  public fun defaultRedirectUri(defaultRedirectUri: String) {
    cdkBuilder.defaultRedirectUri(defaultRedirectUri)
  }

  /**
   * @param enablePropagateAdditionalUserContextData Activates the propagation of additional user
   * context data.
   * For more information about propagation of user context data, see [Adding advanced security to a
   * user
   * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
   * . If you don’t include this parameter, you can't send device fingerprint information, including
   * source IP address, to Amazon Cognito advanced security. You can only activate
   * `EnablePropagateAdditionalUserContextData` in an app client that has a client secret.
   */
  public
      fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: Boolean) {
    cdkBuilder.enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData)
  }

  /**
   * @param enablePropagateAdditionalUserContextData Activates the propagation of additional user
   * context data.
   * For more information about propagation of user context data, see [Adding advanced security to a
   * user
   * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
   * . If you don’t include this parameter, you can't send device fingerprint information, including
   * source IP address, to Amazon Cognito advanced security. You can only activate
   * `EnablePropagateAdditionalUserContextData` in an app client that has a client secret.
   */
  public
      fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: IResolvable) {
    cdkBuilder.enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData)
  }

  /**
   * @param enableTokenRevocation Activates or deactivates token revocation. For more information
   * about revoking tokens, see
   * [RevokeToken](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html)
   * .
   * If you don't include this parameter, token revocation is automatically activated for the new
   * user pool client.
   */
  public fun enableTokenRevocation(enableTokenRevocation: Boolean) {
    cdkBuilder.enableTokenRevocation(enableTokenRevocation)
  }

  /**
   * @param enableTokenRevocation Activates or deactivates token revocation. For more information
   * about revoking tokens, see
   * [RevokeToken](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html)
   * .
   * If you don't include this parameter, token revocation is automatically activated for the new
   * user pool client.
   */
  public fun enableTokenRevocation(enableTokenRevocation: IResolvable) {
    cdkBuilder.enableTokenRevocation(enableTokenRevocation)
  }

  /**
   * @param explicitAuthFlows The authentication flows that you want your user pool client to
   * support.
   * For each app client in your user pool, you can sign in your users with any combination of one
   * or more flows, including with a user name and Secure Remote Password (SRP), a user name and
   * password, or a custom authentication process that you define with Lambda functions.
   *
   *
   * If you don't specify a value for `ExplicitAuthFlows` , your user client supports
   * `ALLOW_REFRESH_TOKEN_AUTH` , `ALLOW_USER_SRP_AUTH` , and `ALLOW_CUSTOM_AUTH` .
   *
   *
   * Valid values include:
   *
   * * `ALLOW_ADMIN_USER_PASSWORD_AUTH` : Enable admin based user password authentication flow
   * `ADMIN_USER_PASSWORD_AUTH` . This setting replaces the `ADMIN_NO_SRP_AUTH` setting. With this
   * authentication flow, your app passes a user name and password to Amazon Cognito in the request,
   * instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.
   * * `ALLOW_CUSTOM_AUTH` : Enable Lambda trigger based authentication.
   * * `ALLOW_USER_PASSWORD_AUTH` : Enable user password-based authentication. In this flow, Amazon
   * Cognito receives the password in the request instead of using the SRP protocol to verify
   * passwords.
   * * `ALLOW_USER_SRP_AUTH` : Enable SRP-based authentication.
   * * `ALLOW_REFRESH_TOKEN_AUTH` : Enable authflow to refresh tokens.
   *
   * In some environments, you will see the values `ADMIN_NO_SRP_AUTH` , `CUSTOM_AUTH_FLOW_ONLY` ,
   * or `USER_PASSWORD_AUTH` . You can't assign these legacy `ExplicitAuthFlows` values to user pool
   * clients at the same time as values that begin with `ALLOW_` ,
   * like `ALLOW_USER_SRP_AUTH` .
   */
  public fun explicitAuthFlows(vararg explicitAuthFlows: String) {
    _explicitAuthFlows.addAll(listOf(*explicitAuthFlows))
  }

  /**
   * @param explicitAuthFlows The authentication flows that you want your user pool client to
   * support.
   * For each app client in your user pool, you can sign in your users with any combination of one
   * or more flows, including with a user name and Secure Remote Password (SRP), a user name and
   * password, or a custom authentication process that you define with Lambda functions.
   *
   *
   * If you don't specify a value for `ExplicitAuthFlows` , your user client supports
   * `ALLOW_REFRESH_TOKEN_AUTH` , `ALLOW_USER_SRP_AUTH` , and `ALLOW_CUSTOM_AUTH` .
   *
   *
   * Valid values include:
   *
   * * `ALLOW_ADMIN_USER_PASSWORD_AUTH` : Enable admin based user password authentication flow
   * `ADMIN_USER_PASSWORD_AUTH` . This setting replaces the `ADMIN_NO_SRP_AUTH` setting. With this
   * authentication flow, your app passes a user name and password to Amazon Cognito in the request,
   * instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.
   * * `ALLOW_CUSTOM_AUTH` : Enable Lambda trigger based authentication.
   * * `ALLOW_USER_PASSWORD_AUTH` : Enable user password-based authentication. In this flow, Amazon
   * Cognito receives the password in the request instead of using the SRP protocol to verify
   * passwords.
   * * `ALLOW_USER_SRP_AUTH` : Enable SRP-based authentication.
   * * `ALLOW_REFRESH_TOKEN_AUTH` : Enable authflow to refresh tokens.
   *
   * In some environments, you will see the values `ADMIN_NO_SRP_AUTH` , `CUSTOM_AUTH_FLOW_ONLY` ,
   * or `USER_PASSWORD_AUTH` . You can't assign these legacy `ExplicitAuthFlows` values to user pool
   * clients at the same time as values that begin with `ALLOW_` ,
   * like `ALLOW_USER_SRP_AUTH` .
   */
  public fun explicitAuthFlows(explicitAuthFlows: Collection<String>) {
    _explicitAuthFlows.addAll(explicitAuthFlows)
  }

  /**
   * @param generateSecret Boolean to specify whether you want to generate a secret for the user
   * pool client being created.
   */
  public fun generateSecret(generateSecret: Boolean) {
    cdkBuilder.generateSecret(generateSecret)
  }

  /**
   * @param generateSecret Boolean to specify whether you want to generate a secret for the user
   * pool client being created.
   */
  public fun generateSecret(generateSecret: IResolvable) {
    cdkBuilder.generateSecret(generateSecret)
  }

  /**
   * @param idTokenValidity The ID token time limit.
   * After this limit expires, your user can't use their ID token. To specify the time unit for
   * `IdTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a `TokenValidityUnits`
   * value in your API request.
   *
   * For example, when you set `IdTokenValidity` as `10` and `TokenValidityUnits` as `hours` , your
   * user can authenticate their session with their ID token for 10 hours.
   *
   * The default time unit for `IdTokenValidity` in an API request is hours.
   */
  public fun idTokenValidity(idTokenValidity: Number) {
    cdkBuilder.idTokenValidity(idTokenValidity)
  }

  /**
   * @param logoutUrLs A list of allowed logout URLs for the IdPs.
   */
  public fun logoutUrLs(vararg logoutUrLs: String) {
    _logoutUrLs.addAll(listOf(*logoutUrLs))
  }

  /**
   * @param logoutUrLs A list of allowed logout URLs for the IdPs.
   */
  public fun logoutUrLs(logoutUrLs: Collection<String>) {
    _logoutUrLs.addAll(logoutUrLs)
  }

  /**
   * @param preventUserExistenceErrors Use this setting to choose which errors and responses are
   * returned by Cognito APIs during authentication, account confirmation, and password recovery when
   * the user does not exist in the user pool.
   * When set to `ENABLED` and the user does not exist, authentication returns an error indicating
   * either the username or password was incorrect, and account confirmation and password recovery
   * return a response indicating a code was sent to a simulated destination. When set to `LEGACY` ,
   * those APIs will return a `UserNotFoundException` exception if the user does not exist in the user
   * pool.
   */
  public fun preventUserExistenceErrors(preventUserExistenceErrors: String) {
    cdkBuilder.preventUserExistenceErrors(preventUserExistenceErrors)
  }

  /**
   * @param readAttributes The read attributes.
   */
  public fun readAttributes(vararg readAttributes: String) {
    _readAttributes.addAll(listOf(*readAttributes))
  }

  /**
   * @param readAttributes The read attributes.
   */
  public fun readAttributes(readAttributes: Collection<String>) {
    _readAttributes.addAll(readAttributes)
  }

  /**
   * @param refreshTokenValidity The refresh token time limit.
   * After this limit expires, your user can't use their refresh token. To specify the time unit for
   * `RefreshTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a `TokenValidityUnits`
   * value in your API request.
   *
   * For example, when you set `RefreshTokenValidity` as `10` and `TokenValidityUnits` as `days` ,
   * your user can refresh their session and retrieve new access and ID tokens for 10 days.
   *
   * The default time unit for `RefreshTokenValidity` in an API request is days. You can't set
   * `RefreshTokenValidity` to 0. If you do, Amazon Cognito overrides the value with the default value
   * of 30 days.
   */
  public fun refreshTokenValidity(refreshTokenValidity: Number) {
    cdkBuilder.refreshTokenValidity(refreshTokenValidity)
  }

  /**
   * @param supportedIdentityProviders A list of provider names for the identity providers (IdPs)
   * that are supported on this client.
   * The following are supported: `COGNITO` , `Facebook` , `Google` , `SignInWithApple` , and
   * `LoginWithAmazon` . You can also specify the names that you configured for the SAML and OIDC IdPs
   * in your user pool, for example `MySAMLIdP` or `MyOIDCIdP` .
   */
  public fun supportedIdentityProviders(vararg supportedIdentityProviders: String) {
    _supportedIdentityProviders.addAll(listOf(*supportedIdentityProviders))
  }

  /**
   * @param supportedIdentityProviders A list of provider names for the identity providers (IdPs)
   * that are supported on this client.
   * The following are supported: `COGNITO` , `Facebook` , `Google` , `SignInWithApple` , and
   * `LoginWithAmazon` . You can also specify the names that you configured for the SAML and OIDC IdPs
   * in your user pool, for example `MySAMLIdP` or `MyOIDCIdP` .
   */
  public fun supportedIdentityProviders(supportedIdentityProviders: Collection<String>) {
    _supportedIdentityProviders.addAll(supportedIdentityProviders)
  }

  /**
   * @param tokenValidityUnits The units in which the validity times are represented.
   * The default unit for RefreshToken is days, and default for ID and access tokens are hours.
   */
  public fun tokenValidityUnits(tokenValidityUnits: IResolvable) {
    cdkBuilder.tokenValidityUnits(tokenValidityUnits)
  }

  /**
   * @param tokenValidityUnits The units in which the validity times are represented.
   * The default unit for RefreshToken is days, and default for ID and access tokens are hours.
   */
  public fun tokenValidityUnits(tokenValidityUnits: CfnUserPoolClient.TokenValidityUnitsProperty) {
    cdkBuilder.tokenValidityUnits(tokenValidityUnits)
  }

  /**
   * @param userPoolId The user pool ID for the user pool where you want to create a user pool
   * client. 
   */
  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  /**
   * @param writeAttributes The user pool attributes that the app client can write to.
   * If your app client allows users to sign in through an IdP, this array must include all
   * attributes that you have mapped to IdP attributes. Amazon Cognito updates mapped attributes when
   * users sign in to your application through an IdP. If your app client does not have write access to
   * a mapped attribute, Amazon Cognito throws an error when it tries to update the attribute. For more
   * information, see [Specifying IdP Attribute Mappings for Your user
   * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
   * .
   */
  public fun writeAttributes(vararg writeAttributes: String) {
    _writeAttributes.addAll(listOf(*writeAttributes))
  }

  /**
   * @param writeAttributes The user pool attributes that the app client can write to.
   * If your app client allows users to sign in through an IdP, this array must include all
   * attributes that you have mapped to IdP attributes. Amazon Cognito updates mapped attributes when
   * users sign in to your application through an IdP. If your app client does not have write access to
   * a mapped attribute, Amazon Cognito throws an error when it tries to update the attribute. For more
   * information, see [Specifying IdP Attribute Mappings for Your user
   * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
   * .
   */
  public fun writeAttributes(writeAttributes: Collection<String>) {
    _writeAttributes.addAll(writeAttributes)
  }

  public fun build(): CfnUserPoolClientProps {
    if(_allowedOAuthFlows.isNotEmpty()) cdkBuilder.allowedOAuthFlows(_allowedOAuthFlows)
    if(_allowedOAuthScopes.isNotEmpty()) cdkBuilder.allowedOAuthScopes(_allowedOAuthScopes)
    if(_callbackUrLs.isNotEmpty()) cdkBuilder.callbackUrLs(_callbackUrLs)
    if(_explicitAuthFlows.isNotEmpty()) cdkBuilder.explicitAuthFlows(_explicitAuthFlows)
    if(_logoutUrLs.isNotEmpty()) cdkBuilder.logoutUrLs(_logoutUrLs)
    if(_readAttributes.isNotEmpty()) cdkBuilder.readAttributes(_readAttributes)
    if(_supportedIdentityProviders.isNotEmpty())
        cdkBuilder.supportedIdentityProviders(_supportedIdentityProviders)
    if(_writeAttributes.isNotEmpty()) cdkBuilder.writeAttributes(_writeAttributes)
    return cdkBuilder.build()
  }
}
