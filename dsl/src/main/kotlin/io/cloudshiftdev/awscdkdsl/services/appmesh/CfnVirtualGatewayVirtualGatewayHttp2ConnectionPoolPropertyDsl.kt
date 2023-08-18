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

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
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
 * VirtualGatewayHttp2ConnectionPoolProperty virtualGatewayHttp2ConnectionPoolProperty =
 * VirtualGatewayHttp2ConnectionPoolProperty.builder()
 * .maxRequests(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhttp2connectionpool.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayHttp2ConnectionPoolPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.Builder =
        CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.builder()

    /**
     * @param maxRequests Maximum number of inflight requests Envoy can concurrently support across
     *   hosts in upstream cluster.
     */
    public fun maxRequests(maxRequests: Number) {
        cdkBuilder.maxRequests(maxRequests)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty =
        cdkBuilder.build()
}
