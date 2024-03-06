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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile credentials required when using Salesforce Pardot.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * PardotConnectorProfileCredentialsProperty pardotConnectorProfileCredentialsProperty =
 * PardotConnectorProfileCredentialsProperty.builder()
 * .accessToken("accessToken")
 * .clientCredentialsArn("clientCredentialsArn")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .refreshToken("refreshToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfilePardotConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.PardotConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.PardotConnectorProfileCredentialsProperty.builder()

    /** @param accessToken The credentials used to access protected Salesforce Pardot resources. */
    public fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
    }

    /**
     * @param clientCredentialsArn The secret manager ARN, which contains the client ID and client
     *   secret of the connected app.
     */
    public fun clientCredentialsArn(clientCredentialsArn: String) {
        cdkBuilder.clientCredentialsArn(clientCredentialsArn)
    }

    /** @param connectorOAuthRequest the value to be set. */
    public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
    }

    /** @param connectorOAuthRequest the value to be set. */
    public fun connectorOAuthRequest(
        connectorOAuthRequest: CfnConnectorProfile.ConnectorOAuthRequestProperty
    ) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
    }

    /** @param refreshToken The credentials used to acquire new access tokens. */
    public fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
    }

    public fun build(): CfnConnectorProfile.PardotConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
