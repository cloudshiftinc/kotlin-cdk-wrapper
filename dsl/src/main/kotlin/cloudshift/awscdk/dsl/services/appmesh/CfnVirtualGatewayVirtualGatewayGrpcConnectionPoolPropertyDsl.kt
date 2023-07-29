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
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents a type of connection pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayGrpcConnectionPoolProperty virtualGatewayGrpcConnectionPoolProperty =
 * VirtualGatewayGrpcConnectionPoolProperty.builder()
 * .maxRequests(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaygrpcconnectionpool.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayGrpcConnectionPoolPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty.Builder =
        CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty.builder()

    /**
     * @param maxRequests Maximum number of inflight requests Envoy can concurrently support across
     *   hosts in upstream cluster.
     */
    public fun maxRequests(maxRequests: Number) {
        cdkBuilder.maxRequests(maxRequests)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty =
        cdkBuilder.build()
}
