@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnNetworkInterface`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkInterfaceProps cfnNetworkInterfaceProps = CfnNetworkInterfaceProps.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .connectionTrackingSpecification(ConnectionTrackingSpecificationProperty.builder()
 * .tcpEstablishedTimeout(123)
 * .udpStreamTimeout(123)
 * .udpTimeout(123)
 * .build())
 * .description("description")
 * .enablePrimaryIpv6(false)
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
public interface CfnNetworkInterfaceProps {
  /**
   * A connection tracking specification for the network interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-connectiontrackingspecification)
   */
  public fun connectionTrackingSpecification(): Any? =
      unwrap(this).getConnectionTrackingSpecification()

  /**
   * A description for the network interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the
   * option to assign a primary IPv6 IP address.
   *
   * A primary IPv6 address is an IPv6 GUA address associated with an ENI that you have enabled to
   * use a primary IPv6 address. Use this option if the instance that this ENI will be attached to
   * relies on its IPv6 address not changing. AWS will automatically assign an IPv6 address associated
   * with the ENI attached to your instance to be the primary IPv6 address. Once you enable an IPv6 GUA
   * address to be a primary IPv6, you cannot disable it. When you enable an IPv6 GUA address to be a
   * primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until the instance is
   * terminated or the network interface is detached. If you have multiple IPv6 addresses associated
   * with an ENI attached to your instance and you enable a primary IPv6 address, the first IPv6 GUA
   * address associated with the ENI becomes the primary IPv6 address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-enableprimaryipv6)
   */
  public fun enablePrimaryIpv6(): Any? = unwrap(this).getEnablePrimaryIpv6()

  /**
   * The IDs of the security groups associated with this network interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-groupset)
   */
  public fun groupSet(): List<String> = unwrap(this).getGroupSet() ?: emptyList()

  /**
   * The type of network interface.
   *
   * The default is `interface` . The supported values are `efa` and `trunk` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-interfacetype)
   */
  public fun interfaceType(): String? = unwrap(this).getInterfaceType()

  /**
   * The number of IPv4 prefixes to be automatically assigned to the network interface.
   *
   * When creating a network interface, you can't specify a count of IPv4 prefixes if you've
   * specified one of the following: specific IPv4 prefixes, specific private IPv4 addresses, or a
   * count of private IPv4 addresses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixcount)
   */
  public fun ipv4PrefixCount(): Number? = unwrap(this).getIpv4PrefixCount()

  /**
   * The IPv4 delegated prefixes that are assigned to the network interface.
   *
   * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
   * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
   * IPv4 addresses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixes)
   */
  public fun ipv4Prefixes(): Any? = unwrap(this).getIpv4Prefixes()

  /**
   * The number of IPv6 addresses to assign to the network interface.
   *
   * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. To specify specific
   * IPv6 addresses, use the `Ipv6Addresses` property and don't specify this property.
   *
   * When creating a network interface, you can't specify a count of IPv6 addresses if you've
   * specified one of the following: specific IPv6 addresses, specific IPv6 prefixes, or a count of
   * IPv6 prefixes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6addresscount)
   */
  public fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

  /**
   * The IPv6 addresses from the IPv6 CIDR block range of your subnet to assign to the network
   * interface.
   *
   * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and don't
   * specify this property.
   *
   * When creating a network interface, you can't specify IPv6 addresses if you've specified one of
   * the following: a count of IPv6 addresses, specific IPv6 prefixes, or a count of IPv6 prefixes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6addresses)
   */
  public fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

  /**
   * The number of IPv6 prefixes to be automatically assigned to the network interface.
   *
   * When creating a network interface, you can't specify a count of IPv6 prefixes if you've
   * specified one of the following: specific IPv6 prefixes, specific IPv6 addresses, or a count of
   * IPv6 addresses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixcount)
   */
  public fun ipv6PrefixCount(): Number? = unwrap(this).getIpv6PrefixCount()

  /**
   * The IPv6 delegated prefixes that are assigned to the network interface.
   *
   * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
   * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixes)
   */
  public fun ipv6Prefixes(): Any? = unwrap(this).getIpv6Prefixes()

  /**
   * The private IPv4 address to assign to the network interface as the primary private IP address.
   *
   * If you want to specify multiple private IP addresses, use the `PrivateIpAddresses` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddress)
   */
  public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  /**
   * The private IPv4 addresses to assign to the network interface.
   *
   * You can specify a primary private IP address by setting the value of the `Primary` property to
   * `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically assign
   * private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not specify this
   * property.
   *
   * When creating a network interface, you can't specify private IPv4 addresses if you've specified
   * one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or a count of
   * IPv4 prefixes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddresses)
   */
  public fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

  /**
   * The number of secondary private IPv4 addresses to assign to a network interface.
   *
   * When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses
   * within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one
   * private IP address using `privateIpAddresses` .
   *
   * When creating a Network Interface, you can't specify a count of private IPv4 addresses if
   * you've specified one of the following: specific private IPv4 addresses, specific IPv4 prefixes, or
   * a count of IPv4 prefixes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-secondaryprivateipaddresscount)
   */
  public fun secondaryPrivateIpAddressCount(): Number? =
      unwrap(this).getSecondaryPrivateIpAddressCount()

  /**
   * Enable or disable source/destination checks, which ensure that the instance is either the
   * source or the destination of any traffic that it receives.
   *
   * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
   * The default value is `true` . You must disable source/destination checks if the instance runs
   * services such as network address translation, routing, or firewalls.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-sourcedestcheck)
   */
  public fun sourceDestCheck(): Any? = unwrap(this).getSourceDestCheck()

  /**
   * The ID of the subnet to associate with the network interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-subnetid)
   */
  public fun subnetId(): String

  /**
   * The tags to apply to the network interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnNetworkInterfaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface.
     */
    public fun connectionTrackingSpecification(connectionTrackingSpecification: IResolvable)

    /**
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface.
     */
    public
        fun connectionTrackingSpecification(connectionTrackingSpecification: CfnNetworkInterface.ConnectionTrackingSpecificationProperty)

    /**
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36fb57d847e2dae6ead5d757d2550831ce75b17b67f42b715e6bf87eebe9f28c")
    public
        fun connectionTrackingSpecification(connectionTrackingSpecification: CfnNetworkInterface.ConnectionTrackingSpecificationProperty.Builder.() -> Unit)

    /**
     * @param description A description for the network interface.
     */
    public fun description(description: String)

    /**
     * @param enablePrimaryIpv6 If you’re modifying a network interface in a dual-stack or IPv6-only
     * subnet, you have the option to assign a primary IPv6 IP address.
     * A primary IPv6 address is an IPv6 GUA address associated with an ENI that you have enabled to
     * use a primary IPv6 address. Use this option if the instance that this ENI will be attached to
     * relies on its IPv6 address not changing. AWS will automatically assign an IPv6 address
     * associated with the ENI attached to your instance to be the primary IPv6 address. Once you
     * enable an IPv6 GUA address to be a primary IPv6, you cannot disable it. When you enable an IPv6
     * GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until
     * the instance is terminated or the network interface is detached. If you have multiple IPv6
     * addresses associated with an ENI attached to your instance and you enable a primary IPv6
     * address, the first IPv6 GUA address associated with the ENI becomes the primary IPv6 address.
     */
    public fun enablePrimaryIpv6(enablePrimaryIpv6: Boolean)

    /**
     * @param enablePrimaryIpv6 If you’re modifying a network interface in a dual-stack or IPv6-only
     * subnet, you have the option to assign a primary IPv6 IP address.
     * A primary IPv6 address is an IPv6 GUA address associated with an ENI that you have enabled to
     * use a primary IPv6 address. Use this option if the instance that this ENI will be attached to
     * relies on its IPv6 address not changing. AWS will automatically assign an IPv6 address
     * associated with the ENI attached to your instance to be the primary IPv6 address. Once you
     * enable an IPv6 GUA address to be a primary IPv6, you cannot disable it. When you enable an IPv6
     * GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until
     * the instance is terminated or the network interface is detached. If you have multiple IPv6
     * addresses associated with an ENI attached to your instance and you enable a primary IPv6
     * address, the first IPv6 GUA address associated with the ENI becomes the primary IPv6 address.
     */
    public fun enablePrimaryIpv6(enablePrimaryIpv6: IResolvable)

    /**
     * @param groupSet The IDs of the security groups associated with this network interface.
     */
    public fun groupSet(groupSet: List<String>)

    /**
     * @param groupSet The IDs of the security groups associated with this network interface.
     */
    public fun groupSet(vararg groupSet: String)

    /**
     * @param interfaceType The type of network interface.
     * The default is `interface` . The supported values are `efa` and `trunk` .
     */
    public fun interfaceType(interfaceType: String)

    /**
     * @param ipv4PrefixCount The number of IPv4 prefixes to be automatically assigned to the
     * network interface.
     * When creating a network interface, you can't specify a count of IPv4 prefixes if you've
     * specified one of the following: specific IPv4 prefixes, specific private IPv4 addresses, or a
     * count of private IPv4 addresses.
     */
    public fun ipv4PrefixCount(ipv4PrefixCount: Number)

    /**
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface.
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     */
    public fun ipv4Prefixes(ipv4Prefixes: IResolvable)

    /**
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface.
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     */
    public fun ipv4Prefixes(ipv4Prefixes: List<Any>)

    /**
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface.
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     */
    public fun ipv4Prefixes(vararg ipv4Prefixes: Any)

    /**
     * @param ipv6AddressCount The number of IPv6 addresses to assign to the network interface.
     * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. To specify
     * specific IPv6 addresses, use the `Ipv6Addresses` property and don't specify this property.
     *
     * When creating a network interface, you can't specify a count of IPv6 addresses if you've
     * specified one of the following: specific IPv6 addresses, specific IPv6 prefixes, or a count of
     * IPv6 prefixes.
     */
    public fun ipv6AddressCount(ipv6AddressCount: Number)

    /**
     * @param ipv6Addresses The IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * assign to the network interface.
     * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and
     * don't specify this property.
     *
     * When creating a network interface, you can't specify IPv6 addresses if you've specified one
     * of the following: a count of IPv6 addresses, specific IPv6 prefixes, or a count of IPv6
     * prefixes.
     */
    public fun ipv6Addresses(ipv6Addresses: IResolvable)

    /**
     * @param ipv6Addresses The IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * assign to the network interface.
     * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and
     * don't specify this property.
     *
     * When creating a network interface, you can't specify IPv6 addresses if you've specified one
     * of the following: a count of IPv6 addresses, specific IPv6 prefixes, or a count of IPv6
     * prefixes.
     */
    public fun ipv6Addresses(ipv6Addresses: List<Any>)

    /**
     * @param ipv6Addresses The IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * assign to the network interface.
     * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and
     * don't specify this property.
     *
     * When creating a network interface, you can't specify IPv6 addresses if you've specified one
     * of the following: a count of IPv6 addresses, specific IPv6 prefixes, or a count of IPv6
     * prefixes.
     */
    public fun ipv6Addresses(vararg ipv6Addresses: Any)

    /**
     * @param ipv6PrefixCount The number of IPv6 prefixes to be automatically assigned to the
     * network interface.
     * When creating a network interface, you can't specify a count of IPv6 prefixes if you've
     * specified one of the following: specific IPv6 prefixes, specific IPv6 addresses, or a count of
     * IPv6 addresses.
     */
    public fun ipv6PrefixCount(ipv6PrefixCount: Number)

    /**
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface.
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     */
    public fun ipv6Prefixes(ipv6Prefixes: IResolvable)

    /**
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface.
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     */
    public fun ipv6Prefixes(ipv6Prefixes: List<Any>)

    /**
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface.
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     */
    public fun ipv6Prefixes(vararg ipv6Prefixes: Any)

    /**
     * @param privateIpAddress The private IPv4 address to assign to the network interface as the
     * primary private IP address.
     * If you want to specify multiple private IP addresses, use the `PrivateIpAddresses` property.
     */
    public fun privateIpAddress(privateIpAddress: String)

    /**
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface.
     * You can specify a primary private IP address by setting the value of the `Primary` property
     * to `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically
     * assign private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not
     * specify this property.
     *
     * When creating a network interface, you can't specify private IPv4 addresses if you've
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or a
     * count of IPv4 prefixes.
     */
    public fun privateIpAddresses(privateIpAddresses: IResolvable)

    /**
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface.
     * You can specify a primary private IP address by setting the value of the `Primary` property
     * to `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically
     * assign private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not
     * specify this property.
     *
     * When creating a network interface, you can't specify private IPv4 addresses if you've
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or a
     * count of IPv4 prefixes.
     */
    public fun privateIpAddresses(privateIpAddresses: List<Any>)

    /**
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface.
     * You can specify a primary private IP address by setting the value of the `Primary` property
     * to `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically
     * assign private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not
     * specify this property.
     *
     * When creating a network interface, you can't specify private IPv4 addresses if you've
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or a
     * count of IPv4 prefixes.
     */
    public fun privateIpAddresses(vararg privateIpAddresses: Any)

    /**
     * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses to
     * assign to a network interface.
     * When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses
     * within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one
     * private IP address using `privateIpAddresses` .
     *
     * When creating a Network Interface, you can't specify a count of private IPv4 addresses if
     * you've specified one of the following: specific private IPv4 addresses, specific IPv4 prefixes,
     * or a count of IPv4 prefixes.
     */
    public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number)

    /**
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives.
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     */
    public fun sourceDestCheck(sourceDestCheck: Boolean)

    /**
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives.
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     */
    public fun sourceDestCheck(sourceDestCheck: IResolvable)

    /**
     * @param subnetId The ID of the subnet to associate with the network interface. 
     */
    public fun subnetId(subnetId: String)

    /**
     * @param tags The tags to apply to the network interface.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to apply to the network interface.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps.builder()

    /**
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface.
     */
    override fun connectionTrackingSpecification(connectionTrackingSpecification: IResolvable) {
      cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface.
     */
    override
        fun connectionTrackingSpecification(connectionTrackingSpecification: CfnNetworkInterface.ConnectionTrackingSpecificationProperty) {
      cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(CfnNetworkInterface.ConnectionTrackingSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36fb57d847e2dae6ead5d757d2550831ce75b17b67f42b715e6bf87eebe9f28c")
    override
        fun connectionTrackingSpecification(connectionTrackingSpecification: CfnNetworkInterface.ConnectionTrackingSpecificationProperty.Builder.() -> Unit):
        Unit =
        connectionTrackingSpecification(CfnNetworkInterface.ConnectionTrackingSpecificationProperty(connectionTrackingSpecification))

    /**
     * @param description A description for the network interface.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enablePrimaryIpv6 If you’re modifying a network interface in a dual-stack or IPv6-only
     * subnet, you have the option to assign a primary IPv6 IP address.
     * A primary IPv6 address is an IPv6 GUA address associated with an ENI that you have enabled to
     * use a primary IPv6 address. Use this option if the instance that this ENI will be attached to
     * relies on its IPv6 address not changing. AWS will automatically assign an IPv6 address
     * associated with the ENI attached to your instance to be the primary IPv6 address. Once you
     * enable an IPv6 GUA address to be a primary IPv6, you cannot disable it. When you enable an IPv6
     * GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until
     * the instance is terminated or the network interface is detached. If you have multiple IPv6
     * addresses associated with an ENI attached to your instance and you enable a primary IPv6
     * address, the first IPv6 GUA address associated with the ENI becomes the primary IPv6 address.
     */
    override fun enablePrimaryIpv6(enablePrimaryIpv6: Boolean) {
      cdkBuilder.enablePrimaryIpv6(enablePrimaryIpv6)
    }

    /**
     * @param enablePrimaryIpv6 If you’re modifying a network interface in a dual-stack or IPv6-only
     * subnet, you have the option to assign a primary IPv6 IP address.
     * A primary IPv6 address is an IPv6 GUA address associated with an ENI that you have enabled to
     * use a primary IPv6 address. Use this option if the instance that this ENI will be attached to
     * relies on its IPv6 address not changing. AWS will automatically assign an IPv6 address
     * associated with the ENI attached to your instance to be the primary IPv6 address. Once you
     * enable an IPv6 GUA address to be a primary IPv6, you cannot disable it. When you enable an IPv6
     * GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until
     * the instance is terminated or the network interface is detached. If you have multiple IPv6
     * addresses associated with an ENI attached to your instance and you enable a primary IPv6
     * address, the first IPv6 GUA address associated with the ENI becomes the primary IPv6 address.
     */
    override fun enablePrimaryIpv6(enablePrimaryIpv6: IResolvable) {
      cdkBuilder.enablePrimaryIpv6(enablePrimaryIpv6.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param groupSet The IDs of the security groups associated with this network interface.
     */
    override fun groupSet(groupSet: List<String>) {
      cdkBuilder.groupSet(groupSet)
    }

    /**
     * @param groupSet The IDs of the security groups associated with this network interface.
     */
    override fun groupSet(vararg groupSet: String): Unit = groupSet(groupSet.toList())

    /**
     * @param interfaceType The type of network interface.
     * The default is `interface` . The supported values are `efa` and `trunk` .
     */
    override fun interfaceType(interfaceType: String) {
      cdkBuilder.interfaceType(interfaceType)
    }

    /**
     * @param ipv4PrefixCount The number of IPv4 prefixes to be automatically assigned to the
     * network interface.
     * When creating a network interface, you can't specify a count of IPv4 prefixes if you've
     * specified one of the following: specific IPv4 prefixes, specific private IPv4 addresses, or a
     * count of private IPv4 addresses.
     */
    override fun ipv4PrefixCount(ipv4PrefixCount: Number) {
      cdkBuilder.ipv4PrefixCount(ipv4PrefixCount)
    }

    /**
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface.
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     */
    override fun ipv4Prefixes(ipv4Prefixes: IResolvable) {
      cdkBuilder.ipv4Prefixes(ipv4Prefixes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface.
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     */
    override fun ipv4Prefixes(ipv4Prefixes: List<Any>) {
      cdkBuilder.ipv4Prefixes(ipv4Prefixes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface.
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     */
    override fun ipv4Prefixes(vararg ipv4Prefixes: Any): Unit = ipv4Prefixes(ipv4Prefixes.toList())

    /**
     * @param ipv6AddressCount The number of IPv6 addresses to assign to the network interface.
     * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. To specify
     * specific IPv6 addresses, use the `Ipv6Addresses` property and don't specify this property.
     *
     * When creating a network interface, you can't specify a count of IPv6 addresses if you've
     * specified one of the following: specific IPv6 addresses, specific IPv6 prefixes, or a count of
     * IPv6 prefixes.
     */
    override fun ipv6AddressCount(ipv6AddressCount: Number) {
      cdkBuilder.ipv6AddressCount(ipv6AddressCount)
    }

    /**
     * @param ipv6Addresses The IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * assign to the network interface.
     * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and
     * don't specify this property.
     *
     * When creating a network interface, you can't specify IPv6 addresses if you've specified one
     * of the following: a count of IPv6 addresses, specific IPv6 prefixes, or a count of IPv6
     * prefixes.
     */
    override fun ipv6Addresses(ipv6Addresses: IResolvable) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ipv6Addresses The IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * assign to the network interface.
     * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and
     * don't specify this property.
     *
     * When creating a network interface, you can't specify IPv6 addresses if you've specified one
     * of the following: a count of IPv6 addresses, specific IPv6 prefixes, or a count of IPv6
     * prefixes.
     */
    override fun ipv6Addresses(ipv6Addresses: List<Any>) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param ipv6Addresses The IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * assign to the network interface.
     * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and
     * don't specify this property.
     *
     * When creating a network interface, you can't specify IPv6 addresses if you've specified one
     * of the following: a count of IPv6 addresses, specific IPv6 prefixes, or a count of IPv6
     * prefixes.
     */
    override fun ipv6Addresses(vararg ipv6Addresses: Any): Unit =
        ipv6Addresses(ipv6Addresses.toList())

    /**
     * @param ipv6PrefixCount The number of IPv6 prefixes to be automatically assigned to the
     * network interface.
     * When creating a network interface, you can't specify a count of IPv6 prefixes if you've
     * specified one of the following: specific IPv6 prefixes, specific IPv6 addresses, or a count of
     * IPv6 addresses.
     */
    override fun ipv6PrefixCount(ipv6PrefixCount: Number) {
      cdkBuilder.ipv6PrefixCount(ipv6PrefixCount)
    }

    /**
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface.
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     */
    override fun ipv6Prefixes(ipv6Prefixes: IResolvable) {
      cdkBuilder.ipv6Prefixes(ipv6Prefixes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface.
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     */
    override fun ipv6Prefixes(ipv6Prefixes: List<Any>) {
      cdkBuilder.ipv6Prefixes(ipv6Prefixes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface.
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     */
    override fun ipv6Prefixes(vararg ipv6Prefixes: Any): Unit = ipv6Prefixes(ipv6Prefixes.toList())

    /**
     * @param privateIpAddress The private IPv4 address to assign to the network interface as the
     * primary private IP address.
     * If you want to specify multiple private IP addresses, use the `PrivateIpAddresses` property.
     */
    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /**
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface.
     * You can specify a primary private IP address by setting the value of the `Primary` property
     * to `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically
     * assign private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not
     * specify this property.
     *
     * When creating a network interface, you can't specify private IPv4 addresses if you've
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or a
     * count of IPv4 prefixes.
     */
    override fun privateIpAddresses(privateIpAddresses: IResolvable) {
      cdkBuilder.privateIpAddresses(privateIpAddresses.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface.
     * You can specify a primary private IP address by setting the value of the `Primary` property
     * to `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically
     * assign private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not
     * specify this property.
     *
     * When creating a network interface, you can't specify private IPv4 addresses if you've
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or a
     * count of IPv4 prefixes.
     */
    override fun privateIpAddresses(privateIpAddresses: List<Any>) {
      cdkBuilder.privateIpAddresses(privateIpAddresses.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface.
     * You can specify a primary private IP address by setting the value of the `Primary` property
     * to `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically
     * assign private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not
     * specify this property.
     *
     * When creating a network interface, you can't specify private IPv4 addresses if you've
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or a
     * count of IPv4 prefixes.
     */
    override fun privateIpAddresses(vararg privateIpAddresses: Any): Unit =
        privateIpAddresses(privateIpAddresses.toList())

    /**
     * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses to
     * assign to a network interface.
     * When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses
     * within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one
     * private IP address using `privateIpAddresses` .
     *
     * When creating a Network Interface, you can't specify a count of private IPv4 addresses if
     * you've specified one of the following: specific private IPv4 addresses, specific IPv4 prefixes,
     * or a count of IPv4 prefixes.
     */
    override fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
      cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
    }

    /**
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives.
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     */
    override fun sourceDestCheck(sourceDestCheck: Boolean) {
      cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    /**
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives.
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     */
    override fun sourceDestCheck(sourceDestCheck: IResolvable) {
      cdkBuilder.sourceDestCheck(sourceDestCheck.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param subnetId The ID of the subnet to associate with the network interface. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tags The tags to apply to the network interface.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to apply to the network interface.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps,
  ) : CdkObject(cdkObject),
      CfnNetworkInterfaceProps {
    /**
     * A connection tracking specification for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-connectiontrackingspecification)
     */
    override fun connectionTrackingSpecification(): Any? =
        unwrap(this).getConnectionTrackingSpecification()

    /**
     * A description for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the
     * option to assign a primary IPv6 IP address.
     *
     * A primary IPv6 address is an IPv6 GUA address associated with an ENI that you have enabled to
     * use a primary IPv6 address. Use this option if the instance that this ENI will be attached to
     * relies on its IPv6 address not changing. AWS will automatically assign an IPv6 address
     * associated with the ENI attached to your instance to be the primary IPv6 address. Once you
     * enable an IPv6 GUA address to be a primary IPv6, you cannot disable it. When you enable an IPv6
     * GUA address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until
     * the instance is terminated or the network interface is detached. If you have multiple IPv6
     * addresses associated with an ENI attached to your instance and you enable a primary IPv6
     * address, the first IPv6 GUA address associated with the ENI becomes the primary IPv6 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-enableprimaryipv6)
     */
    override fun enablePrimaryIpv6(): Any? = unwrap(this).getEnablePrimaryIpv6()

    /**
     * The IDs of the security groups associated with this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-groupset)
     */
    override fun groupSet(): List<String> = unwrap(this).getGroupSet() ?: emptyList()

    /**
     * The type of network interface.
     *
     * The default is `interface` . The supported values are `efa` and `trunk` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-interfacetype)
     */
    override fun interfaceType(): String? = unwrap(this).getInterfaceType()

    /**
     * The number of IPv4 prefixes to be automatically assigned to the network interface.
     *
     * When creating a network interface, you can't specify a count of IPv4 prefixes if you've
     * specified one of the following: specific IPv4 prefixes, specific private IPv4 addresses, or a
     * count of private IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixcount)
     */
    override fun ipv4PrefixCount(): Number? = unwrap(this).getIpv4PrefixCount()

    /**
     * The IPv4 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixes)
     */
    override fun ipv4Prefixes(): Any? = unwrap(this).getIpv4Prefixes()

    /**
     * The number of IPv6 addresses to assign to the network interface.
     *
     * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. To specify
     * specific IPv6 addresses, use the `Ipv6Addresses` property and don't specify this property.
     *
     * When creating a network interface, you can't specify a count of IPv6 addresses if you've
     * specified one of the following: specific IPv6 addresses, specific IPv6 prefixes, or a count of
     * IPv6 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6addresscount)
     */
    override fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

    /**
     * The IPv6 addresses from the IPv6 CIDR block range of your subnet to assign to the network
     * interface.
     *
     * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and
     * don't specify this property.
     *
     * When creating a network interface, you can't specify IPv6 addresses if you've specified one
     * of the following: a count of IPv6 addresses, specific IPv6 prefixes, or a count of IPv6
     * prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6addresses)
     */
    override fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

    /**
     * The number of IPv6 prefixes to be automatically assigned to the network interface.
     *
     * When creating a network interface, you can't specify a count of IPv6 prefixes if you've
     * specified one of the following: specific IPv6 prefixes, specific IPv6 addresses, or a count of
     * IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixcount)
     */
    override fun ipv6PrefixCount(): Number? = unwrap(this).getIpv6PrefixCount()

    /**
     * The IPv6 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixes)
     */
    override fun ipv6Prefixes(): Any? = unwrap(this).getIpv6Prefixes()

    /**
     * The private IPv4 address to assign to the network interface as the primary private IP
     * address.
     *
     * If you want to specify multiple private IP addresses, use the `PrivateIpAddresses` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddress)
     */
    override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    /**
     * The private IPv4 addresses to assign to the network interface.
     *
     * You can specify a primary private IP address by setting the value of the `Primary` property
     * to `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically
     * assign private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not
     * specify this property.
     *
     * When creating a network interface, you can't specify private IPv4 addresses if you've
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or a
     * count of IPv4 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddresses)
     */
    override fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

    /**
     * The number of secondary private IPv4 addresses to assign to a network interface.
     *
     * When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses
     * within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one
     * private IP address using `privateIpAddresses` .
     *
     * When creating a Network Interface, you can't specify a count of private IPv4 addresses if
     * you've specified one of the following: specific private IPv4 addresses, specific IPv4 prefixes,
     * or a count of IPv4 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-secondaryprivateipaddresscount)
     */
    override fun secondaryPrivateIpAddressCount(): Number? =
        unwrap(this).getSecondaryPrivateIpAddressCount()

    /**
     * Enable or disable source/destination checks, which ensure that the instance is either the
     * source or the destination of any traffic that it receives.
     *
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-sourcedestcheck)
     */
    override fun sourceDestCheck(): Any? = unwrap(this).getSourceDestCheck()

    /**
     * The ID of the subnet to associate with the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()

    /**
     * The tags to apply to the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkInterfaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps):
        CfnNetworkInterfaceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnNetworkInterfaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInterfaceProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps
  }
}
