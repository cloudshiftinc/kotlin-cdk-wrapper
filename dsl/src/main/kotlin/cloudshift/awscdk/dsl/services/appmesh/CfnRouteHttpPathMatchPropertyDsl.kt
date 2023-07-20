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
import kotlin.String

@CdkDslMarker
public class CfnRouteHttpPathMatchPropertyDsl {
    private val cdkBuilder: CfnRoute.HttpPathMatchProperty.Builder =
        CfnRoute.HttpPathMatchProperty.builder()

    public fun exact(exact: String) {
        cdkBuilder.exact(exact)
    }

    public fun regex(regex: String) {
        cdkBuilder.regex(regex)
    }

    public fun build(): CfnRoute.HttpPathMatchProperty = cdkBuilder.build()
}
