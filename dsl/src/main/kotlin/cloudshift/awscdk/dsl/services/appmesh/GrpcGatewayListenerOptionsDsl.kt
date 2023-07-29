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
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcConnectionPool
import software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions
import software.amazon.awscdk.services.appmesh.HealthCheck
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions

/**
 * Represents the properties needed to define GRPC Listeners for a VirtualGateway.
 *
 * Example:
 * ```
 * // A Virtual Node with listener TLS from an ACM provided certificate
 * Certificate cert;
 * Mesh mesh;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.dns("node"))
 * .listeners(List.of(VirtualNodeListener.grpc(GrpcVirtualNodeListenerOptions.builder()
 * .port(80)
 * .tls(ListenerTlsOptions.builder()
 * .mode(TlsMode.STRICT)
 * .certificate(TlsCertificate.acm(cert))
 * .build())
 * .build())))
 * .build();
 * // A Virtual Gateway with listener TLS from a customer provided file certificate
 * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
 * .port(8080)
 * .tls(ListenerTlsOptions.builder()
 * .mode(TlsMode.STRICT)
 * .certificate(TlsCertificate.file("path/to/certChain", "path/to/privateKey"))
 * .build())
 * .build())))
 * .virtualGatewayName("gateway")
 * .build();
 * // A Virtual Gateway with listener TLS from a SDS provided certificate
 * VirtualGateway gateway2 = VirtualGateway.Builder.create(this, "gateway2")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.http2(Http2GatewayListenerOptions.builder()
 * .port(8080)
 * .tls(ListenerTlsOptions.builder()
 * .mode(TlsMode.STRICT)
 * .certificate(TlsCertificate.sds("secrete_certificate"))
 * .build())
 * .build())))
 * .virtualGatewayName("gateway2")
 * .build();
 * ```
 */
@CdkDslMarker
public class GrpcGatewayListenerOptionsDsl {
    private val cdkBuilder: GrpcGatewayListenerOptions.Builder =
        GrpcGatewayListenerOptions.builder()

    /** @param connectionPool Connection pool for http listeners. */
    public fun connectionPool(connectionPool: GrpcConnectionPoolDsl.() -> Unit = {}) {
        val builder = GrpcConnectionPoolDsl()
        builder.apply(connectionPool)
        cdkBuilder.connectionPool(builder.build())
    }

    /** @param connectionPool Connection pool for http listeners. */
    public fun connectionPool(connectionPool: GrpcConnectionPool) {
        cdkBuilder.connectionPool(connectionPool)
    }

    /** @param healthCheck The health check information for the listener. */
    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /** @param port Port to listen for connections on. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param tls Represents the configuration for enabling TLS on a listener. */
    public fun tls(tls: ListenerTlsOptionsDsl.() -> Unit = {}) {
        val builder = ListenerTlsOptionsDsl()
        builder.apply(tls)
        cdkBuilder.tls(builder.build())
    }

    /** @param tls Represents the configuration for enabling TLS on a listener. */
    public fun tls(tls: ListenerTlsOptions) {
        cdkBuilder.tls(tls)
    }

    public fun build(): GrpcGatewayListenerOptions = cdkBuilder.build()
}
