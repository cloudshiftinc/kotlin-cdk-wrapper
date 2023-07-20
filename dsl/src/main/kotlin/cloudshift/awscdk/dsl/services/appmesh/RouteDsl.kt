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
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.IVirtualRouter
import software.amazon.awscdk.services.appmesh.Route
import software.amazon.awscdk.services.appmesh.RouteSpec
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class RouteDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Route.Builder = Route.Builder.create(scope, id)

    public fun mesh(mesh: IMesh) {
        cdkBuilder.mesh(mesh)
    }

    public fun routeName(routeName: String) {
        cdkBuilder.routeName(routeName)
    }

    public fun routeSpec(routeSpec: RouteSpec) {
        cdkBuilder.routeSpec(routeSpec)
    }

    public fun virtualRouter(virtualRouter: IVirtualRouter) {
        cdkBuilder.virtualRouter(virtualRouter)
    }

    public fun build(): Route = cdkBuilder.build()
}
