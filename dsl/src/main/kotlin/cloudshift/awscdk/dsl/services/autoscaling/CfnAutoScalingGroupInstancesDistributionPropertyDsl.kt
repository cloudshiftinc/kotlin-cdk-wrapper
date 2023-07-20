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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAutoScalingGroupInstancesDistributionPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.InstancesDistributionProperty.Builder =
        CfnAutoScalingGroup.InstancesDistributionProperty.builder()

    public fun onDemandAllocationStrategy(onDemandAllocationStrategy: String) {
        cdkBuilder.onDemandAllocationStrategy(onDemandAllocationStrategy)
    }

    public fun onDemandBaseCapacity(onDemandBaseCapacity: Number) {
        cdkBuilder.onDemandBaseCapacity(onDemandBaseCapacity)
    }

    public fun onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity: Number) {
        cdkBuilder.onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity)
    }

    public fun spotAllocationStrategy(spotAllocationStrategy: String) {
        cdkBuilder.spotAllocationStrategy(spotAllocationStrategy)
    }

    public fun spotInstancePools(spotInstancePools: Number) {
        cdkBuilder.spotInstancePools(spotInstancePools)
    }

    public fun spotMaxPrice(spotMaxPrice: String) {
        cdkBuilder.spotMaxPrice(spotMaxPrice)
    }

    public fun build(): CfnAutoScalingGroup.InstancesDistributionProperty = cdkBuilder.build()
}
