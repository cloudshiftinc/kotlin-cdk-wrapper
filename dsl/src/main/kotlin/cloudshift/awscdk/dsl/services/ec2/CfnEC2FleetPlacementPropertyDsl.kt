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
public class CfnEC2FleetPlacementPropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.PlacementProperty.Builder =
        CfnEC2Fleet.PlacementProperty.builder()

    public fun affinity(affinity: String) {
        cdkBuilder.affinity(affinity)
    }

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    public fun hostId(hostId: String) {
        cdkBuilder.hostId(hostId)
    }

    public fun hostResourceGroupArn(hostResourceGroupArn: String) {
        cdkBuilder.hostResourceGroupArn(hostResourceGroupArn)
    }

    public fun partitionNumber(partitionNumber: Number) {
        cdkBuilder.partitionNumber(partitionNumber)
    }

    public fun spreadDomain(spreadDomain: String) {
        cdkBuilder.spreadDomain(spreadDomain)
    }

    public fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
    }

    public fun build(): CfnEC2Fleet.PlacementProperty = cdkBuilder.build()
}
