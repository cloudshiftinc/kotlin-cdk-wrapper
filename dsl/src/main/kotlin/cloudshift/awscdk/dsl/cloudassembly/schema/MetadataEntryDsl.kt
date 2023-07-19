@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry
import software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry
import software.amazon.awscdk.cloudassembly.schema.MetadataEntry
import software.amazon.awscdk.cloudassembly.schema.Tag

@CdkDslMarker
public class MetadataEntryDsl {
  private val cdkBuilder: MetadataEntry.Builder = MetadataEntry.builder()

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

  public fun trace(vararg trace: String) {
    _trace.addAll(listOf(*trace))
  }

  public fun trace(trace: Collection<String>) {
    _trace.addAll(trace)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): MetadataEntry {
    if(_data.isNotEmpty()) cdkBuilder.`data`(_data)
    if(_trace.isNotEmpty()) cdkBuilder.trace(_trace)
    return cdkBuilder.build()
  }
}
