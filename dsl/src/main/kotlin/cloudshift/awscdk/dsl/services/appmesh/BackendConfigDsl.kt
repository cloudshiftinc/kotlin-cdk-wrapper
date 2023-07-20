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
import software.amazon.awscdk.services.appmesh.BackendConfig
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import kotlin.Unit

@CdkDslMarker
public class BackendConfigDsl {
    private val cdkBuilder: BackendConfig.Builder = BackendConfig.builder()

    public fun virtualServiceBackend(block: CfnVirtualNodeBackendPropertyDsl.() -> Unit = {}) {
        val builder = CfnVirtualNodeBackendPropertyDsl()
        builder.apply(block)
        cdkBuilder.virtualServiceBackend(builder.build())
    }

    public fun virtualServiceBackend(virtualServiceBackend: CfnVirtualNode.BackendProperty) {
        cdkBuilder.virtualServiceBackend(virtualServiceBackend)
    }

    public fun build(): BackendConfig = cdkBuilder.build()
}
