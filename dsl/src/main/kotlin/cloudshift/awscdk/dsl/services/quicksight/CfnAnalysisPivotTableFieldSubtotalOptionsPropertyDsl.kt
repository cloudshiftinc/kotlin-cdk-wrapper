@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableFieldSubtotalOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableFieldSubtotalOptionsProperty.Builder =
      CfnAnalysis.PivotTableFieldSubtotalOptionsProperty.builder()

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnAnalysis.PivotTableFieldSubtotalOptionsProperty = cdkBuilder.build()
}
