@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * With a `Filter` , you can remove portions of data from a particular visual or view.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterProperty filterProperty = FilterProperty.builder()
 * .categoryFilter(CategoryFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .configuration(CategoryFilterConfigurationProperty.builder()
 * .customFilterConfiguration(CustomFilterConfigurationProperty.builder()
 * .matchOperator("matchOperator")
 * .nullOption("nullOption")
 * // the properties below are optional
 * .categoryValue("categoryValue")
 * .parameterName("parameterName")
 * .selectAllOptions("selectAllOptions")
 * .build())
 * .customFilterListConfiguration(CustomFilterListConfigurationProperty.builder()
 * .matchOperator("matchOperator")
 * .nullOption("nullOption")
 * // the properties below are optional
 * .categoryValues(List.of("categoryValues"))
 * .selectAllOptions("selectAllOptions")
 * .build())
 * .filterListConfiguration(FilterListConfigurationProperty.builder()
 * .matchOperator("matchOperator")
 * // the properties below are optional
 * .categoryValues(List.of("categoryValues"))
 * .nullOption("nullOption")
 * .selectAllOptions("selectAllOptions")
 * .build())
 * .build())
 * .filterId("filterId")
 * .build())
 * .numericEqualityFilter(NumericEqualityFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .filterId("filterId")
 * .matchOperator("matchOperator")
 * .nullOption("nullOption")
 * // the properties below are optional
 * .aggregationFunction(AggregationFunctionProperty.builder()
 * .attributeAggregationFunction(AttributeAggregationFunctionProperty.builder()
 * .simpleAttributeAggregation("simpleAttributeAggregation")
 * .valueForMultipleValues("valueForMultipleValues")
 * .build())
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
 * .build())
 * .numericRangeFilter(NumericRangeFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .filterId("filterId")
 * .nullOption("nullOption")
 * // the properties below are optional
 * .aggregationFunction(AggregationFunctionProperty.builder()
 * .attributeAggregationFunction(AttributeAggregationFunctionProperty.builder()
 * .simpleAttributeAggregation("simpleAttributeAggregation")
 * .valueForMultipleValues("valueForMultipleValues")
 * .build())
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
 * .build())
 * .relativeDatesFilter(RelativeDatesFilterProperty.builder()
 * .anchorDateConfiguration(AnchorDateConfigurationProperty.builder()
 * .anchorOption("anchorOption")
 * .parameterName("parameterName")
 * .build())
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .filterId("filterId")
 * .nullOption("nullOption")
 * .relativeDateType("relativeDateType")
 * .timeGranularity("timeGranularity")
 * // the properties below are optional
 * .excludePeriodConfiguration(ExcludePeriodConfigurationProperty.builder()
 * .amount(123)
 * .granularity("granularity")
 * // the properties below are optional
 * .status("status")
 * .build())
 * .minimumGranularity("minimumGranularity")
 * .parameterName("parameterName")
 * .relativeDateValue(123)
 * .build())
 * .timeEqualityFilter(TimeEqualityFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .filterId("filterId")
 * // the properties below are optional
 * .parameterName("parameterName")
 * .rollingDate(RollingDateConfigurationProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .timeGranularity("timeGranularity")
 * .value("value")
 * .build())
 * .timeRangeFilter(TimeRangeFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .filterId("filterId")
 * .nullOption("nullOption")
 * // the properties below are optional
 * .excludePeriodConfiguration(ExcludePeriodConfigurationProperty.builder()
 * .amount(123)
 * .granularity("granularity")
 * // the properties below are optional
 * .status("status")
 * .build())
 * .includeMaximum(false)
 * .includeMinimum(false)
 * .rangeMaximumValue(TimeRangeFilterValueProperty.builder()
 * .parameter("parameter")
 * .rollingDate(RollingDateConfigurationProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .staticValue("staticValue")
 * .build())
 * .rangeMinimumValue(TimeRangeFilterValueProperty.builder()
 * .parameter("parameter")
 * .rollingDate(RollingDateConfigurationProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .staticValue("staticValue")
 * .build())
 * .timeGranularity("timeGranularity")
 * .build())
 * .topBottomFilter(TopBottomFilterProperty.builder()
 * .aggregationSortConfigurations(List.of(AggregationSortConfigurationProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .sortDirection("sortDirection")
 * // the properties below are optional
 * .aggregationFunction(AggregationFunctionProperty.builder()
 * .attributeAggregationFunction(AttributeAggregationFunctionProperty.builder()
 * .simpleAttributeAggregation("simpleAttributeAggregation")
 * .valueForMultipleValues("valueForMultipleValues")
 * .build())
 * .categoricalAggregationFunction("categoricalAggregationFunction")
 * .dateAggregationFunction("dateAggregationFunction")
 * .numericalAggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .build())
 * .build()))
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .filterId("filterId")
 * // the properties below are optional
 * .limit(123)
 * .parameterName("parameterName")
 * .timeGranularity("timeGranularity")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-filter.html)
 */
@CdkDslMarker
public class CfnDashboardFilterPropertyDsl {
    private val cdkBuilder: CfnDashboard.FilterProperty.Builder =
        CfnDashboard.FilterProperty.builder()

    /**
     * @param categoryFilter A `CategoryFilter` filters text values. For more information, see
     *   [Adding text filters](https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html)
     *   in the *Amazon QuickSight User Guide* .
     */
    public fun categoryFilter(categoryFilter: IResolvable) {
        cdkBuilder.categoryFilter(categoryFilter)
    }

    /**
     * @param categoryFilter A `CategoryFilter` filters text values. For more information, see
     *   [Adding text filters](https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html)
     *   in the *Amazon QuickSight User Guide* .
     */
    public fun categoryFilter(categoryFilter: CfnDashboard.CategoryFilterProperty) {
        cdkBuilder.categoryFilter(categoryFilter)
    }

    /**
     * @param numericEqualityFilter A `NumericEqualityFilter` filters numeric values that equal or
     *   do not equal a given numeric value.
     */
    public fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter)
    }

    /**
     * @param numericEqualityFilter A `NumericEqualityFilter` filters numeric values that equal or
     *   do not equal a given numeric value.
     */
    public fun numericEqualityFilter(
        numericEqualityFilter: CfnDashboard.NumericEqualityFilterProperty
    ) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter)
    }

    /**
     * @param numericRangeFilter A `NumericRangeFilter` filters numeric values that are either
     *   inside or outside a given numeric range.
     */
    public fun numericRangeFilter(numericRangeFilter: IResolvable) {
        cdkBuilder.numericRangeFilter(numericRangeFilter)
    }

    /**
     * @param numericRangeFilter A `NumericRangeFilter` filters numeric values that are either
     *   inside or outside a given numeric range.
     */
    public fun numericRangeFilter(numericRangeFilter: CfnDashboard.NumericRangeFilterProperty) {
        cdkBuilder.numericRangeFilter(numericRangeFilter)
    }

    /**
     * @param relativeDatesFilter A `RelativeDatesFilter` filters date values that are relative to a
     *   given date.
     */
    public fun relativeDatesFilter(relativeDatesFilter: IResolvable) {
        cdkBuilder.relativeDatesFilter(relativeDatesFilter)
    }

    /**
     * @param relativeDatesFilter A `RelativeDatesFilter` filters date values that are relative to a
     *   given date.
     */
    public fun relativeDatesFilter(relativeDatesFilter: CfnDashboard.RelativeDatesFilterProperty) {
        cdkBuilder.relativeDatesFilter(relativeDatesFilter)
    }

    /**
     * @param timeEqualityFilter A `TimeEqualityFilter` filters date-time values that equal or do
     *   not equal a given date/time value.
     */
    public fun timeEqualityFilter(timeEqualityFilter: IResolvable) {
        cdkBuilder.timeEqualityFilter(timeEqualityFilter)
    }

    /**
     * @param timeEqualityFilter A `TimeEqualityFilter` filters date-time values that equal or do
     *   not equal a given date/time value.
     */
    public fun timeEqualityFilter(timeEqualityFilter: CfnDashboard.TimeEqualityFilterProperty) {
        cdkBuilder.timeEqualityFilter(timeEqualityFilter)
    }

    /**
     * @param timeRangeFilter A `TimeRangeFilter` filters date-time values that are either inside or
     *   outside a given date/time range.
     */
    public fun timeRangeFilter(timeRangeFilter: IResolvable) {
        cdkBuilder.timeRangeFilter(timeRangeFilter)
    }

    /**
     * @param timeRangeFilter A `TimeRangeFilter` filters date-time values that are either inside or
     *   outside a given date/time range.
     */
    public fun timeRangeFilter(timeRangeFilter: CfnDashboard.TimeRangeFilterProperty) {
        cdkBuilder.timeRangeFilter(timeRangeFilter)
    }

    /**
     * @param topBottomFilter A `TopBottomFilter` filters data to the top or bottom values for a
     *   given column.
     */
    public fun topBottomFilter(topBottomFilter: IResolvable) {
        cdkBuilder.topBottomFilter(topBottomFilter)
    }

    /**
     * @param topBottomFilter A `TopBottomFilter` filters data to the top or bottom values for a
     *   given column.
     */
    public fun topBottomFilter(topBottomFilter: CfnDashboard.TopBottomFilterProperty) {
        cdkBuilder.topBottomFilter(topBottomFilter)
    }

    public fun build(): CfnDashboard.FilterProperty = cdkBuilder.build()
}
