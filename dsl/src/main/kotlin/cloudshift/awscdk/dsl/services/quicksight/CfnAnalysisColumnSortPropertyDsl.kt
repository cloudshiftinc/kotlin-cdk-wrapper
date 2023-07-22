@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The sort configuration for a column that is not used in a field well.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColumnSortProperty columnSortProperty = ColumnSortProperty.builder()
 * .direction("direction")
 * .sortBy(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-columnsort.html)
 */
@CdkDslMarker
public class CfnAnalysisColumnSortPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ColumnSortProperty.Builder =
      CfnAnalysis.ColumnSortProperty.builder()

  /**
   * @param aggregationFunction The aggregation function that is defined in the column sort.
   */
  public fun aggregationFunction(aggregationFunction: IResolvable) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  /**
   * @param aggregationFunction The aggregation function that is defined in the column sort.
   */
  public fun aggregationFunction(aggregationFunction: CfnAnalysis.AggregationFunctionProperty) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  /**
   * @param direction The sort direction. 
   */
  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  /**
   * @param sortBy the value to be set. 
   */
  public fun sortBy(sortBy: IResolvable) {
    cdkBuilder.sortBy(sortBy)
  }

  /**
   * @param sortBy the value to be set. 
   */
  public fun sortBy(sortBy: CfnAnalysis.ColumnIdentifierProperty) {
    cdkBuilder.sortBy(sortBy)
  }

  public fun build(): CfnAnalysis.ColumnSortProperty = cdkBuilder.build()
}
