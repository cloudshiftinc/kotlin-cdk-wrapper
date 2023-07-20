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
import kotlin.String

@CdkDslMarker
public class CfnEC2FleetCapacityReservationOptionsRequestPropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.CapacityReservationOptionsRequestProperty.Builder =
        CfnEC2Fleet.CapacityReservationOptionsRequestProperty.builder()

    public fun usageStrategy(usageStrategy: String) {
        cdkBuilder.usageStrategy(usageStrategy)
    }

    public fun build(): CfnEC2Fleet.CapacityReservationOptionsRequestProperty = cdkBuilder.build()
}
