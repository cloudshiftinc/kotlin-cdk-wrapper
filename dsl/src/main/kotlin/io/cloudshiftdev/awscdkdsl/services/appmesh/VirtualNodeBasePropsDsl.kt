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
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.AccessLog
import software.amazon.awscdk.services.appmesh.Backend
import software.amazon.awscdk.services.appmesh.BackendDefaults
import software.amazon.awscdk.services.appmesh.ServiceDiscovery
import software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps
import software.amazon.awscdk.services.appmesh.VirtualNodeListener

/**
 * Basic configuration properties for a VirtualNode.
 *
 * Example:
 * ```
 * Mesh mesh;
 * Vpc vpc = new Vpc(this, "vpc");
 * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
 * .vpc(vpc)
 * .name("domain.local")
 * .build();
 * Service service = namespace.createService("Svc");
 * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
 * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(8081)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .healthyThreshold(3)
 * .interval(Duration.seconds(5)) // minimum
 * .path("/health-check-path")
 * .timeout(Duration.seconds(2)) // minimum
 * .unhealthyThreshold(2)
 * .build()))
 * .build())))
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .build());
 * ```
 */
@CdkDslMarker
public class VirtualNodeBasePropsDsl {
    private val cdkBuilder: VirtualNodeBaseProps.Builder = VirtualNodeBaseProps.builder()

    private val _backends: MutableList<Backend> = mutableListOf()

    private val _listeners: MutableList<VirtualNodeListener> = mutableListOf()

    /** @param accessLog Access Logging Configuration for the virtual node. */
    public fun accessLog(accessLog: AccessLog) {
        cdkBuilder.accessLog(accessLog)
    }

    /**
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     *   Service.
     */
    public fun backendDefaults(backendDefaults: BackendDefaultsDsl.() -> Unit = {}) {
        val builder = BackendDefaultsDsl()
        builder.apply(backendDefaults)
        cdkBuilder.backendDefaults(builder.build())
    }

    /**
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     *   Service.
     */
    public fun backendDefaults(backendDefaults: BackendDefaults) {
        cdkBuilder.backendDefaults(backendDefaults)
    }

    /** @param backends Virtual Services that this is node expected to send outbound traffic to. */
    public fun backends(vararg backends: Backend) {
        _backends.addAll(listOf(*backends))
    }

    /** @param backends Virtual Services that this is node expected to send outbound traffic to. */
    public fun backends(backends: Collection<Backend>) {
        _backends.addAll(backends)
    }

    /** @param listeners Initial listener for the virtual node. */
    public fun listeners(vararg listeners: VirtualNodeListener) {
        _listeners.addAll(listOf(*listeners))
    }

    /** @param listeners Initial listener for the virtual node. */
    public fun listeners(listeners: Collection<VirtualNodeListener>) {
        _listeners.addAll(listeners)
    }

    /** @param serviceDiscovery Defines how upstream clients will discover this VirtualNode. */
    public fun serviceDiscovery(serviceDiscovery: ServiceDiscovery) {
        cdkBuilder.serviceDiscovery(serviceDiscovery)
    }

    /** @param virtualNodeName The name of the VirtualNode. */
    public fun virtualNodeName(virtualNodeName: String) {
        cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): VirtualNodeBaseProps {
        if (_backends.isNotEmpty()) cdkBuilder.backends(_backends)
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
