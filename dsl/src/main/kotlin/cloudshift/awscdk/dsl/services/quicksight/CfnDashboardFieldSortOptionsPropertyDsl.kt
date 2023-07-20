@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFieldSortOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.FieldSortOptionsProperty.Builder =
      CfnDashboard.FieldSortOptionsProperty.builder()

  public fun columnSort(columnSort: IResolvable) {
    cdkBuilder.columnSort(columnSort)
  }

  public fun columnSort(columnSort: CfnDashboard.ColumnSortProperty) {
    cdkBuilder.columnSort(columnSort)
  }

  public fun fieldSort(fieldSort: IResolvable) {
    cdkBuilder.fieldSort(fieldSort)
  }

  public fun fieldSort(fieldSort: CfnDashboard.FieldSortProperty) {
    cdkBuilder.fieldSort(fieldSort)
  }

  public fun build(): CfnDashboard.FieldSortOptionsProperty = cdkBuilder.build()
}
