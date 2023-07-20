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
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualRouterListener
import software.amazon.awscdk.services.appmesh.VirtualRouterProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class VirtualRouterPropsDsl {
    private val cdkBuilder: VirtualRouterProps.Builder = VirtualRouterProps.builder()

    private val _listeners: MutableList<VirtualRouterListener> = mutableListOf()

    public fun listeners(vararg listeners: VirtualRouterListener) {
        _listeners.addAll(listOf(*listeners))
    }

    public fun listeners(listeners: Collection<VirtualRouterListener>) {
        _listeners.addAll(listeners)
    }

    public fun mesh(mesh: IMesh) {
        cdkBuilder.mesh(mesh)
    }

    public fun virtualRouterName(virtualRouterName: String) {
        cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): VirtualRouterProps {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
