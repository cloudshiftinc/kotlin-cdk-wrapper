@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * A `NumericEqualityFilter` filters values that are equal to the specified value.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NumericEqualityFilterProperty numericEqualityFilterProperty =
 * NumericEqualityFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .filterId("filterId")
 * .matchOperator("matchOperator")
 * .nullOption("nullOption")
 * // the properties below are optional
 * .aggregationFunction(AggregationFunctionProperty.builder()
 * .categoricalAggregationFunction("categoricalAggregationFunction")
 * .dateAggregationFunction("dateAggregationFunction")
 * .numericalAggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .build())
 * .parameterName("parameterName")
 * .selectAllOptions("selectAllOptions")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-numericequalityfilter.html)
 */
@CdkDslMarker
public class CfnTemplateNumericEqualityFilterPropertyDsl {
  private val cdkBuilder: CfnTemplate.NumericEqualityFilterProperty.Builder =
      CfnTemplate.NumericEqualityFilterProperty.builder()

  /**
   * @param aggregationFunction The aggregation function of the filter.
   */
  public fun aggregationFunction(aggregationFunction: IResolvable) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  /**
   * @param aggregationFunction The aggregation function of the filter.
   */
  public fun aggregationFunction(aggregationFunction: CfnTemplate.AggregationFunctionProperty) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  /**
   * @param column The column that the filter is applied to. 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that the filter is applied to. 
   */
  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param filterId An identifier that uniquely identifies a filter within a dashboard, analysis,
   * or template. 
   */
  public fun filterId(filterId: String) {
    cdkBuilder.filterId(filterId)
  }

  /**
   * @param matchOperator The match operator that is used to determine if a filter should be
   * applied. 
   */
  public fun matchOperator(matchOperator: String) {
    cdkBuilder.matchOperator(matchOperator)
  }

  /**
   * @param nullOption This option determines how null values should be treated when filtering data.
   * 
   * * `ALL_VALUES` : Include null values in filtered results.
   * * `NULLS_ONLY` : Only include null values in filtered results.
   * * `NON_NULLS_ONLY` : Exclude null values from filtered results.
   */
  public fun nullOption(nullOption: String) {
    cdkBuilder.nullOption(nullOption)
  }

  /**
   * @param parameterName The parameter whose value should be used for the filter value.
   */
  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  /**
   * @param selectAllOptions Select all of the values. Null is not the assigned value of select all.
   * * `FILTER_ALL_VALUES`
   */
  public fun selectAllOptions(selectAllOptions: String) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  /**
   * @param value The input value.
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTemplate.NumericEqualityFilterProperty = cdkBuilder.build()
}
