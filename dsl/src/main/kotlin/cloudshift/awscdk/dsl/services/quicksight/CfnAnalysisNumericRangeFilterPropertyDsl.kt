@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisNumericRangeFilterPropertyDsl {
  private val cdkBuilder: CfnAnalysis.NumericRangeFilterProperty.Builder =
      CfnAnalysis.NumericRangeFilterProperty.builder()

  public fun aggregationFunction(aggregationFunction: IResolvable) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun aggregationFunction(aggregationFunction: CfnAnalysis.AggregationFunctionProperty) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
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

  public fun rangeMaximum(rangeMaximum: CfnAnalysis.NumericRangeFilterValueProperty) {
    cdkBuilder.rangeMaximum(rangeMaximum)
  }

  public fun rangeMinimum(rangeMinimum: IResolvable) {
    cdkBuilder.rangeMinimum(rangeMinimum)
  }

  public fun rangeMinimum(rangeMinimum: CfnAnalysis.NumericRangeFilterValueProperty) {
    cdkBuilder.rangeMinimum(rangeMinimum)
  }

  public fun selectAllOptions(selectAllOptions: String) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  public fun build(): CfnAnalysis.NumericRangeFilterProperty = cdkBuilder.build()
}
