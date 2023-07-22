@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnNatGatewayProps

/**
 * Properties for defining a `CfnNatGateway`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNatGatewayProps cfnNatGatewayProps = CfnNatGatewayProps.builder()
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
@CdkDslMarker
public class CfnNatGatewayPropsDsl {
  private val cdkBuilder: CfnNatGatewayProps.Builder = CfnNatGatewayProps.builder()

  private val _secondaryAllocationIds: MutableList<String> = mutableListOf()

  private val _secondaryPrivateIpAddresses: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param allocationId [Public NAT gateway only] The allocation ID of the Elastic IP address
   * that's associated with the NAT gateway.
   * This property is required for a public NAT gateway and cannot be specified with a private NAT
   * gateway.
   */
  public fun allocationId(allocationId: String) {
    cdkBuilder.allocationId(allocationId)
  }

  /**
   * @param connectivityType Indicates whether the NAT gateway supports public or private
   * connectivity.
   * The default is public connectivity.
   */
  public fun connectivityType(connectivityType: String) {
    cdkBuilder.connectivityType(connectivityType)
  }

  /**
   * @param maxDrainDurationSeconds The maximum amount of time to wait (in seconds) before forcibly
   * releasing the IP addresses if connections are still in progress.
   * Default value is 350 seconds.
   */
  public fun maxDrainDurationSeconds(maxDrainDurationSeconds: Number) {
    cdkBuilder.maxDrainDurationSeconds(maxDrainDurationSeconds)
  }

  /**
   * @param privateIpAddress The private IPv4 address to assign to the NAT gateway.
   * If you don't provide an address, a private IPv4 address will be automatically assigned.
   */
  public fun privateIpAddress(privateIpAddress: String) {
    cdkBuilder.privateIpAddress(privateIpAddress)
  }

  /**
   * @param secondaryAllocationIds Secondary EIP allocation IDs.
   * For more information, see [Create a NAT
   * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
   * in the *Amazon VPC User Guide* .
   */
  public fun secondaryAllocationIds(vararg secondaryAllocationIds: String) {
    _secondaryAllocationIds.addAll(listOf(*secondaryAllocationIds))
  }

  /**
   * @param secondaryAllocationIds Secondary EIP allocation IDs.
   * For more information, see [Create a NAT
   * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
   * in the *Amazon VPC User Guide* .
   */
  public fun secondaryAllocationIds(secondaryAllocationIds: Collection<String>) {
    _secondaryAllocationIds.addAll(secondaryAllocationIds)
  }

  /**
   * @param secondaryPrivateIpAddressCount [Private NAT gateway only] The number of secondary
   * private IPv4 addresses you want to assign to the NAT gateway.
   * For more information about secondary addresses, see [Create a NAT
   * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
   * in the *Amazon Virtual Private Cloud User Guide* .
   *
   *
   * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
   * time.
   */
  public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
    cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
  }

  /**
   * @param secondaryPrivateIpAddresses Secondary private IPv4 addresses.
   * For more information about secondary addresses, see [Create a NAT
   * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
   * in the *Amazon Virtual Private Cloud User Guide* .
   *
   *
   * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
   * time.
   */
  public fun secondaryPrivateIpAddresses(vararg secondaryPrivateIpAddresses: String) {
    _secondaryPrivateIpAddresses.addAll(listOf(*secondaryPrivateIpAddresses))
  }

  /**
   * @param secondaryPrivateIpAddresses Secondary private IPv4 addresses.
   * For more information about secondary addresses, see [Create a NAT
   * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
   * in the *Amazon Virtual Private Cloud User Guide* .
   *
   *
   * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
   * time.
   */
  public fun secondaryPrivateIpAddresses(secondaryPrivateIpAddresses: Collection<String>) {
    _secondaryPrivateIpAddresses.addAll(secondaryPrivateIpAddresses)
  }

  /**
   * @param subnetId The ID of the subnet in which the NAT gateway is located. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  /**
   * @param tags The tags for the NAT gateway.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags for the NAT gateway.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnNatGatewayProps {
    if(_secondaryAllocationIds.isNotEmpty())
        cdkBuilder.secondaryAllocationIds(_secondaryAllocationIds)
    if(_secondaryPrivateIpAddresses.isNotEmpty())
        cdkBuilder.secondaryPrivateIpAddresses(_secondaryPrivateIpAddresses)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
