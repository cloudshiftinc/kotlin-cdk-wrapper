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
 * The connector-specific profile credentials required by Google Analytics.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * GoogleAnalyticsConnectorProfileCredentialsProperty
 * googleAnalyticsConnectorProfileCredentialsProperty =
 * GoogleAnalyticsConnectorProfileCredentialsProperty.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * // the properties below are optional
 * .accessToken("accessToken")
 * .connectorOAuthRequest(ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build())
 * .refreshToken("refreshToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileGoogleAnalyticsConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder:
        CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty.builder()

    /** @param accessToken The credentials used to access protected Google Analytics resources. */
    public fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
    }

    /** @param clientId The identifier for the desired client. */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The client secret used by the OAuth client to authenticate to the
     *   authorization server.
     */
    public fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
     *   supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
     */
    public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
    }

    /**
     * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
     *   supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
     */
    public fun connectorOAuthRequest(
        connectorOAuthRequest: CfnConnectorProfile.ConnectorOAuthRequestProperty
    ) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest)
    }

    /**
     * @param refreshToken The credentials used to acquire new access tokens. This is required only
     *   for OAuth2 access tokens, and is not required for OAuth1 access tokens.
     */
    public fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
    }

    public fun build(): CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
