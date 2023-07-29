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
 * The connector-specific profile properties required when using ServiceNow.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ServiceNowConnectorProfilePropertiesProperty serviceNowConnectorProfilePropertiesProperty =
 * ServiceNowConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-servicenowconnectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileServiceNowConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder:
        CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty.builder()

    /** @param instanceUrl The location of the ServiceNow resource. */
    public fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
    }

    public fun build(): CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
