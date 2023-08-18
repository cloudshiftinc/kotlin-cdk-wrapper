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
import software.amazon.awscdk.services.appmesh.MutualTlsValidation
import software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust
import software.amazon.awscdk.services.appmesh.SubjectAlternativeNames

/**
 * Represents the properties needed to define TLS Validation context that is supported for mutual
 * TLS authentication.
 *
 * Example:
 * ```
 * Mesh mesh;
 * VirtualNode node1 = VirtualNode.Builder.create(this, "node1")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.dns("node"))
 * .listeners(List.of(VirtualNodeListener.grpc(GrpcVirtualNodeListenerOptions.builder()
 * .port(80)
 * .tls(ListenerTlsOptions.builder()
 * .mode(TlsMode.STRICT)
 * .certificate(TlsCertificate.file("path/to/certChain", "path/to/privateKey"))
 * // Validate a file client certificates to enable mutual TLS authentication when a client provides
 * a certificate.
 * .mutualTlsValidation(MutualTlsValidation.builder()
 * .trust(TlsValidationTrust.file("path-to-certificate"))
 * .build())
 * .build())
 * .build())))
 * .build();
 * String certificateAuthorityArn =
 * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012";
 * VirtualNode node2 = VirtualNode.Builder.create(this, "node2")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.dns("node2"))
 * .backendDefaults(BackendDefaults.builder()
 * .tlsClientPolicy(TlsClientPolicy.builder()
 * .ports(List.of(8080, 8081))
 * .validation(TlsValidation.builder()
 * .subjectAlternativeNames(SubjectAlternativeNames.matchingExactly("mesh-endpoint.apps.local"))
 * .trust(TlsValidationTrust.acm(List.of(CertificateAuthority.fromCertificateAuthorityArn(this,
 * "certificate", certificateAuthorityArn))))
 * .build())
 * // Provide a SDS client certificate when a server requests it and enable mutual TLS
 * authentication.
 * .mutualTlsCertificate(TlsCertificate.sds("secret_certificate"))
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class MutualTlsValidationDsl {
    private val cdkBuilder: MutualTlsValidation.Builder = MutualTlsValidation.builder()

    /**
     * @param subjectAlternativeNames Represents the subject alternative names (SANs) secured by the
     *   certificate. SANs must be in the FQDN or URI format.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /** @param trust Reference to where to retrieve the trust chain. */
    public fun trust(trust: MutualTlsValidationTrust) {
        cdkBuilder.trust(trust)
    }

    public fun build(): MutualTlsValidation = cdkBuilder.build()
}
