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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnSpotFleetLaunchTemplateOverridesPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.LaunchTemplateOverridesProperty.Builder =
        CfnSpotFleet.LaunchTemplateOverridesProperty.builder()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun instanceRequirements(instanceRequirements: IResolvable) {
        cdkBuilder.instanceRequirements(instanceRequirements)
    }

    public fun instanceRequirements(instanceRequirements: CfnSpotFleet.InstanceRequirementsRequestProperty) {
        cdkBuilder.instanceRequirements(instanceRequirements)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
    }

    public fun build(): CfnSpotFleet.LaunchTemplateOverridesProperty = cdkBuilder.build()
}
