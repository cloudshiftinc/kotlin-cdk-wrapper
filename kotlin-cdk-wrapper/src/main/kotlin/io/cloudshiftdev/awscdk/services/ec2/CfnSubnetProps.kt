@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSubnet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Object privateDnsNameOptionsOnLaunch;
 * CfnSubnetProps cfnSubnetProps = CfnSubnetProps.builder()
 * .vpcId("vpcId")
 * // the properties below are optional
 * .assignIpv6AddressOnCreation(false)
 * .availabilityZone("availabilityZone")
 * .availabilityZoneId("availabilityZoneId")
 * .cidrBlock("cidrBlock")
 * .enableDns64(false)
 * .enableLniAtDeviceIndex(123)
 * .ipv4IpamPoolId("ipv4IpamPoolId")
 * .ipv4NetmaskLength(123)
 * .ipv6CidrBlock("ipv6CidrBlock")
 * .ipv6CidrBlocks(List.of("ipv6CidrBlocks"))
 * .ipv6IpamPoolId("ipv6IpamPoolId")
 * .ipv6Native(false)
 * .ipv6NetmaskLength(123)
 * .mapPublicIpOnLaunch(false)
 * .outpostArn("outpostArn")
 * .privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html)
 */
public interface CfnSubnetProps {
  /**
   * Indicates whether a network interface created in this subnet receives an IPv6 address. The
   * default value is `false` .
   *
   * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation)
   */
  public fun assignIpv6AddressOnCreation(): Any? = unwrap(this).getAssignIpv6AddressOnCreation()

  /**
   * The Availability Zone of the subnet.
   *
   * If you update this property, you must also update the `CidrBlock` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The AZ ID of the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzoneid)
   */
  public fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

  /**
   * The IPv4 CIDR block assigned to the subnet.
   *
   * If you update this property, we create a new subnet, and then delete the existing one.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-cidrblock)
   */
  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  /**
   * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should
   * return synthetic IPv6 addresses for IPv4-only destinations.
   *
   * For more information, see [DNS64 and
   * NAT64](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-nat64-dns64)
   * in the *Amazon Virtual Private Cloud User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-enabledns64)
   */
  public fun enableDns64(): Any? = unwrap(this).getEnableDns64()

  /**
   * Indicates the device position for local network interfaces in this subnet.
   *
   * For example, `1` indicates local network interfaces in this subnet are the secondary network
   * interface (eth1).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-enablelniatdeviceindex)
   */
  public fun enableLniAtDeviceIndex(): Number? = unwrap(this).getEnableLniAtDeviceIndex()

  /**
   * An IPv4 IPAM pool ID for the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv4ipampoolid)
   */
  public fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  /**
   * An IPv4 netmask length for the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv4netmasklength)
   */
  public fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  /**
   * The IPv6 CIDR block.
   *
   * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblock)
   */
  public fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  /**
   * The IPv6 network ranges for the subnet, in CIDR notation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblocks)
   */
  public fun ipv6CidrBlocks(): List<String> = unwrap(this).getIpv6CidrBlocks() ?: emptyList()

  /**
   * An IPv6 IPAM pool ID for the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6ipampoolid)
   */
  public fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

  /**
   * Indicates whether this is an IPv6 only subnet.
   *
   * For more information, see [Subnet
   * basics](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#subnet-basics) in the
   * *Amazon Virtual Private Cloud User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6native)
   */
  public fun ipv6Native(): Any? = unwrap(this).getIpv6Native()

  /**
   * An IPv6 netmask length for the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6netmasklength)
   */
  public fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

  /**
   * Indicates whether instances launched in this subnet receive a public IPv4 address. The default
   * value is `false` .
   *
   * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
   * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
   * tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch)
   */
  public fun mapPublicIpOnLaunch(): Any? = unwrap(this).getMapPublicIpOnLaunch()

  /**
   * The Amazon Resource Name (ARN) of the Outpost.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-outpostarn)
   */
  public fun outpostArn(): String? = unwrap(this).getOutpostArn()

  /**
   * The hostname type for EC2 instances launched into this subnet and how DNS A and AAAA record
   * queries to the instances should be handled.
   *
   * For more information, see [Amazon EC2 instance hostname
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   *
   * Available options:
   *
   * * EnableResourceNameDnsAAAARecord (true | false)
   * * EnableResourceNameDnsARecord (true | false)
   * * HostnameType (ip-name | resource-name)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-privatednsnameoptionsonlaunch)
   */
  public fun privateDnsNameOptionsOnLaunch(): Any? = unwrap(this).getPrivateDnsNameOptionsOnLaunch()

  /**
   * Any tags assigned to the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the VPC the subnet is in.
   *
   * If you update this property, you must also update the `CidrBlock` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnSubnetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     * subnet receives an IPv6 address. The default value is `false` .
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     */
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean)

    /**
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     * subnet receives an IPv6 address. The default value is `false` .
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     */
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: IResolvable)

    /**
     * @param availabilityZone The Availability Zone of the subnet.
     * If you update this property, you must also update the `CidrBlock` property.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param availabilityZoneId The AZ ID of the subnet.
     */
    public fun availabilityZoneId(availabilityZoneId: String)

    /**
     * @param cidrBlock The IPv4 CIDR block assigned to the subnet.
     * If you update this property, we create a new subnet, and then delete the existing one.
     */
    public fun cidrBlock(cidrBlock: String)

    /**
     * @param enableDns64 Indicates whether DNS queries made to the Amazon-provided DNS Resolver in
     * this subnet should return synthetic IPv6 addresses for IPv4-only destinations.
     * For more information, see [DNS64 and
     * NAT64](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-nat64-dns64)
     * in the *Amazon Virtual Private Cloud User Guide* .
     */
    public fun enableDns64(enableDns64: Boolean)

    /**
     * @param enableDns64 Indicates whether DNS queries made to the Amazon-provided DNS Resolver in
     * this subnet should return synthetic IPv6 addresses for IPv4-only destinations.
     * For more information, see [DNS64 and
     * NAT64](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-nat64-dns64)
     * in the *Amazon Virtual Private Cloud User Guide* .
     */
    public fun enableDns64(enableDns64: IResolvable)

    /**
     * @param enableLniAtDeviceIndex Indicates the device position for local network interfaces in
     * this subnet.
     * For example, `1` indicates local network interfaces in this subnet are the secondary network
     * interface (eth1).
     */
    public fun enableLniAtDeviceIndex(enableLniAtDeviceIndex: Number)

    /**
     * @param ipv4IpamPoolId An IPv4 IPAM pool ID for the subnet.
     */
    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    /**
     * @param ipv4NetmaskLength An IPv4 netmask length for the subnet.
     */
    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)

    /**
     * @param ipv6CidrBlock The IPv6 CIDR block.
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    /**
     * @param ipv6CidrBlocks The IPv6 network ranges for the subnet, in CIDR notation.
     */
    public fun ipv6CidrBlocks(ipv6CidrBlocks: List<String>)

    /**
     * @param ipv6CidrBlocks The IPv6 network ranges for the subnet, in CIDR notation.
     */
    public fun ipv6CidrBlocks(vararg ipv6CidrBlocks: String)

    /**
     * @param ipv6IpamPoolId An IPv6 IPAM pool ID for the subnet.
     */
    public fun ipv6IpamPoolId(ipv6IpamPoolId: String)

    /**
     * @param ipv6Native Indicates whether this is an IPv6 only subnet.
     * For more information, see [Subnet
     * basics](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#subnet-basics) in the
     * *Amazon Virtual Private Cloud User Guide* .
     */
    public fun ipv6Native(ipv6Native: Boolean)

    /**
     * @param ipv6Native Indicates whether this is an IPv6 only subnet.
     * For more information, see [Subnet
     * basics](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#subnet-basics) in the
     * *Amazon Virtual Private Cloud User Guide* .
     */
    public fun ipv6Native(ipv6Native: IResolvable)

    /**
     * @param ipv6NetmaskLength An IPv6 netmask length for the subnet.
     */
    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number)

    /**
     * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a
     * public IPv4 address. The default value is `false` .
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
     * tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean)

    /**
     * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a
     * public IPv4 address. The default value is `false` .
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
     * tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: IResolvable)

    /**
     * @param outpostArn The Amazon Resource Name (ARN) of the Outpost.
     */
    public fun outpostArn(outpostArn: String)

    /**
     * @param privateDnsNameOptionsOnLaunch The hostname type for EC2 instances launched into this
     * subnet and how DNS A and AAAA record queries to the instances should be handled.
     * For more information, see [Amazon EC2 instance hostname
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * Available options:
     *
     * * EnableResourceNameDnsAAAARecord (true | false)
     * * EnableResourceNameDnsARecord (true | false)
     * * HostnameType (ip-name | resource-name)
     */
    public fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: Any)

    /**
     * @param tags Any tags assigned to the subnet.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags assigned to the subnet.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcId The ID of the VPC the subnet is in. 
     * If you update this property, you must also update the `CidrBlock` property.
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSubnetProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnetProps.builder()

    /**
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     * subnet receives an IPv6 address. The default value is `false` .
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     */
    override fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean) {
      cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    /**
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     * subnet receives an IPv6 address. The default value is `false` .
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     */
    override fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: IResolvable) {
      cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation.let(IResolvable::unwrap))
    }

    /**
     * @param availabilityZone The Availability Zone of the subnet.
     * If you update this property, you must also update the `CidrBlock` property.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param availabilityZoneId The AZ ID of the subnet.
     */
    override fun availabilityZoneId(availabilityZoneId: String) {
      cdkBuilder.availabilityZoneId(availabilityZoneId)
    }

    /**
     * @param cidrBlock The IPv4 CIDR block assigned to the subnet.
     * If you update this property, we create a new subnet, and then delete the existing one.
     */
    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * @param enableDns64 Indicates whether DNS queries made to the Amazon-provided DNS Resolver in
     * this subnet should return synthetic IPv6 addresses for IPv4-only destinations.
     * For more information, see [DNS64 and
     * NAT64](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-nat64-dns64)
     * in the *Amazon Virtual Private Cloud User Guide* .
     */
    override fun enableDns64(enableDns64: Boolean) {
      cdkBuilder.enableDns64(enableDns64)
    }

    /**
     * @param enableDns64 Indicates whether DNS queries made to the Amazon-provided DNS Resolver in
     * this subnet should return synthetic IPv6 addresses for IPv4-only destinations.
     * For more information, see [DNS64 and
     * NAT64](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-nat64-dns64)
     * in the *Amazon Virtual Private Cloud User Guide* .
     */
    override fun enableDns64(enableDns64: IResolvable) {
      cdkBuilder.enableDns64(enableDns64.let(IResolvable::unwrap))
    }

    /**
     * @param enableLniAtDeviceIndex Indicates the device position for local network interfaces in
     * this subnet.
     * For example, `1` indicates local network interfaces in this subnet are the secondary network
     * interface (eth1).
     */
    override fun enableLniAtDeviceIndex(enableLniAtDeviceIndex: Number) {
      cdkBuilder.enableLniAtDeviceIndex(enableLniAtDeviceIndex)
    }

    /**
     * @param ipv4IpamPoolId An IPv4 IPAM pool ID for the subnet.
     */
    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    /**
     * @param ipv4NetmaskLength An IPv4 netmask length for the subnet.
     */
    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    /**
     * @param ipv6CidrBlock The IPv6 CIDR block.
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     */
    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * @param ipv6CidrBlocks The IPv6 network ranges for the subnet, in CIDR notation.
     */
    override fun ipv6CidrBlocks(ipv6CidrBlocks: List<String>) {
      cdkBuilder.ipv6CidrBlocks(ipv6CidrBlocks)
    }

    /**
     * @param ipv6CidrBlocks The IPv6 network ranges for the subnet, in CIDR notation.
     */
    override fun ipv6CidrBlocks(vararg ipv6CidrBlocks: String): Unit =
        ipv6CidrBlocks(ipv6CidrBlocks.toList())

    /**
     * @param ipv6IpamPoolId An IPv6 IPAM pool ID for the subnet.
     */
    override fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
      cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    /**
     * @param ipv6Native Indicates whether this is an IPv6 only subnet.
     * For more information, see [Subnet
     * basics](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#subnet-basics) in the
     * *Amazon Virtual Private Cloud User Guide* .
     */
    override fun ipv6Native(ipv6Native: Boolean) {
      cdkBuilder.ipv6Native(ipv6Native)
    }

    /**
     * @param ipv6Native Indicates whether this is an IPv6 only subnet.
     * For more information, see [Subnet
     * basics](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#subnet-basics) in the
     * *Amazon Virtual Private Cloud User Guide* .
     */
    override fun ipv6Native(ipv6Native: IResolvable) {
      cdkBuilder.ipv6Native(ipv6Native.let(IResolvable::unwrap))
    }

    /**
     * @param ipv6NetmaskLength An IPv6 netmask length for the subnet.
     */
    override fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
      cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    /**
     * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a
     * public IPv4 address. The default value is `false` .
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
     * tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     */
    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    /**
     * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a
     * public IPv4 address. The default value is `false` .
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
     * tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     */
    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: IResolvable) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch.let(IResolvable::unwrap))
    }

    /**
     * @param outpostArn The Amazon Resource Name (ARN) of the Outpost.
     */
    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    /**
     * @param privateDnsNameOptionsOnLaunch The hostname type for EC2 instances launched into this
     * subnet and how DNS A and AAAA record queries to the instances should be handled.
     * For more information, see [Amazon EC2 instance hostname
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * Available options:
     *
     * * EnableResourceNameDnsAAAARecord (true | false)
     * * EnableResourceNameDnsARecord (true | false)
     * * HostnameType (ip-name | resource-name)
     */
    override fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: Any) {
      cdkBuilder.privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch)
    }

    /**
     * @param tags Any tags assigned to the subnet.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Any tags assigned to the subnet.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcId The ID of the VPC the subnet is in. 
     * If you update this property, you must also update the `CidrBlock` property.
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetProps,
  ) : CdkObject(cdkObject), CfnSubnetProps {
    /**
     * Indicates whether a network interface created in this subnet receives an IPv6 address. The
     * default value is `false` .
     *
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation)
     */
    override fun assignIpv6AddressOnCreation(): Any? = unwrap(this).getAssignIpv6AddressOnCreation()

    /**
     * The Availability Zone of the subnet.
     *
     * If you update this property, you must also update the `CidrBlock` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The AZ ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzoneid)
     */
    override fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

    /**
     * The IPv4 CIDR block assigned to the subnet.
     *
     * If you update this property, we create a new subnet, and then delete the existing one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-cidrblock)
     */
    override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    /**
     * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should
     * return synthetic IPv6 addresses for IPv4-only destinations.
     *
     * For more information, see [DNS64 and
     * NAT64](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-nat64-dns64)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-enabledns64)
     */
    override fun enableDns64(): Any? = unwrap(this).getEnableDns64()

    /**
     * Indicates the device position for local network interfaces in this subnet.
     *
     * For example, `1` indicates local network interfaces in this subnet are the secondary network
     * interface (eth1).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-enablelniatdeviceindex)
     */
    override fun enableLniAtDeviceIndex(): Number? = unwrap(this).getEnableLniAtDeviceIndex()

    /**
     * An IPv4 IPAM pool ID for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv4ipampoolid)
     */
    override fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

    /**
     * An IPv4 netmask length for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv4netmasklength)
     */
    override fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

    /**
     * The IPv6 CIDR block.
     *
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblock)
     */
    override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

    /**
     * The IPv6 network ranges for the subnet, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblocks)
     */
    override fun ipv6CidrBlocks(): List<String> = unwrap(this).getIpv6CidrBlocks() ?: emptyList()

    /**
     * An IPv6 IPAM pool ID for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6ipampoolid)
     */
    override fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

    /**
     * Indicates whether this is an IPv6 only subnet.
     *
     * For more information, see [Subnet
     * basics](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#subnet-basics) in the
     * *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6native)
     */
    override fun ipv6Native(): Any? = unwrap(this).getIpv6Native()

    /**
     * An IPv6 netmask length for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6netmasklength)
     */
    override fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

    /**
     * Indicates whether instances launched in this subnet receive a public IPv4 address. The
     * default value is `false` .
     *
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
     * tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch)
     */
    override fun mapPublicIpOnLaunch(): Any? = unwrap(this).getMapPublicIpOnLaunch()

    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-outpostarn)
     */
    override fun outpostArn(): String? = unwrap(this).getOutpostArn()

    /**
     * The hostname type for EC2 instances launched into this subnet and how DNS A and AAAA record
     * queries to the instances should be handled.
     *
     * For more information, see [Amazon EC2 instance hostname
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * Available options:
     *
     * * EnableResourceNameDnsAAAARecord (true | false)
     * * EnableResourceNameDnsARecord (true | false)
     * * HostnameType (ip-name | resource-name)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-privatednsnameoptionsonlaunch)
     */
    override fun privateDnsNameOptionsOnLaunch(): Any? =
        unwrap(this).getPrivateDnsNameOptionsOnLaunch()

    /**
     * Any tags assigned to the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the VPC the subnet is in.
     *
     * If you update this property, you must also update the `CidrBlock` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubnetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetProps): CfnSubnetProps
        = CdkObjectWrappers.wrap(cdkObject) as? CfnSubnetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetProps): software.amazon.awscdk.services.ec2.CfnSubnetProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnSubnetProps
  }
}
