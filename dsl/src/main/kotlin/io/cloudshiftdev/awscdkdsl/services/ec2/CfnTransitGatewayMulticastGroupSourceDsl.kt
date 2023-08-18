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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource
import software.constructs.Construct

/**
 * Registers sources (network interfaces) with the specified transit gateway multicast domain.
 *
 * A multicast source is a network interface attached to a supported instance that sends multicast
 * traffic. For information about supported instances, see
 * [Multicast Considerations](https://docs.aws.amazon.com/vpc/latest/tgw/transit-gateway-limits.html#multicast-limits)
 * in *Amazon VPC Transit Gateways* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
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
@CdkDslMarker
public class CfnTransitGatewayMulticastGroupSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTransitGatewayMulticastGroupSource.Builder =
        CfnTransitGatewayMulticastGroupSource.Builder.create(scope, id)

    /**
     * The IP address assigned to the transit gateway multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-groupipaddress)
     *
     * @param groupIpAddress The IP address assigned to the transit gateway multicast group.
     */
    public fun groupIpAddress(groupIpAddress: String) {
        cdkBuilder.groupIpAddress(groupIpAddress)
    }

    /**
     * The group sources' network interface IDs to register with the transit gateway multicast
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-networkinterfaceid)
     *
     * @param networkInterfaceId The group sources' network interface IDs to register with the
     *   transit gateway multicast group.
     */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * The ID of the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastgroupsource.html#cfn-ec2-transitgatewaymulticastgroupsource-transitgatewaymulticastdomainid)
     *
     * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain.
     */
    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
        cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build(): CfnTransitGatewayMulticastGroupSource = cdkBuilder.build()
}
