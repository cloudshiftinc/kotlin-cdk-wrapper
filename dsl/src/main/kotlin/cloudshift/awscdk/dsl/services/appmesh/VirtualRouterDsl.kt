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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualRouter
import software.amazon.awscdk.services.appmesh.VirtualRouterListener
import software.constructs.Construct

/**
 * Example:
 * ```
 * Mesh mesh;
 * VirtualRouter router = mesh.addVirtualRouter("router", VirtualRouterBaseProps.builder()
 * .listeners(List.of(VirtualRouterListener.http(8080)))
 * .build());
 * ```
 */
@CdkDslMarker
public class VirtualRouterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: VirtualRouter.Builder = VirtualRouter.Builder.create(scope, id)

    private val _listeners: MutableList<VirtualRouterListener> = mutableListOf()

    /**
     * Listener specification for the VirtualRouter.
     *
     * Default: - A listener on HTTP port 8080
     *
     * @param listeners Listener specification for the VirtualRouter.
     */
    public fun listeners(vararg listeners: VirtualRouterListener) {
        _listeners.addAll(listOf(*listeners))
    }

    /**
     * Listener specification for the VirtualRouter.
     *
     * Default: - A listener on HTTP port 8080
     *
     * @param listeners Listener specification for the VirtualRouter.
     */
    public fun listeners(listeners: Collection<VirtualRouterListener>) {
        _listeners.addAll(listeners)
    }

    /**
     * The Mesh which the VirtualRouter belongs to.
     *
     * @param mesh The Mesh which the VirtualRouter belongs to.
     */
    public fun mesh(mesh: IMesh) {
        cdkBuilder.mesh(mesh)
    }

    /**
     * The name of the VirtualRouter.
     *
     * Default: - A name is automatically determined
     *
     * @param virtualRouterName The name of the VirtualRouter.
     */
    public fun virtualRouterName(virtualRouterName: String) {
        cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): VirtualRouter {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
