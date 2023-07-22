@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVPC
import software.constructs.Construct

/**
 * Specifies a virtual private cloud (VPC).
 *
 * You can optionally request an IPv6 CIDR block for the VPC. You can request an Amazon-provided
 * IPv6 CIDR block from Amazon's pool of IPv6 addresses, or an IPv6 CIDR block from an IPv6 address
 * pool that you provisioned through bring your own IP addresses (BYOIP).
 *
 * For more information, see [Virtual private clouds
 * (VPC)](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/configure-your-vpc.html) in the
 * *Amazon VPC User Guide* .
 *
 * Example:
 *
 * ```
 * CfnInclude cfnTemplate;
 * // using from*Attributes()
 * CfnSubnet privateCfnSubnet1;
 * CfnSubnet privateCfnSubnet2;
 * // using from*Name()
 * CfnBucket cfnBucket = (CfnBucket)cfnTemplate.getResource("Bucket");
 * IBucket bucket = Bucket.fromBucketName(this, "L2Bucket", cfnBucket.getRef());
 * // using from*Arn()
 * CfnKey cfnKey = (CfnKey)cfnTemplate.getResource("Key");
 * IKey key = Key.fromKeyArn(this, "L2Key", cfnKey.getAttrArn());
 * CfnVPC cfnVpc = (CfnVPC)cfnTemplate.getResource("Vpc");
 * IVpc vpc = Vpc.fromVpcAttributes(this, "L2Vpc", VpcAttributes.builder()
 * .vpcId(cfnVpc.getRef())
 * .availabilityZones(Fn.getAzs())
 * .privateSubnetIds(List.of(privateCfnSubnet1.getRef(), privateCfnSubnet2.getRef()))
 * .build());
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html)
 */
@CdkDslMarker
public class CfnVPCDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVPC.Builder = CfnVPC.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The IPv4 network range for the VPC, in CIDR notation.
   *
   * For example, `10.0.0.0/16` . We modify the specified CIDR block to its canonical form; for
   * example, if you specify `100.68.0.18/18` , we modify it to `100.68.0.0/18` .
   *
   * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-cidrblock)
   * @param cidrBlock The IPv4 network range for the VPC, in CIDR notation. 
   */
  public fun cidrBlock(cidrBlock: String) {
    cdkBuilder.cidrBlock(cidrBlock)
  }

  /**
   * Indicates whether the instances launched in the VPC get DNS hostnames.
   *
   * If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by default
   * for nondefault VPCs. For more information, see [DNS attributes in your
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
   *
   * You can only enable DNS hostnames if you've enabled DNS support.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednshostnames)
   * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS
   * hostnames. 
   */
  public fun enableDnsHostnames(enableDnsHostnames: Boolean) {
    cdkBuilder.enableDnsHostnames(enableDnsHostnames)
  }

  /**
   * Indicates whether the instances launched in the VPC get DNS hostnames.
   *
   * If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by default
   * for nondefault VPCs. For more information, see [DNS attributes in your
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
   *
   * You can only enable DNS hostnames if you've enabled DNS support.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednshostnames)
   * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS
   * hostnames. 
   */
  public fun enableDnsHostnames(enableDnsHostnames: IResolvable) {
    cdkBuilder.enableDnsHostnames(enableDnsHostnames)
  }

  /**
   * Indicates whether the DNS resolution is supported for the VPC.
   *
   * If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or the
   * reserved IP address at the base of the VPC network range "plus two" succeed. If disabled, the
   * Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is not
   * enabled. Enabled by default. For more information, see [DNS attributes in your
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednssupport)
   * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC. 
   */
  public fun enableDnsSupport(enableDnsSupport: Boolean) {
    cdkBuilder.enableDnsSupport(enableDnsSupport)
  }

  /**
   * Indicates whether the DNS resolution is supported for the VPC.
   *
   * If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or the
   * reserved IP address at the base of the VPC network range "plus two" succeed. If disabled, the
   * Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is not
   * enabled. Enabled by default. For more information, see [DNS attributes in your
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednssupport)
   * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC. 
   */
  public fun enableDnsSupport(enableDnsSupport: IResolvable) {
    cdkBuilder.enableDnsSupport(enableDnsSupport)
  }

  /**
   * The allowed tenancy of instances launched into the VPC.
   *
   * * `default` : An instance launched into the VPC runs on shared hardware by default, unless you
   * explicitly specify a different tenancy during instance launch.
   * * `dedicated` : An instance launched into the VPC runs on dedicated hardware by default, unless
   * you explicitly specify a tenancy of `host` during instance launch. You cannot specify a tenancy of
   * `default` during instance launch.
   *
   * Updating `InstanceTenancy` requires no replacement only if you are updating its value from
   * `dedicated` to `default` . Updating `InstanceTenancy` from `default` to `dedicated` requires
   * replacement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-instancetenancy)
   * @param instanceTenancy The allowed tenancy of instances launched into the VPC. 
   */
  public fun instanceTenancy(instanceTenancy: String) {
    cdkBuilder.instanceTenancy(instanceTenancy)
  }

  /**
   * The ID of an IPv4 IPAM pool you want to use for allocating this VPC's CIDR.
   *
   * For more information, see [What is
   * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
   * User Guide* .
   *
   * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-ipv4ipampoolid)
   * @param ipv4IpamPoolId The ID of an IPv4 IPAM pool you want to use for allocating this VPC's
   * CIDR. 
   */
  public fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
    cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
  }

  /**
   * The netmask length of the IPv4 CIDR you want to allocate to this VPC from an Amazon VPC IP
   * Address Manager (IPAM) pool.
   *
   * For more information about IPAM, see [What is
   * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-ipv4netmasklength)
   * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you want to allocate to this VPC
   * from an Amazon VPC IP Address Manager (IPAM) pool. 
   */
  public fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
    cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
  }

  /**
   * The tags for the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-tags)
   * @param tags The tags for the VPC. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-tags)
   * @param tags The tags for the VPC. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnVPC {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
