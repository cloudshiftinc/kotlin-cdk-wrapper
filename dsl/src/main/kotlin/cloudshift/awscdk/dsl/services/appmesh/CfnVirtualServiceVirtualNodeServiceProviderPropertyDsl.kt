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
import kotlin.String

@CdkDslMarker
public class CfnVirtualServiceVirtualNodeServiceProviderPropertyDsl {
    private val cdkBuilder: CfnVirtualService.VirtualNodeServiceProviderProperty.Builder =
        CfnVirtualService.VirtualNodeServiceProviderProperty.builder()

    public fun virtualNodeName(virtualNodeName: String) {
        cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): CfnVirtualService.VirtualNodeServiceProviderProperty = cdkBuilder.build()
}
