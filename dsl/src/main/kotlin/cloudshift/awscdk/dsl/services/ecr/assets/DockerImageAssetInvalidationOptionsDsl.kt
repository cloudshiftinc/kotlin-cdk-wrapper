@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr.assets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions

@CdkDslMarker
public class DockerImageAssetInvalidationOptionsDsl {
  private val cdkBuilder: DockerImageAssetInvalidationOptions.Builder =
      DockerImageAssetInvalidationOptions.builder()

  /**
   * @param buildArgs Use `buildArgs` while calculating the asset hash.
   */
  public fun buildArgs(buildArgs: Boolean) {
    cdkBuilder.buildArgs(buildArgs)
  }

  /**
   * @param buildSecrets Use `buildSecrets` while calculating the asset hash.
   */
  public fun buildSecrets(buildSecrets: Boolean) {
    cdkBuilder.buildSecrets(buildSecrets)
  }

  /**
   * @param extraHash Use `extraHash` while calculating the asset hash.
   */
  public fun extraHash(extraHash: Boolean) {
    cdkBuilder.extraHash(extraHash)
  }

  /**
   * @param file Use `file` while calculating the asset hash.
   */
  public fun `file`(`file`: Boolean) {
    cdkBuilder.`file`(`file`)
  }

  /**
   * @param networkMode Use `networkMode` while calculating the asset hash.
   */
  public fun networkMode(networkMode: Boolean) {
    cdkBuilder.networkMode(networkMode)
  }

  /**
   * @param outputs Use `outputs` while calculating the asset hash.
   */
  public fun outputs(outputs: Boolean) {
    cdkBuilder.outputs(outputs)
  }

  /**
   * @param platform Use `platform` while calculating the asset hash.
   */
  public fun platform(platform: Boolean) {
    cdkBuilder.platform(platform)
  }

  /**
   * @param repositoryName Use `repositoryName` while calculating the asset hash.
   */
  public fun repositoryName(repositoryName: Boolean) {
    cdkBuilder.repositoryName(repositoryName)
  }

  /**
   * @param target Use `target` while calculating the asset hash.
   */
  public fun target(target: Boolean) {
    cdkBuilder.target(target)
  }

  public fun build(): DockerImageAssetInvalidationOptions = cdkBuilder.build()
}
