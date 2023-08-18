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
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HealthCheck
import software.amazon.awscdk.services.appmesh.HttpConnectionPool
import software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions

/**
 * Represents the properties needed to define HTTP Listeners for a VirtualGateway.
 *
 * Example:
 * ```
 * Mesh mesh;
 * String certificateAuthorityArn =
 * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012";
 * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.http(HttpGatewayListenerOptions.builder()
 * .port(443)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .interval(Duration.seconds(10))
 * .build()))
 * .build())))
 * .backendDefaults(BackendDefaults.builder()
 * .tlsClientPolicy(TlsClientPolicy.builder()
 * .ports(List.of(8080, 8081))
 * .validation(TlsValidation.builder()
 * .trust(TlsValidationTrust.acm(List.of(CertificateAuthority.fromCertificateAuthorityArn(this,
 * "certificate", certificateAuthorityArn))))
 * .build())
 * .build())
 * .build())
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .virtualGatewayName("virtualGateway")
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpGatewayListenerOptionsDsl {
    private val cdkBuilder: HttpGatewayListenerOptions.Builder =
        HttpGatewayListenerOptions.builder()

    /** @param connectionPool Connection pool for http listeners. */
    public fun connectionPool(connectionPool: HttpConnectionPoolDsl.() -> Unit = {}) {
        val builder = HttpConnectionPoolDsl()
        builder.apply(connectionPool)
        cdkBuilder.connectionPool(builder.build())
    }

    /** @param connectionPool Connection pool for http listeners. */
    public fun connectionPool(connectionPool: HttpConnectionPool) {
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

    public fun build(): HttpGatewayListenerOptions = cdkBuilder.build()
}
