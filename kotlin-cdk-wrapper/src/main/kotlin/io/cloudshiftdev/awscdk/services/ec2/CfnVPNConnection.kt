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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a VPN connection between a virtual private gateway and a VPN customer gateway or a
 * transit gateway and a VPN customer gateway.
 *
 * To specify a VPN connection between a transit gateway and customer gateway, use the
 * `TransitGatewayId` and `CustomerGatewayId` properties.
 *
 * To specify a VPN connection between a virtual private gateway and customer gateway, use the
 * `VpnGatewayId` and `CustomerGatewayId` properties.
 *
 * For more information, see [AWS Site-to-Site
 * VPN](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html) in the *AWS Site-to-Site VPN User
 * Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPNConnection cfnVPNConnection = CfnVPNConnection.Builder.create(this, "MyCfnVPNConnection")
 * .customerGatewayId("customerGatewayId")
 * .type("type")
 * // the properties below are optional
 * .enableAcceleration(false)
 * .localIpv4NetworkCidr("localIpv4NetworkCidr")
 * .localIpv6NetworkCidr("localIpv6NetworkCidr")
 * .outsideIpAddressType("outsideIpAddressType")
 * .remoteIpv4NetworkCidr("remoteIpv4NetworkCidr")
 * .remoteIpv6NetworkCidr("remoteIpv6NetworkCidr")
 * .staticRoutesOnly(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .transitGatewayId("transitGatewayId")
 * .transportTransitGatewayAttachmentId("transportTransitGatewayAttachmentId")
 * .tunnelInsideIpVersion("tunnelInsideIpVersion")
 * .vpnGatewayId("vpnGatewayId")
 * .vpnTunnelOptionsSpecifications(List.of(VpnTunnelOptionsSpecificationProperty.builder()
 * .preSharedKey("preSharedKey")
 * .tunnelInsideCidr("tunnelInsideCidr")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html)
 */
public open class CfnVPNConnection(
  cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPNConnectionProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVPNConnection(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVPNConnectionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPNConnectionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVPNConnectionProps(props)
  )

  /**
   * The ID of the VPN connection.
   */
  public open fun attrVpnConnectionId(): String = unwrap(this).getAttrVpnConnectionId()

  /**
   * The ID of the customer gateway at your end of the VPN connection.
   */
  public open fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

  /**
   * The ID of the customer gateway at your end of the VPN connection.
   */
  public open fun customerGatewayId(`value`: String) {
    unwrap(this).setCustomerGatewayId(`value`)
  }

  /**
   * Indicate whether to enable acceleration for the VPN connection.
   */
  public open fun enableAcceleration(): Any? = unwrap(this).getEnableAcceleration()

  /**
   * Indicate whether to enable acceleration for the VPN connection.
   */
  public open fun enableAcceleration(`value`: Boolean) {
    unwrap(this).setEnableAcceleration(`value`)
  }

  /**
   * Indicate whether to enable acceleration for the VPN connection.
   */
  public open fun enableAcceleration(`value`: IResolvable) {
    unwrap(this).setEnableAcceleration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
   */
  public open fun localIpv4NetworkCidr(): String? = unwrap(this).getLocalIpv4NetworkCidr()

  /**
   * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
   */
  public open fun localIpv4NetworkCidr(`value`: String) {
    unwrap(this).setLocalIpv4NetworkCidr(`value`)
  }

  /**
   * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
   */
  public open fun localIpv6NetworkCidr(): String? = unwrap(this).getLocalIpv6NetworkCidr()

  /**
   * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
   */
  public open fun localIpv6NetworkCidr(`value`: String) {
    unwrap(this).setLocalIpv6NetworkCidr(`value`)
  }

  /**
   * The type of IPv4 address assigned to the outside interface of the customer gateway device.
   */
  public open fun outsideIpAddressType(): String? = unwrap(this).getOutsideIpAddressType()

  /**
   * The type of IPv4 address assigned to the outside interface of the customer gateway device.
   */
  public open fun outsideIpAddressType(`value`: String) {
    unwrap(this).setOutsideIpAddressType(`value`)
  }

  /**
   * The IPv4 CIDR on the AWS side of the VPN connection.
   */
  public open fun remoteIpv4NetworkCidr(): String? = unwrap(this).getRemoteIpv4NetworkCidr()

  /**
   * The IPv4 CIDR on the AWS side of the VPN connection.
   */
  public open fun remoteIpv4NetworkCidr(`value`: String) {
    unwrap(this).setRemoteIpv4NetworkCidr(`value`)
  }

  /**
   * The IPv6 CIDR on the AWS side of the VPN connection.
   */
  public open fun remoteIpv6NetworkCidr(): String? = unwrap(this).getRemoteIpv6NetworkCidr()

  /**
   * The IPv6 CIDR on the AWS side of the VPN connection.
   */
  public open fun remoteIpv6NetworkCidr(`value`: String) {
    unwrap(this).setRemoteIpv6NetworkCidr(`value`)
  }

  /**
   * Indicates whether the VPN connection uses static routes only.
   */
  public open fun staticRoutesOnly(): Any? = unwrap(this).getStaticRoutesOnly()

  /**
   * Indicates whether the VPN connection uses static routes only.
   */
  public open fun staticRoutesOnly(`value`: Boolean) {
    unwrap(this).setStaticRoutesOnly(`value`)
  }

  /**
   * Indicates whether the VPN connection uses static routes only.
   */
  public open fun staticRoutesOnly(`value`: IResolvable) {
    unwrap(this).setStaticRoutesOnly(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Any tags assigned to the VPN connection.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Any tags assigned to the VPN connection.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Any tags assigned to the VPN connection.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the transit gateway associated with the VPN connection.
   */
  public open fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

  /**
   * The ID of the transit gateway associated with the VPN connection.
   */
  public open fun transitGatewayId(`value`: String) {
    unwrap(this).setTransitGatewayId(`value`)
  }

  /**
   * The transit gateway attachment ID to use for the VPN tunnel.
   */
  public open fun transportTransitGatewayAttachmentId(): String? =
      unwrap(this).getTransportTransitGatewayAttachmentId()

  /**
   * The transit gateway attachment ID to use for the VPN tunnel.
   */
  public open fun transportTransitGatewayAttachmentId(`value`: String) {
    unwrap(this).setTransportTransitGatewayAttachmentId(`value`)
  }

  /**
   * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
   */
  public open fun tunnelInsideIpVersion(): String? = unwrap(this).getTunnelInsideIpVersion()

  /**
   * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
   */
  public open fun tunnelInsideIpVersion(`value`: String) {
    unwrap(this).setTunnelInsideIpVersion(`value`)
  }

  /**
   * The type of VPN connection.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of VPN connection.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The ID of the virtual private gateway at the AWS side of the VPN connection.
   */
  public open fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  /**
   * The ID of the virtual private gateway at the AWS side of the VPN connection.
   */
  public open fun vpnGatewayId(`value`: String) {
    unwrap(this).setVpnGatewayId(`value`)
  }

  /**
   * The tunnel options for the VPN connection.
   */
  public open fun vpnTunnelOptionsSpecifications(): Any? =
      unwrap(this).getVpnTunnelOptionsSpecifications()

  /**
   * The tunnel options for the VPN connection.
   */
  public open fun vpnTunnelOptionsSpecifications(`value`: IResolvable) {
    unwrap(this).setVpnTunnelOptionsSpecifications(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The tunnel options for the VPN connection.
   */
  public open fun vpnTunnelOptionsSpecifications(`value`: List<Any>) {
    unwrap(this).setVpnTunnelOptionsSpecifications(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The tunnel options for the VPN connection.
   */
  public open fun vpnTunnelOptionsSpecifications(vararg `value`: Any): Unit =
      vpnTunnelOptionsSpecifications(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPNConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the customer gateway at your end of the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-customergatewayid)
     * @param customerGatewayId The ID of the customer gateway at your end of the VPN connection. 
     */
    public fun customerGatewayId(customerGatewayId: String)

    /**
     * Indicate whether to enable acceleration for the VPN connection.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-enableacceleration)
     * @param enableAcceleration Indicate whether to enable acceleration for the VPN connection. 
     */
    public fun enableAcceleration(enableAcceleration: Boolean)

    /**
     * Indicate whether to enable acceleration for the VPN connection.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-enableacceleration)
     * @param enableAcceleration Indicate whether to enable acceleration for the VPN connection. 
     */
    public fun enableAcceleration(enableAcceleration: IResolvable)

    /**
     * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
     *
     * Default: `0.0.0.0/0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-localipv4networkcidr)
     * @param localIpv4NetworkCidr The IPv4 CIDR on the customer gateway (on-premises) side of the
     * VPN connection. 
     */
    public fun localIpv4NetworkCidr(localIpv4NetworkCidr: String)

    /**
     * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
     *
     * Default: `::/0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-localipv6networkcidr)
     * @param localIpv6NetworkCidr The IPv6 CIDR on the customer gateway (on-premises) side of the
     * VPN connection. 
     */
    public fun localIpv6NetworkCidr(localIpv6NetworkCidr: String)

    /**
     * The type of IPv4 address assigned to the outside interface of the customer gateway device.
     *
     * Valid values: `PrivateIpv4` | `PublicIpv4`
     *
     * Default: `PublicIpv4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-outsideipaddresstype)
     * @param outsideIpAddressType The type of IPv4 address assigned to the outside interface of the
     * customer gateway device. 
     */
    public fun outsideIpAddressType(outsideIpAddressType: String)

    /**
     * The IPv4 CIDR on the AWS side of the VPN connection.
     *
     * Default: `0.0.0.0/0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-remoteipv4networkcidr)
     * @param remoteIpv4NetworkCidr The IPv4 CIDR on the AWS side of the VPN connection. 
     */
    public fun remoteIpv4NetworkCidr(remoteIpv4NetworkCidr: String)

    /**
     * The IPv6 CIDR on the AWS side of the VPN connection.
     *
     * Default: `::/0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-remoteipv6networkcidr)
     * @param remoteIpv6NetworkCidr The IPv6 CIDR on the AWS side of the VPN connection. 
     */
    public fun remoteIpv6NetworkCidr(remoteIpv6NetworkCidr: String)

    /**
     * Indicates whether the VPN connection uses static routes only.
     *
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-staticroutesonly)
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only. 
     */
    public fun staticRoutesOnly(staticRoutesOnly: Boolean)

    /**
     * Indicates whether the VPN connection uses static routes only.
     *
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-staticroutesonly)
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only. 
     */
    public fun staticRoutesOnly(staticRoutesOnly: IResolvable)

    /**
     * Any tags assigned to the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tags)
     * @param tags Any tags assigned to the VPN connection. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags assigned to the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tags)
     * @param tags Any tags assigned to the VPN connection. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the transit gateway associated with the VPN connection.
     *
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway associated with the VPN connection. 
     */
    public fun transitGatewayId(transitGatewayId: String)

    /**
     * The transit gateway attachment ID to use for the VPN tunnel.
     *
     * Required if `OutsideIpAddressType` is set to `PrivateIpv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-transporttransitgatewayattachmentid)
     * @param transportTransitGatewayAttachmentId The transit gateway attachment ID to use for the
     * VPN tunnel. 
     */
    public fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String)

    /**
     * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
     *
     * Default: `ipv4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tunnelinsideipversion)
     * @param tunnelInsideIpVersion Indicate whether the VPN tunnels process IPv4 or IPv6 traffic. 
     */
    public fun tunnelInsideIpVersion(tunnelInsideIpVersion: String)

    /**
     * The type of VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-type)
     * @param type The type of VPN connection. 
     */
    public fun type(type: String)

    /**
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     *
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpngatewayid)
     * @param vpnGatewayId The ID of the virtual private gateway at the AWS side of the VPN
     * connection. 
     */
    public fun vpnGatewayId(vpnGatewayId: String)

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. 
     */
    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable)

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. 
     */
    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: List<Any>)

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. 
     */
    public fun vpnTunnelOptionsSpecifications(vararg vpnTunnelOptionsSpecifications: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPNConnection.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNConnection.Builder.create(scope, id)

    /**
     * The ID of the customer gateway at your end of the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-customergatewayid)
     * @param customerGatewayId The ID of the customer gateway at your end of the VPN connection. 
     */
    override fun customerGatewayId(customerGatewayId: String) {
      cdkBuilder.customerGatewayId(customerGatewayId)
    }

    /**
     * Indicate whether to enable acceleration for the VPN connection.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-enableacceleration)
     * @param enableAcceleration Indicate whether to enable acceleration for the VPN connection. 
     */
    override fun enableAcceleration(enableAcceleration: Boolean) {
      cdkBuilder.enableAcceleration(enableAcceleration)
    }

    /**
     * Indicate whether to enable acceleration for the VPN connection.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-enableacceleration)
     * @param enableAcceleration Indicate whether to enable acceleration for the VPN connection. 
     */
    override fun enableAcceleration(enableAcceleration: IResolvable) {
      cdkBuilder.enableAcceleration(enableAcceleration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
     *
     * Default: `0.0.0.0/0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-localipv4networkcidr)
     * @param localIpv4NetworkCidr The IPv4 CIDR on the customer gateway (on-premises) side of the
     * VPN connection. 
     */
    override fun localIpv4NetworkCidr(localIpv4NetworkCidr: String) {
      cdkBuilder.localIpv4NetworkCidr(localIpv4NetworkCidr)
    }

    /**
     * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
     *
     * Default: `::/0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-localipv6networkcidr)
     * @param localIpv6NetworkCidr The IPv6 CIDR on the customer gateway (on-premises) side of the
     * VPN connection. 
     */
    override fun localIpv6NetworkCidr(localIpv6NetworkCidr: String) {
      cdkBuilder.localIpv6NetworkCidr(localIpv6NetworkCidr)
    }

    /**
     * The type of IPv4 address assigned to the outside interface of the customer gateway device.
     *
     * Valid values: `PrivateIpv4` | `PublicIpv4`
     *
     * Default: `PublicIpv4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-outsideipaddresstype)
     * @param outsideIpAddressType The type of IPv4 address assigned to the outside interface of the
     * customer gateway device. 
     */
    override fun outsideIpAddressType(outsideIpAddressType: String) {
      cdkBuilder.outsideIpAddressType(outsideIpAddressType)
    }

    /**
     * The IPv4 CIDR on the AWS side of the VPN connection.
     *
     * Default: `0.0.0.0/0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-remoteipv4networkcidr)
     * @param remoteIpv4NetworkCidr The IPv4 CIDR on the AWS side of the VPN connection. 
     */
    override fun remoteIpv4NetworkCidr(remoteIpv4NetworkCidr: String) {
      cdkBuilder.remoteIpv4NetworkCidr(remoteIpv4NetworkCidr)
    }

    /**
     * The IPv6 CIDR on the AWS side of the VPN connection.
     *
     * Default: `::/0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-remoteipv6networkcidr)
     * @param remoteIpv6NetworkCidr The IPv6 CIDR on the AWS side of the VPN connection. 
     */
    override fun remoteIpv6NetworkCidr(remoteIpv6NetworkCidr: String) {
      cdkBuilder.remoteIpv6NetworkCidr(remoteIpv6NetworkCidr)
    }

    /**
     * Indicates whether the VPN connection uses static routes only.
     *
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-staticroutesonly)
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only. 
     */
    override fun staticRoutesOnly(staticRoutesOnly: Boolean) {
      cdkBuilder.staticRoutesOnly(staticRoutesOnly)
    }

    /**
     * Indicates whether the VPN connection uses static routes only.
     *
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-staticroutesonly)
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only. 
     */
    override fun staticRoutesOnly(staticRoutesOnly: IResolvable) {
      cdkBuilder.staticRoutesOnly(staticRoutesOnly.let(IResolvable.Companion::unwrap))
    }

    /**
     * Any tags assigned to the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tags)
     * @param tags Any tags assigned to the VPN connection. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Any tags assigned to the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tags)
     * @param tags Any tags assigned to the VPN connection. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the transit gateway associated with the VPN connection.
     *
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway associated with the VPN connection. 
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /**
     * The transit gateway attachment ID to use for the VPN tunnel.
     *
     * Required if `OutsideIpAddressType` is set to `PrivateIpv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-transporttransitgatewayattachmentid)
     * @param transportTransitGatewayAttachmentId The transit gateway attachment ID to use for the
     * VPN tunnel. 
     */
    override fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String) {
      cdkBuilder.transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId)
    }

    /**
     * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
     *
     * Default: `ipv4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tunnelinsideipversion)
     * @param tunnelInsideIpVersion Indicate whether the VPN tunnels process IPv4 or IPv6 traffic. 
     */
    override fun tunnelInsideIpVersion(tunnelInsideIpVersion: String) {
      cdkBuilder.tunnelInsideIpVersion(tunnelInsideIpVersion)
    }

    /**
     * The type of VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-type)
     * @param type The type of VPN connection. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     *
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpngatewayid)
     * @param vpnGatewayId The ID of the virtual private gateway at the AWS side of the VPN
     * connection. 
     */
    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. 
     */
    override fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable) {
      cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. 
     */
    override fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: List<Any>) {
      cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. 
     */
    override fun vpnTunnelOptionsSpecifications(vararg vpnTunnelOptionsSpecifications: Any): Unit =
        vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNConnection = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPNConnection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPNConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPNConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection):
        CfnVPNConnection = CfnVPNConnection(cdkObject)

    internal fun unwrap(wrapped: CfnVPNConnection):
        software.amazon.awscdk.services.ec2.CfnVPNConnection = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPNConnection
  }

  /**
   * The tunnel options for a single VPN tunnel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * VpnTunnelOptionsSpecificationProperty vpnTunnelOptionsSpecificationProperty =
   * VpnTunnelOptionsSpecificationProperty.builder()
   * .preSharedKey("preSharedKey")
   * .tunnelInsideCidr("tunnelInsideCidr")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html)
   */
  public interface VpnTunnelOptionsSpecificationProperty {
    /**
     * The pre-shared key (PSK) to establish initial authentication between the virtual private
     * gateway and customer gateway.
     *
     * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores
     * (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey)
     */
    public fun preSharedKey(): String? = unwrap(this).getPreSharedKey()

    /**
     * The range of inside IP addresses for the tunnel.
     *
     * Any specified CIDR blocks must be unique across all VPN connections that use the same virtual
     * private gateway.
     *
     * Constraints: A size /30 CIDR block from the `169.254.0.0/16` range. The following CIDR blocks
     * are reserved and cannot be used:
     *
     * * `169.254.0.0/30`
     * * `169.254.1.0/30`
     * * `169.254.2.0/30`
     * * `169.254.3.0/30`
     * * `169.254.4.0/30`
     * * `169.254.5.0/30`
     * * `169.254.169.252/30`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr)
     */
    public fun tunnelInsideCidr(): String? = unwrap(this).getTunnelInsideCidr()

    /**
     * A builder for [VpnTunnelOptionsSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param preSharedKey The pre-shared key (PSK) to establish initial authentication between
       * the virtual private gateway and customer gateway.
       * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores
       * (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
       */
      public fun preSharedKey(preSharedKey: String)

      /**
       * @param tunnelInsideCidr The range of inside IP addresses for the tunnel.
       * Any specified CIDR blocks must be unique across all VPN connections that use the same
       * virtual private gateway.
       *
       * Constraints: A size /30 CIDR block from the `169.254.0.0/16` range. The following CIDR
       * blocks are reserved and cannot be used:
       *
       * * `169.254.0.0/30`
       * * `169.254.1.0/30`
       * * `169.254.2.0/30`
       * * `169.254.3.0/30`
       * * `169.254.4.0/30`
       * * `169.254.5.0/30`
       * * `169.254.169.252/30`
       */
      public fun tunnelInsideCidr(tunnelInsideCidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.builder()

      /**
       * @param preSharedKey The pre-shared key (PSK) to establish initial authentication between
       * the virtual private gateway and customer gateway.
       * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores
       * (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
       */
      override fun preSharedKey(preSharedKey: String) {
        cdkBuilder.preSharedKey(preSharedKey)
      }

      /**
       * @param tunnelInsideCidr The range of inside IP addresses for the tunnel.
       * Any specified CIDR blocks must be unique across all VPN connections that use the same
       * virtual private gateway.
       *
       * Constraints: A size /30 CIDR block from the `169.254.0.0/16` range. The following CIDR
       * blocks are reserved and cannot be used:
       *
       * * `169.254.0.0/30`
       * * `169.254.1.0/30`
       * * `169.254.2.0/30`
       * * `169.254.3.0/30`
       * * `169.254.4.0/30`
       * * `169.254.5.0/30`
       * * `169.254.169.252/30`
       */
      override fun tunnelInsideCidr(tunnelInsideCidr: String) {
        cdkBuilder.tunnelInsideCidr(tunnelInsideCidr)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty,
    ) : CdkObject(cdkObject),
        VpnTunnelOptionsSpecificationProperty {
      /**
       * The pre-shared key (PSK) to establish initial authentication between the virtual private
       * gateway and customer gateway.
       *
       * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores
       * (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-presharedkey)
       */
      override fun preSharedKey(): String? = unwrap(this).getPreSharedKey()

      /**
       * The range of inside IP addresses for the tunnel.
       *
       * Any specified CIDR blocks must be unique across all VPN connections that use the same
       * virtual private gateway.
       *
       * Constraints: A size /30 CIDR block from the `169.254.0.0/16` range. The following CIDR
       * blocks are reserved and cannot be used:
       *
       * * `169.254.0.0/30`
       * * `169.254.1.0/30`
       * * `169.254.2.0/30`
       * * `169.254.3.0/30`
       * * `169.254.4.0/30`
       * * `169.254.5.0/30`
       * * `169.254.169.252/30`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsidecidr)
       */
      override fun tunnelInsideCidr(): String? = unwrap(this).getTunnelInsideCidr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VpnTunnelOptionsSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty):
          VpnTunnelOptionsSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpnTunnelOptionsSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpnTunnelOptionsSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty
    }
  }
}
