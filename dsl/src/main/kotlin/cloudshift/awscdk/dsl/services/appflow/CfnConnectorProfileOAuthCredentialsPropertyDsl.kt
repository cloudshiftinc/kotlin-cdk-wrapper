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
public class CfnConnectorProfileOAuthCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.OAuthCredentialsProperty.Builder =
        CfnConnectorProfile.OAuthCredentialsProperty.builder()

    public fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
    }

    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    public fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
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

    public fun build(): CfnConnectorProfile.OAuthCredentialsProperty = cdkBuilder.build()
}
