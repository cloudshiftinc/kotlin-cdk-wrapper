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
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions

/**
 * Properties used to define HTTP Based healthchecks.
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
public class HttpHealthCheckOptionsDsl {
    private val cdkBuilder: HttpHealthCheckOptions.Builder = HttpHealthCheckOptions.builder()

    /**
     * @param healthyThreshold The number of consecutive successful health checks that must occur
     *   before declaring listener healthy.
     */
    public fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
    }

    /** @param interval The time period between each health check execution. */
    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    /** @param path The destination path for the health check request. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param timeout The amount of time to wait when receiving a response from the health check.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param unhealthyThreshold The number of consecutive failed health checks that must occur
     *   before declaring a listener unhealthy.
     */
    public fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): HttpHealthCheckOptions = cdkBuilder.build()
}
