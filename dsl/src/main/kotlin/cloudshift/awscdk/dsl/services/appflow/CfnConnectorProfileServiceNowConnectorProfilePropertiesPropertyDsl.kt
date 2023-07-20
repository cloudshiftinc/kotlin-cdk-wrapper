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
public class CfnConnectorProfileServiceNowConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty.builder()

    public fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
    }

    public fun build(): CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
