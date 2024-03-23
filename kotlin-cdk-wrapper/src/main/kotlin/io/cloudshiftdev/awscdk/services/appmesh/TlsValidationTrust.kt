@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.acmpca.ICertificateAuthority
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.collections.List

/**
 * Defines the TLS Validation Context Trust.
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
public abstract class TlsValidationTrust(
  cdkObject: software.amazon.awscdk.services.appmesh.TlsValidationTrust,
) : CdkObject(cdkObject) {
  /**
   * Returns Trust context based on trust type.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): TlsValidationTrustConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(TlsValidationTrustConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.TlsValidationTrust,
  ) : TlsValidationTrust(cdkObject)

  public companion object {
    public fun acm(certificateAuthorities: List<ICertificateAuthority>): TlsValidationTrust =
        software.amazon.awscdk.services.appmesh.TlsValidationTrust.acm(certificateAuthorities.map(ICertificateAuthority::unwrap)).let(TlsValidationTrust::wrap)

    public fun acm(vararg certificateAuthorities: ICertificateAuthority): TlsValidationTrust =
        acm(certificateAuthorities.toList())

    public fun `file`(certificateChain: String): MutualTlsValidationTrust =
        software.amazon.awscdk.services.appmesh.TlsValidationTrust.`file`(certificateChain).let(MutualTlsValidationTrust::wrap)

    public fun sds(secretName: String): MutualTlsValidationTrust =
        software.amazon.awscdk.services.appmesh.TlsValidationTrust.sds(secretName).let(MutualTlsValidationTrust::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TlsValidationTrust):
        TlsValidationTrust = CdkObjectWrappers.wrap(cdkObject) as? TlsValidationTrust ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TlsValidationTrust):
        software.amazon.awscdk.services.appmesh.TlsValidationTrust = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.TlsValidationTrust
  }
}
