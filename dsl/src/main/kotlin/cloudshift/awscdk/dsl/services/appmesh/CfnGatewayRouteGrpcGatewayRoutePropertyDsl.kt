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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteGrpcGatewayRoutePropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.GrpcGatewayRouteProperty.Builder =
        CfnGatewayRoute.GrpcGatewayRouteProperty.builder()

    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    public fun action(action: CfnGatewayRoute.GrpcGatewayRouteActionProperty) {
        cdkBuilder.action(action)
    }

    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    public fun match(match: CfnGatewayRoute.GrpcGatewayRouteMatchProperty) {
        cdkBuilder.match(match)
    }

    public fun build(): CfnGatewayRoute.GrpcGatewayRouteProperty = cdkBuilder.build()
}
