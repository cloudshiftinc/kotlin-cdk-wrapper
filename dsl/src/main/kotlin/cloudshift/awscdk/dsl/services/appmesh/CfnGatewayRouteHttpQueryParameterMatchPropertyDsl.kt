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
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import kotlin.String

@CdkDslMarker
public class CfnGatewayRouteHttpQueryParameterMatchPropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.HttpQueryParameterMatchProperty.Builder =
        CfnGatewayRoute.HttpQueryParameterMatchProperty.builder()

    public fun exact(exact: String) {
        cdkBuilder.exact(exact)
    }

    public fun build(): CfnGatewayRoute.HttpQueryParameterMatchProperty = cdkBuilder.build()
}
