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
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object representing the TCP route to match.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * TcpRouteMatchProperty tcpRouteMatchProperty = TcpRouteMatchProperty.builder()
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproutematch.html)
 */
@CdkDslMarker
public class CfnRouteTcpRouteMatchPropertyDsl {
    private val cdkBuilder: CfnRoute.TcpRouteMatchProperty.Builder =
        CfnRoute.TcpRouteMatchProperty.builder()

    /** @param port The port number to match on. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnRoute.TcpRouteMatchProperty = cdkBuilder.build()
}
