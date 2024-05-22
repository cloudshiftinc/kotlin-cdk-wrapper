@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Describes a network interface in an Amazon EC2 instance for AWS CloudFormation .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkInterface cfnNetworkInterface = CfnNetworkInterface.Builder.create(this,
 * "MyCfnNetworkInterface")
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
public open class CfnNetworkInterface(
  cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkInterfaceProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnNetworkInterface(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnNetworkInterfaceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkInterfaceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNetworkInterfaceProps(props)
  )

  /**
   * The ID of the network interface.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The primary IPv6 address of the network interface.
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
   * The ID of the VPC.
   */
  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  /**
   * A connection tracking specification for the network interface.
   */
  public open fun connectionTrackingSpecification(): Any? =
      unwrap(this).getConnectionTrackingSpecification()

  /**
   * A connection tracking specification for the network interface.
   */
  public open fun connectionTrackingSpecification(`value`: IResolvable) {
    unwrap(this).setConnectionTrackingSpecification(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A connection tracking specification for the network interface.
   */
  public open
      fun connectionTrackingSpecification(`value`: ConnectionTrackingSpecificationProperty) {
    unwrap(this).setConnectionTrackingSpecification(`value`.let(ConnectionTrackingSpecificationProperty.Companion::unwrap))
  }

  /**
   * A connection tracking specification for the network interface.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).setEnablePrimaryIpv6(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The IDs of the security groups associated with this network interface.
   */
  public open fun groupSet(): List<String> = unwrap(this).getGroupSet() ?: emptyList()

  /**
   * The IDs of the security groups associated with this network interface.
   */
  public open fun groupSet(`value`: List<String>) {
    unwrap(this).setGroupSet(`value`)
  }

  /**
   * The IDs of the security groups associated with this network interface.
   */
  public open fun groupSet(vararg `value`: String): Unit = groupSet(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    unwrap(this).setIpv4Prefixes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The IPv4 delegated prefixes that are assigned to the network interface.
   */
  public open fun ipv4Prefixes(`value`: List<Any>) {
    unwrap(this).setIpv4Prefixes(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The IPv4 delegated prefixes that are assigned to the network interface.
   */
  public open fun ipv4Prefixes(vararg `value`: Any): Unit = ipv4Prefixes(`value`.toList())

  /**
   * The number of IPv6 addresses to assign to the network interface.
   */
  public open fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

  /**
   * The number of IPv6 addresses to assign to the network interface.
   */
  public open fun ipv6AddressCount(`value`: Number) {
    unwrap(this).setIpv6AddressCount(`value`)
  }

  /**
   * The IPv6 addresses from the IPv6 CIDR block range of your subnet to assign to the network
   * interface.
   */
  public open fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

  /**
   * The IPv6 addresses from the IPv6 CIDR block range of your subnet to assign to the network
   * interface.
   */
  public open fun ipv6Addresses(`value`: IResolvable) {
    unwrap(this).setIpv6Addresses(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The IPv6 addresses from the IPv6 CIDR block range of your subnet to assign to the network
   * interface.
   */
  public open fun ipv6Addresses(`value`: List<Any>) {
    unwrap(this).setIpv6Addresses(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The IPv6 addresses from the IPv6 CIDR block range of your subnet to assign to the network
   * interface.
   */
  public open fun ipv6Addresses(vararg `value`: Any): Unit = ipv6Addresses(`value`.toList())

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
    unwrap(this).setIpv6Prefixes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The IPv6 delegated prefixes that are assigned to the network interface.
   */
  public open fun ipv6Prefixes(`value`: List<Any>) {
    unwrap(this).setIpv6Prefixes(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The IPv6 delegated prefixes that are assigned to the network interface.
   */
  public open fun ipv6Prefixes(vararg `value`: Any): Unit = ipv6Prefixes(`value`.toList())

  /**
   * The private IPv4 address to assign to the network interface as the primary private IP address.
   */
  public open fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  /**
   * The private IPv4 address to assign to the network interface as the primary private IP address.
   */
  public open fun privateIpAddress(`value`: String) {
    unwrap(this).setPrivateIpAddress(`value`)
  }

  /**
   * The private IPv4 addresses to assign to the network interface.
   */
  public open fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

  /**
   * The private IPv4 addresses to assign to the network interface.
   */
  public open fun privateIpAddresses(`value`: IResolvable) {
    unwrap(this).setPrivateIpAddresses(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The private IPv4 addresses to assign to the network interface.
   */
  public open fun privateIpAddresses(`value`: List<Any>) {
    unwrap(this).setPrivateIpAddresses(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The private IPv4 addresses to assign to the network interface.
   */
  public open fun privateIpAddresses(vararg `value`: Any): Unit =
      privateIpAddresses(`value`.toList())

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
    unwrap(this).setSourceDestCheck(`value`.let(IResolvable.Companion::unwrap))
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
   * The tags to apply to the network interface.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to apply to the network interface.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to apply to the network interface.
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
     * The IDs of the security groups associated with this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-groupset)
     * @param groupSet The IDs of the security groups associated with this network interface. 
     */
    public fun groupSet(groupSet: List<String>)

    /**
     * The IDs of the security groups associated with this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-groupset)
     * @param groupSet The IDs of the security groups associated with this network interface. 
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
     * @param ipv6AddressCount The number of IPv6 addresses to assign to the network interface. 
     */
    public fun ipv6AddressCount(ipv6AddressCount: Number)

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
     * @param ipv6Addresses The IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * assign to the network interface. 
     */
    public fun ipv6Addresses(ipv6Addresses: IResolvable)

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
     * @param ipv6Addresses The IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * assign to the network interface. 
     */
    public fun ipv6Addresses(ipv6Addresses: List<Any>)

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
     * @param ipv6Addresses The IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * assign to the network interface. 
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
     * The private IPv4 address to assign to the network interface as the primary private IP
     * address.
     *
     * If you want to specify multiple private IP addresses, use the `PrivateIpAddresses` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddress)
     * @param privateIpAddress The private IPv4 address to assign to the network interface as the
     * primary private IP address. 
     */
    public fun privateIpAddress(privateIpAddress: String)

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
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface. 
     */
    public fun privateIpAddresses(privateIpAddresses: IResolvable)

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
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface. 
     */
    public fun privateIpAddresses(privateIpAddresses: List<Any>)

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
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface. 
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
     * The tags to apply to the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-tags)
     * @param tags The tags to apply to the network interface. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to apply to the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-tags)
     * @param tags The tags to apply to the network interface. 
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
      cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(ConnectionTrackingSpecificationProperty.Companion::unwrap))
    }

    /**
     * A connection tracking specification for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-connectiontrackingspecification)
     * @param connectionTrackingSpecification A connection tracking specification for the network
     * interface. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.enablePrimaryIpv6(enablePrimaryIpv6.let(IResolvable.Companion::unwrap))
    }

    /**
     * The IDs of the security groups associated with this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-groupset)
     * @param groupSet The IDs of the security groups associated with this network interface. 
     */
    override fun groupSet(groupSet: List<String>) {
      cdkBuilder.groupSet(groupSet)
    }

    /**
     * The IDs of the security groups associated with this network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-groupset)
     * @param groupSet The IDs of the security groups associated with this network interface. 
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
      cdkBuilder.ipv4Prefixes(ipv4Prefixes.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.ipv4Prefixes(ipv4Prefixes.map{CdkObjectWrappers.unwrap(it)})
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
     * @param ipv6AddressCount The number of IPv6 addresses to assign to the network interface. 
     */
    override fun ipv6AddressCount(ipv6AddressCount: Number) {
      cdkBuilder.ipv6AddressCount(ipv6AddressCount)
    }

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
     * @param ipv6Addresses The IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * assign to the network interface. 
     */
    override fun ipv6Addresses(ipv6Addresses: IResolvable) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.let(IResolvable.Companion::unwrap))
    }

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
     * @param ipv6Addresses The IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * assign to the network interface. 
     */
    override fun ipv6Addresses(ipv6Addresses: List<Any>) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * @param ipv6Addresses The IPv6 addresses from the IPv6 CIDR block range of your subnet to
     * assign to the network interface. 
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
      cdkBuilder.ipv6Prefixes(ipv6Prefixes.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.ipv6Prefixes(ipv6Prefixes.map{CdkObjectWrappers.unwrap(it)})
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
     * The private IPv4 address to assign to the network interface as the primary private IP
     * address.
     *
     * If you want to specify multiple private IP addresses, use the `PrivateIpAddresses` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-privateipaddress)
     * @param privateIpAddress The private IPv4 address to assign to the network interface as the
     * primary private IP address. 
     */
    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

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
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface. 
     */
    override fun privateIpAddresses(privateIpAddresses: IResolvable) {
      cdkBuilder.privateIpAddresses(privateIpAddresses.let(IResolvable.Companion::unwrap))
    }

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
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface. 
     */
    override fun privateIpAddresses(privateIpAddresses: List<Any>) {
      cdkBuilder.privateIpAddresses(privateIpAddresses.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * @param privateIpAddresses The private IPv4 addresses to assign to the network interface. 
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
      cdkBuilder.sourceDestCheck(sourceDestCheck.let(IResolvable.Companion::unwrap))
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
     * The tags to apply to the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-tags)
     * @param tags The tags to apply to the network interface. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to apply to the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#cfn-ec2-networkinterface-tags)
     * @param tags The tags to apply to the network interface. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterface = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnNetworkInterface.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.ec2.CfnNetworkInterface = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnNetworkInterface
  }

  /**
   * Configurable options for connection tracking on a network interface.
   *
   * For more information, see [Connection tracking
   * timeouts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#connection-tracking-timeouts)
   * in the *Amazon Elastic Compute Cloud User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ConnectionTrackingSpecificationProperty connectionTrackingSpecificationProperty =
   * ConnectionTrackingSpecificationProperty.builder()
   * .tcpEstablishedTimeout(123)
   * .udpStreamTimeout(123)
   * .udpTimeout(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-connectiontrackingspecification.html)
   */
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
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty,
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
          ConnectionTrackingSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectionTrackingSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionTrackingSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.ConnectionTrackingSpecificationProperty
    }
  }

  /**
   * Describes the IPv6 addresses to associate with the network interface.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * InstanceIpv6AddressProperty instanceIpv6AddressProperty = InstanceIpv6AddressProperty.builder()
   * .ipv6Address("ipv6Address")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-instanceipv6address.html)
   */
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
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty,
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
          InstanceIpv6AddressProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceIpv6AddressProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceIpv6AddressProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.InstanceIpv6AddressProperty
    }
  }

  /**
   * Describes an IPv4 prefix.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * Ipv4PrefixSpecificationProperty ipv4PrefixSpecificationProperty =
   * Ipv4PrefixSpecificationProperty.builder()
   * .ipv4Prefix("ipv4Prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-ipv4prefixspecification.html)
   */
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
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty,
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
          Ipv4PrefixSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Ipv4PrefixSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ipv4PrefixSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv4PrefixSpecificationProperty
    }
  }

  /**
   * Describes the IPv6 prefix.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * Ipv6PrefixSpecificationProperty ipv6PrefixSpecificationProperty =
   * Ipv6PrefixSpecificationProperty.builder()
   * .ipv6Prefix("ipv6Prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-ipv6prefixspecification.html)
   */
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
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty,
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
          Ipv6PrefixSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Ipv6PrefixSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ipv6PrefixSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.Ipv6PrefixSpecificationProperty
    }
  }

  /**
   * Describes a secondary private IPv4 address for a network interface.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PrivateIpAddressSpecificationProperty privateIpAddressSpecificationProperty =
   * PrivateIpAddressSpecificationProperty.builder()
   * .primary(false)
   * .privateIpAddress("privateIpAddress")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-privateipaddressspecification.html)
   */
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
        cdkBuilder.primary(primary.let(IResolvable.Companion::unwrap))
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
      cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty,
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
          PrivateIpAddressSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PrivateIpAddressSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateIpAddressSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty
    }
  }
}
