@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnActivity

/**
 * The `TagsEntry` property specifies *tags* to identify an activity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-tagsentry.html)
 */
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
