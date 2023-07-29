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
import software.amazon.awscdk.services.appmesh.HealthCheck
import software.amazon.awscdk.services.appmesh.HttpConnectionPool
import software.amazon.awscdk.services.appmesh.HttpTimeout
import software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions
import software.amazon.awscdk.services.appmesh.OutlierDetection

/**
 * Represent the HTTP Node Listener property.
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
public class HttpVirtualNodeListenerOptionsDsl {
    private val cdkBuilder: HttpVirtualNodeListenerOptions.Builder =
        HttpVirtualNodeListenerOptions.builder()

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

    /** @param outlierDetection Represents the configuration for enabling outlier detection. */
    public fun outlierDetection(outlierDetection: OutlierDetectionDsl.() -> Unit = {}) {
        val builder = OutlierDetectionDsl()
        builder.apply(outlierDetection)
        cdkBuilder.outlierDetection(builder.build())
    }

    /** @param outlierDetection Represents the configuration for enabling outlier detection. */
    public fun outlierDetection(outlierDetection: OutlierDetection) {
        cdkBuilder.outlierDetection(outlierDetection)
    }

    /** @param port Port to listen for connections on. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param timeout Timeout for HTTP protocol. */
    public fun timeout(timeout: HttpTimeoutDsl.() -> Unit = {}) {
        val builder = HttpTimeoutDsl()
        builder.apply(timeout)
        cdkBuilder.timeout(builder.build())
    }

    /** @param timeout Timeout for HTTP protocol. */
    public fun timeout(timeout: HttpTimeout) {
        cdkBuilder.timeout(timeout)
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

    public fun build(): HttpVirtualNodeListenerOptions = cdkBuilder.build()
}
