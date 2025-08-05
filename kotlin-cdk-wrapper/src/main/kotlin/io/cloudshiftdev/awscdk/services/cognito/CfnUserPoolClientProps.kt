@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUserPoolClient`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolClientProps cfnUserPoolClientProps = CfnUserPoolClientProps.builder()
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .accessTokenValidity(123)
 * .allowedOAuthFlows(List.of("allowedOAuthFlows"))
 * .allowedOAuthFlowsUserPoolClient(false)
 * .allowedOAuthScopes(List.of("allowedOAuthScopes"))
 * .analyticsConfiguration(AnalyticsConfigurationProperty.builder()
 * .applicationArn("applicationArn")
 * .applicationId("applicationId")
 * .externalId("externalId")
 * .roleArn("roleArn")
 * .userDataShared(false)
 * .build())
 * .authSessionValidity(123)
 * .callbackUrLs(List.of("callbackUrLs"))
 * .clientName("clientName")
 * .defaultRedirectUri("defaultRedirectUri")
 * .enablePropagateAdditionalUserContextData(false)
 * .enableTokenRevocation(false)
 * .explicitAuthFlows(List.of("explicitAuthFlows"))
 * .generateSecret(false)
 * .idTokenValidity(123)
 * .logoutUrLs(List.of("logoutUrLs"))
 * .preventUserExistenceErrors("preventUserExistenceErrors")
 * .readAttributes(List.of("readAttributes"))
 * .refreshTokenRotation(RefreshTokenRotationProperty.builder()
 * .feature("feature")
 * .retryGracePeriodSeconds(123)
 * .build())
 * .refreshTokenValidity(123)
 * .supportedIdentityProviders(List.of("supportedIdentityProviders"))
 * .tokenValidityUnits(TokenValidityUnitsProperty.builder()
 * .accessToken("accessToken")
 * .idToken("idToken")
 * .refreshToken("refreshToken")
 * .build())
 * .writeAttributes(List.of("writeAttributes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html)
 */
public interface CfnUserPoolClientProps {
  /**
   * The access token time limit.
   *
   * After this limit expires, your user can't use their access token. To specify the time unit for
   * `AccessTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a `TokenValidityUnits`
   * value in your API request.
   *
   * For example, when you set `AccessTokenValidity` to `10` and `TokenValidityUnits` to `hours` ,
   * your user can authorize access with
   * their access token for 10 hours.
   *
   * The default time unit for `AccessTokenValidity` in an API request is hours. *Valid range* is
   * displayed below in seconds.
   *
   * If you don't specify otherwise in the configuration of your app client, your access
   * tokens are valid for one hour.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-accesstokenvalidity)
   */
  public fun accessTokenValidity(): Number? = unwrap(this).getAccessTokenValidity()

  /**
   * The OAuth grant types that you want your app client to generate for clients in managed login
   * authentication.
   *
   * To create an app client that generates client credentials grants, you must add
   * `client_credentials` as the only allowed OAuth flow.
   *
   * * **code** - Use a code grant flow, which provides an authorization code as the response. This
   * code can be exchanged for access tokens with the `/oauth2/token` endpoint.
   * * **implicit** - Issue the access token, and the ID token when scopes like `openid` and
   * `profile` are requested, directly to your user.
   * * **client_credentials** - Issue the access token from the `/oauth2/token` endpoint directly to
   * a non-person user, authorized by a combination of the client ID and client secret.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthflows)
   */
  public fun allowedOAuthFlows(): List<String> = unwrap(this).getAllowedOAuthFlows() ?: emptyList()

  /**
   * Set to `true` to use OAuth 2.0 authorization server features in your app client.
   *
   * This parameter must have a value of `true` before you can configure the following features in
   * your app client.
   *
   * * `CallBackURLs` : Callback URLs.
   * * `LogoutURLs` : Sign-out redirect URLs.
   * * `AllowedOAuthScopes` : OAuth 2.0 scopes.
   * * `AllowedOAuthFlows` : Support for authorization code, implicit, and client credentials OAuth
   * 2.0 grants.
   *
   * To use authorization server features, configure one of these features in the Amazon Cognito
   * console or set `AllowedOAuthFlowsUserPoolClient` to `true` in a `CreateUserPoolClient` or
   * `UpdateUserPoolClient` API request. If you don't set a value for `AllowedOAuthFlowsUserPoolClient`
   * in a request with the AWS CLI or SDKs, it defaults to `false` . When `false` , only SDK-based API
   * sign-in is permitted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthflowsuserpoolclient)
   */
  public fun allowedOAuthFlowsUserPoolClient(): Any? =
      unwrap(this).getAllowedOAuthFlowsUserPoolClient()

  /**
   * The OAuth, OpenID Connect (OIDC), and custom scopes that you want to permit your app client to
   * authorize access with.
   *
   * Scopes govern access control to user pool self-service API operations, user data from the
   * `userInfo` endpoint, and third-party APIs. Scope values include `phone` , `email` , `openid` , and
   * `profile` . The `aws.cognito.signin.user.admin` scope authorizes user self-service operations.
   * Custom scopes with resource servers authorize access to external APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthscopes)
   */
  public fun allowedOAuthScopes(): List<String> = unwrap(this).getAllowedOAuthScopes() ?:
      emptyList()

  /**
   * The user pool analytics configuration for collecting metrics and sending them to your Amazon
   * Pinpoint campaign.
   *
   * In AWS Regions where Amazon Pinpoint isn't available, user pools might not have access to
   * analytics or might be configurable with campaigns in the US East (N. Virginia) Region. For more
   * information, see [Using Amazon Pinpoint
   * analytics](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-pinpoint-integration.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-analyticsconfiguration)
   */
  public fun analyticsConfiguration(): Any? = unwrap(this).getAnalyticsConfiguration()

  /**
   * Amazon Cognito creates a session token for each API request in an authentication flow.
   *
   * `AuthSessionValidity` is the duration, in minutes, of that session token. Your user pool native
   * user must respond to each authentication challenge before the session expires.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-authsessionvalidity)
   */
  public fun authSessionValidity(): Number? = unwrap(this).getAuthSessionValidity()

  /**
   * A list of allowed redirect, or callback, URLs for managed login authentication.
   *
   * These URLs are the paths where you want to send your users' browsers after they complete
   * authentication with managed login or a third-party IdP. Typically, callback URLs are the home of
   * an application that uses OAuth or OIDC libraries to process authentication outcomes.
   *
   * A redirect URI must meet the following requirements:
   *
   * * Be an absolute URI.
   * * Be registered with the authorization server. Amazon Cognito doesn't accept authorization
   * requests with `redirect_uri` values that aren't in the list of `CallbackURLs` that you provide in
   * this parameter.
   * * Not include a fragment component.
   *
   * See [OAuth 2.0 - Redirection
   * Endpoint](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6749#section-3.1.2) .
   *
   * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
   *
   * App callback URLs such as myapp://example are also supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-callbackurls)
   */
  public fun callbackUrLs(): List<String> = unwrap(this).getCallbackUrLs() ?: emptyList()

  /**
   * A friendly name for the app client that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname)
   */
  public fun clientName(): String? = unwrap(this).getClientName()

  /**
   * The default redirect URI.
   *
   * In app clients with one assigned IdP, replaces `redirect_uri` in authentication requests. Must
   * be in the `CallbackURLs` list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-defaultredirecturi)
   */
  public fun defaultRedirectUri(): String? = unwrap(this).getDefaultRedirectUri()

  /**
   * When `true` , your application can include additional `UserContextData` in authentication
   * requests.
   *
   * This data includes the IP address, and contributes to analysis by threat protection features.
   * For more information about propagation of user context data, see [Adding session data to API
   * requests](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint)
   * . If you don’t include this parameter, you can't send the source IP address to Amazon Cognito
   * threat protection features. You can only activate `EnablePropagateAdditionalUserContextData` in an
   * app client that has a client secret.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-enablepropagateadditionalusercontextdata)
   */
  public fun enablePropagateAdditionalUserContextData(): Any? =
      unwrap(this).getEnablePropagateAdditionalUserContextData()

  /**
   * Activates or deactivates token revocation.
   *
   * If you don't include this parameter, token revocation is automatically activated for the new
   * user pool client.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-enabletokenrevocation)
   */
  public fun enableTokenRevocation(): Any? = unwrap(this).getEnableTokenRevocation()

  /**
   * The [authentication
   * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
   * that you want your user pool client to support. For each app client in your user pool, you can
   * sign in your users with any combination of one or more flows, including with a user name and
   * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
   * you define with Lambda functions.
   *
   *
   * If you don't specify a value for `ExplicitAuthFlows` , your app client supports
   * `ALLOW_REFRESH_TOKEN_AUTH` , `ALLOW_USER_SRP_AUTH` , and `ALLOW_CUSTOM_AUTH` .
   *
   *
   * The values for authentication flow options include the following.
   *
   * * `ALLOW_USER_AUTH` : Enable selection-based sign-in with `USER_AUTH` . This setting covers
   * username-password, secure remote password (SRP), passwordless, and passkey authentication. This
   * authentiation flow can do username-password and SRP authentication without other
   * `ExplicitAuthFlows` permitting them. For example users can complete an SRP challenge through
   * `USER_AUTH` without the flow `USER_SRP_AUTH` being active for the app client. This flow doesn't
   * include `CUSTOM_AUTH` .
   *
   * To activate this setting, your user pool must be in the [Essentials
   * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
   * or higher.
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
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows)
   */
  public fun explicitAuthFlows(): List<String> = unwrap(this).getExplicitAuthFlows() ?: emptyList()

  /**
   * When `true` , generates a client secret for the app client.
   *
   * Client secrets are used with server-side and machine-to-machine applications. Client secrets
   * are automatically generated; you can't specify a secret value. For more information, see [App
   * client
   * types](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html#user-pool-settings-client-app-client-types)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret)
   */
  public fun generateSecret(): Any? = unwrap(this).getGenerateSecret()

  /**
   * The ID token time limit.
   *
   * After this limit expires, your user can't use their ID token. To specify the time unit for
   * `IdTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a `TokenValidityUnits`
   * value in your API request.
   *
   * For example, when you set `IdTokenValidity` as `10` and `TokenValidityUnits` as `hours` , your
   * user can authenticate their session with their ID token for 10 hours.
   *
   * The default time unit for `IdTokenValidity` in an API request is hours. *Valid range* is
   * displayed below in seconds.
   *
   * If you don't specify otherwise in the configuration of your app client, your ID
   * tokens are valid for one hour.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-idtokenvalidity)
   */
  public fun idTokenValidity(): Number? = unwrap(this).getIdTokenValidity()

  /**
   * A list of allowed logout URLs for managed login authentication.
   *
   * When you pass `logout_uri` and `client_id` parameters to `/logout` , Amazon Cognito signs out
   * your user and redirects them to the logout URL. This parameter describes the URLs that you want to
   * be the permitted targets of `logout_uri` . A typical use of these URLs is when a user selects
   * "Sign out" and you redirect them to your public homepage. For more information, see [Logout
   * endpoint](https://docs.aws.amazon.com/cognito/latest/developerguide/logout-endpoint.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-logouturls)
   */
  public fun logoutUrLs(): List<String> = unwrap(this).getLogoutUrLs() ?: emptyList()

  /**
   * Errors and responses that you want Amazon Cognito APIs to return during authentication, account
   * confirmation, and password recovery when the user doesn't exist in the user pool.
   *
   * When set to `ENABLED` and the user doesn't exist, authentication returns an error indicating
   * either the username or password was incorrect. Account confirmation and password recovery return a
   * response indicating a code was sent to a simulated destination. When set to `LEGACY` , those APIs
   * return a `UserNotFoundException` exception if the user doesn't exist in the user pool.
   *
   * Valid values include:
   *
   * * `ENABLED` - This prevents user existence-related errors.
   * * `LEGACY` - This represents the early behavior of Amazon Cognito where user existence related
   * errors aren't prevented.
   *
   * Defaults to `LEGACY` when you don't provide a value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-preventuserexistenceerrors)
   */
  public fun preventUserExistenceErrors(): String? = unwrap(this).getPreventUserExistenceErrors()

  /**
   * The list of user attributes that you want your app client to have read access to.
   *
   * After your user authenticates in your app, their access token authorizes them to read their own
   * attribute value for any attribute in this list. An example of this kind of activity is when your
   * user selects a link to view their profile information.
   *
   * When you don't specify the `ReadAttributes` for your app client, your app can read the values
   * of `email_verified` , `phone_number_verified` , and the Standard attributes of your user pool.
   * When your user pool app client has read access to these default attributes, `ReadAttributes`
   * doesn't return any information. Amazon Cognito only populates `ReadAttributes` in the API response
   * if you have specified your own custom set of read attributes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes)
   */
  public fun readAttributes(): List<String> = unwrap(this).getReadAttributes() ?: emptyList()

  /**
   * The configuration of your app client for refresh token rotation.
   *
   * When enabled, your app client issues new ID, access, and refresh tokens when users renew their
   * sessions with refresh tokens. When disabled, token refresh issues only ID and access tokens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenrotation)
   */
  public fun refreshTokenRotation(): Any? = unwrap(this).getRefreshTokenRotation()

  /**
   * The refresh token time limit.
   *
   * After this limit expires, your user can't use their refresh token. To specify the time unit for
   * `RefreshTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a `TokenValidityUnits`
   * value in your API request.
   *
   * For example, when you set `RefreshTokenValidity` as `10` and `TokenValidityUnits` as `days` ,
   * your user can refresh their session
   * and retrieve new access and ID tokens for 10 days.
   *
   * The default time unit for `RefreshTokenValidity` in an API request is days. You can't set
   * `RefreshTokenValidity` to 0. If you do, Amazon Cognito overrides the value with the default value
   * of 30 days. *Valid range* is displayed below in seconds.
   *
   * If you don't specify otherwise in the configuration of your app client, your refresh
   * tokens are valid for 30 days.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity)
   */
  public fun refreshTokenValidity(): Number? = unwrap(this).getRefreshTokenValidity()

  /**
   * A list of provider names for the identity providers (IdPs) that are supported on this client.
   *
   * The following are supported: `COGNITO` , `Facebook` , `Google` , `SignInWithApple` , and
   * `LoginWithAmazon` . You can also specify the names that you configured for the SAML and OIDC IdPs
   * in your user pool, for example `MySAMLIdP` or `MyOIDCIdP` .
   *
   * This parameter sets the IdPs that [managed
   * login](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-managed-login.html)
   * will display on the login page for your app client. The removal of `COGNITO` from this list
   * doesn't prevent authentication operations for local users with the user pools API in an AWS SDK.
   * The only way to prevent SDK-based authentication is to block access with a [AWS WAF
   * rule](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-waf.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-supportedidentityproviders)
   */
  public fun supportedIdentityProviders(): List<String> =
      unwrap(this).getSupportedIdentityProviders() ?: emptyList()

  /**
   * The units that validity times are represented in.
   *
   * The default unit for refresh tokens is days, and the default for ID and access tokens are
   * hours.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-tokenvalidityunits)
   */
  public fun tokenValidityUnits(): Any? = unwrap(this).getTokenValidityUnits()

  /**
   * The ID of the user pool where you want to create an app client.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid)
   */
  public fun userPoolId(): String

  /**
   * The list of user attributes that you want your app client to have write access to.
   *
   * After your user authenticates in your app, their access token authorizes them to set or modify
   * their own attribute value for any attribute in this list.
   *
   * When you don't specify the `WriteAttributes` for your app client, your app can write the values
   * of the Standard attributes of your user pool. When your user pool has write access to these
   * default attributes, `WriteAttributes` doesn't return any information. Amazon Cognito only
   * populates `WriteAttributes` in the API response if you have specified your own custom set of write
   * attributes.
   *
   * If your app client allows users to sign in through an IdP, this array must include all
   * attributes that you have mapped to IdP attributes. Amazon Cognito updates mapped attributes when
   * users sign in to your application through an IdP. If your app client does not have write access to
   * a mapped attribute, Amazon Cognito throws an error when it tries to update the attribute. For more
   * information, see [Specifying IdP Attribute Mappings for Your user
   * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes)
   */
  public fun writeAttributes(): List<String> = unwrap(this).getWriteAttributes() ?: emptyList()

  /**
   * A builder for [CfnUserPoolClientProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessTokenValidity The access token time limit.
     * After this limit expires, your user can't use their access token. To specify the time unit
     * for `AccessTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a
     * `TokenValidityUnits` value in your API request.
     *
     * For example, when you set `AccessTokenValidity` to `10` and `TokenValidityUnits` to `hours` ,
     * your user can authorize access with
     * their access token for 10 hours.
     *
     * The default time unit for `AccessTokenValidity` in an API request is hours. *Valid range* is
     * displayed below in seconds.
     *
     * If you don't specify otherwise in the configuration of your app client, your access
     * tokens are valid for one hour.
     */
    public fun accessTokenValidity(accessTokenValidity: Number)

    /**
     * @param allowedOAuthFlows The OAuth grant types that you want your app client to generate for
     * clients in managed login authentication.
     * To create an app client that generates client credentials grants, you must add
     * `client_credentials` as the only allowed OAuth flow.
     *
     * * **code** - Use a code grant flow, which provides an authorization code as the response.
     * This code can be exchanged for access tokens with the `/oauth2/token` endpoint.
     * * **implicit** - Issue the access token, and the ID token when scopes like `openid` and
     * `profile` are requested, directly to your user.
     * * **client_credentials** - Issue the access token from the `/oauth2/token` endpoint directly
     * to a non-person user, authorized by a combination of the client ID and client secret.
     */
    public fun allowedOAuthFlows(allowedOAuthFlows: List<String>)

    /**
     * @param allowedOAuthFlows The OAuth grant types that you want your app client to generate for
     * clients in managed login authentication.
     * To create an app client that generates client credentials grants, you must add
     * `client_credentials` as the only allowed OAuth flow.
     *
     * * **code** - Use a code grant flow, which provides an authorization code as the response.
     * This code can be exchanged for access tokens with the `/oauth2/token` endpoint.
     * * **implicit** - Issue the access token, and the ID token when scopes like `openid` and
     * `profile` are requested, directly to your user.
     * * **client_credentials** - Issue the access token from the `/oauth2/token` endpoint directly
     * to a non-person user, authorized by a combination of the client ID and client secret.
     */
    public fun allowedOAuthFlows(vararg allowedOAuthFlows: String)

    /**
     * @param allowedOAuthFlowsUserPoolClient Set to `true` to use OAuth 2.0 authorization server
     * features in your app client.
     * This parameter must have a value of `true` before you can configure the following features in
     * your app client.
     *
     * * `CallBackURLs` : Callback URLs.
     * * `LogoutURLs` : Sign-out redirect URLs.
     * * `AllowedOAuthScopes` : OAuth 2.0 scopes.
     * * `AllowedOAuthFlows` : Support for authorization code, implicit, and client credentials
     * OAuth 2.0 grants.
     *
     * To use authorization server features, configure one of these features in the Amazon Cognito
     * console or set `AllowedOAuthFlowsUserPoolClient` to `true` in a `CreateUserPoolClient` or
     * `UpdateUserPoolClient` API request. If you don't set a value for
     * `AllowedOAuthFlowsUserPoolClient` in a request with the AWS CLI or SDKs, it defaults to `false`
     * . When `false` , only SDK-based API sign-in is permitted.
     */
    public fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: Boolean)

    /**
     * @param allowedOAuthFlowsUserPoolClient Set to `true` to use OAuth 2.0 authorization server
     * features in your app client.
     * This parameter must have a value of `true` before you can configure the following features in
     * your app client.
     *
     * * `CallBackURLs` : Callback URLs.
     * * `LogoutURLs` : Sign-out redirect URLs.
     * * `AllowedOAuthScopes` : OAuth 2.0 scopes.
     * * `AllowedOAuthFlows` : Support for authorization code, implicit, and client credentials
     * OAuth 2.0 grants.
     *
     * To use authorization server features, configure one of these features in the Amazon Cognito
     * console or set `AllowedOAuthFlowsUserPoolClient` to `true` in a `CreateUserPoolClient` or
     * `UpdateUserPoolClient` API request. If you don't set a value for
     * `AllowedOAuthFlowsUserPoolClient` in a request with the AWS CLI or SDKs, it defaults to `false`
     * . When `false` , only SDK-based API sign-in is permitted.
     */
    public fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: IResolvable)

    /**
     * @param allowedOAuthScopes The OAuth, OpenID Connect (OIDC), and custom scopes that you want
     * to permit your app client to authorize access with.
     * Scopes govern access control to user pool self-service API operations, user data from the
     * `userInfo` endpoint, and third-party APIs. Scope values include `phone` , `email` , `openid` ,
     * and `profile` . The `aws.cognito.signin.user.admin` scope authorizes user self-service
     * operations. Custom scopes with resource servers authorize access to external APIs.
     */
    public fun allowedOAuthScopes(allowedOAuthScopes: List<String>)

    /**
     * @param allowedOAuthScopes The OAuth, OpenID Connect (OIDC), and custom scopes that you want
     * to permit your app client to authorize access with.
     * Scopes govern access control to user pool self-service API operations, user data from the
     * `userInfo` endpoint, and third-party APIs. Scope values include `phone` , `email` , `openid` ,
     * and `profile` . The `aws.cognito.signin.user.admin` scope authorizes user self-service
     * operations. Custom scopes with resource servers authorize access to external APIs.
     */
    public fun allowedOAuthScopes(vararg allowedOAuthScopes: String)

    /**
     * @param analyticsConfiguration The user pool analytics configuration for collecting metrics
     * and sending them to your Amazon Pinpoint campaign.
     * In AWS Regions where Amazon Pinpoint isn't available, user pools might not have access to
     * analytics or might be configurable with campaigns in the US East (N. Virginia) Region. For more
     * information, see [Using Amazon Pinpoint
     * analytics](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-pinpoint-integration.html)
     * .
     */
    public fun analyticsConfiguration(analyticsConfiguration: IResolvable)

    /**
     * @param analyticsConfiguration The user pool analytics configuration for collecting metrics
     * and sending them to your Amazon Pinpoint campaign.
     * In AWS Regions where Amazon Pinpoint isn't available, user pools might not have access to
     * analytics or might be configurable with campaigns in the US East (N. Virginia) Region. For more
     * information, see [Using Amazon Pinpoint
     * analytics](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-pinpoint-integration.html)
     * .
     */
    public
        fun analyticsConfiguration(analyticsConfiguration: CfnUserPoolClient.AnalyticsConfigurationProperty)

    /**
     * @param analyticsConfiguration The user pool analytics configuration for collecting metrics
     * and sending them to your Amazon Pinpoint campaign.
     * In AWS Regions where Amazon Pinpoint isn't available, user pools might not have access to
     * analytics or might be configurable with campaigns in the US East (N. Virginia) Region. For more
     * information, see [Using Amazon Pinpoint
     * analytics](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-pinpoint-integration.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c18567dee94105c1859d6ab6b5fae6ab35e46a673e0c037496e3dc5a4fdac6f")
    public
        fun analyticsConfiguration(analyticsConfiguration: CfnUserPoolClient.AnalyticsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param authSessionValidity Amazon Cognito creates a session token for each API request in an
     * authentication flow.
     * `AuthSessionValidity` is the duration, in minutes, of that session token. Your user pool
     * native user must respond to each authentication challenge before the session expires.
     */
    public fun authSessionValidity(authSessionValidity: Number)

    /**
     * @param callbackUrLs A list of allowed redirect, or callback, URLs for managed login
     * authentication.
     * These URLs are the paths where you want to send your users' browsers after they complete
     * authentication with managed login or a third-party IdP. Typically, callback URLs are the home of
     * an application that uses OAuth or OIDC libraries to process authentication outcomes.
     *
     * A redirect URI must meet the following requirements:
     *
     * * Be an absolute URI.
     * * Be registered with the authorization server. Amazon Cognito doesn't accept authorization
     * requests with `redirect_uri` values that aren't in the list of `CallbackURLs` that you provide
     * in this parameter.
     * * Not include a fragment component.
     *
     * See [OAuth 2.0 - Redirection
     * Endpoint](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6749#section-3.1.2) .
     *
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes
     * only.
     *
     * App callback URLs such as myapp://example are also supported.
     */
    public fun callbackUrLs(callbackUrLs: List<String>)

    /**
     * @param callbackUrLs A list of allowed redirect, or callback, URLs for managed login
     * authentication.
     * These URLs are the paths where you want to send your users' browsers after they complete
     * authentication with managed login or a third-party IdP. Typically, callback URLs are the home of
     * an application that uses OAuth or OIDC libraries to process authentication outcomes.
     *
     * A redirect URI must meet the following requirements:
     *
     * * Be an absolute URI.
     * * Be registered with the authorization server. Amazon Cognito doesn't accept authorization
     * requests with `redirect_uri` values that aren't in the list of `CallbackURLs` that you provide
     * in this parameter.
     * * Not include a fragment component.
     *
     * See [OAuth 2.0 - Redirection
     * Endpoint](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6749#section-3.1.2) .
     *
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes
     * only.
     *
     * App callback URLs such as myapp://example are also supported.
     */
    public fun callbackUrLs(vararg callbackUrLs: String)

    /**
     * @param clientName A friendly name for the app client that you want to create.
     */
    public fun clientName(clientName: String)

    /**
     * @param defaultRedirectUri The default redirect URI.
     * In app clients with one assigned IdP, replaces `redirect_uri` in authentication requests.
     * Must be in the `CallbackURLs` list.
     */
    public fun defaultRedirectUri(defaultRedirectUri: String)

    /**
     * @param enablePropagateAdditionalUserContextData When `true` , your application can include
     * additional `UserContextData` in authentication requests.
     * This data includes the IP address, and contributes to analysis by threat protection features.
     * For more information about propagation of user context data, see [Adding session data to API
     * requests](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint)
     * . If you don’t include this parameter, you can't send the source IP address to Amazon Cognito
     * threat protection features. You can only activate `EnablePropagateAdditionalUserContextData` in
     * an app client that has a client secret.
     */
    public
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: Boolean)

    /**
     * @param enablePropagateAdditionalUserContextData When `true` , your application can include
     * additional `UserContextData` in authentication requests.
     * This data includes the IP address, and contributes to analysis by threat protection features.
     * For more information about propagation of user context data, see [Adding session data to API
     * requests](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint)
     * . If you don’t include this parameter, you can't send the source IP address to Amazon Cognito
     * threat protection features. You can only activate `EnablePropagateAdditionalUserContextData` in
     * an app client that has a client secret.
     */
    public
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: IResolvable)

    /**
     * @param enableTokenRevocation Activates or deactivates token revocation.
     * If you don't include this parameter, token revocation is automatically activated for the new
     * user pool client.
     */
    public fun enableTokenRevocation(enableTokenRevocation: Boolean)

    /**
     * @param enableTokenRevocation Activates or deactivates token revocation.
     * If you don't include this parameter, token revocation is automatically activated for the new
     * user pool client.
     */
    public fun enableTokenRevocation(enableTokenRevocation: IResolvable)

    /**
     * @param explicitAuthFlows The [authentication
     * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
     * that you want your user pool client to support. For each app client in your user pool, you can
     * sign in your users with any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
     * you define with Lambda functions.
     *
     * If you don't specify a value for `ExplicitAuthFlows` , your app client supports
     * `ALLOW_REFRESH_TOKEN_AUTH` , `ALLOW_USER_SRP_AUTH` , and `ALLOW_CUSTOM_AUTH` .
     *
     *
     * The values for authentication flow options include the following.
     *
     * * `ALLOW_USER_AUTH` : Enable selection-based sign-in with `USER_AUTH` . This setting covers
     * username-password, secure remote password (SRP), passwordless, and passkey authentication. This
     * authentiation flow can do username-password and SRP authentication without other
     * `ExplicitAuthFlows` permitting them. For example users can complete an SRP challenge through
     * `USER_AUTH` without the flow `USER_SRP_AUTH` being active for the app client. This flow doesn't
     * include `CUSTOM_AUTH` .
     *
     * To activate this setting, your user pool must be in the [Essentials
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
     * or higher.
     *
     * * `ALLOW_ADMIN_USER_PASSWORD_AUTH` : Enable admin based user password authentication flow
     * `ADMIN_USER_PASSWORD_AUTH` . This setting replaces the `ADMIN_NO_SRP_AUTH` setting. With this
     * authentication flow, your app passes a user name and password to Amazon Cognito in the request,
     * instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.
     * * `ALLOW_CUSTOM_AUTH` : Enable Lambda trigger based authentication.
     * * `ALLOW_USER_PASSWORD_AUTH` : Enable user password-based authentication. In this flow,
     * Amazon Cognito receives the password in the request instead of using the SRP protocol to verify
     * passwords.
     * * `ALLOW_USER_SRP_AUTH` : Enable SRP-based authentication.
     * * `ALLOW_REFRESH_TOKEN_AUTH` : Enable authflow to refresh tokens.
     *
     * In some environments, you will see the values `ADMIN_NO_SRP_AUTH` , `CUSTOM_AUTH_FLOW_ONLY` ,
     * or `USER_PASSWORD_AUTH` . You can't assign these legacy `ExplicitAuthFlows` values to user pool
     * clients at the same time as values that begin with `ALLOW_` ,
     * like `ALLOW_USER_SRP_AUTH` .
     */
    public fun explicitAuthFlows(explicitAuthFlows: List<String>)

    /**
     * @param explicitAuthFlows The [authentication
     * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
     * that you want your user pool client to support. For each app client in your user pool, you can
     * sign in your users with any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
     * you define with Lambda functions.
     *
     * If you don't specify a value for `ExplicitAuthFlows` , your app client supports
     * `ALLOW_REFRESH_TOKEN_AUTH` , `ALLOW_USER_SRP_AUTH` , and `ALLOW_CUSTOM_AUTH` .
     *
     *
     * The values for authentication flow options include the following.
     *
     * * `ALLOW_USER_AUTH` : Enable selection-based sign-in with `USER_AUTH` . This setting covers
     * username-password, secure remote password (SRP), passwordless, and passkey authentication. This
     * authentiation flow can do username-password and SRP authentication without other
     * `ExplicitAuthFlows` permitting them. For example users can complete an SRP challenge through
     * `USER_AUTH` without the flow `USER_SRP_AUTH` being active for the app client. This flow doesn't
     * include `CUSTOM_AUTH` .
     *
     * To activate this setting, your user pool must be in the [Essentials
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
     * or higher.
     *
     * * `ALLOW_ADMIN_USER_PASSWORD_AUTH` : Enable admin based user password authentication flow
     * `ADMIN_USER_PASSWORD_AUTH` . This setting replaces the `ADMIN_NO_SRP_AUTH` setting. With this
     * authentication flow, your app passes a user name and password to Amazon Cognito in the request,
     * instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.
     * * `ALLOW_CUSTOM_AUTH` : Enable Lambda trigger based authentication.
     * * `ALLOW_USER_PASSWORD_AUTH` : Enable user password-based authentication. In this flow,
     * Amazon Cognito receives the password in the request instead of using the SRP protocol to verify
     * passwords.
     * * `ALLOW_USER_SRP_AUTH` : Enable SRP-based authentication.
     * * `ALLOW_REFRESH_TOKEN_AUTH` : Enable authflow to refresh tokens.
     *
     * In some environments, you will see the values `ADMIN_NO_SRP_AUTH` , `CUSTOM_AUTH_FLOW_ONLY` ,
     * or `USER_PASSWORD_AUTH` . You can't assign these legacy `ExplicitAuthFlows` values to user pool
     * clients at the same time as values that begin with `ALLOW_` ,
     * like `ALLOW_USER_SRP_AUTH` .
     */
    public fun explicitAuthFlows(vararg explicitAuthFlows: String)

    /**
     * @param generateSecret When `true` , generates a client secret for the app client.
     * Client secrets are used with server-side and machine-to-machine applications. Client secrets
     * are automatically generated; you can't specify a secret value. For more information, see [App
     * client
     * types](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html#user-pool-settings-client-app-client-types)
     * .
     */
    public fun generateSecret(generateSecret: Boolean)

    /**
     * @param generateSecret When `true` , generates a client secret for the app client.
     * Client secrets are used with server-side and machine-to-machine applications. Client secrets
     * are automatically generated; you can't specify a secret value. For more information, see [App
     * client
     * types](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html#user-pool-settings-client-app-client-types)
     * .
     */
    public fun generateSecret(generateSecret: IResolvable)

    /**
     * @param idTokenValidity The ID token time limit.
     * After this limit expires, your user can't use their ID token. To specify the time unit for
     * `IdTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a `TokenValidityUnits`
     * value in your API request.
     *
     * For example, when you set `IdTokenValidity` as `10` and `TokenValidityUnits` as `hours` ,
     * your user can authenticate their session with their ID token for 10 hours.
     *
     * The default time unit for `IdTokenValidity` in an API request is hours. *Valid range* is
     * displayed below in seconds.
     *
     * If you don't specify otherwise in the configuration of your app client, your ID
     * tokens are valid for one hour.
     */
    public fun idTokenValidity(idTokenValidity: Number)

    /**
     * @param logoutUrLs A list of allowed logout URLs for managed login authentication.
     * When you pass `logout_uri` and `client_id` parameters to `/logout` , Amazon Cognito signs out
     * your user and redirects them to the logout URL. This parameter describes the URLs that you want
     * to be the permitted targets of `logout_uri` . A typical use of these URLs is when a user selects
     * "Sign out" and you redirect them to your public homepage. For more information, see [Logout
     * endpoint](https://docs.aws.amazon.com/cognito/latest/developerguide/logout-endpoint.html) .
     */
    public fun logoutUrLs(logoutUrLs: List<String>)

    /**
     * @param logoutUrLs A list of allowed logout URLs for managed login authentication.
     * When you pass `logout_uri` and `client_id` parameters to `/logout` , Amazon Cognito signs out
     * your user and redirects them to the logout URL. This parameter describes the URLs that you want
     * to be the permitted targets of `logout_uri` . A typical use of these URLs is when a user selects
     * "Sign out" and you redirect them to your public homepage. For more information, see [Logout
     * endpoint](https://docs.aws.amazon.com/cognito/latest/developerguide/logout-endpoint.html) .
     */
    public fun logoutUrLs(vararg logoutUrLs: String)

    /**
     * @param preventUserExistenceErrors Errors and responses that you want Amazon Cognito APIs to
     * return during authentication, account confirmation, and password recovery when the user doesn't
     * exist in the user pool.
     * When set to `ENABLED` and the user doesn't exist, authentication returns an error indicating
     * either the username or password was incorrect. Account confirmation and password recovery return
     * a response indicating a code was sent to a simulated destination. When set to `LEGACY` , those
     * APIs return a `UserNotFoundException` exception if the user doesn't exist in the user pool.
     *
     * Valid values include:
     *
     * * `ENABLED` - This prevents user existence-related errors.
     * * `LEGACY` - This represents the early behavior of Amazon Cognito where user existence
     * related errors aren't prevented.
     *
     * Defaults to `LEGACY` when you don't provide a value.
     */
    public fun preventUserExistenceErrors(preventUserExistenceErrors: String)

    /**
     * @param readAttributes The list of user attributes that you want your app client to have read
     * access to.
     * After your user authenticates in your app, their access token authorizes them to read their
     * own attribute value for any attribute in this list. An example of this kind of activity is when
     * your user selects a link to view their profile information.
     *
     * When you don't specify the `ReadAttributes` for your app client, your app can read the values
     * of `email_verified` , `phone_number_verified` , and the Standard attributes of your user pool.
     * When your user pool app client has read access to these default attributes, `ReadAttributes`
     * doesn't return any information. Amazon Cognito only populates `ReadAttributes` in the API
     * response if you have specified your own custom set of read attributes.
     */
    public fun readAttributes(readAttributes: List<String>)

    /**
     * @param readAttributes The list of user attributes that you want your app client to have read
     * access to.
     * After your user authenticates in your app, their access token authorizes them to read their
     * own attribute value for any attribute in this list. An example of this kind of activity is when
     * your user selects a link to view their profile information.
     *
     * When you don't specify the `ReadAttributes` for your app client, your app can read the values
     * of `email_verified` , `phone_number_verified` , and the Standard attributes of your user pool.
     * When your user pool app client has read access to these default attributes, `ReadAttributes`
     * doesn't return any information. Amazon Cognito only populates `ReadAttributes` in the API
     * response if you have specified your own custom set of read attributes.
     */
    public fun readAttributes(vararg readAttributes: String)

    /**
     * @param refreshTokenRotation The configuration of your app client for refresh token rotation.
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     */
    public fun refreshTokenRotation(refreshTokenRotation: IResolvable)

    /**
     * @param refreshTokenRotation The configuration of your app client for refresh token rotation.
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     */
    public
        fun refreshTokenRotation(refreshTokenRotation: CfnUserPoolClient.RefreshTokenRotationProperty)

    /**
     * @param refreshTokenRotation The configuration of your app client for refresh token rotation.
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("87d359d5a6d0fa8dbb7e2d042cb0f493e58a452fc70ca9d5577af617509456c2")
    public
        fun refreshTokenRotation(refreshTokenRotation: CfnUserPoolClient.RefreshTokenRotationProperty.Builder.() -> Unit)

    /**
     * @param refreshTokenValidity The refresh token time limit.
     * After this limit expires, your user can't use their refresh token. To specify the time unit
     * for `RefreshTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a
     * `TokenValidityUnits` value in your API request.
     *
     * For example, when you set `RefreshTokenValidity` as `10` and `TokenValidityUnits` as `days` ,
     * your user can refresh their session
     * and retrieve new access and ID tokens for 10 days.
     *
     * The default time unit for `RefreshTokenValidity` in an API request is days. You can't set
     * `RefreshTokenValidity` to 0. If you do, Amazon Cognito overrides the value with the default
     * value of 30 days. *Valid range* is displayed below in seconds.
     *
     * If you don't specify otherwise in the configuration of your app client, your refresh
     * tokens are valid for 30 days.
     */
    public fun refreshTokenValidity(refreshTokenValidity: Number)

    /**
     * @param supportedIdentityProviders A list of provider names for the identity providers (IdPs)
     * that are supported on this client.
     * The following are supported: `COGNITO` , `Facebook` , `Google` , `SignInWithApple` , and
     * `LoginWithAmazon` . You can also specify the names that you configured for the SAML and OIDC
     * IdPs in your user pool, for example `MySAMLIdP` or `MyOIDCIdP` .
     *
     * This parameter sets the IdPs that [managed
     * login](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-managed-login.html)
     * will display on the login page for your app client. The removal of `COGNITO` from this list
     * doesn't prevent authentication operations for local users with the user pools API in an AWS SDK.
     * The only way to prevent SDK-based authentication is to block access with a [AWS WAF
     * rule](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-waf.html) .
     */
    public fun supportedIdentityProviders(supportedIdentityProviders: List<String>)

    /**
     * @param supportedIdentityProviders A list of provider names for the identity providers (IdPs)
     * that are supported on this client.
     * The following are supported: `COGNITO` , `Facebook` , `Google` , `SignInWithApple` , and
     * `LoginWithAmazon` . You can also specify the names that you configured for the SAML and OIDC
     * IdPs in your user pool, for example `MySAMLIdP` or `MyOIDCIdP` .
     *
     * This parameter sets the IdPs that [managed
     * login](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-managed-login.html)
     * will display on the login page for your app client. The removal of `COGNITO` from this list
     * doesn't prevent authentication operations for local users with the user pools API in an AWS SDK.
     * The only way to prevent SDK-based authentication is to block access with a [AWS WAF
     * rule](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-waf.html) .
     */
    public fun supportedIdentityProviders(vararg supportedIdentityProviders: String)

    /**
     * @param tokenValidityUnits The units that validity times are represented in.
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     */
    public fun tokenValidityUnits(tokenValidityUnits: IResolvable)

    /**
     * @param tokenValidityUnits The units that validity times are represented in.
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     */
    public fun tokenValidityUnits(tokenValidityUnits: CfnUserPoolClient.TokenValidityUnitsProperty)

    /**
     * @param tokenValidityUnits The units that validity times are represented in.
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("248a3283135b66da6637a87c29187fd71a9f2c552a98e42a23c03dc3c4f13557")
    public
        fun tokenValidityUnits(tokenValidityUnits: CfnUserPoolClient.TokenValidityUnitsProperty.Builder.() -> Unit)

    /**
     * @param userPoolId The ID of the user pool where you want to create an app client. 
     */
    public fun userPoolId(userPoolId: String)

    /**
     * @param writeAttributes The list of user attributes that you want your app client to have
     * write access to.
     * After your user authenticates in your app, their access token authorizes them to set or
     * modify their own attribute value for any attribute in this list.
     *
     * When you don't specify the `WriteAttributes` for your app client, your app can write the
     * values of the Standard attributes of your user pool. When your user pool has write access to
     * these default attributes, `WriteAttributes` doesn't return any information. Amazon Cognito only
     * populates `WriteAttributes` in the API response if you have specified your own custom set of
     * write attributes.
     *
     * If your app client allows users to sign in through an IdP, this array must include all
     * attributes that you have mapped to IdP attributes. Amazon Cognito updates mapped attributes when
     * users sign in to your application through an IdP. If your app client does not have write access
     * to a mapped attribute, Amazon Cognito throws an error when it tries to update the attribute. For
     * more information, see [Specifying IdP Attribute Mappings for Your user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
     * .
     */
    public fun writeAttributes(writeAttributes: List<String>)

    /**
     * @param writeAttributes The list of user attributes that you want your app client to have
     * write access to.
     * After your user authenticates in your app, their access token authorizes them to set or
     * modify their own attribute value for any attribute in this list.
     *
     * When you don't specify the `WriteAttributes` for your app client, your app can write the
     * values of the Standard attributes of your user pool. When your user pool has write access to
     * these default attributes, `WriteAttributes` doesn't return any information. Amazon Cognito only
     * populates `WriteAttributes` in the API response if you have specified your own custom set of
     * write attributes.
     *
     * If your app client allows users to sign in through an IdP, this array must include all
     * attributes that you have mapped to IdP attributes. Amazon Cognito updates mapped attributes when
     * users sign in to your application through an IdP. If your app client does not have write access
     * to a mapped attribute, Amazon Cognito throws an error when it tries to update the attribute. For
     * more information, see [Specifying IdP Attribute Mappings for Your user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
     * .
     */
    public fun writeAttributes(vararg writeAttributes: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.builder()

    /**
     * @param accessTokenValidity The access token time limit.
     * After this limit expires, your user can't use their access token. To specify the time unit
     * for `AccessTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a
     * `TokenValidityUnits` value in your API request.
     *
     * For example, when you set `AccessTokenValidity` to `10` and `TokenValidityUnits` to `hours` ,
     * your user can authorize access with
     * their access token for 10 hours.
     *
     * The default time unit for `AccessTokenValidity` in an API request is hours. *Valid range* is
     * displayed below in seconds.
     *
     * If you don't specify otherwise in the configuration of your app client, your access
     * tokens are valid for one hour.
     */
    override fun accessTokenValidity(accessTokenValidity: Number) {
      cdkBuilder.accessTokenValidity(accessTokenValidity)
    }

    /**
     * @param allowedOAuthFlows The OAuth grant types that you want your app client to generate for
     * clients in managed login authentication.
     * To create an app client that generates client credentials grants, you must add
     * `client_credentials` as the only allowed OAuth flow.
     *
     * * **code** - Use a code grant flow, which provides an authorization code as the response.
     * This code can be exchanged for access tokens with the `/oauth2/token` endpoint.
     * * **implicit** - Issue the access token, and the ID token when scopes like `openid` and
     * `profile` are requested, directly to your user.
     * * **client_credentials** - Issue the access token from the `/oauth2/token` endpoint directly
     * to a non-person user, authorized by a combination of the client ID and client secret.
     */
    override fun allowedOAuthFlows(allowedOAuthFlows: List<String>) {
      cdkBuilder.allowedOAuthFlows(allowedOAuthFlows)
    }

    /**
     * @param allowedOAuthFlows The OAuth grant types that you want your app client to generate for
     * clients in managed login authentication.
     * To create an app client that generates client credentials grants, you must add
     * `client_credentials` as the only allowed OAuth flow.
     *
     * * **code** - Use a code grant flow, which provides an authorization code as the response.
     * This code can be exchanged for access tokens with the `/oauth2/token` endpoint.
     * * **implicit** - Issue the access token, and the ID token when scopes like `openid` and
     * `profile` are requested, directly to your user.
     * * **client_credentials** - Issue the access token from the `/oauth2/token` endpoint directly
     * to a non-person user, authorized by a combination of the client ID and client secret.
     */
    override fun allowedOAuthFlows(vararg allowedOAuthFlows: String): Unit =
        allowedOAuthFlows(allowedOAuthFlows.toList())

    /**
     * @param allowedOAuthFlowsUserPoolClient Set to `true` to use OAuth 2.0 authorization server
     * features in your app client.
     * This parameter must have a value of `true` before you can configure the following features in
     * your app client.
     *
     * * `CallBackURLs` : Callback URLs.
     * * `LogoutURLs` : Sign-out redirect URLs.
     * * `AllowedOAuthScopes` : OAuth 2.0 scopes.
     * * `AllowedOAuthFlows` : Support for authorization code, implicit, and client credentials
     * OAuth 2.0 grants.
     *
     * To use authorization server features, configure one of these features in the Amazon Cognito
     * console or set `AllowedOAuthFlowsUserPoolClient` to `true` in a `CreateUserPoolClient` or
     * `UpdateUserPoolClient` API request. If you don't set a value for
     * `AllowedOAuthFlowsUserPoolClient` in a request with the AWS CLI or SDKs, it defaults to `false`
     * . When `false` , only SDK-based API sign-in is permitted.
     */
    override fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: Boolean) {
      cdkBuilder.allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient)
    }

    /**
     * @param allowedOAuthFlowsUserPoolClient Set to `true` to use OAuth 2.0 authorization server
     * features in your app client.
     * This parameter must have a value of `true` before you can configure the following features in
     * your app client.
     *
     * * `CallBackURLs` : Callback URLs.
     * * `LogoutURLs` : Sign-out redirect URLs.
     * * `AllowedOAuthScopes` : OAuth 2.0 scopes.
     * * `AllowedOAuthFlows` : Support for authorization code, implicit, and client credentials
     * OAuth 2.0 grants.
     *
     * To use authorization server features, configure one of these features in the Amazon Cognito
     * console or set `AllowedOAuthFlowsUserPoolClient` to `true` in a `CreateUserPoolClient` or
     * `UpdateUserPoolClient` API request. If you don't set a value for
     * `AllowedOAuthFlowsUserPoolClient` in a request with the AWS CLI or SDKs, it defaults to `false`
     * . When `false` , only SDK-based API sign-in is permitted.
     */
    override fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: IResolvable) {
      cdkBuilder.allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param allowedOAuthScopes The OAuth, OpenID Connect (OIDC), and custom scopes that you want
     * to permit your app client to authorize access with.
     * Scopes govern access control to user pool self-service API operations, user data from the
     * `userInfo` endpoint, and third-party APIs. Scope values include `phone` , `email` , `openid` ,
     * and `profile` . The `aws.cognito.signin.user.admin` scope authorizes user self-service
     * operations. Custom scopes with resource servers authorize access to external APIs.
     */
    override fun allowedOAuthScopes(allowedOAuthScopes: List<String>) {
      cdkBuilder.allowedOAuthScopes(allowedOAuthScopes)
    }

    /**
     * @param allowedOAuthScopes The OAuth, OpenID Connect (OIDC), and custom scopes that you want
     * to permit your app client to authorize access with.
     * Scopes govern access control to user pool self-service API operations, user data from the
     * `userInfo` endpoint, and third-party APIs. Scope values include `phone` , `email` , `openid` ,
     * and `profile` . The `aws.cognito.signin.user.admin` scope authorizes user self-service
     * operations. Custom scopes with resource servers authorize access to external APIs.
     */
    override fun allowedOAuthScopes(vararg allowedOAuthScopes: String): Unit =
        allowedOAuthScopes(allowedOAuthScopes.toList())

    /**
     * @param analyticsConfiguration The user pool analytics configuration for collecting metrics
     * and sending them to your Amazon Pinpoint campaign.
     * In AWS Regions where Amazon Pinpoint isn't available, user pools might not have access to
     * analytics or might be configurable with campaigns in the US East (N. Virginia) Region. For more
     * information, see [Using Amazon Pinpoint
     * analytics](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-pinpoint-integration.html)
     * .
     */
    override fun analyticsConfiguration(analyticsConfiguration: IResolvable) {
      cdkBuilder.analyticsConfiguration(analyticsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param analyticsConfiguration The user pool analytics configuration for collecting metrics
     * and sending them to your Amazon Pinpoint campaign.
     * In AWS Regions where Amazon Pinpoint isn't available, user pools might not have access to
     * analytics or might be configurable with campaigns in the US East (N. Virginia) Region. For more
     * information, see [Using Amazon Pinpoint
     * analytics](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-pinpoint-integration.html)
     * .
     */
    override
        fun analyticsConfiguration(analyticsConfiguration: CfnUserPoolClient.AnalyticsConfigurationProperty) {
      cdkBuilder.analyticsConfiguration(analyticsConfiguration.let(CfnUserPoolClient.AnalyticsConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param analyticsConfiguration The user pool analytics configuration for collecting metrics
     * and sending them to your Amazon Pinpoint campaign.
     * In AWS Regions where Amazon Pinpoint isn't available, user pools might not have access to
     * analytics or might be configurable with campaigns in the US East (N. Virginia) Region. For more
     * information, see [Using Amazon Pinpoint
     * analytics](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-pinpoint-integration.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c18567dee94105c1859d6ab6b5fae6ab35e46a673e0c037496e3dc5a4fdac6f")
    override
        fun analyticsConfiguration(analyticsConfiguration: CfnUserPoolClient.AnalyticsConfigurationProperty.Builder.() -> Unit):
        Unit =
        analyticsConfiguration(CfnUserPoolClient.AnalyticsConfigurationProperty(analyticsConfiguration))

    /**
     * @param authSessionValidity Amazon Cognito creates a session token for each API request in an
     * authentication flow.
     * `AuthSessionValidity` is the duration, in minutes, of that session token. Your user pool
     * native user must respond to each authentication challenge before the session expires.
     */
    override fun authSessionValidity(authSessionValidity: Number) {
      cdkBuilder.authSessionValidity(authSessionValidity)
    }

    /**
     * @param callbackUrLs A list of allowed redirect, or callback, URLs for managed login
     * authentication.
     * These URLs are the paths where you want to send your users' browsers after they complete
     * authentication with managed login or a third-party IdP. Typically, callback URLs are the home of
     * an application that uses OAuth or OIDC libraries to process authentication outcomes.
     *
     * A redirect URI must meet the following requirements:
     *
     * * Be an absolute URI.
     * * Be registered with the authorization server. Amazon Cognito doesn't accept authorization
     * requests with `redirect_uri` values that aren't in the list of `CallbackURLs` that you provide
     * in this parameter.
     * * Not include a fragment component.
     *
     * See [OAuth 2.0 - Redirection
     * Endpoint](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6749#section-3.1.2) .
     *
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes
     * only.
     *
     * App callback URLs such as myapp://example are also supported.
     */
    override fun callbackUrLs(callbackUrLs: List<String>) {
      cdkBuilder.callbackUrLs(callbackUrLs)
    }

    /**
     * @param callbackUrLs A list of allowed redirect, or callback, URLs for managed login
     * authentication.
     * These URLs are the paths where you want to send your users' browsers after they complete
     * authentication with managed login or a third-party IdP. Typically, callback URLs are the home of
     * an application that uses OAuth or OIDC libraries to process authentication outcomes.
     *
     * A redirect URI must meet the following requirements:
     *
     * * Be an absolute URI.
     * * Be registered with the authorization server. Amazon Cognito doesn't accept authorization
     * requests with `redirect_uri` values that aren't in the list of `CallbackURLs` that you provide
     * in this parameter.
     * * Not include a fragment component.
     *
     * See [OAuth 2.0 - Redirection
     * Endpoint](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6749#section-3.1.2) .
     *
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes
     * only.
     *
     * App callback URLs such as myapp://example are also supported.
     */
    override fun callbackUrLs(vararg callbackUrLs: String): Unit =
        callbackUrLs(callbackUrLs.toList())

    /**
     * @param clientName A friendly name for the app client that you want to create.
     */
    override fun clientName(clientName: String) {
      cdkBuilder.clientName(clientName)
    }

    /**
     * @param defaultRedirectUri The default redirect URI.
     * In app clients with one assigned IdP, replaces `redirect_uri` in authentication requests.
     * Must be in the `CallbackURLs` list.
     */
    override fun defaultRedirectUri(defaultRedirectUri: String) {
      cdkBuilder.defaultRedirectUri(defaultRedirectUri)
    }

    /**
     * @param enablePropagateAdditionalUserContextData When `true` , your application can include
     * additional `UserContextData` in authentication requests.
     * This data includes the IP address, and contributes to analysis by threat protection features.
     * For more information about propagation of user context data, see [Adding session data to API
     * requests](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint)
     * . If you don’t include this parameter, you can't send the source IP address to Amazon Cognito
     * threat protection features. You can only activate `EnablePropagateAdditionalUserContextData` in
     * an app client that has a client secret.
     */
    override
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: Boolean) {
      cdkBuilder.enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData)
    }

    /**
     * @param enablePropagateAdditionalUserContextData When `true` , your application can include
     * additional `UserContextData` in authentication requests.
     * This data includes the IP address, and contributes to analysis by threat protection features.
     * For more information about propagation of user context data, see [Adding session data to API
     * requests](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint)
     * . If you don’t include this parameter, you can't send the source IP address to Amazon Cognito
     * threat protection features. You can only activate `EnablePropagateAdditionalUserContextData` in
     * an app client that has a client secret.
     */
    override
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: IResolvable) {
      cdkBuilder.enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param enableTokenRevocation Activates or deactivates token revocation.
     * If you don't include this parameter, token revocation is automatically activated for the new
     * user pool client.
     */
    override fun enableTokenRevocation(enableTokenRevocation: Boolean) {
      cdkBuilder.enableTokenRevocation(enableTokenRevocation)
    }

    /**
     * @param enableTokenRevocation Activates or deactivates token revocation.
     * If you don't include this parameter, token revocation is automatically activated for the new
     * user pool client.
     */
    override fun enableTokenRevocation(enableTokenRevocation: IResolvable) {
      cdkBuilder.enableTokenRevocation(enableTokenRevocation.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param explicitAuthFlows The [authentication
     * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
     * that you want your user pool client to support. For each app client in your user pool, you can
     * sign in your users with any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
     * you define with Lambda functions.
     *
     * If you don't specify a value for `ExplicitAuthFlows` , your app client supports
     * `ALLOW_REFRESH_TOKEN_AUTH` , `ALLOW_USER_SRP_AUTH` , and `ALLOW_CUSTOM_AUTH` .
     *
     *
     * The values for authentication flow options include the following.
     *
     * * `ALLOW_USER_AUTH` : Enable selection-based sign-in with `USER_AUTH` . This setting covers
     * username-password, secure remote password (SRP), passwordless, and passkey authentication. This
     * authentiation flow can do username-password and SRP authentication without other
     * `ExplicitAuthFlows` permitting them. For example users can complete an SRP challenge through
     * `USER_AUTH` without the flow `USER_SRP_AUTH` being active for the app client. This flow doesn't
     * include `CUSTOM_AUTH` .
     *
     * To activate this setting, your user pool must be in the [Essentials
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
     * or higher.
     *
     * * `ALLOW_ADMIN_USER_PASSWORD_AUTH` : Enable admin based user password authentication flow
     * `ADMIN_USER_PASSWORD_AUTH` . This setting replaces the `ADMIN_NO_SRP_AUTH` setting. With this
     * authentication flow, your app passes a user name and password to Amazon Cognito in the request,
     * instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.
     * * `ALLOW_CUSTOM_AUTH` : Enable Lambda trigger based authentication.
     * * `ALLOW_USER_PASSWORD_AUTH` : Enable user password-based authentication. In this flow,
     * Amazon Cognito receives the password in the request instead of using the SRP protocol to verify
     * passwords.
     * * `ALLOW_USER_SRP_AUTH` : Enable SRP-based authentication.
     * * `ALLOW_REFRESH_TOKEN_AUTH` : Enable authflow to refresh tokens.
     *
     * In some environments, you will see the values `ADMIN_NO_SRP_AUTH` , `CUSTOM_AUTH_FLOW_ONLY` ,
     * or `USER_PASSWORD_AUTH` . You can't assign these legacy `ExplicitAuthFlows` values to user pool
     * clients at the same time as values that begin with `ALLOW_` ,
     * like `ALLOW_USER_SRP_AUTH` .
     */
    override fun explicitAuthFlows(explicitAuthFlows: List<String>) {
      cdkBuilder.explicitAuthFlows(explicitAuthFlows)
    }

    /**
     * @param explicitAuthFlows The [authentication
     * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
     * that you want your user pool client to support. For each app client in your user pool, you can
     * sign in your users with any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
     * you define with Lambda functions.
     *
     * If you don't specify a value for `ExplicitAuthFlows` , your app client supports
     * `ALLOW_REFRESH_TOKEN_AUTH` , `ALLOW_USER_SRP_AUTH` , and `ALLOW_CUSTOM_AUTH` .
     *
     *
     * The values for authentication flow options include the following.
     *
     * * `ALLOW_USER_AUTH` : Enable selection-based sign-in with `USER_AUTH` . This setting covers
     * username-password, secure remote password (SRP), passwordless, and passkey authentication. This
     * authentiation flow can do username-password and SRP authentication without other
     * `ExplicitAuthFlows` permitting them. For example users can complete an SRP challenge through
     * `USER_AUTH` without the flow `USER_SRP_AUTH` being active for the app client. This flow doesn't
     * include `CUSTOM_AUTH` .
     *
     * To activate this setting, your user pool must be in the [Essentials
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
     * or higher.
     *
     * * `ALLOW_ADMIN_USER_PASSWORD_AUTH` : Enable admin based user password authentication flow
     * `ADMIN_USER_PASSWORD_AUTH` . This setting replaces the `ADMIN_NO_SRP_AUTH` setting. With this
     * authentication flow, your app passes a user name and password to Amazon Cognito in the request,
     * instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.
     * * `ALLOW_CUSTOM_AUTH` : Enable Lambda trigger based authentication.
     * * `ALLOW_USER_PASSWORD_AUTH` : Enable user password-based authentication. In this flow,
     * Amazon Cognito receives the password in the request instead of using the SRP protocol to verify
     * passwords.
     * * `ALLOW_USER_SRP_AUTH` : Enable SRP-based authentication.
     * * `ALLOW_REFRESH_TOKEN_AUTH` : Enable authflow to refresh tokens.
     *
     * In some environments, you will see the values `ADMIN_NO_SRP_AUTH` , `CUSTOM_AUTH_FLOW_ONLY` ,
     * or `USER_PASSWORD_AUTH` . You can't assign these legacy `ExplicitAuthFlows` values to user pool
     * clients at the same time as values that begin with `ALLOW_` ,
     * like `ALLOW_USER_SRP_AUTH` .
     */
    override fun explicitAuthFlows(vararg explicitAuthFlows: String): Unit =
        explicitAuthFlows(explicitAuthFlows.toList())

    /**
     * @param generateSecret When `true` , generates a client secret for the app client.
     * Client secrets are used with server-side and machine-to-machine applications. Client secrets
     * are automatically generated; you can't specify a secret value. For more information, see [App
     * client
     * types](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html#user-pool-settings-client-app-client-types)
     * .
     */
    override fun generateSecret(generateSecret: Boolean) {
      cdkBuilder.generateSecret(generateSecret)
    }

    /**
     * @param generateSecret When `true` , generates a client secret for the app client.
     * Client secrets are used with server-side and machine-to-machine applications. Client secrets
     * are automatically generated; you can't specify a secret value. For more information, see [App
     * client
     * types](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html#user-pool-settings-client-app-client-types)
     * .
     */
    override fun generateSecret(generateSecret: IResolvable) {
      cdkBuilder.generateSecret(generateSecret.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param idTokenValidity The ID token time limit.
     * After this limit expires, your user can't use their ID token. To specify the time unit for
     * `IdTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a `TokenValidityUnits`
     * value in your API request.
     *
     * For example, when you set `IdTokenValidity` as `10` and `TokenValidityUnits` as `hours` ,
     * your user can authenticate their session with their ID token for 10 hours.
     *
     * The default time unit for `IdTokenValidity` in an API request is hours. *Valid range* is
     * displayed below in seconds.
     *
     * If you don't specify otherwise in the configuration of your app client, your ID
     * tokens are valid for one hour.
     */
    override fun idTokenValidity(idTokenValidity: Number) {
      cdkBuilder.idTokenValidity(idTokenValidity)
    }

    /**
     * @param logoutUrLs A list of allowed logout URLs for managed login authentication.
     * When you pass `logout_uri` and `client_id` parameters to `/logout` , Amazon Cognito signs out
     * your user and redirects them to the logout URL. This parameter describes the URLs that you want
     * to be the permitted targets of `logout_uri` . A typical use of these URLs is when a user selects
     * "Sign out" and you redirect them to your public homepage. For more information, see [Logout
     * endpoint](https://docs.aws.amazon.com/cognito/latest/developerguide/logout-endpoint.html) .
     */
    override fun logoutUrLs(logoutUrLs: List<String>) {
      cdkBuilder.logoutUrLs(logoutUrLs)
    }

    /**
     * @param logoutUrLs A list of allowed logout URLs for managed login authentication.
     * When you pass `logout_uri` and `client_id` parameters to `/logout` , Amazon Cognito signs out
     * your user and redirects them to the logout URL. This parameter describes the URLs that you want
     * to be the permitted targets of `logout_uri` . A typical use of these URLs is when a user selects
     * "Sign out" and you redirect them to your public homepage. For more information, see [Logout
     * endpoint](https://docs.aws.amazon.com/cognito/latest/developerguide/logout-endpoint.html) .
     */
    override fun logoutUrLs(vararg logoutUrLs: String): Unit = logoutUrLs(logoutUrLs.toList())

    /**
     * @param preventUserExistenceErrors Errors and responses that you want Amazon Cognito APIs to
     * return during authentication, account confirmation, and password recovery when the user doesn't
     * exist in the user pool.
     * When set to `ENABLED` and the user doesn't exist, authentication returns an error indicating
     * either the username or password was incorrect. Account confirmation and password recovery return
     * a response indicating a code was sent to a simulated destination. When set to `LEGACY` , those
     * APIs return a `UserNotFoundException` exception if the user doesn't exist in the user pool.
     *
     * Valid values include:
     *
     * * `ENABLED` - This prevents user existence-related errors.
     * * `LEGACY` - This represents the early behavior of Amazon Cognito where user existence
     * related errors aren't prevented.
     *
     * Defaults to `LEGACY` when you don't provide a value.
     */
    override fun preventUserExistenceErrors(preventUserExistenceErrors: String) {
      cdkBuilder.preventUserExistenceErrors(preventUserExistenceErrors)
    }

    /**
     * @param readAttributes The list of user attributes that you want your app client to have read
     * access to.
     * After your user authenticates in your app, their access token authorizes them to read their
     * own attribute value for any attribute in this list. An example of this kind of activity is when
     * your user selects a link to view their profile information.
     *
     * When you don't specify the `ReadAttributes` for your app client, your app can read the values
     * of `email_verified` , `phone_number_verified` , and the Standard attributes of your user pool.
     * When your user pool app client has read access to these default attributes, `ReadAttributes`
     * doesn't return any information. Amazon Cognito only populates `ReadAttributes` in the API
     * response if you have specified your own custom set of read attributes.
     */
    override fun readAttributes(readAttributes: List<String>) {
      cdkBuilder.readAttributes(readAttributes)
    }

    /**
     * @param readAttributes The list of user attributes that you want your app client to have read
     * access to.
     * After your user authenticates in your app, their access token authorizes them to read their
     * own attribute value for any attribute in this list. An example of this kind of activity is when
     * your user selects a link to view their profile information.
     *
     * When you don't specify the `ReadAttributes` for your app client, your app can read the values
     * of `email_verified` , `phone_number_verified` , and the Standard attributes of your user pool.
     * When your user pool app client has read access to these default attributes, `ReadAttributes`
     * doesn't return any information. Amazon Cognito only populates `ReadAttributes` in the API
     * response if you have specified your own custom set of read attributes.
     */
    override fun readAttributes(vararg readAttributes: String): Unit =
        readAttributes(readAttributes.toList())

    /**
     * @param refreshTokenRotation The configuration of your app client for refresh token rotation.
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     */
    override fun refreshTokenRotation(refreshTokenRotation: IResolvable) {
      cdkBuilder.refreshTokenRotation(refreshTokenRotation.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param refreshTokenRotation The configuration of your app client for refresh token rotation.
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     */
    override
        fun refreshTokenRotation(refreshTokenRotation: CfnUserPoolClient.RefreshTokenRotationProperty) {
      cdkBuilder.refreshTokenRotation(refreshTokenRotation.let(CfnUserPoolClient.RefreshTokenRotationProperty.Companion::unwrap))
    }

    /**
     * @param refreshTokenRotation The configuration of your app client for refresh token rotation.
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("87d359d5a6d0fa8dbb7e2d042cb0f493e58a452fc70ca9d5577af617509456c2")
    override
        fun refreshTokenRotation(refreshTokenRotation: CfnUserPoolClient.RefreshTokenRotationProperty.Builder.() -> Unit):
        Unit =
        refreshTokenRotation(CfnUserPoolClient.RefreshTokenRotationProperty(refreshTokenRotation))

    /**
     * @param refreshTokenValidity The refresh token time limit.
     * After this limit expires, your user can't use their refresh token. To specify the time unit
     * for `RefreshTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a
     * `TokenValidityUnits` value in your API request.
     *
     * For example, when you set `RefreshTokenValidity` as `10` and `TokenValidityUnits` as `days` ,
     * your user can refresh their session
     * and retrieve new access and ID tokens for 10 days.
     *
     * The default time unit for `RefreshTokenValidity` in an API request is days. You can't set
     * `RefreshTokenValidity` to 0. If you do, Amazon Cognito overrides the value with the default
     * value of 30 days. *Valid range* is displayed below in seconds.
     *
     * If you don't specify otherwise in the configuration of your app client, your refresh
     * tokens are valid for 30 days.
     */
    override fun refreshTokenValidity(refreshTokenValidity: Number) {
      cdkBuilder.refreshTokenValidity(refreshTokenValidity)
    }

    /**
     * @param supportedIdentityProviders A list of provider names for the identity providers (IdPs)
     * that are supported on this client.
     * The following are supported: `COGNITO` , `Facebook` , `Google` , `SignInWithApple` , and
     * `LoginWithAmazon` . You can also specify the names that you configured for the SAML and OIDC
     * IdPs in your user pool, for example `MySAMLIdP` or `MyOIDCIdP` .
     *
     * This parameter sets the IdPs that [managed
     * login](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-managed-login.html)
     * will display on the login page for your app client. The removal of `COGNITO` from this list
     * doesn't prevent authentication operations for local users with the user pools API in an AWS SDK.
     * The only way to prevent SDK-based authentication is to block access with a [AWS WAF
     * rule](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-waf.html) .
     */
    override fun supportedIdentityProviders(supportedIdentityProviders: List<String>) {
      cdkBuilder.supportedIdentityProviders(supportedIdentityProviders)
    }

    /**
     * @param supportedIdentityProviders A list of provider names for the identity providers (IdPs)
     * that are supported on this client.
     * The following are supported: `COGNITO` , `Facebook` , `Google` , `SignInWithApple` , and
     * `LoginWithAmazon` . You can also specify the names that you configured for the SAML and OIDC
     * IdPs in your user pool, for example `MySAMLIdP` or `MyOIDCIdP` .
     *
     * This parameter sets the IdPs that [managed
     * login](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-managed-login.html)
     * will display on the login page for your app client. The removal of `COGNITO` from this list
     * doesn't prevent authentication operations for local users with the user pools API in an AWS SDK.
     * The only way to prevent SDK-based authentication is to block access with a [AWS WAF
     * rule](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-waf.html) .
     */
    override fun supportedIdentityProviders(vararg supportedIdentityProviders: String): Unit =
        supportedIdentityProviders(supportedIdentityProviders.toList())

    /**
     * @param tokenValidityUnits The units that validity times are represented in.
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     */
    override fun tokenValidityUnits(tokenValidityUnits: IResolvable) {
      cdkBuilder.tokenValidityUnits(tokenValidityUnits.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tokenValidityUnits The units that validity times are represented in.
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     */
    override
        fun tokenValidityUnits(tokenValidityUnits: CfnUserPoolClient.TokenValidityUnitsProperty) {
      cdkBuilder.tokenValidityUnits(tokenValidityUnits.let(CfnUserPoolClient.TokenValidityUnitsProperty.Companion::unwrap))
    }

    /**
     * @param tokenValidityUnits The units that validity times are represented in.
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("248a3283135b66da6637a87c29187fd71a9f2c552a98e42a23c03dc3c4f13557")
    override
        fun tokenValidityUnits(tokenValidityUnits: CfnUserPoolClient.TokenValidityUnitsProperty.Builder.() -> Unit):
        Unit = tokenValidityUnits(CfnUserPoolClient.TokenValidityUnitsProperty(tokenValidityUnits))

    /**
     * @param userPoolId The ID of the user pool where you want to create an app client. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    /**
     * @param writeAttributes The list of user attributes that you want your app client to have
     * write access to.
     * After your user authenticates in your app, their access token authorizes them to set or
     * modify their own attribute value for any attribute in this list.
     *
     * When you don't specify the `WriteAttributes` for your app client, your app can write the
     * values of the Standard attributes of your user pool. When your user pool has write access to
     * these default attributes, `WriteAttributes` doesn't return any information. Amazon Cognito only
     * populates `WriteAttributes` in the API response if you have specified your own custom set of
     * write attributes.
     *
     * If your app client allows users to sign in through an IdP, this array must include all
     * attributes that you have mapped to IdP attributes. Amazon Cognito updates mapped attributes when
     * users sign in to your application through an IdP. If your app client does not have write access
     * to a mapped attribute, Amazon Cognito throws an error when it tries to update the attribute. For
     * more information, see [Specifying IdP Attribute Mappings for Your user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
     * .
     */
    override fun writeAttributes(writeAttributes: List<String>) {
      cdkBuilder.writeAttributes(writeAttributes)
    }

    /**
     * @param writeAttributes The list of user attributes that you want your app client to have
     * write access to.
     * After your user authenticates in your app, their access token authorizes them to set or
     * modify their own attribute value for any attribute in this list.
     *
     * When you don't specify the `WriteAttributes` for your app client, your app can write the
     * values of the Standard attributes of your user pool. When your user pool has write access to
     * these default attributes, `WriteAttributes` doesn't return any information. Amazon Cognito only
     * populates `WriteAttributes` in the API response if you have specified your own custom set of
     * write attributes.
     *
     * If your app client allows users to sign in through an IdP, this array must include all
     * attributes that you have mapped to IdP attributes. Amazon Cognito updates mapped attributes when
     * users sign in to your application through an IdP. If your app client does not have write access
     * to a mapped attribute, Amazon Cognito throws an error when it tries to update the attribute. For
     * more information, see [Specifying IdP Attribute Mappings for Your user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
     * .
     */
    override fun writeAttributes(vararg writeAttributes: String): Unit =
        writeAttributes(writeAttributes.toList())

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolClientProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClientProps,
  ) : CdkObject(cdkObject),
      CfnUserPoolClientProps {
    /**
     * The access token time limit.
     *
     * After this limit expires, your user can't use their access token. To specify the time unit
     * for `AccessTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a
     * `TokenValidityUnits` value in your API request.
     *
     * For example, when you set `AccessTokenValidity` to `10` and `TokenValidityUnits` to `hours` ,
     * your user can authorize access with
     * their access token for 10 hours.
     *
     * The default time unit for `AccessTokenValidity` in an API request is hours. *Valid range* is
     * displayed below in seconds.
     *
     * If you don't specify otherwise in the configuration of your app client, your access
     * tokens are valid for one hour.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-accesstokenvalidity)
     */
    override fun accessTokenValidity(): Number? = unwrap(this).getAccessTokenValidity()

    /**
     * The OAuth grant types that you want your app client to generate for clients in managed login
     * authentication.
     *
     * To create an app client that generates client credentials grants, you must add
     * `client_credentials` as the only allowed OAuth flow.
     *
     * * **code** - Use a code grant flow, which provides an authorization code as the response.
     * This code can be exchanged for access tokens with the `/oauth2/token` endpoint.
     * * **implicit** - Issue the access token, and the ID token when scopes like `openid` and
     * `profile` are requested, directly to your user.
     * * **client_credentials** - Issue the access token from the `/oauth2/token` endpoint directly
     * to a non-person user, authorized by a combination of the client ID and client secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthflows)
     */
    override fun allowedOAuthFlows(): List<String> = unwrap(this).getAllowedOAuthFlows() ?:
        emptyList()

    /**
     * Set to `true` to use OAuth 2.0 authorization server features in your app client.
     *
     * This parameter must have a value of `true` before you can configure the following features in
     * your app client.
     *
     * * `CallBackURLs` : Callback URLs.
     * * `LogoutURLs` : Sign-out redirect URLs.
     * * `AllowedOAuthScopes` : OAuth 2.0 scopes.
     * * `AllowedOAuthFlows` : Support for authorization code, implicit, and client credentials
     * OAuth 2.0 grants.
     *
     * To use authorization server features, configure one of these features in the Amazon Cognito
     * console or set `AllowedOAuthFlowsUserPoolClient` to `true` in a `CreateUserPoolClient` or
     * `UpdateUserPoolClient` API request. If you don't set a value for
     * `AllowedOAuthFlowsUserPoolClient` in a request with the AWS CLI or SDKs, it defaults to `false`
     * . When `false` , only SDK-based API sign-in is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthflowsuserpoolclient)
     */
    override fun allowedOAuthFlowsUserPoolClient(): Any? =
        unwrap(this).getAllowedOAuthFlowsUserPoolClient()

    /**
     * The OAuth, OpenID Connect (OIDC), and custom scopes that you want to permit your app client
     * to authorize access with.
     *
     * Scopes govern access control to user pool self-service API operations, user data from the
     * `userInfo` endpoint, and third-party APIs. Scope values include `phone` , `email` , `openid` ,
     * and `profile` . The `aws.cognito.signin.user.admin` scope authorizes user self-service
     * operations. Custom scopes with resource servers authorize access to external APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthscopes)
     */
    override fun allowedOAuthScopes(): List<String> = unwrap(this).getAllowedOAuthScopes() ?:
        emptyList()

    /**
     * The user pool analytics configuration for collecting metrics and sending them to your Amazon
     * Pinpoint campaign.
     *
     * In AWS Regions where Amazon Pinpoint isn't available, user pools might not have access to
     * analytics or might be configurable with campaigns in the US East (N. Virginia) Region. For more
     * information, see [Using Amazon Pinpoint
     * analytics](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-pinpoint-integration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-analyticsconfiguration)
     */
    override fun analyticsConfiguration(): Any? = unwrap(this).getAnalyticsConfiguration()

    /**
     * Amazon Cognito creates a session token for each API request in an authentication flow.
     *
     * `AuthSessionValidity` is the duration, in minutes, of that session token. Your user pool
     * native user must respond to each authentication challenge before the session expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-authsessionvalidity)
     */
    override fun authSessionValidity(): Number? = unwrap(this).getAuthSessionValidity()

    /**
     * A list of allowed redirect, or callback, URLs for managed login authentication.
     *
     * These URLs are the paths where you want to send your users' browsers after they complete
     * authentication with managed login or a third-party IdP. Typically, callback URLs are the home of
     * an application that uses OAuth or OIDC libraries to process authentication outcomes.
     *
     * A redirect URI must meet the following requirements:
     *
     * * Be an absolute URI.
     * * Be registered with the authorization server. Amazon Cognito doesn't accept authorization
     * requests with `redirect_uri` values that aren't in the list of `CallbackURLs` that you provide
     * in this parameter.
     * * Not include a fragment component.
     *
     * See [OAuth 2.0 - Redirection
     * Endpoint](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6749#section-3.1.2) .
     *
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes
     * only.
     *
     * App callback URLs such as myapp://example are also supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-callbackurls)
     */
    override fun callbackUrLs(): List<String> = unwrap(this).getCallbackUrLs() ?: emptyList()

    /**
     * A friendly name for the app client that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname)
     */
    override fun clientName(): String? = unwrap(this).getClientName()

    /**
     * The default redirect URI.
     *
     * In app clients with one assigned IdP, replaces `redirect_uri` in authentication requests.
     * Must be in the `CallbackURLs` list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-defaultredirecturi)
     */
    override fun defaultRedirectUri(): String? = unwrap(this).getDefaultRedirectUri()

    /**
     * When `true` , your application can include additional `UserContextData` in authentication
     * requests.
     *
     * This data includes the IP address, and contributes to analysis by threat protection features.
     * For more information about propagation of user context data, see [Adding session data to API
     * requests](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint)
     * . If you don’t include this parameter, you can't send the source IP address to Amazon Cognito
     * threat protection features. You can only activate `EnablePropagateAdditionalUserContextData` in
     * an app client that has a client secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-enablepropagateadditionalusercontextdata)
     */
    override fun enablePropagateAdditionalUserContextData(): Any? =
        unwrap(this).getEnablePropagateAdditionalUserContextData()

    /**
     * Activates or deactivates token revocation.
     *
     * If you don't include this parameter, token revocation is automatically activated for the new
     * user pool client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-enabletokenrevocation)
     */
    override fun enableTokenRevocation(): Any? = unwrap(this).getEnableTokenRevocation()

    /**
     * The [authentication
     * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
     * that you want your user pool client to support. For each app client in your user pool, you can
     * sign in your users with any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
     * you define with Lambda functions.
     *
     *
     * If you don't specify a value for `ExplicitAuthFlows` , your app client supports
     * `ALLOW_REFRESH_TOKEN_AUTH` , `ALLOW_USER_SRP_AUTH` , and `ALLOW_CUSTOM_AUTH` .
     *
     *
     * The values for authentication flow options include the following.
     *
     * * `ALLOW_USER_AUTH` : Enable selection-based sign-in with `USER_AUTH` . This setting covers
     * username-password, secure remote password (SRP), passwordless, and passkey authentication. This
     * authentiation flow can do username-password and SRP authentication without other
     * `ExplicitAuthFlows` permitting them. For example users can complete an SRP challenge through
     * `USER_AUTH` without the flow `USER_SRP_AUTH` being active for the app client. This flow doesn't
     * include `CUSTOM_AUTH` .
     *
     * To activate this setting, your user pool must be in the [Essentials
     * tier](https://docs.aws.amazon.com/cognito/latest/developerguide/feature-plans-features-essentials.html)
     * or higher.
     *
     * * `ALLOW_ADMIN_USER_PASSWORD_AUTH` : Enable admin based user password authentication flow
     * `ADMIN_USER_PASSWORD_AUTH` . This setting replaces the `ADMIN_NO_SRP_AUTH` setting. With this
     * authentication flow, your app passes a user name and password to Amazon Cognito in the request,
     * instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.
     * * `ALLOW_CUSTOM_AUTH` : Enable Lambda trigger based authentication.
     * * `ALLOW_USER_PASSWORD_AUTH` : Enable user password-based authentication. In this flow,
     * Amazon Cognito receives the password in the request instead of using the SRP protocol to verify
     * passwords.
     * * `ALLOW_USER_SRP_AUTH` : Enable SRP-based authentication.
     * * `ALLOW_REFRESH_TOKEN_AUTH` : Enable authflow to refresh tokens.
     *
     * In some environments, you will see the values `ADMIN_NO_SRP_AUTH` , `CUSTOM_AUTH_FLOW_ONLY` ,
     * or `USER_PASSWORD_AUTH` . You can't assign these legacy `ExplicitAuthFlows` values to user pool
     * clients at the same time as values that begin with `ALLOW_` ,
     * like `ALLOW_USER_SRP_AUTH` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows)
     */
    override fun explicitAuthFlows(): List<String> = unwrap(this).getExplicitAuthFlows() ?:
        emptyList()

    /**
     * When `true` , generates a client secret for the app client.
     *
     * Client secrets are used with server-side and machine-to-machine applications. Client secrets
     * are automatically generated; you can't specify a secret value. For more information, see [App
     * client
     * types](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html#user-pool-settings-client-app-client-types)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret)
     */
    override fun generateSecret(): Any? = unwrap(this).getGenerateSecret()

    /**
     * The ID token time limit.
     *
     * After this limit expires, your user can't use their ID token. To specify the time unit for
     * `IdTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a `TokenValidityUnits`
     * value in your API request.
     *
     * For example, when you set `IdTokenValidity` as `10` and `TokenValidityUnits` as `hours` ,
     * your user can authenticate their session with their ID token for 10 hours.
     *
     * The default time unit for `IdTokenValidity` in an API request is hours. *Valid range* is
     * displayed below in seconds.
     *
     * If you don't specify otherwise in the configuration of your app client, your ID
     * tokens are valid for one hour.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-idtokenvalidity)
     */
    override fun idTokenValidity(): Number? = unwrap(this).getIdTokenValidity()

    /**
     * A list of allowed logout URLs for managed login authentication.
     *
     * When you pass `logout_uri` and `client_id` parameters to `/logout` , Amazon Cognito signs out
     * your user and redirects them to the logout URL. This parameter describes the URLs that you want
     * to be the permitted targets of `logout_uri` . A typical use of these URLs is when a user selects
     * "Sign out" and you redirect them to your public homepage. For more information, see [Logout
     * endpoint](https://docs.aws.amazon.com/cognito/latest/developerguide/logout-endpoint.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-logouturls)
     */
    override fun logoutUrLs(): List<String> = unwrap(this).getLogoutUrLs() ?: emptyList()

    /**
     * Errors and responses that you want Amazon Cognito APIs to return during authentication,
     * account confirmation, and password recovery when the user doesn't exist in the user pool.
     *
     * When set to `ENABLED` and the user doesn't exist, authentication returns an error indicating
     * either the username or password was incorrect. Account confirmation and password recovery return
     * a response indicating a code was sent to a simulated destination. When set to `LEGACY` , those
     * APIs return a `UserNotFoundException` exception if the user doesn't exist in the user pool.
     *
     * Valid values include:
     *
     * * `ENABLED` - This prevents user existence-related errors.
     * * `LEGACY` - This represents the early behavior of Amazon Cognito where user existence
     * related errors aren't prevented.
     *
     * Defaults to `LEGACY` when you don't provide a value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-preventuserexistenceerrors)
     */
    override fun preventUserExistenceErrors(): String? =
        unwrap(this).getPreventUserExistenceErrors()

    /**
     * The list of user attributes that you want your app client to have read access to.
     *
     * After your user authenticates in your app, their access token authorizes them to read their
     * own attribute value for any attribute in this list. An example of this kind of activity is when
     * your user selects a link to view their profile information.
     *
     * When you don't specify the `ReadAttributes` for your app client, your app can read the values
     * of `email_verified` , `phone_number_verified` , and the Standard attributes of your user pool.
     * When your user pool app client has read access to these default attributes, `ReadAttributes`
     * doesn't return any information. Amazon Cognito only populates `ReadAttributes` in the API
     * response if you have specified your own custom set of read attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes)
     */
    override fun readAttributes(): List<String> = unwrap(this).getReadAttributes() ?: emptyList()

    /**
     * The configuration of your app client for refresh token rotation.
     *
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenrotation)
     */
    override fun refreshTokenRotation(): Any? = unwrap(this).getRefreshTokenRotation()

    /**
     * The refresh token time limit.
     *
     * After this limit expires, your user can't use their refresh token. To specify the time unit
     * for `RefreshTokenValidity` as `seconds` , `minutes` , `hours` , or `days` , set a
     * `TokenValidityUnits` value in your API request.
     *
     * For example, when you set `RefreshTokenValidity` as `10` and `TokenValidityUnits` as `days` ,
     * your user can refresh their session
     * and retrieve new access and ID tokens for 10 days.
     *
     * The default time unit for `RefreshTokenValidity` in an API request is days. You can't set
     * `RefreshTokenValidity` to 0. If you do, Amazon Cognito overrides the value with the default
     * value of 30 days. *Valid range* is displayed below in seconds.
     *
     * If you don't specify otherwise in the configuration of your app client, your refresh
     * tokens are valid for 30 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity)
     */
    override fun refreshTokenValidity(): Number? = unwrap(this).getRefreshTokenValidity()

    /**
     * A list of provider names for the identity providers (IdPs) that are supported on this client.
     *
     * The following are supported: `COGNITO` , `Facebook` , `Google` , `SignInWithApple` , and
     * `LoginWithAmazon` . You can also specify the names that you configured for the SAML and OIDC
     * IdPs in your user pool, for example `MySAMLIdP` or `MyOIDCIdP` .
     *
     * This parameter sets the IdPs that [managed
     * login](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-managed-login.html)
     * will display on the login page for your app client. The removal of `COGNITO` from this list
     * doesn't prevent authentication operations for local users with the user pools API in an AWS SDK.
     * The only way to prevent SDK-based authentication is to block access with a [AWS WAF
     * rule](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-waf.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-supportedidentityproviders)
     */
    override fun supportedIdentityProviders(): List<String> =
        unwrap(this).getSupportedIdentityProviders() ?: emptyList()

    /**
     * The units that validity times are represented in.
     *
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-tokenvalidityunits)
     */
    override fun tokenValidityUnits(): Any? = unwrap(this).getTokenValidityUnits()

    /**
     * The ID of the user pool where you want to create an app client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()

    /**
     * The list of user attributes that you want your app client to have write access to.
     *
     * After your user authenticates in your app, their access token authorizes them to set or
     * modify their own attribute value for any attribute in this list.
     *
     * When you don't specify the `WriteAttributes` for your app client, your app can write the
     * values of the Standard attributes of your user pool. When your user pool has write access to
     * these default attributes, `WriteAttributes` doesn't return any information. Amazon Cognito only
     * populates `WriteAttributes` in the API response if you have specified your own custom set of
     * write attributes.
     *
     * If your app client allows users to sign in through an IdP, this array must include all
     * attributes that you have mapped to IdP attributes. Amazon Cognito updates mapped attributes when
     * users sign in to your application through an IdP. If your app client does not have write access
     * to a mapped attribute, Amazon Cognito throws an error when it tries to update the attribute. For
     * more information, see [Specifying IdP Attribute Mappings for Your user
     * pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes)
     */
    override fun writeAttributes(): List<String> = unwrap(this).getWriteAttributes() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolClientProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClientProps):
        CfnUserPoolClientProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUserPoolClientProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolClientProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolClientProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CfnUserPoolClientProps
  }
}
