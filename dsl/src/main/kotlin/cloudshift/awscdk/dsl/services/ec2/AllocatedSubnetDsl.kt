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
import software.amazon.awscdk.services.ec2.AllocatedSubnet
import kotlin.String

@CdkDslMarker
public class AllocatedSubnetDsl {
    private val cdkBuilder: AllocatedSubnet.Builder = AllocatedSubnet.builder()

    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    public fun build(): AllocatedSubnet = cdkBuilder.build()
}
