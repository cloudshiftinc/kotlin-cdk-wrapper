@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class HttpGatewayRoutePathMatchConfigDsl {
    private val cdkBuilder: HttpGatewayRoutePathMatchConfig.Builder =
        HttpGatewayRoutePathMatchConfig.builder()

    public fun prefixPathMatch(prefixPathMatch: String) {
        cdkBuilder.prefixPathMatch(prefixPathMatch)
    }

    public fun prefixPathRewrite(
        block: CfnGatewayRouteHttpGatewayRoutePrefixRewritePropertyDsl.() -> Unit =
            {},
    ) {
        val builder = CfnGatewayRouteHttpGatewayRoutePrefixRewritePropertyDsl()
        builder.apply(block)
        cdkBuilder.prefixPathRewrite(builder.build())
    }

    public fun prefixPathRewrite(prefixPathRewrite: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty) {
        cdkBuilder.prefixPathRewrite(prefixPathRewrite)
    }

    public fun wholePathMatch(block: CfnGatewayRouteHttpPathMatchPropertyDsl.() -> Unit = {}) {
        val builder = CfnGatewayRouteHttpPathMatchPropertyDsl()
        builder.apply(block)
        cdkBuilder.wholePathMatch(builder.build())
    }

    public fun wholePathMatch(wholePathMatch: CfnGatewayRoute.HttpPathMatchProperty) {
        cdkBuilder.wholePathMatch(wholePathMatch)
    }

    public fun wholePathRewrite(
        block: CfnGatewayRouteHttpGatewayRoutePathRewritePropertyDsl.() -> Unit =
            {},
    ) {
        val builder = CfnGatewayRouteHttpGatewayRoutePathRewritePropertyDsl()
        builder.apply(block)
        cdkBuilder.wholePathRewrite(builder.build())
    }

    public fun wholePathRewrite(wholePathRewrite: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty) {
        cdkBuilder.wholePathRewrite(wholePathRewrite)
    }

    public fun build(): HttpGatewayRoutePathMatchConfig = cdkBuilder.build()
}
