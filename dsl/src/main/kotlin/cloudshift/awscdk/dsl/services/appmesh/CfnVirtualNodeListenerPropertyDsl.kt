@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeListenerPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ListenerProperty.Builder =
      CfnVirtualNode.ListenerProperty.builder()

  /**
   * @param connectionPool The connection pool information for the listener.
   */
  public fun connectionPool(connectionPool: IResolvable) {
    cdkBuilder.connectionPool(connectionPool)
  }

  /**
   * @param connectionPool The connection pool information for the listener.
   */
  public fun connectionPool(connectionPool: CfnVirtualNode.VirtualNodeConnectionPoolProperty) {
    cdkBuilder.connectionPool(connectionPool)
  }

  /**
   * @param healthCheck The health check information for the listener.
   */
  public fun healthCheck(healthCheck: IResolvable) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * @param healthCheck The health check information for the listener.
   */
  public fun healthCheck(healthCheck: CfnVirtualNode.HealthCheckProperty) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * @param outlierDetection The outlier detection information for the listener.
   */
  public fun outlierDetection(outlierDetection: IResolvable) {
    cdkBuilder.outlierDetection(outlierDetection)
  }

  /**
   * @param outlierDetection The outlier detection information for the listener.
   */
  public fun outlierDetection(outlierDetection: CfnVirtualNode.OutlierDetectionProperty) {
    cdkBuilder.outlierDetection(outlierDetection)
  }

  /**
   * @param portMapping The port mapping information for the listener. 
   */
  public fun portMapping(portMapping: IResolvable) {
    cdkBuilder.portMapping(portMapping)
  }

  /**
   * @param portMapping The port mapping information for the listener. 
   */
  public fun portMapping(portMapping: CfnVirtualNode.PortMappingProperty) {
    cdkBuilder.portMapping(portMapping)
  }

  /**
   * @param timeout An object that represents timeouts for different protocols.
   */
  public fun timeout(timeout: IResolvable) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * @param timeout An object that represents timeouts for different protocols.
   */
  public fun timeout(timeout: CfnVirtualNode.ListenerTimeoutProperty) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * @param tls A reference to an object that represents the Transport Layer Security (TLS)
   * properties for a listener.
   */
  public fun tls(tls: IResolvable) {
    cdkBuilder.tls(tls)
  }

  /**
   * @param tls A reference to an object that represents the Transport Layer Security (TLS)
   * properties for a listener.
   */
  public fun tls(tls: CfnVirtualNode.ListenerTlsProperty) {
    cdkBuilder.tls(tls)
  }

  public fun build(): CfnVirtualNode.ListenerProperty = cdkBuilder.build()
}
