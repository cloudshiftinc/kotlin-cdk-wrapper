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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.CfnUserPoolClient
import kotlin.String

@CdkDslMarker
public class CfnUserPoolClientTokenValidityUnitsPropertyDsl {
    private val cdkBuilder: CfnUserPoolClient.TokenValidityUnitsProperty.Builder =
        CfnUserPoolClient.TokenValidityUnitsProperty.builder()

    public fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
    }

    public fun idToken(idToken: String) {
        cdkBuilder.idToken(idToken)
    }

    public fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
    }

    public fun build(): CfnUserPoolClient.TokenValidityUnitsProperty = cdkBuilder.build()
}
