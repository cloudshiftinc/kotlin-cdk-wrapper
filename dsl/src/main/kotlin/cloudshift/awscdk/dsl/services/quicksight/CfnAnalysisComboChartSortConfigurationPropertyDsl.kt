@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisComboChartSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ComboChartSortConfigurationProperty.Builder =
      CfnAnalysis.ComboChartSortConfigurationProperty.builder()

  private val _categorySort: MutableList<Any> = mutableListOf()

  private val _colorSort: MutableList<Any> = mutableListOf()

  /**
   * @param categoryItemsLimit The item limit configuration for the category field well of a combo
   * chart.
   */
  public fun categoryItemsLimit(categoryItemsLimit: IResolvable) {
    cdkBuilder.categoryItemsLimit(categoryItemsLimit)
  }

  /**
   * @param categoryItemsLimit The item limit configuration for the category field well of a combo
   * chart.
   */
  public fun categoryItemsLimit(categoryItemsLimit: CfnAnalysis.ItemsLimitConfigurationProperty) {
    cdkBuilder.categoryItemsLimit(categoryItemsLimit)
  }

  /**
   * @param categorySort The sort configuration of the category field well in a combo chart.
   */
  public fun categorySort(vararg categorySort: Any) {
    _categorySort.addAll(listOf(*categorySort))
  }

  /**
   * @param categorySort The sort configuration of the category field well in a combo chart.
   */
  public fun categorySort(categorySort: Collection<Any>) {
    _categorySort.addAll(categorySort)
  }

  /**
   * @param categorySort The sort configuration of the category field well in a combo chart.
   */
  public fun categorySort(categorySort: IResolvable) {
    cdkBuilder.categorySort(categorySort)
  }

  /**
   * @param colorItemsLimit The item limit configuration of the color field well in a combo chart.
   */
  public fun colorItemsLimit(colorItemsLimit: IResolvable) {
    cdkBuilder.colorItemsLimit(colorItemsLimit)
  }

  /**
   * @param colorItemsLimit The item limit configuration of the color field well in a combo chart.
   */
  public fun colorItemsLimit(colorItemsLimit: CfnAnalysis.ItemsLimitConfigurationProperty) {
    cdkBuilder.colorItemsLimit(colorItemsLimit)
  }

  /**
   * @param colorSort The sort configuration of the color field well in a combo chart.
   */
  public fun colorSort(vararg colorSort: Any) {
    _colorSort.addAll(listOf(*colorSort))
  }

  /**
   * @param colorSort The sort configuration of the color field well in a combo chart.
   */
  public fun colorSort(colorSort: Collection<Any>) {
    _colorSort.addAll(colorSort)
  }

  /**
   * @param colorSort The sort configuration of the color field well in a combo chart.
   */
  public fun colorSort(colorSort: IResolvable) {
    cdkBuilder.colorSort(colorSort)
  }

  public fun build(): CfnAnalysis.ComboChartSortConfigurationProperty {
    if(_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
    if(_colorSort.isNotEmpty()) cdkBuilder.colorSort(_colorSort)
    return cdkBuilder.build()
  }
}
