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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnEIP
import software.constructs.Construct

/**
 * Specifies an Elastic IP (EIP) address and can, optionally, associate it with an Amazon EC2
 * instance.
 *
 * You can allocate an Elastic IP address from an address pool owned by AWS or from an address pool
 * created from a public IPv4 address range that you have brought to AWS for use with your AWS
 * resources using bring your own IP addresses (BYOIP). For more information, see
 * [Bring Your Own IP Addresses (BYOIP)](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html)
 * in the *Amazon EC2 User Guide* .
 *
 * For more information, see
 * [Elastic IP Addresses](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html)
 * in the *Amazon EC2 User Guide* .
 *
 * Example:
 * ```
 * Listener listener;
 * CfnEIP eip;
 * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
 * .endpoints(List.of(
 * CfnEipEndpoint.Builder.create(eip)
 * .weight(128)
 * .build()))
 * .build());
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html)
 */
@CdkDslMarker
public class CfnEIPDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEIP.Builder = CfnEIP.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The network ( `vpc` ).
     *
     * If you define an Elastic IP address and associate it with a VPC that is defined in the same
     * template, you must declare a dependency on the VPC-gateway attachment by using the
     * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * on this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-domain)
     *
     * @param domain The network ( `vpc` ).
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * The ID of the instance.
     *
     * Updates to the `InstanceId` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-instanceid)
     *
     * @param instanceId The ID of the instance.
     */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    /**
     * A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS
     * advertises IP addresses.
     *
     * Use this parameter to limit the IP address to this location. IP addresses cannot move between
     * network border groups.
     *
     * Use
     * [DescribeAvailabilityZones](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html)
     * to view the network border groups.
     *
     * You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2
     * Classic, you receive an `InvalidParameterCombination` error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-networkbordergroup)
     *
     * @param networkBorderGroup A unique set of Availability Zones, Local Zones, or Wavelength
     *   Zones from which AWS advertises IP addresses.
     */
    public fun networkBorderGroup(networkBorderGroup: String) {
        cdkBuilder.networkBorderGroup(networkBorderGroup)
    }

    /**
     * The ID of an address pool that you own.
     *
     * Use this parameter to let Amazon EC2 select an address from the address pool.
     *
     * Updates to the `PublicIpv4Pool` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-publicipv4pool)
     *
     * @param publicIpv4Pool The ID of an address pool that you own.
     */
    public fun publicIpv4Pool(publicIpv4Pool: String) {
        cdkBuilder.publicIpv4Pool(publicIpv4Pool)
    }

    /**
     * Any tags assigned to the Elastic IP address.
     *
     * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-tags)
     *
     * @param tags Any tags assigned to the Elastic IP address.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Any tags assigned to the Elastic IP address.
     *
     * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-tags)
     *
     * @param tags Any tags assigned to the Elastic IP address.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The Elastic IP address you are accepting for transfer.
     *
     * You can only accept one transferred address. For more information on Elastic IP address
     * transfers, see
     * [Transfer Elastic IP addresses](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#transfer-EIPs-intro)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-transferaddress)
     *
     * @param transferAddress The Elastic IP address you are accepting for transfer.
     */
    public fun transferAddress(transferAddress: String) {
        cdkBuilder.transferAddress(transferAddress)
    }

    public fun build(): CfnEIP {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
