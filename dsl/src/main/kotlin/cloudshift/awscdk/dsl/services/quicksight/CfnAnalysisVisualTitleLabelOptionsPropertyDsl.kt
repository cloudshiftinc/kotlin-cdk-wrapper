@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisVisualTitleLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.VisualTitleLabelOptionsProperty.Builder =
      CfnAnalysis.VisualTitleLabelOptionsProperty.builder()

  /**
   * @param formatText The short text format of the title label, such as plain text or rich text.
   */
  public fun formatText(formatText: IResolvable) {
    cdkBuilder.formatText(formatText)
  }

  /**
   * @param formatText The short text format of the title label, such as plain text or rich text.
   */
  public fun formatText(formatText: CfnAnalysis.ShortFormatTextProperty) {
    cdkBuilder.formatText(formatText)
  }

  /**
   * @param visibility The visibility of the title label.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.VisualTitleLabelOptionsProperty = cdkBuilder.build()
}
