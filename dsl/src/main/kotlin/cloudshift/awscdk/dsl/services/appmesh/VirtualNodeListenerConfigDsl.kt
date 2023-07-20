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
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig
import kotlin.Unit

@CdkDslMarker
public class VirtualNodeListenerConfigDsl {
    private val cdkBuilder: VirtualNodeListenerConfig.Builder = VirtualNodeListenerConfig.builder()

    public fun listener(block: CfnVirtualNodeListenerPropertyDsl.() -> Unit = {}) {
        val builder = CfnVirtualNodeListenerPropertyDsl()
        builder.apply(block)
        cdkBuilder.listener(builder.build())
    }

    public fun listener(listener: CfnVirtualNode.ListenerProperty) {
        cdkBuilder.listener(listener)
    }

    public fun build(): VirtualNodeListenerConfig = cdkBuilder.build()
}
