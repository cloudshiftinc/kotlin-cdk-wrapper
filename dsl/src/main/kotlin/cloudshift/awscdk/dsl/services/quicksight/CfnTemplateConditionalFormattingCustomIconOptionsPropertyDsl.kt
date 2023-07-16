@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateConditionalFormattingCustomIconOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.ConditionalFormattingCustomIconOptionsProperty.Builder =
      CfnTemplate.ConditionalFormattingCustomIconOptionsProperty.builder()

  public fun icon(icon: String) {
    cdkBuilder.icon(icon)
  }

  public fun unicodeIcon(unicodeIcon: String) {
    cdkBuilder.unicodeIcon(unicodeIcon)
  }

  public fun build(): CfnTemplate.ConditionalFormattingCustomIconOptionsProperty =
      cdkBuilder.build()
}
