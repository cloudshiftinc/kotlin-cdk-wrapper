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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnEC2FleetCapacityRebalancePropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.CapacityRebalanceProperty.Builder =
        CfnEC2Fleet.CapacityRebalanceProperty.builder()

    public fun replacementStrategy(replacementStrategy: String) {
        cdkBuilder.replacementStrategy(replacementStrategy)
    }

    public fun terminationDelay(terminationDelay: Number) {
        cdkBuilder.terminationDelay(terminationDelay)
    }

    public fun build(): CfnEC2Fleet.CapacityRebalanceProperty = cdkBuilder.build()
}
