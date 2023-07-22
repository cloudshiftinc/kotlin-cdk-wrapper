@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPivotTableSortByPropertyDsl {
  private val cdkBuilder: CfnDashboard.PivotTableSortByProperty.Builder =
      CfnDashboard.PivotTableSortByProperty.builder()

  /**
   * @param column The column sort (field id, direction) for the pivot table sort by options.
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column sort (field id, direction) for the pivot table sort by options.
   */
  public fun column(column: CfnDashboard.ColumnSortProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param dataPath The data path sort (data path value, direction) for the pivot table sort by
   * options.
   */
  public fun dataPath(dataPath: IResolvable) {
    cdkBuilder.dataPath(dataPath)
  }

  /**
   * @param dataPath The data path sort (data path value, direction) for the pivot table sort by
   * options.
   */
  public fun dataPath(dataPath: CfnDashboard.DataPathSortProperty) {
    cdkBuilder.dataPath(dataPath)
  }

  /**
   * @param field The field sort (field id, direction) for the pivot table sort by options.
   */
  public fun `field`(`field`: IResolvable) {
    cdkBuilder.`field`(`field`)
  }

  /**
   * @param field The field sort (field id, direction) for the pivot table sort by options.
   */
  public fun `field`(`field`: CfnDashboard.FieldSortProperty) {
    cdkBuilder.`field`(`field`)
  }

  public fun build(): CfnDashboard.PivotTableSortByProperty = cdkBuilder.build()
}
