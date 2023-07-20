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
import software.amazon.awscdk.services.appmesh.HttpConnectionPool
import software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions
import kotlin.Number
import kotlin.Unit

@CdkDslMarker
public class HttpGatewayListenerOptionsDsl {
    private val cdkBuilder: HttpGatewayListenerOptions.Builder = HttpGatewayListenerOptions.builder()

    public fun connectionPool(block: HttpConnectionPoolDsl.() -> Unit = {}) {
        val builder = HttpConnectionPoolDsl()
        builder.apply(block)
        cdkBuilder.connectionPool(builder.build())
    }

    public fun connectionPool(connectionPool: HttpConnectionPool) {
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

    public fun build(): HttpGatewayListenerOptions = cdkBuilder.build()
}
