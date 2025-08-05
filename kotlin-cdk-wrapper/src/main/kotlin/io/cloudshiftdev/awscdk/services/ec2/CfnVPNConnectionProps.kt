@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVPNConnection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPNConnectionProps cfnVPNConnectionProps = CfnVPNConnectionProps.builder()
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
public interface CfnVPNConnectionProps {
  /**
   * The ID of the customer gateway at your end of the VPN connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-customergatewayid)
   */
  public fun customerGatewayId(): String

  /**
   * Indicate whether to enable acceleration for the VPN connection.
   *
   * Default: `false`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-enableacceleration)
   */
  public fun enableAcceleration(): Any? = unwrap(this).getEnableAcceleration()

  /**
   * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
   *
   * Default: `0.0.0.0/0`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-localipv4networkcidr)
   */
  public fun localIpv4NetworkCidr(): String? = unwrap(this).getLocalIpv4NetworkCidr()

  /**
   * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
   *
   * Default: `::/0`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-localipv6networkcidr)
   */
  public fun localIpv6NetworkCidr(): String? = unwrap(this).getLocalIpv6NetworkCidr()

  /**
   * The type of IP address assigned to the outside interface of the customer gateway device.
   *
   * Valid values: `PrivateIpv4` | `PublicIpv4` | `Ipv6`
   *
   * Default: `PublicIpv4`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-outsideipaddresstype)
   */
  public fun outsideIpAddressType(): String? = unwrap(this).getOutsideIpAddressType()

  /**
   * The IPv4 CIDR on the AWS side of the VPN connection.
   *
   * Default: `0.0.0.0/0`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-remoteipv4networkcidr)
   */
  public fun remoteIpv4NetworkCidr(): String? = unwrap(this).getRemoteIpv4NetworkCidr()

  /**
   * The IPv6 CIDR on the AWS side of the VPN connection.
   *
   * Default: `::/0`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-remoteipv6networkcidr)
   */
  public fun remoteIpv6NetworkCidr(): String? = unwrap(this).getRemoteIpv6NetworkCidr()

  /**
   * Indicates whether the VPN connection uses static routes only.
   *
   * Static routes must be used for devices that don't support BGP.
   *
   * If you are creating a VPN connection for a device that does not support Border Gateway Protocol
   * (BGP), you must specify `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-staticroutesonly)
   */
  public fun staticRoutesOnly(): Any? = unwrap(this).getStaticRoutesOnly()

  /**
   * Any tags assigned to the VPN connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the transit gateway associated with the VPN connection.
   *
   * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-transitgatewayid)
   */
  public fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

  /**
   * The transit gateway attachment ID to use for the VPN tunnel.
   *
   * Required if `OutsideIpAddressType` is set to `PrivateIpv4` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-transporttransitgatewayattachmentid)
   */
  public fun transportTransitGatewayAttachmentId(): String? =
      unwrap(this).getTransportTransitGatewayAttachmentId()

  /**
   * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
   *
   * Default: `ipv4`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tunnelinsideipversion)
   */
  public fun tunnelInsideIpVersion(): String? = unwrap(this).getTunnelInsideIpVersion()

  /**
   * The type of VPN connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-type)
   */
  public fun type(): String

  /**
   * The ID of the virtual private gateway at the AWS side of the VPN connection.
   *
   * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpngatewayid)
   */
  public fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  /**
   * The tunnel options for the VPN connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
   */
  public fun vpnTunnelOptionsSpecifications(): Any? =
      unwrap(this).getVpnTunnelOptionsSpecifications()

  /**
   * A builder for [CfnVPNConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customerGatewayId The ID of the customer gateway at your end of the VPN connection. 
     */
    public fun customerGatewayId(customerGatewayId: String)

    /**
     * @param enableAcceleration Indicate whether to enable acceleration for the VPN connection.
     * Default: `false`
     */
    public fun enableAcceleration(enableAcceleration: Boolean)

    /**
     * @param enableAcceleration Indicate whether to enable acceleration for the VPN connection.
     * Default: `false`
     */
    public fun enableAcceleration(enableAcceleration: IResolvable)

    /**
     * @param localIpv4NetworkCidr The IPv4 CIDR on the customer gateway (on-premises) side of the
     * VPN connection.
     * Default: `0.0.0.0/0`
     */
    public fun localIpv4NetworkCidr(localIpv4NetworkCidr: String)

    /**
     * @param localIpv6NetworkCidr The IPv6 CIDR on the customer gateway (on-premises) side of the
     * VPN connection.
     * Default: `::/0`
     */
    public fun localIpv6NetworkCidr(localIpv6NetworkCidr: String)

    /**
     * @param outsideIpAddressType The type of IP address assigned to the outside interface of the
     * customer gateway device.
     * Valid values: `PrivateIpv4` | `PublicIpv4` | `Ipv6`
     *
     * Default: `PublicIpv4`
     */
    public fun outsideIpAddressType(outsideIpAddressType: String)

    /**
     * @param remoteIpv4NetworkCidr The IPv4 CIDR on the AWS side of the VPN connection.
     * Default: `0.0.0.0/0`
     */
    public fun remoteIpv4NetworkCidr(remoteIpv4NetworkCidr: String)

    /**
     * @param remoteIpv6NetworkCidr The IPv6 CIDR on the AWS side of the VPN connection.
     * Default: `::/0`
     */
    public fun remoteIpv6NetworkCidr(remoteIpv6NetworkCidr: String)

    /**
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only.
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     */
    public fun staticRoutesOnly(staticRoutesOnly: Boolean)

    /**
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only.
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     */
    public fun staticRoutesOnly(staticRoutesOnly: IResolvable)

    /**
     * @param tags Any tags assigned to the VPN connection.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags assigned to the VPN connection.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transitGatewayId The ID of the transit gateway associated with the VPN connection.
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     */
    public fun transitGatewayId(transitGatewayId: String)

    /**
     * @param transportTransitGatewayAttachmentId The transit gateway attachment ID to use for the
     * VPN tunnel.
     * Required if `OutsideIpAddressType` is set to `PrivateIpv4` .
     */
    public fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String)

    /**
     * @param tunnelInsideIpVersion Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
     * Default: `ipv4`
     */
    public fun tunnelInsideIpVersion(tunnelInsideIpVersion: String)

    /**
     * @param type The type of VPN connection. 
     */
    public fun type(type: String)

    /**
     * @param vpnGatewayId The ID of the virtual private gateway at the AWS side of the VPN
     * connection.
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     */
    public fun vpnGatewayId(vpnGatewayId: String)

    /**
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection.
     */
    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable)

    /**
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection.
     */
    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: List<Any>)

    /**
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection.
     */
    public fun vpnTunnelOptionsSpecifications(vararg vpnTunnelOptionsSpecifications: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPNConnectionProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNConnectionProps.builder()

    /**
     * @param customerGatewayId The ID of the customer gateway at your end of the VPN connection. 
     */
    override fun customerGatewayId(customerGatewayId: String) {
      cdkBuilder.customerGatewayId(customerGatewayId)
    }

    /**
     * @param enableAcceleration Indicate whether to enable acceleration for the VPN connection.
     * Default: `false`
     */
    override fun enableAcceleration(enableAcceleration: Boolean) {
      cdkBuilder.enableAcceleration(enableAcceleration)
    }

    /**
     * @param enableAcceleration Indicate whether to enable acceleration for the VPN connection.
     * Default: `false`
     */
    override fun enableAcceleration(enableAcceleration: IResolvable) {
      cdkBuilder.enableAcceleration(enableAcceleration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param localIpv4NetworkCidr The IPv4 CIDR on the customer gateway (on-premises) side of the
     * VPN connection.
     * Default: `0.0.0.0/0`
     */
    override fun localIpv4NetworkCidr(localIpv4NetworkCidr: String) {
      cdkBuilder.localIpv4NetworkCidr(localIpv4NetworkCidr)
    }

    /**
     * @param localIpv6NetworkCidr The IPv6 CIDR on the customer gateway (on-premises) side of the
     * VPN connection.
     * Default: `::/0`
     */
    override fun localIpv6NetworkCidr(localIpv6NetworkCidr: String) {
      cdkBuilder.localIpv6NetworkCidr(localIpv6NetworkCidr)
    }

    /**
     * @param outsideIpAddressType The type of IP address assigned to the outside interface of the
     * customer gateway device.
     * Valid values: `PrivateIpv4` | `PublicIpv4` | `Ipv6`
     *
     * Default: `PublicIpv4`
     */
    override fun outsideIpAddressType(outsideIpAddressType: String) {
      cdkBuilder.outsideIpAddressType(outsideIpAddressType)
    }

    /**
     * @param remoteIpv4NetworkCidr The IPv4 CIDR on the AWS side of the VPN connection.
     * Default: `0.0.0.0/0`
     */
    override fun remoteIpv4NetworkCidr(remoteIpv4NetworkCidr: String) {
      cdkBuilder.remoteIpv4NetworkCidr(remoteIpv4NetworkCidr)
    }

    /**
     * @param remoteIpv6NetworkCidr The IPv6 CIDR on the AWS side of the VPN connection.
     * Default: `::/0`
     */
    override fun remoteIpv6NetworkCidr(remoteIpv6NetworkCidr: String) {
      cdkBuilder.remoteIpv6NetworkCidr(remoteIpv6NetworkCidr)
    }

    /**
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only.
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     */
    override fun staticRoutesOnly(staticRoutesOnly: Boolean) {
      cdkBuilder.staticRoutesOnly(staticRoutesOnly)
    }

    /**
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only.
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     */
    override fun staticRoutesOnly(staticRoutesOnly: IResolvable) {
      cdkBuilder.staticRoutesOnly(staticRoutesOnly.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tags Any tags assigned to the VPN connection.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Any tags assigned to the VPN connection.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param transitGatewayId The ID of the transit gateway associated with the VPN connection.
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /**
     * @param transportTransitGatewayAttachmentId The transit gateway attachment ID to use for the
     * VPN tunnel.
     * Required if `OutsideIpAddressType` is set to `PrivateIpv4` .
     */
    override fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String) {
      cdkBuilder.transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId)
    }

    /**
     * @param tunnelInsideIpVersion Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
     * Default: `ipv4`
     */
    override fun tunnelInsideIpVersion(tunnelInsideIpVersion: String) {
      cdkBuilder.tunnelInsideIpVersion(tunnelInsideIpVersion)
    }

    /**
     * @param type The type of VPN connection. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param vpnGatewayId The ID of the virtual private gateway at the AWS side of the VPN
     * connection.
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     */
    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    /**
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection.
     */
    override fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable) {
      cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection.
     */
    override fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: List<Any>) {
      cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection.
     */
    override fun vpnTunnelOptionsSpecifications(vararg vpnTunnelOptionsSpecifications: Any): Unit =
        vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionProps,
  ) : CdkObject(cdkObject),
      CfnVPNConnectionProps {
    /**
     * The ID of the customer gateway at your end of the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-customergatewayid)
     */
    override fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

    /**
     * Indicate whether to enable acceleration for the VPN connection.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-enableacceleration)
     */
    override fun enableAcceleration(): Any? = unwrap(this).getEnableAcceleration()

    /**
     * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
     *
     * Default: `0.0.0.0/0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-localipv4networkcidr)
     */
    override fun localIpv4NetworkCidr(): String? = unwrap(this).getLocalIpv4NetworkCidr()

    /**
     * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
     *
     * Default: `::/0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-localipv6networkcidr)
     */
    override fun localIpv6NetworkCidr(): String? = unwrap(this).getLocalIpv6NetworkCidr()

    /**
     * The type of IP address assigned to the outside interface of the customer gateway device.
     *
     * Valid values: `PrivateIpv4` | `PublicIpv4` | `Ipv6`
     *
     * Default: `PublicIpv4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-outsideipaddresstype)
     */
    override fun outsideIpAddressType(): String? = unwrap(this).getOutsideIpAddressType()

    /**
     * The IPv4 CIDR on the AWS side of the VPN connection.
     *
     * Default: `0.0.0.0/0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-remoteipv4networkcidr)
     */
    override fun remoteIpv4NetworkCidr(): String? = unwrap(this).getRemoteIpv4NetworkCidr()

    /**
     * The IPv6 CIDR on the AWS side of the VPN connection.
     *
     * Default: `::/0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-remoteipv6networkcidr)
     */
    override fun remoteIpv6NetworkCidr(): String? = unwrap(this).getRemoteIpv6NetworkCidr()

    /**
     * Indicates whether the VPN connection uses static routes only.
     *
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-staticroutesonly)
     */
    override fun staticRoutesOnly(): Any? = unwrap(this).getStaticRoutesOnly()

    /**
     * Any tags assigned to the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the transit gateway associated with the VPN connection.
     *
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-transitgatewayid)
     */
    override fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

    /**
     * The transit gateway attachment ID to use for the VPN tunnel.
     *
     * Required if `OutsideIpAddressType` is set to `PrivateIpv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-transporttransitgatewayattachmentid)
     */
    override fun transportTransitGatewayAttachmentId(): String? =
        unwrap(this).getTransportTransitGatewayAttachmentId()

    /**
     * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
     *
     * Default: `ipv4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tunnelinsideipversion)
     */
    override fun tunnelInsideIpVersion(): String? = unwrap(this).getTunnelInsideIpVersion()

    /**
     * The type of VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-type)
     */
    override fun type(): String = unwrap(this).getType()

    /**
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     *
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpngatewayid)
     */
    override fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     */
    override fun vpnTunnelOptionsSpecifications(): Any? =
        unwrap(this).getVpnTunnelOptionsSpecifications()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPNConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionProps):
        CfnVPNConnectionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVPNConnectionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPNConnectionProps):
        software.amazon.awscdk.services.ec2.CfnVPNConnectionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnVPNConnectionProps
  }
}
