@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Associates a CIDR block with your VPC.
 *
 * You can optionally request an IPv6 CIDR block for the VPC. You can request an Amazon-provided
 * IPv6 CIDR block from Amazon's pool of IPv6 addresses, or an IPv6 CIDR block from an IPv6 address
 * pool that you provisioned through bring your own IP addresses (BYOIP).
 *
 * For more information, see [VPC CIDR
 * blocks](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-cidr-blocks.html) in the *Amazon VPC
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
 * .version(KubernetesVersion.V1_31)
 * .vpc(vpc)
 * .ipFamily(IpFamily.IP_V6)
 * .vpcSubnets(List.of(SubnetSelection.builder().subnets(vpc.getPublicSubnets()).build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html)
 */
public open class CfnVPCCidrBlock(
  cdkObject: software.amazon.awscdk.services.ec2.CfnVPCCidrBlock,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPCCidrBlockProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVPCCidrBlock(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVPCCidrBlockProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPCCidrBlockProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVPCCidrBlockProps(props)
  )

  /**
   * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
   */
  public open fun amazonProvidedIpv6CidrBlock(): Any? =
      unwrap(this).getAmazonProvidedIpv6CidrBlock()

  /**
   * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
   */
  public open fun amazonProvidedIpv6CidrBlock(`value`: Boolean) {
    unwrap(this).setAmazonProvidedIpv6CidrBlock(`value`)
  }

  /**
   * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
   */
  public open fun amazonProvidedIpv6CidrBlock(`value`: IResolvable) {
    unwrap(this).setAmazonProvidedIpv6CidrBlock(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Id of the VPC associated CIDR Block.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The source that allocated the IP address space.
   *
   * `byoip` or `amazon` indicates public IP address space allocated by Amazon or space that you
   * have allocated with Bring your own IP (BYOIP). `none` indicates private space.
   */
  public open fun attrIpSource(): String = unwrap(this).getAttrIpSource()

  /**
   * Public IPv6 addresses are those advertised on the internet from AWS .
   *
   * Private IP addresses are not and cannot be advertised on the internet from AWS .
   */
  public open fun attrIpv6AddressAttribute(): String = unwrap(this).getAttrIpv6AddressAttribute()

  /**
   * An IPv4 CIDR block to associate with the VPC.
   */
  public open fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  /**
   * An IPv4 CIDR block to associate with the VPC.
   */
  public open fun cidrBlock(`value`: String) {
    unwrap(this).setCidrBlock(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Associate a CIDR allocated from an IPv4 IPAM pool to a VPC.
   */
  public open fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  /**
   * Associate a CIDR allocated from an IPv4 IPAM pool to a VPC.
   */
  public open fun ipv4IpamPoolId(`value`: String) {
    unwrap(this).setIpv4IpamPoolId(`value`)
  }

  /**
   * The netmask length of the IPv4 CIDR you would like to associate from an Amazon VPC IP Address
   * Manager (IPAM) pool.
   */
  public open fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  /**
   * The netmask length of the IPv4 CIDR you would like to associate from an Amazon VPC IP Address
   * Manager (IPAM) pool.
   */
  public open fun ipv4NetmaskLength(`value`: Number) {
    unwrap(this).setIpv4NetmaskLength(`value`)
  }

  /**
   * An IPv6 CIDR block from the IPv6 address pool.
   *
   * You must also specify `Ipv6Pool` in the request.
   */
  public open fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  /**
   * An IPv6 CIDR block from the IPv6 address pool.
   *
   * You must also specify `Ipv6Pool` in the request.
   */
  public open fun ipv6CidrBlock(`value`: String) {
    unwrap(this).setIpv6CidrBlock(`value`)
  }

  /**
   * Associates a CIDR allocated from an IPv6 IPAM pool to a VPC.
   */
  public open fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

  /**
   * Associates a CIDR allocated from an IPv6 IPAM pool to a VPC.
   */
  public open fun ipv6IpamPoolId(`value`: String) {
    unwrap(this).setIpv6IpamPoolId(`value`)
  }

  /**
   * The netmask length of the IPv6 CIDR you would like to associate from an Amazon VPC IP Address
   * Manager (IPAM) pool.
   */
  public open fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

  /**
   * The netmask length of the IPv6 CIDR you would like to associate from an Amazon VPC IP Address
   * Manager (IPAM) pool.
   */
  public open fun ipv6NetmaskLength(`value`: Number) {
    unwrap(this).setIpv6NetmaskLength(`value`)
  }

  /**
   * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
   */
  public open fun ipv6Pool(): String? = unwrap(this).getIpv6Pool()

  /**
   * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
   */
  public open fun ipv6Pool(`value`: String) {
    unwrap(this).setIpv6Pool(`value`)
  }

  /**
   * The ID of the VPC.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the VPC.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPCCidrBlock].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
     *
     * You cannot specify the range of IPv6 addresses or the size of the CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock)
     * @param amazonProvidedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56
     * prefix length for the VPC. 
     */
    public fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean)

    /**
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
     *
     * You cannot specify the range of IPv6 addresses or the size of the CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock)
     * @param amazonProvidedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56
     * prefix length for the VPC. 
     */
    public fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: IResolvable)

    /**
     * An IPv4 CIDR block to associate with the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-cidrblock)
     * @param cidrBlock An IPv4 CIDR block to associate with the VPC. 
     */
    public fun cidrBlock(cidrBlock: String)

    /**
     * Associate a CIDR allocated from an IPv4 IPAM pool to a VPC.
     *
     * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv4ipampoolid)
     * @param ipv4IpamPoolId Associate a CIDR allocated from an IPv4 IPAM pool to a VPC. 
     */
    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    /**
     * The netmask length of the IPv4 CIDR you would like to associate from an Amazon VPC IP Address
     * Manager (IPAM) pool.
     *
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv4netmasklength)
     * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you would like to associate from
     * an Amazon VPC IP Address Manager (IPAM) pool. 
     */
    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)

    /**
     * An IPv6 CIDR block from the IPv6 address pool. You must also specify `Ipv6Pool` in the
     * request.
     *
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6cidrblock)
     * @param ipv6CidrBlock An IPv6 CIDR block from the IPv6 address pool. You must also specify
     * `Ipv6Pool` in the request. 
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    /**
     * Associates a CIDR allocated from an IPv6 IPAM pool to a VPC.
     *
     * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6ipampoolid)
     * @param ipv6IpamPoolId Associates a CIDR allocated from an IPv6 IPAM pool to a VPC. 
     */
    public fun ipv6IpamPoolId(ipv6IpamPoolId: String)

    /**
     * The netmask length of the IPv6 CIDR you would like to associate from an Amazon VPC IP Address
     * Manager (IPAM) pool.
     *
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6netmasklength)
     * @param ipv6NetmaskLength The netmask length of the IPv6 CIDR you would like to associate from
     * an Amazon VPC IP Address Manager (IPAM) pool. 
     */
    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number)

    /**
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6pool)
     * @param ipv6Pool The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block. 
     */
    public fun ipv6Pool(ipv6Pool: String)

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCCidrBlock.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCCidrBlock.Builder.create(scope, id)

    /**
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
     *
     * You cannot specify the range of IPv6 addresses or the size of the CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock)
     * @param amazonProvidedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56
     * prefix length for the VPC. 
     */
    override fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean) {
      cdkBuilder.amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock)
    }

    /**
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
     *
     * You cannot specify the range of IPv6 addresses or the size of the CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-amazonprovidedipv6cidrblock)
     * @param amazonProvidedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56
     * prefix length for the VPC. 
     */
    override fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: IResolvable) {
      cdkBuilder.amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock.let(IResolvable.Companion::unwrap))
    }

    /**
     * An IPv4 CIDR block to associate with the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-cidrblock)
     * @param cidrBlock An IPv4 CIDR block to associate with the VPC. 
     */
    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * Associate a CIDR allocated from an IPv4 IPAM pool to a VPC.
     *
     * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv4ipampoolid)
     * @param ipv4IpamPoolId Associate a CIDR allocated from an IPv4 IPAM pool to a VPC. 
     */
    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    /**
     * The netmask length of the IPv4 CIDR you would like to associate from an Amazon VPC IP Address
     * Manager (IPAM) pool.
     *
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv4netmasklength)
     * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you would like to associate from
     * an Amazon VPC IP Address Manager (IPAM) pool. 
     */
    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    /**
     * An IPv6 CIDR block from the IPv6 address pool. You must also specify `Ipv6Pool` in the
     * request.
     *
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6cidrblock)
     * @param ipv6CidrBlock An IPv6 CIDR block from the IPv6 address pool. You must also specify
     * `Ipv6Pool` in the request. 
     */
    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * Associates a CIDR allocated from an IPv6 IPAM pool to a VPC.
     *
     * For more information about Amazon VPC IP Address Manager (IPAM), see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6ipampoolid)
     * @param ipv6IpamPoolId Associates a CIDR allocated from an IPv6 IPAM pool to a VPC. 
     */
    override fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
      cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    /**
     * The netmask length of the IPv6 CIDR you would like to associate from an Amazon VPC IP Address
     * Manager (IPAM) pool.
     *
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6netmasklength)
     * @param ipv6NetmaskLength The netmask length of the IPv6 CIDR you would like to associate from
     * an Amazon VPC IP Address Manager (IPAM) pool. 
     */
    override fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
      cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    /**
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-ipv6pool)
     * @param ipv6Pool The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block. 
     */
    override fun ipv6Pool(ipv6Pool: String) {
      cdkBuilder.ipv6Pool(ipv6Pool)
    }

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpccidrblock.html#cfn-ec2-vpccidrblock-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCCidrBlock = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPCCidrBlock.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCCidrBlock {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCCidrBlock(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCCidrBlock):
        CfnVPCCidrBlock = CfnVPCCidrBlock(cdkObject)

    internal fun unwrap(wrapped: CfnVPCCidrBlock):
        software.amazon.awscdk.services.ec2.CfnVPCCidrBlock = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCCidrBlock
  }
}
