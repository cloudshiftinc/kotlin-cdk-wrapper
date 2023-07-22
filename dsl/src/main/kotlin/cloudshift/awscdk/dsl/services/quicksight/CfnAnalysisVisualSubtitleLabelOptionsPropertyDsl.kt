@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisVisualSubtitleLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.VisualSubtitleLabelOptionsProperty.Builder =
      CfnAnalysis.VisualSubtitleLabelOptionsProperty.builder()

  /**
   * @param formatText The long text format of the subtitle label, such as plain text or rich text.
   */
  public fun formatText(formatText: IResolvable) {
    cdkBuilder.formatText(formatText)
  }

  /**
   * @param formatText The long text format of the subtitle label, such as plain text or rich text.
   */
  public fun formatText(formatText: CfnAnalysis.LongFormatTextProperty) {
    cdkBuilder.formatText(formatText)
  }

  /**
   * @param visibility The visibility of the subtitle label.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.VisualSubtitleLabelOptionsProperty = cdkBuilder.build()
}
