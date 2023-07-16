@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps

@CdkDslMarker
public class CfnNetworkInterfacePropsDsl {
  private val cdkBuilder: CfnNetworkInterfaceProps.Builder = CfnNetworkInterfaceProps.builder()

  private val _groupSet: MutableList<String> = mutableListOf()

  private val _ipv6Addresses: MutableList<Any> = mutableListOf()

  private val _privateIpAddresses: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun groupSet(vararg groupSet: String) {
    _groupSet.addAll(listOf(*groupSet))
  }

  public fun groupSet(groupSet: Collection<String>) {
    _groupSet.addAll(groupSet)
  }

  public fun interfaceType(interfaceType: String) {
    cdkBuilder.interfaceType(interfaceType)
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

  public fun privateIpAddress(privateIpAddress: String) {
    cdkBuilder.privateIpAddress(privateIpAddress)
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

  public fun sourceDestCheck(sourceDestCheck: Boolean) {
    cdkBuilder.sourceDestCheck(sourceDestCheck)
  }

  public fun sourceDestCheck(sourceDestCheck: IResolvable) {
    cdkBuilder.sourceDestCheck(sourceDestCheck)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnNetworkInterfaceProps {
    if(_groupSet.isNotEmpty()) cdkBuilder.groupSet(_groupSet)
    if(_ipv6Addresses.isNotEmpty()) cdkBuilder.ipv6Addresses(_ipv6Addresses)
    if(_privateIpAddresses.isNotEmpty()) cdkBuilder.privateIpAddresses(_privateIpAddresses)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
