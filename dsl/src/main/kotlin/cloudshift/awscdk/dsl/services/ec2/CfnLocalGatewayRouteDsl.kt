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
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnLocalGatewayRouteDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLocalGatewayRoute.Builder = CfnLocalGatewayRoute.Builder.create(
        scope,
        id,
    )

    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    public fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
        cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
        cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
    }

    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun build(): CfnLocalGatewayRoute = cdkBuilder.build()
}
