@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnMesh

@CdkDslMarker
public class CfnMeshMeshServiceDiscoveryPropertyDsl {
  private val cdkBuilder: CfnMesh.MeshServiceDiscoveryProperty.Builder =
      CfnMesh.MeshServiceDiscoveryProperty.builder()

  /**
   * @param ipPreference The IP version to use to control traffic within the mesh.
   */
  public fun ipPreference(ipPreference: String) {
    cdkBuilder.ipPreference(ipPreference)
  }

  public fun build(): CfnMesh.MeshServiceDiscoveryProperty = cdkBuilder.build()
}
