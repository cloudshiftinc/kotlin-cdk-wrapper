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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener

/**
 * Specifies information required when integrating with Amazon Cognito to authenticate users.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * AuthenticateCognitoConfigProperty authenticateCognitoConfigProperty =
 * AuthenticateCognitoConfigProperty.builder()
 * .userPoolArn("userPoolArn")
 * .userPoolClientId("userPoolClientId")
 * .userPoolDomain("userPoolDomain")
 * // the properties below are optional
 * .authenticationRequestExtraParams(Map.of(
 * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
 * .onUnauthenticatedRequest("onUnauthenticatedRequest")
 * .scope("scope")
 * .sessionCookieName("sessionCookieName")
 * .sessionTimeout("sessionTimeout")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html)
 */
@CdkDslMarker
public class CfnListenerAuthenticateCognitoConfigPropertyDsl {
    private val cdkBuilder: CfnListener.AuthenticateCognitoConfigProperty.Builder =
        CfnListener.AuthenticateCognitoConfigProperty.builder()

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
     * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
     *   redirect request to the authorization endpoint.
     */
    public fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
    }

    /**
     * @param onUnauthenticatedRequest The behavior if the user is not authenticated. The following
     *   are possible values:.
     * * deny `` - Return an HTTP 401 Unauthorized error.
     * * allow `` - Allow the request to be forwarded to the target.
     * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is the
     *   default value.
     */
    public fun onUnauthenticatedRequest(onUnauthenticatedRequest: String) {
        cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
    }

    /**
     * @param scope The set of user claims to be requested from the IdP. The default is `openid` .
     *   To verify which scope values your IdP supports and how to separate multiple values, see the
     *   documentation for your IdP.
     */
    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    /**
     * @param sessionCookieName The name of the cookie used to maintain session information. The
     *   default is AWSELBAuthSessionCookie.
     */
    public fun sessionCookieName(sessionCookieName: String) {
        cdkBuilder.sessionCookieName(sessionCookieName)
    }

    /**
     * @param sessionTimeout The maximum duration of the authentication session, in seconds. The
     *   default is 604800 seconds (7 days).
     */
    public fun sessionTimeout(sessionTimeout: String) {
        cdkBuilder.sessionTimeout(sessionTimeout)
    }

    /** @param userPoolArn The Amazon Resource Name (ARN) of the Amazon Cognito user pool. */
    public fun userPoolArn(userPoolArn: String) {
        cdkBuilder.userPoolArn(userPoolArn)
    }

    /** @param userPoolClientId The ID of the Amazon Cognito user pool client. */
    public fun userPoolClientId(userPoolClientId: String) {
        cdkBuilder.userPoolClientId(userPoolClientId)
    }

    /**
     * @param userPoolDomain The domain prefix or fully-qualified domain name of the Amazon Cognito
     *   user pool.
     */
    public fun userPoolDomain(userPoolDomain: String) {
        cdkBuilder.userPoolDomain(userPoolDomain)
    }

    public fun build(): CfnListener.AuthenticateCognitoConfigProperty = cdkBuilder.build()
}
