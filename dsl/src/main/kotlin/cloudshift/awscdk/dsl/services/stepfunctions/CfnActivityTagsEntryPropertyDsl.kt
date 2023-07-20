@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnActivity

@CdkDslMarker
public class CfnActivityTagsEntryPropertyDsl {
  private val cdkBuilder: CfnActivity.TagsEntryProperty.Builder =
      CfnActivity.TagsEntryProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnActivity.TagsEntryProperty = cdkBuilder.build()
}
