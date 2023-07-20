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
import kotlin.Number

@CdkDslMarker
public class CfnRouteMatchRangePropertyDsl {
    private val cdkBuilder: CfnRoute.MatchRangeProperty.Builder =
        CfnRoute.MatchRangeProperty.builder()

    public fun end(end: Number) {
        cdkBuilder.end(end)
    }

    public fun start(start: Number) {
        cdkBuilder.start(start)
    }

    public fun build(): CfnRoute.MatchRangeProperty = cdkBuilder.build()
}
