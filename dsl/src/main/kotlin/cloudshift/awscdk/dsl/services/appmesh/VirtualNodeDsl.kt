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
import software.amazon.awscdk.services.appmesh.AccessLog
import software.amazon.awscdk.services.appmesh.Backend
import software.amazon.awscdk.services.appmesh.BackendDefaults
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.ServiceDiscovery
import software.amazon.awscdk.services.appmesh.VirtualNode
import software.amazon.awscdk.services.appmesh.VirtualNodeListener
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class VirtualNodeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: VirtualNode.Builder = VirtualNode.Builder.create(scope, id)

    private val _backends: MutableList<Backend> = mutableListOf()

    private val _listeners: MutableList<VirtualNodeListener> = mutableListOf()

    public fun accessLog(accessLog: AccessLog) {
        cdkBuilder.accessLog(accessLog)
    }

    public fun backendDefaults(block: BackendDefaultsDsl.() -> Unit = {}) {
        val builder = BackendDefaultsDsl()
        builder.apply(block)
        cdkBuilder.backendDefaults(builder.build())
    }

    public fun backendDefaults(backendDefaults: BackendDefaults) {
        cdkBuilder.backendDefaults(backendDefaults)
    }

    public fun backends(vararg backends: Backend) {
        _backends.addAll(listOf(*backends))
    }

    public fun backends(backends: Collection<Backend>) {
        _backends.addAll(backends)
    }

    public fun listeners(vararg listeners: VirtualNodeListener) {
        _listeners.addAll(listOf(*listeners))
    }

    public fun listeners(listeners: Collection<VirtualNodeListener>) {
        _listeners.addAll(listeners)
    }

    public fun mesh(mesh: IMesh) {
        cdkBuilder.mesh(mesh)
    }

    public fun serviceDiscovery(serviceDiscovery: ServiceDiscovery) {
        cdkBuilder.serviceDiscovery(serviceDiscovery)
    }

    public fun virtualNodeName(virtualNodeName: String) {
        cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): VirtualNode {
        if (_backends.isNotEmpty()) cdkBuilder.backends(_backends)
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
