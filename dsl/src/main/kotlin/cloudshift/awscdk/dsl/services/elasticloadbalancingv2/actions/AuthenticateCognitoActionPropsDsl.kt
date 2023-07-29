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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.IUserPoolClient
import software.amazon.awscdk.services.cognito.IUserPoolDomain
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction
import software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps

/**
 * Properties for AuthenticateCognitoAction.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.certificatemanager.*;
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
@CdkDslMarker
public class AuthenticateCognitoActionPropsDsl {
    private val cdkBuilder: AuthenticateCognitoActionProps.Builder =
        AuthenticateCognitoActionProps.builder()

    /**
     * @param allowHttpsOutbound Allow HTTPS outbound traffic to communicate with the IdP. Set this
     *   property to false if the IP address used for the IdP endpoint is identifiable and you want
     *   to control outbound traffic. Then allow HTTPS outbound traffic to the IdP's IP address
     *   using the listener's `connections` property.
     */
    public fun allowHttpsOutbound(allowHttpsOutbound: Boolean) {
        cdkBuilder.allowHttpsOutbound(allowHttpsOutbound)
    }

    /**
     * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
     *   redirect request to the authorization endpoint.
     */
    public fun authenticationRequestExtraParams(
        authenticationRequestExtraParams: Map<String, String>
    ) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
    }

    /**
     * @param next What action to execute next. Multiple actions form a linked chain; the chain must
     *   always terminate in a (weighted)forward, fixedResponse or redirect action.
     */
    public fun next(next: ListenerAction) {
        cdkBuilder.next(next)
    }

    /** @param onUnauthenticatedRequest The behavior if the user is not authenticated. */
    public fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction) {
        cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
    }

    /**
     * @param scope The set of user claims to be requested from the IdP. To verify which scope
     *   values your IdP supports and how to separate multiple values, see the documentation for
     *   your IdP.
     */
    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    /** @param sessionCookieName The name of the cookie used to maintain session information. */
    public fun sessionCookieName(sessionCookieName: String) {
        cdkBuilder.sessionCookieName(sessionCookieName)
    }

    /** @param sessionTimeout The maximum duration of the authentication session. */
    public fun sessionTimeout(sessionTimeout: Duration) {
        cdkBuilder.sessionTimeout(sessionTimeout)
    }

    /** @param userPool The Amazon Cognito user pool. */
    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    /** @param userPoolClient The Amazon Cognito user pool client. */
    public fun userPoolClient(userPoolClient: IUserPoolClient) {
        cdkBuilder.userPoolClient(userPoolClient)
    }

    /**
     * @param userPoolDomain The domain prefix or fully-qualified domain name of the Amazon Cognito
     *   user pool.
     */
    public fun userPoolDomain(userPoolDomain: IUserPoolDomain) {
        cdkBuilder.userPoolDomain(userPoolDomain)
    }

    public fun build(): AuthenticateCognitoActionProps = cdkBuilder.build()
}
