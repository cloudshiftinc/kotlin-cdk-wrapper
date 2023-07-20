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
import software.amazon.awscdk.services.appmesh.CfnVirtualService
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig
import kotlin.Unit

@CdkDslMarker
public class VirtualServiceProviderConfigDsl {
    private val cdkBuilder: VirtualServiceProviderConfig.Builder =
        VirtualServiceProviderConfig.builder()

    public fun mesh(mesh: IMesh) {
        cdkBuilder.mesh(mesh)
    }

    public fun virtualNodeProvider(
        block: CfnVirtualServiceVirtualNodeServiceProviderPropertyDsl.() -> Unit =
            {},
    ) {
        val builder = CfnVirtualServiceVirtualNodeServiceProviderPropertyDsl()
        builder.apply(block)
        cdkBuilder.virtualNodeProvider(builder.build())
    }

    public fun virtualNodeProvider(virtualNodeProvider: CfnVirtualService.VirtualNodeServiceProviderProperty) {
        cdkBuilder.virtualNodeProvider(virtualNodeProvider)
    }

    public fun virtualRouterProvider(
        block: CfnVirtualServiceVirtualRouterServiceProviderPropertyDsl.() -> Unit =
            {},
    ) {
        val builder = CfnVirtualServiceVirtualRouterServiceProviderPropertyDsl()
        builder.apply(block)
        cdkBuilder.virtualRouterProvider(builder.build())
    }

    public fun virtualRouterProvider(virtualRouterProvider: CfnVirtualService.VirtualRouterServiceProviderProperty) {
        cdkBuilder.virtualRouterProvider(virtualRouterProvider)
    }

    public fun build(): VirtualServiceProviderConfig = cdkBuilder.build()
}
