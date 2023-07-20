@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSchema
import software.amazon.awscdk.services.glue.CfnSchemaProps

@CdkDslMarker
public class CfnSchemaPropsDsl {
  private val cdkBuilder: CfnSchemaProps.Builder = CfnSchemaProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun checkpointVersion(checkpointVersion: IResolvable) {
    cdkBuilder.checkpointVersion(checkpointVersion)
  }

  public fun checkpointVersion(checkpointVersion: CfnSchema.SchemaVersionProperty) {
    cdkBuilder.checkpointVersion(checkpointVersion)
  }

  public fun compatibility(compatibility: String) {
    cdkBuilder.compatibility(compatibility)
  }

  public fun dataFormat(dataFormat: String) {
    cdkBuilder.dataFormat(dataFormat)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun registry(registry: IResolvable) {
    cdkBuilder.registry(registry)
  }

  public fun registry(registry: CfnSchema.RegistryProperty) {
    cdkBuilder.registry(registry)
  }

  public fun schemaDefinition(schemaDefinition: String) {
    cdkBuilder.schemaDefinition(schemaDefinition)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSchemaProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
