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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.AwsIpamProps

/**
 * Configuration for AwsIpam.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ec2.IpAddresses;
 * CfnIPAMPool pool;
 * Vpc.Builder.create(this, "TheVPC")
 * .ipAddresses(IpAddresses.awsIpamAllocation(AwsIpamProps.builder()
 * .ipv4IpamPoolId(pool.getRef())
 * .ipv4NetmaskLength(18)
 * .defaultSubnetIpv4NetmaskLength(24)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class AwsIpamPropsDsl {
    private val cdkBuilder: AwsIpamProps.Builder = AwsIpamProps.builder()

    /**
     * @param defaultSubnetIpv4NetmaskLength Default length for Subnet ipv4 Network mask. Specify
     *   this option only if you do not specify all Subnets using SubnetConfiguration with a
     *   cidrMask
     */
    public fun defaultSubnetIpv4NetmaskLength(defaultSubnetIpv4NetmaskLength: Number) {
        cdkBuilder.defaultSubnetIpv4NetmaskLength(defaultSubnetIpv4NetmaskLength)
    }

    /** @param ipv4IpamPoolId Ipam Pool Id for ipv4 allocation. */
    public fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
        cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    /** @param ipv4NetmaskLength Netmask length for Vpc. */
    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
        cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    public fun build(): AwsIpamProps = cdkBuilder.build()
}
