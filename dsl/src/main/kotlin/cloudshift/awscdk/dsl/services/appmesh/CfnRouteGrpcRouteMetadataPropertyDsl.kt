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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnRouteGrpcRouteMetadataPropertyDsl {
    private val cdkBuilder: CfnRoute.GrpcRouteMetadataProperty.Builder =
        CfnRoute.GrpcRouteMetadataProperty.builder()

    public fun invert(invert: Boolean) {
        cdkBuilder.invert(invert)
    }

    public fun invert(invert: IResolvable) {
        cdkBuilder.invert(invert)
    }

    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    public fun match(match: CfnRoute.GrpcRouteMetadataMatchMethodProperty) {
        cdkBuilder.match(match)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnRoute.GrpcRouteMetadataProperty = cdkBuilder.build()
}
