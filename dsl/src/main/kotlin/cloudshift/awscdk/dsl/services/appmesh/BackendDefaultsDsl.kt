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
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.BackendDefaults
import software.amazon.awscdk.services.appmesh.TlsClientPolicy

/**
 * Represents the properties needed to define backend defaults.
 *
 * Example:
 * ```
 * Mesh mesh;
 * Service service;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(8080)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .healthyThreshold(3)
 * .interval(Duration.seconds(5))
 * .path("/ping")
 * .timeout(Duration.seconds(2))
 * .unhealthyThreshold(2)
 * .build()))
 * .timeout(HttpTimeout.builder()
 * .idle(Duration.seconds(5))
 * .build())
 * .build())))
 * .backendDefaults(BackendDefaults.builder()
 * .tlsClientPolicy(TlsClientPolicy.builder()
 * .validation(TlsValidation.builder()
 * .trust(TlsValidationTrust.file("/keys/local_cert_chain.pem"))
 * .build())
 * .build())
 * .build())
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .build();
 * Tags.of(node).add("Environment", "Dev");
 * ```
 */
@CdkDslMarker
public class BackendDefaultsDsl {
    private val cdkBuilder: BackendDefaults.Builder = BackendDefaults.builder()

    /** @param tlsClientPolicy TLS properties for Client policy for backend defaults. */
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicyDsl.() -> Unit = {}) {
        val builder = TlsClientPolicyDsl()
        builder.apply(tlsClientPolicy)
        cdkBuilder.tlsClientPolicy(builder.build())
    }

    /** @param tlsClientPolicy TLS properties for Client policy for backend defaults. */
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy) {
        cdkBuilder.tlsClientPolicy(tlsClientPolicy)
    }

    public fun build(): BackendDefaults = cdkBuilder.build()
}
