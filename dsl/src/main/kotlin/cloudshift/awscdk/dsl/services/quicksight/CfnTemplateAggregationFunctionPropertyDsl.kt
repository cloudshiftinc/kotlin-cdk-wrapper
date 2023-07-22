@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAggregationFunctionPropertyDsl {
  private val cdkBuilder: CfnTemplate.AggregationFunctionProperty.Builder =
      CfnTemplate.AggregationFunctionProperty.builder()

  /**
   * @param categoricalAggregationFunction Aggregation for categorical values.
   * * `COUNT` : Aggregate by the total number of values, including duplicates.
   * * `DISTINCT_COUNT` : Aggregate by the total number of distinct values.
   */
  public fun categoricalAggregationFunction(categoricalAggregationFunction: String) {
    cdkBuilder.categoricalAggregationFunction(categoricalAggregationFunction)
  }

  /**
   * @param dateAggregationFunction Aggregation for date values.
   * * `COUNT` : Aggregate by the total number of values, including duplicates.
   * * `DISTINCT_COUNT` : Aggregate by the total number of distinct values.
   * * `MIN` : Select the smallest date value.
   * * `MAX` : Select the largest date value.
   */
  public fun dateAggregationFunction(dateAggregationFunction: String) {
    cdkBuilder.dateAggregationFunction(dateAggregationFunction)
  }

  /**
   * @param numericalAggregationFunction Aggregation for numerical values.
   */
  public fun numericalAggregationFunction(numericalAggregationFunction: IResolvable) {
    cdkBuilder.numericalAggregationFunction(numericalAggregationFunction)
  }

  /**
   * @param numericalAggregationFunction Aggregation for numerical values.
   */
  public
      fun numericalAggregationFunction(numericalAggregationFunction: CfnTemplate.NumericalAggregationFunctionProperty) {
    cdkBuilder.numericalAggregationFunction(numericalAggregationFunction)
  }

  public fun build(): CfnTemplate.AggregationFunctionProperty = cdkBuilder.build()
}
