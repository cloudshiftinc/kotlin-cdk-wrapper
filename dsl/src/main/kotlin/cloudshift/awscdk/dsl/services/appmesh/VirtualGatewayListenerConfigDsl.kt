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
import software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig
import kotlin.Unit

@CdkDslMarker
public class VirtualGatewayListenerConfigDsl {
    private val cdkBuilder: VirtualGatewayListenerConfig.Builder =
        VirtualGatewayListenerConfig.builder()

    public fun listener(block: CfnVirtualGatewayVirtualGatewayListenerPropertyDsl.() -> Unit = {}) {
        val builder = CfnVirtualGatewayVirtualGatewayListenerPropertyDsl()
        builder.apply(block)
        cdkBuilder.listener(builder.build())
    }

    public fun listener(listener: CfnVirtualGateway.VirtualGatewayListenerProperty) {
        cdkBuilder.listener(listener)
    }

    public fun build(): VirtualGatewayListenerConfig = cdkBuilder.build()
}
