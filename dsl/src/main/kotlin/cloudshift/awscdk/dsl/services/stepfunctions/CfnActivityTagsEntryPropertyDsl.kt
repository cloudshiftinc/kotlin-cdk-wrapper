@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnActivity

@CdkDslMarker
public class CfnActivityTagsEntryPropertyDsl {
  private val cdkBuilder: CfnActivity.TagsEntryProperty.Builder =
      CfnActivity.TagsEntryProperty.builder()

  /**
   * @param key The `key` for a key-value pair in a tag entry. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The `value` for a key-value pair in a tag entry. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnActivity.TagsEntryProperty = cdkBuilder.build()
}
