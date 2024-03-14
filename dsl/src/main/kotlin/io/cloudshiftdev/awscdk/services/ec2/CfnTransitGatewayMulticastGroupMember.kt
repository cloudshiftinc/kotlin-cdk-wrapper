package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayMulticastGroupMember internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Information about the registered transit gateway multicast domain group members.
   */
  public open fun attrGroupMember(): IResolvable =
      unwrap(this).getAttrGroupMember().let(IResolvable::wrap)

  /**
   * Indicates that the resource is a transit gateway multicast domain group member.
   */
  public open fun attrGroupSource(): IResolvable =
      unwrap(this).getAttrGroupSource().let(IResolvable::wrap)

  /**
   * The type of group member, for example static.
   */
  public open fun attrMemberType(): String = unwrap(this).getAttrMemberType()

  /**
   * The ID of the resource.
   */
  public open fun attrResourceId(): String = unwrap(this).getAttrResourceId()

  /**
   * The type of resource, for example a VPC attachment.
   */
  public open fun attrResourceType(): String = unwrap(this).getAttrResourceType()

  /**
   * The type of source.
   */
  public open fun attrSourceType(): String = unwrap(this).getAttrSourceType()

  /**
   * The ID of the subnet.
   */
  public open fun attrSubnetId(): String = unwrap(this).getAttrSubnetId()

  /**
   * The ID of the transit gateway attachment.
   */
  public open fun attrTransitGatewayAttachmentId(): String =
      unwrap(this).getAttrTransitGatewayAttachmentId()

  /**
   * The IP address assigned to the transit gateway multicast group.
   */
  public open fun groupIpAddress(): String = unwrap(this).getGroupIpAddress()

  /**
   * The IP address assigned to the transit gateway multicast group.
   */
  public open fun groupIpAddress(`value`: String) {
    unwrap(this).setGroupIpAddress(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The group members' network interface IDs to register with the transit gateway multicast group.
   */
  public open fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

  /**
   * The group members' network interface IDs to register with the transit gateway multicast group.
   */
  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  /**
   * The ID of the transit gateway multicast domain.
   */
  public open fun transitGatewayMulticastDomainId(): String =
      unwrap(this).getTransitGatewayMulticastDomainId()

  /**
   * The ID of the transit gateway multicast domain.
   */
  public open fun transitGatewayMulticastDomainId(`value`: String) {
    unwrap(this).setTransitGatewayMulticastDomainId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IP address assigned to the transit gateway multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-groupipaddress)
     * @param groupIpAddress The IP address assigned to the transit gateway multicast group. 
     */
    public fun groupIpAddress(groupIpAddress: String)

    /**
     * The group members' network interface IDs to register with the transit gateway multicast
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-networkinterfaceid)
     * @param networkInterfaceId The group members' network interface IDs to register with the
     * transit gateway multicast group. 
     */
    public fun networkInterfaceId(networkInterfaceId: String)

    /**
     * The ID of the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-transitgatewaymulticastdomainid)
     * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. 
     */
    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember.Builder.create(scope,
        id)

    /**
     * The IP address assigned to the transit gateway multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-groupipaddress)
     * @param groupIpAddress The IP address assigned to the transit gateway multicast group. 
     */
    override fun groupIpAddress(groupIpAddress: String) {
      cdkBuilder.groupIpAddress(groupIpAddress)
    }

    /**
     * The group members' network interface IDs to register with the transit gateway multicast
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-networkinterfaceid)
     * @param networkInterfaceId The group members' network interface IDs to register with the
     * transit gateway multicast group. 
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * The ID of the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-transitgatewaymulticastdomainid)
     * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. 
     */
    override fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
      cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayMulticastGroupMember {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayMulticastGroupMember(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember):
        CfnTransitGatewayMulticastGroupMember = CfnTransitGatewayMulticastGroupMember(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastGroupMember):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember =
        wrapped.cdkObject
  }
}
