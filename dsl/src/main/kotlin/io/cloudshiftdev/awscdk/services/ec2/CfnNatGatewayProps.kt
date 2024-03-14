package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnNatGatewayProps {
  /**
   * [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with
   * the NAT gateway.
   *
   * This property is required for a public NAT gateway and cannot be specified with a private NAT
   * gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-allocationid)
   */
  public fun allocationId(): String? = unwrap(this).getAllocationId()

  /**
   * Indicates whether the NAT gateway supports public or private connectivity.
   *
   * The default is public connectivity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-connectivitytype)
   */
  public fun connectivityType(): String? = unwrap(this).getConnectivityType()

  /**
   * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if
   * connections are still in progress.
   *
   * Default value is 350 seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-maxdraindurationseconds)
   */
  public fun maxDrainDurationSeconds(): Number? = unwrap(this).getMaxDrainDurationSeconds()

  /**
   * The private IPv4 address to assign to the NAT gateway.
   *
   * If you don't provide an address, a private IPv4 address will be automatically assigned.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-privateipaddress)
   */
  public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  /**
   * Secondary EIP allocation IDs.
   *
   * For more information, see [Create a NAT
   * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
   * in the *Amazon VPC User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryallocationids)
   */
  public fun secondaryAllocationIds(): List<String> = unwrap(this).getSecondaryAllocationIds() ?:
      emptyList()

  /**
   * [Private NAT gateway only] The number of secondary private IPv4 addresses you want to assign to
   * the NAT gateway.
   *
   * For more information about secondary addresses, see [Create a NAT
   * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
   * in the *Amazon Virtual Private Cloud User Guide* .
   *
   * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
   * time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryprivateipaddresscount)
   */
  public fun secondaryPrivateIpAddressCount(): Number? =
      unwrap(this).getSecondaryPrivateIpAddressCount()

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
   */
  public fun secondaryPrivateIpAddresses(): List<String> =
      unwrap(this).getSecondaryPrivateIpAddresses() ?: emptyList()

  /**
   * The ID of the subnet in which the NAT gateway is located.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-subnetid)
   */
  public fun subnetId(): String

  /**
   * The tags for the NAT gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnNatGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allocationId [Public NAT gateway only] The allocation ID of the Elastic IP address
     * that's associated with the NAT gateway.
     * This property is required for a public NAT gateway and cannot be specified with a private NAT
     * gateway.
     */
    public fun allocationId(allocationId: String)

    /**
     * @param connectivityType Indicates whether the NAT gateway supports public or private
     * connectivity.
     * The default is public connectivity.
     */
    public fun connectivityType(connectivityType: String)

    /**
     * @param maxDrainDurationSeconds The maximum amount of time to wait (in seconds) before
     * forcibly releasing the IP addresses if connections are still in progress.
     * Default value is 350 seconds.
     */
    public fun maxDrainDurationSeconds(maxDrainDurationSeconds: Number)

    /**
     * @param privateIpAddress The private IPv4 address to assign to the NAT gateway.
     * If you don't provide an address, a private IPv4 address will be automatically assigned.
     */
    public fun privateIpAddress(privateIpAddress: String)

    /**
     * @param secondaryAllocationIds Secondary EIP allocation IDs.
     * For more information, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon VPC User Guide* .
     */
    public fun secondaryAllocationIds(secondaryAllocationIds: List<String>)

    /**
     * @param secondaryAllocationIds Secondary EIP allocation IDs.
     * For more information, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon VPC User Guide* .
     */
    public fun secondaryAllocationIds(vararg secondaryAllocationIds: String)

    /**
     * @param secondaryPrivateIpAddressCount [Private NAT gateway only] The number of secondary
     * private IPv4 addresses you want to assign to the NAT gateway.
     * For more information about secondary addresses, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     */
    public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number)

    /**
     * @param secondaryPrivateIpAddresses Secondary private IPv4 addresses.
     * For more information about secondary addresses, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     */
    public fun secondaryPrivateIpAddresses(secondaryPrivateIpAddresses: List<String>)

    /**
     * @param secondaryPrivateIpAddresses Secondary private IPv4 addresses.
     * For more information about secondary addresses, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     */
    public fun secondaryPrivateIpAddresses(vararg secondaryPrivateIpAddresses: String)

    /**
     * @param subnetId The ID of the subnet in which the NAT gateway is located. 
     */
    public fun subnetId(subnetId: String)

    /**
     * @param tags The tags for the NAT gateway.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the NAT gateway.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNatGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNatGatewayProps.builder()

    /**
     * @param allocationId [Public NAT gateway only] The allocation ID of the Elastic IP address
     * that's associated with the NAT gateway.
     * This property is required for a public NAT gateway and cannot be specified with a private NAT
     * gateway.
     */
    override fun allocationId(allocationId: String) {
      cdkBuilder.allocationId(allocationId)
    }

    /**
     * @param connectivityType Indicates whether the NAT gateway supports public or private
     * connectivity.
     * The default is public connectivity.
     */
    override fun connectivityType(connectivityType: String) {
      cdkBuilder.connectivityType(connectivityType)
    }

    /**
     * @param maxDrainDurationSeconds The maximum amount of time to wait (in seconds) before
     * forcibly releasing the IP addresses if connections are still in progress.
     * Default value is 350 seconds.
     */
    override fun maxDrainDurationSeconds(maxDrainDurationSeconds: Number) {
      cdkBuilder.maxDrainDurationSeconds(maxDrainDurationSeconds)
    }

    /**
     * @param privateIpAddress The private IPv4 address to assign to the NAT gateway.
     * If you don't provide an address, a private IPv4 address will be automatically assigned.
     */
    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /**
     * @param secondaryAllocationIds Secondary EIP allocation IDs.
     * For more information, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon VPC User Guide* .
     */
    override fun secondaryAllocationIds(secondaryAllocationIds: List<String>) {
      cdkBuilder.secondaryAllocationIds(secondaryAllocationIds)
    }

    /**
     * @param secondaryAllocationIds Secondary EIP allocation IDs.
     * For more information, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon VPC User Guide* .
     */
    override fun secondaryAllocationIds(vararg secondaryAllocationIds: String): Unit =
        secondaryAllocationIds(secondaryAllocationIds.toList())

    /**
     * @param secondaryPrivateIpAddressCount [Private NAT gateway only] The number of secondary
     * private IPv4 addresses you want to assign to the NAT gateway.
     * For more information about secondary addresses, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     */
    override fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
      cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
    }

    /**
     * @param secondaryPrivateIpAddresses Secondary private IPv4 addresses.
     * For more information about secondary addresses, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     */
    override fun secondaryPrivateIpAddresses(secondaryPrivateIpAddresses: List<String>) {
      cdkBuilder.secondaryPrivateIpAddresses(secondaryPrivateIpAddresses)
    }

    /**
     * @param secondaryPrivateIpAddresses Secondary private IPv4 addresses.
     * For more information about secondary addresses, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     */
    override fun secondaryPrivateIpAddresses(vararg secondaryPrivateIpAddresses: String): Unit =
        secondaryPrivateIpAddresses(secondaryPrivateIpAddresses.toList())

    /**
     * @param subnetId The ID of the subnet in which the NAT gateway is located. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tags The tags for the NAT gateway.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the NAT gateway.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNatGatewayProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNatGatewayProps,
  ) : CdkObject(cdkObject), CfnNatGatewayProps {
    /**
     * [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with
     * the NAT gateway.
     *
     * This property is required for a public NAT gateway and cannot be specified with a private NAT
     * gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-allocationid)
     */
    override fun allocationId(): String? = unwrap(this).getAllocationId()

    /**
     * Indicates whether the NAT gateway supports public or private connectivity.
     *
     * The default is public connectivity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-connectivitytype)
     */
    override fun connectivityType(): String? = unwrap(this).getConnectivityType()

    /**
     * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if
     * connections are still in progress.
     *
     * Default value is 350 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-maxdraindurationseconds)
     */
    override fun maxDrainDurationSeconds(): Number? = unwrap(this).getMaxDrainDurationSeconds()

    /**
     * The private IPv4 address to assign to the NAT gateway.
     *
     * If you don't provide an address, a private IPv4 address will be automatically assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-privateipaddress)
     */
    override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    /**
     * Secondary EIP allocation IDs.
     *
     * For more information, see [Create a NAT
     * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryallocationids)
     */
    override fun secondaryAllocationIds(): List<String> = unwrap(this).getSecondaryAllocationIds()
        ?: emptyList()

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
     */
    override fun secondaryPrivateIpAddressCount(): Number? =
        unwrap(this).getSecondaryPrivateIpAddressCount()

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
     */
    override fun secondaryPrivateIpAddresses(): List<String> =
        unwrap(this).getSecondaryPrivateIpAddresses() ?: emptyList()

    /**
     * The ID of the subnet in which the NAT gateway is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()

    /**
     * The tags for the NAT gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNatGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNatGatewayProps):
        CfnNatGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNatGatewayProps):
        software.amazon.awscdk.services.ec2.CfnNatGatewayProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnNatGatewayProps
  }
}
