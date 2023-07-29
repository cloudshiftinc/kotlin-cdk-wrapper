@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.RouteSpecConfig

/**
 * All Properties for Route Specs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
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
@CdkDslMarker
public class RouteSpecConfigDsl {
    private val cdkBuilder: RouteSpecConfig.Builder = RouteSpecConfig.builder()

    /** @param grpcRouteSpec The spec for a grpc route. */
    public fun grpcRouteSpec(grpcRouteSpec: CfnRouteGrpcRoutePropertyDsl.() -> Unit = {}) {
        val builder = CfnRouteGrpcRoutePropertyDsl()
        builder.apply(grpcRouteSpec)
        cdkBuilder.grpcRouteSpec(builder.build())
    }

    /** @param grpcRouteSpec The spec for a grpc route. */
    public fun grpcRouteSpec(grpcRouteSpec: CfnRoute.GrpcRouteProperty) {
        cdkBuilder.grpcRouteSpec(grpcRouteSpec)
    }

    /** @param http2RouteSpec The spec for an http2 route. */
    public fun http2RouteSpec(http2RouteSpec: CfnRouteHttpRoutePropertyDsl.() -> Unit = {}) {
        val builder = CfnRouteHttpRoutePropertyDsl()
        builder.apply(http2RouteSpec)
        cdkBuilder.http2RouteSpec(builder.build())
    }

    /** @param http2RouteSpec The spec for an http2 route. */
    public fun http2RouteSpec(http2RouteSpec: CfnRoute.HttpRouteProperty) {
        cdkBuilder.http2RouteSpec(http2RouteSpec)
    }

    /** @param httpRouteSpec The spec for an http route. */
    public fun httpRouteSpec(httpRouteSpec: CfnRouteHttpRoutePropertyDsl.() -> Unit = {}) {
        val builder = CfnRouteHttpRoutePropertyDsl()
        builder.apply(httpRouteSpec)
        cdkBuilder.httpRouteSpec(builder.build())
    }

    /** @param httpRouteSpec The spec for an http route. */
    public fun httpRouteSpec(httpRouteSpec: CfnRoute.HttpRouteProperty) {
        cdkBuilder.httpRouteSpec(httpRouteSpec)
    }

    /**
     * @param priority The priority for the route. When a Virtual Router has multiple routes, route
     *   match is performed in the order of specified value, where 0 is the highest priority, and
     *   first matched route is selected.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /** @param tcpRouteSpec The spec for a tcp route. */
    public fun tcpRouteSpec(tcpRouteSpec: CfnRouteTcpRoutePropertyDsl.() -> Unit = {}) {
        val builder = CfnRouteTcpRoutePropertyDsl()
        builder.apply(tcpRouteSpec)
        cdkBuilder.tcpRouteSpec(builder.build())
    }

    /** @param tcpRouteSpec The spec for a tcp route. */
    public fun tcpRouteSpec(tcpRouteSpec: CfnRoute.TcpRouteProperty) {
        cdkBuilder.tcpRouteSpec(tcpRouteSpec)
    }

    public fun build(): RouteSpecConfig = cdkBuilder.build()
}
