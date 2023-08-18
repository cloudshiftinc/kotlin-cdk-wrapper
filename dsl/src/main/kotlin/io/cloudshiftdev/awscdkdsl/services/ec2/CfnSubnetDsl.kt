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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSubnet
import software.constructs.Construct

/**
 * Specifies a subnet for the specified VPC.
 *
 * For an IPv4 only subnet, specify an IPv4 CIDR block. If the VPC has an IPv6 CIDR block, you can
 * create an IPv6 only subnet or a dual stack subnet instead. For an IPv6 only subnet, specify an
 * IPv6 CIDR block. For a dual stack subnet, specify both an IPv4 CIDR block and an IPv6 CIDR block.
 *
 * For more information, see
 * [Subnets for your VPC](https://docs.aws.amazon.com/vpc/latest/userguide/configure-subnets.html)
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html)
 */
@CdkDslMarker
public class CfnSubnetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSubnet.Builder = CfnSubnet.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Indicates whether a network interface created in this subnet receives an IPv6 address. The
     * default value is `false` .
     *
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify `Ipv6CidrBlock` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation)
     *
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     *   subnet receives an IPv6 address. The default value is `false` .
     */
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean) {
        cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    /**
     * Indicates whether a network interface created in this subnet receives an IPv6 address. The
     * default value is `false` .
     *
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify `Ipv6CidrBlock` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation)
     *
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     *   subnet receives an IPv6 address. The default value is `false` .
     */
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: IResolvable) {
        cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    /**
     * The Availability Zone of the subnet.
     *
     * If you update this property, you must also update the `CidrBlock` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzone)
     *
     * @param availabilityZone The Availability Zone of the subnet.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The AZ ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzoneid)
     *
     * @param availabilityZoneId The AZ ID of the subnet.
     */
    public fun availabilityZoneId(availabilityZoneId: String) {
        cdkBuilder.availabilityZoneId(availabilityZoneId)
    }

    /**
     * The IPv4 CIDR block assigned to the subnet.
     *
     * If you update this property, we create a new subnet, and then delete the existing one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-cidrblock)
     *
     * @param cidrBlock The IPv4 CIDR block assigned to the subnet.
     */
    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should
     * return synthetic IPv6 addresses for IPv4-only destinations.
     *
     * For more information, see
     * [DNS64 and NAT64](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-nat64-dns64)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-enabledns64)
     *
     * @param enableDns64 Indicates whether DNS queries made to the Amazon-provided DNS Resolver in
     *   this subnet should return synthetic IPv6 addresses for IPv4-only destinations.
     */
    public fun enableDns64(enableDns64: Boolean) {
        cdkBuilder.enableDns64(enableDns64)
    }

    /**
     * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should
     * return synthetic IPv6 addresses for IPv4-only destinations.
     *
     * For more information, see
     * [DNS64 and NAT64](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-nat64-dns64)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-enabledns64)
     *
     * @param enableDns64 Indicates whether DNS queries made to the Amazon-provided DNS Resolver in
     *   this subnet should return synthetic IPv6 addresses for IPv4-only destinations.
     */
    public fun enableDns64(enableDns64: IResolvable) {
        cdkBuilder.enableDns64(enableDns64)
    }

    /**
     * The IPv6 CIDR block.
     *
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify `Ipv6CidrBlock` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblock)
     *
     * @param ipv6CidrBlock The IPv6 CIDR block.
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
        cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * Indicates whether this is an IPv6 only subnet.
     *
     * For more information, see
     * [Subnet basics](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#subnet-basics)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6native)
     *
     * @param ipv6Native Indicates whether this is an IPv6 only subnet.
     */
    public fun ipv6Native(ipv6Native: Boolean) {
        cdkBuilder.ipv6Native(ipv6Native)
    }

    /**
     * Indicates whether this is an IPv6 only subnet.
     *
     * For more information, see
     * [Subnet basics](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#subnet-basics)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6native)
     *
     * @param ipv6Native Indicates whether this is an IPv6 only subnet.
     */
    public fun ipv6Native(ipv6Native: IResolvable) {
        cdkBuilder.ipv6Native(ipv6Native)
    }

    /**
     * Indicates whether instances launched in this subnet receive a public IPv4 address.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch)
     *
     * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a
     *   public IPv4 address.
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
        cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    /**
     * Indicates whether instances launched in this subnet receive a public IPv4 address.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch)
     *
     * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a
     *   public IPv4 address.
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: IResolvable) {
        cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-outpostarn)
     *
     * @param outpostArn The Amazon Resource Name (ARN) of the Outpost.
     */
    public fun outpostArn(outpostArn: String) {
        cdkBuilder.outpostArn(outpostArn)
    }

    /**
     * The hostname type for EC2 instances launched into this subnet and how DNS A and AAAA record
     * queries to the instances should be handled.
     *
     * For more information, see
     * [Amazon EC2 instance hostname types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html)
     * in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * Available options:
     * * EnableResourceNameDnsAAAARecord (true | false)
     * * EnableResourceNameDnsARecord (true | false)
     * * HostnameType (ip-name | resource-name)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-privatednsnameoptionsonlaunch)
     *
     * @param privateDnsNameOptionsOnLaunch The hostname type for EC2 instances launched into this
     *   subnet and how DNS A and AAAA record queries to the instances should be handled.
     */
    public fun privateDnsNameOptionsOnLaunch(
        privateDnsNameOptionsOnLaunch: MapBuilder.() -> Unit = {}
    ) {
        val builder = MapBuilder()
        builder.apply(privateDnsNameOptionsOnLaunch)
        cdkBuilder.privateDnsNameOptionsOnLaunch(builder.map)
    }

    /**
     * The hostname type for EC2 instances launched into this subnet and how DNS A and AAAA record
     * queries to the instances should be handled.
     *
     * For more information, see
     * [Amazon EC2 instance hostname types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html)
     * in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * Available options:
     * * EnableResourceNameDnsAAAARecord (true | false)
     * * EnableResourceNameDnsARecord (true | false)
     * * HostnameType (ip-name | resource-name)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-privatednsnameoptionsonlaunch)
     *
     * @param privateDnsNameOptionsOnLaunch The hostname type for EC2 instances launched into this
     *   subnet and how DNS A and AAAA record queries to the instances should be handled.
     */
    public fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: Any) {
        cdkBuilder.privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch)
    }

    /**
     * Any tags assigned to the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
     *
     * @param tags Any tags assigned to the subnet.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Any tags assigned to the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
     *
     * @param tags Any tags assigned to the subnet.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ID of the VPC the subnet is in.
     *
     * If you update this property, you must also update the `CidrBlock` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-vpcid)
     *
     * @param vpcId The ID of the VPC the subnet is in.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnSubnet {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
