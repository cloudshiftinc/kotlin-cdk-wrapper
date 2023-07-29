@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.AllocatedSubnet

/**
 * Cidr Allocated Subnet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AllocatedSubnet allocatedSubnet = AllocatedSubnet.builder()
 * .cidr("cidr")
 * .build();
 * ```
 */
@CdkDslMarker
public class AllocatedSubnetDsl {
    private val cdkBuilder: AllocatedSubnet.Builder = AllocatedSubnet.builder()

    /** @param cidr Cidr Allocations for a Subnet. */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    public fun build(): AllocatedSubnet = cdkBuilder.build()
}
