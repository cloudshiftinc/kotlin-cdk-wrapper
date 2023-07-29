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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps

/**
 * Properties for defining a `CfnTransitGatewayMulticastGroupSource`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
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
@CdkDslMarker
public class CfnTransitGatewayMulticastGroupSourcePropsDsl {
    private val cdkBuilder: CfnTransitGatewayMulticastGroupSourceProps.Builder =
        CfnTransitGatewayMulticastGroupSourceProps.builder()

    /** @param groupIpAddress The IP address assigned to the transit gateway multicast group. */
    public fun groupIpAddress(groupIpAddress: String) {
        cdkBuilder.groupIpAddress(groupIpAddress)
    }

    /**
     * @param networkInterfaceId The group sources' network interface IDs to register with the
     *   transit gateway multicast group.
     */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /** @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. */
    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
        cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build(): CfnTransitGatewayMulticastGroupSourceProps = cdkBuilder.build()
}
