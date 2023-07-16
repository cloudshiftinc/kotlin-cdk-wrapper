@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.eventschemas.CfnSchema
import software.constructs.Construct

@CdkDslMarker
public class CfnSchemaDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSchema.Builder = CfnSchema.Builder.create(scope, id)

  private val _tags: MutableList<CfnSchema.TagsEntryProperty> = mutableListOf()

  public fun content(content: String) {
    cdkBuilder.content(content)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun registryName(registryName: String) {
    cdkBuilder.registryName(registryName)
  }

  public fun schemaName(schemaName: String) {
    cdkBuilder.schemaName(schemaName)
  }

  public fun tags(tags: CfnSchemaTagsEntryPropertyDsl.() -> Unit) {
    _tags.add(CfnSchemaTagsEntryPropertyDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnSchema.TagsEntryProperty>) {
    _tags.addAll(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSchema {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
