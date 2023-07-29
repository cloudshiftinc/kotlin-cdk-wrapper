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
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

/**
 * Describes a route table route.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AnalysisRouteTableRouteProperty analysisRouteTableRouteProperty =
 * AnalysisRouteTableRouteProperty.builder()
 * .destinationCidr("destinationCidr")
 * .destinationPrefixListId("destinationPrefixListId")
 * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
 * .gatewayId("gatewayId")
 * .instanceId("instanceId")
 * .natGatewayId("natGatewayId")
 * .networkInterfaceId("networkInterfaceId")
 * .origin("origin")
 * .state("state")
 * .transitGatewayId("transitGatewayId")
 * .vpcPeeringConnectionId("vpcPeeringConnectionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisroutetableroute.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisRouteTableRoutePropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty.Builder =
        CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty.builder()

    /** @param destinationCidr The destination IPv4 address, in CIDR notation. */
    public fun destinationCidr(destinationCidr: String) {
        cdkBuilder.destinationCidr(destinationCidr)
    }

    /** @param destinationPrefixListId The prefix of the AWS service . */
    public fun destinationPrefixListId(destinationPrefixListId: String) {
        cdkBuilder.destinationPrefixListId(destinationPrefixListId)
    }

    /** @param egressOnlyInternetGatewayId The ID of an egress-only internet gateway. */
    public fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String) {
        cdkBuilder.egressOnlyInternetGatewayId(egressOnlyInternetGatewayId)
    }

    /**
     * @param gatewayId The ID of the gateway, such as an internet gateway or virtual private
     *   gateway.
     */
    public fun gatewayId(gatewayId: String) {
        cdkBuilder.gatewayId(gatewayId)
    }

    /** @param instanceId The ID of the instance, such as a NAT instance. */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    /** @param natGatewayId The ID of a NAT gateway. */
    public fun natGatewayId(natGatewayId: String) {
        cdkBuilder.natGatewayId(natGatewayId)
    }

    /** @param networkInterfaceId The ID of a network interface. */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * @param origin Describes how the route was created. The following are the possible values:.
     * * CreateRouteTable - The route was automatically created when the route table was created.
     * * CreateRoute - The route was manually added to the route table.
     * * EnableVgwRoutePropagation - The route was propagated by route propagation.
     */
    public fun origin(origin: String) {
        cdkBuilder.origin(origin)
    }

    /**
     * @param state The state. The following are the possible values:.
     * * active
     * * blackhole
     */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    /** @param transitGatewayId The ID of a transit gateway. */
    public fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /** @param vpcPeeringConnectionId The ID of a VPC peering connection. */
    public fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
        cdkBuilder.vpcPeeringConnectionId(vpcPeeringConnectionId)
    }

    public fun build(): CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty =
        cdkBuilder.build()
}
