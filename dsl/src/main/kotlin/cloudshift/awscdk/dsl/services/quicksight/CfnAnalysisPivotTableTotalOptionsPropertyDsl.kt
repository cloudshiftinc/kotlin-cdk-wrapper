@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableTotalOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableTotalOptionsProperty.Builder =
      CfnAnalysis.PivotTableTotalOptionsProperty.builder()

  public fun columnSubtotalOptions(columnSubtotalOptions: IResolvable) {
    cdkBuilder.columnSubtotalOptions(columnSubtotalOptions)
  }

  public fun columnSubtotalOptions(columnSubtotalOptions: CfnAnalysis.SubtotalOptionsProperty) {
    cdkBuilder.columnSubtotalOptions(columnSubtotalOptions)
  }

  public fun columnTotalOptions(columnTotalOptions: IResolvable) {
    cdkBuilder.columnTotalOptions(columnTotalOptions)
  }

  public fun columnTotalOptions(columnTotalOptions: CfnAnalysis.PivotTotalOptionsProperty) {
    cdkBuilder.columnTotalOptions(columnTotalOptions)
  }

  public fun rowSubtotalOptions(rowSubtotalOptions: IResolvable) {
    cdkBuilder.rowSubtotalOptions(rowSubtotalOptions)
  }

  public fun rowSubtotalOptions(rowSubtotalOptions: CfnAnalysis.SubtotalOptionsProperty) {
    cdkBuilder.rowSubtotalOptions(rowSubtotalOptions)
  }

  public fun rowTotalOptions(rowTotalOptions: IResolvable) {
    cdkBuilder.rowTotalOptions(rowTotalOptions)
  }

  public fun rowTotalOptions(rowTotalOptions: CfnAnalysis.PivotTotalOptionsProperty) {
    cdkBuilder.rowTotalOptions(rowTotalOptions)
  }

  public fun build(): CfnAnalysis.PivotTableTotalOptionsProperty = cdkBuilder.build()
}
