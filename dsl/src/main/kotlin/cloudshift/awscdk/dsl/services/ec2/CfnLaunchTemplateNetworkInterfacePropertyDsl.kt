@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Specifies the parameters for a network interface.
 *
 * `NetworkInterface` is a property of
 * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
 * .associateCarrierIpAddress(false)
 * .associatePublicIpAddress(false)
 * .deleteOnTermination(false)
 * .description("description")
 * .deviceIndex(123)
 * .groups(List.of("groups"))
 * .interfaceType("interfaceType")
 * .ipv4PrefixCount(123)
 * .ipv4Prefixes(List.of(Ipv4PrefixSpecificationProperty.builder()
 * .ipv4Prefix("ipv4Prefix")
 * .build()))
 * .ipv6AddressCount(123)
 * .ipv6Addresses(List.of(Ipv6AddProperty.builder()
 * .ipv6Address("ipv6Address")
 * .build()))
 * .ipv6PrefixCount(123)
 * .ipv6Prefixes(List.of(Ipv6PrefixSpecificationProperty.builder()
 * .ipv6Prefix("ipv6Prefix")
 * .build()))
 * .networkCardIndex(123)
 * .networkInterfaceId("networkInterfaceId")
 * .privateIpAddress("privateIpAddress")
 * .privateIpAddresses(List.of(PrivateIpAddProperty.builder()
 * .primary(false)
 * .privateIpAddress("privateIpAddress")
 * .build()))
 * .secondaryPrivateIpAddressCount(123)
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateNetworkInterfacePropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.NetworkInterfaceProperty.Builder =
        CfnLaunchTemplate.NetworkInterfaceProperty.builder()

    private val _groups: MutableList<String> = mutableListOf()

    private val _ipv4Prefixes: MutableList<Any> = mutableListOf()

    private val _ipv6Addresses: MutableList<Any> = mutableListOf()

    private val _ipv6Prefixes: MutableList<Any> = mutableListOf()

    private val _privateIpAddresses: MutableList<Any> = mutableListOf()

    /**
     * @param associateCarrierIpAddress Indicates whether to associate a Carrier IP address with
     *   eth0 for a new network interface. Use this option when you launch an instance in a
     *   Wavelength Zone and want to associate a Carrier IP address with the network interface. For
     *   more information about Carrier IP addresses, see
     *   [Carrier IP addresses](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
     *   in the *AWS Wavelength Developer Guide* .
     */
    public fun associateCarrierIpAddress(associateCarrierIpAddress: Boolean) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress)
    }

    /**
     * @param associateCarrierIpAddress Indicates whether to associate a Carrier IP address with
     *   eth0 for a new network interface. Use this option when you launch an instance in a
     *   Wavelength Zone and want to associate a Carrier IP address with the network interface. For
     *   more information about Carrier IP addresses, see
     *   [Carrier IP addresses](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
     *   in the *AWS Wavelength Developer Guide* .
     */
    public fun associateCarrierIpAddress(associateCarrierIpAddress: IResolvable) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress)
    }

    /**
     * @param associatePublicIpAddress Associates a public IPv4 address with eth0 for a new network
     *   interface.
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * @param associatePublicIpAddress Associates a public IPv4 address with eth0 for a new network
     *   interface.
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * @param deleteOnTermination Indicates whether the network interface is deleted when the
     *   instance is terminated.
     */
    public fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /**
     * @param deleteOnTermination Indicates whether the network interface is deleted when the
     *   instance is terminated.
     */
    public fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /** @param description A description for the network interface. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param deviceIndex The device index for the network interface attachment. */
    public fun deviceIndex(deviceIndex: Number) {
        cdkBuilder.deviceIndex(deviceIndex)
    }

    /** @param groups The IDs of one or more security groups. */
    public fun groups(vararg groups: String) {
        _groups.addAll(listOf(*groups))
    }

    /** @param groups The IDs of one or more security groups. */
    public fun groups(groups: Collection<String>) {
        _groups.addAll(groups)
    }

    /**
     * @param interfaceType The type of network interface. To create an Elastic Fabric Adapter
     *   (EFA), specify `efa` . For more information, see
     *   [Elastic Fabric Adapter](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html) in
     *   the *Amazon Elastic Compute Cloud User Guide* .
     *
     * If you are not creating an EFA, specify `interface` or omit this parameter.
     *
     * Valid values: `interface` | `efa`
     */
    public fun interfaceType(interfaceType: String) {
        cdkBuilder.interfaceType(interfaceType)
    }

    /**
     * @param ipv4PrefixCount The number of IPv4 prefixes to be automatically assigned to the
     *   network interface. You cannot use this option if you use the `Ipv4Prefix` option.
     */
    public fun ipv4PrefixCount(ipv4PrefixCount: Number) {
        cdkBuilder.ipv4PrefixCount(ipv4PrefixCount)
    }

    /**
     * @param ipv4Prefixes One or more IPv4 prefixes to be assigned to the network interface. You
     *   cannot use this option if you use the `Ipv4PrefixCount` option.
     */
    public fun ipv4Prefixes(vararg ipv4Prefixes: Any) {
        _ipv4Prefixes.addAll(listOf(*ipv4Prefixes))
    }

    /**
     * @param ipv4Prefixes One or more IPv4 prefixes to be assigned to the network interface. You
     *   cannot use this option if you use the `Ipv4PrefixCount` option.
     */
    public fun ipv4Prefixes(ipv4Prefixes: Collection<Any>) {
        _ipv4Prefixes.addAll(ipv4Prefixes)
    }

    /**
     * @param ipv4Prefixes One or more IPv4 prefixes to be assigned to the network interface. You
     *   cannot use this option if you use the `Ipv4PrefixCount` option.
     */
    public fun ipv4Prefixes(ipv4Prefixes: IResolvable) {
        cdkBuilder.ipv4Prefixes(ipv4Prefixes)
    }

    /**
     * @param ipv6AddressCount The number of IPv6 addresses to assign to a network interface. Amazon
     *   EC2 automatically selects the IPv6 addresses from the subnet range. You can't use this
     *   option if specifying specific IPv6 addresses.
     */
    public fun ipv6AddressCount(ipv6AddressCount: Number) {
        cdkBuilder.ipv6AddressCount(ipv6AddressCount)
    }

    /**
     * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
     *   your subnet. You can't use this option if you're specifying a number of IPv6 addresses.
     */
    public fun ipv6Addresses(vararg ipv6Addresses: Any) {
        _ipv6Addresses.addAll(listOf(*ipv6Addresses))
    }

    /**
     * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
     *   your subnet. You can't use this option if you're specifying a number of IPv6 addresses.
     */
    public fun ipv6Addresses(ipv6Addresses: Collection<Any>) {
        _ipv6Addresses.addAll(ipv6Addresses)
    }

    /**
     * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
     *   your subnet. You can't use this option if you're specifying a number of IPv6 addresses.
     */
    public fun ipv6Addresses(ipv6Addresses: IResolvable) {
        cdkBuilder.ipv6Addresses(ipv6Addresses)
    }

    /**
     * @param ipv6PrefixCount The number of IPv6 prefixes to be automatically assigned to the
     *   network interface. You cannot use this option if you use the `Ipv6Prefix` option.
     */
    public fun ipv6PrefixCount(ipv6PrefixCount: Number) {
        cdkBuilder.ipv6PrefixCount(ipv6PrefixCount)
    }

    /**
     * @param ipv6Prefixes One or more IPv6 prefixes to be assigned to the network interface. You
     *   cannot use this option if you use the `Ipv6PrefixCount` option.
     */
    public fun ipv6Prefixes(vararg ipv6Prefixes: Any) {
        _ipv6Prefixes.addAll(listOf(*ipv6Prefixes))
    }

    /**
     * @param ipv6Prefixes One or more IPv6 prefixes to be assigned to the network interface. You
     *   cannot use this option if you use the `Ipv6PrefixCount` option.
     */
    public fun ipv6Prefixes(ipv6Prefixes: Collection<Any>) {
        _ipv6Prefixes.addAll(ipv6Prefixes)
    }

    /**
     * @param ipv6Prefixes One or more IPv6 prefixes to be assigned to the network interface. You
     *   cannot use this option if you use the `Ipv6PrefixCount` option.
     */
    public fun ipv6Prefixes(ipv6Prefixes: IResolvable) {
        cdkBuilder.ipv6Prefixes(ipv6Prefixes)
    }

    /**
     * @param networkCardIndex The index of the network card. Some instance types support multiple
     *   network cards. The primary network interface must be assigned to network card index 0. The
     *   default is network card index 0.
     */
    public fun networkCardIndex(networkCardIndex: Number) {
        cdkBuilder.networkCardIndex(networkCardIndex)
    }

    /** @param networkInterfaceId The ID of the network interface. */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /** @param privateIpAddress The primary private IPv4 address of the network interface. */
    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /** @param privateIpAddresses One or more private IPv4 addresses. */
    public fun privateIpAddresses(vararg privateIpAddresses: Any) {
        _privateIpAddresses.addAll(listOf(*privateIpAddresses))
    }

    /** @param privateIpAddresses One or more private IPv4 addresses. */
    public fun privateIpAddresses(privateIpAddresses: Collection<Any>) {
        _privateIpAddresses.addAll(privateIpAddresses)
    }

    /** @param privateIpAddresses One or more private IPv4 addresses. */
    public fun privateIpAddresses(privateIpAddresses: IResolvable) {
        cdkBuilder.privateIpAddresses(privateIpAddresses)
    }

    /**
     * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses to
     *   assign to a network interface.
     */
    public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
        cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
    }

    /** @param subnetId The ID of the subnet for the network interface. */
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
