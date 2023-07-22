@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardAxisLabelReferenceOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.AxisLabelReferenceOptionsProperty.Builder =
      CfnDashboard.AxisLabelReferenceOptionsProperty.builder()

  /**
   * @param column The column that the axis label is targeted to. 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that the axis label is targeted to. 
   */
  public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param fieldId The field that the axis label is targeted to. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnDashboard.AxisLabelReferenceOptionsProperty = cdkBuilder.build()
}
