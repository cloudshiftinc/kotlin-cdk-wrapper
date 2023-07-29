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
 * The connector-specific profile properties required when using Zendesk.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ZendeskConnectorProfilePropertiesProperty zendeskConnectorProfilePropertiesProperty =
 * ZendeskConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileZendeskConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty.builder()

    /** @param instanceUrl The location of the Zendesk resource. */
    public fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
    }

    public fun build(): CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
