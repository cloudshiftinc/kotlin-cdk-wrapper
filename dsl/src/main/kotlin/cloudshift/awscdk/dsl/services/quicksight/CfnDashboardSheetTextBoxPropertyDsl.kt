@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSheetTextBoxPropertyDsl {
  private val cdkBuilder: CfnDashboard.SheetTextBoxProperty.Builder =
      CfnDashboard.SheetTextBoxProperty.builder()

  public fun content(content: String) {
    cdkBuilder.content(content)
  }

  public fun sheetTextBoxId(sheetTextBoxId: String) {
    cdkBuilder.sheetTextBoxId(sheetTextBoxId)
  }

  public fun build(): CfnDashboard.SheetTextBoxProperty = cdkBuilder.build()
}
