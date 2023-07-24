@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Boolean
import kotlin.String

/**
 * A `NumericRangeFilter` filters values that are within the value range.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NumericRangeFilterProperty numericRangeFilterProperty = NumericRangeFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .filterId("filterId")
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
 * .includeMaximum(false)
 * .includeMinimum(false)
 * .rangeMaximum(NumericRangeFilterValueProperty.builder()
 * .parameter("parameter")
 * .staticValue(123)
 * .build())
 * .rangeMinimum(NumericRangeFilterValueProperty.builder()
 * .parameter("parameter")
 * .staticValue(123)
 * .build())
 * .selectAllOptions("selectAllOptions")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-numericrangefilter.html)
 */
@CdkDslMarker
public class CfnAnalysisNumericRangeFilterPropertyDsl {
    private val cdkBuilder: CfnAnalysis.NumericRangeFilterProperty.Builder =
        CfnAnalysis.NumericRangeFilterProperty.builder()

    /**
     * @param aggregationFunction The aggregation function of the filter.
     */
    public fun aggregationFunction(aggregationFunction: IResolvable) {
        cdkBuilder.aggregationFunction(aggregationFunction)
    }

    /**
     * @param aggregationFunction The aggregation function of the filter.
     */
    public fun aggregationFunction(aggregationFunction: CfnAnalysis.AggregationFunctionProperty) {
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
    public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
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
     * @param includeMaximum Determines whether the maximum value in the filter value range should be
     * included in the filtered results.
     */
    public fun includeMaximum(includeMaximum: Boolean) {
        cdkBuilder.includeMaximum(includeMaximum)
    }

    /**
     * @param includeMaximum Determines whether the maximum value in the filter value range should be
     * included in the filtered results.
     */
    public fun includeMaximum(includeMaximum: IResolvable) {
        cdkBuilder.includeMaximum(includeMaximum)
    }

    /**
     * @param includeMinimum Determines whether the minimum value in the filter value range should be
     * included in the filtered results.
     */
    public fun includeMinimum(includeMinimum: Boolean) {
        cdkBuilder.includeMinimum(includeMinimum)
    }

    /**
     * @param includeMinimum Determines whether the minimum value in the filter value range should be
     * included in the filtered results.
     */
    public fun includeMinimum(includeMinimum: IResolvable) {
        cdkBuilder.includeMinimum(includeMinimum)
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
     * @param rangeMaximum The maximum value for the filter value range.
     */
    public fun rangeMaximum(rangeMaximum: IResolvable) {
        cdkBuilder.rangeMaximum(rangeMaximum)
    }

    /**
     * @param rangeMaximum The maximum value for the filter value range.
     */
    public fun rangeMaximum(rangeMaximum: CfnAnalysis.NumericRangeFilterValueProperty) {
        cdkBuilder.rangeMaximum(rangeMaximum)
    }

    /**
     * @param rangeMinimum The minimum value for the filter value range.
     */
    public fun rangeMinimum(rangeMinimum: IResolvable) {
        cdkBuilder.rangeMinimum(rangeMinimum)
    }

    /**
     * @param rangeMinimum The minimum value for the filter value range.
     */
    public fun rangeMinimum(rangeMinimum: CfnAnalysis.NumericRangeFilterValueProperty) {
        cdkBuilder.rangeMinimum(rangeMinimum)
    }

    /**
     * @param selectAllOptions Select all of the values. Null is not the assigned value of select all.
     * * `FILTER_ALL_VALUES`
     */
    public fun selectAllOptions(selectAllOptions: String) {
        cdkBuilder.selectAllOptions(selectAllOptions)
    }

    public fun build(): CfnAnalysis.NumericRangeFilterProperty = cdkBuilder.build()
}
