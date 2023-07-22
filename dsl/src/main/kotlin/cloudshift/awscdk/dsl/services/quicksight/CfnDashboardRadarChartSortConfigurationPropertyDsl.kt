@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The sort configuration of a `RadarChartVisual` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RadarChartSortConfigurationProperty radarChartSortConfigurationProperty =
 * RadarChartSortConfigurationProperty.builder()
 * .categoryItemsLimit(ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build())
 * .categorySort(List.of(FieldSortOptionsProperty.builder()
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
 * .colorItemsLimit(ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build())
 * .colorSort(List.of(FieldSortOptionsProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-radarchartsortconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardRadarChartSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.RadarChartSortConfigurationProperty.Builder =
      CfnDashboard.RadarChartSortConfigurationProperty.builder()

  private val _categorySort: MutableList<Any> = mutableListOf()

  private val _colorSort: MutableList<Any> = mutableListOf()

  /**
   * @param categoryItemsLimit The category items limit for a radar chart.
   */
  public fun categoryItemsLimit(categoryItemsLimit: IResolvable) {
    cdkBuilder.categoryItemsLimit(categoryItemsLimit)
  }

  /**
   * @param categoryItemsLimit The category items limit for a radar chart.
   */
  public fun categoryItemsLimit(categoryItemsLimit: CfnDashboard.ItemsLimitConfigurationProperty) {
    cdkBuilder.categoryItemsLimit(categoryItemsLimit)
  }

  /**
   * @param categorySort The category sort options of a radar chart.
   */
  public fun categorySort(vararg categorySort: Any) {
    _categorySort.addAll(listOf(*categorySort))
  }

  /**
   * @param categorySort The category sort options of a radar chart.
   */
  public fun categorySort(categorySort: Collection<Any>) {
    _categorySort.addAll(categorySort)
  }

  /**
   * @param categorySort The category sort options of a radar chart.
   */
  public fun categorySort(categorySort: IResolvable) {
    cdkBuilder.categorySort(categorySort)
  }

  /**
   * @param colorItemsLimit The color items limit of a radar chart.
   */
  public fun colorItemsLimit(colorItemsLimit: IResolvable) {
    cdkBuilder.colorItemsLimit(colorItemsLimit)
  }

  /**
   * @param colorItemsLimit The color items limit of a radar chart.
   */
  public fun colorItemsLimit(colorItemsLimit: CfnDashboard.ItemsLimitConfigurationProperty) {
    cdkBuilder.colorItemsLimit(colorItemsLimit)
  }

  /**
   * @param colorSort The color sort configuration of a radar chart.
   */
  public fun colorSort(vararg colorSort: Any) {
    _colorSort.addAll(listOf(*colorSort))
  }

  /**
   * @param colorSort The color sort configuration of a radar chart.
   */
  public fun colorSort(colorSort: Collection<Any>) {
    _colorSort.addAll(colorSort)
  }

  /**
   * @param colorSort The color sort configuration of a radar chart.
   */
  public fun colorSort(colorSort: IResolvable) {
    cdkBuilder.colorSort(colorSort)
  }

  public fun build(): CfnDashboard.RadarChartSortConfigurationProperty {
    if(_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
    if(_colorSort.isNotEmpty()) cdkBuilder.colorSort(_colorSort)
    return cdkBuilder.build()
  }
}
