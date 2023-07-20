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
import software.amazon.awscdk.services.appmesh.IVirtualRouter
import software.amazon.awscdk.services.appmesh.RouteAttributes
import kotlin.String

@CdkDslMarker
public class RouteAttributesDsl {
    private val cdkBuilder: RouteAttributes.Builder = RouteAttributes.builder()

    public fun routeName(routeName: String) {
        cdkBuilder.routeName(routeName)
    }

    public fun virtualRouter(virtualRouter: IVirtualRouter) {
        cdkBuilder.virtualRouter(virtualRouter)
    }

    public fun build(): RouteAttributes = cdkBuilder.build()
}
