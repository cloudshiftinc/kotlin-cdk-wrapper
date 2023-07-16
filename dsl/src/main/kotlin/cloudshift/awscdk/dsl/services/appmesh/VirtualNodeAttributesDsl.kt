@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualNodeAttributes

@CdkDslMarker
public class VirtualNodeAttributesDsl {
  private val cdkBuilder: VirtualNodeAttributes.Builder = VirtualNodeAttributes.builder()

  public fun mesh(mesh: IMesh) {
    cdkBuilder.mesh(mesh)
  }

  public fun virtualNodeName(virtualNodeName: String) {
    cdkBuilder.virtualNodeName(virtualNodeName)
  }

  public fun build(): VirtualNodeAttributes = cdkBuilder.build()
}
