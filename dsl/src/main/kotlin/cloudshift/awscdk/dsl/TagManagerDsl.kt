@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import software.amazon.awscdk.TagManager
import software.amazon.awscdk.TagType

@CdkDslMarker
public class TagManagerDsl(
  tagType: TagType,
  resourceTypeName: String,
  initialTags: Any,
) {
  private val cdkBuilder: TagManager.Builder = TagManager.Builder.create(tagType, resourceTypeName,
      initialTags)

  public fun tagPropertyName(tagPropertyName: String) {
    cdkBuilder.tagPropertyName(tagPropertyName)
  }

  public fun build(): TagManager = cdkBuilder.build()
}
