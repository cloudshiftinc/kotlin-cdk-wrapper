@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HealthCheck
import software.amazon.awscdk.services.appmesh.Http2ConnectionPool
import software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions
import software.amazon.awscdk.services.appmesh.HttpTimeout
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions
import software.amazon.awscdk.services.appmesh.OutlierDetection

@CdkDslMarker
public class Http2VirtualNodeListenerOptionsDsl {
  private val cdkBuilder: Http2VirtualNodeListenerOptions.Builder =
      Http2VirtualNodeListenerOptions.builder()

  /**
   * @param connectionPool Connection pool for http2 listeners.
   */
  public fun connectionPool(connectionPool: Http2ConnectionPoolDsl.() -> Unit = {}) {
    val builder = Http2ConnectionPoolDsl()
    builder.apply(connectionPool)
    cdkBuilder.connectionPool(builder.build())
  }

  /**
   * @param connectionPool Connection pool for http2 listeners.
   */
  public fun connectionPool(connectionPool: Http2ConnectionPool) {
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
   * @param timeout Timeout for HTTP protocol.
   */
  public fun timeout(timeout: HttpTimeoutDsl.() -> Unit = {}) {
    val builder = HttpTimeoutDsl()
    builder.apply(timeout)
    cdkBuilder.timeout(builder.build())
  }

  /**
   * @param timeout Timeout for HTTP protocol.
   */
  public fun timeout(timeout: HttpTimeout) {
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

  public fun build(): Http2VirtualNodeListenerOptions = cdkBuilder.build()
}
