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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider
import kotlin.String

@CdkDslMarker
public class CfnVerifiedAccessTrustProviderOidcOptionsPropertyDsl {
    private val cdkBuilder: CfnVerifiedAccessTrustProvider.OidcOptionsProperty.Builder =
        CfnVerifiedAccessTrustProvider.OidcOptionsProperty.builder()

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

    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun tokenEndpoint(tokenEndpoint: String) {
        cdkBuilder.tokenEndpoint(tokenEndpoint)
    }

    public fun userInfoEndpoint(userInfoEndpoint: String) {
        cdkBuilder.userInfoEndpoint(userInfoEndpoint)
    }

    public fun build(): CfnVerifiedAccessTrustProvider.OidcOptionsProperty = cdkBuilder.build()
}
