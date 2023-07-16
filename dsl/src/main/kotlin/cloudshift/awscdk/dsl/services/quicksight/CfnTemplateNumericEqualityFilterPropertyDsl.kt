@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateNumericEqualityFilterPropertyDsl {
  private val cdkBuilder: CfnTemplate.NumericEqualityFilterProperty.Builder =
      CfnTemplate.NumericEqualityFilterProperty.builder()

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

  public fun matchOperator(matchOperator: String) {
    cdkBuilder.matchOperator(matchOperator)
  }

  public fun nullOption(nullOption: String) {
    cdkBuilder.nullOption(nullOption)
  }

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun selectAllOptions(selectAllOptions: String) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTemplate.NumericEqualityFilterProperty = cdkBuilder.build()
}
