@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions

@CdkDslMarker
public class TagUpdateConstraintOptionsDsl {
  private val cdkBuilder: TagUpdateConstraintOptions.Builder = TagUpdateConstraintOptions.builder()

  public fun allow(allow: Boolean) {
    cdkBuilder.allow(allow)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun messageLanguage(messageLanguage: MessageLanguage) {
    cdkBuilder.messageLanguage(messageLanguage)
  }

  public fun build(): TagUpdateConstraintOptions = cdkBuilder.build()
}
