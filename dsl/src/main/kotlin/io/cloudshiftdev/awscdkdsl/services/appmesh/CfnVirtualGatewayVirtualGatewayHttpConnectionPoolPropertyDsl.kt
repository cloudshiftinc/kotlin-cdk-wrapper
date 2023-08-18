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
 * VirtualGatewayHttpConnectionPoolProperty virtualGatewayHttpConnectionPoolProperty =
 * VirtualGatewayHttpConnectionPoolProperty.builder()
 * .maxConnections(123)
 * // the properties below are optional
 * .maxPendingRequests(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhttpconnectionpool.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayHttpConnectionPoolPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty.Builder =
        CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty.builder()

    /**
     * @param maxConnections Maximum number of outbound TCP connections Envoy can establish
     *   concurrently with all hosts in upstream cluster.
     */
    public fun maxConnections(maxConnections: Number) {
        cdkBuilder.maxConnections(maxConnections)
    }

    /**
     * @param maxPendingRequests Number of overflowing requests after `max_connections` Envoy will
     *   queue to upstream cluster.
     */
    public fun maxPendingRequests(maxPendingRequests: Number) {
        cdkBuilder.maxPendingRequests(maxPendingRequests)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty =
        cdkBuilder.build()
}
