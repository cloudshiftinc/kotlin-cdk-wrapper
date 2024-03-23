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
 * .staticRoutesOnly(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .transitGatewayId("transitGatewayId")
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
public interface CfnVPNConnectionProps {
  /**
   * The ID of the customer gateway at your end of the VPN connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-customergatewayid)
   */
  public fun customerGatewayId(): String

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
      cdkBuilder.staticRoutesOnly(staticRoutesOnly.let(IResolvable::unwrap))
    }

    /**
     * @param tags Any tags assigned to the VPN connection.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
      cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications.let(IResolvable::unwrap))
    }

    /**
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection.
     */
    override fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: List<Any>) {
      cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications)
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
  ) : CdkObject(cdkObject), CfnVPNConnectionProps {
    /**
     * The ID of the customer gateway at your end of the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-customergatewayid)
     */
    override fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

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
