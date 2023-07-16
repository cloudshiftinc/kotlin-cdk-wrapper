@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateNumericRangeFilterPropertyDsl {
  private val cdkBuilder: CfnTemplate.NumericRangeFilterProperty.Builder =
      CfnTemplate.NumericRangeFilterProperty.builder()

  public fun aggregationFunction(aggregationFunction: IResolvable) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun aggregationFunction(aggregationFunction: CfnTemplate.AggregationFunctionProperty) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
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

  public fun rangeMaximum(rangeMaximum: CfnTemplate.NumericRangeFilterValueProperty) {
    cdkBuilder.rangeMaximum(rangeMaximum)
  }

  public fun rangeMinimum(rangeMinimum: IResolvable) {
    cdkBuilder.rangeMinimum(rangeMinimum)
  }

  public fun rangeMinimum(rangeMinimum: CfnTemplate.NumericRangeFilterValueProperty) {
    cdkBuilder.rangeMinimum(rangeMinimum)
  }

  public fun selectAllOptions(selectAllOptions: String) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  public fun build(): CfnTemplate.NumericRangeFilterProperty = cdkBuilder.build()
}
