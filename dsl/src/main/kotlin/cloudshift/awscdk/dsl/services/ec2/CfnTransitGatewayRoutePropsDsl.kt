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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnTransitGatewayRoutePropsDsl {
    private val cdkBuilder: CfnTransitGatewayRouteProps.Builder =
        CfnTransitGatewayRouteProps.builder()

    public fun blackhole(blackhole: Boolean) {
        cdkBuilder.blackhole(blackhole)
    }

    public fun blackhole(blackhole: IResolvable) {
        cdkBuilder.blackhole(blackhole)
    }

    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
        cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
        cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): CfnTransitGatewayRouteProps = cdkBuilder.build()
}
