@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class AuthenticateOidcOptionsDsl {
    private val cdkBuilder: AuthenticateOidcOptions.Builder = AuthenticateOidcOptions.builder()

    public fun allowHttpsOutbound(allowHttpsOutbound: Boolean) {
        cdkBuilder.allowHttpsOutbound(allowHttpsOutbound)
    }

    public fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
    }

    public fun authorizationEndpoint(authorizationEndpoint: String) {
        cdkBuilder.authorizationEndpoint(authorizationEndpoint)
    }

    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    public fun clientSecret(clientSecret: SecretValue) {
        cdkBuilder.clientSecret(clientSecret)
    }

    public fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
    }

    public fun next(next: ListenerAction) {
        cdkBuilder.next(next)
    }

    public fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction) {
        cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
    }

    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun sessionCookieName(sessionCookieName: String) {
        cdkBuilder.sessionCookieName(sessionCookieName)
    }

    public fun sessionTimeout(sessionTimeout: Duration) {
        cdkBuilder.sessionTimeout(sessionTimeout)
    }

    public fun tokenEndpoint(tokenEndpoint: String) {
        cdkBuilder.tokenEndpoint(tokenEndpoint)
    }

    public fun userInfoEndpoint(userInfoEndpoint: String) {
        cdkBuilder.userInfoEndpoint(userInfoEndpoint)
    }

    public fun build(): AuthenticateOidcOptions = cdkBuilder.build()
}
