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
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions
import software.amazon.awscdk.services.appmesh.MutualTlsValidation
import software.amazon.awscdk.services.appmesh.TlsCertificate
import software.amazon.awscdk.services.appmesh.TlsMode

/**
 * Represents TLS properties for listener.
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
public class ListenerTlsOptionsDsl {
    private val cdkBuilder: ListenerTlsOptions.Builder = ListenerTlsOptions.builder()

    /** @param certificate Represents TLS certificate. */
    public fun certificate(certificate: TlsCertificate) {
        cdkBuilder.certificate(certificate)
    }

    /** @param mode The TLS mode. */
    public fun mode(mode: TlsMode) {
        cdkBuilder.mode(mode)
    }

    /**
     * @param mutualTlsValidation Represents a listener's TLS validation context. The client
     *   certificate will only be validated if the client provides it, enabling mutual TLS.
     */
    public fun mutualTlsValidation(mutualTlsValidation: MutualTlsValidationDsl.() -> Unit = {}) {
        val builder = MutualTlsValidationDsl()
        builder.apply(mutualTlsValidation)
        cdkBuilder.mutualTlsValidation(builder.build())
    }

    /**
     * @param mutualTlsValidation Represents a listener's TLS validation context. The client
     *   certificate will only be validated if the client provides it, enabling mutual TLS.
     */
    public fun mutualTlsValidation(mutualTlsValidation: MutualTlsValidation) {
        cdkBuilder.mutualTlsValidation(mutualTlsValidation)
    }

    public fun build(): ListenerTlsOptions = cdkBuilder.build()
}
