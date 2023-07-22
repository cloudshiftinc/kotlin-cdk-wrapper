@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisConditionalFormattingCustomIconOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ConditionalFormattingCustomIconOptionsProperty.Builder =
      CfnAnalysis.ConditionalFormattingCustomIconOptionsProperty.builder()

  /**
   * @param icon Determines the type of icon.
   */
  public fun icon(icon: String) {
    cdkBuilder.icon(icon)
  }

  /**
   * @param unicodeIcon Determines the Unicode icon type.
   */
  public fun unicodeIcon(unicodeIcon: String) {
    cdkBuilder.unicodeIcon(unicodeIcon)
  }

  public fun build(): CfnAnalysis.ConditionalFormattingCustomIconOptionsProperty =
      cdkBuilder.build()
}
