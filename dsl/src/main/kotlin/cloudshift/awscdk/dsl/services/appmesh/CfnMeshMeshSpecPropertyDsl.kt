@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnMesh

/**
 * An object that represents the specification of a service mesh.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * MeshSpecProperty meshSpecProperty = MeshSpecProperty.builder()
 * .egressFilter(EgressFilterProperty.builder()
 * .type("type")
 * .build())
 * .serviceDiscovery(MeshServiceDiscoveryProperty.builder()
 * .ipPreference("ipPreference")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-meshspec.html)
 */
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
