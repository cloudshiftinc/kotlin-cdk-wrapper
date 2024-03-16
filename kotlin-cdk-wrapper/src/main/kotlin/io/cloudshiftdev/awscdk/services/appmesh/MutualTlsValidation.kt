@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Represents the properties needed to define TLS Validation context that is supported for mutual
 * TLS authentication.
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
public interface MutualTlsValidation {
  /**
   * Represents the subject alternative names (SANs) secured by the certificate.
   *
   * SANs must be in the FQDN or URI format.
   *
   * Default: - If you don't specify SANs on the terminating mesh endpoint,
   * the Envoy proxy for that node doesn't verify the SAN on a peer client certificate.
   * If you don't specify SANs on the originating mesh endpoint,
   * the SAN on the certificate provided by the terminating endpoint must match the mesh endpoint
   * service discovery configuration.
   */
  public fun subjectAlternativeNames(): SubjectAlternativeNames? =
      unwrap(this).getSubjectAlternativeNames()?.let(SubjectAlternativeNames::wrap)

  /**
   * Reference to where to retrieve the trust chain.
   */
  public fun trust(): MutualTlsValidationTrust

  /**
   * A builder for [MutualTlsValidation]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param subjectAlternativeNames Represents the subject alternative names (SANs) secured by the
     * certificate.
     * SANs must be in the FQDN or URI format.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames)

    /**
     * @param trust Reference to where to retrieve the trust chain. 
     */
    public fun trust(trust: MutualTlsValidationTrust)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.MutualTlsValidation.Builder =
        software.amazon.awscdk.services.appmesh.MutualTlsValidation.builder()

    /**
     * @param subjectAlternativeNames Represents the subject alternative names (SANs) secured by the
     * certificate.
     * SANs must be in the FQDN or URI format.
     */
    override fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(SubjectAlternativeNames::unwrap))
    }

    /**
     * @param trust Reference to where to retrieve the trust chain. 
     */
    override fun trust(trust: MutualTlsValidationTrust) {
      cdkBuilder.trust(trust.let(MutualTlsValidationTrust::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.MutualTlsValidation =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidation,
  ) : CdkObject(cdkObject), MutualTlsValidation {
    /**
     * Represents the subject alternative names (SANs) secured by the certificate.
     *
     * SANs must be in the FQDN or URI format.
     *
     * Default: - If you don't specify SANs on the terminating mesh endpoint,
     * the Envoy proxy for that node doesn't verify the SAN on a peer client certificate.
     * If you don't specify SANs on the originating mesh endpoint,
     * the SAN on the certificate provided by the terminating endpoint must match the mesh endpoint
     * service discovery configuration.
     */
    override fun subjectAlternativeNames(): SubjectAlternativeNames? =
        unwrap(this).getSubjectAlternativeNames()?.let(SubjectAlternativeNames::wrap)

    /**
     * Reference to where to retrieve the trust chain.
     */
    override fun trust(): MutualTlsValidationTrust =
        unwrap(this).getTrust().let(MutualTlsValidationTrust::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MutualTlsValidation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsValidation):
        MutualTlsValidation = CdkObjectWrappers.wrap(cdkObject) as MutualTlsValidation

    internal fun unwrap(wrapped: MutualTlsValidation):
        software.amazon.awscdk.services.appmesh.MutualTlsValidation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.MutualTlsValidation
  }
}
