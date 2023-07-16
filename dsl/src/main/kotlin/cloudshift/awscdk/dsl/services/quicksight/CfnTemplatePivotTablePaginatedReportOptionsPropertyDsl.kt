@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotTablePaginatedReportOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotTablePaginatedReportOptionsProperty.Builder =
      CfnTemplate.PivotTablePaginatedReportOptionsProperty.builder()

  public fun overflowColumnHeaderVisibility(overflowColumnHeaderVisibility: String) {
    cdkBuilder.overflowColumnHeaderVisibility(overflowColumnHeaderVisibility)
  }

  public fun verticalOverflowVisibility(verticalOverflowVisibility: String) {
    cdkBuilder.verticalOverflowVisibility(verticalOverflowVisibility)
  }

  public fun build(): CfnTemplate.PivotTablePaginatedReportOptionsProperty = cdkBuilder.build()
}
