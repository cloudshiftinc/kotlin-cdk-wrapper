@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Represents a TLS certificate that is supported for mutual TLS authentication.
 *
 * Example:
 *
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
public abstract class MutualTlsCertificate(
  cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsCertificate,
) : TlsCertificate(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsCertificate,
  ) : MutualTlsCertificate(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsCertificate):
        MutualTlsCertificate = CdkObjectWrappers.wrap(cdkObject) as? MutualTlsCertificate ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MutualTlsCertificate):
        software.amazon.awscdk.services.appmesh.MutualTlsCertificate = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.MutualTlsCertificate
  }
}
