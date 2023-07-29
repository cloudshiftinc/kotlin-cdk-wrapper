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

import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction
import software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps

public object actions {
    /**
     * A Listener Action to authenticate with Cognito.
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
    public inline fun authenticateCognitoAction(
        block: AuthenticateCognitoActionDsl.() -> Unit = {}
    ): AuthenticateCognitoAction {
        val builder = AuthenticateCognitoActionDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun authenticateCognitoActionProps(
        block: AuthenticateCognitoActionPropsDsl.() -> Unit = {}
    ): AuthenticateCognitoActionProps {
        val builder = AuthenticateCognitoActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
