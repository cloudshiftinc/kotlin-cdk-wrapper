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
import software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions
import kotlin.Number
import kotlin.Unit

@CdkDslMarker
public class Http2GatewayListenerOptionsDsl {
    private val cdkBuilder: Http2GatewayListenerOptions.Builder =
        Http2GatewayListenerOptions.builder()

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

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun tls(block: ListenerTlsOptionsDsl.() -> Unit = {}) {
        val builder = ListenerTlsOptionsDsl()
        builder.apply(block)
        cdkBuilder.tls(builder.build())
    }

    public fun tls(tls: ListenerTlsOptions) {
        cdkBuilder.tls(tls)
    }

    public fun build(): Http2GatewayListenerOptions = cdkBuilder.build()
}
