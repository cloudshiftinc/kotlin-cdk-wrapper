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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CognitoDomainOptions
import software.amazon.awscdk.services.cognito.CustomDomainOptions
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPoolDomainProps

/**
 * Props for UserPoolDomain construct.
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
public class UserPoolDomainPropsDsl {
    private val cdkBuilder: UserPoolDomainProps.Builder = UserPoolDomainProps.builder()

    /**
     * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
     *   `customDomain` or `cognitoDomain` must be specified.
     */
    public fun cognitoDomain(cognitoDomain: CognitoDomainOptionsDsl.() -> Unit = {}) {
        val builder = CognitoDomainOptionsDsl()
        builder.apply(cognitoDomain)
        cdkBuilder.cognitoDomain(builder.build())
    }

    /**
     * @param cognitoDomain Associate a cognito prefix domain with your user pool Either
     *   `customDomain` or `cognitoDomain` must be specified.
     */
    public fun cognitoDomain(cognitoDomain: CognitoDomainOptions) {
        cdkBuilder.cognitoDomain(cognitoDomain)
    }

    /**
     * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
     *   `cognitoDomain` must be specified.
     */
    public fun customDomain(customDomain: CustomDomainOptionsDsl.() -> Unit = {}) {
        val builder = CustomDomainOptionsDsl()
        builder.apply(customDomain)
        cdkBuilder.customDomain(builder.build())
    }

    /**
     * @param customDomain Associate a custom domain with your user pool Either `customDomain` or
     *   `cognitoDomain` must be specified.
     */
    public fun customDomain(customDomain: CustomDomainOptions) {
        cdkBuilder.customDomain(customDomain)
    }

    /** @param userPool The user pool to which this domain should be associated. */
    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    public fun build(): UserPoolDomainProps = cdkBuilder.build()
}
