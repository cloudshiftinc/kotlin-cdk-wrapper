@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSheetTextBoxPropertyDsl {
  private val cdkBuilder: CfnDashboard.SheetTextBoxProperty.Builder =
      CfnDashboard.SheetTextBoxProperty.builder()

  /**
   * @param content The content that is displayed in the text box.
   */
  public fun content(content: String) {
    cdkBuilder.content(content)
  }

  /**
   * @param sheetTextBoxId The unique identifier for a text box. 
   * This identifier must be unique within the context of a dashboard, template, or analysis. Two
   * dashboards, analyses, or templates can have text boxes that share identifiers.
   */
  public fun sheetTextBoxId(sheetTextBoxId: String) {
    cdkBuilder.sheetTextBoxId(sheetTextBoxId)
  }

  public fun build(): CfnDashboard.SheetTextBoxProperty = cdkBuilder.build()
}
