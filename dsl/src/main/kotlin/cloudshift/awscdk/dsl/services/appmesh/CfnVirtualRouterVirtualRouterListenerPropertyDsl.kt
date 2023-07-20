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
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter

@CdkDslMarker
public class CfnVirtualRouterVirtualRouterListenerPropertyDsl {
    private val cdkBuilder: CfnVirtualRouter.VirtualRouterListenerProperty.Builder =
        CfnVirtualRouter.VirtualRouterListenerProperty.builder()

    public fun portMapping(portMapping: IResolvable) {
        cdkBuilder.portMapping(portMapping)
    }

    public fun portMapping(portMapping: CfnVirtualRouter.PortMappingProperty) {
        cdkBuilder.portMapping(portMapping)
    }

    public fun build(): CfnVirtualRouter.VirtualRouterListenerProperty = cdkBuilder.build()
}
