@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.GrpcConnectionPool
import software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions
import software.amazon.awscdk.services.appmesh.HealthCheck
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions

@CdkDslMarker
public class GrpcGatewayListenerOptionsDsl {
  private val cdkBuilder: GrpcGatewayListenerOptions.Builder = GrpcGatewayListenerOptions.builder()

  /**
   * @param connectionPool Connection pool for http listeners.
   */
  public fun connectionPool(connectionPool: GrpcConnectionPoolDsl.() -> Unit = {}) {
    val builder = GrpcConnectionPoolDsl()
    builder.apply(connectionPool)
    cdkBuilder.connectionPool(builder.build())
  }

  /**
   * @param connectionPool Connection pool for http listeners.
   */
  public fun connectionPool(connectionPool: GrpcConnectionPool) {
    cdkBuilder.connectionPool(connectionPool)
  }

  /**
   * @param healthCheck The health check information for the listener.
   */
  public fun healthCheck(healthCheck: HealthCheck) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * @param port Port to listen for connections on.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param tls Represents the configuration for enabling TLS on a listener.
   */
  public fun tls(tls: ListenerTlsOptionsDsl.() -> Unit = {}) {
    val builder = ListenerTlsOptionsDsl()
    builder.apply(tls)
    cdkBuilder.tls(builder.build())
  }

  /**
   * @param tls Represents the configuration for enabling TLS on a listener.
   */
  public fun tls(tls: ListenerTlsOptions) {
    cdkBuilder.tls(tls)
  }

  public fun build(): GrpcGatewayListenerOptions = cdkBuilder.build()
}
