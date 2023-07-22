@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration options to sort aggregated values.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AggregationSortConfigurationProperty aggregationSortConfigurationProperty =
 * AggregationSortConfigurationProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .sortDirection("sortDirection")
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-aggregationsortconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateAggregationSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.AggregationSortConfigurationProperty.Builder =
      CfnTemplate.AggregationSortConfigurationProperty.builder()

  /**
   * @param aggregationFunction The function that aggregates the values in `Column` .
   */
  public fun aggregationFunction(aggregationFunction: IResolvable) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  /**
   * @param aggregationFunction The function that aggregates the values in `Column` .
   */
  public fun aggregationFunction(aggregationFunction: CfnTemplate.AggregationFunctionProperty) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  /**
   * @param column The column that determines the sort order of aggregated values. 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that determines the sort order of aggregated values. 
   */
  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param sortDirection The sort direction of values. 
   * * `ASC` : Sort in ascending order.
   * * `DESC` : Sort in descending order.
   */
  public fun sortDirection(sortDirection: String) {
    cdkBuilder.sortDirection(sortDirection)
  }

  public fun build(): CfnTemplate.AggregationSortConfigurationProperty = cdkBuilder.build()
}
