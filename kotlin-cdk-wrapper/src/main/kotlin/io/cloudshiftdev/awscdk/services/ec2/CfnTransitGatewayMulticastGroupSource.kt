@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

/**
 * Registers sources (network interfaces) with the specified transit gateway multicast domain.
 *
 * A multicast source is a network interface attached to a supported instance that sends multicast
 * traffic. For information about supported instances, see [Multicast
 * Considerations](https://docs.aws.amazon.com/vpc/latest/tgw/transit-gateway-limits.html#multicast-limits)
 * in *Amazon VPC Transit Gateways* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayMulticastGroupSource cfnTransitGatewayMulticastGroupSource =
 * CfnTransitGatewayMulticastGroupSource.Builder.create(this,
 * "MyCfnTransitGatewayMulticastGroupSource")
 * .groupIpAddress("groupIpAddress")
 * .networkInterfaceId("networkInterfaceId")
 * .transitGatewayMulticastDomainId("transitGatewayMulticastDomainId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html)
 */
public open class CfnTransitGatewayMulticastGroupSource(
  cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayMulticastGroupSourceProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTransitGatewayMulticastGroupSourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayMulticastGroupSourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTransitGatewayMulticastGroupSourceProps(props)
  )

  /**
   * Information about the registered transit gateway multicast domain group members.
   */
  public open fun attrGroupMember(): IResolvable =
      unwrap(this).getAttrGroupMember().let(IResolvable::wrap)

  /**
   * Indicates that the resource is a transit gateway group member.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The group sources' network interface IDs to register with the transit gateway multicast group.
   */
  public open fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

  /**
   * The group sources' network interface IDs to register with the transit gateway multicast group.
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
   * [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IP address assigned to the transit gateway multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-groupipaddress)
     * @param groupIpAddress The IP address assigned to the transit gateway multicast group. 
     */
    public fun groupIpAddress(groupIpAddress: String)

    /**
     * The group sources' network interface IDs to register with the transit gateway multicast
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-networkinterfaceid)
     * @param networkInterfaceId The group sources' network interface IDs to register with the
     * transit gateway multicast group. 
     */
    public fun networkInterfaceId(networkInterfaceId: String)

    /**
     * The ID of the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-transitgatewaymulticastdomainid)
     * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. 
     */
    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource.Builder.create(scope,
        id)

    /**
     * The IP address assigned to the transit gateway multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-groupipaddress)
     * @param groupIpAddress The IP address assigned to the transit gateway multicast group. 
     */
    override fun groupIpAddress(groupIpAddress: String) {
      cdkBuilder.groupIpAddress(groupIpAddress)
    }

    /**
     * The group sources' network interface IDs to register with the transit gateway multicast
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-networkinterfaceid)
     * @param networkInterfaceId The group sources' network interface IDs to register with the
     * transit gateway multicast group. 
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * The ID of the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-transitgatewaymulticastdomainid)
     * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. 
     */
    override fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
      cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayMulticastGroupSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayMulticastGroupSource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource):
        CfnTransitGatewayMulticastGroupSource = CfnTransitGatewayMulticastGroupSource(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastGroupSource):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource =
        wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource
  }
}
