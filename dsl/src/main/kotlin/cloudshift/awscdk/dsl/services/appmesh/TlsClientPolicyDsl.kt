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
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.MutualTlsCertificate
import software.amazon.awscdk.services.appmesh.TlsClientPolicy
import software.amazon.awscdk.services.appmesh.TlsValidation

/**
 * Represents the properties needed to define client policy.
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
public class TlsClientPolicyDsl {
    private val cdkBuilder: TlsClientPolicy.Builder = TlsClientPolicy.builder()

    private val _ports: MutableList<Number> = mutableListOf()

    /** @param enforce Whether the policy is enforced. */
    public fun enforce(enforce: Boolean) {
        cdkBuilder.enforce(enforce)
    }

    /**
     * @param mutualTlsCertificate Represents a client TLS certificate. The certificate will be sent
     *   only if the server requests it, enabling mutual TLS.
     */
    public fun mutualTlsCertificate(mutualTlsCertificate: MutualTlsCertificate) {
        cdkBuilder.mutualTlsCertificate(mutualTlsCertificate)
    }

    /**
     * @param ports TLS is enforced on the ports specified here. If no ports are specified, TLS will
     *   be enforced on all the ports.
     */
    public fun ports(vararg ports: Number) {
        _ports.addAll(listOf(*ports))
    }

    /**
     * @param ports TLS is enforced on the ports specified here. If no ports are specified, TLS will
     *   be enforced on all the ports.
     */
    public fun ports(ports: Collection<Number>) {
        _ports.addAll(ports)
    }

    /** @param validation Represents the object for TLS validation context. */
    public fun validation(validation: TlsValidationDsl.() -> Unit = {}) {
        val builder = TlsValidationDsl()
        builder.apply(validation)
        cdkBuilder.validation(builder.build())
    }

    /** @param validation Represents the object for TLS validation context. */
    public fun validation(validation: TlsValidation) {
        cdkBuilder.validation(validation)
    }

    public fun build(): TlsClientPolicy {
        if (_ports.isNotEmpty()) cdkBuilder.ports(_ports)
        return cdkBuilder.build()
    }
}
