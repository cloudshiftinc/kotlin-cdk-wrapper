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
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnConnectorProfilePardotConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.PardotConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.PardotConnectorProfilePropertiesProperty.builder()

    public fun businessUnitId(businessUnitId: String) {
        cdkBuilder.businessUnitId(businessUnitId)
    }

    public fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
    }

    public fun isSandboxEnvironment(isSandboxEnvironment: Boolean) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
    }

    public fun isSandboxEnvironment(isSandboxEnvironment: IResolvable) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
    }

    public fun build(): CfnConnectorProfile.PardotConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
