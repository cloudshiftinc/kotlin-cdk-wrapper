@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener

/**
 * Specifies information required using an identity provide (IdP) that is compliant with OpenID
 * Connect (OIDC) to authenticate users.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * AuthenticateOidcConfigProperty authenticateOidcConfigProperty =
 * AuthenticateOidcConfigProperty.builder()
 * .authorizationEndpoint("authorizationEndpoint")
 * .clientId("clientId")
 * .issuer("issuer")
 * .tokenEndpoint("tokenEndpoint")
 * .userInfoEndpoint("userInfoEndpoint")
 * // the properties below are optional
 * .authenticationRequestExtraParams(Map.of(
 * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
 * .clientSecret("clientSecret")
 * .onUnauthenticatedRequest("onUnauthenticatedRequest")
 * .scope("scope")
 * .sessionCookieName("sessionCookieName")
 * .sessionTimeout("sessionTimeout")
 * .useExistingClientSecret(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html)
 */
@CdkDslMarker
public class CfnListenerAuthenticateOidcConfigPropertyDsl {
  private val cdkBuilder: CfnListener.AuthenticateOidcConfigProperty.Builder =
      CfnListener.AuthenticateOidcConfigProperty.builder()

  /**
   * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
   * redirect request to the authorization endpoint.
   */
  public
      fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
    cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
  }

  /**
   * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
   * redirect request to the authorization endpoint.
   */
  public fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable) {
    cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
  }

  /**
   * @param authorizationEndpoint The authorization endpoint of the IdP. 
   * This must be a full URL, including the HTTPS protocol, the domain, and the path.
   */
  public fun authorizationEndpoint(authorizationEndpoint: String) {
    cdkBuilder.authorizationEndpoint(authorizationEndpoint)
  }

  /**
   * @param clientId The OAuth 2.0 client identifier. 
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * @param clientSecret The OAuth 2.0 client secret. This parameter is required if you are creating
   * a rule. If you are modifying a rule, you can omit this parameter if you set
   * `UseExistingClientSecret` to true.
   */
  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  /**
   * @param issuer The OIDC issuer identifier of the IdP. 
   * This must be a full URL, including the HTTPS protocol, the domain, and the path.
   */
  public fun issuer(issuer: String) {
    cdkBuilder.issuer(issuer)
  }

  /**
   * @param onUnauthenticatedRequest The behavior if the user is not authenticated. The following
   * are possible values:.
   * * deny `` - Return an HTTP 401 Unauthorized error.
   * * allow `` - Allow the request to be forwarded to the target.
   * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is the default
   * value.
   */
  public fun onUnauthenticatedRequest(onUnauthenticatedRequest: String) {
    cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
  }

  /**
   * @param scope The set of user claims to be requested from the IdP. The default is `openid` .
   * To verify which scope values your IdP supports and how to separate multiple values, see the
   * documentation for your IdP.
   */
  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param sessionCookieName The name of the cookie used to maintain session information.
   * The default is AWSELBAuthSessionCookie.
   */
  public fun sessionCookieName(sessionCookieName: String) {
    cdkBuilder.sessionCookieName(sessionCookieName)
  }

  /**
   * @param sessionTimeout The maximum duration of the authentication session, in seconds.
   * The default is 604800 seconds (7 days).
   */
  public fun sessionTimeout(sessionTimeout: String) {
    cdkBuilder.sessionTimeout(sessionTimeout)
  }

  /**
   * @param tokenEndpoint The token endpoint of the IdP. 
   * This must be a full URL, including the HTTPS protocol, the domain, and the path.
   */
  public fun tokenEndpoint(tokenEndpoint: String) {
    cdkBuilder.tokenEndpoint(tokenEndpoint)
  }

  /**
   * @param useExistingClientSecret Indicates whether to use the existing client secret when
   * modifying a rule.
   * If you are creating a rule, you can omit this parameter or set it to false.
   */
  public fun useExistingClientSecret(useExistingClientSecret: Boolean) {
    cdkBuilder.useExistingClientSecret(useExistingClientSecret)
  }

  /**
   * @param useExistingClientSecret Indicates whether to use the existing client secret when
   * modifying a rule.
   * If you are creating a rule, you can omit this parameter or set it to false.
   */
  public fun useExistingClientSecret(useExistingClientSecret: IResolvable) {
    cdkBuilder.useExistingClientSecret(useExistingClientSecret)
  }

  /**
   * @param userInfoEndpoint The user info endpoint of the IdP. 
   * This must be a full URL, including the HTTPS protocol, the domain, and the path.
   */
  public fun userInfoEndpoint(userInfoEndpoint: String) {
    cdkBuilder.userInfoEndpoint(userInfoEndpoint)
  }

  public fun build(): CfnListener.AuthenticateOidcConfigProperty = cdkBuilder.build()
}
