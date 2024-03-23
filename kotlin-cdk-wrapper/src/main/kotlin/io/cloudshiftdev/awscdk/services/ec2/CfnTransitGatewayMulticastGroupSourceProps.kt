@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnTransitGatewayMulticastGroupSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayMulticastGroupSourceProps cfnTransitGatewayMulticastGroupSourceProps =
 * CfnTransitGatewayMulticastGroupSourceProps.builder()
 * .groupIpAddress("groupIpAddress")
 * .networkInterfaceId("networkInterfaceId")
 * .transitGatewayMulticastDomainId("transitGatewayMulticastDomainId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html)
 */
public interface CfnTransitGatewayMulticastGroupSourceProps {
  /**
   * The IP address assigned to the transit gateway multicast group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-groupipaddress)
   */
  public fun groupIpAddress(): String

  /**
   * The group sources' network interface IDs to register with the transit gateway multicast group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-networkinterfaceid)
   */
  public fun networkInterfaceId(): String

  /**
   * The ID of the transit gateway multicast domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-transitgatewaymulticastdomainid)
   */
  public fun transitGatewayMulticastDomainId(): String

  /**
   * A builder for [CfnTransitGatewayMulticastGroupSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param groupIpAddress The IP address assigned to the transit gateway multicast group. 
     */
    public fun groupIpAddress(groupIpAddress: String)

    /**
     * @param networkInterfaceId The group sources' network interface IDs to register with the
     * transit gateway multicast group. 
     */
    public fun networkInterfaceId(networkInterfaceId: String)

    /**
     * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. 
     */
    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps.builder()

    /**
     * @param groupIpAddress The IP address assigned to the transit gateway multicast group. 
     */
    override fun groupIpAddress(groupIpAddress: String) {
      cdkBuilder.groupIpAddress(groupIpAddress)
    }

    /**
     * @param networkInterfaceId The group sources' network interface IDs to register with the
     * transit gateway multicast group. 
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. 
     */
    override fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
      cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayMulticastGroupSourceProps {
    /**
     * The IP address assigned to the transit gateway multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-groupipaddress)
     */
    override fun groupIpAddress(): String = unwrap(this).getGroupIpAddress()

    /**
     * The group sources' network interface IDs to register with the transit gateway multicast
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-networkinterfaceid)
     */
    override fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

    /**
     * The ID of the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-transitgatewaymulticastdomainid)
     */
    override fun transitGatewayMulticastDomainId(): String =
        unwrap(this).getTransitGatewayMulticastDomainId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayMulticastGroupSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps):
        CfnTransitGatewayMulticastGroupSourceProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTransitGatewayMulticastGroupSourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastGroupSourceProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps
  }
}
