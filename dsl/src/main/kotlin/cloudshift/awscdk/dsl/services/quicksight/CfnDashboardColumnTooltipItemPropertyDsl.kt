@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardColumnTooltipItemPropertyDsl {
  private val cdkBuilder: CfnDashboard.ColumnTooltipItemProperty.Builder =
      CfnDashboard.ColumnTooltipItemProperty.builder()

  /**
   * @param aggregation The aggregation function of the column tooltip item.
   */
  public fun aggregation(aggregation: IResolvable) {
    cdkBuilder.aggregation(aggregation)
  }

  /**
   * @param aggregation The aggregation function of the column tooltip item.
   */
  public fun aggregation(aggregation: CfnDashboard.AggregationFunctionProperty) {
    cdkBuilder.aggregation(aggregation)
  }

  /**
   * @param column The target column of the tooltip item. 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The target column of the tooltip item. 
   */
  public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param label The label of the tooltip item.
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  /**
   * @param visibility The visibility of the tooltip item.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.ColumnTooltipItemProperty = cdkBuilder.build()
}
