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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps

/**
 * Properties for defining a `CfnGatewayRoute`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * CfnGatewayRouteProps cfnGatewayRouteProps = CfnGatewayRouteProps.builder()
 * .meshName("meshName")
 * .spec(GatewayRouteSpecProperty.builder()
 * .grpcRoute(GrpcGatewayRouteProperty.builder()
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
 * .http2Route(HttpGatewayRouteProperty.builder()
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
 * .httpRoute(HttpGatewayRouteProperty.builder()
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
 * .build())
 * .virtualGatewayName("virtualGatewayName")
 * // the properties below are optional
 * .gatewayRouteName("gatewayRouteName")
 * .meshOwner("meshOwner")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html)
 */
@CdkDslMarker
public class CfnGatewayRoutePropsDsl {
    private val cdkBuilder: CfnGatewayRouteProps.Builder = CfnGatewayRouteProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param gatewayRouteName The name of the gateway route. */
    public fun gatewayRouteName(gatewayRouteName: String) {
        cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    /** @param meshName The name of the service mesh that the resource resides in. */
    public fun meshName(meshName: String) {
        cdkBuilder.meshName(meshName)
    }

    /**
     * @param meshOwner The AWS IAM account ID of the service mesh owner. If the account ID is not
     *   your own, then it's the ID of the account that shared the mesh with your account. For more
     *   information about mesh sharing, see
     *   [Working with shared meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html)
     *   .
     */
    public fun meshOwner(meshOwner: String) {
        cdkBuilder.meshOwner(meshOwner)
    }

    /** @param spec The specifications of the gateway route. */
    public fun spec(spec: IResolvable) {
        cdkBuilder.spec(spec)
    }

    /** @param spec The specifications of the gateway route. */
    public fun spec(spec: CfnGatewayRoute.GatewayRouteSpecProperty) {
        cdkBuilder.spec(spec)
    }

    /**
     * @param tags Optional metadata that you can apply to the gateway route to assist with
     *   categorization and organization. Each tag consists of a key and an optional value, both of
     *   which you define. Tag keys can have a maximum character length of 128 characters, and tag
     *   values can have a maximum length of 256 characters.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Optional metadata that you can apply to the gateway route to assist with
     *   categorization and organization. Each tag consists of a key and an optional value, both of
     *   which you define. Tag keys can have a maximum character length of 128 characters, and tag
     *   values can have a maximum length of 256 characters.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param virtualGatewayName The virtual gateway that the gateway route is associated with. */
    public fun virtualGatewayName(virtualGatewayName: String) {
        cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): CfnGatewayRouteProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
