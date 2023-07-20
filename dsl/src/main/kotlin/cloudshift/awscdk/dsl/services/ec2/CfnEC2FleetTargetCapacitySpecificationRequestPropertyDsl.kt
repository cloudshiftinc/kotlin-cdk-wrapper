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
public class CfnEC2FleetTargetCapacitySpecificationRequestPropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.Builder =
        CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.builder()

    public fun defaultTargetCapacityType(defaultTargetCapacityType: String) {
        cdkBuilder.defaultTargetCapacityType(defaultTargetCapacityType)
    }

    public fun onDemandTargetCapacity(onDemandTargetCapacity: Number) {
        cdkBuilder.onDemandTargetCapacity(onDemandTargetCapacity)
    }

    public fun spotTargetCapacity(spotTargetCapacity: Number) {
        cdkBuilder.spotTargetCapacity(spotTargetCapacity)
    }

    public fun targetCapacityUnitType(targetCapacityUnitType: String) {
        cdkBuilder.targetCapacityUnitType(targetCapacityUnitType)
    }

    public fun totalTargetCapacity(totalTargetCapacity: Number) {
        cdkBuilder.totalTargetCapacity(totalTargetCapacity)
    }

    public fun build(): CfnEC2Fleet.TargetCapacitySpecificationRequestProperty = cdkBuilder.build()
}
