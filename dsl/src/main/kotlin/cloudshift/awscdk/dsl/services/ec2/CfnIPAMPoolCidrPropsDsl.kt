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
import software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnIPAMPoolCidrPropsDsl {
    private val cdkBuilder: CfnIPAMPoolCidrProps.Builder = CfnIPAMPoolCidrProps.builder()

    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    public fun ipamPoolId(ipamPoolId: String) {
        cdkBuilder.ipamPoolId(ipamPoolId)
    }

    public fun netmaskLength(netmaskLength: Number) {
        cdkBuilder.netmaskLength(netmaskLength)
    }

    public fun build(): CfnIPAMPoolCidrProps = cdkBuilder.build()
}
