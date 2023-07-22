@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.IpPreference
import software.amazon.awscdk.services.appmesh.MeshServiceDiscovery

@CdkDslMarker
public class MeshServiceDiscoveryDsl {
  private val cdkBuilder: MeshServiceDiscovery.Builder = MeshServiceDiscovery.builder()

  /**
   * @param ipPreference IP preference applied to all Virtual Nodes in the Mesh.
   */
  public fun ipPreference(ipPreference: IpPreference) {
    cdkBuilder.ipPreference(ipPreference)
  }

  public fun build(): MeshServiceDiscovery = cdkBuilder.build()
}
