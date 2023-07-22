@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualRouterAttributes

@CdkDslMarker
public class VirtualRouterAttributesDsl {
  private val cdkBuilder: VirtualRouterAttributes.Builder = VirtualRouterAttributes.builder()

  /**
   * @param mesh The Mesh which the VirtualRouter belongs to. 
   */
  public fun mesh(mesh: IMesh) {
    cdkBuilder.mesh(mesh)
  }

  /**
   * @param virtualRouterName The name of the VirtualRouter. 
   */
  public fun virtualRouterName(virtualRouterName: String) {
    cdkBuilder.virtualRouterName(virtualRouterName)
  }

  public fun build(): VirtualRouterAttributes = cdkBuilder.build()
}
