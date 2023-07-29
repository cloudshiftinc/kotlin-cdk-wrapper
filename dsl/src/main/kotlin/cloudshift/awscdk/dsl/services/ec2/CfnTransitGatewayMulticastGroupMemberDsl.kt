@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember
import software.constructs.Construct

/**
 * Registers members (network interfaces) with the transit gateway multicast group.
 *
 * A member is a network interface associated with a supported EC2 instance that receives multicast
 * traffic. For information about supported instances, see
 * [Multicast Consideration](https://docs.aws.amazon.com/vpc/latest/tgw/transit-gateway-limits.html#multicast-limits)
 * in *Amazon VPC Transit Gateways* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTransitGatewayMulticastGroupMember cfnTransitGatewayMulticastGroupMember =
 * CfnTransitGatewayMulticastGroupMember.Builder.create(this,
 * "MyCfnTransitGatewayMulticastGroupMember")
 * .groupIpAddress("groupIpAddress")
 * .networkInterfaceId("networkInterfaceId")
 * .transitGatewayMulticastDomainId("transitGatewayMulticastDomainId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html)
 */
@CdkDslMarker
public class CfnTransitGatewayMulticastGroupMemberDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTransitGatewayMulticastGroupMember.Builder =
        CfnTransitGatewayMulticastGroupMember.Builder.create(scope, id)

    /**
     * The IP address assigned to the transit gateway multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-groupipaddress)
     *
     * @param groupIpAddress The IP address assigned to the transit gateway multicast group.
     */
    public fun groupIpAddress(groupIpAddress: String) {
        cdkBuilder.groupIpAddress(groupIpAddress)
    }

    /**
     * The group members' network interface IDs to register with the transit gateway multicast
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-networkinterfaceid)
     *
     * @param networkInterfaceId The group members' network interface IDs to register with the
     *   transit gateway multicast group.
     */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * The ID of the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupmember.html#cfn-ec2-transitgatewaymulticastgroupmember-transitgatewaymulticastdomainid)
     *
     * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain.
     */
    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
        cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build(): CfnTransitGatewayMulticastGroupMember = cdkBuilder.build()
}
