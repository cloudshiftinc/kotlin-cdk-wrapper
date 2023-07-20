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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import kotlin.String

@CdkDslMarker
public class CfnConnectorProfilePardotConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.PardotConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.PardotConnectorProfileCredentialsProperty.builder()

    public fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
    }

    public fun clientCredentialsArn(clientCredentialsArn: String) {
        cdkBuilder.clientCredentialsArn(clientCredentialsArn)
    }

    public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
    }

    public fun connectorOAuthRequest(connectorOAuthRequest: CfnConnectorProfile.ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
    }

    public fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
    }

    public fun build(): CfnConnectorProfile.PardotConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
