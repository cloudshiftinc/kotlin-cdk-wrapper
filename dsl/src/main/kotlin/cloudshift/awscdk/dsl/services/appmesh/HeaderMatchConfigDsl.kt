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
import software.amazon.awscdk.services.appmesh.HeaderMatchConfig
import kotlin.Unit

@CdkDslMarker
public class HeaderMatchConfigDsl {
    private val cdkBuilder: HeaderMatchConfig.Builder = HeaderMatchConfig.builder()

    public fun headerMatch(block: CfnRouteHttpRouteHeaderPropertyDsl.() -> Unit = {}) {
        val builder = CfnRouteHttpRouteHeaderPropertyDsl()
        builder.apply(block)
        cdkBuilder.headerMatch(builder.build())
    }

    public fun headerMatch(headerMatch: CfnRoute.HttpRouteHeaderProperty) {
        cdkBuilder.headerMatch(headerMatch)
    }

    public fun build(): HeaderMatchConfig = cdkBuilder.build()
}
