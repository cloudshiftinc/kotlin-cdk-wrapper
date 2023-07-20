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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnListenerAuthenticateOidcConfigPropertyDsl {
    private val cdkBuilder: CfnListener.AuthenticateOidcConfigProperty.Builder =
        CfnListener.AuthenticateOidcConfigProperty.builder()

    public fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
    }

    public fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
    }

    public fun authorizationEndpoint(authorizationEndpoint: String) {
        cdkBuilder.authorizationEndpoint(authorizationEndpoint)
    }

    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    public fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
    }

    public fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
    }

    public fun onUnauthenticatedRequest(onUnauthenticatedRequest: String) {
        cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
    }

    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun sessionCookieName(sessionCookieName: String) {
        cdkBuilder.sessionCookieName(sessionCookieName)
    }

    public fun sessionTimeout(sessionTimeout: String) {
        cdkBuilder.sessionTimeout(sessionTimeout)
    }

    public fun tokenEndpoint(tokenEndpoint: String) {
        cdkBuilder.tokenEndpoint(tokenEndpoint)
    }

    public fun useExistingClientSecret(useExistingClientSecret: Boolean) {
        cdkBuilder.useExistingClientSecret(useExistingClientSecret)
    }

    public fun useExistingClientSecret(useExistingClientSecret: IResolvable) {
        cdkBuilder.useExistingClientSecret(useExistingClientSecret)
    }

    public fun userInfoEndpoint(userInfoEndpoint: String) {
        cdkBuilder.userInfoEndpoint(userInfoEndpoint)
    }

    public fun build(): CfnListener.AuthenticateOidcConfigProperty = cdkBuilder.build()
}
