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
import software.amazon.awscdk.services.appmesh.TcpConnectionPool
import kotlin.Number

@CdkDslMarker
public class TcpConnectionPoolDsl {
    private val cdkBuilder: TcpConnectionPool.Builder = TcpConnectionPool.builder()

    public fun maxConnections(maxConnections: Number) {
        cdkBuilder.maxConnections(maxConnections)
    }

    public fun build(): TcpConnectionPool = cdkBuilder.build()
}
