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

@CdkDslMarker
public class CfnRouteGrpcTimeoutPropertyDsl {
    private val cdkBuilder: CfnRoute.GrpcTimeoutProperty.Builder =
        CfnRoute.GrpcTimeoutProperty.builder()

    public fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle)
    }

    public fun idle(idle: CfnRoute.DurationProperty) {
        cdkBuilder.idle(idle)
    }

    public fun perRequest(perRequest: IResolvable) {
        cdkBuilder.perRequest(perRequest)
    }

    public fun perRequest(perRequest: CfnRoute.DurationProperty) {
        cdkBuilder.perRequest(perRequest)
    }

    public fun build(): CfnRoute.GrpcTimeoutProperty = cdkBuilder.build()
}
