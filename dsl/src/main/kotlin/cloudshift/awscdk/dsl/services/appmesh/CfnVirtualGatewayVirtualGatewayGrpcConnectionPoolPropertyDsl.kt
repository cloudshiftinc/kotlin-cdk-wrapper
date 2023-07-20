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
public class CfnVirtualGatewayVirtualGatewayGrpcConnectionPoolPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty.Builder =
        CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty.builder()

    public fun maxRequests(maxRequests: Number) {
        cdkBuilder.maxRequests(maxRequests)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty =
        cdkBuilder.build()
}
