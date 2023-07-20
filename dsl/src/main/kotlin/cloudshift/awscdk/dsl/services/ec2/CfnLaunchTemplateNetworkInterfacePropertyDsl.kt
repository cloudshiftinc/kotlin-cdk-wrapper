@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLaunchTemplateNetworkInterfacePropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.NetworkInterfaceProperty.Builder =
        CfnLaunchTemplate.NetworkInterfaceProperty.builder()

    private val _groups: MutableList<String> = mutableListOf()

    private val _ipv4Prefixes: MutableList<Any> = mutableListOf()

    private val _ipv6Addresses: MutableList<Any> = mutableListOf()

    private val _ipv6Prefixes: MutableList<Any> = mutableListOf()

    private val _privateIpAddresses: MutableList<Any> = mutableListOf()

    public fun associateCarrierIpAddress(associateCarrierIpAddress: Boolean) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress)
    }

    public fun associateCarrierIpAddress(associateCarrierIpAddress: IResolvable) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress)
    }

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

    public fun interfaceType(interfaceType: String) {
        cdkBuilder.interfaceType(interfaceType)
    }

    public fun ipv4PrefixCount(ipv4PrefixCount: Number) {
        cdkBuilder.ipv4PrefixCount(ipv4PrefixCount)
    }

    public fun ipv4Prefixes(vararg ipv4Prefixes: Any) {
        _ipv4Prefixes.addAll(listOf(*ipv4Prefixes))
    }

    public fun ipv4Prefixes(ipv4Prefixes: Collection<Any>) {
        _ipv4Prefixes.addAll(ipv4Prefixes)
    }

    public fun ipv4Prefixes(ipv4Prefixes: IResolvable) {
        cdkBuilder.ipv4Prefixes(ipv4Prefixes)
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

    public fun ipv6PrefixCount(ipv6PrefixCount: Number) {
        cdkBuilder.ipv6PrefixCount(ipv6PrefixCount)
    }

    public fun ipv6Prefixes(vararg ipv6Prefixes: Any) {
        _ipv6Prefixes.addAll(listOf(*ipv6Prefixes))
    }

    public fun ipv6Prefixes(ipv6Prefixes: Collection<Any>) {
        _ipv6Prefixes.addAll(ipv6Prefixes)
    }

    public fun ipv6Prefixes(ipv6Prefixes: IResolvable) {
        cdkBuilder.ipv6Prefixes(ipv6Prefixes)
    }

    public fun networkCardIndex(networkCardIndex: Number) {
        cdkBuilder.networkCardIndex(networkCardIndex)
    }

    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
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

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnLaunchTemplate.NetworkInterfaceProperty {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        if (_ipv4Prefixes.isNotEmpty()) cdkBuilder.ipv4Prefixes(_ipv4Prefixes)
        if (_ipv6Addresses.isNotEmpty()) cdkBuilder.ipv6Addresses(_ipv6Addresses)
        if (_ipv6Prefixes.isNotEmpty()) cdkBuilder.ipv6Prefixes(_ipv6Prefixes)
        if (_privateIpAddresses.isNotEmpty()) cdkBuilder.privateIpAddresses(_privateIpAddresses)
        return cdkBuilder.build()
    }
}
