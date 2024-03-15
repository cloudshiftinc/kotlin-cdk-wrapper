@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the properties needed to define listeners for a VirtualGateway.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * String certificateAuthorityArn =
 * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012";
 * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.http(HttpGatewayListenerOptions.builder()
 * .port(443)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .interval(Duration.seconds(10))
 * .build()))
 * .build())))
 * .backendDefaults(BackendDefaults.builder()
 * .tlsClientPolicy(TlsClientPolicy.builder()
 * .ports(List.of(8080, 8081))
 * .validation(TlsValidation.builder()
 * .trust(TlsValidationTrust.acm(List.of(CertificateAuthority.fromCertificateAuthorityArn(this,
 * "certificate", certificateAuthorityArn))))
 * .build())
 * .build())
 * .build())
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .virtualGatewayName("virtualGateway")
 * .build();
 * ```
 */
public abstract class VirtualGatewayListener internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayListener,
) : CdkObject(cdkObject) {
  /**
   * Called when the GatewayListener type is initialized.
   *
   * Can be used to enforce
   * mutual exclusivity
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): VirtualGatewayListenerConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(VirtualGatewayListenerConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayListener,
  ) : VirtualGatewayListener(cdkObject)

  public companion object {
    public fun grpc(): VirtualGatewayListener =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener.grpc().let(VirtualGatewayListener::wrap)

    public fun grpc(options: GrpcGatewayListenerOptions): VirtualGatewayListener =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener.grpc(options.let(GrpcGatewayListenerOptions::unwrap)).let(VirtualGatewayListener::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c01751a5e2e288f90df20e4cd61f27e3431457469c92025e16e8fd398a5cfc1")
    public fun grpc(options: GrpcGatewayListenerOptions.Builder.() -> Unit): VirtualGatewayListener
        = grpc(GrpcGatewayListenerOptions(options))

    public fun http(): VirtualGatewayListener =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener.http().let(VirtualGatewayListener::wrap)

    public fun http(options: HttpGatewayListenerOptions): VirtualGatewayListener =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener.http(options.let(HttpGatewayListenerOptions::unwrap)).let(VirtualGatewayListener::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3f87df441b98375a0dafe3e4a9a89ee3b4c94b2e99b57c680528e510e64fdc2")
    public fun http(options: HttpGatewayListenerOptions.Builder.() -> Unit): VirtualGatewayListener
        = http(HttpGatewayListenerOptions(options))

    public fun http2(): VirtualGatewayListener =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener.http2().let(VirtualGatewayListener::wrap)

    public fun http2(options: Http2GatewayListenerOptions): VirtualGatewayListener =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener.http2(options.let(Http2GatewayListenerOptions::unwrap)).let(VirtualGatewayListener::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bb1b3f4a5fbf16fa10c35003a5e5a3132977ba20e14b0989bbe0962df103fc6")
    public fun http2(options: Http2GatewayListenerOptions.Builder.() -> Unit):
        VirtualGatewayListener = http2(Http2GatewayListenerOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayListener):
        VirtualGatewayListener = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualGatewayListener):
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualGatewayListener
  }
}
