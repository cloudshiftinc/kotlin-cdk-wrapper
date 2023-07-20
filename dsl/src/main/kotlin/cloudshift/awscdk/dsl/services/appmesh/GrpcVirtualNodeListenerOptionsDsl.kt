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
import software.amazon.awscdk.services.appmesh.GrpcTimeout
import software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions
import software.amazon.awscdk.services.appmesh.HealthCheck
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions
import software.amazon.awscdk.services.appmesh.OutlierDetection
import kotlin.Number
import kotlin.Unit

@CdkDslMarker
public class GrpcVirtualNodeListenerOptionsDsl {
    private val cdkBuilder: GrpcVirtualNodeListenerOptions.Builder =
        GrpcVirtualNodeListenerOptions.builder()

    public fun connectionPool(block: GrpcConnectionPoolDsl.() -> Unit = {}) {
        val builder = GrpcConnectionPoolDsl()
        builder.apply(block)
        cdkBuilder.connectionPool(builder.build())
    }

    public fun connectionPool(connectionPool: GrpcConnectionPool) {
        cdkBuilder.connectionPool(connectionPool)
    }

    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun outlierDetection(block: OutlierDetectionDsl.() -> Unit = {}) {
        val builder = OutlierDetectionDsl()
        builder.apply(block)
        cdkBuilder.outlierDetection(builder.build())
    }

    public fun outlierDetection(outlierDetection: OutlierDetection) {
        cdkBuilder.outlierDetection(outlierDetection)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun timeout(block: GrpcTimeoutDsl.() -> Unit = {}) {
        val builder = GrpcTimeoutDsl()
        builder.apply(block)
        cdkBuilder.timeout(builder.build())
    }

    public fun timeout(timeout: GrpcTimeout) {
        cdkBuilder.timeout(timeout)
    }

    public fun tls(block: ListenerTlsOptionsDsl.() -> Unit = {}) {
        val builder = ListenerTlsOptionsDsl()
        builder.apply(block)
        cdkBuilder.tls(builder.build())
    }

    public fun tls(tls: ListenerTlsOptions) {
        cdkBuilder.tls(tls)
    }

    public fun build(): GrpcVirtualNodeListenerOptions = cdkBuilder.build()
}
