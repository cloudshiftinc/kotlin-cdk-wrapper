@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayPortMappingPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayPortMappingProperty.Builder =
      CfnVirtualGateway.VirtualGatewayPortMappingProperty.builder()

  /**
   * @param port The port used for the port mapping. 
   * Specify one protocol.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The protocol used for the port mapping. 
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayPortMappingProperty = cdkBuilder.build()
}
