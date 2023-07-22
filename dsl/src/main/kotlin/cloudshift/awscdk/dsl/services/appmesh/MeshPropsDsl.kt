@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.MeshFilterType
import software.amazon.awscdk.services.appmesh.MeshProps
import software.amazon.awscdk.services.appmesh.MeshServiceDiscovery

@CdkDslMarker
public class MeshPropsDsl {
  private val cdkBuilder: MeshProps.Builder = MeshProps.builder()

  /**
   * @param egressFilter Egress filter to be applied to the Mesh.
   */
  public fun egressFilter(egressFilter: MeshFilterType) {
    cdkBuilder.egressFilter(egressFilter)
  }

  /**
   * @param meshName The name of the Mesh being defined.
   */
  public fun meshName(meshName: String) {
    cdkBuilder.meshName(meshName)
  }

  /**
   * @param serviceDiscovery Defines how upstream clients will discover VirtualNodes in the Mesh.
   */
  public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscoveryDsl.() -> Unit = {}) {
    val builder = MeshServiceDiscoveryDsl()
    builder.apply(serviceDiscovery)
    cdkBuilder.serviceDiscovery(builder.build())
  }

  /**
   * @param serviceDiscovery Defines how upstream clients will discover VirtualNodes in the Mesh.
   */
  public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery) {
    cdkBuilder.serviceDiscovery(serviceDiscovery)
  }

  public fun build(): MeshProps = cdkBuilder.build()
}
