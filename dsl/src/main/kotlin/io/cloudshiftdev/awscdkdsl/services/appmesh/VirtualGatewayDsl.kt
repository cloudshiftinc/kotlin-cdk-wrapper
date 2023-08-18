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
import software.amazon.awscdk.services.appmesh.BackendDefaults
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualGateway
import software.amazon.awscdk.services.appmesh.VirtualGatewayListener
import software.constructs.Construct

/**
 * VirtualGateway represents a newly defined App Mesh Virtual Gateway.
 *
 * A virtual gateway allows resources that are outside of your mesh to communicate to resources that
 * are inside of your mesh.
 *
 * Example:
 * ```
 * // A Virtual Node with a gRPC listener with a connection pool set
 * Mesh mesh;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * // DNS service discovery can optionally specify the DNS response type as either LOAD_BALANCER or
 * ENDPOINTS.
 * // LOAD_BALANCER means that the DNS resolver returns a loadbalanced set of endpoints,
 * // whereas ENDPOINTS means that the DNS resolver is returning all the endpoints.
 * // By default, the response type is assumed to be LOAD_BALANCER
 * .serviceDiscovery(ServiceDiscovery.dns("node", DnsResponseType.ENDPOINTS))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(80)
 * .connectionPool(HttpConnectionPool.builder()
 * .maxConnections(100)
 * .maxPendingRequests(10)
 * .build())
 * .build())))
 * .build();
 * // A Virtual Gateway with a gRPC listener with a connection pool set
 * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
 * .port(8080)
 * .connectionPool(GrpcConnectionPool.builder()
 * .maxRequests(10)
 * .build())
 * .build())))
 * .virtualGatewayName("gateway")
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_gateways.html)
 */
@CdkDslMarker
public class VirtualGatewayDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: VirtualGateway.Builder = VirtualGateway.Builder.create(scope, id)

    private val _listeners: MutableList<VirtualGatewayListener> = mutableListOf()

    /**
     * Access Logging Configuration for the VirtualGateway.
     *
     * Default: - no access logging
     *
     * @param accessLog Access Logging Configuration for the VirtualGateway.
     */
    public fun accessLog(accessLog: AccessLog) {
        cdkBuilder.accessLog(accessLog)
    }

    /**
     * Default Configuration Virtual Node uses to communicate with Virtual Service.
     *
     * Default: - No Config
     *
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     *   Service.
     */
    public fun backendDefaults(backendDefaults: BackendDefaultsDsl.() -> Unit = {}) {
        val builder = BackendDefaultsDsl()
        builder.apply(backendDefaults)
        cdkBuilder.backendDefaults(builder.build())
    }

    /**
     * Default Configuration Virtual Node uses to communicate with Virtual Service.
     *
     * Default: - No Config
     *
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     *   Service.
     */
    public fun backendDefaults(backendDefaults: BackendDefaults) {
        cdkBuilder.backendDefaults(backendDefaults)
    }

    /**
     * Listeners for the VirtualGateway.
     *
     * Only one is supported.
     *
     * Default: - Single HTTP listener on port 8080
     *
     * @param listeners Listeners for the VirtualGateway.
     */
    public fun listeners(vararg listeners: VirtualGatewayListener) {
        _listeners.addAll(listOf(*listeners))
    }

    /**
     * Listeners for the VirtualGateway.
     *
     * Only one is supported.
     *
     * Default: - Single HTTP listener on port 8080
     *
     * @param listeners Listeners for the VirtualGateway.
     */
    public fun listeners(listeners: Collection<VirtualGatewayListener>) {
        _listeners.addAll(listeners)
    }

    /**
     * The Mesh which the VirtualGateway belongs to.
     *
     * @param mesh The Mesh which the VirtualGateway belongs to.
     */
    public fun mesh(mesh: IMesh) {
        cdkBuilder.mesh(mesh)
    }

    /**
     * Name of the VirtualGateway.
     *
     * Default: - A name is automatically determined
     *
     * @param virtualGatewayName Name of the VirtualGateway.
     */
    public fun virtualGatewayName(virtualGatewayName: String) {
        cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): VirtualGateway {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
