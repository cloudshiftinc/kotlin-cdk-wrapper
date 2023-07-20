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
import software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions
import kotlin.Number

@CdkDslMarker
public class CommonGatewayRouteSpecOptionsDsl {
    private val cdkBuilder: CommonGatewayRouteSpecOptions.Builder =
        CommonGatewayRouteSpecOptions.builder()

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun build(): CommonGatewayRouteSpecOptions = cdkBuilder.build()
}
