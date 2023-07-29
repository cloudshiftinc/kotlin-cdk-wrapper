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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

/**
 * Specifies an action for a listener rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * ActionProperty actionProperty = ActionProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .authenticateCognitoConfig(AuthenticateCognitoConfigProperty.builder()
 * .userPoolArn("userPoolArn")
 * .userPoolClientId("userPoolClientId")
 * .userPoolDomain("userPoolDomain")
 * // the properties below are optional
 * .authenticationRequestExtraParams(Map.of(
 * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
 * .onUnauthenticatedRequest("onUnauthenticatedRequest")
 * .scope("scope")
 * .sessionCookieName("sessionCookieName")
 * .sessionTimeout(123)
 * .build())
 * .authenticateOidcConfig(AuthenticateOidcConfigProperty.builder()
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
 * .sessionTimeout(123)
 * .useExistingClientSecret(false)
 * .build())
 * .fixedResponseConfig(FixedResponseConfigProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentType("contentType")
 * .messageBody("messageBody")
 * .build())
 * .forwardConfig(ForwardConfigProperty.builder()
 * .targetGroups(List.of(TargetGroupTupleProperty.builder()
 * .targetGroupArn("targetGroupArn")
 * .weight(123)
 * .build()))
 * .targetGroupStickinessConfig(TargetGroupStickinessConfigProperty.builder()
 * .durationSeconds(123)
 * .enabled(false)
 * .build())
 * .build())
 * .order(123)
 * .redirectConfig(RedirectConfigProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .host("host")
 * .path("path")
 * .port("port")
 * .protocol("protocol")
 * .query("query")
 * .build())
 * .targetGroupArn("targetGroupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html)
 */
@CdkDslMarker
public class CfnListenerRuleActionPropertyDsl {
    private val cdkBuilder: CfnListenerRule.ActionProperty.Builder =
        CfnListenerRule.ActionProperty.builder()

    /**
     * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon Cognito to
     *   authenticate users. Specify only when `Type` is `authenticate-cognito` .
     */
    public fun authenticateCognitoConfig(authenticateCognitoConfig: IResolvable) {
        cdkBuilder.authenticateCognitoConfig(authenticateCognitoConfig)
    }

    /**
     * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon Cognito to
     *   authenticate users. Specify only when `Type` is `authenticate-cognito` .
     */
    public fun authenticateCognitoConfig(
        authenticateCognitoConfig: CfnListenerRule.AuthenticateCognitoConfigProperty
    ) {
        cdkBuilder.authenticateCognitoConfig(authenticateCognitoConfig)
    }

    /**
     * @param authenticateOidcConfig [HTTPS listeners] Information about an identity provider that
     *   is compliant with OpenID Connect (OIDC). Specify only when `Type` is `authenticate-oidc` .
     */
    public fun authenticateOidcConfig(authenticateOidcConfig: IResolvable) {
        cdkBuilder.authenticateOidcConfig(authenticateOidcConfig)
    }

    /**
     * @param authenticateOidcConfig [HTTPS listeners] Information about an identity provider that
     *   is compliant with OpenID Connect (OIDC). Specify only when `Type` is `authenticate-oidc` .
     */
    public fun authenticateOidcConfig(
        authenticateOidcConfig: CfnListenerRule.AuthenticateOidcConfigProperty
    ) {
        cdkBuilder.authenticateOidcConfig(authenticateOidcConfig)
    }

    /**
     * @param fixedResponseConfig [Application Load Balancer] Information for creating an action
     *   that returns a custom HTTP response. Specify only when `Type` is `fixed-response` .
     */
    public fun fixedResponseConfig(fixedResponseConfig: IResolvable) {
        cdkBuilder.fixedResponseConfig(fixedResponseConfig)
    }

    /**
     * @param fixedResponseConfig [Application Load Balancer] Information for creating an action
     *   that returns a custom HTTP response. Specify only when `Type` is `fixed-response` .
     */
    public fun fixedResponseConfig(
        fixedResponseConfig: CfnListenerRule.FixedResponseConfigProperty
    ) {
        cdkBuilder.fixedResponseConfig(fixedResponseConfig)
    }

    /**
     * @param forwardConfig Information for creating an action that distributes requests among one
     *   or more target groups. For Network Load Balancers, you can specify a single target group.
     *   Specify only when `Type` is `forward` . If you specify both `ForwardConfig` and
     *   `TargetGroupArn` , you can specify only one target group using `ForwardConfig` and it must
     *   be the same target group specified in `TargetGroupArn` .
     */
    public fun forwardConfig(forwardConfig: IResolvable) {
        cdkBuilder.forwardConfig(forwardConfig)
    }

    /**
     * @param forwardConfig Information for creating an action that distributes requests among one
     *   or more target groups. For Network Load Balancers, you can specify a single target group.
     *   Specify only when `Type` is `forward` . If you specify both `ForwardConfig` and
     *   `TargetGroupArn` , you can specify only one target group using `ForwardConfig` and it must
     *   be the same target group specified in `TargetGroupArn` .
     */
    public fun forwardConfig(forwardConfig: CfnListenerRule.ForwardConfigProperty) {
        cdkBuilder.forwardConfig(forwardConfig)
    }

    /**
     * @param order The order for the action. This value is required for rules with multiple
     *   actions. The action with the lowest value for order is performed first.
     */
    public fun order(order: Number) {
        cdkBuilder.order(order)
    }

    /**
     * @param redirectConfig [Application Load Balancer] Information for creating a redirect action.
     *   Specify only when `Type` is `redirect` .
     */
    public fun redirectConfig(redirectConfig: IResolvable) {
        cdkBuilder.redirectConfig(redirectConfig)
    }

    /**
     * @param redirectConfig [Application Load Balancer] Information for creating a redirect action.
     *   Specify only when `Type` is `redirect` .
     */
    public fun redirectConfig(redirectConfig: CfnListenerRule.RedirectConfigProperty) {
        cdkBuilder.redirectConfig(redirectConfig)
    }

    /**
     * @param targetGroupArn The Amazon Resource Name (ARN) of the target group. Specify only when
     *   `Type` is `forward` and you want to route to a single target group. To route to one or more
     *   target groups, use `ForwardConfig` instead.
     */
    public fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
    }

    /** @param type The type of action. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnListenerRule.ActionProperty = cdkBuilder.build()
}
