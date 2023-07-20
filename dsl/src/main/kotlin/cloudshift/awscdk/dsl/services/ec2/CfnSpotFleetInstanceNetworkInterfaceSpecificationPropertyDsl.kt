@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetInstanceNetworkInterfaceSpecificationPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty.Builder =
      CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty.builder()

  private val _groups: MutableList<String> = mutableListOf()

  private val _ipv6Addresses: MutableList<Any> = mutableListOf()

  private val _privateIpAddresses: MutableList<Any> = mutableListOf()

  public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
    cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
  }

  public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
    cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
  }

  public fun deleteOnTermination(deleteOnTermination: Boolean) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  public fun deleteOnTermination(deleteOnTermination: IResolvable) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun deviceIndex(deviceIndex: Number) {
    cdkBuilder.deviceIndex(deviceIndex)
  }

  public fun groups(vararg groups: String) {
    _groups.addAll(listOf(*groups))
  }

  public fun groups(groups: Collection<String>) {
    _groups.addAll(groups)
  }

  public fun ipv6AddressCount(ipv6AddressCount: Number) {
    cdkBuilder.ipv6AddressCount(ipv6AddressCount)
  }

  public fun ipv6Addresses(vararg ipv6Addresses: Any) {
    _ipv6Addresses.addAll(listOf(*ipv6Addresses))
  }

  public fun ipv6Addresses(ipv6Addresses: Collection<Any>) {
    _ipv6Addresses.addAll(ipv6Addresses)
  }

  public fun ipv6Addresses(ipv6Addresses: IResolvable) {
    cdkBuilder.ipv6Addresses(ipv6Addresses)
  }

  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  public fun privateIpAddresses(vararg privateIpAddresses: Any) {
    _privateIpAddresses.addAll(listOf(*privateIpAddresses))
  }

  public fun privateIpAddresses(privateIpAddresses: Collection<Any>) {
    _privateIpAddresses.addAll(privateIpAddresses)
  }

  public fun privateIpAddresses(privateIpAddresses: IResolvable) {
    cdkBuilder.privateIpAddresses(privateIpAddresses)
  }

  public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
    cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty {
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    if(_ipv6Addresses.isNotEmpty()) cdkBuilder.ipv6Addresses(_ipv6Addresses)
    if(_privateIpAddresses.isNotEmpty()) cdkBuilder.privateIpAddresses(_privateIpAddresses)
    return cdkBuilder.build()
  }
}
