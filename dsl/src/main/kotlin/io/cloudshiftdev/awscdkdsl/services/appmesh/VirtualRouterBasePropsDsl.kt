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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps
import software.amazon.awscdk.services.appmesh.VirtualRouterListener

/**
 * Interface with base properties all routers willl inherit.
 *
 * Example:
 * ```
 * Mesh mesh;
 * VirtualRouter router = mesh.addVirtualRouter("router", VirtualRouterBaseProps.builder()
 * .listeners(List.of(VirtualRouterListener.http(8080)))
 * .build());
 * ```
 */
@CdkDslMarker
public class VirtualRouterBasePropsDsl {
    private val cdkBuilder: VirtualRouterBaseProps.Builder = VirtualRouterBaseProps.builder()

    private val _listeners: MutableList<VirtualRouterListener> = mutableListOf()

    /** @param listeners Listener specification for the VirtualRouter. */
    public fun listeners(vararg listeners: VirtualRouterListener) {
        _listeners.addAll(listOf(*listeners))
    }

    /** @param listeners Listener specification for the VirtualRouter. */
    public fun listeners(listeners: Collection<VirtualRouterListener>) {
        _listeners.addAll(listeners)
    }

    /** @param virtualRouterName The name of the VirtualRouter. */
    public fun virtualRouterName(virtualRouterName: String) {
        cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): VirtualRouterBaseProps {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
