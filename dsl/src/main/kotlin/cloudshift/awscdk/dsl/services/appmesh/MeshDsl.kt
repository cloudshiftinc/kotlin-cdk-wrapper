@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.Mesh
import software.amazon.awscdk.services.appmesh.MeshFilterType
import software.amazon.awscdk.services.appmesh.MeshServiceDiscovery
import software.constructs.Construct

/**
 * Define a new AppMesh mesh.
 *
 * Example:
 *
 * ```
 * // This is the ARN for the mesh from different AWS IAM account ID.
 * // Ensure mesh is properly shared with your account. For more details, see:
 * https://github.com/aws/aws-cdk/issues/15404
 * String arn = "arn:aws:appmesh:us-east-1:123456789012:mesh/testMesh";
 * IMesh sharedMesh = Mesh.fromMeshArn(this, "imported-mesh", arn);
 * // This VirtualNode resource can communicate with the resources in the mesh from different AWS
 * IAM account ID.
 * // This VirtualNode resource can communicate with the resources in the mesh from different AWS
 * IAM account ID.
 * VirtualNode.Builder.create(this, "test-node")
 * .mesh(sharedMesh)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/meshes.html)
 */
@CdkDslMarker
public class MeshDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Mesh.Builder = Mesh.Builder.create(scope, id)

  /**
   * Egress filter to be applied to the Mesh.
   *
   * Default: DROP_ALL
   *
   * @param egressFilter Egress filter to be applied to the Mesh. 
   */
  public fun egressFilter(egressFilter: MeshFilterType) {
    cdkBuilder.egressFilter(egressFilter)
  }

  /**
   * The name of the Mesh being defined.
   *
   * Default: - A name is automatically generated
   *
   * @param meshName The name of the Mesh being defined. 
   */
  public fun meshName(meshName: String) {
    cdkBuilder.meshName(meshName)
  }

  /**
   * Defines how upstream clients will discover VirtualNodes in the Mesh.
   *
   * Default: - No Service Discovery
   *
   * @param serviceDiscovery Defines how upstream clients will discover VirtualNodes in the Mesh. 
   */
  public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscoveryDsl.() -> Unit = {}) {
    val builder = MeshServiceDiscoveryDsl()
    builder.apply(serviceDiscovery)
    cdkBuilder.serviceDiscovery(builder.build())
  }

  /**
   * Defines how upstream clients will discover VirtualNodes in the Mesh.
   *
   * Default: - No Service Discovery
   *
   * @param serviceDiscovery Defines how upstream clients will discover VirtualNodes in the Mesh. 
   */
  public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery) {
    cdkBuilder.serviceDiscovery(serviceDiscovery)
  }

  public fun build(): Mesh = cdkBuilder.build()
}
