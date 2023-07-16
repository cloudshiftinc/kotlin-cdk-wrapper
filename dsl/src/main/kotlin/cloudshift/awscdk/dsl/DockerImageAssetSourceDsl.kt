@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.DockerCacheOption
import software.amazon.awscdk.DockerImageAssetSource

@CdkDslMarker
public class DockerImageAssetSourceDsl {
  private val cdkBuilder: DockerImageAssetSource.Builder = DockerImageAssetSource.builder()

  private val _dockerCacheFrom: MutableList<DockerCacheOption> = mutableListOf()

  private val _dockerOutputs: MutableList<String> = mutableListOf()

  private val _executable: MutableList<String> = mutableListOf()

  public fun assetName(assetName: String) {
    cdkBuilder.assetName(assetName)
  }

  public fun directoryName(directoryName: String) {
    cdkBuilder.directoryName(directoryName)
  }

  public fun dockerBuildArgs(dockerBuildArgs: Map<String, String>) {
    cdkBuilder.dockerBuildArgs(dockerBuildArgs)
  }

  public fun dockerBuildSecrets(dockerBuildSecrets: Map<String, String>) {
    cdkBuilder.dockerBuildSecrets(dockerBuildSecrets)
  }

  public fun dockerBuildTarget(dockerBuildTarget: String) {
    cdkBuilder.dockerBuildTarget(dockerBuildTarget)
  }

  public fun dockerCacheFrom(dockerCacheFrom: DockerCacheOptionDsl.() -> Unit) {
    _dockerCacheFrom.add(DockerCacheOptionDsl().apply(dockerCacheFrom).build())
  }

  public fun dockerCacheFrom(dockerCacheFrom: Collection<DockerCacheOption>) {
    _dockerCacheFrom.addAll(dockerCacheFrom)
  }

  public fun dockerCacheTo(block: DockerCacheOptionDsl.() -> Unit = {}) {
    val builder = DockerCacheOptionDsl()
    builder.apply(block)
    cdkBuilder.dockerCacheTo(builder.build())
  }

  public fun dockerCacheTo(dockerCacheTo: DockerCacheOption) {
    cdkBuilder.dockerCacheTo(dockerCacheTo)
  }

  public fun dockerFile(dockerFile: String) {
    cdkBuilder.dockerFile(dockerFile)
  }

  public fun dockerOutputs(vararg dockerOutputs: String) {
    _dockerOutputs.addAll(listOf(*dockerOutputs))
  }

  public fun dockerOutputs(dockerOutputs: Collection<String>) {
    _dockerOutputs.addAll(dockerOutputs)
  }

  public fun executable(vararg executable: String) {
    _executable.addAll(listOf(*executable))
  }

  public fun executable(executable: Collection<String>) {
    _executable.addAll(executable)
  }

  public fun networkMode(networkMode: String) {
    cdkBuilder.networkMode(networkMode)
  }

  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
  }

  public fun sourceHash(sourceHash: String) {
    cdkBuilder.sourceHash(sourceHash)
  }

  public fun build(): DockerImageAssetSource {
    if(_dockerCacheFrom.isNotEmpty()) cdkBuilder.dockerCacheFrom(_dockerCacheFrom)
    if(_dockerOutputs.isNotEmpty()) cdkBuilder.dockerOutputs(_dockerOutputs)
    if(_executable.isNotEmpty()) cdkBuilder.executable(_executable)
    return cdkBuilder.build()
  }
}
