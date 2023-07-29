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
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig

/**
 * The type returned from the `bind()` method in `HttpGatewayRoutePathMatch`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpGatewayRoutePathMatchConfig httpGatewayRoutePathMatchConfig =
 * HttpGatewayRoutePathMatchConfig.builder()
 * .prefixPathMatch("prefixPathMatch")
 * .prefixPathRewrite(HttpGatewayRoutePrefixRewriteProperty.builder()
 * .defaultPrefix("defaultPrefix")
 * .value("value")
 * .build())
 * .wholePathMatch(HttpPathMatchProperty.builder()
 * .exact("exact")
 * .regex("regex")
 * .build())
 * .wholePathRewrite(HttpGatewayRoutePathRewriteProperty.builder()
 * .exact("exact")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpGatewayRoutePathMatchConfigDsl {
    private val cdkBuilder: HttpGatewayRoutePathMatchConfig.Builder =
        HttpGatewayRoutePathMatchConfig.builder()

    /**
     * @param prefixPathMatch Gateway route configuration for matching on the prefix of the URL path
     *   of the request.
     */
    public fun prefixPathMatch(prefixPathMatch: String) {
        cdkBuilder.prefixPathMatch(prefixPathMatch)
    }

    /**
     * @param prefixPathRewrite Gateway route configuration for rewriting the prefix of the URL path
     *   of the request.
     */
    public fun prefixPathRewrite(
        prefixPathRewrite: CfnGatewayRouteHttpGatewayRoutePrefixRewritePropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnGatewayRouteHttpGatewayRoutePrefixRewritePropertyDsl()
        builder.apply(prefixPathRewrite)
        cdkBuilder.prefixPathRewrite(builder.build())
    }

    /**
     * @param prefixPathRewrite Gateway route configuration for rewriting the prefix of the URL path
     *   of the request.
     */
    public fun prefixPathRewrite(
        prefixPathRewrite: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty
    ) {
        cdkBuilder.prefixPathRewrite(prefixPathRewrite)
    }

    /**
     * @param wholePathMatch Gateway route configuration for matching on the complete URL path of
     *   the request.
     */
    public fun wholePathMatch(
        wholePathMatch: CfnGatewayRouteHttpPathMatchPropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnGatewayRouteHttpPathMatchPropertyDsl()
        builder.apply(wholePathMatch)
        cdkBuilder.wholePathMatch(builder.build())
    }

    /**
     * @param wholePathMatch Gateway route configuration for matching on the complete URL path of
     *   the request.
     */
    public fun wholePathMatch(wholePathMatch: CfnGatewayRoute.HttpPathMatchProperty) {
        cdkBuilder.wholePathMatch(wholePathMatch)
    }

    /**
     * @param wholePathRewrite Gateway route configuration for rewriting the complete URL path of
     *   the request..
     */
    public fun wholePathRewrite(
        wholePathRewrite: CfnGatewayRouteHttpGatewayRoutePathRewritePropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnGatewayRouteHttpGatewayRoutePathRewritePropertyDsl()
        builder.apply(wholePathRewrite)
        cdkBuilder.wholePathRewrite(builder.build())
    }

    /**
     * @param wholePathRewrite Gateway route configuration for rewriting the complete URL path of
     *   the request..
     */
    public fun wholePathRewrite(
        wholePathRewrite: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty
    ) {
        cdkBuilder.wholePathRewrite(wholePathRewrite)
    }

    public fun build(): HttpGatewayRoutePathMatchConfig = cdkBuilder.build()
}
