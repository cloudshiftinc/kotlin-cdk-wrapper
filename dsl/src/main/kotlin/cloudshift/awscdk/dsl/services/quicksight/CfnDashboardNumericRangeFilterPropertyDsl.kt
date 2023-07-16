@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardNumericRangeFilterPropertyDsl {
  private val cdkBuilder: CfnDashboard.NumericRangeFilterProperty.Builder =
      CfnDashboard.NumericRangeFilterProperty.builder()

  public fun aggregationFunction(aggregationFunction: IResolvable) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun aggregationFunction(aggregationFunction: CfnDashboard.AggregationFunctionProperty) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun filterId(filterId: String) {
    cdkBuilder.filterId(filterId)
  }

  public fun includeMaximum(includeMaximum: Boolean) {
    cdkBuilder.includeMaximum(includeMaximum)
  }

  public fun includeMaximum(includeMaximum: IResolvable) {
    cdkBuilder.includeMaximum(includeMaximum)
  }

  public fun includeMinimum(includeMinimum: Boolean) {
    cdkBuilder.includeMinimum(includeMinimum)
  }

  public fun includeMinimum(includeMinimum: IResolvable) {
    cdkBuilder.includeMinimum(includeMinimum)
  }

  public fun nullOption(nullOption: String) {
    cdkBuilder.nullOption(nullOption)
  }

  public fun rangeMaximum(rangeMaximum: IResolvable) {
    cdkBuilder.rangeMaximum(rangeMaximum)
  }

  public fun rangeMaximum(rangeMaximum: CfnDashboard.NumericRangeFilterValueProperty) {
    cdkBuilder.rangeMaximum(rangeMaximum)
  }

  public fun rangeMinimum(rangeMinimum: IResolvable) {
    cdkBuilder.rangeMinimum(rangeMinimum)
  }

  public fun rangeMinimum(rangeMinimum: CfnDashboard.NumericRangeFilterValueProperty) {
    cdkBuilder.rangeMinimum(rangeMinimum)
  }

  public fun selectAllOptions(selectAllOptions: String) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  public fun build(): CfnDashboard.NumericRangeFilterProperty = cdkBuilder.build()
}
