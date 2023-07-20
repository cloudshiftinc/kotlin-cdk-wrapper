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
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnEC2FleetSpotOptionsRequestPropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.SpotOptionsRequestProperty.Builder =
        CfnEC2Fleet.SpotOptionsRequestProperty.builder()

    public fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
    }

    public fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
        cdkBuilder.instanceInterruptionBehavior(instanceInterruptionBehavior)
    }

    public fun instancePoolsToUseCount(instancePoolsToUseCount: Number) {
        cdkBuilder.instancePoolsToUseCount(instancePoolsToUseCount)
    }

    public fun maintenanceStrategies(maintenanceStrategies: IResolvable) {
        cdkBuilder.maintenanceStrategies(maintenanceStrategies)
    }

    public fun maintenanceStrategies(maintenanceStrategies: CfnEC2Fleet.MaintenanceStrategiesProperty) {
        cdkBuilder.maintenanceStrategies(maintenanceStrategies)
    }

    public fun maxTotalPrice(maxTotalPrice: String) {
        cdkBuilder.maxTotalPrice(maxTotalPrice)
    }

    public fun minTargetCapacity(minTargetCapacity: Number) {
        cdkBuilder.minTargetCapacity(minTargetCapacity)
    }

    public fun singleAvailabilityZone(singleAvailabilityZone: Boolean) {
        cdkBuilder.singleAvailabilityZone(singleAvailabilityZone)
    }

    public fun singleAvailabilityZone(singleAvailabilityZone: IResolvable) {
        cdkBuilder.singleAvailabilityZone(singleAvailabilityZone)
    }

    public fun singleInstanceType(singleInstanceType: Boolean) {
        cdkBuilder.singleInstanceType(singleInstanceType)
    }

    public fun singleInstanceType(singleInstanceType: IResolvable) {
        cdkBuilder.singleInstanceType(singleInstanceType)
    }

    public fun build(): CfnEC2Fleet.SpotOptionsRequestProperty = cdkBuilder.build()
}
