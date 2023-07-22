@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HealthCheck
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions
import software.amazon.awscdk.services.appmesh.OutlierDetection
import software.amazon.awscdk.services.appmesh.TcpConnectionPool
import software.amazon.awscdk.services.appmesh.TcpTimeout
import software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions

@CdkDslMarker
public class TcpVirtualNodeListenerOptionsDsl {
  private val cdkBuilder: TcpVirtualNodeListenerOptions.Builder =
      TcpVirtualNodeListenerOptions.builder()

  /**
   * @param connectionPool Connection pool for http listeners.
   */
  public fun connectionPool(connectionPool: TcpConnectionPoolDsl.() -> Unit = {}) {
    val builder = TcpConnectionPoolDsl()
    builder.apply(connectionPool)
    cdkBuilder.connectionPool(builder.build())
  }

  /**
   * @param connectionPool Connection pool for http listeners.
   */
  public fun connectionPool(connectionPool: TcpConnectionPool) {
    cdkBuilder.connectionPool(connectionPool)
  }

  /**
   * @param healthCheck The health check information for the listener.
   */
  public fun healthCheck(healthCheck: HealthCheck) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * @param outlierDetection Represents the configuration for enabling outlier detection.
   */
  public fun outlierDetection(outlierDetection: OutlierDetectionDsl.() -> Unit = {}) {
    val builder = OutlierDetectionDsl()
    builder.apply(outlierDetection)
    cdkBuilder.outlierDetection(builder.build())
  }

  /**
   * @param outlierDetection Represents the configuration for enabling outlier detection.
   */
  public fun outlierDetection(outlierDetection: OutlierDetection) {
    cdkBuilder.outlierDetection(outlierDetection)
  }

  /**
   * @param port Port to listen for connections on.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param timeout Timeout for TCP protocol.
   */
  public fun timeout(timeout: TcpTimeoutDsl.() -> Unit = {}) {
    val builder = TcpTimeoutDsl()
    builder.apply(timeout)
    cdkBuilder.timeout(builder.build())
  }

  /**
   * @param timeout Timeout for TCP protocol.
   */
  public fun timeout(timeout: TcpTimeout) {
    cdkBuilder.timeout(timeout)
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

  public fun build(): TcpVirtualNodeListenerOptions = cdkBuilder.build()
}
