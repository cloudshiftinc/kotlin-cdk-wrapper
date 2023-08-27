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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInterface
import software.constructs.Construct

/**
 * Describes a network interface in an Amazon EC2 instance for AWS CloudFormation .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkInterface cfnNetworkInterface = CfnNetworkInterface.Builder.create(this,
 * "MyCfnNetworkInterface")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .description("description")
 * .groupSet(List.of("groupSet"))
 * .interfaceType("interfaceType")
 * .ipv4PrefixCount(123)
 * .ipv4Prefixes(List.of(Ipv4PrefixSpecificationProperty.builder()
 * .ipv4Prefix("ipv4Prefix")
 * .build()))
 * .ipv6AddressCount(123)
 * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
 * .ipv6Address("ipv6Address")
 * .build()))
 * .ipv6PrefixCount(123)
 * .ipv6Prefixes(List.of(Ipv6PrefixSpecificationProperty.builder()
 * .ipv6Prefix("ipv6Prefix")
 * .build()))
 * .privateIpAddress("privateIpAddress")
 * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
 * .primary(false)
 * .privateIpAddress("privateIpAddress")
 * .build()))
 * .secondaryPrivateIpAddressCount(123)
 * .sourceDestCheck(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html)
 */
@CdkDslMarker
public class CfnNetworkInterfaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNetworkInterface.Builder =
        CfnNetworkInterface.Builder.create(scope, id)

    private val _groupSet: MutableList<String> = mutableListOf()

    private val _ipv4Prefixes: MutableList<Any> = mutableListOf()

    private val _ipv6Addresses: MutableList<Any> = mutableListOf()

    private val _ipv6Prefixes: MutableList<Any> = mutableListOf()

    private val _privateIpAddresses: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-description)
     *
     * @param description A description for the network interface.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The security group IDs associated with this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-groupset)
     *
     * @param groupSet The security group IDs associated with this network interface.
     */
    public fun groupSet(vararg groupSet: String) {
        _groupSet.addAll(listOf(*groupSet))
    }

    /**
     * The security group IDs associated with this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-groupset)
     *
     * @param groupSet The security group IDs associated with this network interface.
     */
    public fun groupSet(groupSet: Collection<String>) {
        _groupSet.addAll(groupSet)
    }

    /**
     * The type of network interface.
     *
     * The default is `interface` . The supported values are `efa` and `trunk` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-interfacetype)
     *
     * @param interfaceType The type of network interface.
     */
    public fun interfaceType(interfaceType: String) {
        cdkBuilder.interfaceType(interfaceType)
    }

    /**
     * The number of IPv4 prefixes to be automatically assigned to the network interface.
     *
     * You cannot use this option if you use the `Ipv4Prefix` option.
     *
     * When creating a network interface, you can't specify a count of IPv4 prefixes if you've
     * specified one of the following: specific IPv4 prefixes, specific private IPv4 addresses, or a
     * count of private IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixcount)
     *
     * @param ipv4PrefixCount The number of IPv4 prefixes to be automatically assigned to the
     *   network interface.
     */
    public fun ipv4PrefixCount(ipv4PrefixCount: Number) {
        cdkBuilder.ipv4PrefixCount(ipv4PrefixCount)
    }

    /**
     * The IPv4 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of
     * private IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixes)
     *
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface.
     */
    public fun ipv4Prefixes(vararg ipv4Prefixes: Any) {
        _ipv4Prefixes.addAll(listOf(*ipv4Prefixes))
    }

    /**
     * The IPv4 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of
     * private IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixes)
     *
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface.
     */
    public fun ipv4Prefixes(ipv4Prefixes: Collection<Any>) {
        _ipv4Prefixes.addAll(ipv4Prefixes)
    }

    /**
     * The IPv4 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of
     * private IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixes)
     *
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface.
     */
    public fun ipv4Prefixes(ipv4Prefixes: IResolvable) {
        cdkBuilder.ipv4Prefixes(ipv4Prefixes)
    }

    /**
     * The number of IPv6 addresses to assign to a network interface.
     *
     * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. To specify
     * specific IPv6 addresses, use the `Ipv6Addresses` property and don't specify this property.
     *
     * When creating a network interface, you can't specify a count of IPv6 addresses if you've
     * specified one of the following: specific IPv6 addresses, specific IPv6 prefixes, or a count
     * of IPv6 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6addresscount)
     *
     * @param ipv6AddressCount The number of IPv6 addresses to assign to a network interface.
     */
    public fun ipv6AddressCount(ipv6AddressCount: Number) {
        cdkBuilder.ipv6AddressCount(ipv6AddressCount)
    }

    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * associate with the network interface.
     *
     * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and
     * don't specify this property.
     *
     * When creating a network interface, you can't specify IPv6 addresses if you've specified one
     * of the following: a count of IPv6 addresses, specific IPv6 prefixes, or a count of IPv6
     * prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6addresses)
     *
     * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
     *   your subnet to associate with the network interface.
     */
    public fun ipv6Addresses(vararg ipv6Addresses: Any) {
        _ipv6Addresses.addAll(listOf(*ipv6Addresses))
    }

    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * associate with the network interface.
     *
     * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and
     * don't specify this property.
     *
     * When creating a network interface, you can't specify IPv6 addresses if you've specified one
     * of the following: a count of IPv6 addresses, specific IPv6 prefixes, or a count of IPv6
     * prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6addresses)
     *
     * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
     *   your subnet to associate with the network interface.
     */
    public fun ipv6Addresses(ipv6Addresses: Collection<Any>) {
        _ipv6Addresses.addAll(ipv6Addresses)
    }

    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * associate with the network interface.
     *
     * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and
     * don't specify this property.
     *
     * When creating a network interface, you can't specify IPv6 addresses if you've specified one
     * of the following: a count of IPv6 addresses, specific IPv6 prefixes, or a count of IPv6
     * prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6addresses)
     *
     * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
     *   your subnet to associate with the network interface.
     */
    public fun ipv6Addresses(ipv6Addresses: IResolvable) {
        cdkBuilder.ipv6Addresses(ipv6Addresses)
    }

    /**
     * The number of IPv6 prefixes to be automatically assigned to the network interface.
     *
     * You cannot use this option if you use the `Ipv6Prefix` option.
     *
     * When creating a network interface, you can't specify a count of IPv6 prefixes if you've
     * specified one of the following: specific IPv6 prefixes, specific IPv6 addresses, or a count
     * of IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixcount)
     *
     * @param ipv6PrefixCount The number of IPv6 prefixes to be automatically assigned to the
     *   network interface.
     */
    public fun ipv6PrefixCount(ipv6PrefixCount: Number) {
        cdkBuilder.ipv6PrefixCount(ipv6PrefixCount)
    }

    /**
     * The IPv6 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixes)
     *
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface.
     */
    public fun ipv6Prefixes(vararg ipv6Prefixes: Any) {
        _ipv6Prefixes.addAll(listOf(*ipv6Prefixes))
    }

    /**
     * The IPv6 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixes)
     *
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface.
     */
    public fun ipv6Prefixes(ipv6Prefixes: Collection<Any>) {
        _ipv6Prefixes.addAll(ipv6Prefixes)
    }

    /**
     * The IPv6 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixes)
     *
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface.
     */
    public fun ipv6Prefixes(ipv6Prefixes: IResolvable) {
        cdkBuilder.ipv6Prefixes(ipv6Prefixes)
    }

    /**
     * Assigns a single private IP address to the network interface, which is used as the primary
     * private IP address.
     *
     * If you want to specify multiple private IP address, use the `PrivateIpAddresses` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddress)
     *
     * @param privateIpAddress Assigns a single private IP address to the network interface, which
     *   is used as the primary private IP address.
     */
    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /**
     * Assigns private IP addresses to the network interface.
     *
     * You can specify a primary private IP address by setting the value of the `Primary` property
     * to `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically
     * assign private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not
     * specify this property.
     *
     * When creating a network interface, you can't specify private IPv4 addresses if you've
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or
     * a count of IPv4 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddresses)
     *
     * @param privateIpAddresses Assigns private IP addresses to the network interface.
     */
    public fun privateIpAddresses(vararg privateIpAddresses: Any) {
        _privateIpAddresses.addAll(listOf(*privateIpAddresses))
    }

    /**
     * Assigns private IP addresses to the network interface.
     *
     * You can specify a primary private IP address by setting the value of the `Primary` property
     * to `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically
     * assign private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not
     * specify this property.
     *
     * When creating a network interface, you can't specify private IPv4 addresses if you've
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or
     * a count of IPv4 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddresses)
     *
     * @param privateIpAddresses Assigns private IP addresses to the network interface.
     */
    public fun privateIpAddresses(privateIpAddresses: Collection<Any>) {
        _privateIpAddresses.addAll(privateIpAddresses)
    }

    /**
     * Assigns private IP addresses to the network interface.
     *
     * You can specify a primary private IP address by setting the value of the `Primary` property
     * to `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically
     * assign private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not
     * specify this property.
     *
     * When creating a network interface, you can't specify private IPv4 addresses if you've
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or
     * a count of IPv4 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddresses)
     *
     * @param privateIpAddresses Assigns private IP addresses to the network interface.
     */
    public fun privateIpAddresses(privateIpAddresses: IResolvable) {
        cdkBuilder.privateIpAddresses(privateIpAddresses)
    }

    /**
     * The number of secondary private IPv4 addresses to assign to a network interface.
     *
     * When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses
     * within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one
     * private IP address using `privateIpAddresses` .
     *
     * When creating a Network Interface, you can't specify a count of private IPv4 addresses if
     * you've specified one of the following: specific private IPv4 addresses, specific IPv4
     * prefixes, or a count of IPv4 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-secondaryprivateipaddresscount)
     *
     * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses to
     *   assign to a network interface.
     */
    public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
        cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
    }

    /**
     * Enable or disable source/destination checks, which ensure that the instance is either the
     * source or the destination of any traffic that it receives.
     *
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-sourcedestcheck)
     *
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     *   instance is either the source or the destination of any traffic that it receives.
     */
    public fun sourceDestCheck(sourceDestCheck: Boolean) {
        cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    /**
     * Enable or disable source/destination checks, which ensure that the instance is either the
     * source or the destination of any traffic that it receives.
     *
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-sourcedestcheck)
     *
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     *   instance is either the source or the destination of any traffic that it receives.
     */
    public fun sourceDestCheck(sourceDestCheck: IResolvable) {
        cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    /**
     * The ID of the subnet to associate with the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-subnetid)
     *
     * @param subnetId The ID of the subnet to associate with the network interface.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-tags)
     *
     * @param tags An arbitrary set of tags (key-value pairs) for this network interface.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-tags)
     *
     * @param tags An arbitrary set of tags (key-value pairs) for this network interface.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnNetworkInterface {
        if (_groupSet.isNotEmpty()) cdkBuilder.groupSet(_groupSet)
        if (_ipv4Prefixes.isNotEmpty()) cdkBuilder.ipv4Prefixes(_ipv4Prefixes)
        if (_ipv6Addresses.isNotEmpty()) cdkBuilder.ipv6Addresses(_ipv6Addresses)
        if (_ipv6Prefixes.isNotEmpty()) cdkBuilder.ipv6Prefixes(_ipv6Prefixes)
        if (_privateIpAddresses.isNotEmpty()) cdkBuilder.privateIpAddresses(_privateIpAddresses)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
