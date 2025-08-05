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
 * .dpdTimeoutAction("dpdTimeoutAction")
 * .dpdTimeoutSeconds(123)
 * .enableTunnelLifecycleControl(false)
 * .ikeVersions(List.of(Map.of(
 * "value", "value")))
 * .logOptions(VpnTunnelLogOptionsSpecificationProperty.builder()
 * .cloudwatchLogOptions(CloudwatchLogOptionsSpecificationProperty.builder()
 * .logEnabled(false)
 * .logGroupArn("logGroupArn")
 * .logOutputFormat("logOutputFormat")
 * .build())
 * .build())
 * .phase1DhGroupNumbers(List.of(Phase1DHGroupNumbersRequestListValueProperty.builder()
 * .value(123)
 * .build()))
 * .phase1EncryptionAlgorithms(List.of(Phase1EncryptionAlgorithmsRequestListValueProperty.builder()
 * .value("value")
 * .build()))
 * .phase1IntegrityAlgorithms(List.of(Phase1IntegrityAlgorithmsRequestListValueProperty.builder()
 * .value("value")
 * .build()))
 * .phase1LifetimeSeconds(123)
 * .phase2DhGroupNumbers(List.of(Phase2DHGroupNumbersRequestListValueProperty.builder()
 * .value(123)
 * .build()))
 * .phase2EncryptionAlgorithms(List.of(Phase2EncryptionAlgorithmsRequestListValueProperty.builder()
 * .value("value")
 * .build()))
 * .phase2IntegrityAlgorithms(List.of(Phase2IntegrityAlgorithmsRequestListValueProperty.builder()
 * .value("value")
 * .build()))
 * .phase2LifetimeSeconds(123)
 * .preSharedKey("preSharedKey")
 * .rekeyFuzzPercentage(123)
 * .rekeyMarginTimeSeconds(123)
 * .replayWindowSize(123)
 * .startupAction("startupAction")
 * .tunnelInsideCidr("tunnelInsideCidr")
 * .tunnelInsideIpv6Cidr("tunnelInsideIpv6Cidr")
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
   * The type of IP address assigned to the outside interface of the customer gateway device.
   */
  public open fun outsideIpAddressType(): String? = unwrap(this).getOutsideIpAddressType()

  /**
   * The type of IP address assigned to the outside interface of the customer gateway device.
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
     * The type of IP address assigned to the outside interface of the customer gateway device.
     *
     * Valid values: `PrivateIpv4` | `PublicIpv4` | `Ipv6`
     *
     * Default: `PublicIpv4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-outsideipaddresstype)
     * @param outsideIpAddressType The type of IP address assigned to the outside interface of the
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
     * The type of IP address assigned to the outside interface of the customer gateway device.
     *
     * Valid values: `PrivateIpv4` | `PublicIpv4` | `Ipv6`
     *
     * Default: `PublicIpv4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-outsideipaddresstype)
     * @param outsideIpAddressType The type of IP address assigned to the outside interface of the
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
   * Options for sending VPN tunnel logs to CloudWatch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * CloudwatchLogOptionsSpecificationProperty cloudwatchLogOptionsSpecificationProperty =
   * CloudwatchLogOptionsSpecificationProperty.builder()
   * .logEnabled(false)
   * .logGroupArn("logGroupArn")
   * .logOutputFormat("logOutputFormat")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-cloudwatchlogoptionsspecification.html)
   */
  public interface CloudwatchLogOptionsSpecificationProperty {
    /**
     * Enable or disable VPN tunnel logging feature. Default value is `False` .
     *
     * Valid values: `True` | `False`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-cloudwatchlogoptionsspecification.html#cfn-ec2-vpnconnection-cloudwatchlogoptionsspecification-logenabled)
     */
    public fun logEnabled(): Any? = unwrap(this).getLogEnabled()

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-cloudwatchlogoptionsspecification.html#cfn-ec2-vpnconnection-cloudwatchlogoptionsspecification-loggrouparn)
     */
    public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    /**
     * Set log format. Default format is `json` .
     *
     * Valid values: `json` | `text`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-cloudwatchlogoptionsspecification.html#cfn-ec2-vpnconnection-cloudwatchlogoptionsspecification-logoutputformat)
     */
    public fun logOutputFormat(): String? = unwrap(this).getLogOutputFormat()

    /**
     * A builder for [CloudwatchLogOptionsSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logEnabled Enable or disable VPN tunnel logging feature. Default value is `False` .
       * Valid values: `True` | `False`
       */
      public fun logEnabled(logEnabled: Boolean)

      /**
       * @param logEnabled Enable or disable VPN tunnel logging feature. Default value is `False` .
       * Valid values: `True` | `False`
       */
      public fun logEnabled(logEnabled: IResolvable)

      /**
       * @param logGroupArn The Amazon Resource Name (ARN) of the CloudWatch log group to send logs
       * to.
       */
      public fun logGroupArn(logGroupArn: String)

      /**
       * @param logOutputFormat Set log format. Default format is `json` .
       * Valid values: `json` | `text`
       */
      public fun logOutputFormat(logOutputFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.CloudwatchLogOptionsSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.CloudwatchLogOptionsSpecificationProperty.builder()

      /**
       * @param logEnabled Enable or disable VPN tunnel logging feature. Default value is `False` .
       * Valid values: `True` | `False`
       */
      override fun logEnabled(logEnabled: Boolean) {
        cdkBuilder.logEnabled(logEnabled)
      }

      /**
       * @param logEnabled Enable or disable VPN tunnel logging feature. Default value is `False` .
       * Valid values: `True` | `False`
       */
      override fun logEnabled(logEnabled: IResolvable) {
        cdkBuilder.logEnabled(logEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param logGroupArn The Amazon Resource Name (ARN) of the CloudWatch log group to send logs
       * to.
       */
      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      /**
       * @param logOutputFormat Set log format. Default format is `json` .
       * Valid values: `json` | `text`
       */
      override fun logOutputFormat(logOutputFormat: String) {
        cdkBuilder.logOutputFormat(logOutputFormat)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPNConnection.CloudwatchLogOptionsSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.CloudwatchLogOptionsSpecificationProperty,
    ) : CdkObject(cdkObject),
        CloudwatchLogOptionsSpecificationProperty {
      /**
       * Enable or disable VPN tunnel logging feature. Default value is `False` .
       *
       * Valid values: `True` | `False`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-cloudwatchlogoptionsspecification.html#cfn-ec2-vpnconnection-cloudwatchlogoptionsspecification-logenabled)
       */
      override fun logEnabled(): Any? = unwrap(this).getLogEnabled()

      /**
       * The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-cloudwatchlogoptionsspecification.html#cfn-ec2-vpnconnection-cloudwatchlogoptionsspecification-loggrouparn)
       */
      override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

      /**
       * Set log format. Default format is `json` .
       *
       * Valid values: `json` | `text`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-cloudwatchlogoptionsspecification.html#cfn-ec2-vpnconnection-cloudwatchlogoptionsspecification-logoutputformat)
       */
      override fun logOutputFormat(): String? = unwrap(this).getLogOutputFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudwatchLogOptionsSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.CloudwatchLogOptionsSpecificationProperty):
          CloudwatchLogOptionsSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudwatchLogOptionsSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchLogOptionsSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnVPNConnection.CloudwatchLogOptionsSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVPNConnection.CloudwatchLogOptionsSpecificationProperty
    }
  }

  /**
   * The IKE version that is permitted for the VPN tunnel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * IKEVersionsRequestListValueProperty iKEVersionsRequestListValueProperty = Map.of(
   * "value", "value");
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-ikeversionsrequestlistvalue.html)
   */
  public interface IKEVersionsRequestListValueProperty {
    /**
     * The IKE version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-ikeversionsrequestlistvalue.html#cfn-ec2-vpnconnection-ikeversionsrequestlistvalue-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [IKEVersionsRequestListValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The IKE version.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.IKEVersionsRequestListValueProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.IKEVersionsRequestListValueProperty.builder()

      /**
       * @param value The IKE version.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPNConnection.IKEVersionsRequestListValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.IKEVersionsRequestListValueProperty,
    ) : CdkObject(cdkObject),
        IKEVersionsRequestListValueProperty {
      /**
       * The IKE version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-ikeversionsrequestlistvalue.html#cfn-ec2-vpnconnection-ikeversionsrequestlistvalue-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IKEVersionsRequestListValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.IKEVersionsRequestListValueProperty):
          IKEVersionsRequestListValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IKEVersionsRequestListValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IKEVersionsRequestListValueProperty):
          software.amazon.awscdk.services.ec2.CfnVPNConnection.IKEVersionsRequestListValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVPNConnection.IKEVersionsRequestListValueProperty
    }
  }

  /**
   * Specifies a Diffie-Hellman group number for the VPN tunnel for phase 1 IKE negotiations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * Phase1DHGroupNumbersRequestListValueProperty phase1DHGroupNumbersRequestListValueProperty =
   * Phase1DHGroupNumbersRequestListValueProperty.builder()
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase1dhgroupnumbersrequestlistvalue.html)
   */
  public interface Phase1DHGroupNumbersRequestListValueProperty {
    /**
     * The Diffie-Hellmann group number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase1dhgroupnumbersrequestlistvalue.html#cfn-ec2-vpnconnection-phase1dhgroupnumbersrequestlistvalue-value)
     */
    public fun `value`(): Number? = unwrap(this).getValue()

    /**
     * A builder for [Phase1DHGroupNumbersRequestListValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The Diffie-Hellmann group number.
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1DHGroupNumbersRequestListValueProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1DHGroupNumbersRequestListValueProperty.builder()

      /**
       * @param value The Diffie-Hellmann group number.
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1DHGroupNumbersRequestListValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1DHGroupNumbersRequestListValueProperty,
    ) : CdkObject(cdkObject),
        Phase1DHGroupNumbersRequestListValueProperty {
      /**
       * The Diffie-Hellmann group number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase1dhgroupnumbersrequestlistvalue.html#cfn-ec2-vpnconnection-phase1dhgroupnumbersrequestlistvalue-value)
       */
      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          Phase1DHGroupNumbersRequestListValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1DHGroupNumbersRequestListValueProperty):
          Phase1DHGroupNumbersRequestListValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Phase1DHGroupNumbersRequestListValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Phase1DHGroupNumbersRequestListValueProperty):
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1DHGroupNumbersRequestListValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1DHGroupNumbersRequestListValueProperty
    }
  }

  /**
   * Specifies the encryption algorithm for the VPN tunnel for phase 1 IKE negotiations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * Phase1EncryptionAlgorithmsRequestListValueProperty
   * phase1EncryptionAlgorithmsRequestListValueProperty =
   * Phase1EncryptionAlgorithmsRequestListValueProperty.builder()
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase1encryptionalgorithmsrequestlistvalue.html)
   */
  public interface Phase1EncryptionAlgorithmsRequestListValueProperty {
    /**
     * The value for the encryption algorithm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase1encryptionalgorithmsrequestlistvalue.html#cfn-ec2-vpnconnection-phase1encryptionalgorithmsrequestlistvalue-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [Phase1EncryptionAlgorithmsRequestListValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The value for the encryption algorithm.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1EncryptionAlgorithmsRequestListValueProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1EncryptionAlgorithmsRequestListValueProperty.builder()

      /**
       * @param value The value for the encryption algorithm.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1EncryptionAlgorithmsRequestListValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1EncryptionAlgorithmsRequestListValueProperty,
    ) : CdkObject(cdkObject),
        Phase1EncryptionAlgorithmsRequestListValueProperty {
      /**
       * The value for the encryption algorithm.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase1encryptionalgorithmsrequestlistvalue.html#cfn-ec2-vpnconnection-phase1encryptionalgorithmsrequestlistvalue-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          Phase1EncryptionAlgorithmsRequestListValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1EncryptionAlgorithmsRequestListValueProperty):
          Phase1EncryptionAlgorithmsRequestListValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Phase1EncryptionAlgorithmsRequestListValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Phase1EncryptionAlgorithmsRequestListValueProperty):
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1EncryptionAlgorithmsRequestListValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1EncryptionAlgorithmsRequestListValueProperty
    }
  }

  /**
   * Specifies the integrity algorithm for the VPN tunnel for phase 1 IKE negotiations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * Phase1IntegrityAlgorithmsRequestListValueProperty
   * phase1IntegrityAlgorithmsRequestListValueProperty =
   * Phase1IntegrityAlgorithmsRequestListValueProperty.builder()
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase1integrityalgorithmsrequestlistvalue.html)
   */
  public interface Phase1IntegrityAlgorithmsRequestListValueProperty {
    /**
     * The value for the integrity algorithm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase1integrityalgorithmsrequestlistvalue.html#cfn-ec2-vpnconnection-phase1integrityalgorithmsrequestlistvalue-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [Phase1IntegrityAlgorithmsRequestListValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The value for the integrity algorithm.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1IntegrityAlgorithmsRequestListValueProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1IntegrityAlgorithmsRequestListValueProperty.builder()

      /**
       * @param value The value for the integrity algorithm.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1IntegrityAlgorithmsRequestListValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1IntegrityAlgorithmsRequestListValueProperty,
    ) : CdkObject(cdkObject),
        Phase1IntegrityAlgorithmsRequestListValueProperty {
      /**
       * The value for the integrity algorithm.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase1integrityalgorithmsrequestlistvalue.html#cfn-ec2-vpnconnection-phase1integrityalgorithmsrequestlistvalue-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          Phase1IntegrityAlgorithmsRequestListValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1IntegrityAlgorithmsRequestListValueProperty):
          Phase1IntegrityAlgorithmsRequestListValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Phase1IntegrityAlgorithmsRequestListValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Phase1IntegrityAlgorithmsRequestListValueProperty):
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1IntegrityAlgorithmsRequestListValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase1IntegrityAlgorithmsRequestListValueProperty
    }
  }

  /**
   * Specifies a Diffie-Hellman group number for the VPN tunnel for phase 2 IKE negotiations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * Phase2DHGroupNumbersRequestListValueProperty phase2DHGroupNumbersRequestListValueProperty =
   * Phase2DHGroupNumbersRequestListValueProperty.builder()
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase2dhgroupnumbersrequestlistvalue.html)
   */
  public interface Phase2DHGroupNumbersRequestListValueProperty {
    /**
     * The Diffie-Hellmann group number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase2dhgroupnumbersrequestlistvalue.html#cfn-ec2-vpnconnection-phase2dhgroupnumbersrequestlistvalue-value)
     */
    public fun `value`(): Number? = unwrap(this).getValue()

    /**
     * A builder for [Phase2DHGroupNumbersRequestListValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The Diffie-Hellmann group number.
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2DHGroupNumbersRequestListValueProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2DHGroupNumbersRequestListValueProperty.builder()

      /**
       * @param value The Diffie-Hellmann group number.
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2DHGroupNumbersRequestListValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2DHGroupNumbersRequestListValueProperty,
    ) : CdkObject(cdkObject),
        Phase2DHGroupNumbersRequestListValueProperty {
      /**
       * The Diffie-Hellmann group number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase2dhgroupnumbersrequestlistvalue.html#cfn-ec2-vpnconnection-phase2dhgroupnumbersrequestlistvalue-value)
       */
      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          Phase2DHGroupNumbersRequestListValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2DHGroupNumbersRequestListValueProperty):
          Phase2DHGroupNumbersRequestListValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Phase2DHGroupNumbersRequestListValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Phase2DHGroupNumbersRequestListValueProperty):
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2DHGroupNumbersRequestListValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2DHGroupNumbersRequestListValueProperty
    }
  }

  /**
   * Specifies the encryption algorithm for the VPN tunnel for phase 2 IKE negotiations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * Phase2EncryptionAlgorithmsRequestListValueProperty
   * phase2EncryptionAlgorithmsRequestListValueProperty =
   * Phase2EncryptionAlgorithmsRequestListValueProperty.builder()
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase2encryptionalgorithmsrequestlistvalue.html)
   */
  public interface Phase2EncryptionAlgorithmsRequestListValueProperty {
    /**
     * The encryption algorithm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase2encryptionalgorithmsrequestlistvalue.html#cfn-ec2-vpnconnection-phase2encryptionalgorithmsrequestlistvalue-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [Phase2EncryptionAlgorithmsRequestListValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The encryption algorithm.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2EncryptionAlgorithmsRequestListValueProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2EncryptionAlgorithmsRequestListValueProperty.builder()

      /**
       * @param value The encryption algorithm.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2EncryptionAlgorithmsRequestListValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2EncryptionAlgorithmsRequestListValueProperty,
    ) : CdkObject(cdkObject),
        Phase2EncryptionAlgorithmsRequestListValueProperty {
      /**
       * The encryption algorithm.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase2encryptionalgorithmsrequestlistvalue.html#cfn-ec2-vpnconnection-phase2encryptionalgorithmsrequestlistvalue-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          Phase2EncryptionAlgorithmsRequestListValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2EncryptionAlgorithmsRequestListValueProperty):
          Phase2EncryptionAlgorithmsRequestListValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Phase2EncryptionAlgorithmsRequestListValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Phase2EncryptionAlgorithmsRequestListValueProperty):
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2EncryptionAlgorithmsRequestListValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2EncryptionAlgorithmsRequestListValueProperty
    }
  }

  /**
   * Specifies the integrity algorithm for the VPN tunnel for phase 2 IKE negotiations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * Phase2IntegrityAlgorithmsRequestListValueProperty
   * phase2IntegrityAlgorithmsRequestListValueProperty =
   * Phase2IntegrityAlgorithmsRequestListValueProperty.builder()
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase2integrityalgorithmsrequestlistvalue.html)
   */
  public interface Phase2IntegrityAlgorithmsRequestListValueProperty {
    /**
     * The integrity algorithm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase2integrityalgorithmsrequestlistvalue.html#cfn-ec2-vpnconnection-phase2integrityalgorithmsrequestlistvalue-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [Phase2IntegrityAlgorithmsRequestListValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The integrity algorithm.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2IntegrityAlgorithmsRequestListValueProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2IntegrityAlgorithmsRequestListValueProperty.builder()

      /**
       * @param value The integrity algorithm.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2IntegrityAlgorithmsRequestListValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2IntegrityAlgorithmsRequestListValueProperty,
    ) : CdkObject(cdkObject),
        Phase2IntegrityAlgorithmsRequestListValueProperty {
      /**
       * The integrity algorithm.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-phase2integrityalgorithmsrequestlistvalue.html#cfn-ec2-vpnconnection-phase2integrityalgorithmsrequestlistvalue-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          Phase2IntegrityAlgorithmsRequestListValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2IntegrityAlgorithmsRequestListValueProperty):
          Phase2IntegrityAlgorithmsRequestListValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Phase2IntegrityAlgorithmsRequestListValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Phase2IntegrityAlgorithmsRequestListValueProperty):
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2IntegrityAlgorithmsRequestListValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVPNConnection.Phase2IntegrityAlgorithmsRequestListValueProperty
    }
  }

  /**
   * Options for logging VPN tunnel activity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * VpnTunnelLogOptionsSpecificationProperty vpnTunnelLogOptionsSpecificationProperty =
   * VpnTunnelLogOptionsSpecificationProperty.builder()
   * .cloudwatchLogOptions(CloudwatchLogOptionsSpecificationProperty.builder()
   * .logEnabled(false)
   * .logGroupArn("logGroupArn")
   * .logOutputFormat("logOutputFormat")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunnellogoptionsspecification.html)
   */
  public interface VpnTunnelLogOptionsSpecificationProperty {
    /**
     * Options for sending VPN tunnel logs to CloudWatch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunnellogoptionsspecification.html#cfn-ec2-vpnconnection-vpntunnellogoptionsspecification-cloudwatchlogoptions)
     */
    public fun cloudwatchLogOptions(): Any? = unwrap(this).getCloudwatchLogOptions()

    /**
     * A builder for [VpnTunnelLogOptionsSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudwatchLogOptions Options for sending VPN tunnel logs to CloudWatch.
       */
      public fun cloudwatchLogOptions(cloudwatchLogOptions: IResolvable)

      /**
       * @param cloudwatchLogOptions Options for sending VPN tunnel logs to CloudWatch.
       */
      public
          fun cloudwatchLogOptions(cloudwatchLogOptions: CloudwatchLogOptionsSpecificationProperty)

      /**
       * @param cloudwatchLogOptions Options for sending VPN tunnel logs to CloudWatch.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0097e8c483115d1e54afd0a085a4ff33c8b084674d246f44e421608d8ada75b")
      public
          fun cloudwatchLogOptions(cloudwatchLogOptions: CloudwatchLogOptionsSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelLogOptionsSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelLogOptionsSpecificationProperty.builder()

      /**
       * @param cloudwatchLogOptions Options for sending VPN tunnel logs to CloudWatch.
       */
      override fun cloudwatchLogOptions(cloudwatchLogOptions: IResolvable) {
        cdkBuilder.cloudwatchLogOptions(cloudwatchLogOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cloudwatchLogOptions Options for sending VPN tunnel logs to CloudWatch.
       */
      override
          fun cloudwatchLogOptions(cloudwatchLogOptions: CloudwatchLogOptionsSpecificationProperty) {
        cdkBuilder.cloudwatchLogOptions(cloudwatchLogOptions.let(CloudwatchLogOptionsSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param cloudwatchLogOptions Options for sending VPN tunnel logs to CloudWatch.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0097e8c483115d1e54afd0a085a4ff33c8b084674d246f44e421608d8ada75b")
      override
          fun cloudwatchLogOptions(cloudwatchLogOptions: CloudwatchLogOptionsSpecificationProperty.Builder.() -> Unit):
          Unit =
          cloudwatchLogOptions(CloudwatchLogOptionsSpecificationProperty(cloudwatchLogOptions))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelLogOptionsSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelLogOptionsSpecificationProperty,
    ) : CdkObject(cdkObject),
        VpnTunnelLogOptionsSpecificationProperty {
      /**
       * Options for sending VPN tunnel logs to CloudWatch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunnellogoptionsspecification.html#cfn-ec2-vpnconnection-vpntunnellogoptionsspecification-cloudwatchlogoptions)
       */
      override fun cloudwatchLogOptions(): Any? = unwrap(this).getCloudwatchLogOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VpnTunnelLogOptionsSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelLogOptionsSpecificationProperty):
          VpnTunnelLogOptionsSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpnTunnelLogOptionsSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpnTunnelLogOptionsSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelLogOptionsSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelLogOptionsSpecificationProperty
    }
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
   * .dpdTimeoutAction("dpdTimeoutAction")
   * .dpdTimeoutSeconds(123)
   * .enableTunnelLifecycleControl(false)
   * .ikeVersions(List.of(Map.of(
   * "value", "value")))
   * .logOptions(VpnTunnelLogOptionsSpecificationProperty.builder()
   * .cloudwatchLogOptions(CloudwatchLogOptionsSpecificationProperty.builder()
   * .logEnabled(false)
   * .logGroupArn("logGroupArn")
   * .logOutputFormat("logOutputFormat")
   * .build())
   * .build())
   * .phase1DhGroupNumbers(List.of(Phase1DHGroupNumbersRequestListValueProperty.builder()
   * .value(123)
   * .build()))
   * .phase1EncryptionAlgorithms(List.of(Phase1EncryptionAlgorithmsRequestListValueProperty.builder()
   * .value("value")
   * .build()))
   * .phase1IntegrityAlgorithms(List.of(Phase1IntegrityAlgorithmsRequestListValueProperty.builder()
   * .value("value")
   * .build()))
   * .phase1LifetimeSeconds(123)
   * .phase2DhGroupNumbers(List.of(Phase2DHGroupNumbersRequestListValueProperty.builder()
   * .value(123)
   * .build()))
   * .phase2EncryptionAlgorithms(List.of(Phase2EncryptionAlgorithmsRequestListValueProperty.builder()
   * .value("value")
   * .build()))
   * .phase2IntegrityAlgorithms(List.of(Phase2IntegrityAlgorithmsRequestListValueProperty.builder()
   * .value("value")
   * .build()))
   * .phase2LifetimeSeconds(123)
   * .preSharedKey("preSharedKey")
   * .rekeyFuzzPercentage(123)
   * .rekeyMarginTimeSeconds(123)
   * .replayWindowSize(123)
   * .startupAction("startupAction")
   * .tunnelInsideCidr("tunnelInsideCidr")
   * .tunnelInsideIpv6Cidr("tunnelInsideIpv6Cidr")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html)
   */
  public interface VpnTunnelOptionsSpecificationProperty {
    /**
     * The action to take after DPD timeout occurs.
     *
     * Specify `restart` to restart the IKE initiation. Specify `clear` to end the IKE session.
     *
     * Valid Values: `clear` | `none` | `restart`
     *
     * Default: `clear`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-dpdtimeoutaction)
     */
    public fun dpdTimeoutAction(): String? = unwrap(this).getDpdTimeoutAction()

    /**
     * The number of seconds after which a DPD timeout occurs.
     *
     * Constraints: A value greater than or equal to 30.
     *
     * Default: `30`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-dpdtimeoutseconds)
     */
    public fun dpdTimeoutSeconds(): Number? = unwrap(this).getDpdTimeoutSeconds()

    /**
     * Turn on or off tunnel endpoint lifecycle control feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-enabletunnellifecyclecontrol)
     */
    public fun enableTunnelLifecycleControl(): Any? = unwrap(this).getEnableTunnelLifecycleControl()

    /**
     * The IKE versions that are permitted for the VPN tunnel.
     *
     * Valid values: `ikev1` | `ikev2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-ikeversions)
     */
    public fun ikeVersions(): Any? = unwrap(this).getIkeVersions()

    /**
     * Options for logging VPN tunnel activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-logoptions)
     */
    public fun logOptions(): Any? = unwrap(this).getLogOptions()

    /**
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1
     * IKE negotiations.
     *
     * Valid values: `2` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` |
     * `24`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase1dhgroupnumbers)
     */
    public fun phase1DhGroupNumbers(): Any? = unwrap(this).getPhase1DhGroupNumbers()

    /**
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE
     * negotiations.
     *
     * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase1encryptionalgorithms)
     */
    public fun phase1EncryptionAlgorithms(): Any? = unwrap(this).getPhase1EncryptionAlgorithms()

    /**
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE
     * negotiations.
     *
     * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase1integrityalgorithms)
     */
    public fun phase1IntegrityAlgorithms(): Any? = unwrap(this).getPhase1IntegrityAlgorithms()

    /**
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     *
     * Constraints: A value between 900 and 28,800.
     *
     * Default: `28800`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase1lifetimeseconds)
     */
    public fun phase1LifetimeSeconds(): Number? = unwrap(this).getPhase1LifetimeSeconds()

    /**
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2
     * IKE negotiations.
     *
     * Valid values: `2` | `5` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23`
     * | `24`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase2dhgroupnumbers)
     */
    public fun phase2DhGroupNumbers(): Any? = unwrap(this).getPhase2DhGroupNumbers()

    /**
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE
     * negotiations.
     *
     * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase2encryptionalgorithms)
     */
    public fun phase2EncryptionAlgorithms(): Any? = unwrap(this).getPhase2EncryptionAlgorithms()

    /**
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE
     * negotiations.
     *
     * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase2integrityalgorithms)
     */
    public fun phase2IntegrityAlgorithms(): Any? = unwrap(this).getPhase2IntegrityAlgorithms()

    /**
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     *
     * Constraints: A value between 900 and 3,600. The value must be less than the value for
     * `Phase1LifetimeSeconds` .
     *
     * Default: `3600`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase2lifetimeseconds)
     */
    public fun phase2LifetimeSeconds(): Number? = unwrap(this).getPhase2LifetimeSeconds()

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
     * The percentage of the rekey window (determined by `RekeyMarginTimeSeconds` ) during which the
     * rekey time is randomly selected.
     *
     * Constraints: A value between 0 and 100.
     *
     * Default: `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-rekeyfuzzpercentage)
     */
    public fun rekeyFuzzPercentage(): Number? = unwrap(this).getRekeyFuzzPercentage()

    /**
     * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side
     * of the VPN connection performs an IKE rekey.
     *
     * The exact time of the rekey is randomly selected based on the value for `RekeyFuzzPercentage`
     * .
     *
     * Constraints: A value between 60 and half of `Phase2LifetimeSeconds` .
     *
     * Default: `270`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-rekeymargintimeseconds)
     */
    public fun rekeyMarginTimeSeconds(): Number? = unwrap(this).getRekeyMarginTimeSeconds()

    /**
     * The number of packets in an IKE replay window.
     *
     * Constraints: A value between 64 and 2048.
     *
     * Default: `1024`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-replaywindowsize)
     */
    public fun replayWindowSize(): Number? = unwrap(this).getReplayWindowSize()

    /**
     * The action to take when the establishing the tunnel for the VPN connection.
     *
     * By default, your customer gateway device must initiate the IKE negotiation and bring up the
     * tunnel. Specify `start` for AWS to initiate the IKE negotiation.
     *
     * Valid Values: `add` | `start`
     *
     * Default: `add`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-startupaction)
     */
    public fun startupAction(): String? = unwrap(this).getStartupAction()

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
     * The range of inside IPv6 addresses for the tunnel.
     *
     * Any specified CIDR blocks must be unique across all VPN connections that use the same transit
     * gateway.
     *
     * Constraints: A size /126 CIDR block from the local `fd00::/8` range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsideipv6cidr)
     */
    public fun tunnelInsideIpv6Cidr(): String? = unwrap(this).getTunnelInsideIpv6Cidr()

    /**
     * A builder for [VpnTunnelOptionsSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dpdTimeoutAction The action to take after DPD timeout occurs.
       * Specify `restart` to restart the IKE initiation. Specify `clear` to end the IKE session.
       *
       * Valid Values: `clear` | `none` | `restart`
       *
       * Default: `clear`
       */
      public fun dpdTimeoutAction(dpdTimeoutAction: String)

      /**
       * @param dpdTimeoutSeconds The number of seconds after which a DPD timeout occurs.
       * Constraints: A value greater than or equal to 30.
       *
       * Default: `30`
       */
      public fun dpdTimeoutSeconds(dpdTimeoutSeconds: Number)

      /**
       * @param enableTunnelLifecycleControl Turn on or off tunnel endpoint lifecycle control
       * feature.
       */
      public fun enableTunnelLifecycleControl(enableTunnelLifecycleControl: Boolean)

      /**
       * @param enableTunnelLifecycleControl Turn on or off tunnel endpoint lifecycle control
       * feature.
       */
      public fun enableTunnelLifecycleControl(enableTunnelLifecycleControl: IResolvable)

      /**
       * @param ikeVersions The IKE versions that are permitted for the VPN tunnel.
       * Valid values: `ikev1` | `ikev2`
       */
      public fun ikeVersions(ikeVersions: IResolvable)

      /**
       * @param ikeVersions The IKE versions that are permitted for the VPN tunnel.
       * Valid values: `ikev1` | `ikev2`
       */
      public fun ikeVersions(ikeVersions: List<Any>)

      /**
       * @param ikeVersions The IKE versions that are permitted for the VPN tunnel.
       * Valid values: `ikev1` | `ikev2`
       */
      public fun ikeVersions(vararg ikeVersions: Any)

      /**
       * @param logOptions Options for logging VPN tunnel activity.
       */
      public fun logOptions(logOptions: IResolvable)

      /**
       * @param logOptions Options for logging VPN tunnel activity.
       */
      public fun logOptions(logOptions: VpnTunnelLogOptionsSpecificationProperty)

      /**
       * @param logOptions Options for logging VPN tunnel activity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44e47251cd6be2036e7b21c7b02dc8227621ccf2d7c790c177b55b711672afd9")
      public fun logOptions(logOptions: VpnTunnelLogOptionsSpecificationProperty.Builder.() -> Unit)

      /**
       * @param phase1DhGroupNumbers One or more Diffie-Hellman group numbers that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `2` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` |
       * `24`
       */
      public fun phase1DhGroupNumbers(phase1DhGroupNumbers: IResolvable)

      /**
       * @param phase1DhGroupNumbers One or more Diffie-Hellman group numbers that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `2` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` |
       * `24`
       */
      public fun phase1DhGroupNumbers(phase1DhGroupNumbers: List<Any>)

      /**
       * @param phase1DhGroupNumbers One or more Diffie-Hellman group numbers that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `2` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` |
       * `24`
       */
      public fun phase1DhGroupNumbers(vararg phase1DhGroupNumbers: Any)

      /**
       * @param phase1EncryptionAlgorithms One or more encryption algorithms that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       */
      public fun phase1EncryptionAlgorithms(phase1EncryptionAlgorithms: IResolvable)

      /**
       * @param phase1EncryptionAlgorithms One or more encryption algorithms that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       */
      public fun phase1EncryptionAlgorithms(phase1EncryptionAlgorithms: List<Any>)

      /**
       * @param phase1EncryptionAlgorithms One or more encryption algorithms that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       */
      public fun phase1EncryptionAlgorithms(vararg phase1EncryptionAlgorithms: Any)

      /**
       * @param phase1IntegrityAlgorithms One or more integrity algorithms that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       */
      public fun phase1IntegrityAlgorithms(phase1IntegrityAlgorithms: IResolvable)

      /**
       * @param phase1IntegrityAlgorithms One or more integrity algorithms that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       */
      public fun phase1IntegrityAlgorithms(phase1IntegrityAlgorithms: List<Any>)

      /**
       * @param phase1IntegrityAlgorithms One or more integrity algorithms that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       */
      public fun phase1IntegrityAlgorithms(vararg phase1IntegrityAlgorithms: Any)

      /**
       * @param phase1LifetimeSeconds The lifetime for phase 1 of the IKE negotiation, in seconds.
       * Constraints: A value between 900 and 28,800.
       *
       * Default: `28800`
       */
      public fun phase1LifetimeSeconds(phase1LifetimeSeconds: Number)

      /**
       * @param phase2DhGroupNumbers One or more Diffie-Hellman group numbers that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `2` | `5` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` |
       * `23` | `24`
       */
      public fun phase2DhGroupNumbers(phase2DhGroupNumbers: IResolvable)

      /**
       * @param phase2DhGroupNumbers One or more Diffie-Hellman group numbers that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `2` | `5` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` |
       * `23` | `24`
       */
      public fun phase2DhGroupNumbers(phase2DhGroupNumbers: List<Any>)

      /**
       * @param phase2DhGroupNumbers One or more Diffie-Hellman group numbers that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `2` | `5` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` |
       * `23` | `24`
       */
      public fun phase2DhGroupNumbers(vararg phase2DhGroupNumbers: Any)

      /**
       * @param phase2EncryptionAlgorithms One or more encryption algorithms that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       */
      public fun phase2EncryptionAlgorithms(phase2EncryptionAlgorithms: IResolvable)

      /**
       * @param phase2EncryptionAlgorithms One or more encryption algorithms that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       */
      public fun phase2EncryptionAlgorithms(phase2EncryptionAlgorithms: List<Any>)

      /**
       * @param phase2EncryptionAlgorithms One or more encryption algorithms that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       */
      public fun phase2EncryptionAlgorithms(vararg phase2EncryptionAlgorithms: Any)

      /**
       * @param phase2IntegrityAlgorithms One or more integrity algorithms that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       */
      public fun phase2IntegrityAlgorithms(phase2IntegrityAlgorithms: IResolvable)

      /**
       * @param phase2IntegrityAlgorithms One or more integrity algorithms that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       */
      public fun phase2IntegrityAlgorithms(phase2IntegrityAlgorithms: List<Any>)

      /**
       * @param phase2IntegrityAlgorithms One or more integrity algorithms that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       */
      public fun phase2IntegrityAlgorithms(vararg phase2IntegrityAlgorithms: Any)

      /**
       * @param phase2LifetimeSeconds The lifetime for phase 2 of the IKE negotiation, in seconds.
       * Constraints: A value between 900 and 3,600. The value must be less than the value for
       * `Phase1LifetimeSeconds` .
       *
       * Default: `3600`
       */
      public fun phase2LifetimeSeconds(phase2LifetimeSeconds: Number)

      /**
       * @param preSharedKey The pre-shared key (PSK) to establish initial authentication between
       * the virtual private gateway and customer gateway.
       * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores
       * (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
       */
      public fun preSharedKey(preSharedKey: String)

      /**
       * @param rekeyFuzzPercentage The percentage of the rekey window (determined by
       * `RekeyMarginTimeSeconds` ) during which the rekey time is randomly selected.
       * Constraints: A value between 0 and 100.
       *
       * Default: `100`
       */
      public fun rekeyFuzzPercentage(rekeyFuzzPercentage: Number)

      /**
       * @param rekeyMarginTimeSeconds The margin time, in seconds, before the phase 2 lifetime
       * expires, during which the AWS side of the VPN connection performs an IKE rekey.
       * The exact time of the rekey is randomly selected based on the value for
       * `RekeyFuzzPercentage` .
       *
       * Constraints: A value between 60 and half of `Phase2LifetimeSeconds` .
       *
       * Default: `270`
       */
      public fun rekeyMarginTimeSeconds(rekeyMarginTimeSeconds: Number)

      /**
       * @param replayWindowSize The number of packets in an IKE replay window.
       * Constraints: A value between 64 and 2048.
       *
       * Default: `1024`
       */
      public fun replayWindowSize(replayWindowSize: Number)

      /**
       * @param startupAction The action to take when the establishing the tunnel for the VPN
       * connection.
       * By default, your customer gateway device must initiate the IKE negotiation and bring up the
       * tunnel. Specify `start` for AWS to initiate the IKE negotiation.
       *
       * Valid Values: `add` | `start`
       *
       * Default: `add`
       */
      public fun startupAction(startupAction: String)

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

      /**
       * @param tunnelInsideIpv6Cidr The range of inside IPv6 addresses for the tunnel.
       * Any specified CIDR blocks must be unique across all VPN connections that use the same
       * transit gateway.
       *
       * Constraints: A size /126 CIDR block from the local `fd00::/8` range.
       */
      public fun tunnelInsideIpv6Cidr(tunnelInsideIpv6Cidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.builder()

      /**
       * @param dpdTimeoutAction The action to take after DPD timeout occurs.
       * Specify `restart` to restart the IKE initiation. Specify `clear` to end the IKE session.
       *
       * Valid Values: `clear` | `none` | `restart`
       *
       * Default: `clear`
       */
      override fun dpdTimeoutAction(dpdTimeoutAction: String) {
        cdkBuilder.dpdTimeoutAction(dpdTimeoutAction)
      }

      /**
       * @param dpdTimeoutSeconds The number of seconds after which a DPD timeout occurs.
       * Constraints: A value greater than or equal to 30.
       *
       * Default: `30`
       */
      override fun dpdTimeoutSeconds(dpdTimeoutSeconds: Number) {
        cdkBuilder.dpdTimeoutSeconds(dpdTimeoutSeconds)
      }

      /**
       * @param enableTunnelLifecycleControl Turn on or off tunnel endpoint lifecycle control
       * feature.
       */
      override fun enableTunnelLifecycleControl(enableTunnelLifecycleControl: Boolean) {
        cdkBuilder.enableTunnelLifecycleControl(enableTunnelLifecycleControl)
      }

      /**
       * @param enableTunnelLifecycleControl Turn on or off tunnel endpoint lifecycle control
       * feature.
       */
      override fun enableTunnelLifecycleControl(enableTunnelLifecycleControl: IResolvable) {
        cdkBuilder.enableTunnelLifecycleControl(enableTunnelLifecycleControl.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ikeVersions The IKE versions that are permitted for the VPN tunnel.
       * Valid values: `ikev1` | `ikev2`
       */
      override fun ikeVersions(ikeVersions: IResolvable) {
        cdkBuilder.ikeVersions(ikeVersions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ikeVersions The IKE versions that are permitted for the VPN tunnel.
       * Valid values: `ikev1` | `ikev2`
       */
      override fun ikeVersions(ikeVersions: List<Any>) {
        cdkBuilder.ikeVersions(ikeVersions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ikeVersions The IKE versions that are permitted for the VPN tunnel.
       * Valid values: `ikev1` | `ikev2`
       */
      override fun ikeVersions(vararg ikeVersions: Any): Unit = ikeVersions(ikeVersions.toList())

      /**
       * @param logOptions Options for logging VPN tunnel activity.
       */
      override fun logOptions(logOptions: IResolvable) {
        cdkBuilder.logOptions(logOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param logOptions Options for logging VPN tunnel activity.
       */
      override fun logOptions(logOptions: VpnTunnelLogOptionsSpecificationProperty) {
        cdkBuilder.logOptions(logOptions.let(VpnTunnelLogOptionsSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param logOptions Options for logging VPN tunnel activity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44e47251cd6be2036e7b21c7b02dc8227621ccf2d7c790c177b55b711672afd9")
      override
          fun logOptions(logOptions: VpnTunnelLogOptionsSpecificationProperty.Builder.() -> Unit):
          Unit = logOptions(VpnTunnelLogOptionsSpecificationProperty(logOptions))

      /**
       * @param phase1DhGroupNumbers One or more Diffie-Hellman group numbers that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `2` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` |
       * `24`
       */
      override fun phase1DhGroupNumbers(phase1DhGroupNumbers: IResolvable) {
        cdkBuilder.phase1DhGroupNumbers(phase1DhGroupNumbers.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param phase1DhGroupNumbers One or more Diffie-Hellman group numbers that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `2` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` |
       * `24`
       */
      override fun phase1DhGroupNumbers(phase1DhGroupNumbers: List<Any>) {
        cdkBuilder.phase1DhGroupNumbers(phase1DhGroupNumbers.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param phase1DhGroupNumbers One or more Diffie-Hellman group numbers that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `2` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` |
       * `24`
       */
      override fun phase1DhGroupNumbers(vararg phase1DhGroupNumbers: Any): Unit =
          phase1DhGroupNumbers(phase1DhGroupNumbers.toList())

      /**
       * @param phase1EncryptionAlgorithms One or more encryption algorithms that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       */
      override fun phase1EncryptionAlgorithms(phase1EncryptionAlgorithms: IResolvable) {
        cdkBuilder.phase1EncryptionAlgorithms(phase1EncryptionAlgorithms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param phase1EncryptionAlgorithms One or more encryption algorithms that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       */
      override fun phase1EncryptionAlgorithms(phase1EncryptionAlgorithms: List<Any>) {
        cdkBuilder.phase1EncryptionAlgorithms(phase1EncryptionAlgorithms.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param phase1EncryptionAlgorithms One or more encryption algorithms that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       */
      override fun phase1EncryptionAlgorithms(vararg phase1EncryptionAlgorithms: Any): Unit =
          phase1EncryptionAlgorithms(phase1EncryptionAlgorithms.toList())

      /**
       * @param phase1IntegrityAlgorithms One or more integrity algorithms that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       */
      override fun phase1IntegrityAlgorithms(phase1IntegrityAlgorithms: IResolvable) {
        cdkBuilder.phase1IntegrityAlgorithms(phase1IntegrityAlgorithms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param phase1IntegrityAlgorithms One or more integrity algorithms that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       */
      override fun phase1IntegrityAlgorithms(phase1IntegrityAlgorithms: List<Any>) {
        cdkBuilder.phase1IntegrityAlgorithms(phase1IntegrityAlgorithms.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param phase1IntegrityAlgorithms One or more integrity algorithms that are permitted for
       * the VPN tunnel for phase 1 IKE negotiations.
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       */
      override fun phase1IntegrityAlgorithms(vararg phase1IntegrityAlgorithms: Any): Unit =
          phase1IntegrityAlgorithms(phase1IntegrityAlgorithms.toList())

      /**
       * @param phase1LifetimeSeconds The lifetime for phase 1 of the IKE negotiation, in seconds.
       * Constraints: A value between 900 and 28,800.
       *
       * Default: `28800`
       */
      override fun phase1LifetimeSeconds(phase1LifetimeSeconds: Number) {
        cdkBuilder.phase1LifetimeSeconds(phase1LifetimeSeconds)
      }

      /**
       * @param phase2DhGroupNumbers One or more Diffie-Hellman group numbers that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `2` | `5` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` |
       * `23` | `24`
       */
      override fun phase2DhGroupNumbers(phase2DhGroupNumbers: IResolvable) {
        cdkBuilder.phase2DhGroupNumbers(phase2DhGroupNumbers.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param phase2DhGroupNumbers One or more Diffie-Hellman group numbers that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `2` | `5` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` |
       * `23` | `24`
       */
      override fun phase2DhGroupNumbers(phase2DhGroupNumbers: List<Any>) {
        cdkBuilder.phase2DhGroupNumbers(phase2DhGroupNumbers.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param phase2DhGroupNumbers One or more Diffie-Hellman group numbers that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `2` | `5` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` |
       * `23` | `24`
       */
      override fun phase2DhGroupNumbers(vararg phase2DhGroupNumbers: Any): Unit =
          phase2DhGroupNumbers(phase2DhGroupNumbers.toList())

      /**
       * @param phase2EncryptionAlgorithms One or more encryption algorithms that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       */
      override fun phase2EncryptionAlgorithms(phase2EncryptionAlgorithms: IResolvable) {
        cdkBuilder.phase2EncryptionAlgorithms(phase2EncryptionAlgorithms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param phase2EncryptionAlgorithms One or more encryption algorithms that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       */
      override fun phase2EncryptionAlgorithms(phase2EncryptionAlgorithms: List<Any>) {
        cdkBuilder.phase2EncryptionAlgorithms(phase2EncryptionAlgorithms.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param phase2EncryptionAlgorithms One or more encryption algorithms that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       */
      override fun phase2EncryptionAlgorithms(vararg phase2EncryptionAlgorithms: Any): Unit =
          phase2EncryptionAlgorithms(phase2EncryptionAlgorithms.toList())

      /**
       * @param phase2IntegrityAlgorithms One or more integrity algorithms that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       */
      override fun phase2IntegrityAlgorithms(phase2IntegrityAlgorithms: IResolvable) {
        cdkBuilder.phase2IntegrityAlgorithms(phase2IntegrityAlgorithms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param phase2IntegrityAlgorithms One or more integrity algorithms that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       */
      override fun phase2IntegrityAlgorithms(phase2IntegrityAlgorithms: List<Any>) {
        cdkBuilder.phase2IntegrityAlgorithms(phase2IntegrityAlgorithms.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param phase2IntegrityAlgorithms One or more integrity algorithms that are permitted for
       * the VPN tunnel for phase 2 IKE negotiations.
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       */
      override fun phase2IntegrityAlgorithms(vararg phase2IntegrityAlgorithms: Any): Unit =
          phase2IntegrityAlgorithms(phase2IntegrityAlgorithms.toList())

      /**
       * @param phase2LifetimeSeconds The lifetime for phase 2 of the IKE negotiation, in seconds.
       * Constraints: A value between 900 and 3,600. The value must be less than the value for
       * `Phase1LifetimeSeconds` .
       *
       * Default: `3600`
       */
      override fun phase2LifetimeSeconds(phase2LifetimeSeconds: Number) {
        cdkBuilder.phase2LifetimeSeconds(phase2LifetimeSeconds)
      }

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
       * @param rekeyFuzzPercentage The percentage of the rekey window (determined by
       * `RekeyMarginTimeSeconds` ) during which the rekey time is randomly selected.
       * Constraints: A value between 0 and 100.
       *
       * Default: `100`
       */
      override fun rekeyFuzzPercentage(rekeyFuzzPercentage: Number) {
        cdkBuilder.rekeyFuzzPercentage(rekeyFuzzPercentage)
      }

      /**
       * @param rekeyMarginTimeSeconds The margin time, in seconds, before the phase 2 lifetime
       * expires, during which the AWS side of the VPN connection performs an IKE rekey.
       * The exact time of the rekey is randomly selected based on the value for
       * `RekeyFuzzPercentage` .
       *
       * Constraints: A value between 60 and half of `Phase2LifetimeSeconds` .
       *
       * Default: `270`
       */
      override fun rekeyMarginTimeSeconds(rekeyMarginTimeSeconds: Number) {
        cdkBuilder.rekeyMarginTimeSeconds(rekeyMarginTimeSeconds)
      }

      /**
       * @param replayWindowSize The number of packets in an IKE replay window.
       * Constraints: A value between 64 and 2048.
       *
       * Default: `1024`
       */
      override fun replayWindowSize(replayWindowSize: Number) {
        cdkBuilder.replayWindowSize(replayWindowSize)
      }

      /**
       * @param startupAction The action to take when the establishing the tunnel for the VPN
       * connection.
       * By default, your customer gateway device must initiate the IKE negotiation and bring up the
       * tunnel. Specify `start` for AWS to initiate the IKE negotiation.
       *
       * Valid Values: `add` | `start`
       *
       * Default: `add`
       */
      override fun startupAction(startupAction: String) {
        cdkBuilder.startupAction(startupAction)
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

      /**
       * @param tunnelInsideIpv6Cidr The range of inside IPv6 addresses for the tunnel.
       * Any specified CIDR blocks must be unique across all VPN connections that use the same
       * transit gateway.
       *
       * Constraints: A size /126 CIDR block from the local `fd00::/8` range.
       */
      override fun tunnelInsideIpv6Cidr(tunnelInsideIpv6Cidr: String) {
        cdkBuilder.tunnelInsideIpv6Cidr(tunnelInsideIpv6Cidr)
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
       * The action to take after DPD timeout occurs.
       *
       * Specify `restart` to restart the IKE initiation. Specify `clear` to end the IKE session.
       *
       * Valid Values: `clear` | `none` | `restart`
       *
       * Default: `clear`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-dpdtimeoutaction)
       */
      override fun dpdTimeoutAction(): String? = unwrap(this).getDpdTimeoutAction()

      /**
       * The number of seconds after which a DPD timeout occurs.
       *
       * Constraints: A value greater than or equal to 30.
       *
       * Default: `30`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-dpdtimeoutseconds)
       */
      override fun dpdTimeoutSeconds(): Number? = unwrap(this).getDpdTimeoutSeconds()

      /**
       * Turn on or off tunnel endpoint lifecycle control feature.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-enabletunnellifecyclecontrol)
       */
      override fun enableTunnelLifecycleControl(): Any? =
          unwrap(this).getEnableTunnelLifecycleControl()

      /**
       * The IKE versions that are permitted for the VPN tunnel.
       *
       * Valid values: `ikev1` | `ikev2`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-ikeversions)
       */
      override fun ikeVersions(): Any? = unwrap(this).getIkeVersions()

      /**
       * Options for logging VPN tunnel activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-logoptions)
       */
      override fun logOptions(): Any? = unwrap(this).getLogOptions()

      /**
       * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1
       * IKE negotiations.
       *
       * Valid values: `2` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` |
       * `24`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase1dhgroupnumbers)
       */
      override fun phase1DhGroupNumbers(): Any? = unwrap(this).getPhase1DhGroupNumbers()

      /**
       * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE
       * negotiations.
       *
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase1encryptionalgorithms)
       */
      override fun phase1EncryptionAlgorithms(): Any? = unwrap(this).getPhase1EncryptionAlgorithms()

      /**
       * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE
       * negotiations.
       *
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase1integrityalgorithms)
       */
      override fun phase1IntegrityAlgorithms(): Any? = unwrap(this).getPhase1IntegrityAlgorithms()

      /**
       * The lifetime for phase 1 of the IKE negotiation, in seconds.
       *
       * Constraints: A value between 900 and 28,800.
       *
       * Default: `28800`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase1lifetimeseconds)
       */
      override fun phase1LifetimeSeconds(): Number? = unwrap(this).getPhase1LifetimeSeconds()

      /**
       * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2
       * IKE negotiations.
       *
       * Valid values: `2` | `5` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` |
       * `23` | `24`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase2dhgroupnumbers)
       */
      override fun phase2DhGroupNumbers(): Any? = unwrap(this).getPhase2DhGroupNumbers()

      /**
       * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE
       * negotiations.
       *
       * Valid values: `AES128` | `AES256` | `AES128-GCM-16` | `AES256-GCM-16`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase2encryptionalgorithms)
       */
      override fun phase2EncryptionAlgorithms(): Any? = unwrap(this).getPhase2EncryptionAlgorithms()

      /**
       * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE
       * negotiations.
       *
       * Valid values: `SHA1` | `SHA2-256` | `SHA2-384` | `SHA2-512`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase2integrityalgorithms)
       */
      override fun phase2IntegrityAlgorithms(): Any? = unwrap(this).getPhase2IntegrityAlgorithms()

      /**
       * The lifetime for phase 2 of the IKE negotiation, in seconds.
       *
       * Constraints: A value between 900 and 3,600. The value must be less than the value for
       * `Phase1LifetimeSeconds` .
       *
       * Default: `3600`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-phase2lifetimeseconds)
       */
      override fun phase2LifetimeSeconds(): Number? = unwrap(this).getPhase2LifetimeSeconds()

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
       * The percentage of the rekey window (determined by `RekeyMarginTimeSeconds` ) during which
       * the rekey time is randomly selected.
       *
       * Constraints: A value between 0 and 100.
       *
       * Default: `100`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-rekeyfuzzpercentage)
       */
      override fun rekeyFuzzPercentage(): Number? = unwrap(this).getRekeyFuzzPercentage()

      /**
       * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side
       * of the VPN connection performs an IKE rekey.
       *
       * The exact time of the rekey is randomly selected based on the value for
       * `RekeyFuzzPercentage` .
       *
       * Constraints: A value between 60 and half of `Phase2LifetimeSeconds` .
       *
       * Default: `270`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-rekeymargintimeseconds)
       */
      override fun rekeyMarginTimeSeconds(): Number? = unwrap(this).getRekeyMarginTimeSeconds()

      /**
       * The number of packets in an IKE replay window.
       *
       * Constraints: A value between 64 and 2048.
       *
       * Default: `1024`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-replaywindowsize)
       */
      override fun replayWindowSize(): Number? = unwrap(this).getReplayWindowSize()

      /**
       * The action to take when the establishing the tunnel for the VPN connection.
       *
       * By default, your customer gateway device must initiate the IKE negotiation and bring up the
       * tunnel. Specify `start` for AWS to initiate the IKE negotiation.
       *
       * Valid Values: `add` | `start`
       *
       * Default: `add`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-startupaction)
       */
      override fun startupAction(): String? = unwrap(this).getStartupAction()

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

      /**
       * The range of inside IPv6 addresses for the tunnel.
       *
       * Any specified CIDR blocks must be unique across all VPN connections that use the same
       * transit gateway.
       *
       * Constraints: A size /126 CIDR block from the local `fd00::/8` range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html#cfn-ec2-vpnconnection-vpntunneloptionsspecification-tunnelinsideipv6cidr)
       */
      override fun tunnelInsideIpv6Cidr(): String? = unwrap(this).getTunnelInsideIpv6Cidr()
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
