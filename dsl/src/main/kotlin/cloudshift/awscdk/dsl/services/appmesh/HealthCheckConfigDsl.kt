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
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.HealthCheckConfig
import kotlin.Unit

@CdkDslMarker
public class HealthCheckConfigDsl {
    private val cdkBuilder: HealthCheckConfig.Builder = HealthCheckConfig.builder()

    public fun virtualGatewayHealthCheck(
        block: CfnVirtualGatewayVirtualGatewayHealthCheckPolicyPropertyDsl.() -> Unit =
            {},
    ) {
        val builder = CfnVirtualGatewayVirtualGatewayHealthCheckPolicyPropertyDsl()
        builder.apply(block)
        cdkBuilder.virtualGatewayHealthCheck(builder.build())
    }

    public fun virtualGatewayHealthCheck(virtualGatewayHealthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty) {
        cdkBuilder.virtualGatewayHealthCheck(virtualGatewayHealthCheck)
    }

    public fun virtualNodeHealthCheck(block: CfnVirtualNodeHealthCheckPropertyDsl.() -> Unit = {}) {
        val builder = CfnVirtualNodeHealthCheckPropertyDsl()
        builder.apply(block)
        cdkBuilder.virtualNodeHealthCheck(builder.build())
    }

    public fun virtualNodeHealthCheck(virtualNodeHealthCheck: CfnVirtualNode.HealthCheckProperty) {
        cdkBuilder.virtualNodeHealthCheck(virtualNodeHealthCheck)
    }

    public fun build(): HealthCheckConfig = cdkBuilder.build()
}
