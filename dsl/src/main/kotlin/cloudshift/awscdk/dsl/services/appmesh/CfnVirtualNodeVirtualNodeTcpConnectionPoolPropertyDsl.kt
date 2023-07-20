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
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import kotlin.Number

@CdkDslMarker
public class CfnVirtualNodeVirtualNodeTcpConnectionPoolPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.Builder =
        CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.builder()

    public fun maxConnections(maxConnections: Number) {
        cdkBuilder.maxConnections(maxConnections)
    }

    public fun build(): CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty = cdkBuilder.build()
}
