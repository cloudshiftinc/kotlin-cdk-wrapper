package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface RouteSpecConfig {
  public fun grpcRouteSpec(): CfnRoute.GrpcRouteProperty? =
      unwrap(this).getGrpcRouteSpec()?.let(CfnRoute.GrpcRouteProperty::wrap)

  public fun http2RouteSpec(): CfnRoute.HttpRouteProperty? =
      unwrap(this).getHttp2RouteSpec()?.let(CfnRoute.HttpRouteProperty::wrap)

  public fun httpRouteSpec(): CfnRoute.HttpRouteProperty? =
      unwrap(this).getHttpRouteSpec()?.let(CfnRoute.HttpRouteProperty::wrap)

  public fun priority(): Number? = unwrap(this).getPriority()

  public fun tcpRouteSpec(): CfnRoute.TcpRouteProperty? =
      unwrap(this).getTcpRouteSpec()?.let(CfnRoute.TcpRouteProperty::wrap)

  public interface Builder {
    public fun grpcRouteSpec(grpcRouteSpec: CfnRoute.GrpcRouteProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9ce79cd0bb676b0e3c199f23481a9466fa6603403a805cb29826b7dc79b40a7")
    public fun grpcRouteSpec(grpcRouteSpec: CfnRoute.GrpcRouteProperty.Builder.() -> Unit)

    public fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d45a5745ff1c95df93aba4e7a9c560af6ab7628ff7da881d0987eec8cca355b0")
    public fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty.Builder.() -> Unit)

    public fun httpRouteSpec(httpRouteSpec: CfnRoute.HttpRouteProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15acab697a02daabb62fb291fb36e60df733831bab89d5ca7fe56a8812fa415f")
    public fun httpRouteSpec(httpRouteSpec: CfnRoute.HttpRouteProperty.Builder.() -> Unit)

    public fun priority(priority: Number)

    public fun tcpRouteSpec(tcpRouteSpec: CfnRoute.TcpRouteProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0e2c72d361ff9c248f26683a22c463f75d83bbfd37256cd869cd48c84f23957")
    public fun tcpRouteSpec(tcpRouteSpec: CfnRoute.TcpRouteProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.RouteSpecConfig.Builder =
        software.amazon.awscdk.services.appmesh.RouteSpecConfig.builder()

    override fun grpcRouteSpec(grpcRouteSpec: CfnRoute.GrpcRouteProperty) {
      cdkBuilder.grpcRouteSpec(grpcRouteSpec.let(CfnRoute.GrpcRouteProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9ce79cd0bb676b0e3c199f23481a9466fa6603403a805cb29826b7dc79b40a7")
    override fun grpcRouteSpec(grpcRouteSpec: CfnRoute.GrpcRouteProperty.Builder.() -> Unit): Unit =
        grpcRouteSpec(CfnRoute.GrpcRouteProperty(grpcRouteSpec))

    override fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty) {
      cdkBuilder.http2RouteSpec(http2RouteSpec.let(CfnRoute.HttpRouteProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d45a5745ff1c95df93aba4e7a9c560af6ab7628ff7da881d0987eec8cca355b0")
    override fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty.Builder.() -> Unit): Unit
        = http2RouteSpec(CfnRoute.HttpRouteProperty(http2RouteSpec))

    override fun httpRouteSpec(httpRouteSpec: CfnRoute.HttpRouteProperty) {
      cdkBuilder.httpRouteSpec(httpRouteSpec.let(CfnRoute.HttpRouteProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15acab697a02daabb62fb291fb36e60df733831bab89d5ca7fe56a8812fa415f")
    override fun httpRouteSpec(httpRouteSpec: CfnRoute.HttpRouteProperty.Builder.() -> Unit): Unit =
        httpRouteSpec(CfnRoute.HttpRouteProperty(httpRouteSpec))

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun tcpRouteSpec(tcpRouteSpec: CfnRoute.TcpRouteProperty) {
      cdkBuilder.tcpRouteSpec(tcpRouteSpec.let(CfnRoute.TcpRouteProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0e2c72d361ff9c248f26683a22c463f75d83bbfd37256cd869cd48c84f23957")
    override fun tcpRouteSpec(tcpRouteSpec: CfnRoute.TcpRouteProperty.Builder.() -> Unit): Unit =
        tcpRouteSpec(CfnRoute.TcpRouteProperty(tcpRouteSpec))

    public fun build(): software.amazon.awscdk.services.appmesh.RouteSpecConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.RouteSpecConfig,
  ) : RouteSpecConfig {
    override fun grpcRouteSpec(): CfnRoute.GrpcRouteProperty? =
        unwrap(this).getGrpcRouteSpec()?.let(CfnRoute.GrpcRouteProperty::wrap)

    override fun http2RouteSpec(): CfnRoute.HttpRouteProperty? =
        unwrap(this).getHttp2RouteSpec()?.let(CfnRoute.HttpRouteProperty::wrap)

    override fun httpRouteSpec(): CfnRoute.HttpRouteProperty? =
        unwrap(this).getHttpRouteSpec()?.let(CfnRoute.HttpRouteProperty::wrap)

    override fun priority(): Number? = unwrap(this).getPriority()

    override fun tcpRouteSpec(): CfnRoute.TcpRouteProperty? =
        unwrap(this).getTcpRouteSpec()?.let(CfnRoute.TcpRouteProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RouteSpecConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.RouteSpecConfig):
        RouteSpecConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RouteSpecConfig):
        software.amazon.awscdk.services.appmesh.RouteSpecConfig = (wrapped as Wrapper).cdkObject
  }
}
