@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.eventschemas.CfnRegistry
import software.amazon.awscdk.services.eventschemas.CfnRegistryProps

@CdkDslMarker
public class CfnRegistryPropsDsl {
  private val cdkBuilder: CfnRegistryProps.Builder = CfnRegistryProps.builder()

  private val _tags: MutableList<CfnRegistry.TagsEntryProperty> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun registryName(registryName: String) {
    cdkBuilder.registryName(registryName)
  }

  public fun tags(tags: CfnRegistryTagsEntryPropertyDsl.() -> Unit) {
    _tags.add(CfnRegistryTagsEntryPropertyDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnRegistry.TagsEntryProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnRegistryProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
