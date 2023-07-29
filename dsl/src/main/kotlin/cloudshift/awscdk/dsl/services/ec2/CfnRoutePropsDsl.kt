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
import software.amazon.awscdk.services.ec2.CfnRouteProps

/**
 * Properties for defining a `CfnRoute`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnRouteProps cfnRouteProps = CfnRouteProps.builder()
 * .routeTableId("routeTableId")
 * // the properties below are optional
 * .carrierGatewayId("carrierGatewayId")
 * .destinationCidrBlock("destinationCidrBlock")
 * .destinationIpv6CidrBlock("destinationIpv6CidrBlock")
 * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
 * .gatewayId("gatewayId")
 * .instanceId("instanceId")
 * .localGatewayId("localGatewayId")
 * .natGatewayId("natGatewayId")
 * .networkInterfaceId("networkInterfaceId")
 * .transitGatewayId("transitGatewayId")
 * .vpcEndpointId("vpcEndpointId")
 * .vpcPeeringConnectionId("vpcPeeringConnectionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html)
 */
@CdkDslMarker
public class CfnRoutePropsDsl {
    private val cdkBuilder: CfnRouteProps.Builder = CfnRouteProps.builder()

    /**
     * @param carrierGatewayId The ID of the carrier gateway. You can only use this option when the
     *   VPC contains a subnet which is associated with a Wavelength Zone.
     */
    public fun carrierGatewayId(carrierGatewayId: String) {
        cdkBuilder.carrierGatewayId(carrierGatewayId)
    }

    /**
     * @param destinationCidrBlock The IPv4 CIDR address block used for the destination match.
     *   Routing decisions are based on the most specific match. We modify the specified CIDR block
     *   to its canonical form; for example, if you specify `100.68.0.18/18` , we modify it to
     *   `100.68.0.0/18` .
     */
    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * @param destinationIpv6CidrBlock The IPv6 CIDR block used for the destination match. Routing
     *   decisions are based on the most specific match.
     */
    public fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String) {
        cdkBuilder.destinationIpv6CidrBlock(destinationIpv6CidrBlock)
    }

    /**
     * @param egressOnlyInternetGatewayId [IPv6 traffic only] The ID of an egress-only internet
     *   gateway.
     */
    public fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String) {
        cdkBuilder.egressOnlyInternetGatewayId(egressOnlyInternetGatewayId)
    }

    /**
     * @param gatewayId The ID of an internet gateway or virtual private gateway attached to your
     *   VPC.
     */
    public fun gatewayId(gatewayId: String) {
        cdkBuilder.gatewayId(gatewayId)
    }

    /**
     * @param instanceId The ID of a NAT instance in your VPC. The operation fails if you specify an
     *   instance ID unless exactly one network interface is attached.
     */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    /** @param localGatewayId The ID of the local gateway. */
    public fun localGatewayId(localGatewayId: String) {
        cdkBuilder.localGatewayId(localGatewayId)
    }

    /** @param natGatewayId [IPv4 traffic only] The ID of a NAT gateway. */
    public fun natGatewayId(natGatewayId: String) {
        cdkBuilder.natGatewayId(natGatewayId)
    }

    /** @param networkInterfaceId The ID of a network interface. */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /** @param routeTableId The ID of the route table for the route. */
    public fun routeTableId(routeTableId: String) {
        cdkBuilder.routeTableId(routeTableId)
    }

    /** @param transitGatewayId The ID of a transit gateway. */
    public fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /**
     * @param vpcEndpointId The ID of a VPC endpoint. Supported for Gateway Load Balancer endpoints
     *   only.
     */
    public fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    /** @param vpcPeeringConnectionId The ID of a VPC peering connection. */
    public fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
        cdkBuilder.vpcPeeringConnectionId(vpcPeeringConnectionId)
    }

    public fun build(): CfnRouteProps = cdkBuilder.build()
}
