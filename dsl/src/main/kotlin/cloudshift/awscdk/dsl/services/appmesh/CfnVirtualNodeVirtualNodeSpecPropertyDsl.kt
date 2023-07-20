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
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVirtualNodeVirtualNodeSpecPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.VirtualNodeSpecProperty.Builder =
        CfnVirtualNode.VirtualNodeSpecProperty.builder()

    private val _backends: MutableList<Any> = mutableListOf()

    private val _listeners: MutableList<Any> = mutableListOf()

    public fun backendDefaults(backendDefaults: IResolvable) {
        cdkBuilder.backendDefaults(backendDefaults)
    }

    public fun backendDefaults(backendDefaults: CfnVirtualNode.BackendDefaultsProperty) {
        cdkBuilder.backendDefaults(backendDefaults)
    }

    public fun backends(vararg backends: Any) {
        _backends.addAll(listOf(*backends))
    }

    public fun backends(backends: Collection<Any>) {
        _backends.addAll(backends)
    }

    public fun backends(backends: IResolvable) {
        cdkBuilder.backends(backends)
    }

    public fun listeners(vararg listeners: Any) {
        _listeners.addAll(listOf(*listeners))
    }

    public fun listeners(listeners: Collection<Any>) {
        _listeners.addAll(listeners)
    }

    public fun listeners(listeners: IResolvable) {
        cdkBuilder.listeners(listeners)
    }

    public fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging)
    }

    public fun logging(logging: CfnVirtualNode.LoggingProperty) {
        cdkBuilder.logging(logging)
    }

    public fun serviceDiscovery(serviceDiscovery: IResolvable) {
        cdkBuilder.serviceDiscovery(serviceDiscovery)
    }

    public fun serviceDiscovery(serviceDiscovery: CfnVirtualNode.ServiceDiscoveryProperty) {
        cdkBuilder.serviceDiscovery(serviceDiscovery)
    }

    public fun build(): CfnVirtualNode.VirtualNodeSpecProperty {
        if (_backends.isNotEmpty()) cdkBuilder.backends(_backends)
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
