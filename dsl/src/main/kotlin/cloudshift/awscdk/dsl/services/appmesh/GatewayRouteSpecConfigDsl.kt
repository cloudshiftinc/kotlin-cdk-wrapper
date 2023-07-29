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
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig

/**
 * All Properties for GatewayRoute Specs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GatewayRouteSpecConfig gatewayRouteSpecConfig = GatewayRouteSpecConfig.builder()
 * .grpcSpecConfig(GrpcGatewayRouteProperty.builder()
 * .action(GrpcGatewayRouteActionProperty.builder()
 * .target(GatewayRouteTargetProperty.builder()
 * .virtualService(GatewayRouteVirtualServiceProperty.builder()
 * .virtualServiceName("virtualServiceName")
 * .build())
 * // the properties below are optional
 * .port(123)
 * .build())
 * // the properties below are optional
 * .rewrite(GrpcGatewayRouteRewriteProperty.builder()
 * .hostname(GatewayRouteHostnameRewriteProperty.builder()
 * .defaultTargetHostname("defaultTargetHostname")
 * .build())
 * .build())
 * .build())
 * .match(GrpcGatewayRouteMatchProperty.builder()
 * .hostname(GatewayRouteHostnameMatchProperty.builder()
 * .exact("exact")
 * .suffix("suffix")
 * .build())
 * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(GatewayRouteMetadataMatchProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(GatewayRouteRangeMatchProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .port(123)
 * .serviceName("serviceName")
 * .build())
 * .build())
 * .http2SpecConfig(HttpGatewayRouteProperty.builder()
 * .action(HttpGatewayRouteActionProperty.builder()
 * .target(GatewayRouteTargetProperty.builder()
 * .virtualService(GatewayRouteVirtualServiceProperty.builder()
 * .virtualServiceName("virtualServiceName")
 * .build())
 * // the properties below are optional
 * .port(123)
 * .build())
 * // the properties below are optional
 * .rewrite(HttpGatewayRouteRewriteProperty.builder()
 * .hostname(GatewayRouteHostnameRewriteProperty.builder()
 * .defaultTargetHostname("defaultTargetHostname")
 * .build())
 * .path(HttpGatewayRoutePathRewriteProperty.builder()
 * .exact("exact")
 * .build())
 * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
 * .defaultPrefix("defaultPrefix")
 * .value("value")
 * .build())
 * .build())
 * .build())
 * .match(HttpGatewayRouteMatchProperty.builder()
 * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HttpGatewayRouteHeaderMatchProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(GatewayRouteRangeMatchProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .hostname(GatewayRouteHostnameMatchProperty.builder()
 * .exact("exact")
 * .suffix("suffix")
 * .build())
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
 * .build())
 * .build())
 * .httpSpecConfig(HttpGatewayRouteProperty.builder()
 * .action(HttpGatewayRouteActionProperty.builder()
 * .target(GatewayRouteTargetProperty.builder()
 * .virtualService(GatewayRouteVirtualServiceProperty.builder()
 * .virtualServiceName("virtualServiceName")
 * .build())
 * // the properties below are optional
 * .port(123)
 * .build())
 * // the properties below are optional
 * .rewrite(HttpGatewayRouteRewriteProperty.builder()
 * .hostname(GatewayRouteHostnameRewriteProperty.builder()
 * .defaultTargetHostname("defaultTargetHostname")
 * .build())
 * .path(HttpGatewayRoutePathRewriteProperty.builder()
 * .exact("exact")
 * .build())
 * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
 * .defaultPrefix("defaultPrefix")
 * .value("value")
 * .build())
 * .build())
 * .build())
 * .match(HttpGatewayRouteMatchProperty.builder()
 * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HttpGatewayRouteHeaderMatchProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(GatewayRouteRangeMatchProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .hostname(GatewayRouteHostnameMatchProperty.builder()
 * .exact("exact")
 * .suffix("suffix")
 * .build())
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
 * .build())
 * .build())
 * .priority(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class GatewayRouteSpecConfigDsl {
    private val cdkBuilder: GatewayRouteSpecConfig.Builder = GatewayRouteSpecConfig.builder()

    /** @param grpcSpecConfig The spec for a grpc gateway route. */
    public fun grpcSpecConfig(
        grpcSpecConfig: CfnGatewayRouteGrpcGatewayRoutePropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnGatewayRouteGrpcGatewayRoutePropertyDsl()
        builder.apply(grpcSpecConfig)
        cdkBuilder.grpcSpecConfig(builder.build())
    }

    /** @param grpcSpecConfig The spec for a grpc gateway route. */
    public fun grpcSpecConfig(grpcSpecConfig: CfnGatewayRoute.GrpcGatewayRouteProperty) {
        cdkBuilder.grpcSpecConfig(grpcSpecConfig)
    }

    /** @param http2SpecConfig The spec for an http2 gateway route. */
    public fun http2SpecConfig(
        http2SpecConfig: CfnGatewayRouteHttpGatewayRoutePropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnGatewayRouteHttpGatewayRoutePropertyDsl()
        builder.apply(http2SpecConfig)
        cdkBuilder.http2SpecConfig(builder.build())
    }

    /** @param http2SpecConfig The spec for an http2 gateway route. */
    public fun http2SpecConfig(http2SpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty) {
        cdkBuilder.http2SpecConfig(http2SpecConfig)
    }

    /** @param httpSpecConfig The spec for an http gateway route. */
    public fun httpSpecConfig(
        httpSpecConfig: CfnGatewayRouteHttpGatewayRoutePropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnGatewayRouteHttpGatewayRoutePropertyDsl()
        builder.apply(httpSpecConfig)
        cdkBuilder.httpSpecConfig(builder.build())
    }

    /** @param httpSpecConfig The spec for an http gateway route. */
    public fun httpSpecConfig(httpSpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty) {
        cdkBuilder.httpSpecConfig(httpSpecConfig)
    }

    /**
     * @param priority The priority for the gateway route. When a Virtual Gateway has multiple
     *   gateway routes, gateway route match is performed in the order of specified value, where 0
     *   is the highest priority, and first matched gateway route is selected.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun build(): GatewayRouteSpecConfig = cdkBuilder.build()
}
