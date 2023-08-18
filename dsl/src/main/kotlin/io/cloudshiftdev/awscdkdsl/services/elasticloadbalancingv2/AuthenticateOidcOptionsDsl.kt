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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction

/**
 * Options for `ListenerAction.authenciateOidc()`.
 *
 * Example:
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
@CdkDslMarker
public class AuthenticateOidcOptionsDsl {
    private val cdkBuilder: AuthenticateOidcOptions.Builder = AuthenticateOidcOptions.builder()

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
     * @param authorizationEndpoint The authorization endpoint of the IdP. This must be a full URL,
     *   including the HTTPS protocol, the domain, and the path.
     */
    public fun authorizationEndpoint(authorizationEndpoint: String) {
        cdkBuilder.authorizationEndpoint(authorizationEndpoint)
    }

    /** @param clientId The OAuth 2.0 client identifier. */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /** @param clientSecret The OAuth 2.0 client secret. */
    public fun clientSecret(clientSecret: SecretValue) {
        cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * @param issuer The OIDC issuer identifier of the IdP. This must be a full URL, including the
     *   HTTPS protocol, the domain, and the path.
     */
    public fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
    }

    /** @param next What action to execute next. */
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

    /**
     * @param tokenEndpoint The token endpoint of the IdP. This must be a full URL, including the
     *   HTTPS protocol, the domain, and the path.
     */
    public fun tokenEndpoint(tokenEndpoint: String) {
        cdkBuilder.tokenEndpoint(tokenEndpoint)
    }

    /**
     * @param userInfoEndpoint The user info endpoint of the IdP. This must be a full URL, including
     *   the HTTPS protocol, the domain, and the path.
     */
    public fun userInfoEndpoint(userInfoEndpoint: String) {
        cdkBuilder.userInfoEndpoint(userInfoEndpoint)
    }

    public fun build(): AuthenticateOidcOptions = cdkBuilder.build()
}
