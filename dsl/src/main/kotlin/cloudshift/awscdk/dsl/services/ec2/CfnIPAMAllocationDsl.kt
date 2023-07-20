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
import software.amazon.awscdk.services.ec2.CfnIPAMAllocation
import software.constructs.Construct
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnIPAMAllocationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIPAMAllocation.Builder = CfnIPAMAllocation.Builder.create(scope, id)

    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun ipamPoolId(ipamPoolId: String) {
        cdkBuilder.ipamPoolId(ipamPoolId)
    }

    public fun netmaskLength(netmaskLength: Number) {
        cdkBuilder.netmaskLength(netmaskLength)
    }

    public fun build(): CfnIPAMAllocation = cdkBuilder.build()
}
