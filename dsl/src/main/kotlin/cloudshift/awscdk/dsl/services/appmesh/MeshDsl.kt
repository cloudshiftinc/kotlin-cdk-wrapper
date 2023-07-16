@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.Mesh
import software.amazon.awscdk.services.appmesh.MeshFilterType
import software.amazon.awscdk.services.appmesh.MeshServiceDiscovery
import software.constructs.Construct

@CdkDslMarker
public class MeshDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Mesh.Builder = Mesh.Builder.create(scope, id)

  public fun egressFilter(egressFilter: MeshFilterType) {
    cdkBuilder.egressFilter(egressFilter)
  }

  public fun meshName(meshName: String) {
    cdkBuilder.meshName(meshName)
  }

  public fun serviceDiscovery(block: MeshServiceDiscoveryDsl.() -> Unit = {}) {
    val builder = MeshServiceDiscoveryDsl()
    builder.apply(block)
    cdkBuilder.serviceDiscovery(builder.build())
  }

  public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery) {
    cdkBuilder.serviceDiscovery(serviceDiscovery)
  }

  public fun build(): Mesh = cdkBuilder.build()
}
