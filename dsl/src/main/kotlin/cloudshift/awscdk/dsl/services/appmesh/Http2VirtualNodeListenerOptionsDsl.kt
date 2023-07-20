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
import software.amazon.awscdk.services.appmesh.HealthCheck
import software.amazon.awscdk.services.appmesh.Http2ConnectionPool
import software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions
import software.amazon.awscdk.services.appmesh.HttpTimeout
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions
import software.amazon.awscdk.services.appmesh.OutlierDetection
import kotlin.Number
import kotlin.Unit

@CdkDslMarker
public class Http2VirtualNodeListenerOptionsDsl {
    private val cdkBuilder: Http2VirtualNodeListenerOptions.Builder =
        Http2VirtualNodeListenerOptions.builder()

    public fun connectionPool(block: Http2ConnectionPoolDsl.() -> Unit = {}) {
        val builder = Http2ConnectionPoolDsl()
        builder.apply(block)
        cdkBuilder.connectionPool(builder.build())
    }

    public fun connectionPool(connectionPool: Http2ConnectionPool) {
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

    public fun timeout(block: HttpTimeoutDsl.() -> Unit = {}) {
        val builder = HttpTimeoutDsl()
        builder.apply(block)
        cdkBuilder.timeout(builder.build())
    }

    public fun timeout(timeout: HttpTimeout) {
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

    public fun build(): Http2VirtualNodeListenerOptions = cdkBuilder.build()
}
