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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps

/**
 * Properties for defining a `CfnIPAMAllocation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnIPAMAllocationProps cfnIPAMAllocationProps = CfnIPAMAllocationProps.builder()
 * .ipamPoolId("ipamPoolId")
 * // the properties below are optional
 * .cidr("cidr")
 * .description("description")
 * .netmaskLength(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamallocation.html)
 */
@CdkDslMarker
public class CfnIPAMAllocationPropsDsl {
    private val cdkBuilder: CfnIPAMAllocationProps.Builder = CfnIPAMAllocationProps.builder()

    /**
     * @param cidr The CIDR you would like to allocate from the IPAM pool. Note the following:.
     * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify
     *   either the NetmaskLength or the CIDR.
     * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
     *   NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible values: Any available IPv4 or IPv6 CIDR.
     */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /** @param description A description for the allocation. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param ipamPoolId The ID of the IPAM pool from which you would like to allocate a CIDR. */
    public fun ipamPoolId(ipamPoolId: String) {
        cdkBuilder.ipamPoolId(ipamPoolId)
    }

    /**
     * @param netmaskLength The netmask length of the CIDR you would like to allocate from the IPAM
     *   pool. Note the following:.
     * * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify
     *   either the NetmaskLength or the CIDR.
     * * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the
     *   NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6
     * addresses are 0 - 128.
     */
    public fun netmaskLength(netmaskLength: Number) {
        cdkBuilder.netmaskLength(netmaskLength)
    }

    public fun build(): CfnIPAMAllocationProps = cdkBuilder.build()
}
