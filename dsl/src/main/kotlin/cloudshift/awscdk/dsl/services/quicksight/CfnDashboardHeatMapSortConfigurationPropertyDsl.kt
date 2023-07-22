@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The sort configuration of a heat map.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * HeatMapSortConfigurationProperty heatMapSortConfigurationProperty =
 * HeatMapSortConfigurationProperty.builder()
 * .heatMapColumnItemsLimitConfiguration(ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build())
 * .heatMapColumnSort(List.of(FieldSortOptionsProperty.builder()
 * .columnSort(ColumnSortProperty.builder()
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
 * .build())
 * .fieldSort(FieldSortProperty.builder()
 * .direction("direction")
 * .fieldId("fieldId")
 * .build())
 * .build()))
 * .heatMapRowItemsLimitConfiguration(ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build())
 * .heatMapRowSort(List.of(FieldSortOptionsProperty.builder()
 * .columnSort(ColumnSortProperty.builder()
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
 * .build())
 * .fieldSort(FieldSortProperty.builder()
 * .direction("direction")
 * .fieldId("fieldId")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-heatmapsortconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardHeatMapSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.HeatMapSortConfigurationProperty.Builder =
      CfnDashboard.HeatMapSortConfigurationProperty.builder()

  private val _heatMapColumnSort: MutableList<Any> = mutableListOf()

  private val _heatMapRowSort: MutableList<Any> = mutableListOf()

  /**
   * @param heatMapColumnItemsLimitConfiguration The limit on the number of columns that are
   * displayed in a heat map.
   */
  public
      fun heatMapColumnItemsLimitConfiguration(heatMapColumnItemsLimitConfiguration: IResolvable) {
    cdkBuilder.heatMapColumnItemsLimitConfiguration(heatMapColumnItemsLimitConfiguration)
  }

  /**
   * @param heatMapColumnItemsLimitConfiguration The limit on the number of columns that are
   * displayed in a heat map.
   */
  public
      fun heatMapColumnItemsLimitConfiguration(heatMapColumnItemsLimitConfiguration: CfnDashboard.ItemsLimitConfigurationProperty) {
    cdkBuilder.heatMapColumnItemsLimitConfiguration(heatMapColumnItemsLimitConfiguration)
  }

  /**
   * @param heatMapColumnSort The column sort configuration for heat map for columns that aren't a
   * part of a field well.
   */
  public fun heatMapColumnSort(vararg heatMapColumnSort: Any) {
    _heatMapColumnSort.addAll(listOf(*heatMapColumnSort))
  }

  /**
   * @param heatMapColumnSort The column sort configuration for heat map for columns that aren't a
   * part of a field well.
   */
  public fun heatMapColumnSort(heatMapColumnSort: Collection<Any>) {
    _heatMapColumnSort.addAll(heatMapColumnSort)
  }

  /**
   * @param heatMapColumnSort The column sort configuration for heat map for columns that aren't a
   * part of a field well.
   */
  public fun heatMapColumnSort(heatMapColumnSort: IResolvable) {
    cdkBuilder.heatMapColumnSort(heatMapColumnSort)
  }

  /**
   * @param heatMapRowItemsLimitConfiguration The limit on the number of rows that are displayed in
   * a heat map.
   */
  public fun heatMapRowItemsLimitConfiguration(heatMapRowItemsLimitConfiguration: IResolvable) {
    cdkBuilder.heatMapRowItemsLimitConfiguration(heatMapRowItemsLimitConfiguration)
  }

  /**
   * @param heatMapRowItemsLimitConfiguration The limit on the number of rows that are displayed in
   * a heat map.
   */
  public
      fun heatMapRowItemsLimitConfiguration(heatMapRowItemsLimitConfiguration: CfnDashboard.ItemsLimitConfigurationProperty) {
    cdkBuilder.heatMapRowItemsLimitConfiguration(heatMapRowItemsLimitConfiguration)
  }

  /**
   * @param heatMapRowSort The field sort configuration of the rows fields.
   */
  public fun heatMapRowSort(vararg heatMapRowSort: Any) {
    _heatMapRowSort.addAll(listOf(*heatMapRowSort))
  }

  /**
   * @param heatMapRowSort The field sort configuration of the rows fields.
   */
  public fun heatMapRowSort(heatMapRowSort: Collection<Any>) {
    _heatMapRowSort.addAll(heatMapRowSort)
  }

  /**
   * @param heatMapRowSort The field sort configuration of the rows fields.
   */
  public fun heatMapRowSort(heatMapRowSort: IResolvable) {
    cdkBuilder.heatMapRowSort(heatMapRowSort)
  }

  public fun build(): CfnDashboard.HeatMapSortConfigurationProperty {
    if(_heatMapColumnSort.isNotEmpty()) cdkBuilder.heatMapColumnSort(_heatMapColumnSort)
    if(_heatMapRowSort.isNotEmpty()) cdkBuilder.heatMapRowSort(_heatMapRowSort)
    return cdkBuilder.build()
  }
}
