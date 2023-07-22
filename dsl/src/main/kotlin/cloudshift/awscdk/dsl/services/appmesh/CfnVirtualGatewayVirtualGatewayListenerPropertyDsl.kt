@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayListenerPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayListenerProperty.Builder =
      CfnVirtualGateway.VirtualGatewayListenerProperty.builder()

  /**
   * @param connectionPool The connection pool information for the listener.
   */
  public fun connectionPool(connectionPool: IResolvable) {
    cdkBuilder.connectionPool(connectionPool)
  }

  /**
   * @param connectionPool The connection pool information for the listener.
   */
  public
      fun connectionPool(connectionPool: CfnVirtualGateway.VirtualGatewayConnectionPoolProperty) {
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
  public fun healthCheck(healthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty) {
    cdkBuilder.healthCheck(healthCheck)
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
  public fun portMapping(portMapping: CfnVirtualGateway.VirtualGatewayPortMappingProperty) {
    cdkBuilder.portMapping(portMapping)
  }

  /**
   * @param tls A reference to an object that represents the Transport Layer Security (TLS)
   * properties for the listener.
   */
  public fun tls(tls: IResolvable) {
    cdkBuilder.tls(tls)
  }

  /**
   * @param tls A reference to an object that represents the Transport Layer Security (TLS)
   * properties for the listener.
   */
  public fun tls(tls: CfnVirtualGateway.VirtualGatewayListenerTlsProperty) {
    cdkBuilder.tls(tls)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayListenerProperty = cdkBuilder.build()
}
