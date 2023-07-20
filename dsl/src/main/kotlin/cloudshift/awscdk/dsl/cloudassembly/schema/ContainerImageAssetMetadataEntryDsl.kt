@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry

@CdkDslMarker
public class ContainerImageAssetMetadataEntryDsl {
  private val cdkBuilder: ContainerImageAssetMetadataEntry.Builder =
      ContainerImageAssetMetadataEntry.builder()

  private val _cacheFrom: MutableList<ContainerImageAssetCacheOption> = mutableListOf()

  private val _outputs: MutableList<String> = mutableListOf()

  public fun buildArgs(buildArgs: Map<String, String>) {
    cdkBuilder.buildArgs(buildArgs)
  }

  public fun buildSecrets(buildSecrets: Map<String, String>) {
    cdkBuilder.buildSecrets(buildSecrets)
  }

  public fun cacheFrom(cacheFrom: ContainerImageAssetCacheOptionDsl.() -> Unit) {
    _cacheFrom.add(ContainerImageAssetCacheOptionDsl().apply(cacheFrom).build())
  }

  public fun cacheFrom(cacheFrom: Collection<ContainerImageAssetCacheOption>) {
    _cacheFrom.addAll(cacheFrom)
  }

  public fun cacheTo(block: ContainerImageAssetCacheOptionDsl.() -> Unit = {}) {
    val builder = ContainerImageAssetCacheOptionDsl()
    builder.apply(block)
    cdkBuilder.cacheTo(builder.build())
  }

  public fun cacheTo(cacheTo: ContainerImageAssetCacheOption) {
    cdkBuilder.cacheTo(cacheTo)
  }

  public fun `file`(`file`: String) {
    cdkBuilder.`file`(`file`)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun imageTag(imageTag: String) {
    cdkBuilder.imageTag(imageTag)
  }

  public fun networkMode(networkMode: String) {
    cdkBuilder.networkMode(networkMode)
  }

  public fun outputs(vararg outputs: String) {
    _outputs.addAll(listOf(*outputs))
  }

  public fun outputs(outputs: Collection<String>) {
    _outputs.addAll(outputs)
  }

  public fun packaging(packaging: String) {
    cdkBuilder.packaging(packaging)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
  }

  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun sourceHash(sourceHash: String) {
    cdkBuilder.sourceHash(sourceHash)
  }

  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun build(): ContainerImageAssetMetadataEntry {
    if(_cacheFrom.isNotEmpty()) cdkBuilder.cacheFrom(_cacheFrom)
    if(_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
    return cdkBuilder.build()
  }
}
