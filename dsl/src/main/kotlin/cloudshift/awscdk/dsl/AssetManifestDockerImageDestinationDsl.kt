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

  public fun dockerTagPrefix(dockerTagPrefix: String) {
    cdkBuilder.dockerTagPrefix(dockerTagPrefix)
  }

  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun role(block: RoleOptionsDsl.() -> Unit = {}) {
    val builder = RoleOptionsDsl()
    builder.apply(block)
    cdkBuilder.role(builder.build())
  }

  public fun role(role: RoleOptions) {
    cdkBuilder.role(role)
  }

  public fun build(): AssetManifestDockerImageDestination = cdkBuilder.build()
}
