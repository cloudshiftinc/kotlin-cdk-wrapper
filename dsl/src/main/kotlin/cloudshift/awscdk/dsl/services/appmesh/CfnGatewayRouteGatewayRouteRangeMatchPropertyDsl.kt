@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object that represents the range of values to match on.
 *
 * The first character of the range is included in the range, though the last character is not. For
 * example, if the range specified were 1-100, only values 1-99 would be matched.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GatewayRouteRangeMatchProperty gatewayRouteRangeMatchProperty =
 * GatewayRouteRangeMatchProperty.builder()
 * .end(123)
 * .start(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayrouterangematch.html)
 */
@CdkDslMarker
public class CfnGatewayRouteGatewayRouteRangeMatchPropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.GatewayRouteRangeMatchProperty.Builder =
        CfnGatewayRoute.GatewayRouteRangeMatchProperty.builder()

    /** @param end The end of the range. */
    public fun end(end: Number) {
        cdkBuilder.end(end)
    }

    /** @param start The start of the range. */
    public fun start(start: Number) {
        cdkBuilder.start(start)
    }

    public fun build(): CfnGatewayRoute.GatewayRouteRangeMatchProperty = cdkBuilder.build()
}
