@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The subtitle label options for a visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * VisualSubtitleLabelOptionsProperty visualSubtitleLabelOptionsProperty =
 * VisualSubtitleLabelOptionsProperty.builder()
 * .formatText(LongFormatTextProperty.builder()
 * .plainText("plainText")
 * .richText("richText")
 * .build())
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-visualsubtitlelabeloptions.html)
 */
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
