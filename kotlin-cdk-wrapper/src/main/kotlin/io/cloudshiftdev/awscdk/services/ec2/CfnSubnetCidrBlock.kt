@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Associates a CIDR block with your subnet.
 *
 * You can associate a single IPv6 CIDR block with your subnet.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSubnetCidrBlock cfnSubnetCidrBlock = CfnSubnetCidrBlock.Builder.create(this,
 * "MyCfnSubnetCidrBlock")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .ipv6CidrBlock("ipv6CidrBlock")
 * .ipv6IpamPoolId("ipv6IpamPoolId")
 * .ipv6NetmaskLength(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html)
 */
public open class CfnSubnetCidrBlock(
  cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubnetCidrBlockProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSubnetCidrBlockProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubnetCidrBlockProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSubnetCidrBlockProps(props)
  )

  /**
   * The ID of the association.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The IPv6 network range for the subnet, in CIDR notation.
   */
  public open fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  /**
   * The IPv6 network range for the subnet, in CIDR notation.
   */
  public open fun ipv6CidrBlock(`value`: String) {
    unwrap(this).setIpv6CidrBlock(`value`)
  }

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
   * The ID of the subnet.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnSubnetCidrBlock].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IPv6 network range for the subnet, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock)
     * @param ipv6CidrBlock The IPv6 network range for the subnet, in CIDR notation. 
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    /**
     * An IPv6 IPAM pool ID for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6ipampoolid)
     * @param ipv6IpamPoolId An IPv6 IPAM pool ID for the subnet. 
     */
    public fun ipv6IpamPoolId(ipv6IpamPoolId: String)

    /**
     * An IPv6 netmask length for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6netmasklength)
     * @param ipv6NetmaskLength An IPv6 netmask length for the subnet. 
     */
    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number)

    /**
     * The ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid)
     * @param subnetId The ID of the subnet. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock.Builder.create(scope, id)

    /**
     * The IPv6 network range for the subnet, in CIDR notation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6cidrblock)
     * @param ipv6CidrBlock The IPv6 network range for the subnet, in CIDR notation. 
     */
    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /**
     * An IPv6 IPAM pool ID for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6ipampoolid)
     * @param ipv6IpamPoolId An IPv6 IPAM pool ID for the subnet. 
     */
    override fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
      cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    /**
     * An IPv6 netmask length for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-ipv6netmasklength)
     * @param ipv6NetmaskLength An IPv6 netmask length for the subnet. 
     */
    override fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
      cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    /**
     * The ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html#cfn-ec2-subnetcidrblock-subnetid)
     * @param subnetId The ID of the subnet. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubnetCidrBlock {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubnetCidrBlock(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock):
        CfnSubnetCidrBlock = CfnSubnetCidrBlock(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetCidrBlock):
        software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock
  }
}
