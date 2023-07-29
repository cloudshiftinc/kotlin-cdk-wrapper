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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVPCCidrBlock
import software.constructs.Construct

/**
 * Associates a CIDR block with your VPC.
 *
 * You can only associate a single IPv6 CIDR block with your VPC. The IPv6 CIDR block size is fixed
 * at /56.
 *
 * For more information about associating CIDR blocks with your VPC and applicable restrictions, see
 * [VPC and Subnet Sizing](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#VPC_Sizing)
 * in the *Amazon VPC User Guide* .
 *
 * Example:
 * ```
 * Vpc vpc;
 * public void associateSubnetWithV6Cidr(Vpc vpc, Number count, ISubnet subnet) {
 * CfnSubnet cfnSubnet = (CfnSubnet)subnet.getNode().getDefaultChild();
 * cfnSubnet.getIpv6CidrBlock() = Fn.select(count, Fn.cidr(Fn.select(0, vpc.getVpcIpv6CidrBlocks()),
 * 256, (128 - 64).toString()));
 * cfnSubnet.getAssignIpv6AddressOnCreation() = true;
 * }
 * // make an ipv6 cidr
 * CfnVPCCidrBlock ipv6cidr = CfnVPCCidrBlock.Builder.create(this, "CIDR6")
 * .vpcId(vpc.getVpcId())
 * .amazonProvidedIpv6CidrBlock(true)
 * .build();
 * // connect the ipv6 cidr to all vpc subnets
 * Number subnetcount = 0;
 * ISubnet[] subnets = vpc.publicSubnets.concat(vpc.getPrivateSubnets());
 * for (Object subnet : subnets) {
 * // Wait for the ipv6 cidr to complete
 * subnet.node.addDependency(ipv6cidr);
 * associateSubnetWithV6Cidr(vpc, subnetcount, subnet);
 * subnetcount = subnetcount + 1;
 * }
 * Cluster cluster = Cluster.Builder.create(this, "hello-eks")
 * .version(KubernetesVersion.V1_27)
 * .vpc(vpc)
 * .ipFamily(IpFamily.IP_V6)
 * .vpcSubnets(List.of(SubnetSelection.builder().subnets(vpc.getPublicSubnets()).build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html)
 */
@CdkDslMarker
public class CfnVPCCidrBlockDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPCCidrBlock.Builder = CfnVPCCidrBlock.Builder.create(scope, id)

    /**
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
     *
     * You cannot specify the range of IPv6 addresses, or the size of the CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock)
     *
     * @param amazonProvidedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56
     *   prefix length for the VPC.
     */
    public fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean) {
        cdkBuilder.amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock)
    }

    /**
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
     *
     * You cannot specify the range of IPv6 addresses, or the size of the CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock)
     *
     * @param amazonProvidedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56
     *   prefix length for the VPC.
     */
    public fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: IResolvable) {
        cdkBuilder.amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock)
    }

    /**
     * An IPv4 CIDR block to associate with the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-cidrblock)
     *
     * @param cidrBlock An IPv4 CIDR block to associate with the VPC.
     */
    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * Associate a CIDR allocated from an IPv4 IPAM pool to a VPC.
     *
     * For more information about Amazon VPC IP Address Manager (IPAM), see
     * [What is IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the
     * *Amazon VPC IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv4ipampoolid)
     *
     * @param ipv4IpamPoolId Associate a CIDR allocated from an IPv4 IPAM pool to a VPC.
     */
    public fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
        cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    /**
     * The netmask length of the IPv4 CIDR you would like to associate from an Amazon VPC IP Address
     * Manager (IPAM) pool.
     *
     * For more information about IPAM, see
     * [What is IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the
     * *Amazon VPC IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv4netmasklength)
     *
     * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you would like to associate from
     *   an Amazon VPC IP Address Manager (IPAM) pool.
     */
    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
        cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    /**
     * An IPv6 CIDR block from the IPv6 address pool. You must also specify `Ipv6Pool` in the
     * request.
     *
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6cidrblock)
     *
     * @param ipv6CidrBlock An IPv6 CIDR block from the IPv6 address pool. You must also specify
     *   `Ipv6Pool` in the request.
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
        cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * Associates a CIDR allocated from an IPv6 IPAM pool to a VPC.
     *
     * For more information about Amazon VPC IP Address Manager (IPAM), see
     * [What is IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the
     * *Amazon VPC IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6ipampoolid)
     *
     * @param ipv6IpamPoolId Associates a CIDR allocated from an IPv6 IPAM pool to a VPC.
     */
    public fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
        cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    /**
     * The netmask length of the IPv6 CIDR you would like to associate from an Amazon VPC IP Address
     * Manager (IPAM) pool.
     *
     * For more information about IPAM, see
     * [What is IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the
     * *Amazon VPC IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6netmasklength)
     *
     * @param ipv6NetmaskLength The netmask length of the IPv6 CIDR you would like to associate from
     *   an Amazon VPC IP Address Manager (IPAM) pool.
     */
    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
        cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    /**
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6pool)
     *
     * @param ipv6Pool The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     */
    public fun ipv6Pool(ipv6Pool: String) {
        cdkBuilder.ipv6Pool(ipv6Pool)
    }

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-vpcid)
     *
     * @param vpcId The ID of the VPC.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnVPCCidrBlock = cdkBuilder.build()
}
