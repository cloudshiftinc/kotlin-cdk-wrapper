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
public class CfnConnectorProfileInforNexusConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty.builder()

    public fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
    }

    public fun build(): CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
