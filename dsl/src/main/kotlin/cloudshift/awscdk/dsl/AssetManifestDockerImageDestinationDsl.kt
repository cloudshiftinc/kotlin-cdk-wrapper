@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.AssetManifestDockerImageDestination
import software.amazon.awscdk.RoleOptions

@CdkDslMarker
public class AssetManifestDockerImageDestinationDsl {
  private val cdkBuilder: AssetManifestDockerImageDestination.Builder =
      AssetManifestDockerImageDestination.builder()

  /**
   * @param dockerTagPrefix Prefix to add to the asset hash to make the Docker image tag.
   */
  public fun dockerTagPrefix(dockerTagPrefix: String) {
    cdkBuilder.dockerTagPrefix(dockerTagPrefix)
  }

  /**
   * @param repositoryName Repository name where the docker image asset should be written. 
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  /**
   * @param role Role to use to perform the upload.
   */
  public fun role(role: RoleOptionsDsl.() -> Unit = {}) {
    val builder = RoleOptionsDsl()
    builder.apply(role)
    cdkBuilder.role(builder.build())
  }

  /**
   * @param role Role to use to perform the upload.
   */
  public fun role(role: RoleOptions) {
    cdkBuilder.role(role)
  }

  public fun build(): AssetManifestDockerImageDestination = cdkBuilder.build()
}
