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
import software.amazon.awscdk.services.appmesh.SubjectAlternativeNames
import software.amazon.awscdk.services.appmesh.TlsValidation
import software.amazon.awscdk.services.appmesh.TlsValidationTrust

/**
 * Represents the properties needed to define TLS Validation context.
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
public class TlsValidationDsl {
    private val cdkBuilder: TlsValidation.Builder = TlsValidation.builder()

    /**
     * @param subjectAlternativeNames Represents the subject alternative names (SANs) secured by the
     *   certificate. SANs must be in the FQDN or URI format.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /** @param trust Reference to where to retrieve the trust chain. */
    public fun trust(trust: TlsValidationTrust) {
        cdkBuilder.trust(trust)
    }

    public fun build(): TlsValidation = cdkBuilder.build()
}
