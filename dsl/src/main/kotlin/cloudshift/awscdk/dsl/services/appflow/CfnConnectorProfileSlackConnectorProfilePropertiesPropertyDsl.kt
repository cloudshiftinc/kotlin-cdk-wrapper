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
 * The connector-specific profile properties required when using Slack.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SlackConnectorProfilePropertiesProperty slackConnectorProfilePropertiesProperty =
 * SlackConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileSlackConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.SlackConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.SlackConnectorProfilePropertiesProperty.builder()

    /** @param instanceUrl The location of the Slack resource. */
    public fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
    }

    public fun build(): CfnConnectorProfile.SlackConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
