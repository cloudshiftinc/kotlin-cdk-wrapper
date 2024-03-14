package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkInterface internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID of the network interface.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The primary IPv6 address of the network interface.
   *
   * When you enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made the
   * primary IPv6 address until the instance is terminated or the network interface is detached.
   */
  public open fun attrPrimaryIpv6Address(): String = unwrap(this).getAttrPrimaryIpv6Address()

  /**
   * The primary private IP address of the network interface.
   *
   * For example, `10.0.0.192` .
   */
  public open fun attrPrimaryPrivateIpAddress(): String =
      unwrap(this).getAttrPrimaryPrivateIpAddress()

  /**
   * The secondary private IP addresses of the network interface.
   *
   * For example, `["10.0.0.161", "10.0.0.162", "10.0.0.163"]` .
   */
  public open fun attrSecondaryPrivateIpAddresses(): List<String> =
      unwrap(this).getAttrSecondaryPrivateIpAddresses()

  /**
   * A connection tracking specification for the network interface.
   */
  public open fun connectionTrackingSpecification(): Any? =
      unwrap(this).getConnectionTrackingSpecification()

  /**
   * A connection tracking specification for the network interface.
   */
  public open fun connectionTrackingSpecification(`value`: IResolvable) {
    unwrap(this).setConnectionTrackingSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * A connection tracking specification for the network interface.
   */
  public open
      fun connectionTrackingSpecification(`value`: ConnectionTrackingSpecificationProperty) {
    unwrap(this).setConnectionTrackingSpecification(`value`.let(ConnectionTrackingSpecificationProperty::unwrap))
  }

  /**
   * A connection tracking specification for the network interface.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("05408793f28e84f297503da20187c34ab73c3020eaffc70d7f77bb6335a5861f")
  public open
      fun connectionTrackingSpecification(`value`: ConnectionTrackingSpecificationProperty.Builder.() -> Unit):
      Unit = connectionTrackingSpecification(ConnectionTrackingSpecificationProperty(`value`))

  /**
   * A description for the network interface.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the network interface.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the
   * option to assign a primary IPv6 IP address.
   */
  public open fun enablePrimaryIpv6(): Any? = unwrap(this).getEnablePrimaryIpv6()

  /**
   * If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the
   * option to assign a primary IPv6 IP address.
   */
  public open fun enablePrimaryIpv6(`value`: Boolean) {
    unwrap(this).setEnablePrimaryIpv6(`value`)
  }

  /**
   * If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the
   * option to assign a primary IPv6 IP address.
   */
  public open fun enablePrimaryIpv6(`value`: IResolvable) {
    unwrap(this).setEnablePrimaryIpv6(`value`.let(IResolvable::unwrap))
  }

  /**
   * The security group IDs associated with this network interface.
   */
  public open fun groupSet(): List<String> = unwrap(this).getGroupSet() ?: emptyList()

  /**
   * The security group IDs associated with this network interface.
   */
  public open fun groupSet(`value`: List<String>) {
    unwrap(this).setGroupSet(`value`)
  }

  /**
   * The security group IDs associated with this network interface.
   */
  public open fun groupSet(vararg `value`: String): Unit = groupSet(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The type of network interface.
   */
  public open fun interfaceType(): String? = unwrap(this).getInterfaceType()

  /**
   * The type of network interface.
   */
  public open fun interfaceType(`value`: String) {
    unwrap(this).setInterfaceType(`value`)
  }

  /**
   * The number of IPv4 prefixes to be automatically assigned to the network interface.
   */
  public open fun ipv4PrefixCount(): Number? = unwrap(this).getIpv4PrefixCount()

  /**
   * The number of IPv4 prefixes to be automatically assigned to the network interface.
   */
  public open fun ipv4PrefixCount(`value`: Number) {
    unwrap(this).setIpv4PrefixCount(`value`)
  }

  /**
   * The IPv4 delegated prefixes that are assigned to the network interface.
   */
  public open fun ipv4Prefixes(): Any? = unwrap(this).getIpv4Prefixes()

  /**
   * The IPv4 delegated prefixes that are assigned to the network interface.
   */
  public open fun ipv4Prefixes(`value`: IResolvable) {
    unwrap(this).setIpv4Prefixes(`value`.let(IResolvable::unwrap))
  }

  /**
   * The IPv4 delegated prefixes that are assigned to the network interface.
   */
  public open fun ipv4Prefixes(__idx_ac66f0: List<Any>) {
    unwrap(this).setIpv4Prefixes(__idx_ac66f0)
  }

  /**
   * The IPv4 delegated prefixes that are assigned to the network interface.
   */
  public open fun ipv4Prefixes(vararg __idx_ac66f0: Any): Unit = ipv4Prefixes(__idx_ac66f0.toList())

  /**
   * The number of IPv6 addresses to assign to a network interface.
   */
  public open fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

  /**
   * The number of IPv6 addresses to assign to a network interface.
   */
  public open fun ipv6AddressCount(`value`: Number) {
    unwrap(this).setIpv6AddressCount(`value`)
  }

  /**
   * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet to associate
   * with the network interface.
   */
  public open fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

  /**
   * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet to associate
   * with the network interface.
   */
  public open fun ipv6Addresses(`value`: IResolvable) {
    unwrap(this).setIpv6Addresses(`value`.let(IResolvable::unwrap))
  }

  /**
   * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet to associate
   * with the network interface.
   */
  public open fun ipv6Addresses(__idx_ac66f0: List<Any>) {
    unwrap(this).setIpv6Addresses(__idx_ac66f0)
  }

  /**
   * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet to associate
   * with the network interface.
   */
  public open fun ipv6Addresses(vararg __idx_ac66f0: Any): Unit =
      ipv6Addresses(__idx_ac66f0.toList())

  /**
   * The number of IPv6 prefixes to be automatically assigned to the network interface.
   */
  public open fun ipv6PrefixCount(): Number? = unwrap(this).getIpv6PrefixCount()

  /**
   * The number of IPv6 prefixes to be automatically assigned to the network interface.
   */
  public open fun ipv6PrefixCount(`value`: Number) {
    unwrap(this).setIpv6PrefixCount(`value`)
  }

  /**
   * The IPv6 delegated prefixes that are assigned to the network interface.
   */
  public open fun ipv6Prefixes(): Any? = unwrap(this).getIpv6Prefixes()

  /**
   * The IPv6 delegated prefixes that are assigned to the network interface.
   */
  public open fun ipv6Prefixes(`value`: IResolvable) {
    unwrap(this).setIpv6Prefixes(`value`.let(IResolvable::unwrap))
  }

  /**
   * The IPv6 delegated prefixes that are assigned to the network interface.
   */
  public open fun ipv6Prefixes(__idx_ac66f0: List<Any>) {
    unwrap(this).setIpv6Prefixes(__idx_ac66f0)
  }

  /**
   * The IPv6 delegated prefixes that are assigned to the network interface.
   */
  public open fun ipv6Prefixes(vararg __idx_ac66f0: Any): Unit = ipv6Prefixes(__idx_ac66f0.toList())

  /**
   * Assigns a single private IP address to the network interface, which is used as the primary
   * private IP address.
   */
  public open fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  /**
   * Assigns a single private IP address to the network interface, which is used as the primary
   * private IP address.
   */
  public open fun privateIpAddress(`value`: String) {
    unwrap(this).setPrivateIpAddress(`value`)
  }

  /**
   * Assigns private IP addresses to the network interface.
   */
  public open fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

  /**
   * Assigns private IP addresses to the network interface.
   */
  public open fun privateIpAddresses(`value`: IResolvable) {
    unwrap(this).setPrivateIpAddresses(`value`.let(IResolvable::unwrap))
  }

  /**
   * Assigns private IP addresses to the network interface.
   */
  public open fun privateIpAddresses(__idx_ac66f0: List<Any>) {
    unwrap(this).setPrivateIpAddresses(__idx_ac66f0)
  }

  /**
   * Assigns private IP addresses to the network interface.
   */
  public open fun privateIpAddresses(vararg __idx_ac66f0: Any): Unit =
      privateIpAddresses(__idx_ac66f0.toList())

  /**
   * The number of secondary private IPv4 addresses to assign to a network interface.
   */
  public open fun secondaryPrivateIpAddressCount(): Number? =
      unwrap(this).getSecondaryPrivateIpAddressCount()

  /**
   * The number of secondary private IPv4 addresses to assign to a network interface.
   */
  public open fun secondaryPrivateIpAddressCount(`value`: Number) {
    unwrap(this).setSecondaryPrivateIpAddressCount(`value`)
  }

  /**
   * Enable or disable source/destination checks, which ensure that the instance is either the
   * source or the destination of any traffic that it receives.
   */
  public open fun sourceDestCheck(): Any? = unwrap(this).getSourceDestCheck()

  /**
   * Enable or disable source/destination checks, which ensure that the instance is either the
   * source or the destination of any traffic that it receives.
   */
  public open fun sourceDestCheck(`value`: Boolean) {
    unwrap(this).setSourceDestCheck(`value`)
  }

  /**
   * Enable or disable source/destination checks, which ensure that the instance is either the
   * source or the destination of any traffic that it receives.
   */
  public open fun sourceDestCheck(`value`: IResolvable) {
    unwrap(this).setSourceDestCheck(`value`.let(IResolvable::unwrap))
  }

  /**
   * The ID of the subnet to associate with the network interface.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet to associate with the network interface.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An arbitrary set of tags (key-value pairs) for this network interface.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An arbitrary set of tags (key-value pairs) for this network interface.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An arbitrary set of tags (key-value pairs) for this network interface.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnNetworkInterface].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A connection tracking specification for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-connectiontrackingspecification)
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface. 
     */
    public fun connectionTrackingSpecification(connectionTrackingSpecification: IResolvable)

    /**
     * A connection tracking specification for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-connectiontrackingspecification)
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface. 
     */
    public
        fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty)

    /**
     * A connection tracking specification for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-connectiontrackingspecification)
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05fe79de5ad612a2c211835d2841f358c21d750bc4f66d3040711844d1fd1e55")
    public
        fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty.Builder.() -> Unit)

    /**
     * A description for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-description)
     * @param description A description for the network interface. 
     */
    public fun description(description: String)

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
     * @param enablePrimaryIpv6 If you’re modifying a network interface in a dual-stack or IPv6-only
     * subnet, you have the option to assign a primary IPv6 IP address. 
     */
    public fun enablePrimaryIpv6(enablePrimaryIpv6: Boolean)

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
     * @param enablePrimaryIpv6 If you’re modifying a network interface in a dual-stack or IPv6-only
     * subnet, you have the option to assign a primary IPv6 IP address. 
     */
    public fun enablePrimaryIpv6(enablePrimaryIpv6: IResolvable)

    /**
     * The security group IDs associated with this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-groupset)
     * @param groupSet The security group IDs associated with this network interface. 
     */
    public fun groupSet(groupSet: List<String>)

    /**
     * The security group IDs associated with this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-groupset)
     * @param groupSet The security group IDs associated with this network interface. 
     */
    public fun groupSet(vararg groupSet: String)

    /**
     * The type of network interface.
     *
     * The default is `interface` . The supported values are `efa` and `trunk` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-interfacetype)
     * @param interfaceType The type of network interface. 
     */
    public fun interfaceType(interfaceType: String)

    /**
     * The number of IPv4 prefixes to be automatically assigned to the network interface.
     *
     * When creating a network interface, you can't specify a count of IPv4 prefixes if you've
     * specified one of the following: specific IPv4 prefixes, specific private IPv4 addresses, or a
     * count of private IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixcount)
     * @param ipv4PrefixCount The number of IPv4 prefixes to be automatically assigned to the
     * network interface. 
     */
    public fun ipv4PrefixCount(ipv4PrefixCount: Number)

    /**
     * The IPv4 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixes)
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface. 
     */
    public fun ipv4Prefixes(ipv4Prefixes: IResolvable)

    /**
     * The IPv4 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixes)
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface. 
     */
    public fun ipv4Prefixes(ipv4Prefixes: List<Any>)

    /**
     * The IPv4 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixes)
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface. 
     */
    public fun ipv4Prefixes(vararg ipv4Prefixes: Any)

    /**
     * The number of IPv6 addresses to assign to a network interface.
     *
     * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. To specify
     * specific IPv6 addresses, use the `Ipv6Addresses` property and don't specify this property.
     *
     * When creating a network interface, you can't specify a count of IPv6 addresses if you've
     * specified one of the following: specific IPv6 addresses, specific IPv6 prefixes, or a count of
     * IPv6 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6addresscount)
     * @param ipv6AddressCount The number of IPv6 addresses to assign to a network interface. 
     */
    public fun ipv6AddressCount(ipv6AddressCount: Number)

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
     * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
     * your subnet to associate with the network interface. 
     */
    public fun ipv6Addresses(ipv6Addresses: IResolvable)

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
     * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
     * your subnet to associate with the network interface. 
     */
    public fun ipv6Addresses(ipv6Addresses: List<Any>)

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
     * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
     * your subnet to associate with the network interface. 
     */
    public fun ipv6Addresses(vararg ipv6Addresses: Any)

    /**
     * The number of IPv6 prefixes to be automatically assigned to the network interface.
     *
     * When creating a network interface, you can't specify a count of IPv6 prefixes if you've
     * specified one of the following: specific IPv6 prefixes, specific IPv6 addresses, or a count of
     * IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixcount)
     * @param ipv6PrefixCount The number of IPv6 prefixes to be automatically assigned to the
     * network interface. 
     */
    public fun ipv6PrefixCount(ipv6PrefixCount: Number)

    /**
     * The IPv6 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixes)
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface. 
     */
    public fun ipv6Prefixes(ipv6Prefixes: IResolvable)

    /**
     * The IPv6 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixes)
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface. 
     */
    public fun ipv6Prefixes(ipv6Prefixes: List<Any>)

    /**
     * The IPv6 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixes)
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface. 
     */
    public fun ipv6Prefixes(vararg ipv6Prefixes: Any)

    /**
     * Assigns a single private IP address to the network interface, which is used as the primary
     * private IP address.
     *
     * If you want to specify multiple private IP address, use the `PrivateIpAddresses` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddress)
     * @param privateIpAddress Assigns a single private IP address to the network interface, which
     * is used as the primary private IP address. 
     */
    public fun privateIpAddress(privateIpAddress: String)

    /**
     * Assigns private IP addresses to the network interface.
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
     * @param privateIpAddresses Assigns private IP addresses to the network interface. 
     */
    public fun privateIpAddresses(privateIpAddresses: IResolvable)

    /**
     * Assigns private IP addresses to the network interface.
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
     * @param privateIpAddresses Assigns private IP addresses to the network interface. 
     */
    public fun privateIpAddresses(privateIpAddresses: List<Any>)

    /**
     * Assigns private IP addresses to the network interface.
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
     * @param privateIpAddresses Assigns private IP addresses to the network interface. 
     */
    public fun privateIpAddresses(vararg privateIpAddresses: Any)

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
     * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses to
     * assign to a network interface. 
     */
    public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number)

    /**
     * Enable or disable source/destination checks, which ensure that the instance is either the
     * source or the destination of any traffic that it receives.
     *
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-sourcedestcheck)
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives. 
     */
    public fun sourceDestCheck(sourceDestCheck: Boolean)

    /**
     * Enable or disable source/destination checks, which ensure that the instance is either the
     * source or the destination of any traffic that it receives.
     *
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-sourcedestcheck)
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives. 
     */
    public fun sourceDestCheck(sourceDestCheck: IResolvable)

    /**
     * The ID of the subnet to associate with the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-subnetid)
     * @param subnetId The ID of the subnet to associate with the network interface. 
     */
    public fun subnetId(subnetId: String)

    /**
     * An arbitrary set of tags (key-value pairs) for this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this network interface. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An arbitrary set of tags (key-value pairs) for this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this network interface. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkInterface.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInterface.Builder.create(scope, id)

    /**
     * A connection tracking specification for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-connectiontrackingspecification)
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface. 
     */
    override fun connectionTrackingSpecification(connectionTrackingSpecification: IResolvable) {
      cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(IResolvable::unwrap))
    }

    /**
     * A connection tracking specification for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-connectiontrackingspecification)
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface. 
     */
    override
        fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty) {
      cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(ConnectionTrackingSpecificationProperty::unwrap))
    }

    /**
     * A connection tracking specification for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-connectiontrackingspecification)
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05fe79de5ad612a2c211835d2841f358c21d750bc4f66d3040711844d1fd1e55")
    override
        fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty.Builder.() -> Unit):
        Unit =
        connectionTrackingSpecification(ConnectionTrackingSpecificationProperty(connectionTrackingSpecification))

    /**
     * A description for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-description)
     * @param description A description for the network interface. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

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
     * @param enablePrimaryIpv6 If you’re modifying a network interface in a dual-stack or IPv6-only
     * subnet, you have the option to assign a primary IPv6 IP address. 
     */
    override fun enablePrimaryIpv6(enablePrimaryIpv6: Boolean) {
      cdkBuilder.enablePrimaryIpv6(enablePrimaryIpv6)
    }

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
     * @param enablePrimaryIpv6 If you’re modifying a network interface in a dual-stack or IPv6-only
     * subnet, you have the option to assign a primary IPv6 IP address. 
     */
    override fun enablePrimaryIpv6(enablePrimaryIpv6: IResolvable) {
      cdkBuilder.enablePrimaryIpv6(enablePrimaryIpv6.let(IResolvable::unwrap))
    }

    /**
     * The security group IDs associated with this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-groupset)
     * @param groupSet The security group IDs associated with this network interface. 
     */
    override fun groupSet(groupSet: List<String>) {
      cdkBuilder.groupSet(groupSet)
    }

    /**
     * The security group IDs associated with this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-groupset)
     * @param groupSet The security group IDs associated with this network interface. 
     */
    override fun groupSet(vararg groupSet: String): Unit = groupSet(groupSet.toList())

    /**
     * The type of network interface.
     *
     * The default is `interface` . The supported values are `efa` and `trunk` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-interfacetype)
     * @param interfaceType The type of network interface. 
     */
    override fun interfaceType(interfaceType: String) {
      cdkBuilder.interfaceType(interfaceType)
    }

    /**
     * The number of IPv4 prefixes to be automatically assigned to the network interface.
     *
     * When creating a network interface, you can't specify a count of IPv4 prefixes if you've
     * specified one of the following: specific IPv4 prefixes, specific private IPv4 addresses, or a
     * count of private IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixcount)
     * @param ipv4PrefixCount The number of IPv4 prefixes to be automatically assigned to the
     * network interface. 
     */
    override fun ipv4PrefixCount(ipv4PrefixCount: Number) {
      cdkBuilder.ipv4PrefixCount(ipv4PrefixCount)
    }

    /**
     * The IPv4 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixes)
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface. 
     */
    override fun ipv4Prefixes(ipv4Prefixes: IResolvable) {
      cdkBuilder.ipv4Prefixes(ipv4Prefixes.let(IResolvable::unwrap))
    }

    /**
     * The IPv4 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixes)
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface. 
     */
    override fun ipv4Prefixes(ipv4Prefixes: List<Any>) {
      cdkBuilder.ipv4Prefixes(ipv4Prefixes)
    }

    /**
     * The IPv4 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv4 prefixes if you've specified one of
     * the following: a count of IPv4 prefixes, specific private IPv4 addresses, or a count of private
     * IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv4prefixes)
     * @param ipv4Prefixes The IPv4 delegated prefixes that are assigned to the network interface. 
     */
    override fun ipv4Prefixes(vararg ipv4Prefixes: Any): Unit = ipv4Prefixes(ipv4Prefixes.toList())

    /**
     * The number of IPv6 addresses to assign to a network interface.
     *
     * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. To specify
     * specific IPv6 addresses, use the `Ipv6Addresses` property and don't specify this property.
     *
     * When creating a network interface, you can't specify a count of IPv6 addresses if you've
     * specified one of the following: specific IPv6 addresses, specific IPv6 prefixes, or a count of
     * IPv6 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6addresscount)
     * @param ipv6AddressCount The number of IPv6 addresses to assign to a network interface. 
     */
    override fun ipv6AddressCount(ipv6AddressCount: Number) {
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
     * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
     * your subnet to associate with the network interface. 
     */
    override fun ipv6Addresses(ipv6Addresses: IResolvable) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.let(IResolvable::unwrap))
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
     * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
     * your subnet to associate with the network interface. 
     */
    override fun ipv6Addresses(ipv6Addresses: List<Any>) {
      cdkBuilder.ipv6Addresses(ipv6Addresses)
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
     * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
     * your subnet to associate with the network interface. 
     */
    override fun ipv6Addresses(vararg ipv6Addresses: Any): Unit =
        ipv6Addresses(ipv6Addresses.toList())

    /**
     * The number of IPv6 prefixes to be automatically assigned to the network interface.
     *
     * When creating a network interface, you can't specify a count of IPv6 prefixes if you've
     * specified one of the following: specific IPv6 prefixes, specific IPv6 addresses, or a count of
     * IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixcount)
     * @param ipv6PrefixCount The number of IPv6 prefixes to be automatically assigned to the
     * network interface. 
     */
    override fun ipv6PrefixCount(ipv6PrefixCount: Number) {
      cdkBuilder.ipv6PrefixCount(ipv6PrefixCount)
    }

    /**
     * The IPv6 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixes)
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface. 
     */
    override fun ipv6Prefixes(ipv6Prefixes: IResolvable) {
      cdkBuilder.ipv6Prefixes(ipv6Prefixes.let(IResolvable::unwrap))
    }

    /**
     * The IPv6 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixes)
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface. 
     */
    override fun ipv6Prefixes(ipv6Prefixes: List<Any>) {
      cdkBuilder.ipv6Prefixes(ipv6Prefixes)
    }

    /**
     * The IPv6 delegated prefixes that are assigned to the network interface.
     *
     * When creating a network interface, you can't specify IPv6 prefixes if you've specified one of
     * the following: a count of IPv6 prefixes, specific IPv6 addresses, or a count of IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-ipv6prefixes)
     * @param ipv6Prefixes The IPv6 delegated prefixes that are assigned to the network interface. 
     */
    override fun ipv6Prefixes(vararg ipv6Prefixes: Any): Unit = ipv6Prefixes(ipv6Prefixes.toList())

    /**
     * Assigns a single private IP address to the network interface, which is used as the primary
     * private IP address.
     *
     * If you want to specify multiple private IP address, use the `PrivateIpAddresses` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddress)
     * @param privateIpAddress Assigns a single private IP address to the network interface, which
     * is used as the primary private IP address. 
     */
    override fun privateIpAddress(privateIpAddress: String) {
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
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or a
     * count of IPv4 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddresses)
     * @param privateIpAddresses Assigns private IP addresses to the network interface. 
     */
    override fun privateIpAddresses(privateIpAddresses: IResolvable) {
      cdkBuilder.privateIpAddresses(privateIpAddresses.let(IResolvable::unwrap))
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
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or a
     * count of IPv4 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddresses)
     * @param privateIpAddresses Assigns private IP addresses to the network interface. 
     */
    override fun privateIpAddresses(privateIpAddresses: List<Any>) {
      cdkBuilder.privateIpAddresses(privateIpAddresses)
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
     * specified one of the following: a count of private IPv4 addresses, specific IPv4 prefixes, or a
     * count of IPv4 prefixes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddresses)
     * @param privateIpAddresses Assigns private IP addresses to the network interface. 
     */
    override fun privateIpAddresses(vararg privateIpAddresses: Any): Unit =
        privateIpAddresses(privateIpAddresses.toList())

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
     * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses to
     * assign to a network interface. 
     */
    override fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
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
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives. 
     */
    override fun sourceDestCheck(sourceDestCheck: Boolean) {
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
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives. 
     */
    override fun sourceDestCheck(sourceDestCheck: IResolvable) {
      cdkBuilder.sourceDestCheck(sourceDestCheck.let(IResolvable::unwrap))
    }

    /**
     * The ID of the subnet to associate with the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-subnetid)
     * @param subnetId The ID of the subnet to associate with the network interface. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this network interface. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this network interface. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterface = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkInterface {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkInterface(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface):
        CfnNetworkInterface = CfnNetworkInterface(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInterface):
        software.amazon.awscdk.services.ec2.CfnNetworkInterface = wrapped.cdkObject
  }

  public interface PrivateIpAddressSpecificationProperty {
    /**
     * Sets the private IP address as the primary private address.
     *
     * You can set only one primary private IP address. If you don't specify a primary private IP
     * address, Amazon EC2 automatically assigns a primary private IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-privateipaddressspecification.html#cfn-ec2-networkinterface-privateipaddressspecification-primary)
     */
    public fun primary(): Any

    /**
     * The private IP address of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-privateipaddressspecification.html#cfn-ec2-networkinterface-privateipaddressspecification-privateipaddress)
     */
    public fun privateIpAddress(): String

    /**
     * A builder for [PrivateIpAddressSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param primary Sets the private IP address as the primary private address. 
       * You can set only one primary private IP address. If you don't specify a primary private IP
       * address, Amazon EC2 automatically assigns a primary private IP address.
       */
      public fun primary(primary: Boolean)

      /**
       * @param primary Sets the private IP address as the primary private address. 
       * You can set only one primary private IP address. If you don't specify a primary private IP
       * address, Amazon EC2 automatically assigns a primary private IP address.
       */
      public fun primary(primary: IResolvable)

      /**
       * @param privateIpAddress The private IP address of the network interface. 
       */
      public fun privateIpAddress(privateIpAddress: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty.builder()

      /**
       * @param primary Sets the private IP address as the primary private address. 
       * You can set only one primary private IP address. If you don't specify a primary private IP
       * address, Amazon EC2 automatically assigns a primary private IP address.
       */
      override fun primary(primary: Boolean) {
        cdkBuilder.primary(primary)
      }

      /**
       * @param primary Sets the private IP address as the primary private address. 
       * You can set only one primary private IP address. If you don't specify a primary private IP
       * address, Amazon EC2 automatically assigns a primary private IP address.
       */
      override fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary.let(IResolvable::unwrap))
      }

      /**
       * @param privateIpAddress The private IP address of the network interface. 
       */
      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty,
    ) : CdkObject(cdkObject), PrivateIpAddressSpecificationProperty {
      /**
       * Sets the private IP address as the primary private address.
       *
       * You can set only one primary private IP address. If you don't specify a primary private IP
       * address, Amazon EC2 automatically assigns a primary private IP address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-privateipaddressspecification.html#cfn-ec2-networkinterface-privateipaddressspecification-primary)
       */
      override fun primary(): Any = unwrap(this).getPrimary()

      /**
       * The private IP address of the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-privateipaddressspecification.html#cfn-ec2-networkinterface-privateipaddressspecification-privateipaddress)
       */
      override fun privateIpAddress(): String = unwrap(this).getPrivateIpAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrivateIpAddressSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty):
          PrivateIpAddressSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateIpAddressSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty
    }
  }

  public interface Ipv6PrefixSpecificationProperty {
    /**
     * The IPv6 prefix.
     *
     * For information, see [Assigning prefixes to Amazon EC2 network
     * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-ipv6prefixspecification.html#cfn-ec2-networkinterface-ipv6prefixspecification-ipv6prefix)
     */
    public fun ipv6Prefix(): String

    /**
     * A builder for [Ipv6PrefixSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipv6Prefix The IPv6 prefix. 
       * For information, see [Assigning prefixes to Amazon EC2 network
       * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun ipv6Prefix(ipv6Prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty.builder()

      /**
       * @param ipv6Prefix The IPv6 prefix. 
       * For information, see [Assigning prefixes to Amazon EC2 network
       * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun ipv6Prefix(ipv6Prefix: String) {
        cdkBuilder.ipv6Prefix(ipv6Prefix)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty,
    ) : CdkObject(cdkObject), Ipv6PrefixSpecificationProperty {
      /**
       * The IPv6 prefix.
       *
       * For information, see [Assigning prefixes to Amazon EC2 network
       * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-ipv6prefixspecification.html#cfn-ec2-networkinterface-ipv6prefixspecification-ipv6prefix)
       */
      override fun ipv6Prefix(): String = unwrap(this).getIpv6Prefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Ipv6PrefixSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty):
          Ipv6PrefixSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ipv6PrefixSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty
    }
  }

  public interface ConnectionTrackingSpecificationProperty {
    /**
     * Timeout (in seconds) for idle TCP connections in an established state.
     *
     * Min: 60 seconds. Max: 432000 seconds (5 days). Default: 432000 seconds. Recommended: Less
     * than 432000 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-connectiontrackingspecification.html#cfn-ec2-networkinterface-connectiontrackingspecification-tcpestablishedtimeout)
     */
    public fun tcpEstablishedTimeout(): Number? = unwrap(this).getTcpEstablishedTimeout()

    /**
     * Timeout (in seconds) for idle UDP flows classified as streams which have seen more than one
     * request-response transaction.
     *
     * Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-connectiontrackingspecification.html#cfn-ec2-networkinterface-connectiontrackingspecification-udpstreamtimeout)
     */
    public fun udpStreamTimeout(): Number? = unwrap(this).getUdpStreamTimeout()

    /**
     * Timeout (in seconds) for idle UDP flows that have seen traffic only in a single direction or
     * a single request-response transaction.
     *
     * Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-connectiontrackingspecification.html#cfn-ec2-networkinterface-connectiontrackingspecification-udptimeout)
     */
    public fun udpTimeout(): Number? = unwrap(this).getUdpTimeout()

    /**
     * A builder for [ConnectionTrackingSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param tcpEstablishedTimeout Timeout (in seconds) for idle TCP connections in an
       * established state.
       * Min: 60 seconds. Max: 432000 seconds (5 days). Default: 432000 seconds. Recommended: Less
       * than 432000 seconds.
       */
      public fun tcpEstablishedTimeout(tcpEstablishedTimeout: Number)

      /**
       * @param udpStreamTimeout Timeout (in seconds) for idle UDP flows classified as streams which
       * have seen more than one request-response transaction.
       * Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
       */
      public fun udpStreamTimeout(udpStreamTimeout: Number)

      /**
       * @param udpTimeout Timeout (in seconds) for idle UDP flows that have seen traffic only in a
       * single direction or a single request-response transaction.
       * Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
       */
      public fun udpTimeout(udpTimeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty.builder()

      /**
       * @param tcpEstablishedTimeout Timeout (in seconds) for idle TCP connections in an
       * established state.
       * Min: 60 seconds. Max: 432000 seconds (5 days). Default: 432000 seconds. Recommended: Less
       * than 432000 seconds.
       */
      override fun tcpEstablishedTimeout(tcpEstablishedTimeout: Number) {
        cdkBuilder.tcpEstablishedTimeout(tcpEstablishedTimeout)
      }

      /**
       * @param udpStreamTimeout Timeout (in seconds) for idle UDP flows classified as streams which
       * have seen more than one request-response transaction.
       * Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
       */
      override fun udpStreamTimeout(udpStreamTimeout: Number) {
        cdkBuilder.udpStreamTimeout(udpStreamTimeout)
      }

      /**
       * @param udpTimeout Timeout (in seconds) for idle UDP flows that have seen traffic only in a
       * single direction or a single request-response transaction.
       * Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
       */
      override fun udpTimeout(udpTimeout: Number) {
        cdkBuilder.udpTimeout(udpTimeout)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty,
    ) : CdkObject(cdkObject), ConnectionTrackingSpecificationProperty {
      /**
       * Timeout (in seconds) for idle TCP connections in an established state.
       *
       * Min: 60 seconds. Max: 432000 seconds (5 days). Default: 432000 seconds. Recommended: Less
       * than 432000 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-connectiontrackingspecification.html#cfn-ec2-networkinterface-connectiontrackingspecification-tcpestablishedtimeout)
       */
      override fun tcpEstablishedTimeout(): Number? = unwrap(this).getTcpEstablishedTimeout()

      /**
       * Timeout (in seconds) for idle UDP flows classified as streams which have seen more than one
       * request-response transaction.
       *
       * Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-connectiontrackingspecification.html#cfn-ec2-networkinterface-connectiontrackingspecification-udpstreamtimeout)
       */
      override fun udpStreamTimeout(): Number? = unwrap(this).getUdpStreamTimeout()

      /**
       * Timeout (in seconds) for idle UDP flows that have seen traffic only in a single direction
       * or a single request-response transaction.
       *
       * Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-connectiontrackingspecification.html#cfn-ec2-networkinterface-connectiontrackingspecification-udptimeout)
       */
      override fun udpTimeout(): Number? = unwrap(this).getUdpTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectionTrackingSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty):
          ConnectionTrackingSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionTrackingSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty
    }
  }

  public interface InstanceIpv6AddressProperty {
    /**
     * An IPv6 address to associate with the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-instanceipv6address.html#cfn-ec2-networkinterface-instanceipv6address-ipv6address)
     */
    public fun ipv6Address(): String

    /**
     * A builder for [InstanceIpv6AddressProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipv6Address An IPv6 address to associate with the network interface. 
       */
      public fun ipv6Address(ipv6Address: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty.builder()

      /**
       * @param ipv6Address An IPv6 address to associate with the network interface. 
       */
      override fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty,
    ) : CdkObject(cdkObject), InstanceIpv6AddressProperty {
      /**
       * An IPv6 address to associate with the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-instanceipv6address.html#cfn-ec2-networkinterface-instanceipv6address-ipv6address)
       */
      override fun ipv6Address(): String = unwrap(this).getIpv6Address()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceIpv6AddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty):
          InstanceIpv6AddressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceIpv6AddressProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty
    }
  }

  public interface Ipv4PrefixSpecificationProperty {
    /**
     * The IPv4 prefix.
     *
     * For information, see [Assigning prefixes to Amazon EC2 network
     * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-ipv4prefixspecification.html#cfn-ec2-networkinterface-ipv4prefixspecification-ipv4prefix)
     */
    public fun ipv4Prefix(): String

    /**
     * A builder for [Ipv4PrefixSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipv4Prefix The IPv4 prefix. 
       * For information, see [Assigning prefixes to Amazon EC2 network
       * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun ipv4Prefix(ipv4Prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty.builder()

      /**
       * @param ipv4Prefix The IPv4 prefix. 
       * For information, see [Assigning prefixes to Amazon EC2 network
       * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun ipv4Prefix(ipv4Prefix: String) {
        cdkBuilder.ipv4Prefix(ipv4Prefix)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty,
    ) : CdkObject(cdkObject), Ipv4PrefixSpecificationProperty {
      /**
       * The IPv4 prefix.
       *
       * For information, see [Assigning prefixes to Amazon EC2 network
       * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-ipv4prefixspecification.html#cfn-ec2-networkinterface-ipv4prefixspecification-ipv4prefix)
       */
      override fun ipv4Prefix(): String = unwrap(this).getIpv4Prefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Ipv4PrefixSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty):
          Ipv4PrefixSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ipv4PrefixSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty
    }
  }
}