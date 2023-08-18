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
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the type of virtual node connection pool.
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
 * VirtualNodeConnectionPoolProperty virtualNodeConnectionPoolProperty =
 * VirtualNodeConnectionPoolProperty.builder()
 * .grpc(VirtualNodeGrpcConnectionPoolProperty.builder()
 * .maxRequests(123)
 * .build())
 * .http(VirtualNodeHttpConnectionPoolProperty.builder()
 * .maxConnections(123)
 * // the properties below are optional
 * .maxPendingRequests(123)
 * .build())
 * .http2(VirtualNodeHttp2ConnectionPoolProperty.builder()
 * .maxRequests(123)
 * .build())
 * .tcp(VirtualNodeTcpConnectionPoolProperty.builder()
 * .maxConnections(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodeconnectionpool.html)
 */
@CdkDslMarker
public class CfnVirtualNodeVirtualNodeConnectionPoolPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.VirtualNodeConnectionPoolProperty.Builder =
        CfnVirtualNode.VirtualNodeConnectionPoolProperty.builder()

    /** @param grpc An object that represents a type of connection pool. */
    public fun grpc(grpc: IResolvable) {
        cdkBuilder.grpc(grpc)
    }

    /** @param grpc An object that represents a type of connection pool. */
    public fun grpc(grpc: CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty) {
        cdkBuilder.grpc(grpc)
    }

    /** @param http An object that represents a type of connection pool. */
    public fun http(http: IResolvable) {
        cdkBuilder.http(http)
    }

    /** @param http An object that represents a type of connection pool. */
    public fun http(http: CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty) {
        cdkBuilder.http(http)
    }

    /** @param http2 An object that represents a type of connection pool. */
    public fun http2(http2: IResolvable) {
        cdkBuilder.http2(http2)
    }

    /** @param http2 An object that represents a type of connection pool. */
    public fun http2(http2: CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty) {
        cdkBuilder.http2(http2)
    }

    /** @param tcp An object that represents a type of connection pool. */
    public fun tcp(tcp: IResolvable) {
        cdkBuilder.tcp(tcp)
    }

    /** @param tcp An object that represents a type of connection pool. */
    public fun tcp(tcp: CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty) {
        cdkBuilder.tcp(tcp)
    }

    public fun build(): CfnVirtualNode.VirtualNodeConnectionPoolProperty = cdkBuilder.build()
}
