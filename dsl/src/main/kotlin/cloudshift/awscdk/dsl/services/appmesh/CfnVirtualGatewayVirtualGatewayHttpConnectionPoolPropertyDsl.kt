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
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import kotlin.Number

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayHttpConnectionPoolPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty.Builder =
        CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty.builder()

    public fun maxConnections(maxConnections: Number) {
        cdkBuilder.maxConnections(maxConnections)
    }

    public fun maxPendingRequests(maxPendingRequests: Number) {
        cdkBuilder.maxPendingRequests(maxPendingRequests)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty =
        cdkBuilder.build()
}
