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
import software.amazon.awscdk.services.appmesh.HttpConnectionPool
import kotlin.Number

@CdkDslMarker
public class HttpConnectionPoolDsl {
    private val cdkBuilder: HttpConnectionPool.Builder = HttpConnectionPool.builder()

    public fun maxConnections(maxConnections: Number) {
        cdkBuilder.maxConnections(maxConnections)
    }

    public fun maxPendingRequests(maxPendingRequests: Number) {
        cdkBuilder.maxPendingRequests(maxPendingRequests)
    }

    public fun build(): HttpConnectionPool = cdkBuilder.build()
}
