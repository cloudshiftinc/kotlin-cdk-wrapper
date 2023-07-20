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
public class CfnConnectorScaleInPolicyPropertyDsl {
    private val cdkBuilder: CfnConnector.ScaleInPolicyProperty.Builder =
        CfnConnector.ScaleInPolicyProperty.builder()

    public fun cpuUtilizationPercentage(cpuUtilizationPercentage: Number) {
        cdkBuilder.cpuUtilizationPercentage(cpuUtilizationPercentage)
    }

    public fun build(): CfnConnector.ScaleInPolicyProperty = cdkBuilder.build()
}
