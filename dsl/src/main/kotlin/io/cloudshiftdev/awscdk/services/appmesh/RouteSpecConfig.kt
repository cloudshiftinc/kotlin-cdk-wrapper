package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface RouteSpecConfig {
  /**
   * The spec for a grpc route.
   *
   * Default: - no grpc spec
   */
  public fun grpcRouteSpec(): CfnRoute.GrpcRouteProperty? =
      unwrap(this).getGrpcRouteSpec()?.let(CfnRoute.GrpcRouteProperty::wrap)

  /**
   * The spec for an http2 route.
   *
   * Default: - no http2 spec
   */
  public fun http2RouteSpec(): CfnRoute.HttpRouteProperty? =
      unwrap(this).getHttp2RouteSpec()?.let(CfnRoute.HttpRouteProperty::wrap)

  /**
   * The spec for an http route.
   *
   * Default: - no http spec
   */
  public fun httpRouteSpec(): CfnRoute.HttpRouteProperty? =
      unwrap(this).getHttpRouteSpec()?.let(CfnRoute.HttpRouteProperty::wrap)

  /**
   * The priority for the route.
   *
   * When a Virtual Router has multiple routes, route match is performed in the
   * order of specified value, where 0 is the highest priority, and first matched route is selected.
   *
   * Default: - no particular priority
   */
  public fun priority(): Number? = unwrap(this).getPriority()

  /**
   * The spec for a tcp route.
   *
   * Default: - no tcp spec
   */
  public fun tcpRouteSpec(): CfnRoute.TcpRouteProperty? =
      unwrap(this).getTcpRouteSpec()?.let(CfnRoute.TcpRouteProperty::wrap)

  /**
   * A builder for [RouteSpecConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param grpcRouteSpec The spec for a grpc route.
     */
    public fun grpcRouteSpec(grpcRouteSpec: CfnRoute.GrpcRouteProperty)

    /**
     * @param grpcRouteSpec The spec for a grpc route.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9ce79cd0bb676b0e3c199f23481a9466fa6603403a805cb29826b7dc79b40a7")
    public fun grpcRouteSpec(grpcRouteSpec: CfnRoute.GrpcRouteProperty.Builder.() -> Unit)

    /**
     * @param http2RouteSpec The spec for an http2 route.
     */
    public fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty)

    /**
     * @param http2RouteSpec The spec for an http2 route.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d45a5745ff1c95df93aba4e7a9c560af6ab7628ff7da881d0987eec8cca355b0")
    public fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty.Builder.() -> Unit)

    /**
     * @param httpRouteSpec The spec for an http route.
     */
    public fun httpRouteSpec(httpRouteSpec: CfnRoute.HttpRouteProperty)

    /**
     * @param httpRouteSpec The spec for an http route.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15acab697a02daabb62fb291fb36e60df733831bab89d5ca7fe56a8812fa415f")
    public fun httpRouteSpec(httpRouteSpec: CfnRoute.HttpRouteProperty.Builder.() -> Unit)

    /**
     * @param priority The priority for the route.
     * When a Virtual Router has multiple routes, route match is performed in the
     * order of specified value, where 0 is the highest priority, and first matched route is
     * selected.
     */
    public fun priority(priority: Number)

    /**
     * @param tcpRouteSpec The spec for a tcp route.
     */
    public fun tcpRouteSpec(tcpRouteSpec: CfnRoute.TcpRouteProperty)

    /**
     * @param tcpRouteSpec The spec for a tcp route.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0e2c72d361ff9c248f26683a22c463f75d83bbfd37256cd869cd48c84f23957")
    public fun tcpRouteSpec(tcpRouteSpec: CfnRoute.TcpRouteProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.RouteSpecConfig.Builder =
        software.amazon.awscdk.services.appmesh.RouteSpecConfig.builder()

    /**
     * @param grpcRouteSpec The spec for a grpc route.
     */
    override fun grpcRouteSpec(grpcRouteSpec: CfnRoute.GrpcRouteProperty) {
      cdkBuilder.grpcRouteSpec(grpcRouteSpec.let(CfnRoute.GrpcRouteProperty::unwrap))
    }

    /**
     * @param grpcRouteSpec The spec for a grpc route.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9ce79cd0bb676b0e3c199f23481a9466fa6603403a805cb29826b7dc79b40a7")
    override fun grpcRouteSpec(grpcRouteSpec: CfnRoute.GrpcRouteProperty.Builder.() -> Unit): Unit =
        grpcRouteSpec(CfnRoute.GrpcRouteProperty(grpcRouteSpec))

    /**
     * @param http2RouteSpec The spec for an http2 route.
     */
    override fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty) {
      cdkBuilder.http2RouteSpec(http2RouteSpec.let(CfnRoute.HttpRouteProperty::unwrap))
    }

    /**
     * @param http2RouteSpec The spec for an http2 route.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d45a5745ff1c95df93aba4e7a9c560af6ab7628ff7da881d0987eec8cca355b0")
    override fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty.Builder.() -> Unit): Unit
        = http2RouteSpec(CfnRoute.HttpRouteProperty(http2RouteSpec))

    /**
     * @param httpRouteSpec The spec for an http route.
     */
    override fun httpRouteSpec(httpRouteSpec: CfnRoute.HttpRouteProperty) {
      cdkBuilder.httpRouteSpec(httpRouteSpec.let(CfnRoute.HttpRouteProperty::unwrap))
    }

    /**
     * @param httpRouteSpec The spec for an http route.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15acab697a02daabb62fb291fb36e60df733831bab89d5ca7fe56a8812fa415f")
    override fun httpRouteSpec(httpRouteSpec: CfnRoute.HttpRouteProperty.Builder.() -> Unit): Unit =
        httpRouteSpec(CfnRoute.HttpRouteProperty(httpRouteSpec))

    /**
     * @param priority The priority for the route.
     * When a Virtual Router has multiple routes, route match is performed in the
     * order of specified value, where 0 is the highest priority, and first matched route is
     * selected.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param tcpRouteSpec The spec for a tcp route.
     */
    override fun tcpRouteSpec(tcpRouteSpec: CfnRoute.TcpRouteProperty) {
      cdkBuilder.tcpRouteSpec(tcpRouteSpec.let(CfnRoute.TcpRouteProperty::unwrap))
    }

    /**
     * @param tcpRouteSpec The spec for a tcp route.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0e2c72d361ff9c248f26683a22c463f75d83bbfd37256cd869cd48c84f23957")
    override fun tcpRouteSpec(tcpRouteSpec: CfnRoute.TcpRouteProperty.Builder.() -> Unit): Unit =
        tcpRouteSpec(CfnRoute.TcpRouteProperty(tcpRouteSpec))

    public fun build(): software.amazon.awscdk.services.appmesh.RouteSpecConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.RouteSpecConfig,
  ) : CdkObject(cdkObject), RouteSpecConfig {
    /**
     * The spec for a grpc route.
     *
     * Default: - no grpc spec
     */
    override fun grpcRouteSpec(): CfnRoute.GrpcRouteProperty? =
        unwrap(this).getGrpcRouteSpec()?.let(CfnRoute.GrpcRouteProperty::wrap)

    /**
     * The spec for an http2 route.
     *
     * Default: - no http2 spec
     */
    override fun http2RouteSpec(): CfnRoute.HttpRouteProperty? =
        unwrap(this).getHttp2RouteSpec()?.let(CfnRoute.HttpRouteProperty::wrap)

    /**
     * The spec for an http route.
     *
     * Default: - no http spec
     */
    override fun httpRouteSpec(): CfnRoute.HttpRouteProperty? =
        unwrap(this).getHttpRouteSpec()?.let(CfnRoute.HttpRouteProperty::wrap)

    /**
     * The priority for the route.
     *
     * When a Virtual Router has multiple routes, route match is performed in the
     * order of specified value, where 0 is the highest priority, and first matched route is
     * selected.
     *
     * Default: - no particular priority
     */
    override fun priority(): Number? = unwrap(this).getPriority()

    /**
     * The spec for a tcp route.
     *
     * Default: - no tcp spec
     */
    override fun tcpRouteSpec(): CfnRoute.TcpRouteProperty? =
        unwrap(this).getTcpRouteSpec()?.let(CfnRoute.TcpRouteProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RouteSpecConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.RouteSpecConfig):
        RouteSpecConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RouteSpecConfig):
        software.amazon.awscdk.services.appmesh.RouteSpecConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.RouteSpecConfig
  }
}
