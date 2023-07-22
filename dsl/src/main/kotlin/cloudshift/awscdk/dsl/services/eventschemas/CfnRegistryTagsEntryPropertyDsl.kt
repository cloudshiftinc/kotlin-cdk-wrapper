@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eventschemas.CfnRegistry

@CdkDslMarker
public class CfnRegistryTagsEntryPropertyDsl {
  private val cdkBuilder: CfnRegistry.TagsEntryProperty.Builder =
      CfnRegistry.TagsEntryProperty.builder()

  /**
   * @param key They key of a key-value pair. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value They value of a key-value pair. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnRegistry.TagsEntryProperty = cdkBuilder.build()
}
