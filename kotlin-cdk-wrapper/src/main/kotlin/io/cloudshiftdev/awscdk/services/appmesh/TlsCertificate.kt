@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Represents a TLS certificate.
 *
 * Example:
 *
 * ```
 * // A Virtual Node with listener TLS from an ACM provided certificate
 * Certificate cert;
 * Mesh mesh;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.dns("node"))
 * .listeners(List.of(VirtualNodeListener.grpc(GrpcVirtualNodeListenerOptions.builder()
 * .port(80)
 * .tls(ListenerTlsOptions.builder()
 * .mode(TlsMode.STRICT)
 * .certificate(TlsCertificate.acm(cert))
 * .build())
 * .build())))
 * .build();
 * // A Virtual Gateway with listener TLS from a customer provided file certificate
 * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
 * .port(8080)
 * .tls(ListenerTlsOptions.builder()
 * .mode(TlsMode.STRICT)
 * .certificate(TlsCertificate.file("path/to/certChain", "path/to/privateKey"))
 * .build())
 * .build())))
 * .virtualGatewayName("gateway")
 * .build();
 * // A Virtual Gateway with listener TLS from a SDS provided certificate
 * VirtualGateway gateway2 = VirtualGateway.Builder.create(this, "gateway2")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.http2(Http2GatewayListenerOptions.builder()
 * .port(8080)
 * .tls(ListenerTlsOptions.builder()
 * .mode(TlsMode.STRICT)
 * .certificate(TlsCertificate.sds("secrete_certificate"))
 * .build())
 * .build())))
 * .virtualGatewayName("gateway2")
 * .build();
 * ```
 */
public abstract class TlsCertificate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.TlsCertificate,
) : CdkObject(cdkObject) {
  /**
   * Returns TLS certificate based provider.
   *
   * @param _scope 
   */
  public open fun bind(scope: Construct): TlsCertificateConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(TlsCertificateConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.TlsCertificate,
  ) : TlsCertificate(cdkObject)

  public companion object {
    public fun acm(certificate: ICertificate): TlsCertificate =
        software.amazon.awscdk.services.appmesh.TlsCertificate.acm(certificate.let(ICertificate::unwrap)).let(TlsCertificate::wrap)

    public fun `file`(certificateChainPath: String, privateKeyPath: String): MutualTlsCertificate =
        software.amazon.awscdk.services.appmesh.TlsCertificate.`file`(certificateChainPath,
        privateKeyPath).let(MutualTlsCertificate::wrap)

    public fun sds(secretName: String): MutualTlsCertificate =
        software.amazon.awscdk.services.appmesh.TlsCertificate.sds(secretName).let(MutualTlsCertificate::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TlsCertificate):
        TlsCertificate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TlsCertificate):
        software.amazon.awscdk.services.appmesh.TlsCertificate = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.TlsCertificate
  }
}
