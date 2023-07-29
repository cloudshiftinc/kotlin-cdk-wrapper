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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * Used by select connectors for which the OAuth workflow is supported, such as Salesforce, Google
 * Analytics, Marketo, Zendesk, and Slack.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ConnectorOAuthRequestProperty connectorOAuthRequestProperty =
 * ConnectorOAuthRequestProperty.builder()
 * .authCode("authCode")
 * .redirectUri("redirectUri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectoroauthrequest.html)
 */
@CdkDslMarker
public class CfnConnectorProfileConnectorOAuthRequestPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.ConnectorOAuthRequestProperty.Builder =
        CfnConnectorProfile.ConnectorOAuthRequestProperty.builder()

    /**
     * @param authCode The code provided by the connector when it has been authenticated via the
     *   connected app.
     */
    public fun authCode(authCode: String) {
        cdkBuilder.authCode(authCode)
    }

    /**
     * @param redirectUri The URL to which the authentication server redirects the browser after
     *   authorization has been granted.
     */
    public fun redirectUri(redirectUri: String) {
        cdkBuilder.redirectUri(redirectUri)
    }

    public fun build(): CfnConnectorProfile.ConnectorOAuthRequestProperty = cdkBuilder.build()
}
