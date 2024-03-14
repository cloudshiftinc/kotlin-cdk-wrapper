package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class VirtualGatewayListener internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayListener,
) {
  public open fun bind(arg0: Construct): VirtualGatewayListenerConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(VirtualGatewayListenerConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayListener,
  ) : VirtualGatewayListener(cdkObject)

  public companion object {
    public open fun grpc(): VirtualGatewayListener =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener.grpc().let(VirtualGatewayListener::wrap)

    public open fun grpc(options: GrpcGatewayListenerOptions): VirtualGatewayListener =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener.grpc(options.let(GrpcGatewayListenerOptions::unwrap)).let(VirtualGatewayListener::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c01751a5e2e288f90df20e4cd61f27e3431457469c92025e16e8fd398a5cfc1")
    public open fun grpc(options: GrpcGatewayListenerOptions.Builder.() -> Unit):
        VirtualGatewayListener = grpc(GrpcGatewayListenerOptions(options))

    public open fun http(): VirtualGatewayListener =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener.http().let(VirtualGatewayListener::wrap)

    public open fun http(options: HttpGatewayListenerOptions): VirtualGatewayListener =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener.http(options.let(HttpGatewayListenerOptions::unwrap)).let(VirtualGatewayListener::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3f87df441b98375a0dafe3e4a9a89ee3b4c94b2e99b57c680528e510e64fdc2")
    public open fun http(options: HttpGatewayListenerOptions.Builder.() -> Unit):
        VirtualGatewayListener = http(HttpGatewayListenerOptions(options))

    public open fun http2(): VirtualGatewayListener =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener.http2().let(VirtualGatewayListener::wrap)

    public open fun http2(options: Http2GatewayListenerOptions): VirtualGatewayListener =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener.http2(options.let(Http2GatewayListenerOptions::unwrap)).let(VirtualGatewayListener::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bb1b3f4a5fbf16fa10c35003a5e5a3132977ba20e14b0989bbe0962df103fc6")
    public open fun http2(options: Http2GatewayListenerOptions.Builder.() -> Unit):
        VirtualGatewayListener = http2(Http2GatewayListenerOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayListener):
        VirtualGatewayListener = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualGatewayListener):
        software.amazon.awscdk.services.appmesh.VirtualGatewayListener = (wrapped as
        Wrapper).cdkObject
  }
}
