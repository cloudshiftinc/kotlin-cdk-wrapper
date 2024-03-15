@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a subnet for the specified VPC.
 *
 * For an IPv4 only subnet, specify an IPv4 CIDR block. If the VPC has an IPv6 CIDR block, you can
 * create an IPv6 only subnet or a dual stack subnet instead. For an IPv6 only subnet, specify an IPv6
 * CIDR block. For a dual stack subnet, specify both an IPv4 CIDR block and an IPv6 CIDR block.
 *
 * For more information, see [Subnets for your
 * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/configure-subnets.html) in the *Amazon VPC
 * User Guide* .
 *
 * Example:
 *
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
 * .version(KubernetesVersion.V1_29)
 * .vpc(vpc)
 * .ipFamily(IpFamily.IP_V6)
 * .vpcSubnets(List.of(SubnetSelection.builder().subnets(vpc.getPublicSubnets()).build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html)
 */
public open class CfnSubnet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnSubnet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Indicates whether a network interface created in this subnet receives an IPv6 address.
   *
   * The default value is `false` .
   */
  public open fun assignIpv6AddressOnCreation(): Any? =
      unwrap(this).getAssignIpv6AddressOnCreation()

  /**
   * Indicates whether a network interface created in this subnet receives an IPv6 address.
   *
   * The default value is `false` .
   */
  public open fun assignIpv6AddressOnCreation(`value`: Boolean) {
    unwrap(this).setAssignIpv6AddressOnCreation(`value`)
  }

  /**
   * Indicates whether a network interface created in this subnet receives an IPv6 address.
   *
   * The default value is `false` .
   */
  public open fun assignIpv6AddressOnCreation(`value`: IResolvable) {
    unwrap(this).setAssignIpv6AddressOnCreation(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Availability Zone of this subnet.
   *
   * For example, `us-east-1a` .
   */
  public open fun attrAvailabilityZone(): String = unwrap(this).getAttrAvailabilityZone()

  /**
   * The Availability Zone ID of this subnet.
   *
   * For example, `use1-az1` .
   */
  public open fun attrAvailabilityZoneId(): String = unwrap(this).getAttrAvailabilityZoneId()

  /**
   * The IPv4 CIDR blocks that are associated with the subnet.
   */
  public open fun attrCidrBlock(): String = unwrap(this).getAttrCidrBlock()

  /**
   *
   */
  public open fun attrIpv6CidrBlocks(): List<String> = unwrap(this).getAttrIpv6CidrBlocks()

  /**
   * The ID of the network ACL that is associated with the subnet's VPC, such as `acl-5fb85d36` .
   */
  public open fun attrNetworkAclAssociationId(): String =
      unwrap(this).getAttrNetworkAclAssociationId()

  /**
   * The Amazon Resource Name (ARN) of the Outpost.
   */
  public open fun attrOutpostArn(): String = unwrap(this).getAttrOutpostArn()

  /**
   * The ID of the subnet.
   */
  public open fun attrSubnetId(): String = unwrap(this).getAttrSubnetId()

  /**
   * The ID of the subnet's VPC, such as `vpc-11ad4878` .
   */
  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  /**
   * The Availability Zone of the subnet.
   */
  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The Availability Zone of the subnet.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * The AZ ID of the subnet.
   */
  public open fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

  /**
   * The AZ ID of the subnet.
   */
  public open fun availabilityZoneId(`value`: String) {
    unwrap(this).setAvailabilityZoneId(`value`)
  }

  /**
   * The IPv4 CIDR block assigned to the subnet.
   */
  public open fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  /**
   * The IPv4 CIDR block assigned to the subnet.
   */
  public open fun cidrBlock(`value`: String) {
    unwrap(this).setCidrBlock(`value`)
  }

  /**
   * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should
   * return synthetic IPv6 addresses for IPv4-only destinations.
   */
  public open fun enableDns64(): Any? = unwrap(this).getEnableDns64()

  /**
   * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should
   * return synthetic IPv6 addresses for IPv4-only destinations.
   */
  public open fun enableDns64(`value`: Boolean) {
    unwrap(this).setEnableDns64(`value`)
  }

  /**
   * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should
   * return synthetic IPv6 addresses for IPv4-only destinations.
   */
  public open fun enableDns64(`value`: IResolvable) {
    unwrap(this).setEnableDns64(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An IPv4 IPAM pool ID for the subnet.
   */
  public open fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  /**
   * An IPv4 IPAM pool ID for the subnet.
   */
  public open fun ipv4IpamPoolId(`value`: String) {
    unwrap(this).setIpv4IpamPoolId(`value`)
  }

  /**
   * An IPv4 netmask length for the subnet.
   */
  public open fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  /**
   * An IPv4 netmask length for the subnet.
   */
  public open fun ipv4NetmaskLength(`value`: Number) {
    unwrap(this).setIpv4NetmaskLength(`value`)
  }

  /**
   * The IPv6 CIDR block.
   */
  public open fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  /**
   * The IPv6 CIDR block.
   */
  public open fun ipv6CidrBlock(`value`: String) {
    unwrap(this).setIpv6CidrBlock(`value`)
  }

  /**
   * The IPv6 network ranges for the subnet, in CIDR notation.
   */
  public open fun ipv6CidrBlocks(): List<String> = unwrap(this).getIpv6CidrBlocks() ?: emptyList()

  /**
   * The IPv6 network ranges for the subnet, in CIDR notation.
   */
  public open fun ipv6CidrBlocks(`value`: List<String>) {
    unwrap(this).setIpv6CidrBlocks(`value`)
  }

  /**
   * The IPv6 network ranges for the subnet, in CIDR notation.
   */
  public open fun ipv6CidrBlocks(vararg `value`: String): Unit = ipv6CidrBlocks(`value`.toList())

  /**
   * An IPv6 IPAM pool ID for the subnet.
   */
  public open fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

  /**
   * An IPv6 IPAM pool ID for the subnet.
   */
  public open fun ipv6IpamPoolId(`value`: String) {
    unwrap(this).setIpv6IpamPoolId(`value`)
  }

  /**
   * Indicates whether this is an IPv6 only subnet.
   */
  public open fun ipv6Native(): Any? = unwrap(this).getIpv6Native()

  /**
   * Indicates whether this is an IPv6 only subnet.
   */
  public open fun ipv6Native(`value`: Boolean) {
    unwrap(this).setIpv6Native(`value`)
  }

  /**
   * Indicates whether this is an IPv6 only subnet.
   */
  public open fun ipv6Native(`value`: IResolvable) {
    unwrap(this).setIpv6Native(`value`.let(IResolvable::unwrap))
  }

  /**
   * An IPv6 netmask length for the subnet.
   */
  public open fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

  /**
   * An IPv6 netmask length for the subnet.
   */
  public open fun ipv6NetmaskLength(`value`: Number) {
    unwrap(this).setIpv6NetmaskLength(`value`)
  }

  /**
   * Indicates whether instances launched in this subnet receive a public IPv4 address.
   *
   * The default value is `false` .
   */
  public open fun mapPublicIpOnLaunch(): Any? = unwrap(this).getMapPublicIpOnLaunch()

  /**
   * Indicates whether instances launched in this subnet receive a public IPv4 address.
   *
   * The default value is `false` .
   */
  public open fun mapPublicIpOnLaunch(`value`: Boolean) {
    unwrap(this).setMapPublicIpOnLaunch(`value`)
  }

  /**
   * Indicates whether instances launched in this subnet receive a public IPv4 address.
   *
   * The default value is `false` .
   */
  public open fun mapPublicIpOnLaunch(`value`: IResolvable) {
    unwrap(this).setMapPublicIpOnLaunch(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the Outpost.
   */
  public open fun outpostArn(): String? = unwrap(this).getOutpostArn()

  /**
   * The Amazon Resource Name (ARN) of the Outpost.
   */
  public open fun outpostArn(`value`: String) {
    unwrap(this).setOutpostArn(`value`)
  }

  /**
   * The hostname type for EC2 instances launched into this subnet and how DNS A and AAAA record
   * queries to the instances should be handled.
   */
  public open fun privateDnsNameOptionsOnLaunch(): Any? =
      unwrap(this).getPrivateDnsNameOptionsOnLaunch()

  /**
   * The hostname type for EC2 instances launched into this subnet and how DNS A and AAAA record
   * queries to the instances should be handled.
   */
  public open fun privateDnsNameOptionsOnLaunch(`value`: Any) {
    unwrap(this).setPrivateDnsNameOptionsOnLaunch(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Any tags assigned to the subnet.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Any tags assigned to the subnet.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Any tags assigned to the subnet.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the VPC the subnet is in.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the VPC the subnet is in.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnSubnet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether a network interface created in this subnet receives an IPv6 address. The
     * default value is `false` .
     *
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation)
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     * subnet receives an IPv6 address. The default value is `false` . 
     */
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean)

    /**
     * Indicates whether a network interface created in this subnet receives an IPv6 address. The
     * default value is `false` .
     *
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation)
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     * subnet receives an IPv6 address. The default value is `false` . 
     */
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: IResolvable)

    /**
     * The Availability Zone of the subnet.
     *
     * If you update this property, you must also update the `CidrBlock` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzone)
     * @param availabilityZone The Availability Zone of the subnet. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * The AZ ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzoneid)
     * @param availabilityZoneId The AZ ID of the subnet. 
     */
    public fun availabilityZoneId(availabilityZoneId: String)

    /**
     * The IPv4 CIDR block assigned to the subnet.
     *
     * If you update this property, we create a new subnet, and then delete the existing one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-cidrblock)
     * @param cidrBlock The IPv4 CIDR block assigned to the subnet. 
     */
    public fun cidrBlock(cidrBlock: String)

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
    public fun enableDns64(enableDns64: Boolean)

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
    public fun enableDns64(enableDns64: IResolvable)

    /**
     * An IPv4 IPAM pool ID for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv4ipampoolid)
     * @param ipv4IpamPoolId An IPv4 IPAM pool ID for the subnet. 
     */
    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    /**
     * An IPv4 netmask length for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv4netmasklength)
     * @param ipv4NetmaskLength An IPv4 netmask length for the subnet. 
     */
    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)

    /**
     * The IPv6 CIDR block.
     *
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblock)
     * @param ipv6CidrBlock The IPv6 CIDR block. 
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    /**
     * The IPv6 network ranges for the subnet, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblocks)
     * @param ipv6CidrBlocks The IPv6 network ranges for the subnet, in CIDR notation. 
     */
    public fun ipv6CidrBlocks(ipv6CidrBlocks: List<String>)

    /**
     * The IPv6 network ranges for the subnet, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblocks)
     * @param ipv6CidrBlocks The IPv6 network ranges for the subnet, in CIDR notation. 
     */
    public fun ipv6CidrBlocks(vararg ipv6CidrBlocks: String)

    /**
     * An IPv6 IPAM pool ID for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6ipampoolid)
     * @param ipv6IpamPoolId An IPv6 IPAM pool ID for the subnet. 
     */
    public fun ipv6IpamPoolId(ipv6IpamPoolId: String)

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
    public fun ipv6Native(ipv6Native: Boolean)

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
    public fun ipv6Native(ipv6Native: IResolvable)

    /**
     * An IPv6 netmask length for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6netmasklength)
     * @param ipv6NetmaskLength An IPv6 netmask length for the subnet. 
     */
    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number)

    /**
     * Indicates whether instances launched in this subnet receive a public IPv4 address. The
     * default value is `false` .
     *
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
     * tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch)
     * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a
     * public IPv4 address. The default value is `false` . 
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean)

    /**
     * Indicates whether instances launched in this subnet receive a public IPv4 address. The
     * default value is `false` .
     *
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
     * tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch)
     * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a
     * public IPv4 address. The default value is `false` . 
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: IResolvable)

    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-outpostarn)
     * @param outpostArn The Amazon Resource Name (ARN) of the Outpost. 
     */
    public fun outpostArn(outpostArn: String)

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
    public fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: Any)

    /**
     * Any tags assigned to the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
     * @param tags Any tags assigned to the subnet. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags assigned to the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
     * @param tags Any tags assigned to the subnet. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the VPC the subnet is in.
     *
     * If you update this property, you must also update the `CidrBlock` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-vpcid)
     * @param vpcId The ID of the VPC the subnet is in. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSubnet.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnet.Builder.create(scope, id)

    /**
     * Indicates whether a network interface created in this subnet receives an IPv6 address. The
     * default value is `false` .
     *
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation)
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     * subnet receives an IPv6 address. The default value is `false` . 
     */
    override fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean) {
      cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    /**
     * Indicates whether a network interface created in this subnet receives an IPv6 address. The
     * default value is `false` .
     *
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation)
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     * subnet receives an IPv6 address. The default value is `false` . 
     */
    override fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: IResolvable) {
      cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation.let(IResolvable::unwrap))
    }

    /**
     * The Availability Zone of the subnet.
     *
     * If you update this property, you must also update the `CidrBlock` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzone)
     * @param availabilityZone The Availability Zone of the subnet. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The AZ ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzoneid)
     * @param availabilityZoneId The AZ ID of the subnet. 
     */
    override fun availabilityZoneId(availabilityZoneId: String) {
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
    override fun cidrBlock(cidrBlock: String) {
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
    override fun enableDns64(enableDns64: Boolean) {
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
    override fun enableDns64(enableDns64: IResolvable) {
      cdkBuilder.enableDns64(enableDns64.let(IResolvable::unwrap))
    }

    /**
     * An IPv4 IPAM pool ID for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv4ipampoolid)
     * @param ipv4IpamPoolId An IPv4 IPAM pool ID for the subnet. 
     */
    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    /**
     * An IPv4 netmask length for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv4netmasklength)
     * @param ipv4NetmaskLength An IPv4 netmask length for the subnet. 
     */
    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    /**
     * The IPv6 CIDR block.
     *
     * If you specify `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblock)
     * @param ipv6CidrBlock The IPv6 CIDR block. 
     */
    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * The IPv6 network ranges for the subnet, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblocks)
     * @param ipv6CidrBlocks The IPv6 network ranges for the subnet, in CIDR notation. 
     */
    override fun ipv6CidrBlocks(ipv6CidrBlocks: List<String>) {
      cdkBuilder.ipv6CidrBlocks(ipv6CidrBlocks)
    }

    /**
     * The IPv6 network ranges for the subnet, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblocks)
     * @param ipv6CidrBlocks The IPv6 network ranges for the subnet, in CIDR notation. 
     */
    override fun ipv6CidrBlocks(vararg ipv6CidrBlocks: String): Unit =
        ipv6CidrBlocks(ipv6CidrBlocks.toList())

    /**
     * An IPv6 IPAM pool ID for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6ipampoolid)
     * @param ipv6IpamPoolId An IPv6 IPAM pool ID for the subnet. 
     */
    override fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
      cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
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
    override fun ipv6Native(ipv6Native: Boolean) {
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
    override fun ipv6Native(ipv6Native: IResolvable) {
      cdkBuilder.ipv6Native(ipv6Native.let(IResolvable::unwrap))
    }

    /**
     * An IPv6 netmask length for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6netmasklength)
     * @param ipv6NetmaskLength An IPv6 netmask length for the subnet. 
     */
    override fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
      cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    /**
     * Indicates whether instances launched in this subnet receive a public IPv4 address. The
     * default value is `false` .
     *
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
     * tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch)
     * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a
     * public IPv4 address. The default value is `false` . 
     */
    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    /**
     * Indicates whether instances launched in this subnet receive a public IPv4 address. The
     * default value is `false` .
     *
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
     * tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch)
     * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a
     * public IPv4 address. The default value is `false` . 
     */
    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: IResolvable) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch.let(IResolvable::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-outpostarn)
     * @param outpostArn The Amazon Resource Name (ARN) of the Outpost. 
     */
    override fun outpostArn(outpostArn: String) {
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
    override fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: Any) {
      cdkBuilder.privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch)
    }

    /**
     * Any tags assigned to the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
     * @param tags Any tags assigned to the subnet. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Any tags assigned to the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
     * @param tags Any tags assigned to the subnet. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the VPC the subnet is in.
     *
     * If you update this property, you must also update the `CidrBlock` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-vpcid)
     * @param vpcId The ID of the VPC the subnet is in. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnSubnet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubnet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubnet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnet): CfnSubnet =
        CfnSubnet(cdkObject)

    internal fun unwrap(wrapped: CfnSubnet): software.amazon.awscdk.services.ec2.CfnSubnet =
        wrapped.cdkObject
  }

  /**
   * Describes the options for instance hostnames.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PrivateDnsNameOptionsOnLaunchProperty privateDnsNameOptionsOnLaunchProperty =
   * PrivateDnsNameOptionsOnLaunchProperty.builder()
   * .enableResourceNameDnsAaaaRecord(false)
   * .enableResourceNameDnsARecord(false)
   * .hostnameType("hostnameType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-subnet-privatednsnameoptionsonlaunch.html)
   */
  public interface PrivateDnsNameOptionsOnLaunchProperty {
    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-subnet-privatednsnameoptionsonlaunch.html#cfn-ec2-subnet-privatednsnameoptionsonlaunch-enableresourcenamednsarecord)
     */
    public fun enableResourceNameDnsARecord(): Any? = unwrap(this).getEnableResourceNameDnsARecord()

    /**
     * Indicates whether to respond to DNS queries for instance hostname with DNS AAAA records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-subnet-privatednsnameoptionsonlaunch.html#cfn-ec2-subnet-privatednsnameoptionsonlaunch-enableresourcenamednsaaaarecord)
     */
    public fun enableResourceNameDnsAaaaRecord(): Any? =
        unwrap(this).getEnableResourceNameDnsAaaaRecord()

    /**
     * The type of hostname for EC2 instances.
     *
     * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
     * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
     * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-subnet-privatednsnameoptionsonlaunch.html#cfn-ec2-subnet-privatednsnameoptionsonlaunch-hostnametype)
     */
    public fun hostnameType(): String? = unwrap(this).getHostnameType()

    /**
     * A builder for [PrivateDnsNameOptionsOnLaunchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS A records.
       */
      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean)

      /**
       * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS A records.
       */
      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable)

      /**
       * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
       * instance hostname with DNS AAAA records.
       */
      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean)

      /**
       * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
       * instance hostname with DNS AAAA records.
       */
      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable)

      /**
       * @param hostnameType The type of hostname for EC2 instances.
       * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
       * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
       * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
       */
      public fun hostnameType(hostnameType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty.builder()

      /**
       * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS A records.
       */
      override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
      }

      /**
       * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS A records.
       */
      override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord.let(IResolvable::unwrap))
      }

      /**
       * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
       * instance hostname with DNS AAAA records.
       */
      override fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
      }

      /**
       * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
       * instance hostname with DNS AAAA records.
       */
      override fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord.let(IResolvable::unwrap))
      }

      /**
       * @param hostnameType The type of hostname for EC2 instances.
       * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
       * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
       * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
       */
      override fun hostnameType(hostnameType: String) {
        cdkBuilder.hostnameType(hostnameType)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty,
    ) : CdkObject(cdkObject), PrivateDnsNameOptionsOnLaunchProperty {
      /**
       * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-subnet-privatednsnameoptionsonlaunch.html#cfn-ec2-subnet-privatednsnameoptionsonlaunch-enableresourcenamednsarecord)
       */
      override fun enableResourceNameDnsARecord(): Any? =
          unwrap(this).getEnableResourceNameDnsARecord()

      /**
       * Indicates whether to respond to DNS queries for instance hostname with DNS AAAA records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-subnet-privatednsnameoptionsonlaunch.html#cfn-ec2-subnet-privatednsnameoptionsonlaunch-enableresourcenamednsaaaarecord)
       */
      override fun enableResourceNameDnsAaaaRecord(): Any? =
          unwrap(this).getEnableResourceNameDnsAaaaRecord()

      /**
       * The type of hostname for EC2 instances.
       *
       * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
       * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
       * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-subnet-privatednsnameoptionsonlaunch.html#cfn-ec2-subnet-privatednsnameoptionsonlaunch-hostnametype)
       */
      override fun hostnameType(): String? = unwrap(this).getHostnameType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrivateDnsNameOptionsOnLaunchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty):
          PrivateDnsNameOptionsOnLaunchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateDnsNameOptionsOnLaunchProperty):
          software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty
    }
  }
}
