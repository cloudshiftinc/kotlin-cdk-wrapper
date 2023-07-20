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

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kafkaconnect.CfnConnector
import kotlin.Number

@CdkDslMarker
public class CfnConnectorProvisionedCapacityPropertyDsl {
    private val cdkBuilder: CfnConnector.ProvisionedCapacityProperty.Builder =
        CfnConnector.ProvisionedCapacityProperty.builder()

    public fun mcuCount(mcuCount: Number) {
        cdkBuilder.mcuCount(mcuCount)
    }

    public fun workerCount(workerCount: Number) {
        cdkBuilder.workerCount(workerCount)
    }

    public fun build(): CfnConnector.ProvisionedCapacityProperty = cdkBuilder.build()
}
