@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import software.amazon.awscdk.TagManager
import software.amazon.awscdk.TagType

@CdkDslMarker
public class TagManagerDsl(
  arg0: TagType,
  arg1: String,
  arg2: Any,
) {
  private val cdkBuilder: TagManager.Builder = TagManager.Builder.create(arg0, arg1, arg2)

  public fun tagPropertyName(tagPropertyName: String) {
    cdkBuilder.tagPropertyName(tagPropertyName)
  }

  public fun build(): TagManager = cdkBuilder.build()
}
