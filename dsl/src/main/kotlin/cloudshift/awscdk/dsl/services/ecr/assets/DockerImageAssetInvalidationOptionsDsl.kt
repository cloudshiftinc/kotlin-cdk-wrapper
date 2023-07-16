@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr.assets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions

@CdkDslMarker
public class DockerImageAssetInvalidationOptionsDsl {
  private val cdkBuilder: DockerImageAssetInvalidationOptions.Builder =
      DockerImageAssetInvalidationOptions.builder()

  public fun buildArgs(buildArgs: Boolean) {
    cdkBuilder.buildArgs(buildArgs)
  }

  public fun buildSecrets(buildSecrets: Boolean) {
    cdkBuilder.buildSecrets(buildSecrets)
  }

  public fun extraHash(extraHash: Boolean) {
    cdkBuilder.extraHash(extraHash)
  }

  public fun `file`(`file`: Boolean) {
    cdkBuilder.`file`(`file`)
  }

  public fun networkMode(networkMode: Boolean) {
    cdkBuilder.networkMode(networkMode)
  }

  public fun outputs(outputs: Boolean) {
    cdkBuilder.outputs(outputs)
  }

  public fun platform(platform: Boolean) {
    cdkBuilder.platform(platform)
  }

  public fun repositoryName(repositoryName: Boolean) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun target(target: Boolean) {
    cdkBuilder.target(target)
  }

  public fun build(): DockerImageAssetInvalidationOptions = cdkBuilder.build()
}
