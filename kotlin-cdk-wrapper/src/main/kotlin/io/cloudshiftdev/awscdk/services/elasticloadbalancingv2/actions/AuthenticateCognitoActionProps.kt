@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.actions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolClient
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolDomain
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ListenerAction
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for AuthenticateCognitoAction.
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
 */
public interface AuthenticateCognitoActionProps {
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
   * What action to execute next.
   *
   * Multiple actions form a linked chain; the chain must always terminate in a
   * (weighted)forward, fixedResponse or redirect action.
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
   * The Amazon Cognito user pool.
   */
  public fun userPool(): IUserPool

  /**
   * The Amazon Cognito user pool client.
   */
  public fun userPoolClient(): IUserPoolClient

  /**
   * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
   */
  public fun userPoolDomain(): IUserPoolDomain

  /**
   * A builder for [AuthenticateCognitoActionProps]
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
     * @param next What action to execute next. 
     * Multiple actions form a linked chain; the chain must always terminate in a
     * (weighted)forward, fixedResponse or redirect action.
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
     * @param userPool The Amazon Cognito user pool. 
     */
    public fun userPool(userPool: IUserPool)

    /**
     * @param userPoolClient The Amazon Cognito user pool client. 
     */
    public fun userPoolClient(userPoolClient: IUserPoolClient)

    /**
     * @param userPoolDomain The domain prefix or fully-qualified domain name of the Amazon Cognito
     * user pool. 
     */
    public fun userPoolDomain(userPoolDomain: IUserPoolDomain)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps.builder()

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
     * @param next What action to execute next. 
     * Multiple actions form a linked chain; the chain must always terminate in a
     * (weighted)forward, fixedResponse or redirect action.
     */
    override fun next(next: ListenerAction) {
      cdkBuilder.next(next.let(ListenerAction::unwrap))
    }

    /**
     * @param onUnauthenticatedRequest The behavior if the user is not authenticated.
     */
    override fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction) {
      cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest.let(UnauthenticatedAction::unwrap))
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
      cdkBuilder.sessionTimeout(sessionTimeout.let(Duration::unwrap))
    }

    /**
     * @param userPool The Amazon Cognito user pool. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    /**
     * @param userPoolClient The Amazon Cognito user pool client. 
     */
    override fun userPoolClient(userPoolClient: IUserPoolClient) {
      cdkBuilder.userPoolClient(userPoolClient.let(IUserPoolClient::unwrap))
    }

    /**
     * @param userPoolDomain The domain prefix or fully-qualified domain name of the Amazon Cognito
     * user pool. 
     */
    override fun userPoolDomain(userPoolDomain: IUserPoolDomain) {
      cdkBuilder.userPoolDomain(userPoolDomain.let(IUserPoolDomain::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps,
  ) : CdkObject(cdkObject), AuthenticateCognitoActionProps {
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
     * What action to execute next.
     *
     * Multiple actions form a linked chain; the chain must always terminate in a
     * (weighted)forward, fixedResponse or redirect action.
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
     * The Amazon Cognito user pool.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)

    /**
     * The Amazon Cognito user pool client.
     */
    override fun userPoolClient(): IUserPoolClient =
        unwrap(this).getUserPoolClient().let(IUserPoolClient::wrap)

    /**
     * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
     */
    override fun userPoolDomain(): IUserPoolDomain =
        unwrap(this).getUserPoolDomain().let(IUserPoolDomain::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticateCognitoActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps):
        AuthenticateCognitoActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthenticateCognitoActionProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps
  }
}
