@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

/**
 * Represents the properties needed to define TLS Validation context.
 *
 * Example:
 *
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
public interface TlsValidation {
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
  public fun trust(): TlsValidationTrust

  /**
   * A builder for [TlsValidation]
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
    public fun trust(trust: TlsValidationTrust)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TlsValidation.Builder =
        software.amazon.awscdk.services.appmesh.TlsValidation.builder()

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
    override fun trust(trust: TlsValidationTrust) {
      cdkBuilder.trust(trust.let(TlsValidationTrust::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.TlsValidation = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.TlsValidation,
  ) : CdkObject(cdkObject), TlsValidation {
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
    override fun trust(): TlsValidationTrust = unwrap(this).getTrust().let(TlsValidationTrust::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TlsValidation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TlsValidation):
        TlsValidation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TlsValidation):
        software.amazon.awscdk.services.appmesh.TlsValidation = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.TlsValidation
  }
}
