@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPivotTableSortByPropertyDsl {
  private val cdkBuilder: CfnDashboard.PivotTableSortByProperty.Builder =
      CfnDashboard.PivotTableSortByProperty.builder()

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnDashboard.ColumnSortProperty) {
    cdkBuilder.column(column)
  }

  public fun dataPath(dataPath: IResolvable) {
    cdkBuilder.dataPath(dataPath)
  }

  public fun dataPath(dataPath: CfnDashboard.DataPathSortProperty) {
    cdkBuilder.dataPath(dataPath)
  }

  public fun `field`(`field`: IResolvable) {
    cdkBuilder.`field`(`field`)
  }

  public fun `field`(`field`: CfnDashboard.FieldSortProperty) {
    cdkBuilder.`field`(`field`)
  }

  public fun build(): CfnDashboard.PivotTableSortByProperty = cdkBuilder.build()
}
