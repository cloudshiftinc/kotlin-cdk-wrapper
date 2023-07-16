@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPivotTableTotalOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.PivotTableTotalOptionsProperty.Builder =
      CfnDashboard.PivotTableTotalOptionsProperty.builder()

  public fun columnSubtotalOptions(columnSubtotalOptions: IResolvable) {
    cdkBuilder.columnSubtotalOptions(columnSubtotalOptions)
  }

  public fun columnSubtotalOptions(columnSubtotalOptions: CfnDashboard.SubtotalOptionsProperty) {
    cdkBuilder.columnSubtotalOptions(columnSubtotalOptions)
  }

  public fun columnTotalOptions(columnTotalOptions: IResolvable) {
    cdkBuilder.columnTotalOptions(columnTotalOptions)
  }

  public fun columnTotalOptions(columnTotalOptions: CfnDashboard.PivotTotalOptionsProperty) {
    cdkBuilder.columnTotalOptions(columnTotalOptions)
  }

  public fun rowSubtotalOptions(rowSubtotalOptions: IResolvable) {
    cdkBuilder.rowSubtotalOptions(rowSubtotalOptions)
  }

  public fun rowSubtotalOptions(rowSubtotalOptions: CfnDashboard.SubtotalOptionsProperty) {
    cdkBuilder.rowSubtotalOptions(rowSubtotalOptions)
  }

  public fun rowTotalOptions(rowTotalOptions: IResolvable) {
    cdkBuilder.rowTotalOptions(rowTotalOptions)
  }

  public fun rowTotalOptions(rowTotalOptions: CfnDashboard.PivotTotalOptionsProperty) {
    cdkBuilder.rowTotalOptions(rowTotalOptions)
  }

  public fun build(): CfnDashboard.PivotTableTotalOptionsProperty = cdkBuilder.build()
}
