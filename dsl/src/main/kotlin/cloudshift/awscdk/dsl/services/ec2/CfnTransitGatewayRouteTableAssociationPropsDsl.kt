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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnTransitGatewayRouteTableAssociationPropsDsl {
    private val cdkBuilder: CfnTransitGatewayRouteTableAssociationProps.Builder =
        CfnTransitGatewayRouteTableAssociationProps.builder()

    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
        cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
        cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): CfnTransitGatewayRouteTableAssociationProps = cdkBuilder.build()
}
