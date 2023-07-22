@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * A grouping of individual filters. Filter groups are applied to the same group of visuals.
 *
 * For more information, see [Adding filter conditions (group filters) with AND and OR
 * operators](https://docs.aws.amazon.com/quicksight/latest/user/add-a-compound-filter.html) in the
 * *Amazon QuickSight User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterGroupProperty filterGroupProperty = FilterGroupProperty.builder()
 * .crossDataset("crossDataset")
 * .filterGroupId("filterGroupId")
 * .filters(List.of(FilterProperty.builder()
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
 * .build()))
 * .scopeConfiguration(FilterScopeConfigurationProperty.builder()
 * .selectedSheets(SelectedSheetsFilterScopeConfigurationProperty.builder()
 * .sheetVisualScopingConfigurations(List.of(SheetVisualScopingConfigurationProperty.builder()
 * .scope("scope")
 * .sheetId("sheetId")
 * // the properties below are optional
 * .visualIds(List.of("visualIds"))
 * .build()))
 * .build())
 * .build())
 * // the properties below are optional
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-filtergroup.html)
 */
@CdkDslMarker
public class CfnDashboardFilterGroupPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilterGroupProperty.Builder =
      CfnDashboard.FilterGroupProperty.builder()

  private val _filters: MutableList<Any> = mutableListOf()

  /**
   * @param crossDataset The filter new feature which can apply filter group to all data sets.
   * Choose one of the following options:. 
   * * `ALL_DATASETS`
   * * `SINGLE_DATASET`
   */
  public fun crossDataset(crossDataset: String) {
    cdkBuilder.crossDataset(crossDataset)
  }

  /**
   * @param filterGroupId The value that uniquely identifies a `FilterGroup` within a dashboard,
   * template, or analysis. 
   */
  public fun filterGroupId(filterGroupId: String) {
    cdkBuilder.filterGroupId(filterGroupId)
  }

  /**
   * @param filters The list of filters that are present in a `FilterGroup` . 
   */
  public fun filters(vararg filters: Any) {
    _filters.addAll(listOf(*filters))
  }

  /**
   * @param filters The list of filters that are present in a `FilterGroup` . 
   */
  public fun filters(filters: Collection<Any>) {
    _filters.addAll(filters)
  }

  /**
   * @param filters The list of filters that are present in a `FilterGroup` . 
   */
  public fun filters(filters: IResolvable) {
    cdkBuilder.filters(filters)
  }

  /**
   * @param scopeConfiguration The configuration that specifies what scope to apply to a
   * `FilterGroup` . 
   * This is a union type structure. For this structure to be valid, only one of the attributes can
   * be defined.
   */
  public fun scopeConfiguration(scopeConfiguration: IResolvable) {
    cdkBuilder.scopeConfiguration(scopeConfiguration)
  }

  /**
   * @param scopeConfiguration The configuration that specifies what scope to apply to a
   * `FilterGroup` . 
   * This is a union type structure. For this structure to be valid, only one of the attributes can
   * be defined.
   */
  public fun scopeConfiguration(scopeConfiguration: CfnDashboard.FilterScopeConfigurationProperty) {
    cdkBuilder.scopeConfiguration(scopeConfiguration)
  }

  /**
   * @param status The status of the `FilterGroup` .
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnDashboard.FilterGroupProperty {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
