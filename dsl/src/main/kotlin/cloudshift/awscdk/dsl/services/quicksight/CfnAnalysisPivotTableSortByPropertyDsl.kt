@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableSortByPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableSortByProperty.Builder =
      CfnAnalysis.PivotTableSortByProperty.builder()

  /**
   * @param column The column sort (field id, direction) for the pivot table sort by options.
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column sort (field id, direction) for the pivot table sort by options.
   */
  public fun column(column: CfnAnalysis.ColumnSortProperty) {
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
  public fun dataPath(dataPath: CfnAnalysis.DataPathSortProperty) {
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
  public fun `field`(`field`: CfnAnalysis.FieldSortProperty) {
    cdkBuilder.`field`(`field`)
  }

  public fun build(): CfnAnalysis.PivotTableSortByProperty = cdkBuilder.build()
}
