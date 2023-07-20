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
public class CfnGatewayRouteHttpGatewayRouteActionPropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.HttpGatewayRouteActionProperty.Builder =
        CfnGatewayRoute.HttpGatewayRouteActionProperty.builder()

    public fun rewrite(rewrite: IResolvable) {
        cdkBuilder.rewrite(rewrite)
    }

    public fun rewrite(rewrite: CfnGatewayRoute.HttpGatewayRouteRewriteProperty) {
        cdkBuilder.rewrite(rewrite)
    }

    public fun target(target: IResolvable) {
        cdkBuilder.target(target)
    }

    public fun target(target: CfnGatewayRoute.GatewayRouteTargetProperty) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnGatewayRoute.HttpGatewayRouteActionProperty = cdkBuilder.build()
}
