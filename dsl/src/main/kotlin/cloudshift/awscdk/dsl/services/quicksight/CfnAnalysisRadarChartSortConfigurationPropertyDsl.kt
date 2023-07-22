@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisRadarChartSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.RadarChartSortConfigurationProperty.Builder =
      CfnAnalysis.RadarChartSortConfigurationProperty.builder()

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
  public fun categoryItemsLimit(categoryItemsLimit: CfnAnalysis.ItemsLimitConfigurationProperty) {
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
  public fun colorItemsLimit(colorItemsLimit: CfnAnalysis.ItemsLimitConfigurationProperty) {
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

  public fun build(): CfnAnalysis.RadarChartSortConfigurationProperty {
    if(_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
    if(_colorSort.isNotEmpty()) cdkBuilder.colorSort(_colorSort)
    return cdkBuilder.build()
  }
}
