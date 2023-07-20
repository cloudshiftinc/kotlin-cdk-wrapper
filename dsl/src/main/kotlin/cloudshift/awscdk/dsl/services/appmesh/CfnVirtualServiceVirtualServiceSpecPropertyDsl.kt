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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualService

@CdkDslMarker
public class CfnVirtualServiceVirtualServiceSpecPropertyDsl {
    private val cdkBuilder: CfnVirtualService.VirtualServiceSpecProperty.Builder =
        CfnVirtualService.VirtualServiceSpecProperty.builder()

    public fun provider(provider: IResolvable) {
        cdkBuilder.provider(provider)
    }

    public fun provider(provider: CfnVirtualService.VirtualServiceProviderProperty) {
        cdkBuilder.provider(provider)
    }

    public fun build(): CfnVirtualService.VirtualServiceSpecProperty = cdkBuilder.build()
}
