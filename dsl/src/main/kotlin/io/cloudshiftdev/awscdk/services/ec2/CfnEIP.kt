package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEIP internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnEIP,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID that AWS assigns to represent the allocation of the address for use with Amazon VPC.
   *
   * This is returned only for VPC elastic IP addresses. For example, `eipalloc-5723d13e` .
   */
  public open fun attrAllocationId(): String = unwrap(this).getAttrAllocationId()

  /**
   * The Elastic IP address.
   */
  public open fun attrPublicIp(): String = unwrap(this).getAttrPublicIp()

  /**
   * The network ( `vpc` ).
   */
  public open fun domain(): String? = unwrap(this).getDomain()

  /**
   * The network ( `vpc` ).
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
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
   * The ID of the instance.
   */
  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   * The ID of the instance.
   */
  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  /**
   * A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises
   * IP addresses.
   */
  public open fun networkBorderGroup(): String? = unwrap(this).getNetworkBorderGroup()

  /**
   * A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises
   * IP addresses.
   */
  public open fun networkBorderGroup(`value`: String) {
    unwrap(this).setNetworkBorderGroup(`value`)
  }

  /**
   * The ID of an address pool that you own.
   */
  public open fun publicIpv4Pool(): String? = unwrap(this).getPublicIpv4Pool()

  /**
   * The ID of an address pool that you own.
   */
  public open fun publicIpv4Pool(`value`: String) {
    unwrap(this).setPublicIpv4Pool(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Any tags assigned to the Elastic IP address.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Any tags assigned to the Elastic IP address.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Any tags assigned to the Elastic IP address.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The Elastic IP address you are accepting for transfer.
   */
  public open fun transferAddress(): String? = unwrap(this).getTransferAddress()

  /**
   * The Elastic IP address you are accepting for transfer.
   */
  public open fun transferAddress(`value`: String) {
    unwrap(this).setTransferAddress(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnEIP].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The network ( `vpc` ).
     *
     * If you define an Elastic IP address and associate it with a VPC that is defined in the same
     * template, you must declare a dependency on the VPC-gateway attachment by using the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * on this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-domain)
     * @param domain The network ( `vpc` ). 
     */
    public fun domain(domain: String)

    /**
     * The ID of the instance.
     *
     *
     * Updates to the `InstanceId` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-instanceid)
     * @param instanceId The ID of the instance. 
     */
    public fun instanceId(instanceId: String)

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-networkbordergroup)
     * @param networkBorderGroup A unique set of Availability Zones, Local Zones, or Wavelength
     * Zones from which AWS advertises IP addresses. 
     */
    public fun networkBorderGroup(networkBorderGroup: String)

    /**
     * The ID of an address pool that you own.
     *
     * Use this parameter to let Amazon EC2 select an address from the address pool.
     *
     *
     * Updates to the `PublicIpv4Pool` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-publicipv4pool)
     * @param publicIpv4Pool The ID of an address pool that you own. 
     */
    public fun publicIpv4Pool(publicIpv4Pool: String)

    /**
     * Any tags assigned to the Elastic IP address.
     *
     *
     * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-tags)
     * @param tags Any tags assigned to the Elastic IP address. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags assigned to the Elastic IP address.
     *
     *
     * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-tags)
     * @param tags Any tags assigned to the Elastic IP address. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The Elastic IP address you are accepting for transfer.
     *
     * You can only accept one transferred address. For more information on Elastic IP address
     * transfers, see [Transfer Elastic IP
     * addresses](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#transfer-EIPs-intro)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-transferaddress)
     * @param transferAddress The Elastic IP address you are accepting for transfer. 
     */
    public fun transferAddress(transferAddress: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnEIP.Builder =
        software.amazon.awscdk.services.ec2.CfnEIP.Builder.create(scope, id)

    /**
     * The network ( `vpc` ).
     *
     * If you define an Elastic IP address and associate it with a VPC that is defined in the same
     * template, you must declare a dependency on the VPC-gateway attachment by using the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * on this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-domain)
     * @param domain The network ( `vpc` ). 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * The ID of the instance.
     *
     *
     * Updates to the `InstanceId` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-instanceid)
     * @param instanceId The ID of the instance. 
     */
    override fun instanceId(instanceId: String) {
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-networkbordergroup)
     * @param networkBorderGroup A unique set of Availability Zones, Local Zones, or Wavelength
     * Zones from which AWS advertises IP addresses. 
     */
    override fun networkBorderGroup(networkBorderGroup: String) {
      cdkBuilder.networkBorderGroup(networkBorderGroup)
    }

    /**
     * The ID of an address pool that you own.
     *
     * Use this parameter to let Amazon EC2 select an address from the address pool.
     *
     *
     * Updates to the `PublicIpv4Pool` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-publicipv4pool)
     * @param publicIpv4Pool The ID of an address pool that you own. 
     */
    override fun publicIpv4Pool(publicIpv4Pool: String) {
      cdkBuilder.publicIpv4Pool(publicIpv4Pool)
    }

    /**
     * Any tags assigned to the Elastic IP address.
     *
     *
     * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-tags)
     * @param tags Any tags assigned to the Elastic IP address. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Any tags assigned to the Elastic IP address.
     *
     *
     * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-tags)
     * @param tags Any tags assigned to the Elastic IP address. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The Elastic IP address you are accepting for transfer.
     *
     * You can only accept one transferred address. For more information on Elastic IP address
     * transfers, see [Transfer Elastic IP
     * addresses](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#transfer-EIPs-intro)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-transferaddress)
     * @param transferAddress The Elastic IP address you are accepting for transfer. 
     */
    override fun transferAddress(transferAddress: String) {
      cdkBuilder.transferAddress(transferAddress)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEIP = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEIP {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEIP(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEIP): CfnEIP =
        CfnEIP(cdkObject)

    internal fun unwrap(wrapped: CfnEIP): software.amazon.awscdk.services.ec2.CfnEIP =
        wrapped.cdkObject
  }
}
