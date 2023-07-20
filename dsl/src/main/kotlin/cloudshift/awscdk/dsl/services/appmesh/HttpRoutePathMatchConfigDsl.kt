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
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class HttpRoutePathMatchConfigDsl {
    private val cdkBuilder: HttpRoutePathMatchConfig.Builder = HttpRoutePathMatchConfig.builder()

    public fun prefixPathMatch(prefixPathMatch: String) {
        cdkBuilder.prefixPathMatch(prefixPathMatch)
    }

    public fun wholePathMatch(block: CfnRouteHttpPathMatchPropertyDsl.() -> Unit = {}) {
        val builder = CfnRouteHttpPathMatchPropertyDsl()
        builder.apply(block)
        cdkBuilder.wholePathMatch(builder.build())
    }

    public fun wholePathMatch(wholePathMatch: CfnRoute.HttpPathMatchProperty) {
        cdkBuilder.wholePathMatch(wholePathMatch)
    }

    public fun build(): HttpRoutePathMatchConfig = cdkBuilder.build()
}
