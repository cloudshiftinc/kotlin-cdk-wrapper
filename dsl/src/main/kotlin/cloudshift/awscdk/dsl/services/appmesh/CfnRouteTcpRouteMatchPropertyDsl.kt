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
import software.amazon.awscdk.services.appmesh.CfnRoute
import kotlin.Number

@CdkDslMarker
public class CfnRouteTcpRouteMatchPropertyDsl {
    private val cdkBuilder: CfnRoute.TcpRouteMatchProperty.Builder =
        CfnRoute.TcpRouteMatchProperty.builder()

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnRoute.TcpRouteMatchProperty = cdkBuilder.build()
}
