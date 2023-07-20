@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis
import kotlin.String

@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisRouteTableRoutePropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty.Builder =
        CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty.builder()

    public fun destinationCidr(destinationCidr: String) {
        cdkBuilder.destinationCidr(destinationCidr)
    }

    public fun destinationPrefixListId(destinationPrefixListId: String) {
        cdkBuilder.destinationPrefixListId(destinationPrefixListId)
    }

    public fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String) {
        cdkBuilder.egressOnlyInternetGatewayId(egressOnlyInternetGatewayId)
    }

    public fun gatewayId(gatewayId: String) {
        cdkBuilder.gatewayId(gatewayId)
    }

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun natGatewayId(natGatewayId: String) {
        cdkBuilder.natGatewayId(natGatewayId)
    }

    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun origin(origin: String) {
        cdkBuilder.origin(origin)
    }

    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
        cdkBuilder.vpcPeeringConnectionId(vpcPeeringConnectionId)
    }

    public fun build(): CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty =
        cdkBuilder.build()
}
