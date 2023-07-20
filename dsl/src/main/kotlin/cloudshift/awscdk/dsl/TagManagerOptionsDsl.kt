@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.TagManagerOptions

@CdkDslMarker
public class TagManagerOptionsDsl {
  private val cdkBuilder: TagManagerOptions.Builder = TagManagerOptions.builder()

  public fun tagPropertyName(tagPropertyName: String) {
    cdkBuilder.tagPropertyName(tagPropertyName)
  }

  public fun build(): TagManagerOptions = cdkBuilder.build()
}
