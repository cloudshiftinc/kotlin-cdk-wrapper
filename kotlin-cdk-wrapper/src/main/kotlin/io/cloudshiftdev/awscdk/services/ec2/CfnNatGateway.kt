@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a network address translation (NAT) gateway in the specified subnet.
 *
 * You can create either a public NAT gateway or a private NAT gateway. The default is a public NAT
 * gateway. If you create a public NAT gateway, you must specify an elastic IP address.
 *
 * With a NAT gateway, instances in a private subnet can connect to the internet, other AWS
 * services, or an on-premises network using the IP address of the NAT gateway. For more information,
 * see [NAT gateways](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html) in the
 * *Amazon VPC User Guide* .
 *
 * If you add a default route ( `AWS::EC2::Route` resource) that points to a NAT gateway, specify
 * the NAT gateway ID for the route's `NatGatewayId` property.
 *
 *
 * When you associate an Elastic IP address or secondary Elastic IP address with a public NAT
 * gateway, the network border group of the Elastic IP address must match the network border group of
 * the Availability Zone (AZ) that the public NAT gateway is in. Otherwise, the NAT gateway fails to
 * launch. You can see the network border group for the AZ by viewing the details of the subnet.
 * Similarly, you can view the network border group for the Elastic IP address by viewing its details.
 * For more information, see [Allocate an Elastic IP
 * address](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#allocate-eip) in the *Amazon
 * VPC User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNatGateway cfnNatGateway = CfnNatGateway.Builder.create(this, "MyCfnNatGateway")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .allocationId("allocationId")
 * .connectivityType("connectivityType")
 * .maxDrainDurationSeconds(123)
 * .privateIpAddress("privateIpAddress")
 * .secondaryAllocationIds(List.of("secondaryAllocationIds"))
 * .secondaryPrivateIpAddressCount(123)
 * .secondaryPrivateIpAddresses(List.of("secondaryPrivateIpAddresses"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html)
 */
public open class CfnNatGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnNatGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNatGatewayProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnNatGateway(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnNatGatewayProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNatGatewayProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNatGatewayProps(props)
  )

  /**
   * [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with
   * the NAT gateway.
   */
  public open fun allocationId(): String? = unwrap(this).getAllocationId()

  /**
   * [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with
   * the NAT gateway.
   */
  public open fun allocationId(`value`: String) {
    unwrap(this).setAllocationId(`value`)
  }

  /**
   * The ID of the NAT gateway.
   */
  public open fun attrNatGatewayId(): String = unwrap(this).getAttrNatGatewayId()

  /**
   * Indicates whether the NAT gateway supports public or private connectivity.
   */
  public open fun connectivityType(): String? = unwrap(this).getConnectivityType()

  /**
   * Indicates whether the NAT gateway supports public or private connectivity.
   */
  public open fun connectivityType(`value`: String) {
    unwrap(this).setConnectivityType(`value`)
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
   * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if
   * connections are still in progress.
   */
  public open fun maxDrainDurationSeconds(): Number? = unwrap(this).getMaxDrainDurationSeconds()

  /**
   * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if
   * connections are still in progress.
   */
  public open fun maxDrainDurationSeconds(`value`: Number) {
    unwrap(this).setMaxDrainDurationSeconds(`value`)
  }

  /**
   * The private IPv4 address to assign to the NAT gateway.
   */
  public open fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  /**
   * The private IPv4 address to assign to the NAT gateway.
   */
  public open fun privateIpAddress(`value`: String) {
    unwrap(this).setPrivateIpAddress(`value`)
  }

  /**
   * Secondary EIP allocation IDs.
   */
  public open fun secondaryAllocationIds(): List<String> = unwrap(this).getSecondaryAllocationIds()
      ?: emptyList()

  /**
   * Secondary EIP allocation IDs.
   */
  public open fun secondaryAllocationIds(`value`: List<String>) {
    unwrap(this).setSecondaryAllocationIds(`value`)
  }

  /**
   * Secondary EIP allocation IDs.
   */
  public open fun secondaryAllocationIds(vararg `value`: String): Unit =
      secondaryAllocationIds(`value`.toList())

  /**
   * [Private NAT gateway only] The number of secondary private IPv4 addresses you want to assign to
   * the NAT gateway.
   */
  public open fun secondaryPrivateIpAddressCount(): Number? =
      unwrap(this).getSecondaryPrivateIpAddressCount()

  /**
   * [Private NAT gateway only] The number of secondary private IPv4 addresses you want to assign to
   * the NAT gateway.
   */
  public open fun secondaryPrivateIpAddressCount(`value`: Number) {
    unwrap(this).setSecondaryPrivateIpAddressCount(`value`)
  }

  /**
   * Secondary private IPv4 addresses.
   */
  public open fun secondaryPrivateIpAddresses(): List<String> =
      unwrap(this).getSecondaryPrivateIpAddresses() ?: emptyList()

  /**
   * Secondary private IPv4 addresses.
   */
  public open fun secondaryPrivateIpAddresses(`value`: List<String>) {
    unwrap(this).setSecondaryPrivateIpAddresses(`value`)
  }

  /**
   * Secondary private IPv4 addresses.
   */
  public open fun secondaryPrivateIpAddresses(vararg `value`: String): Unit =
      secondaryPrivateIpAddresses(`value`.toList())

  /**
   * The ID of the subnet in which the NAT gateway is located.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet in which the NAT gateway is located.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the NAT gateway.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the NAT gateway.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the NAT gateway.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnNatGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with
     * the NAT gateway.
     *
     * This property is required for a public NAT gateway and cannot be specified with a private NAT
     * gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-allocationid)
     * @param allocationId [Public NAT gateway only] The allocation ID of the Elastic IP address
     * that's associated with the NAT gateway. 
     */
    public fun allocationId(allocationId: String)

    /**
     * Indicates whether the NAT gateway supports public or private connectivity.
     *
     * The default is public connectivity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-connectivitytype)
     * @param connectivityType Indicates whether the NAT gateway supports public or private
     * connectivity. 
     */
    public fun connectivityType(connectivityType: String)

    /**
     * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if
     * connections are still in progress.
     *
     * Default value is 350 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-maxdraindurationseconds)
     * @param maxDrainDurationSeconds The maximum amount of time to wait (in seconds) before
     * forcibly releasing the IP addresses if connections are still in progress. 
     */
    public fun maxDrainDurationSeconds(maxDrainDurationSeconds: Number)

    /**
     * The private IPv4 address to assign to the NAT gateway.
     *
     * If you don't provide an address, a private IPv4 address will be automatically assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-privateipaddress)
     * @param privateIpAddress The private IPv4 address to assign to the NAT gateway. 
     */
    public fun privateIpAddress(privateIpAddress: String)

    /**
     * Secondary EIP allocation IDs.
     *
     * For more information, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryallocationids)
     * @param secondaryAllocationIds Secondary EIP allocation IDs. 
     */
    public fun secondaryAllocationIds(secondaryAllocationIds: List<String>)

    /**
     * Secondary EIP allocation IDs.
     *
     * For more information, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryallocationids)
     * @param secondaryAllocationIds Secondary EIP allocation IDs. 
     */
    public fun secondaryAllocationIds(vararg secondaryAllocationIds: String)

    /**
     * [Private NAT gateway only] The number of secondary private IPv4 addresses you want to assign
     * to the NAT gateway.
     *
     * For more information about secondary addresses, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryprivateipaddresscount)
     * @param secondaryPrivateIpAddressCount [Private NAT gateway only] The number of secondary
     * private IPv4 addresses you want to assign to the NAT gateway. 
     */
    public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number)

    /**
     * Secondary private IPv4 addresses.
     *
     * For more information about secondary addresses, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryprivateipaddresses)
     * @param secondaryPrivateIpAddresses Secondary private IPv4 addresses. 
     */
    public fun secondaryPrivateIpAddresses(secondaryPrivateIpAddresses: List<String>)

    /**
     * Secondary private IPv4 addresses.
     *
     * For more information about secondary addresses, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryprivateipaddresses)
     * @param secondaryPrivateIpAddresses Secondary private IPv4 addresses. 
     */
    public fun secondaryPrivateIpAddresses(vararg secondaryPrivateIpAddresses: String)

    /**
     * The ID of the subnet in which the NAT gateway is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-subnetid)
     * @param subnetId The ID of the subnet in which the NAT gateway is located. 
     */
    public fun subnetId(subnetId: String)

    /**
     * The tags for the NAT gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-tags)
     * @param tags The tags for the NAT gateway. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the NAT gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-tags)
     * @param tags The tags for the NAT gateway. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNatGateway.Builder =
        software.amazon.awscdk.services.ec2.CfnNatGateway.Builder.create(scope, id)

    /**
     * [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with
     * the NAT gateway.
     *
     * This property is required for a public NAT gateway and cannot be specified with a private NAT
     * gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-allocationid)
     * @param allocationId [Public NAT gateway only] The allocation ID of the Elastic IP address
     * that's associated with the NAT gateway. 
     */
    override fun allocationId(allocationId: String) {
      cdkBuilder.allocationId(allocationId)
    }

    /**
     * Indicates whether the NAT gateway supports public or private connectivity.
     *
     * The default is public connectivity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-connectivitytype)
     * @param connectivityType Indicates whether the NAT gateway supports public or private
     * connectivity. 
     */
    override fun connectivityType(connectivityType: String) {
      cdkBuilder.connectivityType(connectivityType)
    }

    /**
     * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if
     * connections are still in progress.
     *
     * Default value is 350 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-maxdraindurationseconds)
     * @param maxDrainDurationSeconds The maximum amount of time to wait (in seconds) before
     * forcibly releasing the IP addresses if connections are still in progress. 
     */
    override fun maxDrainDurationSeconds(maxDrainDurationSeconds: Number) {
      cdkBuilder.maxDrainDurationSeconds(maxDrainDurationSeconds)
    }

    /**
     * The private IPv4 address to assign to the NAT gateway.
     *
     * If you don't provide an address, a private IPv4 address will be automatically assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-privateipaddress)
     * @param privateIpAddress The private IPv4 address to assign to the NAT gateway. 
     */
    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /**
     * Secondary EIP allocation IDs.
     *
     * For more information, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryallocationids)
     * @param secondaryAllocationIds Secondary EIP allocation IDs. 
     */
    override fun secondaryAllocationIds(secondaryAllocationIds: List<String>) {
      cdkBuilder.secondaryAllocationIds(secondaryAllocationIds)
    }

    /**
     * Secondary EIP allocation IDs.
     *
     * For more information, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryallocationids)
     * @param secondaryAllocationIds Secondary EIP allocation IDs. 
     */
    override fun secondaryAllocationIds(vararg secondaryAllocationIds: String): Unit =
        secondaryAllocationIds(secondaryAllocationIds.toList())

    /**
     * [Private NAT gateway only] The number of secondary private IPv4 addresses you want to assign
     * to the NAT gateway.
     *
     * For more information about secondary addresses, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryprivateipaddresscount)
     * @param secondaryPrivateIpAddressCount [Private NAT gateway only] The number of secondary
     * private IPv4 addresses you want to assign to the NAT gateway. 
     */
    override fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
      cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
    }

    /**
     * Secondary private IPv4 addresses.
     *
     * For more information about secondary addresses, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryprivateipaddresses)
     * @param secondaryPrivateIpAddresses Secondary private IPv4 addresses. 
     */
    override fun secondaryPrivateIpAddresses(secondaryPrivateIpAddresses: List<String>) {
      cdkBuilder.secondaryPrivateIpAddresses(secondaryPrivateIpAddresses)
    }

    /**
     * Secondary private IPv4 addresses.
     *
     * For more information about secondary addresses, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryprivateipaddresses)
     * @param secondaryPrivateIpAddresses Secondary private IPv4 addresses. 
     */
    override fun secondaryPrivateIpAddresses(vararg secondaryPrivateIpAddresses: String): Unit =
        secondaryPrivateIpAddresses(secondaryPrivateIpAddresses.toList())

    /**
     * The ID of the subnet in which the NAT gateway is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-subnetid)
     * @param subnetId The ID of the subnet in which the NAT gateway is located. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * The tags for the NAT gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-tags)
     * @param tags The tags for the NAT gateway. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the NAT gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-tags)
     * @param tags The tags for the NAT gateway. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNatGateway = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnNatGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNatGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNatGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNatGateway): CfnNatGateway =
        CfnNatGateway(cdkObject)

    internal fun unwrap(wrapped: CfnNatGateway): software.amazon.awscdk.services.ec2.CfnNatGateway =
        wrapped.cdkObject
  }
}
