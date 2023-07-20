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
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import kotlin.String

@CdkDslMarker
public class CfnSpotFleetSpotPlacementPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.SpotPlacementProperty.Builder =
        CfnSpotFleet.SpotPlacementProperty.builder()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    public fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
    }

    public fun build(): CfnSpotFleet.SpotPlacementProperty = cdkBuilder.build()
}
