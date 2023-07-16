@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisSheetPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SheetProperty.Builder = CfnAnalysis.SheetProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun sheetId(sheetId: String) {
    cdkBuilder.sheetId(sheetId)
  }

  public fun build(): CfnAnalysis.SheetProperty = cdkBuilder.build()
}
