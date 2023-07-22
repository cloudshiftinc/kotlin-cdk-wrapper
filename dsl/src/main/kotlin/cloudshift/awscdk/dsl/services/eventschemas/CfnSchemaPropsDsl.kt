@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.eventschemas.CfnSchema
import software.amazon.awscdk.services.eventschemas.CfnSchemaProps

@CdkDslMarker
public class CfnSchemaPropsDsl {
  private val cdkBuilder: CfnSchemaProps.Builder = CfnSchemaProps.builder()

  private val _tags: MutableList<CfnSchema.TagsEntryProperty> = mutableListOf()

  /**
   * @param content The source of the schema definition. 
   */
  public fun content(content: String) {
    cdkBuilder.content(content)
  }

  /**
   * @param description A description of the schema.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param registryName The name of the schema registry. 
   */
  public fun registryName(registryName: String) {
    cdkBuilder.registryName(registryName)
  }

  /**
   * @param schemaName The name of the schema.
   */
  public fun schemaName(schemaName: String) {
    cdkBuilder.schemaName(schemaName)
  }

  /**
   * @param tags Tags associated with the schema.
   */
  public fun tags(tags: CfnSchemaTagsEntryPropertyDsl.() -> Unit) {
    _tags.add(CfnSchemaTagsEntryPropertyDsl().apply(tags).build())
  }

  /**
   * @param tags Tags associated with the schema.
   */
  public fun tags(tags: Collection<CfnSchema.TagsEntryProperty>) {
    _tags.addAll(tags)
  }

  /**
   * @param type The type of schema. 
   * Valid types include `OpenApi3` and `JSONSchemaDraft4` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSchemaProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
