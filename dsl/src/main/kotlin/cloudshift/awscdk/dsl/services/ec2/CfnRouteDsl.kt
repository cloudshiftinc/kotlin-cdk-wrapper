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
import software.amazon.awscdk.services.ec2.CfnRoute
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnRouteDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRoute.Builder = CfnRoute.Builder.create(scope, id)

    public fun carrierGatewayId(carrierGatewayId: String) {
        cdkBuilder.carrierGatewayId(carrierGatewayId)
    }

    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    public fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String) {
        cdkBuilder.destinationIpv6CidrBlock(destinationIpv6CidrBlock)
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

    public fun localGatewayId(localGatewayId: String) {
        cdkBuilder.localGatewayId(localGatewayId)
    }

    public fun natGatewayId(natGatewayId: String) {
        cdkBuilder.natGatewayId(natGatewayId)
    }

    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun routeTableId(routeTableId: String) {
        cdkBuilder.routeTableId(routeTableId)
    }

    public fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
        cdkBuilder.vpcPeeringConnectionId(vpcPeeringConnectionId)
    }

    public fun build(): CfnRoute = cdkBuilder.build()
}
