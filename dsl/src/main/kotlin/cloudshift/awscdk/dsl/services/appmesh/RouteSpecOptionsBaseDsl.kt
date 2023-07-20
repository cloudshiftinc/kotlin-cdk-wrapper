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
import software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase
import kotlin.Number

@CdkDslMarker
public class RouteSpecOptionsBaseDsl {
    private val cdkBuilder: RouteSpecOptionsBase.Builder = RouteSpecOptionsBase.builder()

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun build(): RouteSpecOptionsBase = cdkBuilder.build()
}
