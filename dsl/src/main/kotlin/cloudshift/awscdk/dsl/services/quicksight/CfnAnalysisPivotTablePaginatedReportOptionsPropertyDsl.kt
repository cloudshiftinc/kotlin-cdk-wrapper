@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTablePaginatedReportOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTablePaginatedReportOptionsProperty.Builder =
      CfnAnalysis.PivotTablePaginatedReportOptionsProperty.builder()

  public fun overflowColumnHeaderVisibility(overflowColumnHeaderVisibility: String) {
    cdkBuilder.overflowColumnHeaderVisibility(overflowColumnHeaderVisibility)
  }

  public fun verticalOverflowVisibility(verticalOverflowVisibility: String) {
    cdkBuilder.verticalOverflowVisibility(verticalOverflowVisibility)
  }

  public fun build(): CfnAnalysis.PivotTablePaginatedReportOptionsProperty = cdkBuilder.build()
}
