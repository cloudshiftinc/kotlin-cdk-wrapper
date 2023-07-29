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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object that represents a TCP route type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * TcpRouteProperty tcpRouteProperty = TcpRouteProperty.builder()
 * .action(TcpRouteActionProperty.builder()
 * .weightedTargets(List.of(WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build())
 * // the properties below are optional
 * .match(TcpRouteMatchProperty.builder()
 * .port(123)
 * .build())
 * .timeout(TcpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html)
 */
@CdkDslMarker
public class CfnRouteTcpRoutePropertyDsl {
    private val cdkBuilder: CfnRoute.TcpRouteProperty.Builder = CfnRoute.TcpRouteProperty.builder()

    /** @param action The action to take if a match is determined. */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /** @param action The action to take if a match is determined. */
    public fun action(action: CfnRoute.TcpRouteActionProperty) {
        cdkBuilder.action(action)
    }

    /** @param match An object that represents the criteria for determining a request match. */
    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    /** @param match An object that represents the criteria for determining a request match. */
    public fun match(match: CfnRoute.TcpRouteMatchProperty) {
        cdkBuilder.match(match)
    }

    /** @param timeout An object that represents types of timeouts. */
    public fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout)
    }

    /** @param timeout An object that represents types of timeouts. */
    public fun timeout(timeout: CfnRoute.TcpTimeoutProperty) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CfnRoute.TcpRouteProperty = cdkBuilder.build()
}
