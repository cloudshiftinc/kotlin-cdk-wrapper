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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents the type of virtual gateway connection pool.
 *
 * Only one protocol is used at a time and should be the same protocol as the one chosen under port
 * mapping.
 *
 * If not present the default value for `maxPendingRequests` is `2147483647` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayConnectionPoolProperty virtualGatewayConnectionPoolProperty =
 * VirtualGatewayConnectionPoolProperty.builder()
 * .grpc(VirtualGatewayGrpcConnectionPoolProperty.builder()
 * .maxRequests(123)
 * .build())
 * .http(VirtualGatewayHttpConnectionPoolProperty.builder()
 * .maxConnections(123)
 * // the properties below are optional
 * .maxPendingRequests(123)
 * .build())
 * .http2(VirtualGatewayHttp2ConnectionPoolProperty.builder()
 * .maxRequests(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayconnectionpool.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayConnectionPoolPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayConnectionPoolProperty.Builder =
        CfnVirtualGateway.VirtualGatewayConnectionPoolProperty.builder()

    /** @param grpc An object that represents a type of connection pool. */
    public fun grpc(grpc: IResolvable) {
        cdkBuilder.grpc(grpc)
    }

    /** @param grpc An object that represents a type of connection pool. */
    public fun grpc(grpc: CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty) {
        cdkBuilder.grpc(grpc)
    }

    /** @param http An object that represents a type of connection pool. */
    public fun http(http: IResolvable) {
        cdkBuilder.http(http)
    }

    /** @param http An object that represents a type of connection pool. */
    public fun http(http: CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty) {
        cdkBuilder.http(http)
    }

    /** @param http2 An object that represents a type of connection pool. */
    public fun http2(http2: IResolvable) {
        cdkBuilder.http2(http2)
    }

    /** @param http2 An object that represents a type of connection pool. */
    public fun http2(http2: CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty) {
        cdkBuilder.http2(http2)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayConnectionPoolProperty = cdkBuilder.build()
}
