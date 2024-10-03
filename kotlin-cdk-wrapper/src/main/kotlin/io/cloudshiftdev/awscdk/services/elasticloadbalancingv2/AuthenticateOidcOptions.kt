@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Options for `ListenerAction.authenciateOidc()`.
 *
 * Example:
 *
 * ```
 * ApplicationListener listener;
 * ApplicationTargetGroup myTargetGroup;
 * listener.addAction("DefaultAction", AddApplicationActionProps.builder()
 * .action(ListenerAction.authenticateOidc(AuthenticateOidcOptions.builder()
 * .authorizationEndpoint("https://example.com/openid")
 * // Other OIDC properties here
 * .clientId("...")
 * .clientSecret(SecretValue.secretsManager("..."))
 * .issuer("...")
 * .tokenEndpoint("...")
 * .userInfoEndpoint("...")
 * // Next
 * .next(ListenerAction.forward(List.of(myTargetGroup)))
 * .build()))
 * .build());
 * ```
 */
public interface AuthenticateOidcOptions {
  /**
   * Allow HTTPS outbound traffic to communicate with the IdP.
   *
   * Set this property to false if the IP address used for the IdP endpoint is identifiable
   * and you want to control outbound traffic.
   * Then allow HTTPS outbound traffic to the IdP's IP address using the listener's `connections`
   * property.
   *
   * Default: true
   *
   * [Documentation](https://repost.aws/knowledge-center/elb-configure-authentication-alb)
   */
  public fun allowHttpsOutbound(): Boolean? = unwrap(this).getAllowHttpsOutbound()

  /**
   * The query parameters (up to 10) to include in the redirect request to the authorization
   * endpoint.
   *
   * Default: - No extra parameters
   */
  public fun authenticationRequestExtraParams(): Map<String, String> =
      unwrap(this).getAuthenticationRequestExtraParams() ?: emptyMap()

  /**
   * The authorization endpoint of the IdP.
   *
   * This must be a full URL, including the HTTPS protocol, the domain, and the path.
   */
  public fun authorizationEndpoint(): String

  /**
   * The OAuth 2.0 client identifier.
   */
  public fun clientId(): String

  /**
   * The OAuth 2.0 client secret.
   */
  public fun clientSecret(): SecretValue

  /**
   * The OIDC issuer identifier of the IdP.
   *
   * This must be a full URL, including the HTTPS protocol, the domain, and the path.
   */
  public fun issuer(): String

  /**
   * What action to execute next.
   */
  public fun next(): ListenerAction

  /**
   * The behavior if the user is not authenticated.
   *
   * Default: UnauthenticatedAction.AUTHENTICATE
   */
  public fun onUnauthenticatedRequest(): UnauthenticatedAction? =
      unwrap(this).getOnUnauthenticatedRequest()?.let(UnauthenticatedAction::wrap)

  /**
   * The set of user claims to be requested from the IdP.
   *
   * To verify which scope values your IdP supports and how to separate multiple values, see the
   * documentation for your IdP.
   *
   * Default: "openid"
   */
  public fun scope(): String? = unwrap(this).getScope()

  /**
   * The name of the cookie used to maintain session information.
   *
   * Default: "AWSELBAuthSessionCookie"
   */
  public fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

  /**
   * The maximum duration of the authentication session.
   *
   * Default: Duration.days(7)
   */
  public fun sessionTimeout(): Duration? = unwrap(this).getSessionTimeout()?.let(Duration::wrap)

  /**
   * The token endpoint of the IdP.
   *
   * This must be a full URL, including the HTTPS protocol, the domain, and the path.
   */
  public fun tokenEndpoint(): String

  /**
   * The user info endpoint of the IdP.
   *
   * This must be a full URL, including the HTTPS protocol, the domain, and the path.
   */
  public fun userInfoEndpoint(): String

  /**
   * A builder for [AuthenticateOidcOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowHttpsOutbound Allow HTTPS outbound traffic to communicate with the IdP.
     * Set this property to false if the IP address used for the IdP endpoint is identifiable
     * and you want to control outbound traffic.
     * Then allow HTTPS outbound traffic to the IdP's IP address using the listener's `connections`
     * property.
     */
    public fun allowHttpsOutbound(allowHttpsOutbound: Boolean)

    /**
     * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
     * redirect request to the authorization endpoint.
     */
    public
        fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>)

    /**
     * @param authorizationEndpoint The authorization endpoint of the IdP. 
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     */
    public fun authorizationEndpoint(authorizationEndpoint: String)

    /**
     * @param clientId The OAuth 2.0 client identifier. 
     */
    public fun clientId(clientId: String)

    /**
     * @param clientSecret The OAuth 2.0 client secret. 
     */
    public fun clientSecret(clientSecret: SecretValue)

    /**
     * @param issuer The OIDC issuer identifier of the IdP. 
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     */
    public fun issuer(issuer: String)

    /**
     * @param next What action to execute next. 
     */
    public fun next(next: ListenerAction)

    /**
     * @param onUnauthenticatedRequest The behavior if the user is not authenticated.
     */
    public fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction)

    /**
     * @param scope The set of user claims to be requested from the IdP.
     * To verify which scope values your IdP supports and how to separate multiple values, see the
     * documentation for your IdP.
     */
    public fun scope(scope: String)

    /**
     * @param sessionCookieName The name of the cookie used to maintain session information.
     */
    public fun sessionCookieName(sessionCookieName: String)

    /**
     * @param sessionTimeout The maximum duration of the authentication session.
     */
    public fun sessionTimeout(sessionTimeout: Duration)

    /**
     * @param tokenEndpoint The token endpoint of the IdP. 
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     */
    public fun tokenEndpoint(tokenEndpoint: String)

    /**
     * @param userInfoEndpoint The user info endpoint of the IdP. 
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     */
    public fun userInfoEndpoint(userInfoEndpoint: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions.builder()

    /**
     * @param allowHttpsOutbound Allow HTTPS outbound traffic to communicate with the IdP.
     * Set this property to false if the IP address used for the IdP endpoint is identifiable
     * and you want to control outbound traffic.
     * Then allow HTTPS outbound traffic to the IdP's IP address using the listener's `connections`
     * property.
     */
    override fun allowHttpsOutbound(allowHttpsOutbound: Boolean) {
      cdkBuilder.allowHttpsOutbound(allowHttpsOutbound)
    }

    /**
     * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
     * redirect request to the authorization endpoint.
     */
    override
        fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
      cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
    }

    /**
     * @param authorizationEndpoint The authorization endpoint of the IdP. 
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     */
    override fun authorizationEndpoint(authorizationEndpoint: String) {
      cdkBuilder.authorizationEndpoint(authorizationEndpoint)
    }

    /**
     * @param clientId The OAuth 2.0 client identifier. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The OAuth 2.0 client secret. 
     */
    override fun clientSecret(clientSecret: SecretValue) {
      cdkBuilder.clientSecret(clientSecret.let(SecretValue.Companion::unwrap))
    }

    /**
     * @param issuer The OIDC issuer identifier of the IdP. 
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     */
    override fun issuer(issuer: String) {
      cdkBuilder.issuer(issuer)
    }

    /**
     * @param next What action to execute next. 
     */
    override fun next(next: ListenerAction) {
      cdkBuilder.next(next.let(ListenerAction.Companion::unwrap))
    }

    /**
     * @param onUnauthenticatedRequest The behavior if the user is not authenticated.
     */
    override fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction) {
      cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest.let(UnauthenticatedAction.Companion::unwrap))
    }

    /**
     * @param scope The set of user claims to be requested from the IdP.
     * To verify which scope values your IdP supports and how to separate multiple values, see the
     * documentation for your IdP.
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    /**
     * @param sessionCookieName The name of the cookie used to maintain session information.
     */
    override fun sessionCookieName(sessionCookieName: String) {
      cdkBuilder.sessionCookieName(sessionCookieName)
    }

    /**
     * @param sessionTimeout The maximum duration of the authentication session.
     */
    override fun sessionTimeout(sessionTimeout: Duration) {
      cdkBuilder.sessionTimeout(sessionTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param tokenEndpoint The token endpoint of the IdP. 
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     */
    override fun tokenEndpoint(tokenEndpoint: String) {
      cdkBuilder.tokenEndpoint(tokenEndpoint)
    }

    /**
     * @param userInfoEndpoint The user info endpoint of the IdP. 
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     */
    override fun userInfoEndpoint(userInfoEndpoint: String) {
      cdkBuilder.userInfoEndpoint(userInfoEndpoint)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions,
  ) : CdkObject(cdkObject),
      AuthenticateOidcOptions {
    /**
     * Allow HTTPS outbound traffic to communicate with the IdP.
     *
     * Set this property to false if the IP address used for the IdP endpoint is identifiable
     * and you want to control outbound traffic.
     * Then allow HTTPS outbound traffic to the IdP's IP address using the listener's `connections`
     * property.
     *
     * Default: true
     *
     * [Documentation](https://repost.aws/knowledge-center/elb-configure-authentication-alb)
     */
    override fun allowHttpsOutbound(): Boolean? = unwrap(this).getAllowHttpsOutbound()

    /**
     * The query parameters (up to 10) to include in the redirect request to the authorization
     * endpoint.
     *
     * Default: - No extra parameters
     */
    override fun authenticationRequestExtraParams(): Map<String, String> =
        unwrap(this).getAuthenticationRequestExtraParams() ?: emptyMap()

    /**
     * The authorization endpoint of the IdP.
     *
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     */
    override fun authorizationEndpoint(): String = unwrap(this).getAuthorizationEndpoint()

    /**
     * The OAuth 2.0 client identifier.
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * The OAuth 2.0 client secret.
     */
    override fun clientSecret(): SecretValue = unwrap(this).getClientSecret().let(SecretValue::wrap)

    /**
     * The OIDC issuer identifier of the IdP.
     *
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     */
    override fun issuer(): String = unwrap(this).getIssuer()

    /**
     * What action to execute next.
     */
    override fun next(): ListenerAction = unwrap(this).getNext().let(ListenerAction::wrap)

    /**
     * The behavior if the user is not authenticated.
     *
     * Default: UnauthenticatedAction.AUTHENTICATE
     */
    override fun onUnauthenticatedRequest(): UnauthenticatedAction? =
        unwrap(this).getOnUnauthenticatedRequest()?.let(UnauthenticatedAction::wrap)

    /**
     * The set of user claims to be requested from the IdP.
     *
     * To verify which scope values your IdP supports and how to separate multiple values, see the
     * documentation for your IdP.
     *
     * Default: "openid"
     */
    override fun scope(): String? = unwrap(this).getScope()

    /**
     * The name of the cookie used to maintain session information.
     *
     * Default: "AWSELBAuthSessionCookie"
     */
    override fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

    /**
     * The maximum duration of the authentication session.
     *
     * Default: Duration.days(7)
     */
    override fun sessionTimeout(): Duration? = unwrap(this).getSessionTimeout()?.let(Duration::wrap)

    /**
     * The token endpoint of the IdP.
     *
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     */
    override fun tokenEndpoint(): String = unwrap(this).getTokenEndpoint()

    /**
     * The user info endpoint of the IdP.
     *
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     */
    override fun userInfoEndpoint(): String = unwrap(this).getUserInfoEndpoint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticateOidcOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions):
        AuthenticateOidcOptions = CdkObjectWrappers.wrap(cdkObject) as? AuthenticateOidcOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthenticateOidcOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions
  }
}
