@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableSortByPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableSortByProperty.Builder =
      CfnAnalysis.PivotTableSortByProperty.builder()

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnAnalysis.ColumnSortProperty) {
    cdkBuilder.column(column)
  }

  public fun dataPath(dataPath: IResolvable) {
    cdkBuilder.dataPath(dataPath)
  }

  public fun dataPath(dataPath: CfnAnalysis.DataPathSortProperty) {
    cdkBuilder.dataPath(dataPath)
  }

  public fun `field`(`field`: IResolvable) {
    cdkBuilder.`field`(`field`)
  }

  public fun `field`(`field`: CfnAnalysis.FieldSortProperty) {
    cdkBuilder.`field`(`field`)
  }

  public fun build(): CfnAnalysis.PivotTableSortByProperty = cdkBuilder.build()
}
