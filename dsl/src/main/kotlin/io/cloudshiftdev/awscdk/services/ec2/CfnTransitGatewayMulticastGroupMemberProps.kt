package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnTransitGatewayMulticastGroupMemberProps {
  /**
   * The IP address assigned to the transit gateway multicast group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-groupipaddress)
   */
  public fun groupIpAddress(): String

  /**
   * The group members' network interface IDs to register with the transit gateway multicast group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-networkinterfaceid)
   */
  public fun networkInterfaceId(): String

  /**
   * The ID of the transit gateway multicast domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-transitgatewaymulticastdomainid)
   */
  public fun transitGatewayMulticastDomainId(): String

  /**
   * A builder for [CfnTransitGatewayMulticastGroupMemberProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param groupIpAddress The IP address assigned to the transit gateway multicast group. 
     */
    public fun groupIpAddress(groupIpAddress: String)

    /**
     * @param networkInterfaceId The group members' network interface IDs to register with the
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
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps.builder()

    /**
     * @param groupIpAddress The IP address assigned to the transit gateway multicast group. 
     */
    override fun groupIpAddress(groupIpAddress: String) {
      cdkBuilder.groupIpAddress(groupIpAddress)
    }

    /**
     * @param networkInterfaceId The group members' network interface IDs to register with the
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
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayMulticastGroupMemberProps {
    /**
     * The IP address assigned to the transit gateway multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-groupipaddress)
     */
    override fun groupIpAddress(): String = unwrap(this).getGroupIpAddress()

    /**
     * The group members' network interface IDs to register with the transit gateway multicast
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-networkinterfaceid)
     */
    override fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

    /**
     * The ID of the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-transitgatewaymulticastdomainid)
     */
    override fun transitGatewayMulticastDomainId(): String =
        unwrap(this).getTransitGatewayMulticastDomainId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayMulticastGroupMemberProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps):
        CfnTransitGatewayMulticastGroupMemberProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastGroupMemberProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps
  }
}
