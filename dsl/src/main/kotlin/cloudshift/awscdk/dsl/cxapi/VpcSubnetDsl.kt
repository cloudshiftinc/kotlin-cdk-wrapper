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

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cxapi.VpcSubnet

/**
 * A subnet representation that the VPC provider uses.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * VpcSubnet vpcSubnet = VpcSubnet.builder()
 * .availabilityZone("availabilityZone")
 * .routeTableId("routeTableId")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .cidr("cidr")
 * .build();
 * ```
 */
@CdkDslMarker
public class VpcSubnetDsl {
    private val cdkBuilder: VpcSubnet.Builder = VpcSubnet.builder()

    /**
     * @param availabilityZone The code of the availability zone this subnet is in (for example,
     *   'us-west-2a').
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param cidr CIDR range of the subnet. */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /** @param routeTableId The identifier of the route table for this subnet. */
    public fun routeTableId(routeTableId: String) {
        cdkBuilder.routeTableId(routeTableId)
    }

    /** @param subnetId The identifier of the subnet. */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): VpcSubnet = cdkBuilder.build()
}
