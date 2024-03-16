@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * All Properties for Route Specs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * RouteSpecConfig routeSpecConfig = RouteSpecConfig.builder()
 * .grpcRouteSpec(GrpcRouteProperty.builder()
 * .action(GrpcRouteActionProperty.builder()
 * .weightedTargets(List.of(WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build())
 * .match(GrpcRouteMatchProperty.builder()
 * .metadata(List.of(GrpcRouteMetadataProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(GrpcRouteMetadataMatchMethodProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(MatchRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .methodName("methodName")
 * .port(123)
 * .serviceName("serviceName")
 * .build())
 * // the properties below are optional
 * .retryPolicy(GrpcRetryPolicyProperty.builder()
 * .maxRetries(123)
 * .perRetryTimeout(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * // the properties below are optional
 * .grpcRetryEvents(List.of("grpcRetryEvents"))
 * .httpRetryEvents(List.of("httpRetryEvents"))
 * .tcpRetryEvents(List.of("tcpRetryEvents"))
 * .build())
 * .timeout(GrpcTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build())
 * .http2RouteSpec(HttpRouteProperty.builder()
 * .action(HttpRouteActionProperty.builder()
 * .weightedTargets(List.of(WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build())
 * .match(HttpRouteMatchProperty.builder()
 * .headers(List.of(HttpRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HeaderMatchMethodProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(MatchRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .method("method")
 * .path(HttpPathMatchProperty.builder()
 * .exact("exact")
 * .regex("regex")
 * .build())
 * .port(123)
 * .prefix("prefix")
 * .queryParameters(List.of(QueryParameterProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .match(HttpQueryParameterMatchProperty.builder()
 * .exact("exact")
 * .build())
 * .build()))
 * .scheme("scheme")
 * .build())
 * // the properties below are optional
 * .retryPolicy(HttpRetryPolicyProperty.builder()
 * .maxRetries(123)
 * .perRetryTimeout(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * // the properties below are optional
 * .httpRetryEvents(List.of("httpRetryEvents"))
 * .tcpRetryEvents(List.of("tcpRetryEvents"))
 * .build())
 * .timeout(HttpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build())
 * .httpRouteSpec(HttpRouteProperty.builder()
 * .action(HttpRouteActionProperty.builder()
 * .weightedTargets(List.of(WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build())
 * .match(HttpRouteMatchProperty.builder()
 * .headers(List.of(HttpRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HeaderMatchMethodProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(MatchRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .method("method")
 * .path(HttpPathMatchProperty.builder()
 * .exact("exact")
 * .regex("regex")
 * .build())
 * .port(123)
 * .prefix("prefix")
 * .queryParameters(List.of(QueryParameterProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .match(HttpQueryParameterMatchProperty.builder()
 * .exact("exact")
 * .build())
 * .build()))
 * .scheme("scheme")
 * .build())
 * // the properties below are optional
 * .retryPolicy(HttpRetryPolicyProperty.builder()
 * .maxRetries(123)
 * .perRetryTimeout(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * // the properties below are optional
 * .httpRetryEvents(List.of("httpRetryEvents"))
 * .tcpRetryEvents(List.of("tcpRetryEvents"))
 * .build())
 * .timeout(HttpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build())
 * .priority(123)
 * .tcpRouteSpec(TcpRouteProperty.builder()
 * .action(TcpRouteActionProperty.builder()
 * .weightedTargets(List.of(WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build())
 * // the properties below are optional
 * .match(TcpRouteMatchProperty.builder()
 * .port(123)
 * .build())
 * .timeout(TcpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 */
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9ce79cd0bb676b0e3c199f23481a9466fa6603403a805cb29826b7dc79b40a7")
    public fun grpcRouteSpec(grpcRouteSpec: CfnRoute.GrpcRouteProperty.Builder.() -> Unit)

    /**
     * @param http2RouteSpec The spec for an http2 route.
     */
    public fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty)

    /**
     * @param http2RouteSpec The spec for an http2 route.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d45a5745ff1c95df93aba4e7a9c560af6ab7628ff7da881d0987eec8cca355b0")
    public fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty.Builder.() -> Unit)

    /**
     * @param httpRouteSpec The spec for an http route.
     */
    public fun httpRouteSpec(httpRouteSpec: CfnRoute.HttpRouteProperty)

    /**
     * @param httpRouteSpec The spec for an http route.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
        RouteSpecConfig = CdkObjectWrappers.wrap(cdkObject) as RouteSpecConfig

    internal fun unwrap(wrapped: RouteSpecConfig):
        software.amazon.awscdk.services.appmesh.RouteSpecConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.RouteSpecConfig
  }
}
