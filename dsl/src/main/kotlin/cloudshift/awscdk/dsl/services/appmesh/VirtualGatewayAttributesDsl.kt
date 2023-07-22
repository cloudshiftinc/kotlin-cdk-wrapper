@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes

@CdkDslMarker
public class VirtualGatewayAttributesDsl {
  private val cdkBuilder: VirtualGatewayAttributes.Builder = VirtualGatewayAttributes.builder()

  /**
   * @param mesh The Mesh that the VirtualGateway belongs to. 
   */
  public fun mesh(mesh: IMesh) {
    cdkBuilder.mesh(mesh)
  }

  /**
   * @param virtualGatewayName The name of the VirtualGateway. 
   */
  public fun virtualGatewayName(virtualGatewayName: String) {
    cdkBuilder.virtualGatewayName(virtualGatewayName)
  }

  public fun build(): VirtualGatewayAttributes = cdkBuilder.build()
}
