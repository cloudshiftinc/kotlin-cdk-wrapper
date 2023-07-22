@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
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
   * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this subnet
   * receives an IPv6 address. The default value is `false` . 
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
   * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this subnet
   * receives an IPv6 address. The default value is `false` . 
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
   * @param availabilityZone The Availability Zone of the subnet. 
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * The AZ ID of the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzoneid)
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
   * @param cidrBlock The IPv4 CIDR block assigned to the subnet. 
   */
  public fun cidrBlock(cidrBlock: String) {
    cdkBuilder.cidrBlock(cidrBlock)
  }

  /**
   * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should
   * return synthetic IPv6 addresses for IPv4-only destinations.
   *
   * For more information, see [DNS64 and
   * NAT64](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-nat64-dns64)
   * in the *Amazon Virtual Private Cloud User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-enabledns64)
   * @param enableDns64 Indicates whether DNS queries made to the Amazon-provided DNS Resolver in
   * this subnet should return synthetic IPv6 addresses for IPv4-only destinations. 
   */
  public fun enableDns64(enableDns64: Boolean) {
    cdkBuilder.enableDns64(enableDns64)
  }

  /**
   * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should
   * return synthetic IPv6 addresses for IPv4-only destinations.
   *
   * For more information, see [DNS64 and
   * NAT64](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-nat64-dns64)
   * in the *Amazon Virtual Private Cloud User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-enabledns64)
   * @param enableDns64 Indicates whether DNS queries made to the Amazon-provided DNS Resolver in
   * this subnet should return synthetic IPv6 addresses for IPv4-only destinations. 
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
   * @param ipv6CidrBlock The IPv6 CIDR block. 
   */
  public fun ipv6CidrBlock(ipv6CidrBlock: String) {
    cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
  }

  /**
   * Indicates whether this is an IPv6 only subnet.
   *
   * For more information, see [Subnet
   * basics](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#subnet-basics) in the
   * *Amazon Virtual Private Cloud User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6native)
   * @param ipv6Native Indicates whether this is an IPv6 only subnet. 
   */
  public fun ipv6Native(ipv6Native: Boolean) {
    cdkBuilder.ipv6Native(ipv6Native)
  }

  /**
   * Indicates whether this is an IPv6 only subnet.
   *
   * For more information, see [Subnet
   * basics](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#subnet-basics) in the
   * *Amazon Virtual Private Cloud User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6native)
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
   * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a public
   * IPv4 address. 
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
   * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a public
   * IPv4 address. 
   */
  public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: IResolvable) {
    cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
  }

  /**
   * The Amazon Resource Name (ARN) of the Outpost.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-outpostarn)
   * @param outpostArn The Amazon Resource Name (ARN) of the Outpost. 
   */
  public fun outpostArn(outpostArn: String) {
    cdkBuilder.outpostArn(outpostArn)
  }

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
   * @param privateDnsNameOptionsOnLaunch The hostname type for EC2 instances launched into this
   * subnet and how DNS A and AAAA record queries to the instances should be handled. 
   */
  public fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: MapBuilder.() -> Unit =
      {}) {
    val builder = MapBuilder()
    builder.apply(privateDnsNameOptionsOnLaunch)
    cdkBuilder.privateDnsNameOptionsOnLaunch(builder.map)
  }

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
   * @param privateDnsNameOptionsOnLaunch The hostname type for EC2 instances launched into this
   * subnet and how DNS A and AAAA record queries to the instances should be handled. 
   */
  public fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: Any) {
    cdkBuilder.privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch)
  }

  /**
   * Any tags assigned to the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
   * @param tags Any tags assigned to the subnet. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Any tags assigned to the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
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
   * @param vpcId The ID of the VPC the subnet is in. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnSubnet {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
