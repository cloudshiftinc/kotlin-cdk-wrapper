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
public class CfnConnectorProfileSalesforceConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty.builder()

    public fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
    }

    public fun isSandboxEnvironment(isSandboxEnvironment: Boolean) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
    }

    public fun isSandboxEnvironment(isSandboxEnvironment: IResolvable) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
    }

    public fun usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization: Boolean) {
        cdkBuilder.usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization)
    }

    public fun usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization: IResolvable) {
        cdkBuilder.usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization)
    }

    public fun build(): CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
