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
import software.amazon.awscdk.services.appmesh.GrpcConnectionPool
import kotlin.Number

@CdkDslMarker
public class GrpcConnectionPoolDsl {
    private val cdkBuilder: GrpcConnectionPool.Builder = GrpcConnectionPool.builder()

    public fun maxRequests(maxRequests: Number) {
        cdkBuilder.maxRequests(maxRequests)
    }

    public fun build(): GrpcConnectionPool = cdkBuilder.build()
}
