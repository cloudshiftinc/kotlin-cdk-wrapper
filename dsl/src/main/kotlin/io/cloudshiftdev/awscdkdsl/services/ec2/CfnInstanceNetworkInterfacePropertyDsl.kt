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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies a network interface that is to be attached to an instance.
 *
 * You can create a network interface when launching an instance. For an example, see the
 * [AWS::EC2::Instance examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#aws-properties-ec2-instance--examples--Automatically_assign_a_public_IP_address)
 * .
 *
 * Alternatively, you can attach an existing network interface when launching an instance. For an
 * example, see the
 * [AWS::EC2:NetworkInterface examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#aws-resource-ec2-networkinterface--examples)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
 * .deviceIndex("deviceIndex")
 * // the properties below are optional
 * .associateCarrierIpAddress(false)
 * .associatePublicIpAddress(false)
 * .deleteOnTermination(false)
 * .description("description")
 * .groupSet(List.of("groupSet"))
 * .ipv6AddressCount(123)
 * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
 * .ipv6Address("ipv6Address")
 * .build()))
 * .networkInterfaceId("networkInterfaceId")
 * .privateIpAddress("privateIpAddress")
 * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
 * .primary(false)
 * .privateIpAddress("privateIpAddress")
 * .build()))
 * .secondaryPrivateIpAddressCount(123)
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html)
 */
@CdkDslMarker
public class CfnInstanceNetworkInterfacePropertyDsl {
    private val cdkBuilder: CfnInstance.NetworkInterfaceProperty.Builder =
        CfnInstance.NetworkInterfaceProperty.builder()

    private val _groupSet: MutableList<String> = mutableListOf()

    private val _ipv6Addresses: MutableList<Any> = mutableListOf()

    private val _privateIpAddresses: MutableList<Any> = mutableListOf()

    /**
     * @param associateCarrierIpAddress Indicates whether to assign a carrier IP address to the
     *   network interface. You can only assign a carrier IP address to a network interface that is
     *   in a subnet in a Wavelength Zone. For more information about carrier IP addresses, see
     *   [Carrier IP address](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
     *   in the *AWS Wavelength Developer Guide* .
     */
    public fun associateCarrierIpAddress(associateCarrierIpAddress: Boolean) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress)
    }

    /**
     * @param associateCarrierIpAddress Indicates whether to assign a carrier IP address to the
     *   network interface. You can only assign a carrier IP address to a network interface that is
     *   in a subnet in a Wavelength Zone. For more information about carrier IP addresses, see
     *   [Carrier IP address](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
     *   in the *AWS Wavelength Developer Guide* .
     */
    public fun associateCarrierIpAddress(associateCarrierIpAddress: IResolvable) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress)
    }

    /**
     * @param associatePublicIpAddress Indicates whether to assign a public IPv4 address to an
     *   instance. Applies only if creating a network interface when launching an instance. The
     *   network interface must be the primary network interface. If launching into a default
     *   subnet, the default value is `true` .
     *
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4
     * Address* tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * @param associatePublicIpAddress Indicates whether to assign a public IPv4 address to an
     *   instance. Applies only if creating a network interface when launching an instance. The
     *   network interface must be the primary network interface. If launching into a default
     *   subnet, the default value is `true` .
     *
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4
     * Address* tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * @param deleteOnTermination Indicates whether the network interface is deleted when the
     *   instance is terminated. Applies only if creating a network interface when launching an
     *   instance.
     */
    public fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /**
     * @param deleteOnTermination Indicates whether the network interface is deleted when the
     *   instance is terminated. Applies only if creating a network interface when launching an
     *   instance.
     */
    public fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /**
     * @param description The description of the network interface. Applies only if creating a
     *   network interface when launching an instance.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param deviceIndex The position of the network interface in the attachment order. A primary
     *   network interface has a device index of 0.
     *
     * If you create a network interface when launching an instance, you must specify the device
     * index.
     */
    public fun deviceIndex(deviceIndex: String) {
        cdkBuilder.deviceIndex(deviceIndex)
    }

    /**
     * @param groupSet The IDs of the security groups for the network interface. Applies only if
     *   creating a network interface when launching an instance.
     */
    public fun groupSet(vararg groupSet: String) {
        _groupSet.addAll(listOf(*groupSet))
    }

    /**
     * @param groupSet The IDs of the security groups for the network interface. Applies only if
     *   creating a network interface when launching an instance.
     */
    public fun groupSet(groupSet: Collection<String>) {
        _groupSet.addAll(groupSet)
    }

    /**
     * @param ipv6AddressCount A number of IPv6 addresses to assign to the network interface. Amazon
     *   EC2 chooses the IPv6 addresses from the range of the subnet. You cannot specify this option
     *   and the option to assign specific IPv6 addresses in the same request. You can specify this
     *   option if you've specified a minimum number of instances to launch.
     */
    public fun ipv6AddressCount(ipv6AddressCount: Number) {
        cdkBuilder.ipv6AddressCount(ipv6AddressCount)
    }

    /**
     * @param ipv6Addresses The IPv6 addresses to assign to the network interface. You cannot
     *   specify this option and the option to assign a number of IPv6 addresses in the same
     *   request. You cannot specify this option if you've specified a minimum number of instances
     *   to launch.
     */
    public fun ipv6Addresses(vararg ipv6Addresses: Any) {
        _ipv6Addresses.addAll(listOf(*ipv6Addresses))
    }

    /**
     * @param ipv6Addresses The IPv6 addresses to assign to the network interface. You cannot
     *   specify this option and the option to assign a number of IPv6 addresses in the same
     *   request. You cannot specify this option if you've specified a minimum number of instances
     *   to launch.
     */
    public fun ipv6Addresses(ipv6Addresses: Collection<Any>) {
        _ipv6Addresses.addAll(ipv6Addresses)
    }

    /**
     * @param ipv6Addresses The IPv6 addresses to assign to the network interface. You cannot
     *   specify this option and the option to assign a number of IPv6 addresses in the same
     *   request. You cannot specify this option if you've specified a minimum number of instances
     *   to launch.
     */
    public fun ipv6Addresses(ipv6Addresses: IResolvable) {
        cdkBuilder.ipv6Addresses(ipv6Addresses)
    }

    /**
     * @param networkInterfaceId The ID of the network interface, when attaching an existing network
     *   interface.
     */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * @param privateIpAddress The private IPv4 address of the network interface. Applies only if
     *   creating a network interface when launching an instance.
     */
    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /**
     * @param privateIpAddresses One or more private IPv4 addresses to assign to the network
     *   interface. Only one private IPv4 address can be designated as primary.
     */
    public fun privateIpAddresses(vararg privateIpAddresses: Any) {
        _privateIpAddresses.addAll(listOf(*privateIpAddresses))
    }

    /**
     * @param privateIpAddresses One or more private IPv4 addresses to assign to the network
     *   interface. Only one private IPv4 address can be designated as primary.
     */
    public fun privateIpAddresses(privateIpAddresses: Collection<Any>) {
        _privateIpAddresses.addAll(privateIpAddresses)
    }

    /**
     * @param privateIpAddresses One or more private IPv4 addresses to assign to the network
     *   interface. Only one private IPv4 address can be designated as primary.
     */
    public fun privateIpAddresses(privateIpAddresses: IResolvable) {
        cdkBuilder.privateIpAddresses(privateIpAddresses)
    }

    /**
     * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses. You
     *   can't specify this option and specify more than one private IP address using the private IP
     *   addresses option.
     */
    public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
        cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
    }

    /**
     * @param subnetId The ID of the subnet associated with the network interface. Applies only if
     *   creating a network interface when launching an instance.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnInstance.NetworkInterfaceProperty {
        if (_groupSet.isNotEmpty()) cdkBuilder.groupSet(_groupSet)
        if (_ipv6Addresses.isNotEmpty()) cdkBuilder.ipv6Addresses(_ipv6Addresses)
        if (_privateIpAddresses.isNotEmpty()) cdkBuilder.privateIpAddresses(_privateIpAddresses)
        return cdkBuilder.build()
    }
}
