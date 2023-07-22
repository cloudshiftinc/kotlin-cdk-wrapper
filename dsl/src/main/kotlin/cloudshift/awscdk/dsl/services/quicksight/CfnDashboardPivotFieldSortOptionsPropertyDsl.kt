@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPivotFieldSortOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.PivotFieldSortOptionsProperty.Builder =
      CfnDashboard.PivotFieldSortOptionsProperty.builder()

  /**
   * @param fieldId The field ID for the field sort options. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param sortBy The sort by field for the field sort options. 
   */
  public fun sortBy(sortBy: IResolvable) {
    cdkBuilder.sortBy(sortBy)
  }

  /**
   * @param sortBy The sort by field for the field sort options. 
   */
  public fun sortBy(sortBy: CfnDashboard.PivotTableSortByProperty) {
    cdkBuilder.sortBy(sortBy)
  }

  public fun build(): CfnDashboard.PivotFieldSortOptionsProperty = cdkBuilder.build()
}
