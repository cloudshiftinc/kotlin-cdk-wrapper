@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Cognito::UserPoolClient` resource specifies an Amazon Cognito user pool client.
 *
 *
 * If you don't specify a value for a parameter, Amazon Cognito sets it to a default value.
 *
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * Vpc vpc;
 * Certificate certificate;
 * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .build();
 * UserPool userPool = new UserPool(this, "UserPool");
 * UserPoolClient userPoolClient = UserPoolClient.Builder.create(this, "Client")
 * .userPool(userPool)
 * // Required minimal configuration for use with an ELB
 * .generateSecret(true)
 * .authFlows(AuthFlow.builder()
 * .userPassword(true)
 * .build())
 * .oAuth(OAuthSettings.builder()
 * .flows(OAuthFlows.builder()
 * .authorizationCodeGrant(true)
 * .build())
 * .scopes(List.of(OAuthScope.EMAIL))
 * .callbackUrls(List.of(String.format("https://%s/oauth2/idpresponse",
 * lb.getLoadBalancerDnsName())))
 * .build())
 * .build();
 * CfnUserPoolClient cfnClient = (CfnUserPoolClient)userPoolClient.getNode().getDefaultChild();
 * cfnClient.addPropertyOverride("RefreshTokenValidity", 1);
 * cfnClient.addPropertyOverride("SupportedIdentityProviders", List.of("COGNITO"));
 * UserPoolDomain userPoolDomain = UserPoolDomain.Builder.create(this, "Domain")
 * .userPool(userPool)
 * .cognitoDomain(CognitoDomainOptions.builder()
 * .domainPrefix("test-cdk-prefix")
 * .build())
 * .build();
 * lb.addListener("Listener", BaseApplicationListenerProps.builder()
 * .port(443)
 * .certificates(List.of(certificate))
 * .defaultAction(AuthenticateCognitoAction.Builder.create()
 * .userPool(userPool)
 * .userPoolClient(userPoolClient)
 * .userPoolDomain(userPoolDomain)
 * .next(ListenerAction.fixedResponse(200, FixedResponseOptions.builder()
 * .contentType("text/plain")
 * .messageBody("Authenticated")
 * .build()))
 * .build())
 * .build());
 * CfnOutput.Builder.create(this, "DNS")
 * .value(lb.getLoadBalancerDnsName())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html)
 */
public open class CfnUserPoolClient(
  cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClient,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolClientProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnUserPoolClient(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserPoolClientProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolClientProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserPoolClientProps(props)
  )

  /**
   * The access token time limit.
   */
  public open fun accessTokenValidity(): Number? = unwrap(this).getAccessTokenValidity()

  /**
   * The access token time limit.
   */
  public open fun accessTokenValidity(`value`: Number) {
    unwrap(this).setAccessTokenValidity(`value`)
  }

  /**
   * The OAuth grant types that you want your app client to generate for clients in managed login
   * authentication.
   */
  public open fun allowedOAuthFlows(): List<String> = unwrap(this).getAllowedOAuthFlows() ?:
      emptyList()

  /**
   * The OAuth grant types that you want your app client to generate for clients in managed login
   * authentication.
   */
  public open fun allowedOAuthFlows(`value`: List<String>) {
    unwrap(this).setAllowedOAuthFlows(`value`)
  }

  /**
   * The OAuth grant types that you want your app client to generate for clients in managed login
   * authentication.
   */
  public open fun allowedOAuthFlows(vararg `value`: String): Unit =
      allowedOAuthFlows(`value`.toList())

  /**
   * Set to `true` to use OAuth 2.0 authorization server features in your app client.
   */
  public open fun allowedOAuthFlowsUserPoolClient(): Any? =
      unwrap(this).getAllowedOAuthFlowsUserPoolClient()

  /**
   * Set to `true` to use OAuth 2.0 authorization server features in your app client.
   */
  public open fun allowedOAuthFlowsUserPoolClient(`value`: Boolean) {
    unwrap(this).setAllowedOAuthFlowsUserPoolClient(`value`)
  }

  /**
   * Set to `true` to use OAuth 2.0 authorization server features in your app client.
   */
  public open fun allowedOAuthFlowsUserPoolClient(`value`: IResolvable) {
    unwrap(this).setAllowedOAuthFlowsUserPoolClient(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The OAuth, OpenID Connect (OIDC), and custom scopes that you want to permit your app client to
   * authorize access with.
   */
  public open fun allowedOAuthScopes(): List<String> = unwrap(this).getAllowedOAuthScopes() ?:
      emptyList()

  /**
   * The OAuth, OpenID Connect (OIDC), and custom scopes that you want to permit your app client to
   * authorize access with.
   */
  public open fun allowedOAuthScopes(`value`: List<String>) {
    unwrap(this).setAllowedOAuthScopes(`value`)
  }

  /**
   * The OAuth, OpenID Connect (OIDC), and custom scopes that you want to permit your app client to
   * authorize access with.
   */
  public open fun allowedOAuthScopes(vararg `value`: String): Unit =
      allowedOAuthScopes(`value`.toList())

  /**
   * The user pool analytics configuration for collecting metrics and sending them to your Amazon
   * Pinpoint campaign.
   */
  public open fun analyticsConfiguration(): Any? = unwrap(this).getAnalyticsConfiguration()

  /**
   * The user pool analytics configuration for collecting metrics and sending them to your Amazon
   * Pinpoint campaign.
   */
  public open fun analyticsConfiguration(`value`: IResolvable) {
    unwrap(this).setAnalyticsConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The user pool analytics configuration for collecting metrics and sending them to your Amazon
   * Pinpoint campaign.
   */
  public open fun analyticsConfiguration(`value`: AnalyticsConfigurationProperty) {
    unwrap(this).setAnalyticsConfiguration(`value`.let(AnalyticsConfigurationProperty.Companion::unwrap))
  }

  /**
   * The user pool analytics configuration for collecting metrics and sending them to your Amazon
   * Pinpoint campaign.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("102bf21851c48d7b0174d4fcb25dd8027756a52a18ce95604a9a1847aa912e6c")
  public open
      fun analyticsConfiguration(`value`: AnalyticsConfigurationProperty.Builder.() -> Unit): Unit =
      analyticsConfiguration(AnalyticsConfigurationProperty(`value`))

  /**
   * The ID of the app client, for example `1example23456789` .
   */
  public open fun attrClientId(): String = unwrap(this).getAttrClientId()

  /**
   *
   */
  public open fun attrClientSecret(): String = unwrap(this).getAttrClientSecret()

  /**
   *
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * Amazon Cognito creates a session token for each API request in an authentication flow.
   */
  public open fun authSessionValidity(): Number? = unwrap(this).getAuthSessionValidity()

  /**
   * Amazon Cognito creates a session token for each API request in an authentication flow.
   */
  public open fun authSessionValidity(`value`: Number) {
    unwrap(this).setAuthSessionValidity(`value`)
  }

  /**
   * A list of allowed redirect, or callback, URLs for managed login authentication.
   */
  public open fun callbackUrLs(): List<String> = unwrap(this).getCallbackUrLs() ?: emptyList()

  /**
   * A list of allowed redirect, or callback, URLs for managed login authentication.
   */
  public open fun callbackUrLs(`value`: List<String>) {
    unwrap(this).setCallbackUrLs(`value`)
  }

  /**
   * A list of allowed redirect, or callback, URLs for managed login authentication.
   */
  public open fun callbackUrLs(vararg `value`: String): Unit = callbackUrLs(`value`.toList())

  /**
   * A friendly name for the app client that you want to create.
   */
  public open fun clientName(): String? = unwrap(this).getClientName()

  /**
   * A friendly name for the app client that you want to create.
   */
  public open fun clientName(`value`: String) {
    unwrap(this).setClientName(`value`)
  }

  /**
   * The default redirect URI.
   */
  public open fun defaultRedirectUri(): String? = unwrap(this).getDefaultRedirectUri()

  /**
   * The default redirect URI.
   */
  public open fun defaultRedirectUri(`value`: String) {
    unwrap(this).setDefaultRedirectUri(`value`)
  }

  /**
   * When `true` , your application can include additional `UserContextData` in authentication
   * requests.
   */
  public open fun enablePropagateAdditionalUserContextData(): Any? =
      unwrap(this).getEnablePropagateAdditionalUserContextData()

  /**
   * When `true` , your application can include additional `UserContextData` in authentication
   * requests.
   */
  public open fun enablePropagateAdditionalUserContextData(`value`: Boolean) {
    unwrap(this).setEnablePropagateAdditionalUserContextData(`value`)
  }

  /**
   * When `true` , your application can include additional `UserContextData` in authentication
   * requests.
   */
  public open fun enablePropagateAdditionalUserContextData(`value`: IResolvable) {
    unwrap(this).setEnablePropagateAdditionalUserContextData(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Activates or deactivates token revocation.
   */
  public open fun enableTokenRevocation(): Any? = unwrap(this).getEnableTokenRevocation()

  /**
   * Activates or deactivates token revocation.
   */
  public open fun enableTokenRevocation(`value`: Boolean) {
    unwrap(this).setEnableTokenRevocation(`value`)
  }

  /**
   * Activates or deactivates token revocation.
   */
  public open fun enableTokenRevocation(`value`: IResolvable) {
    unwrap(this).setEnableTokenRevocation(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The [authentication
   * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
   * that you want your user pool client to support. For each app client in your user pool, you can
   * sign in your users with any combination of one or more flows, including with a user name and
   * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
   * you define with Lambda functions.
   */
  public open fun explicitAuthFlows(): List<String> = unwrap(this).getExplicitAuthFlows() ?:
      emptyList()

  /**
   * The [authentication
   * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
   * that you want your user pool client to support. For each app client in your user pool, you can
   * sign in your users with any combination of one or more flows, including with a user name and
   * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
   * you define with Lambda functions.
   */
  public open fun explicitAuthFlows(`value`: List<String>) {
    unwrap(this).setExplicitAuthFlows(`value`)
  }

  /**
   * The [authentication
   * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
   * that you want your user pool client to support. For each app client in your user pool, you can
   * sign in your users with any combination of one or more flows, including with a user name and
   * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
   * you define with Lambda functions.
   */
  public open fun explicitAuthFlows(vararg `value`: String): Unit =
      explicitAuthFlows(`value`.toList())

  /**
   * When `true` , generates a client secret for the app client.
   */
  public open fun generateSecret(): Any? = unwrap(this).getGenerateSecret()

  /**
   * When `true` , generates a client secret for the app client.
   */
  public open fun generateSecret(`value`: Boolean) {
    unwrap(this).setGenerateSecret(`value`)
  }

  /**
   * When `true` , generates a client secret for the app client.
   */
  public open fun generateSecret(`value`: IResolvable) {
    unwrap(this).setGenerateSecret(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The ID token time limit.
   */
  public open fun idTokenValidity(): Number? = unwrap(this).getIdTokenValidity()

  /**
   * The ID token time limit.
   */
  public open fun idTokenValidity(`value`: Number) {
    unwrap(this).setIdTokenValidity(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A list of allowed logout URLs for managed login authentication.
   */
  public open fun logoutUrLs(): List<String> = unwrap(this).getLogoutUrLs() ?: emptyList()

  /**
   * A list of allowed logout URLs for managed login authentication.
   */
  public open fun logoutUrLs(`value`: List<String>) {
    unwrap(this).setLogoutUrLs(`value`)
  }

  /**
   * A list of allowed logout URLs for managed login authentication.
   */
  public open fun logoutUrLs(vararg `value`: String): Unit = logoutUrLs(`value`.toList())

  /**
   * Errors and responses that you want Amazon Cognito APIs to return during authentication, account
   * confirmation, and password recovery when the user doesn't exist in the user pool.
   */
  public open fun preventUserExistenceErrors(): String? =
      unwrap(this).getPreventUserExistenceErrors()

  /**
   * Errors and responses that you want Amazon Cognito APIs to return during authentication, account
   * confirmation, and password recovery when the user doesn't exist in the user pool.
   */
  public open fun preventUserExistenceErrors(`value`: String) {
    unwrap(this).setPreventUserExistenceErrors(`value`)
  }

  /**
   * The list of user attributes that you want your app client to have read access to.
   */
  public open fun readAttributes(): List<String> = unwrap(this).getReadAttributes() ?: emptyList()

  /**
   * The list of user attributes that you want your app client to have read access to.
   */
  public open fun readAttributes(`value`: List<String>) {
    unwrap(this).setReadAttributes(`value`)
  }

  /**
   * The list of user attributes that you want your app client to have read access to.
   */
  public open fun readAttributes(vararg `value`: String): Unit = readAttributes(`value`.toList())

  /**
   * The configuration of your app client for refresh token rotation.
   */
  public open fun refreshTokenRotation(): Any? = unwrap(this).getRefreshTokenRotation()

  /**
   * The configuration of your app client for refresh token rotation.
   */
  public open fun refreshTokenRotation(`value`: IResolvable) {
    unwrap(this).setRefreshTokenRotation(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration of your app client for refresh token rotation.
   */
  public open fun refreshTokenRotation(`value`: RefreshTokenRotationProperty) {
    unwrap(this).setRefreshTokenRotation(`value`.let(RefreshTokenRotationProperty.Companion::unwrap))
  }

  /**
   * The configuration of your app client for refresh token rotation.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("42b2e28ca0ba8de081e5cf55a4bbb7e51e3ffd53644133a9b4a3ac64a684bf1d")
  public open fun refreshTokenRotation(`value`: RefreshTokenRotationProperty.Builder.() -> Unit):
      Unit = refreshTokenRotation(RefreshTokenRotationProperty(`value`))

  /**
   * The refresh token time limit.
   */
  public open fun refreshTokenValidity(): Number? = unwrap(this).getRefreshTokenValidity()

  /**
   * The refresh token time limit.
   */
  public open fun refreshTokenValidity(`value`: Number) {
    unwrap(this).setRefreshTokenValidity(`value`)
  }

  /**
   * A list of provider names for the identity providers (IdPs) that are supported on this client.
   */
  public open fun supportedIdentityProviders(): List<String> =
      unwrap(this).getSupportedIdentityProviders() ?: emptyList()

  /**
   * A list of provider names for the identity providers (IdPs) that are supported on this client.
   */
  public open fun supportedIdentityProviders(`value`: List<String>) {
    unwrap(this).setSupportedIdentityProviders(`value`)
  }

  /**
   * A list of provider names for the identity providers (IdPs) that are supported on this client.
   */
  public open fun supportedIdentityProviders(vararg `value`: String): Unit =
      supportedIdentityProviders(`value`.toList())

  /**
   * The units that validity times are represented in.
   */
  public open fun tokenValidityUnits(): Any? = unwrap(this).getTokenValidityUnits()

  /**
   * The units that validity times are represented in.
   */
  public open fun tokenValidityUnits(`value`: IResolvable) {
    unwrap(this).setTokenValidityUnits(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The units that validity times are represented in.
   */
  public open fun tokenValidityUnits(`value`: TokenValidityUnitsProperty) {
    unwrap(this).setTokenValidityUnits(`value`.let(TokenValidityUnitsProperty.Companion::unwrap))
  }

  /**
   * The units that validity times are represented in.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("413ff2cb02d2613d782abf027a2d67ebe8e35dfbb363a27a330d747431aed8bb")
  public open fun tokenValidityUnits(`value`: TokenValidityUnitsProperty.Builder.() -> Unit): Unit =
      tokenValidityUnits(TokenValidityUnitsProperty(`value`))

  /**
   * The ID of the user pool where you want to create an app client.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The ID of the user pool where you want to create an app client.
   */
  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  /**
   * The list of user attributes that you want your app client to have write access to.
   */
  public open fun writeAttributes(): List<String> = unwrap(this).getWriteAttributes() ?: emptyList()

  /**
   * The list of user attributes that you want your app client to have write access to.
   */
  public open fun writeAttributes(`value`: List<String>) {
    unwrap(this).setWriteAttributes(`value`)
  }

  /**
   * The list of user attributes that you want your app client to have write access to.
   */
  public open fun writeAttributes(vararg `value`: String): Unit = writeAttributes(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnUserPoolClient].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param accessTokenValidity The access token time limit. 
     */
    public fun accessTokenValidity(accessTokenValidity: Number)

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
     * @param allowedOAuthFlows The OAuth grant types that you want your app client to generate for
     * clients in managed login authentication. 
     */
    public fun allowedOAuthFlows(allowedOAuthFlows: List<String>)

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
     * @param allowedOAuthFlows The OAuth grant types that you want your app client to generate for
     * clients in managed login authentication. 
     */
    public fun allowedOAuthFlows(vararg allowedOAuthFlows: String)

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
     * @param allowedOAuthFlowsUserPoolClient Set to `true` to use OAuth 2.0 authorization server
     * features in your app client. 
     */
    public fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: Boolean)

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
     * @param allowedOAuthFlowsUserPoolClient Set to `true` to use OAuth 2.0 authorization server
     * features in your app client. 
     */
    public fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: IResolvable)

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
     * @param allowedOAuthScopes The OAuth, OpenID Connect (OIDC), and custom scopes that you want
     * to permit your app client to authorize access with. 
     */
    public fun allowedOAuthScopes(allowedOAuthScopes: List<String>)

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
     * @param allowedOAuthScopes The OAuth, OpenID Connect (OIDC), and custom scopes that you want
     * to permit your app client to authorize access with. 
     */
    public fun allowedOAuthScopes(vararg allowedOAuthScopes: String)

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
     * @param analyticsConfiguration The user pool analytics configuration for collecting metrics
     * and sending them to your Amazon Pinpoint campaign. 
     */
    public fun analyticsConfiguration(analyticsConfiguration: IResolvable)

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
     * @param analyticsConfiguration The user pool analytics configuration for collecting metrics
     * and sending them to your Amazon Pinpoint campaign. 
     */
    public fun analyticsConfiguration(analyticsConfiguration: AnalyticsConfigurationProperty)

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
     * @param analyticsConfiguration The user pool analytics configuration for collecting metrics
     * and sending them to your Amazon Pinpoint campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48cae7ce2dc592da94fa21c75ec0358a510ee6100105ad2c0c70cb8f3838fdba")
    public
        fun analyticsConfiguration(analyticsConfiguration: AnalyticsConfigurationProperty.Builder.() -> Unit)

    /**
     * Amazon Cognito creates a session token for each API request in an authentication flow.
     *
     * `AuthSessionValidity` is the duration, in minutes, of that session token. Your user pool
     * native user must respond to each authentication challenge before the session expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-authsessionvalidity)
     * @param authSessionValidity Amazon Cognito creates a session token for each API request in an
     * authentication flow. 
     */
    public fun authSessionValidity(authSessionValidity: Number)

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
     * @param callbackUrLs A list of allowed redirect, or callback, URLs for managed login
     * authentication. 
     */
    public fun callbackUrLs(callbackUrLs: List<String>)

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
     * @param callbackUrLs A list of allowed redirect, or callback, URLs for managed login
     * authentication. 
     */
    public fun callbackUrLs(vararg callbackUrLs: String)

    /**
     * A friendly name for the app client that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname)
     * @param clientName A friendly name for the app client that you want to create. 
     */
    public fun clientName(clientName: String)

    /**
     * The default redirect URI.
     *
     * In app clients with one assigned IdP, replaces `redirect_uri` in authentication requests.
     * Must be in the `CallbackURLs` list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-defaultredirecturi)
     * @param defaultRedirectUri The default redirect URI. 
     */
    public fun defaultRedirectUri(defaultRedirectUri: String)

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
     * @param enablePropagateAdditionalUserContextData When `true` , your application can include
     * additional `UserContextData` in authentication requests. 
     */
    public
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: Boolean)

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
     * @param enablePropagateAdditionalUserContextData When `true` , your application can include
     * additional `UserContextData` in authentication requests. 
     */
    public
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: IResolvable)

    /**
     * Activates or deactivates token revocation.
     *
     * If you don't include this parameter, token revocation is automatically activated for the new
     * user pool client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-enabletokenrevocation)
     * @param enableTokenRevocation Activates or deactivates token revocation. 
     */
    public fun enableTokenRevocation(enableTokenRevocation: Boolean)

    /**
     * Activates or deactivates token revocation.
     *
     * If you don't include this parameter, token revocation is automatically activated for the new
     * user pool client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-enabletokenrevocation)
     * @param enableTokenRevocation Activates or deactivates token revocation. 
     */
    public fun enableTokenRevocation(enableTokenRevocation: IResolvable)

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
     * @param explicitAuthFlows The [authentication
     * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
     * that you want your user pool client to support. For each app client in your user pool, you can
     * sign in your users with any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
     * you define with Lambda functions. 
     */
    public fun explicitAuthFlows(explicitAuthFlows: List<String>)

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
     * @param explicitAuthFlows The [authentication
     * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
     * that you want your user pool client to support. For each app client in your user pool, you can
     * sign in your users with any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
     * you define with Lambda functions. 
     */
    public fun explicitAuthFlows(vararg explicitAuthFlows: String)

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
     * @param generateSecret When `true` , generates a client secret for the app client. 
     */
    public fun generateSecret(generateSecret: Boolean)

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
     * @param generateSecret When `true` , generates a client secret for the app client. 
     */
    public fun generateSecret(generateSecret: IResolvable)

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
     * @param idTokenValidity The ID token time limit. 
     */
    public fun idTokenValidity(idTokenValidity: Number)

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
     * @param logoutUrLs A list of allowed logout URLs for managed login authentication. 
     */
    public fun logoutUrLs(logoutUrLs: List<String>)

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
     * @param logoutUrLs A list of allowed logout URLs for managed login authentication. 
     */
    public fun logoutUrLs(vararg logoutUrLs: String)

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
     * @param preventUserExistenceErrors Errors and responses that you want Amazon Cognito APIs to
     * return during authentication, account confirmation, and password recovery when the user doesn't
     * exist in the user pool. 
     */
    public fun preventUserExistenceErrors(preventUserExistenceErrors: String)

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
     * @param readAttributes The list of user attributes that you want your app client to have read
     * access to. 
     */
    public fun readAttributes(readAttributes: List<String>)

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
     * @param readAttributes The list of user attributes that you want your app client to have read
     * access to. 
     */
    public fun readAttributes(vararg readAttributes: String)

    /**
     * The configuration of your app client for refresh token rotation.
     *
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenrotation)
     * @param refreshTokenRotation The configuration of your app client for refresh token rotation. 
     */
    public fun refreshTokenRotation(refreshTokenRotation: IResolvable)

    /**
     * The configuration of your app client for refresh token rotation.
     *
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenrotation)
     * @param refreshTokenRotation The configuration of your app client for refresh token rotation. 
     */
    public fun refreshTokenRotation(refreshTokenRotation: RefreshTokenRotationProperty)

    /**
     * The configuration of your app client for refresh token rotation.
     *
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenrotation)
     * @param refreshTokenRotation The configuration of your app client for refresh token rotation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55e5e8219a26d794d69968c27692de854cb96c57f73a84520e651f3396de76a9")
    public
        fun refreshTokenRotation(refreshTokenRotation: RefreshTokenRotationProperty.Builder.() -> Unit)

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
     * @param refreshTokenValidity The refresh token time limit. 
     */
    public fun refreshTokenValidity(refreshTokenValidity: Number)

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
     * @param supportedIdentityProviders A list of provider names for the identity providers (IdPs)
     * that are supported on this client. 
     */
    public fun supportedIdentityProviders(supportedIdentityProviders: List<String>)

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
     * @param supportedIdentityProviders A list of provider names for the identity providers (IdPs)
     * that are supported on this client. 
     */
    public fun supportedIdentityProviders(vararg supportedIdentityProviders: String)

    /**
     * The units that validity times are represented in.
     *
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-tokenvalidityunits)
     * @param tokenValidityUnits The units that validity times are represented in. 
     */
    public fun tokenValidityUnits(tokenValidityUnits: IResolvable)

    /**
     * The units that validity times are represented in.
     *
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-tokenvalidityunits)
     * @param tokenValidityUnits The units that validity times are represented in. 
     */
    public fun tokenValidityUnits(tokenValidityUnits: TokenValidityUnitsProperty)

    /**
     * The units that validity times are represented in.
     *
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-tokenvalidityunits)
     * @param tokenValidityUnits The units that validity times are represented in. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("443f031b846120e488d68c74c4d139304198bea73f85c4e88d462430a8525142")
    public fun tokenValidityUnits(tokenValidityUnits: TokenValidityUnitsProperty.Builder.() -> Unit)

    /**
     * The ID of the user pool where you want to create an app client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid)
     * @param userPoolId The ID of the user pool where you want to create an app client. 
     */
    public fun userPoolId(userPoolId: String)

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
     * @param writeAttributes The list of user attributes that you want your app client to have
     * write access to. 
     */
    public fun writeAttributes(writeAttributes: List<String>)

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
     * @param writeAttributes The list of user attributes that you want your app client to have
     * write access to. 
     */
    public fun writeAttributes(vararg writeAttributes: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolClient.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolClient.Builder.create(scope, id)

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
     * @param accessTokenValidity The access token time limit. 
     */
    override fun accessTokenValidity(accessTokenValidity: Number) {
      cdkBuilder.accessTokenValidity(accessTokenValidity)
    }

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
     * @param allowedOAuthFlows The OAuth grant types that you want your app client to generate for
     * clients in managed login authentication. 
     */
    override fun allowedOAuthFlows(allowedOAuthFlows: List<String>) {
      cdkBuilder.allowedOAuthFlows(allowedOAuthFlows)
    }

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
     * @param allowedOAuthFlows The OAuth grant types that you want your app client to generate for
     * clients in managed login authentication. 
     */
    override fun allowedOAuthFlows(vararg allowedOAuthFlows: String): Unit =
        allowedOAuthFlows(allowedOAuthFlows.toList())

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
     * @param allowedOAuthFlowsUserPoolClient Set to `true` to use OAuth 2.0 authorization server
     * features in your app client. 
     */
    override fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: Boolean) {
      cdkBuilder.allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient)
    }

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
     * @param allowedOAuthFlowsUserPoolClient Set to `true` to use OAuth 2.0 authorization server
     * features in your app client. 
     */
    override fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: IResolvable) {
      cdkBuilder.allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient.let(IResolvable.Companion::unwrap))
    }

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
     * @param allowedOAuthScopes The OAuth, OpenID Connect (OIDC), and custom scopes that you want
     * to permit your app client to authorize access with. 
     */
    override fun allowedOAuthScopes(allowedOAuthScopes: List<String>) {
      cdkBuilder.allowedOAuthScopes(allowedOAuthScopes)
    }

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
     * @param allowedOAuthScopes The OAuth, OpenID Connect (OIDC), and custom scopes that you want
     * to permit your app client to authorize access with. 
     */
    override fun allowedOAuthScopes(vararg allowedOAuthScopes: String): Unit =
        allowedOAuthScopes(allowedOAuthScopes.toList())

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
     * @param analyticsConfiguration The user pool analytics configuration for collecting metrics
     * and sending them to your Amazon Pinpoint campaign. 
     */
    override fun analyticsConfiguration(analyticsConfiguration: IResolvable) {
      cdkBuilder.analyticsConfiguration(analyticsConfiguration.let(IResolvable.Companion::unwrap))
    }

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
     * @param analyticsConfiguration The user pool analytics configuration for collecting metrics
     * and sending them to your Amazon Pinpoint campaign. 
     */
    override fun analyticsConfiguration(analyticsConfiguration: AnalyticsConfigurationProperty) {
      cdkBuilder.analyticsConfiguration(analyticsConfiguration.let(AnalyticsConfigurationProperty.Companion::unwrap))
    }

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
     * @param analyticsConfiguration The user pool analytics configuration for collecting metrics
     * and sending them to your Amazon Pinpoint campaign. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48cae7ce2dc592da94fa21c75ec0358a510ee6100105ad2c0c70cb8f3838fdba")
    override
        fun analyticsConfiguration(analyticsConfiguration: AnalyticsConfigurationProperty.Builder.() -> Unit):
        Unit = analyticsConfiguration(AnalyticsConfigurationProperty(analyticsConfiguration))

    /**
     * Amazon Cognito creates a session token for each API request in an authentication flow.
     *
     * `AuthSessionValidity` is the duration, in minutes, of that session token. Your user pool
     * native user must respond to each authentication challenge before the session expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-authsessionvalidity)
     * @param authSessionValidity Amazon Cognito creates a session token for each API request in an
     * authentication flow. 
     */
    override fun authSessionValidity(authSessionValidity: Number) {
      cdkBuilder.authSessionValidity(authSessionValidity)
    }

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
     * @param callbackUrLs A list of allowed redirect, or callback, URLs for managed login
     * authentication. 
     */
    override fun callbackUrLs(callbackUrLs: List<String>) {
      cdkBuilder.callbackUrLs(callbackUrLs)
    }

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
     * @param callbackUrLs A list of allowed redirect, or callback, URLs for managed login
     * authentication. 
     */
    override fun callbackUrLs(vararg callbackUrLs: String): Unit =
        callbackUrLs(callbackUrLs.toList())

    /**
     * A friendly name for the app client that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname)
     * @param clientName A friendly name for the app client that you want to create. 
     */
    override fun clientName(clientName: String) {
      cdkBuilder.clientName(clientName)
    }

    /**
     * The default redirect URI.
     *
     * In app clients with one assigned IdP, replaces `redirect_uri` in authentication requests.
     * Must be in the `CallbackURLs` list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-defaultredirecturi)
     * @param defaultRedirectUri The default redirect URI. 
     */
    override fun defaultRedirectUri(defaultRedirectUri: String) {
      cdkBuilder.defaultRedirectUri(defaultRedirectUri)
    }

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
     * @param enablePropagateAdditionalUserContextData When `true` , your application can include
     * additional `UserContextData` in authentication requests. 
     */
    override
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: Boolean) {
      cdkBuilder.enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData)
    }

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
     * @param enablePropagateAdditionalUserContextData When `true` , your application can include
     * additional `UserContextData` in authentication requests. 
     */
    override
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: IResolvable) {
      cdkBuilder.enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData.let(IResolvable.Companion::unwrap))
    }

    /**
     * Activates or deactivates token revocation.
     *
     * If you don't include this parameter, token revocation is automatically activated for the new
     * user pool client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-enabletokenrevocation)
     * @param enableTokenRevocation Activates or deactivates token revocation. 
     */
    override fun enableTokenRevocation(enableTokenRevocation: Boolean) {
      cdkBuilder.enableTokenRevocation(enableTokenRevocation)
    }

    /**
     * Activates or deactivates token revocation.
     *
     * If you don't include this parameter, token revocation is automatically activated for the new
     * user pool client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-enabletokenrevocation)
     * @param enableTokenRevocation Activates or deactivates token revocation. 
     */
    override fun enableTokenRevocation(enableTokenRevocation: IResolvable) {
      cdkBuilder.enableTokenRevocation(enableTokenRevocation.let(IResolvable.Companion::unwrap))
    }

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
     * @param explicitAuthFlows The [authentication
     * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
     * that you want your user pool client to support. For each app client in your user pool, you can
     * sign in your users with any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
     * you define with Lambda functions. 
     */
    override fun explicitAuthFlows(explicitAuthFlows: List<String>) {
      cdkBuilder.explicitAuthFlows(explicitAuthFlows)
    }

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
     * @param explicitAuthFlows The [authentication
     * flows](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow-methods.html)
     * that you want your user pool client to support. For each app client in your user pool, you can
     * sign in your users with any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom authentication process that
     * you define with Lambda functions. 
     */
    override fun explicitAuthFlows(vararg explicitAuthFlows: String): Unit =
        explicitAuthFlows(explicitAuthFlows.toList())

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
     * @param generateSecret When `true` , generates a client secret for the app client. 
     */
    override fun generateSecret(generateSecret: Boolean) {
      cdkBuilder.generateSecret(generateSecret)
    }

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
     * @param generateSecret When `true` , generates a client secret for the app client. 
     */
    override fun generateSecret(generateSecret: IResolvable) {
      cdkBuilder.generateSecret(generateSecret.let(IResolvable.Companion::unwrap))
    }

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
     * @param idTokenValidity The ID token time limit. 
     */
    override fun idTokenValidity(idTokenValidity: Number) {
      cdkBuilder.idTokenValidity(idTokenValidity)
    }

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
     * @param logoutUrLs A list of allowed logout URLs for managed login authentication. 
     */
    override fun logoutUrLs(logoutUrLs: List<String>) {
      cdkBuilder.logoutUrLs(logoutUrLs)
    }

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
     * @param logoutUrLs A list of allowed logout URLs for managed login authentication. 
     */
    override fun logoutUrLs(vararg logoutUrLs: String): Unit = logoutUrLs(logoutUrLs.toList())

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
     * @param preventUserExistenceErrors Errors and responses that you want Amazon Cognito APIs to
     * return during authentication, account confirmation, and password recovery when the user doesn't
     * exist in the user pool. 
     */
    override fun preventUserExistenceErrors(preventUserExistenceErrors: String) {
      cdkBuilder.preventUserExistenceErrors(preventUserExistenceErrors)
    }

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
     * @param readAttributes The list of user attributes that you want your app client to have read
     * access to. 
     */
    override fun readAttributes(readAttributes: List<String>) {
      cdkBuilder.readAttributes(readAttributes)
    }

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
     * @param readAttributes The list of user attributes that you want your app client to have read
     * access to. 
     */
    override fun readAttributes(vararg readAttributes: String): Unit =
        readAttributes(readAttributes.toList())

    /**
     * The configuration of your app client for refresh token rotation.
     *
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenrotation)
     * @param refreshTokenRotation The configuration of your app client for refresh token rotation. 
     */
    override fun refreshTokenRotation(refreshTokenRotation: IResolvable) {
      cdkBuilder.refreshTokenRotation(refreshTokenRotation.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration of your app client for refresh token rotation.
     *
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenrotation)
     * @param refreshTokenRotation The configuration of your app client for refresh token rotation. 
     */
    override fun refreshTokenRotation(refreshTokenRotation: RefreshTokenRotationProperty) {
      cdkBuilder.refreshTokenRotation(refreshTokenRotation.let(RefreshTokenRotationProperty.Companion::unwrap))
    }

    /**
     * The configuration of your app client for refresh token rotation.
     *
     * When enabled, your app client issues new ID, access, and refresh tokens when users renew
     * their sessions with refresh tokens. When disabled, token refresh issues only ID and access
     * tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenrotation)
     * @param refreshTokenRotation The configuration of your app client for refresh token rotation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55e5e8219a26d794d69968c27692de854cb96c57f73a84520e651f3396de76a9")
    override
        fun refreshTokenRotation(refreshTokenRotation: RefreshTokenRotationProperty.Builder.() -> Unit):
        Unit = refreshTokenRotation(RefreshTokenRotationProperty(refreshTokenRotation))

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
     * @param refreshTokenValidity The refresh token time limit. 
     */
    override fun refreshTokenValidity(refreshTokenValidity: Number) {
      cdkBuilder.refreshTokenValidity(refreshTokenValidity)
    }

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
     * @param supportedIdentityProviders A list of provider names for the identity providers (IdPs)
     * that are supported on this client. 
     */
    override fun supportedIdentityProviders(supportedIdentityProviders: List<String>) {
      cdkBuilder.supportedIdentityProviders(supportedIdentityProviders)
    }

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
     * @param supportedIdentityProviders A list of provider names for the identity providers (IdPs)
     * that are supported on this client. 
     */
    override fun supportedIdentityProviders(vararg supportedIdentityProviders: String): Unit =
        supportedIdentityProviders(supportedIdentityProviders.toList())

    /**
     * The units that validity times are represented in.
     *
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-tokenvalidityunits)
     * @param tokenValidityUnits The units that validity times are represented in. 
     */
    override fun tokenValidityUnits(tokenValidityUnits: IResolvable) {
      cdkBuilder.tokenValidityUnits(tokenValidityUnits.let(IResolvable.Companion::unwrap))
    }

    /**
     * The units that validity times are represented in.
     *
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-tokenvalidityunits)
     * @param tokenValidityUnits The units that validity times are represented in. 
     */
    override fun tokenValidityUnits(tokenValidityUnits: TokenValidityUnitsProperty) {
      cdkBuilder.tokenValidityUnits(tokenValidityUnits.let(TokenValidityUnitsProperty.Companion::unwrap))
    }

    /**
     * The units that validity times are represented in.
     *
     * The default unit for refresh tokens is days, and the default for ID and access tokens are
     * hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-tokenvalidityunits)
     * @param tokenValidityUnits The units that validity times are represented in. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("443f031b846120e488d68c74c4d139304198bea73f85c4e88d462430a8525142")
    override
        fun tokenValidityUnits(tokenValidityUnits: TokenValidityUnitsProperty.Builder.() -> Unit):
        Unit = tokenValidityUnits(TokenValidityUnitsProperty(tokenValidityUnits))

    /**
     * The ID of the user pool where you want to create an app client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid)
     * @param userPoolId The ID of the user pool where you want to create an app client. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

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
     * @param writeAttributes The list of user attributes that you want your app client to have
     * write access to. 
     */
    override fun writeAttributes(writeAttributes: List<String>) {
      cdkBuilder.writeAttributes(writeAttributes)
    }

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
     * @param writeAttributes The list of user attributes that you want your app client to have
     * write access to. 
     */
    override fun writeAttributes(vararg writeAttributes: String): Unit =
        writeAttributes(writeAttributes.toList())

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolClient =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnUserPoolClient.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolClient {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolClient(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClient):
        CfnUserPoolClient = CfnUserPoolClient(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolClient):
        software.amazon.awscdk.services.cognito.CfnUserPoolClient = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolClient
  }

  /**
   * The settings for Amazon Pinpoint analytics configuration.
   *
   * With an analytics configuration, your application can collect user-activity metrics for user
   * notifications with a Amazon Pinpoint campaign.
   *
   * Amazon Pinpoint isn't available in all AWS Regions. For a list of available Regions, see
   * [Amazon Cognito and Amazon Pinpoint Region
   * availability](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-pinpoint-integration.html#cognito-user-pools-find-region-mappings)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * AnalyticsConfigurationProperty analyticsConfigurationProperty =
   * AnalyticsConfigurationProperty.builder()
   * .applicationArn("applicationArn")
   * .applicationId("applicationId")
   * .externalId("externalId")
   * .roleArn("roleArn")
   * .userDataShared(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html)
   */
  public interface AnalyticsConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of an Amazon Pinpoint project that you want to connect to your
     * user pool app client.
     *
     * Amazon Cognito publishes events to the Amazon Pinpoint project that `ApplicationArn`
     * declares. You can also configure your application to pass an endpoint ID in the
     * `AnalyticsMetadata` parameter of sign-in operations. The endpoint ID is information about the
     * destination for push notifications
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html#cfn-cognito-userpoolclient-analyticsconfiguration-applicationarn)
     */
    public fun applicationArn(): String? = unwrap(this).getApplicationArn()

    /**
     * Your Amazon Pinpoint project ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html#cfn-cognito-userpoolclient-analyticsconfiguration-applicationid)
     */
    public fun applicationId(): String? = unwrap(this).getApplicationId()

    /**
     * The [external
     * ID](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html)
     * of the role that Amazon Cognito assumes to send analytics data to Amazon Pinpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html#cfn-cognito-userpoolclient-analyticsconfiguration-externalid)
     */
    public fun externalId(): String? = unwrap(this).getExternalId()

    /**
     * The ARN of an AWS Identity and Access Management role that has the permissions required for
     * Amazon Cognito to publish events to Amazon Pinpoint analytics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html#cfn-cognito-userpoolclient-analyticsconfiguration-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * If `UserDataShared` is `true` , Amazon Cognito includes user data in the events that it
     * publishes to Amazon Pinpoint analytics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html#cfn-cognito-userpoolclient-analyticsconfiguration-userdatashared)
     */
    public fun userDataShared(): Any? = unwrap(this).getUserDataShared()

    /**
     * A builder for [AnalyticsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationArn The Amazon Resource Name (ARN) of an Amazon Pinpoint project that you
       * want to connect to your user pool app client.
       * Amazon Cognito publishes events to the Amazon Pinpoint project that `ApplicationArn`
       * declares. You can also configure your application to pass an endpoint ID in the
       * `AnalyticsMetadata` parameter of sign-in operations. The endpoint ID is information about the
       * destination for push notifications
       */
      public fun applicationArn(applicationArn: String)

      /**
       * @param applicationId Your Amazon Pinpoint project ID.
       */
      public fun applicationId(applicationId: String)

      /**
       * @param externalId The [external
       * ID](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html)
       * of the role that Amazon Cognito assumes to send analytics data to Amazon Pinpoint.
       */
      public fun externalId(externalId: String)

      /**
       * @param roleArn The ARN of an AWS Identity and Access Management role that has the
       * permissions required for Amazon Cognito to publish events to Amazon Pinpoint analytics.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param userDataShared If `UserDataShared` is `true` , Amazon Cognito includes user data in
       * the events that it publishes to Amazon Pinpoint analytics.
       */
      public fun userDataShared(userDataShared: Boolean)

      /**
       * @param userDataShared If `UserDataShared` is `true` , Amazon Cognito includes user data in
       * the events that it publishes to Amazon Pinpoint analytics.
       */
      public fun userDataShared(userDataShared: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty.builder()

      /**
       * @param applicationArn The Amazon Resource Name (ARN) of an Amazon Pinpoint project that you
       * want to connect to your user pool app client.
       * Amazon Cognito publishes events to the Amazon Pinpoint project that `ApplicationArn`
       * declares. You can also configure your application to pass an endpoint ID in the
       * `AnalyticsMetadata` parameter of sign-in operations. The endpoint ID is information about the
       * destination for push notifications
       */
      override fun applicationArn(applicationArn: String) {
        cdkBuilder.applicationArn(applicationArn)
      }

      /**
       * @param applicationId Your Amazon Pinpoint project ID.
       */
      override fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
      }

      /**
       * @param externalId The [external
       * ID](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html)
       * of the role that Amazon Cognito assumes to send analytics data to Amazon Pinpoint.
       */
      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      /**
       * @param roleArn The ARN of an AWS Identity and Access Management role that has the
       * permissions required for Amazon Cognito to publish events to Amazon Pinpoint analytics.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param userDataShared If `UserDataShared` is `true` , Amazon Cognito includes user data in
       * the events that it publishes to Amazon Pinpoint analytics.
       */
      override fun userDataShared(userDataShared: Boolean) {
        cdkBuilder.userDataShared(userDataShared)
      }

      /**
       * @param userDataShared If `UserDataShared` is `true` , Amazon Cognito includes user data in
       * the events that it publishes to Amazon Pinpoint analytics.
       */
      override fun userDataShared(userDataShared: IResolvable) {
        cdkBuilder.userDataShared(userDataShared.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty,
    ) : CdkObject(cdkObject),
        AnalyticsConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of an Amazon Pinpoint project that you want to connect to
       * your user pool app client.
       *
       * Amazon Cognito publishes events to the Amazon Pinpoint project that `ApplicationArn`
       * declares. You can also configure your application to pass an endpoint ID in the
       * `AnalyticsMetadata` parameter of sign-in operations. The endpoint ID is information about the
       * destination for push notifications
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html#cfn-cognito-userpoolclient-analyticsconfiguration-applicationarn)
       */
      override fun applicationArn(): String? = unwrap(this).getApplicationArn()

      /**
       * Your Amazon Pinpoint project ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html#cfn-cognito-userpoolclient-analyticsconfiguration-applicationid)
       */
      override fun applicationId(): String? = unwrap(this).getApplicationId()

      /**
       * The [external
       * ID](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html)
       * of the role that Amazon Cognito assumes to send analytics data to Amazon Pinpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html#cfn-cognito-userpoolclient-analyticsconfiguration-externalid)
       */
      override fun externalId(): String? = unwrap(this).getExternalId()

      /**
       * The ARN of an AWS Identity and Access Management role that has the permissions required for
       * Amazon Cognito to publish events to Amazon Pinpoint analytics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html#cfn-cognito-userpoolclient-analyticsconfiguration-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * If `UserDataShared` is `true` , Amazon Cognito includes user data in the events that it
       * publishes to Amazon Pinpoint analytics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html#cfn-cognito-userpoolclient-analyticsconfiguration-userdatashared)
       */
      override fun userDataShared(): Any? = unwrap(this).getUserDataShared()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalyticsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty):
          AnalyticsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalyticsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalyticsConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty
    }
  }

  /**
   * The configuration of your app client for refresh token rotation.
   *
   * When enabled, your app client issues new ID, access, and refresh tokens when users renew their
   * sessions with refresh tokens. When disabled, token refresh issues only ID and access tokens.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * RefreshTokenRotationProperty refreshTokenRotationProperty =
   * RefreshTokenRotationProperty.builder()
   * .feature("feature")
   * .retryGracePeriodSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-refreshtokenrotation.html)
   */
  public interface RefreshTokenRotationProperty {
    /**
     * The state of refresh token rotation for the current app client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-refreshtokenrotation.html#cfn-cognito-userpoolclient-refreshtokenrotation-feature)
     */
    public fun feature(): String? = unwrap(this).getFeature()

    /**
     * When you request a token refresh with `GetTokensFromRefreshToken` , the original refresh
     * token that you're rotating out can remain valid for a period of time of up to 60 seconds.
     *
     * This allows for client-side retries. When `RetryGracePeriodSeconds` is `0` , the grace period
     * is disabled and a successful request immediately invalidates the submitted refresh token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-refreshtokenrotation.html#cfn-cognito-userpoolclient-refreshtokenrotation-retrygraceperiodseconds)
     */
    public fun retryGracePeriodSeconds(): Number? = unwrap(this).getRetryGracePeriodSeconds()

    /**
     * A builder for [RefreshTokenRotationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param feature The state of refresh token rotation for the current app client.
       */
      public fun feature(feature: String)

      /**
       * @param retryGracePeriodSeconds When you request a token refresh with
       * `GetTokensFromRefreshToken` , the original refresh token that you're rotating out can remain
       * valid for a period of time of up to 60 seconds.
       * This allows for client-side retries. When `RetryGracePeriodSeconds` is `0` , the grace
       * period is disabled and a successful request immediately invalidates the submitted refresh
       * token.
       */
      public fun retryGracePeriodSeconds(retryGracePeriodSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.RefreshTokenRotationProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.RefreshTokenRotationProperty.builder()

      /**
       * @param feature The state of refresh token rotation for the current app client.
       */
      override fun feature(feature: String) {
        cdkBuilder.feature(feature)
      }

      /**
       * @param retryGracePeriodSeconds When you request a token refresh with
       * `GetTokensFromRefreshToken` , the original refresh token that you're rotating out can remain
       * valid for a period of time of up to 60 seconds.
       * This allows for client-side retries. When `RetryGracePeriodSeconds` is `0` , the grace
       * period is disabled and a successful request immediately invalidates the submitted refresh
       * token.
       */
      override fun retryGracePeriodSeconds(retryGracePeriodSeconds: Number) {
        cdkBuilder.retryGracePeriodSeconds(retryGracePeriodSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.RefreshTokenRotationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClient.RefreshTokenRotationProperty,
    ) : CdkObject(cdkObject),
        RefreshTokenRotationProperty {
      /**
       * The state of refresh token rotation for the current app client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-refreshtokenrotation.html#cfn-cognito-userpoolclient-refreshtokenrotation-feature)
       */
      override fun feature(): String? = unwrap(this).getFeature()

      /**
       * When you request a token refresh with `GetTokensFromRefreshToken` , the original refresh
       * token that you're rotating out can remain valid for a period of time of up to 60 seconds.
       *
       * This allows for client-side retries. When `RetryGracePeriodSeconds` is `0` , the grace
       * period is disabled and a successful request immediately invalidates the submitted refresh
       * token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-refreshtokenrotation.html#cfn-cognito-userpoolclient-refreshtokenrotation-retrygraceperiodseconds)
       */
      override fun retryGracePeriodSeconds(): Number? = unwrap(this).getRetryGracePeriodSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RefreshTokenRotationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClient.RefreshTokenRotationProperty):
          RefreshTokenRotationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RefreshTokenRotationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RefreshTokenRotationProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.RefreshTokenRotationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.RefreshTokenRotationProperty
    }
  }

  /**
   * The units that validity times are represented in.
   *
   * The default unit for refresh tokens is days, and the default for ID and access tokens are
   * hours.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * TokenValidityUnitsProperty tokenValidityUnitsProperty = TokenValidityUnitsProperty.builder()
   * .accessToken("accessToken")
   * .idToken("idToken")
   * .refreshToken("refreshToken")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-tokenvalidityunits.html)
   */
  public interface TokenValidityUnitsProperty {
    /**
     * A time unit for the value that you set in the `AccessTokenValidity` parameter.
     *
     * The default `AccessTokenValidity` time unit is `hours` . `AccessTokenValidity` duration can
     * range from five minutes to one day.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-tokenvalidityunits.html#cfn-cognito-userpoolclient-tokenvalidityunits-accesstoken)
     */
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    /**
     * A time unit for the value that you set in the `IdTokenValidity` parameter.
     *
     * The default `IdTokenValidity` time unit is `hours` . `IdTokenValidity` duration can range
     * from five minutes to one day.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-tokenvalidityunits.html#cfn-cognito-userpoolclient-tokenvalidityunits-idtoken)
     */
    public fun idToken(): String? = unwrap(this).getIdToken()

    /**
     * A time unit for the value that you set in the `RefreshTokenValidity` parameter.
     *
     * The default `RefreshTokenValidity` time unit is `days` . `RefreshTokenValidity` duration can
     * range from 60 minutes to 10 years.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-tokenvalidityunits.html#cfn-cognito-userpoolclient-tokenvalidityunits-refreshtoken)
     */
    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    /**
     * A builder for [TokenValidityUnitsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessToken A time unit for the value that you set in the `AccessTokenValidity`
       * parameter.
       * The default `AccessTokenValidity` time unit is `hours` . `AccessTokenValidity` duration can
       * range from five minutes to one day.
       */
      public fun accessToken(accessToken: String)

      /**
       * @param idToken A time unit for the value that you set in the `IdTokenValidity` parameter.
       * The default `IdTokenValidity` time unit is `hours` . `IdTokenValidity` duration can range
       * from five minutes to one day.
       */
      public fun idToken(idToken: String)

      /**
       * @param refreshToken A time unit for the value that you set in the `RefreshTokenValidity`
       * parameter.
       * The default `RefreshTokenValidity` time unit is `days` . `RefreshTokenValidity` duration
       * can range from 60 minutes to 10 years.
       */
      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty.builder()

      /**
       * @param accessToken A time unit for the value that you set in the `AccessTokenValidity`
       * parameter.
       * The default `AccessTokenValidity` time unit is `hours` . `AccessTokenValidity` duration can
       * range from five minutes to one day.
       */
      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      /**
       * @param idToken A time unit for the value that you set in the `IdTokenValidity` parameter.
       * The default `IdTokenValidity` time unit is `hours` . `IdTokenValidity` duration can range
       * from five minutes to one day.
       */
      override fun idToken(idToken: String) {
        cdkBuilder.idToken(idToken)
      }

      /**
       * @param refreshToken A time unit for the value that you set in the `RefreshTokenValidity`
       * parameter.
       * The default `RefreshTokenValidity` time unit is `days` . `RefreshTokenValidity` duration
       * can range from 60 minutes to 10 years.
       */
      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty,
    ) : CdkObject(cdkObject),
        TokenValidityUnitsProperty {
      /**
       * A time unit for the value that you set in the `AccessTokenValidity` parameter.
       *
       * The default `AccessTokenValidity` time unit is `hours` . `AccessTokenValidity` duration can
       * range from five minutes to one day.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-tokenvalidityunits.html#cfn-cognito-userpoolclient-tokenvalidityunits-accesstoken)
       */
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      /**
       * A time unit for the value that you set in the `IdTokenValidity` parameter.
       *
       * The default `IdTokenValidity` time unit is `hours` . `IdTokenValidity` duration can range
       * from five minutes to one day.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-tokenvalidityunits.html#cfn-cognito-userpoolclient-tokenvalidityunits-idtoken)
       */
      override fun idToken(): String? = unwrap(this).getIdToken()

      /**
       * A time unit for the value that you set in the `RefreshTokenValidity` parameter.
       *
       * The default `RefreshTokenValidity` time unit is `days` . `RefreshTokenValidity` duration
       * can range from 60 minutes to 10 years.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-tokenvalidityunits.html#cfn-cognito-userpoolclient-tokenvalidityunits-refreshtoken)
       */
      override fun refreshToken(): String? = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TokenValidityUnitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty):
          TokenValidityUnitsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TokenValidityUnitsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TokenValidityUnitsProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty
    }
  }
}
