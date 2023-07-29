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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object that represents an HTTP gateway route.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpGatewayRouteProperty httpGatewayRouteProperty = HttpGatewayRouteProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroute.html)
 */
@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRoutePropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.HttpGatewayRouteProperty.Builder =
        CfnGatewayRoute.HttpGatewayRouteProperty.builder()

    /** @param action An object that represents the action to take if a match is determined. */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /** @param action An object that represents the action to take if a match is determined. */
    public fun action(action: CfnGatewayRoute.HttpGatewayRouteActionProperty) {
        cdkBuilder.action(action)
    }

    /** @param match An object that represents the criteria for determining a request match. */
    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    /** @param match An object that represents the criteria for determining a request match. */
    public fun match(match: CfnGatewayRoute.HttpGatewayRouteMatchProperty) {
        cdkBuilder.match(match)
    }

    public fun build(): CfnGatewayRoute.HttpGatewayRouteProperty = cdkBuilder.build()
}
