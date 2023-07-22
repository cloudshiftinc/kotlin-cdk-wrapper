@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotTableSortByPropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotTableSortByProperty.Builder =
      CfnTemplate.PivotTableSortByProperty.builder()

  /**
   * @param column The column sort (field id, direction) for the pivot table sort by options.
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column sort (field id, direction) for the pivot table sort by options.
   */
  public fun column(column: CfnTemplate.ColumnSortProperty) {
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
  public fun dataPath(dataPath: CfnTemplate.DataPathSortProperty) {
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
  public fun `field`(`field`: CfnTemplate.FieldSortProperty) {
    cdkBuilder.`field`(`field`)
  }

  public fun build(): CfnTemplate.PivotTableSortByProperty = cdkBuilder.build()
}
