@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisSheetPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SheetProperty.Builder = CfnAnalysis.SheetProperty.builder()

  /**
   * @param name The name of a sheet.
   * This name is displayed on the sheet's tab in the Amazon QuickSight console.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param sheetId The unique identifier associated with a sheet.
   */
  public fun sheetId(sheetId: String) {
    cdkBuilder.sheetId(sheetId)
  }

  public fun build(): CfnAnalysis.SheetProperty = cdkBuilder.build()
}
