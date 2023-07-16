@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotTableSortByPropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotTableSortByProperty.Builder =
      CfnTemplate.PivotTableSortByProperty.builder()

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnTemplate.ColumnSortProperty) {
    cdkBuilder.column(column)
  }

  public fun dataPath(dataPath: IResolvable) {
    cdkBuilder.dataPath(dataPath)
  }

  public fun dataPath(dataPath: CfnTemplate.DataPathSortProperty) {
    cdkBuilder.dataPath(dataPath)
  }

  public fun `field`(`field`: IResolvable) {
    cdkBuilder.`field`(`field`)
  }

  public fun `field`(`field`: CfnTemplate.FieldSortProperty) {
    cdkBuilder.`field`(`field`)
  }

  public fun build(): CfnTemplate.PivotTableSortByProperty = cdkBuilder.build()
}
