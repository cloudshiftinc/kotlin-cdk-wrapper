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
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents a type of connection pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualNodeTcpConnectionPoolProperty virtualNodeTcpConnectionPoolProperty =
 * VirtualNodeTcpConnectionPoolProperty.builder()
 * .maxConnections(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodetcpconnectionpool.html)
 */
@CdkDslMarker
public class CfnVirtualNodeVirtualNodeTcpConnectionPoolPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.Builder =
        CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.builder()

    /**
     * @param maxConnections Maximum number of outbound TCP connections Envoy can establish
     *   concurrently with all hosts in upstream cluster.
     */
    public fun maxConnections(maxConnections: Number) {
        cdkBuilder.maxConnections(maxConnections)
    }

    public fun build(): CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty = cdkBuilder.build()
}
