@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualServiceAttributes

@CdkDslMarker
public class VirtualServiceAttributesDsl {
  private val cdkBuilder: VirtualServiceAttributes.Builder = VirtualServiceAttributes.builder()

  /**
   * @param mesh The Mesh which the VirtualService belongs to. 
   */
  public fun mesh(mesh: IMesh) {
    cdkBuilder.mesh(mesh)
  }

  /**
   * @param virtualServiceName The name of the VirtualService, it is recommended this follows the
   * fully-qualified domain name format. 
   */
  public fun virtualServiceName(virtualServiceName: String) {
    cdkBuilder.virtualServiceName(virtualServiceName)
  }

  public fun build(): VirtualServiceAttributes = cdkBuilder.build()
}
