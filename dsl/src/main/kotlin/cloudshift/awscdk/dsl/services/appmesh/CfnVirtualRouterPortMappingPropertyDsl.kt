@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter

@CdkDslMarker
public class CfnVirtualRouterPortMappingPropertyDsl {
  private val cdkBuilder: CfnVirtualRouter.PortMappingProperty.Builder =
      CfnVirtualRouter.PortMappingProperty.builder()

  /**
   * @param port The port used for the port mapping. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The protocol used for the port mapping. 
   * Specify one protocol.
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnVirtualRouter.PortMappingProperty = cdkBuilder.build()
}
