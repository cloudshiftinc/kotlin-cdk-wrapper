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
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRouteHeaderPropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.HttpGatewayRouteHeaderProperty.Builder =
        CfnGatewayRoute.HttpGatewayRouteHeaderProperty.builder()

    public fun invert(invert: Boolean) {
        cdkBuilder.invert(invert)
    }

    public fun invert(invert: IResolvable) {
        cdkBuilder.invert(invert)
    }

    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    public fun match(match: CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty) {
        cdkBuilder.match(match)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnGatewayRoute.HttpGatewayRouteHeaderProperty = cdkBuilder.build()
}
