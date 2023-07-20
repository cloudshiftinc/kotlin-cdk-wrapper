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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetSpotMaintenanceStrategiesPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.SpotMaintenanceStrategiesProperty.Builder =
        CfnSpotFleet.SpotMaintenanceStrategiesProperty.builder()

    public fun capacityRebalance(capacityRebalance: IResolvable) {
        cdkBuilder.capacityRebalance(capacityRebalance)
    }

    public fun capacityRebalance(capacityRebalance: CfnSpotFleet.SpotCapacityRebalanceProperty) {
        cdkBuilder.capacityRebalance(capacityRebalance)
    }

    public fun build(): CfnSpotFleet.SpotMaintenanceStrategiesProperty = cdkBuilder.build()
}
