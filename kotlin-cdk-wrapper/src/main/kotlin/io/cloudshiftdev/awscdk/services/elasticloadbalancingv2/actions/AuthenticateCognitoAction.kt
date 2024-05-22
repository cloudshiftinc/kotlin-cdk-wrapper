@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.actions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolClient
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolDomain
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationListener
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ListenerAction
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * A Listener Action to authenticate with Cognito.
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
public open class AuthenticateCognitoAction(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction,
) : ListenerAction(cdkObject) {
  public constructor(options: AuthenticateCognitoActionProps) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction(options.let(AuthenticateCognitoActionProps.Companion::unwrap))
  )

  public constructor(options: AuthenticateCognitoActionProps.Builder.() -> Unit) :
      this(AuthenticateCognitoActionProps(options)
  )

  /**
   * Called when the action is being used in a listener.
   *
   * @param scope 
   * @param listener 
   * @param associatingConstruct
   */
  public override fun bind(scope: Construct, listener: IApplicationListener) {
    unwrap(this).bind(scope.let(Construct.Companion::unwrap),
        listener.let(IApplicationListener.Companion::unwrap))
  }

  /**
   * Called when the action is being used in a listener.
   *
   * @param scope 
   * @param listener 
   * @param associatingConstruct
   */
  public override fun bind(
    scope: Construct,
    listener: IApplicationListener,
    associatingConstruct: IConstruct,
  ) {
    unwrap(this).bind(scope.let(Construct.Companion::unwrap),
        listener.let(IApplicationListener.Companion::unwrap),
        associatingConstruct.let(IConstruct.Companion::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param allowHttpsOutbound Allow HTTPS outbound traffic to communicate with the IdP. 
     */
    public fun allowHttpsOutbound(allowHttpsOutbound: Boolean)

    /**
     * The query parameters (up to 10) to include in the redirect request to the authorization
     * endpoint.
     *
     * Default: - No extra parameters
     *
     * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
     * redirect request to the authorization endpoint. 
     */
    public
        fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>)

    /**
     * What action to execute next.
     *
     * Multiple actions form a linked chain; the chain must always terminate in a
     * (weighted)forward, fixedResponse or redirect action.
     *
     * @param next What action to execute next. 
     */
    public fun next(next: ListenerAction)

    /**
     * The behavior if the user is not authenticated.
     *
     * Default: UnauthenticatedAction.AUTHENTICATE
     *
     * @param onUnauthenticatedRequest The behavior if the user is not authenticated. 
     */
    public fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction)

    /**
     * The set of user claims to be requested from the IdP.
     *
     * To verify which scope values your IdP supports and how to separate multiple values, see the
     * documentation for your IdP.
     *
     * Default: "openid"
     *
     * @param scope The set of user claims to be requested from the IdP. 
     */
    public fun scope(scope: String)

    /**
     * The name of the cookie used to maintain session information.
     *
     * Default: "AWSELBAuthSessionCookie"
     *
     * @param sessionCookieName The name of the cookie used to maintain session information. 
     */
    public fun sessionCookieName(sessionCookieName: String)

    /**
     * The maximum duration of the authentication session.
     *
     * Default: Duration.days(7)
     *
     * @param sessionTimeout The maximum duration of the authentication session. 
     */
    public fun sessionTimeout(sessionTimeout: Duration)

    /**
     * The Amazon Cognito user pool.
     *
     * @param userPool The Amazon Cognito user pool. 
     */
    public fun userPool(userPool: IUserPool)

    /**
     * The Amazon Cognito user pool client.
     *
     * @param userPoolClient The Amazon Cognito user pool client. 
     */
    public fun userPoolClient(userPoolClient: IUserPoolClient)

    /**
     * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
     *
     * @param userPoolDomain The domain prefix or fully-qualified domain name of the Amazon Cognito
     * user pool. 
     */
    public fun userPoolDomain(userPoolDomain: IUserPoolDomain)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction.Builder.create()

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
     * @param allowHttpsOutbound Allow HTTPS outbound traffic to communicate with the IdP. 
     */
    override fun allowHttpsOutbound(allowHttpsOutbound: Boolean) {
      cdkBuilder.allowHttpsOutbound(allowHttpsOutbound)
    }

    /**
     * The query parameters (up to 10) to include in the redirect request to the authorization
     * endpoint.
     *
     * Default: - No extra parameters
     *
     * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
     * redirect request to the authorization endpoint. 
     */
    override
        fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
      cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
    }

    /**
     * What action to execute next.
     *
     * Multiple actions form a linked chain; the chain must always terminate in a
     * (weighted)forward, fixedResponse or redirect action.
     *
     * @param next What action to execute next. 
     */
    override fun next(next: ListenerAction) {
      cdkBuilder.next(next.let(ListenerAction.Companion::unwrap))
    }

    /**
     * The behavior if the user is not authenticated.
     *
     * Default: UnauthenticatedAction.AUTHENTICATE
     *
     * @param onUnauthenticatedRequest The behavior if the user is not authenticated. 
     */
    override fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction) {
      cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest.let(UnauthenticatedAction.Companion::unwrap))
    }

    /**
     * The set of user claims to be requested from the IdP.
     *
     * To verify which scope values your IdP supports and how to separate multiple values, see the
     * documentation for your IdP.
     *
     * Default: "openid"
     *
     * @param scope The set of user claims to be requested from the IdP. 
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    /**
     * The name of the cookie used to maintain session information.
     *
     * Default: "AWSELBAuthSessionCookie"
     *
     * @param sessionCookieName The name of the cookie used to maintain session information. 
     */
    override fun sessionCookieName(sessionCookieName: String) {
      cdkBuilder.sessionCookieName(sessionCookieName)
    }

    /**
     * The maximum duration of the authentication session.
     *
     * Default: Duration.days(7)
     *
     * @param sessionTimeout The maximum duration of the authentication session. 
     */
    override fun sessionTimeout(sessionTimeout: Duration) {
      cdkBuilder.sessionTimeout(sessionTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * The Amazon Cognito user pool.
     *
     * @param userPool The Amazon Cognito user pool. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool.Companion::unwrap))
    }

    /**
     * The Amazon Cognito user pool client.
     *
     * @param userPoolClient The Amazon Cognito user pool client. 
     */
    override fun userPoolClient(userPoolClient: IUserPoolClient) {
      cdkBuilder.userPoolClient(userPoolClient.let(IUserPoolClient.Companion::unwrap))
    }

    /**
     * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
     *
     * @param userPoolDomain The domain prefix or fully-qualified domain name of the Amazon Cognito
     * user pool. 
     */
    override fun userPoolDomain(userPoolDomain: IUserPoolDomain) {
      cdkBuilder.userPoolDomain(userPoolDomain.let(IUserPoolDomain.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticateCognitoAction {
      val builderImpl = BuilderImpl()
      return AuthenticateCognitoAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction):
        AuthenticateCognitoAction = AuthenticateCognitoAction(cdkObject)

    internal fun unwrap(wrapped: AuthenticateCognitoAction):
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction =
        wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction
  }
}
