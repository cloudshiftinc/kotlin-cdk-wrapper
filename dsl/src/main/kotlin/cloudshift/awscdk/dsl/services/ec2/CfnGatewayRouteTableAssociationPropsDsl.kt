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
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnGatewayRouteTableAssociationPropsDsl {
    private val cdkBuilder: CfnGatewayRouteTableAssociationProps.Builder =
        CfnGatewayRouteTableAssociationProps.builder()

    public fun gatewayId(gatewayId: String) {
        cdkBuilder.gatewayId(gatewayId)
    }

    public fun routeTableId(routeTableId: String) {
        cdkBuilder.routeTableId(routeTableId)
    }

    public fun build(): CfnGatewayRouteTableAssociationProps = cdkBuilder.build()
}
