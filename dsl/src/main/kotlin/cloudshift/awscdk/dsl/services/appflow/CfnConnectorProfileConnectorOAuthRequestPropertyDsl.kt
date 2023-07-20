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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import kotlin.String

@CdkDslMarker
public class CfnConnectorProfileConnectorOAuthRequestPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.ConnectorOAuthRequestProperty.Builder =
        CfnConnectorProfile.ConnectorOAuthRequestProperty.builder()

    public fun authCode(authCode: String) {
        cdkBuilder.authCode(authCode)
    }

    public fun redirectUri(redirectUri: String) {
        cdkBuilder.redirectUri(redirectUri)
    }

    public fun build(): CfnConnectorProfile.ConnectorOAuthRequestProperty = cdkBuilder.build()
}
