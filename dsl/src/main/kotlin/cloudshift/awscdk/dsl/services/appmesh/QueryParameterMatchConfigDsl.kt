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
import software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig
import kotlin.Unit

@CdkDslMarker
public class QueryParameterMatchConfigDsl {
    private val cdkBuilder: QueryParameterMatchConfig.Builder = QueryParameterMatchConfig.builder()

    public fun queryParameterMatch(block: CfnRouteQueryParameterPropertyDsl.() -> Unit = {}) {
        val builder = CfnRouteQueryParameterPropertyDsl()
        builder.apply(block)
        cdkBuilder.queryParameterMatch(builder.build())
    }

    public fun queryParameterMatch(queryParameterMatch: CfnRoute.QueryParameterProperty) {
        cdkBuilder.queryParameterMatch(queryParameterMatch)
    }

    public fun build(): QueryParameterMatchConfig = cdkBuilder.build()
}
