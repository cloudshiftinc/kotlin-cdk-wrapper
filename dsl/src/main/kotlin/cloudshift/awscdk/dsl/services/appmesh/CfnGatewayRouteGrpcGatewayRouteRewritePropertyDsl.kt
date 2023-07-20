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
public class CfnGatewayRouteGrpcGatewayRouteRewritePropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.GrpcGatewayRouteRewriteProperty.Builder =
        CfnGatewayRoute.GrpcGatewayRouteRewriteProperty.builder()

    public fun hostname(hostname: IResolvable) {
        cdkBuilder.hostname(hostname)
    }

    public fun hostname(hostname: CfnGatewayRoute.GatewayRouteHostnameRewriteProperty) {
        cdkBuilder.hostname(hostname)
    }

    public fun build(): CfnGatewayRoute.GrpcGatewayRouteRewriteProperty = cdkBuilder.build()
}
