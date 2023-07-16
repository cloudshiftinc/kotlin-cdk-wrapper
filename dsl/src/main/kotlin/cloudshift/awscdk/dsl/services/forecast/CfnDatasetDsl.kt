@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.forecast

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.forecast.CfnDataset
import software.constructs.Construct

@CdkDslMarker
public class CfnDatasetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataset.Builder = CfnDataset.Builder.create(scope, id)

  private val _tags: MutableList<CfnDataset.TagsItemsProperty> = mutableListOf()

  public fun dataFrequency(dataFrequency: String) {
    cdkBuilder.dataFrequency(dataFrequency)
  }

  public fun datasetName(datasetName: String) {
    cdkBuilder.datasetName(datasetName)
  }

  public fun datasetType(datasetType: String) {
    cdkBuilder.datasetType(datasetType)
  }

  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  public fun encryptionConfig(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.encryptionConfig(builder.map)
  }

  public fun encryptionConfig(encryptionConfig: Any) {
    cdkBuilder.encryptionConfig(encryptionConfig)
  }

  public fun schema(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.schema(builder.map)
  }

  public fun schema(schema: Any) {
    cdkBuilder.schema(schema)
  }

  public fun tags(tags: CfnDatasetTagsItemsPropertyDsl.() -> Unit) {
    _tags.add(CfnDatasetTagsItemsPropertyDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnDataset.TagsItemsProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDataset {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
