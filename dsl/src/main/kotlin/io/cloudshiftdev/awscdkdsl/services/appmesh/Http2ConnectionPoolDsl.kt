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
import software.amazon.awscdk.services.appmesh.Http2ConnectionPool

/**
 * Connection pool properties for HTTP2 listeners.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * Http2ConnectionPool http2ConnectionPool = Http2ConnectionPool.builder()
 * .maxRequests(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class Http2ConnectionPoolDsl {
    private val cdkBuilder: Http2ConnectionPool.Builder = Http2ConnectionPool.builder()

    /** @param maxRequests The maximum requests in the pool. */
    public fun maxRequests(maxRequests: Number) {
        cdkBuilder.maxRequests(maxRequests)
    }

    public fun build(): Http2ConnectionPool = cdkBuilder.build()
}
