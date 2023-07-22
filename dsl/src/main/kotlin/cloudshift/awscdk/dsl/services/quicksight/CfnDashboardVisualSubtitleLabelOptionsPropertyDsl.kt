@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardVisualSubtitleLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.VisualSubtitleLabelOptionsProperty.Builder =
      CfnDashboard.VisualSubtitleLabelOptionsProperty.builder()

  /**
   * @param formatText The long text format of the subtitle label, such as plain text or rich text.
   */
  public fun formatText(formatText: IResolvable) {
    cdkBuilder.formatText(formatText)
  }

  /**
   * @param formatText The long text format of the subtitle label, such as plain text or rich text.
   */
  public fun formatText(formatText: CfnDashboard.LongFormatTextProperty) {
    cdkBuilder.formatText(formatText)
  }

  /**
   * @param visibility The visibility of the subtitle label.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.VisualSubtitleLabelOptionsProperty = cdkBuilder.build()
}
