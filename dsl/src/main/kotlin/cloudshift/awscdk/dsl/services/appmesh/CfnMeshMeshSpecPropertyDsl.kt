@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnMesh

@CdkDslMarker
public class CfnMeshMeshSpecPropertyDsl {
  private val cdkBuilder: CfnMesh.MeshSpecProperty.Builder = CfnMesh.MeshSpecProperty.builder()

  /**
   * @param egressFilter The egress filter rules for the service mesh.
   */
  public fun egressFilter(egressFilter: IResolvable) {
    cdkBuilder.egressFilter(egressFilter)
  }

  /**
   * @param egressFilter The egress filter rules for the service mesh.
   */
  public fun egressFilter(egressFilter: CfnMesh.EgressFilterProperty) {
    cdkBuilder.egressFilter(egressFilter)
  }

  /**
   * @param serviceDiscovery the value to be set.
   */
  public fun serviceDiscovery(serviceDiscovery: IResolvable) {
    cdkBuilder.serviceDiscovery(serviceDiscovery)
  }

  /**
   * @param serviceDiscovery the value to be set.
   */
  public fun serviceDiscovery(serviceDiscovery: CfnMesh.MeshServiceDiscoveryProperty) {
    cdkBuilder.serviceDiscovery(serviceDiscovery)
  }

  public fun build(): CfnMesh.MeshSpecProperty = cdkBuilder.build()
}
