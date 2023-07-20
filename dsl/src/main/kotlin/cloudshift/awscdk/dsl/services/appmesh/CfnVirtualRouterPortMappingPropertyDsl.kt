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
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnVirtualRouterPortMappingPropertyDsl {
    private val cdkBuilder: CfnVirtualRouter.PortMappingProperty.Builder =
        CfnVirtualRouter.PortMappingProperty.builder()

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnVirtualRouter.PortMappingProperty = cdkBuilder.build()
}
