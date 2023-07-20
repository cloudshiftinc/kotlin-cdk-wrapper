@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.cloudassembly.schema.TagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry
import software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry
import software.amazon.awscdk.cloudassembly.schema.Tag
import software.amazon.awscdk.cxapi.MetadataEntryResult

@CdkDslMarker
public class MetadataEntryResultDsl {
  private val cdkBuilder: MetadataEntryResult.Builder = MetadataEntryResult.builder()

  private val _data: MutableList<Tag> = mutableListOf()

  private val _trace: MutableList<String> = mutableListOf()

  public fun `data`(`data`: String) {
    cdkBuilder.`data`(`data`)
  }

  public fun `data`(`data`: TagDsl.() -> Unit) {
    _data.add(TagDsl().apply(`data`).build())
  }

  public fun `data`(`data`: Collection<Tag>) {
    _data.addAll(`data`)
  }

  public fun `data`(`data`: ContainerImageAssetMetadataEntry) {
    cdkBuilder.`data`(`data`)
  }

  public fun `data`(`data`: FileAssetMetadataEntry) {
    cdkBuilder.`data`(`data`)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun trace(vararg trace: String) {
    _trace.addAll(listOf(*trace))
  }

  public fun trace(trace: Collection<String>) {
    _trace.addAll(trace)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): MetadataEntryResult {
    if(_data.isNotEmpty()) cdkBuilder.`data`(_data)
    if(_trace.isNotEmpty()) cdkBuilder.trace(_trace)
    return cdkBuilder.build()
  }
}
