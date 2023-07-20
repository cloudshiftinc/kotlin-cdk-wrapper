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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotsitewise.CfnGateway
import kotlin.String

@CdkDslMarker
public class CfnGatewayGatewayCapabilitySummaryPropertyDsl {
    private val cdkBuilder: CfnGateway.GatewayCapabilitySummaryProperty.Builder =
        CfnGateway.GatewayCapabilitySummaryProperty.builder()

    public fun capabilityConfiguration(capabilityConfiguration: String) {
        cdkBuilder.capabilityConfiguration(capabilityConfiguration)
    }

    public fun capabilityNamespace(capabilityNamespace: String) {
        cdkBuilder.capabilityNamespace(capabilityNamespace)
    }

    public fun build(): CfnGateway.GatewayCapabilitySummaryProperty = cdkBuilder.build()
}
