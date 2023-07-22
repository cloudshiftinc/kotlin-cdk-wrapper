@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardVisualTitleLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.VisualTitleLabelOptionsProperty.Builder =
      CfnDashboard.VisualTitleLabelOptionsProperty.builder()

  /**
   * @param formatText The short text format of the title label, such as plain text or rich text.
   */
  public fun formatText(formatText: IResolvable) {
    cdkBuilder.formatText(formatText)
  }

  /**
   * @param formatText The short text format of the title label, such as plain text or rich text.
   */
  public fun formatText(formatText: CfnDashboard.ShortFormatTextProperty) {
    cdkBuilder.formatText(formatText)
  }

  /**
   * @param visibility The visibility of the title label.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.VisualTitleLabelOptionsProperty = cdkBuilder.build()
}
