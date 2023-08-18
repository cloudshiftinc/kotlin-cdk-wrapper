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
import software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr
import software.constructs.Construct

/**
 * A CIDR provisioned to an IPAM pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnIPAMPoolCidr cfnIPAMPoolCidr = CfnIPAMPoolCidr.Builder.create(this, "MyCfnIPAMPoolCidr")
 * .ipamPoolId("ipamPoolId")
 * // the properties below are optional
 * .cidr("cidr")
 * .netmaskLength(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html)
 */
@CdkDslMarker
public class CfnIPAMPoolCidrDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIPAMPoolCidr.Builder = CfnIPAMPoolCidr.Builder.create(scope, id)

    /**
     * The CIDR provisioned to the IPAM pool.
     *
     * A CIDR is a representation of an IP address and its associated network mask (or netmask) and
     * refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR
     * example is `2001:DB8::/32` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-cidr)
     *
     * @param cidr The CIDR provisioned to the IPAM pool.
     */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /**
     * The ID of the IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-ipampoolid)
     *
     * @param ipamPoolId The ID of the IPAM pool.
     */
    public fun ipamPoolId(ipamPoolId: String) {
        cdkBuilder.ipamPoolId(ipamPoolId)
    }

    /**
     * The netmask length of the CIDR you'd like to provision to a pool.
     *
     * Can be used for provisioning Amazon-provided IPv6 CIDRs to top-level pools and for
     * provisioning CIDRs to pools with source pools. Cannot be used to provision BYOIP CIDRs to
     * top-level pools. "NetmaskLength" or "Cidr" is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-netmasklength)
     *
     * @param netmaskLength The netmask length of the CIDR you'd like to provision to a pool.
     */
    public fun netmaskLength(netmaskLength: Number) {
        cdkBuilder.netmaskLength(netmaskLength)
    }

    public fun build(): CfnIPAMPoolCidr = cdkBuilder.build()
}
