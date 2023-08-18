@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter
import software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig

/**
 * Properties for a VirtualRouter listener.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualRouterListenerConfig virtualRouterListenerConfig = VirtualRouterListenerConfig.builder()
 * .listener(VirtualRouterListenerProperty.builder()
 * .portMapping(PortMappingProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class VirtualRouterListenerConfigDsl {
    private val cdkBuilder: VirtualRouterListenerConfig.Builder =
        VirtualRouterListenerConfig.builder()

    /** @param listener Single listener config for a VirtualRouter. */
    public fun listener(
        listener: CfnVirtualRouterVirtualRouterListenerPropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnVirtualRouterVirtualRouterListenerPropertyDsl()
        builder.apply(listener)
        cdkBuilder.listener(builder.build())
    }

    /** @param listener Single listener config for a VirtualRouter. */
    public fun listener(listener: CfnVirtualRouter.VirtualRouterListenerProperty) {
        cdkBuilder.listener(listener)
    }

    public fun build(): VirtualRouterListenerConfig = cdkBuilder.build()
}
