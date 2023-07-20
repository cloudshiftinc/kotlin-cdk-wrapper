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
import software.amazon.awscdk.services.cognito.OAuthFlows
import kotlin.Boolean

@CdkDslMarker
public class OAuthFlowsDsl {
    private val cdkBuilder: OAuthFlows.Builder = OAuthFlows.builder()

    public fun authorizationCodeGrant(authorizationCodeGrant: Boolean) {
        cdkBuilder.authorizationCodeGrant(authorizationCodeGrant)
    }

    public fun clientCredentials(clientCredentials: Boolean) {
        cdkBuilder.clientCredentials(clientCredentials)
    }

    public fun implicitCodeGrant(implicitCodeGrant: Boolean) {
        cdkBuilder.implicitCodeGrant(implicitCodeGrant)
    }

    public fun build(): OAuthFlows = cdkBuilder.build()
}
