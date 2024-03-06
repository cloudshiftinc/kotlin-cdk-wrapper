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
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * Describes a network interface.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * InstanceNetworkInterfaceSpecificationProperty instanceNetworkInterfaceSpecificationProperty =
 * InstanceNetworkInterfaceSpecificationProperty.builder()
 * .associatePublicIpAddress(false)
 * .deleteOnTermination(false)
 * .description("description")
 * .deviceIndex(123)
 * .groups(List.of("groups"))
 * .ipv6AddressCount(123)
 * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
 * .ipv6Address("ipv6Address")
 * .build()))
 * .networkInterfaceId("networkInterfaceId")
 * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
 * .privateIpAddress("privateIpAddress")
 * // the properties below are optional
 * .primary(false)
 * .build()))
 * .secondaryPrivateIpAddressCount(123)
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html)
 */
@CdkDslMarker
public class CfnSpotFleetInstanceNetworkInterfaceSpecificationPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty.Builder =
        CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty.builder()

    private val _groups: MutableList<String> = mutableListOf()

    private val _ipv6Addresses: MutableList<Any> = mutableListOf()

    private val _privateIpAddresses: MutableList<Any> = mutableListOf()

    /**
     * @param associatePublicIpAddress Indicates whether to assign a public IPv4 address to an
     *   instance you launch in a VPC. The public IP address can only be assigned to a network
     *   interface for eth0, and can only be assigned to a new network interface, not an existing
     *   one. You cannot specify more than one network interface in the request. If launching into a
     *   default subnet, the default value is `true` .
     *
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4
     * Address* tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * @param associatePublicIpAddress Indicates whether to assign a public IPv4 address to an
     *   instance you launch in a VPC. The public IP address can only be assigned to a network
     *   interface for eth0, and can only be assigned to a new network interface, not an existing
     *   one. You cannot specify more than one network interface in the request. If launching into a
     *   default subnet, the default value is `true` .
     *
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4
     * Address* tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
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
     * If you specify a network interface when launching an instance, you must specify the device
     * index.
     */
    public fun deviceIndex(deviceIndex: Number) {
        cdkBuilder.deviceIndex(deviceIndex)
    }

    /**
     * @param groups The IDs of the security groups for the network interface. Applies only if
     *   creating a network interface when launching an instance.
     */
    public fun groups(vararg groups: String) {
        _groups.addAll(listOf(*groups))
    }

    /**
     * @param groups The IDs of the security groups for the network interface. Applies only if
     *   creating a network interface when launching an instance.
     */
    public fun groups(groups: Collection<String>) {
        _groups.addAll(groups)
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
     * @param networkInterfaceId The ID of the network interface. If you are creating a Spot Fleet,
     *   omit this parameter because you can’t specify a network interface ID in a launch
     *   specification.
     */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface. Only
     *   one private IPv4 address can be designated as primary. You cannot specify this option if
     *   you're launching more than one instance in a
     *   [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
     *   request.
     */
    public fun privateIpAddresses(vararg privateIpAddresses: Any) {
        _privateIpAddresses.addAll(listOf(*privateIpAddresses))
    }

    /**
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface. Only
     *   one private IPv4 address can be designated as primary. You cannot specify this option if
     *   you're launching more than one instance in a
     *   [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
     *   request.
     */
    public fun privateIpAddresses(privateIpAddresses: Collection<Any>) {
        _privateIpAddresses.addAll(privateIpAddresses)
    }

    /**
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface. Only
     *   one private IPv4 address can be designated as primary. You cannot specify this option if
     *   you're launching more than one instance in a
     *   [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
     *   request.
     */
    public fun privateIpAddresses(privateIpAddresses: IResolvable) {
        cdkBuilder.privateIpAddresses(privateIpAddresses)
    }

    /**
     * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses. You
     *   can't specify this option and specify more than one private IP address using the private IP
     *   addresses option. You cannot specify this option if you're launching more than one instance
     *   in a
     *   [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
     *   request.
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

    public fun build(): CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        if (_ipv6Addresses.isNotEmpty()) cdkBuilder.ipv6Addresses(_ipv6Addresses)
        if (_privateIpAddresses.isNotEmpty()) cdkBuilder.privateIpAddresses(_privateIpAddresses)
        return cdkBuilder.build()
    }
}
